package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
public final class up0 extends tg.g0 {
    public final PhotoViewer X1;

    public up0(PhotoViewer photoViewer, Context context, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, org.telegram.messenger.ye yeVar, cn0 cn0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i7, bitmap, bitmap2, i10, arrayList, yeVar, cn0Var, f6Var);
        this.X1 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        fi.q3 q3Var = this.X1.K1;
        if (q3Var != null) {
            return q3Var.f12658l;
        }
        return 0;
    }

    @Override
    public final void o0(boolean z9) {
        PhotoViewer photoViewer = this.X1;
        if (photoViewer.F2 != null) {
            photoViewer.G2 = false;
            photoViewer.n0();
            if (z9) {
                photoViewer.F2.g0();
            } else if (photoViewer.I4 && photoViewer.O1() && photoViewer.f41364c2 != 1) {
            } else {
                photoViewer.F2.h0();
            }
        }
    }
}
