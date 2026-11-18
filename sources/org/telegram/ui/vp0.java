package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
public final class vp0 extends tg.g0 {
    public final PhotoViewer Y1;

    public vp0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.we weVar, hn0 hn0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, weVar, hn0Var, i6Var);
        this.Y1 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        hi.p3 p3Var = this.Y1.L1;
        if (p3Var != null) {
            return p3Var.f15224l;
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
