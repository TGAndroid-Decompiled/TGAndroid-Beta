package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
public final class tp0 extends tg.g0 {
    public final PhotoViewer Y1;

    public tp0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.xe xeVar, en0 en0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, xeVar, en0Var, e6Var);
        this.Y1 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        hi.p3 p3Var = this.Y1.L1;
        if (p3Var != null) {
            return p3Var.f14851l;
        }
        return 0;
    }

    @Override
    public final void o0(boolean z10) {
        PhotoViewer photoViewer = this.Y1;
        if (photoViewer.G2 != null) {
            photoViewer.H2 = false;
            photoViewer.n0();
            if (z10) {
                photoViewer.G2.g0();
            } else if (photoViewer.J4 && photoViewer.O1() && photoViewer.d2 != 1) {
            } else {
                photoViewer.G2.h0();
            }
        }
    }
}
