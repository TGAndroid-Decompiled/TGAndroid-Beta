package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class st0 extends qg.n0 {
    public final PhotoViewer f37846o2;

    public st0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ar0 ar0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, ar0Var, d6Var);
        this.f37846o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        ci.i4 i4Var = this.f37846o2.K1;
        if (i4Var != null) {
            return i4Var.f4782l;
        }
        return 0;
    }
}
