package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class xs0 implements a3.y {
    public final PhotoViewer f43256a;

    public xs0(PhotoViewer photoViewer) {
        this.f43256a = photoViewer;
    }

    @Override
    public final void b(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.b81 b81Var;
        PhotoViewer photoViewer = this.f43256a;
        if (!photoViewer.J4 || (b81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wg0(24, this, b81Var));
    }
}
