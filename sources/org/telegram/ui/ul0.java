package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class ul0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.s70 f50117a;
    public final org.telegram.ui.Components.s70 f50118b;
    public final wl0 f50119c;

    public ul0(wl0 wl0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.f50119c = wl0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        cm0 cm0Var = wl0Var.f51221q0;
        org.telegram.ui.ActionBar.r6.i(i10, this, cm0Var.getResourceProvider());
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
        k9Var.setImageDrawable(new org.telegram.ui.Components.ch0(2131624318, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(k9Var, b8.mf.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.k6.f28273y6;
        e6Var = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        org.telegram.ui.Components.s70 a10 = b8.rf.a(context2, 14.0f, i11, false, e6Var);
        this.f50117a = a10;
        a10.setGravity(17);
        if (wl0Var.f51218n0 == 0) {
            i3 = 2131750091;
        } else {
            i3 = 2131750090;
        }
        a10.setText(org.telegram.messenger.bd.M0(i3, null));
        addView(a10, b8.mf.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.k6.Uc;
        e6Var2 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        org.telegram.ui.Components.s70 a11 = b8.rf.a(context3, 14.0f, i12, false, e6Var2);
        this.f50118b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131750092, null), new sg0(this, 13)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, 2131232241));
        addView(a11, b8.mf.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        cm0 cm0Var = this.f50119c.f51221q0;
        setBackgroundColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        this.f50117a.setTextColor(cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28273y6));
        int i3 = org.telegram.ui.ActionBar.k6.Uc;
        int themedColor = cm0Var.getThemedColor(i3);
        org.telegram.ui.Components.s70 s70Var = this.f50118b;
        s70Var.setTextColor(themedColor);
        s70Var.setLinkTextColor(cm0Var.getThemedColor(i3));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
