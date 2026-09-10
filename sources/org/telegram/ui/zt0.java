package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class zt0 extends pg.m0 {
    public final PhotoViewer f39441o2;

    public zt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ir0 ir0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, ir0Var, f6Var);
        this.f39441o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        bi.b5 b5Var = this.f39441o2.K1;
        if (b5Var != null) {
            return b5Var.f2365l;
        }
        return 0;
    }
}
