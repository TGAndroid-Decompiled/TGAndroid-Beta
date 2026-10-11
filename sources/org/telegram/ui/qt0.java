package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class qt0 implements a3.y {
    public final PhotoViewer f41292a;

    public qt0(PhotoViewer photoViewer) {
        this.f41292a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.l81 l81Var;
        PhotoViewer photoViewer = this.f41292a;
        if (!photoViewer.J4 || (l81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new uf0(29, this, l81Var));
    }
}
