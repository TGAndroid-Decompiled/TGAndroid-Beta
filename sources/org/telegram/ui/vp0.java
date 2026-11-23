package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
public final class vp0 extends tg.l0 {
    public boolean f53016c2;
    public final PhotoViewer d2;

    public vp0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.we weVar, kn0 kn0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, weVar, kn0Var, i6Var);
        this.d2 = photoViewer;
    }

    @Override
    public final FrameLayout getCaptionsBulletinContainer() {
        return this.d2.f43334f0;
    }

    @Override
    public final long getCaptionsTrimEnd() {
        PhotoViewer photoViewer = this.d2;
        wo0 wo0Var = photoViewer.Y7;
        if (wo0Var == null) {
            return 0L;
        }
        return wo0Var.getRightProgress() * ((float) photoViewer.x1());
    }

    @Override
    public final long getCaptionsTrimStart() {
        PhotoViewer photoViewer = this.d2;
        wo0 wo0Var = photoViewer.Y7;
        if (wo0Var == null) {
            return 0L;
        }
        return wo0Var.getLeftProgress() * ((float) photoViewer.x1());
    }

    @Override
    public final File getCaptionsVideoFile() {
        int i7;
        PhotoViewer photoViewer = this.d2;
        if (photoViewer.f43448s1 && photoViewer.f43328e5 != null && (i7 = photoViewer.d2) != 1 && i7 != 11) {
            return new File(photoViewer.f43328e5);
        }
        return null;
    }

    @Override
    public final long getCaptionsVideoPosition() {
        org.telegram.ui.Components.h61 h61Var = this.d2.G2;
        if (h61Var != null) {
            return h61Var.S();
        }
        return 0L;
    }

    @Override
    public final int getPKeyboardHeight() {
        hi.x3 x3Var = this.d2.L1;
        if (x3Var != null) {
            return x3Var.f15717l;
        }
        return 0;
    }

    @Override
    public final void r0(boolean z10) {
        PhotoViewer photoViewer = this.d2;
        if (photoViewer.G2 != null) {
            photoViewer.H2 = false;
            photoViewer.n0();
            if (z10) {
                photoViewer.G2.g0();
            } else if (!photoViewer.O1()) {
                photoViewer.G2.h0();
            }
        }
    }
}
