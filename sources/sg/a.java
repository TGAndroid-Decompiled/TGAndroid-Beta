package sg;

import android.graphics.Bitmap;
import j3.f;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jv0;
import rg.c;
import sh.j3;
import sh.m3;
import sh.p2;
import v2.g;
public final class a implements c, hv0, iv0, GenericProvider, f, c2, ug.b, g, j4.g {
    public final int f47345a;

    public a(int i10) {
        this.f47345a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f47345a) {
            case 20:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 21:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f47345a) {
            case 3:
                p2 p2Var = (p2) obj;
                p2Var.f47583b = f10;
                p2Var.f47588e.invalidate();
                p2Var.T.setAlpha(f10);
                p2Var.E();
                p2Var.C();
                return;
            case 4:
            default:
                ((m3) obj).setSwipeOffsetY(f10);
                return;
            case 5:
                ((j3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public j3.g c(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: sg.a.c(android.os.Bundle):j3.g");
    }

    @Override
    public boolean d(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77 && i12 == 76 && i13 == 76) {
                if (i14 == 84 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public int g(g6 g6Var, boolean z4) {
        float f10;
        switch (this.f47345a) {
            case 0:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return k6.l1(f10, k6.v0(k6.f21659d6, g6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f47345a) {
            case 2:
                return ((p2) obj).f47583b;
            case 3:
            default:
                return ((m3) obj).getSwipeOffsetY();
            case 4:
                return ((j3) obj).f47478c;
        }
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f47345a) {
            case 18:
                d2Var.dismiss();
                return;
            default:
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        jv0 jv0Var = m3.V;
        return Boolean.FALSE;
    }

    @Override
    public void e(Exception exc) {
    }
}
