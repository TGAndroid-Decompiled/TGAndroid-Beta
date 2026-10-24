package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 implements a3.y {
    public final PhotoViewer f44203a;

    public zs0(PhotoViewer photoViewer) {
        this.f44203a = photoViewer;
    }

    @Override
    public final void c(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.j81 j81Var;
        PhotoViewer photoViewer = this.f44203a;
        if (!photoViewer.J4 || (j81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ah0(24, this, j81Var));
    }
}
