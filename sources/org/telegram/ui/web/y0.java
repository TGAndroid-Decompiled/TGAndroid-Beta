package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import b8.xf;
import gi.j8;
import gi.s2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.vs0;
public final class y0 extends h41 {
    public final u10 f51111e;
    public boolean f51113n;
    public String f51114r;
    public NumberTextView f51115s;
    public org.telegram.ui.ActionBar.q0 f51117x;
    public zu0 f51118y;
    public ArrayList f51112f = xf.a(new j8(this, 20));
    public final ArrayList h = new ArrayList();
    public final HashSet f51116w = new HashSet();

    public y0(org.telegram.ui.b0 b0Var, u10 u10Var) {
        this.f51111e = u10Var;
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i3 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f51114r)) {
            ArrayList arrayList2 = this.f51112f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    x0 x0Var = (x0) this.f51112f.get(size);
                    calendar.setTimeInMillis(x0Var.f51103b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(r31.r(bd.u(x0Var.f51103b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.f51114r;
                    int i13 = h.f50854b;
                    r31 K = r31.K(h.class);
                    K.f37640z = 3;
                    K.f37632q = false;
                    K.H = x0Var;
                    K.f37628m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                x0 x0Var2 = (x0) arrayList3.get(size2);
                calendar.setTimeInMillis(x0Var2.f51103b);
                int i15 = calendar.get(i3) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(r31.r(bd.u(x0Var2.f51103b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.f51114r;
                int i16 = h.f50854b;
                r31 K2 = r31.K(h.class);
                K2.f37640z = 3;
                K2.f37632q = false;
                K2.H = x0Var2;
                K2.f37628m = str2;
                arrayList.add(K2);
                size2--;
                i3 = 5;
                i10 = 2;
            }
            if (this.f51113n) {
                arrayList.add(r31.p(32));
                arrayList.add(r31.p(32));
                arrayList.add(r31.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(r31.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131742930, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        if (r31Var.H(h.class) && !this.actionBar.v()) {
            finishFragment();
            this.f51111e.a((x0) r31Var.H);
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i3;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f27878d6;
        r6.i(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        r6.m(kVar2, 5, i11, getResourceProvider());
        r6.m(this.actionBar, 3, k6.f28292z8, getResourceProvider());
        r6.m(this.actionBar, 1, i11, getResourceProvider());
        r6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 23));
        org.telegram.ui.ActionBar.x n4 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n4.getContext());
        this.f51115s = numberTextView;
        numberTextView.setTextSize(18);
        this.f51115s.setTypeface(org.telegram.messenger.g0.o());
        this.f51115s.setTextColor(getThemedColor(k6.f28275y8));
        this.f51115s.setOnTouchListener(new fi.a(2));
        n4.addView(this.f51115s, mf.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.q0 c2 = this.actionBar.q().c(0, 2131232486, getResourceProvider());
        c2.N();
        c2.I = new s2(this);
        this.f51117x = c2;
        c2.setSearchFieldHint(bd.M0(2131745846, null));
        this.f51117x.setContentDescription(bd.M0(2131745846, null));
        EditTextBoldCursor searchField = this.f51117x.getSearchField();
        r6.V(searchField, i11, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i11, getResourceProvider());
        zu0 zu0Var = new zu0(context, null, 1, null);
        this.f51118y = zu0Var;
        if (TextUtils.isEmpty(this.f51114r)) {
            i3 = 2131742928;
        } else {
            i3 = 2131742927;
        }
        zu0Var.d.setText(bd.M0(i3, null));
        this.f51118y.f41128e.setVisibility(8);
        this.f51118y.e(false, false);
        this.f51118y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f51118y, mf.c(-1.0f, -1));
        this.f34298a.setEmptyView(this.f51118y);
        this.f34298a.j(new ji(this, 27));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(k6.f27878d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(k6.x0(null, k6.f27878d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.f51115s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.f28275y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f51117x;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f51117x.getSearchField().setCursorColor(getThemedColor(k6.G6));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
