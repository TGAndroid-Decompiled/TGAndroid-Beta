package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class zl0 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.w70 f52602a;
    public final org.telegram.ui.Components.w70 f52603b;
    public final bm0 f52604c;

    public zl0(bm0 bm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f52604c = bm0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        hm0 hm0Var = bm0Var.f44431p0;
        org.telegram.ui.ActionBar.r6.i(i10, this, hm0Var.getResourceProvider());
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
        l9Var.setImageDrawable(new org.telegram.ui.Components.zg0(2131624318, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(l9Var, c8.ha.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.k6.f28240y6;
        f6Var = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        org.telegram.ui.Components.w70 a10 = c8.na.a(context2, 14.0f, i11, false, f6Var);
        this.f52602a = a10;
        a10.setGravity(17);
        if (bm0Var.m0 == 0) {
            i7 = 2131750082;
        } else {
            i7 = 2131750081;
        }
        a10.setText(org.telegram.messenger.hd.M0(i7, null));
        addView(a10, c8.ha.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.k6.Uc;
        f6Var2 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
        org.telegram.ui.Components.w70 a11 = c8.na.a(context3, 14.0f, i12, false, f6Var2);
        this.f52603b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750083, null), new ef0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232241));
        addView(a11, c8.ha.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        hm0 hm0Var = this.f52604c.f44431p0;
        setBackgroundColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6));
        this.f52602a.setTextColor(hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28240y6));
        int i7 = org.telegram.ui.ActionBar.k6.Uc;
        int themedColor = hm0Var.getThemedColor(i7);
        org.telegram.ui.Components.w70 w70Var = this.f52603b;
        w70Var.setTextColor(themedColor);
        w70Var.setLinkTextColor(hm0Var.getThemedColor(i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
