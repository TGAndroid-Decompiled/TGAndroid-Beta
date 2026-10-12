package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class yt0 implements a3.y {
    public final PhotoViewer f42281a;

    public yt0(PhotoViewer photoViewer) {
        this.f42281a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.h81 h81Var;
        PhotoViewer photoViewer = this.f42281a;
        if (!photoViewer.J4 || (h81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new on0(11, this, h81Var));
    }
}
