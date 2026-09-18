package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class rt0 implements a3.y {
    public final PhotoViewer f37130a;

    public rt0(PhotoViewer photoViewer) {
        this.f37130a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u71 u71Var;
        PhotoViewer photoViewer = this.f37130a;
        if (!photoViewer.J4 || (u71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ak0(20, this, u71Var));
    }
}
