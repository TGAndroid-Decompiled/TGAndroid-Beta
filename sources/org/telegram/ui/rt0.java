package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class rt0 implements a3.y {
    public final PhotoViewer f37186a;

    public rt0(PhotoViewer photoViewer) {
        this.f37186a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.g71 g71Var;
        PhotoViewer photoViewer = this.f37186a;
        if (!photoViewer.J4 || (g71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ml0(16, this, g71Var));
    }
}
