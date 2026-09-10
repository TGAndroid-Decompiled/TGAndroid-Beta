package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class qt0 implements a3.y {
    public final PhotoViewer f36133a;

    public qt0(PhotoViewer photoViewer) {
        this.f36133a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t71 t71Var;
        PhotoViewer photoViewer = this.f36133a;
        if (!photoViewer.J4 || (t71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ak0(19, this, t71Var));
    }
}
