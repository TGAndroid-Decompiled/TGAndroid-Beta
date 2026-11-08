package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import c8.xa;
import fi.u2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.x31;
import org.telegram.ui.nt0;
public final class z0 extends n41 {
    public final c20 f51411e;
    public boolean f51413n;
    public String f51414r;
    public NumberTextView f51415s;
    public org.telegram.ui.ActionBar.r0 f51417x;
    public av0 f51418y;
    public ArrayList f51412f = xa.a(new ii.c(this, 17));
    public final ArrayList h = new ArrayList();
    public final HashSet f51416w = new HashSet();

    public z0(org.telegram.ui.a0 a0Var, c20 c20Var) {
        this.f51411e = c20Var;
    }

    @Override
    public final void Z(ArrayList arrayList, l41 l41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f51414r)) {
            ArrayList arrayList2 = this.f51412f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    y0 y0Var = (y0) this.f51412f.get(size);
                    calendar.setTimeInMillis(y0Var.f51403b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(x31.r(id.u(y0Var.f51403b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.f51414r;
                    int i13 = f.f51125b;
                    x31 K = x31.K(f.class);
                    K.f40193z = 3;
                    K.f40185q = false;
                    K.H = y0Var;
                    K.f40181m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                y0 y0Var2 = (y0) arrayList3.get(size2);
                calendar.setTimeInMillis(y0Var2.f51403b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(x31.r(id.u(y0Var2.f51403b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.f51414r;
                int i16 = f.f51125b;
                x31 K2 = x31.K(f.class);
                K2.f40193z = 3;
                K2.f40185q = false;
                K2.H = y0Var2;
                K2.f40181m = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.f51413n) {
                arrayList.add(x31.p(32));
                arrayList.add(x31.p(32));
                arrayList.add(x31.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(x31.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131742923, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        if (x31Var.H(f.class) && !this.actionBar.v()) {
            finishFragment();
            this.f51411e.a((y0) x31Var.H);
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f27852d6;
        r6.i(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = k6.G6;
        r6.m(kVar2, 5, i11, getResourceProvider());
        r6.m(this.actionBar, 3, k6.f28264z8, getResourceProvider());
        r6.m(this.actionBar, 1, i11, getResourceProvider());
        r6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 22));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n(null);
        NumberTextView numberTextView = new NumberTextView(n10.getContext());
        this.f51415s = numberTextView;
        numberTextView.setTextSize(18);
        this.f51415s.setTypeface(org.telegram.messenger.g0.o());
        this.f51415s.setTextColor(getThemedColor(k6.f28246y8));
        this.f51415s.setOnTouchListener(new ei.b(2));
        n10.addView(this.f51415s, ha.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.q().c(0, 2131232486, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.f51417x = c10;
        c10.setSearchFieldHint(id.M0(2131745839, null));
        this.f51417x.setContentDescription(id.M0(2131745839, null));
        EditTextBoldCursor searchField = this.f51417x.getSearchField();
        r6.V(searchField, i11, getResourceProvider());
        r6.E(searchField, k6.Gj, getResourceProvider());
        r6.w(searchField, i11, getResourceProvider());
        av0 av0Var = new av0(context, null, 1, null);
        this.f51418y = av0Var;
        if (TextUtils.isEmpty(this.f51414r)) {
            i7 = 2131742921;
        } else {
            i7 = 2131742920;
        }
        av0Var.d.setText(id.M0(i7, null));
        this.f51418y.f31927e.setVisibility(8);
        this.f51418y.e(false, false);
        this.f51418y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f51418y, ha.c(-1.0f, -1));
        this.f36243a.setEmptyView(this.f51418y);
        this.f36243a.j(new ui(this, 25));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(k6.f27852d6)) > 0.721f) {
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
                kVar.setActionModeColor(k6.x0(null, k6.f27852d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.f51415s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.f28246y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f51417x;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f51417x.getSearchField().setCursorColor(getThemedColor(k6.G6));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
