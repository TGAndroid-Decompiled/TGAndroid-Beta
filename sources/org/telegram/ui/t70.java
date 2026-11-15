package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
public final class t70 implements org.telegram.messenger.i9, org.telegram.messenger.j9, org.telegram.messenger.db, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.eb0, org.telegram.messenger.t10, org.telegram.ui.Components.vt0, org.telegram.ui.ActionBar.n6, org.telegram.ui.ActionBar.o6 {
    public final int f51408a;

    public t70(int i7) {
        this.f51408a = i7;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return di.lb.a1(false, org.telegram.messenger.hd.H(',', "Stars", num.intValue()), 0.66f, null);
        }
        return org.telegram.messenger.hd.E(num.intValue(), ',');
    }

    @Override
    public String e(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.hd.M0(2131753799, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(1, "Minutes", new Object[0]));
        }
        if (i7 == 2) {
            return org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(5, "Minutes", new Object[0]));
        }
        if (i7 == 3) {
            return org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(1, "Hours", new Object[0]));
        }
        if (i7 == 4) {
            return org.telegram.messenger.hd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.hd.G(5, "Hours", new Object[0]));
        }
        return "";
    }

    @Override
    public void f(int i7, View view) {
        org.telegram.ui.Wallet.v3 v3Var = (org.telegram.ui.Wallet.v3) view;
        ShapeDrawable shapeDrawable = v3Var.f44596f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i7);
            v3Var.f44596f0.invalidateSelf();
        }
    }

    @Override
    public int g(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.v3) view).f44596f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51408a) {
            case 3:
                t1Var.dismiss();
                return;
            case 4:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            default:
                t1Var.dismiss();
                return;
            case 5:
                Drawable[] drawableArr = PhotoViewer.Z8;
                return;
            case 6:
                t1Var.dismiss();
                return;
            case 7:
                t1Var.dismiss();
                return;
            case 9:
                RectF rectF = ProfileActivity.X6;
                t1Var.dismiss();
                return;
            case 10:
                t1Var.dismiss();
                return;
            case 16:
                t1Var.dismiss();
                return;
            case 19:
                t1Var.dismiss();
                return;
            case 20:
                t1Var.dismiss();
                return;
            case 21:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void l(int i7) {
        org.telegram.messenger.gz.f23937b1 = i7;
        org.telegram.messenger.gz.y();
    }

    @Override
    public Object o(Object obj) {
        Void r12 = (Void) obj;
        String str = LaunchActivity.C1;
        return new je0();
    }

    @Override
    public boolean run() {
        String str = LaunchActivity.C1;
        if (org.telegram.messenger.gz.f23981s.length() > 0 && !org.telegram.messenger.gz.A) {
            return true;
        }
        return false;
    }

    @Override
    public void onClick() {
    }

    @Override
    public void p() {
    }
}
