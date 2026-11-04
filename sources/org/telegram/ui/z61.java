package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class z61 extends eq0 {
    public final org.telegram.messenger.ye f52568a;
    public final a71 f52569b;

    public z61(a71 a71Var, org.telegram.messenger.ye yeVar) {
        this.f52569b = a71Var;
        this.f52568a = yeVar;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        l71 l71Var = this.f52569b.f43680a;
        org.telegram.messenger.ye yeVar = this.f52568a;
        if (yeVar.h != null) {
            File z12 = org.telegram.messenger.w7.z(4);
            File file = new File(z12, Utilities.f21385b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.zb.K(yeVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(yeVar.h);
            l71Var.D1 = new lc1(file2, file2, "");
            l71Var.E1 = K;
            l71Var.f47154d2 = 0;
            l71Var.f47210z0.requestLayout();
            l71Var.g1(false);
            l71Var.f47209y1 = null;
            l71Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
