package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class zs0 implements a3.y {
    public final PhotoViewer f43799a;

    public zs0(PhotoViewer photoViewer) {
        this.f43799a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.a81 a81Var;
        PhotoViewer photoViewer = this.f43799a;
        if (!photoViewer.J4 || (a81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zg0(24, this, a81Var));
    }
}
