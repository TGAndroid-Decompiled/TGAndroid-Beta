package org.telegram.ui;

import android.media.MediaFormat;
public final class wq0 implements a3.y {
    public final PhotoViewer f43353a;

    public wq0(PhotoViewer photoViewer) {
        this.f43353a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u61 u61Var;
        PhotoViewer photoViewer = this.f43353a;
        if (!photoViewer.J4 || (u61Var = photoViewer.F2) == null) {
            return;
        }
        org.telegram.messenger.i0.g3(new uf0(25, this, u61Var));
    }
}
