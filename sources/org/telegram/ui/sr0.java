package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;

public final class sr0 implements Runnable {

    public final PhotoViewer f42686a;

    public sr0(PhotoViewer photoViewer) {
        this.f42686a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f42686a;
        MessageObject messageObject = photoViewer.P4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.P4.getDocument(), true, false);
    }
}
