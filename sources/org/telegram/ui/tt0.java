package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class tt0 implements a3.y {
    public final PhotoViewer f37865a;

    public tt0(PhotoViewer photoViewer) {
        this.f37865a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.h71 h71Var;
        PhotoViewer photoViewer = this.f37865a;
        if (!photoViewer.J4 || (h71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new pl0(16, this, h71Var));
    }
}
