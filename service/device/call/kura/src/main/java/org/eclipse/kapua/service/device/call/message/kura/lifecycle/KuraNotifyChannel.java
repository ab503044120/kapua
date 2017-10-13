/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.call.message.kura.lifecycle;

import org.eclipse.kapua.service.device.call.message.app.kura.KuraAppChannel;

/**
 * Kura device notification message channel implementation.
 *
 * @since 1.0
 */
public class KuraNotifyChannel extends KuraAppChannel {

    private String senderClientId;

    private String notifyPart;

    private String resources;

    /**
     * Constructor
     */
    public KuraNotifyChannel() {
    }

    /**
     * Constructor
     *
     * @param kuraTopicTokens
     */
    public KuraNotifyChannel(String[] kuraTopicTokens) {
        super();

        setMessageClassification(kuraTopicTokens[0]);
        setScope(kuraTopicTokens[1]);
        setClientId(kuraTopicTokens[2]);
        setAppId(kuraTopicTokens[3]);
        setNotifyPart(kuraTopicTokens[4]);
        setSenderClientId(kuraTopicTokens[5]);
        setResources(kuraTopicTokens[6]);
    }

    public String getSenderClientId() {
        return senderClientId;
    }

    public void setSenderClientId(String senderClientId) {
        this.senderClientId = senderClientId;
    }

    public String getNotifyPart() {
        return notifyPart;
    }

    public void setNotifyPart(String notifyPart) {
        this.notifyPart = notifyPart;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }
}
