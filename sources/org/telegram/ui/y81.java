package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class y81 extends xr0 {
    public final org.telegram.messenger.ff f43607a;
    public final z81 f43608b;

    public y81(z81 z81Var, org.telegram.messenger.ff ffVar) {
        this.f43608b = z81Var;
        this.f43607a = ffVar;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        k91 k91Var = this.f43608b.f43849a;
        org.telegram.messenger.ff ffVar = this.f43607a;
        if (ffVar.h != null) {
            File z12 = org.telegram.messenger.b8.z(4);
            File file = new File(z12, Utilities.f14520b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.i0.c1();
            Bitmap K = org.telegram.messenger.ic.K(ffVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(ffVar.h);
            k91Var.C1 = new le1(file2, file2, "");
            k91Var.D1 = K;
            k91Var.f38722c2 = 0;
            k91Var.f38778y0.requestLayout();
            k91Var.g1(false);
            k91Var.f38776x1 = null;
            k91Var.n1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
