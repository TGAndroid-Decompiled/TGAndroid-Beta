package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
public final class vp0 extends tg.h0 {
    public final PhotoViewer Y1;

    public vp0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.xe xeVar, hn0 hn0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, xeVar, hn0Var, h6Var);
        this.Y1 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        hi.o3 o3Var = this.Y1.L1;
        if (o3Var != null) {
            return o3Var.f15210l;
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
