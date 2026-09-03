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
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import rg.c;
import sh.j3;
import sh.m3;
import sh.p2;
import v2.g;
public final class a implements c, gv0, hv0, GenericProvider, f, c2, ug.b, g {
    public final int f47381a;

    public a(int i10) {
        this.f47381a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f47381a) {
            case 21:
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                    stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                    return stackBlurBitmapWithScaleFactor;
                }
                return null;
            case 22:
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
        switch (this.f47381a) {
            case 4:
                p2 p2Var = (p2) obj;
                p2Var.f47619b = f10;
                p2Var.f47624e.invalidate();
                p2Var.T.setAlpha(f10);
                p2Var.E();
                p2Var.C();
                return;
            case 5:
            default:
                ((m3) obj).setSwipeOffsetY(f10);
                return;
            case 6:
                ((j3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public j3.g c(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: sg.a.c(android.os.Bundle):j3.g");
    }

    @Override
    public int g(g6 g6Var, boolean z4) {
        float f10;
        switch (this.f47381a) {
            case 0:
                return k6.l1(0.7f, k6.v0(k6.f21661d6, g6Var));
            case 1:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return k6.l1(f10, k6.v0(k6.f21661d6, g6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f47381a) {
            case 3:
                return ((p2) obj).f47619b;
            case 4:
            default:
                return ((m3) obj).getSwipeOffsetY();
            case 5:
                return ((j3) obj).f47514c;
        }
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f47381a) {
            case 19:
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
        iv0 iv0Var = m3.V;
        return Boolean.FALSE;
    }

    @Override
    public void d(Exception exc) {
    }
}
