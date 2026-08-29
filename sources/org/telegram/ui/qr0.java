package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class qr0 implements Runnable {
    public final PhotoViewer f41767a;

    public qr0(PhotoViewer photoViewer) {
        this.f41767a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f41767a;
        MessageObject messageObject = photoViewer.P4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.P4.getDocument(), true, false);
    }
}
