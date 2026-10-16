package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class xt0 implements a3.y {
    public final PhotoViewer f41661a;

    public xt0(PhotoViewer photoViewer) {
        this.f41661a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i81 i81Var;
        PhotoViewer photoViewer = this.f41661a;
        if (!photoViewer.J4 || (i81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rr0(6, this, i81Var));
    }
}
