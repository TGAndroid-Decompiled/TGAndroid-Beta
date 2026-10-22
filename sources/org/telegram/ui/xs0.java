package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class xs0 implements a3.y {
    public final PhotoViewer f43269a;

    public xs0(PhotoViewer photoViewer) {
        this.f43269a = photoViewer;
    }

    @Override
    public final void b(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.c81 c81Var;
        PhotoViewer photoViewer = this.f43269a;
        if (!photoViewer.J4 || (c81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new xg0(24, this, c81Var));
    }
}
