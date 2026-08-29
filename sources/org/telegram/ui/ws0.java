package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ws0 extends bg.g1 {
    public final PhotoViewer f44369k2;

    public ws0(PhotoViewer photoViewer, Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, activity, i10, bitmap, bitmap2, i11, arrayList, cropState, gq0Var, c6Var);
        this.f44369k2 = photoViewer;
    }

    @Override
    public final int getPKeyboardHeight() {
        nh.w3 w3Var = this.f44369k2.G1;
        if (w3Var != null) {
            return w3Var.f18786l;
        }
        return 0;
    }
}
