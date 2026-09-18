package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class ws0 implements Runnable {
    public final PhotoViewer f39170a;

    public ws0(PhotoViewer photoViewer) {
        this.f39170a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f39170a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
