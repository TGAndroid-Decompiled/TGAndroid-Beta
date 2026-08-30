package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class yr0 implements Runnable {
    public final PhotoViewer f40566a;

    public yr0(PhotoViewer photoViewer) {
        this.f40566a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f40566a;
        MessageObject messageObject = photoViewer.Q4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.Q4.getDocument(), true, false);
    }
}
