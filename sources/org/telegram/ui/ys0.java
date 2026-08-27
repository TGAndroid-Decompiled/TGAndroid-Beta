package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

public final class ys0 extends zf.l0 {

    public final PhotoViewer f44893k2;

    public ys0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, hq0 hq0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, hq0Var, c6Var);
        this.f44893k2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        lh.a4 a4Var = this.f44893k2.G1;
        if (a4Var != null) {
            return a4Var.f15642l;
        }
        return 0;
    }
}
