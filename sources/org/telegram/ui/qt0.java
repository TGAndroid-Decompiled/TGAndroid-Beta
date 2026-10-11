package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class qt0 implements a3.y {
    public final PhotoViewer f41258a;

    public qt0(PhotoViewer photoViewer) {
        this.f41258a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.m81 m81Var;
        PhotoViewer photoViewer = this.f41258a;
        if (!photoViewer.J4 || (m81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new uf0(29, this, m81Var));
    }
}
