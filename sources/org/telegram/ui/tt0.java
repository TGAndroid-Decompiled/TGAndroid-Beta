package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 implements a3.y {
    public final PhotoViewer f42290a;

    public tt0(PhotoViewer photoViewer) {
        this.f42290a = photoViewer;
    }

    @Override
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.q81 q81Var;
        PhotoViewer photoViewer = this.f42290a;
        if (!photoViewer.J4 || (q81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new cg0(28, this, q81Var));
    }
}
