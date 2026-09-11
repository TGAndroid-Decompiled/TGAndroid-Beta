package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class zt0 extends rg.o0 {
    public final PhotoViewer f43515o2;

    public zt0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ir0 ir0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, ir0Var, f6Var);
        this.f43515o2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        di.j4 j4Var = this.f43515o2.K1;
        if (j4Var != null) {
            return j4Var.f7435l;
        }
        return 0;
    }
}
