package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class ws0 implements i5.n {
    public final PhotoViewer f39789a;

    public ws0(PhotoViewer photoViewer) {
        this.f39789a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i71 i71Var;
        PhotoViewer photoViewer = this.f39789a;
        if (!photoViewer.G4 || (i71Var = photoViewer.C2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zq0(4, this, i71Var));
    }
}
