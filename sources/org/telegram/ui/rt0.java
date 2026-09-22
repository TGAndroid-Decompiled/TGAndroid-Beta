package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class rt0 implements a3.y {
    public final PhotoViewer f37247a;

    public rt0(PhotoViewer photoViewer) {
        this.f37247a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.v71 v71Var;
        PhotoViewer photoViewer = this.f37247a;
        if (!photoViewer.J4 || (v71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fj0(22, this, v71Var));
    }
}
