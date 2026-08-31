package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class ys0 implements i5.n {
    public final PhotoViewer f43703a;

    public ys0(PhotoViewer photoViewer) {
        this.f43703a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.k71 k71Var;
        PhotoViewer photoViewer = this.f43703a;
        if (!photoViewer.G4 || (k71Var = photoViewer.C2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new br0(3, this, k71Var));
    }
}
