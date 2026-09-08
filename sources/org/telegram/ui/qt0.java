package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class qt0 implements a3.y {
    public final PhotoViewer f40004a;

    public qt0(PhotoViewer photoViewer) {
        this.f40004a = photoViewer;
    }

    @Override
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.g71 g71Var;
        PhotoViewer photoViewer = this.f40004a;
        if (!photoViewer.J4 || (g71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ej0(22, this, g71Var));
    }
}
