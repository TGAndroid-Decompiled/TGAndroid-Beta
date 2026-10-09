package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class st0 implements a3.y {
    public final PhotoViewer f41770a;

    public st0(PhotoViewer photoViewer) {
        this.f41770a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.k81 k81Var;
        PhotoViewer photoViewer = this.f41770a;
        if (!photoViewer.J4 || (k81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rt0(0, this, k81Var));
    }
}
