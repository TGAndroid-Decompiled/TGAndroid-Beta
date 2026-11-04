package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
public final class u70 implements org.telegram.messenger.e9, org.telegram.messenger.xa, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.ya0, org.telegram.messenger.o10, org.telegram.ui.Components.tt0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6 {
    public final int f50007a;

    public u70(int i3) {
        this.f50007a = i3;
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == 0) {
            return ci.wb.a1(false, org.telegram.messenger.bd.H(',', "Stars", num.intValue()), 0.66f, null);
        }
        return org.telegram.messenger.bd.E(num.intValue(), ',');
    }

    @Override
    public String e(int i3) {
        if (i3 == 0) {
            return org.telegram.messenger.bd.M0(2131753799, null);
        }
        if (i3 == 1) {
            return org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(1, "Minutes", new Object[0]));
        }
        if (i3 == 2) {
            return org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(5, "Minutes", new Object[0]));
        }
        if (i3 == 3) {
            return org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(1, "Hours", new Object[0]));
        }
        if (i3 == 4) {
            return org.telegram.messenger.bd.a0("AutoLockInTime", null, 2131753798, org.telegram.messenger.bd.G(5, "Hours", new Object[0]));
        }
        return "";
    }

    @Override
    public void f(int i3, View view) {
        org.telegram.ui.Wallet.u3 u3Var = (org.telegram.ui.Wallet.u3) view;
        ShapeDrawable shapeDrawable = u3Var.f43232f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i3);
            u3Var.f43232f0.invalidateSelf();
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f50007a) {
            case 2:
                s1Var.dismiss();
                return;
            case 4:
                Drawable[] drawableArr = PhotoViewer.V8;
                return;
            case 5:
                s1Var.dismiss();
                return;
            case 6:
                s1Var.dismiss();
                return;
            case 8:
                RectF rectF = ProfileActivity.T6;
                s1Var.dismiss();
                return;
            case 9:
                s1Var.dismiss();
                return;
            case 15:
                s1Var.dismiss();
                return;
            case 19:
                s1Var.dismiss();
                return;
            case 20:
                s1Var.dismiss();
                return;
            case 21:
                s1Var.dismiss();
                return;
            default:
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public int h(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.u3) view).f43232f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public Object k(Object obj) {
        Void r12 = (Void) obj;
        String str = LaunchActivity.E1;
        return new ee0();
    }

    @Override
    public void l(int i3) {
        org.telegram.messenger.az.f21617b1 = i3;
        org.telegram.messenger.az.y();
    }

    @Override
    public void onClick() {
    }

    @Override
    public void p() {
    }
}
