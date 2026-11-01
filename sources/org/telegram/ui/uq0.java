package org.telegram.ui;

import android.media.MediaFormat;
public final class uq0 implements a3.y {
    public final PhotoViewer f42327a;

    public uq0(PhotoViewer photoViewer) {
        this.f42327a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.v61 v61Var;
        PhotoViewer photoViewer = this.f42327a;
        if (!photoViewer.J4 || (v61Var = photoViewer.F2) == null) {
            return;
        }
        org.telegram.messenger.i0.g3(new if0(26, this, v61Var));
    }
}
