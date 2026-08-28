package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class xs0 extends yf.l0 {
    public final PhotoViewer f44585k2;

    public xs0(PhotoViewer photoViewer, Context context, Activity activity, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, activity, i9, bitmap, bitmap2, i10, arrayList, cropState, gq0Var, b6Var);
        this.f44585k2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        kh.b4 b4Var = this.f44585k2.G1;
        if (b4Var != null) {
            return b4Var.f14999l;
        }
        return 0;
    }
}
