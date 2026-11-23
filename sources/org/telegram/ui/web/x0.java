package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.hb;
import c8.na;
import hi.b3;
import hi.c7;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.gs0;
public final class x0 extends d51 {
    public final w10 f53631e;
    public boolean f53633n;
    public String f53634r;
    public NumberTextView f53635s;
    public org.telegram.ui.ActionBar.q0 f53637x;
    public mv0 f53638y;
    public ArrayList f53632f = hb.a(new c7(this, 23));
    public final ArrayList h = new ArrayList();
    public final HashSet f53636w = new HashSet();

    public x0(org.telegram.ui.z zVar, w10 w10Var) {
        this.f53631e = w10Var;
    }

    @Override
    public final void Z(ArrayList arrayList, b51 b51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f53634r)) {
            ArrayList arrayList2 = this.f53632f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) this.f53632f.get(size);
                    calendar.setTimeInMillis(w0Var.f53619b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(n41.r(gd.u(w0Var.f53619b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.f53634r;
                    int i13 = g.f53373b;
                    n41 K = n41.K(g.class);
                    K.A = 3;
                    K.f37660r = false;
                    K.I = w0Var;
                    K.f37656n = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                w0 w0Var2 = (w0) arrayList3.get(size2);
                calendar.setTimeInMillis(w0Var2.f53619b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(n41.r(gd.u(w0Var2.f53619b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.f53634r;
                int i16 = g.f53373b;
                n41 K2 = n41.K(g.class);
                K2.A = 3;
                K2.f37660r = false;
                K2.I = w0Var2;
                K2.f37656n = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.f53633n) {
                arrayList.add(n41.p(32));
                arrayList.add(n41.p(32));
                arrayList.add(n41.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(n41.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131742649, null);
    }

    @Override
    public final void b0(n41 n41Var, View view) {
        if (n41Var.H(g.class) && !this.actionBar.x()) {
            finishFragment();
            this.f53631e.a((w0) n41Var.I);
        }
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = n6.f29451d6;
        u6.h(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(n6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231243);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = n6.G6;
        u6.l(kVar2, 5, i11, getResourceProvider());
        u6.l(this.actionBar, 3, n6.f29864z8, getResourceProvider());
        u6.l(this.actionBar, 1, i11, getResourceProvider());
        u6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new gs0(this, 25));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f53635s = numberTextView;
        numberTextView.setTextSize(18);
        this.f53635s.setTypeface(org.telegram.messenger.g0.o());
        this.f53635s.setTextColor(getThemedColor(n6.f29845y8));
        this.f53635s.setOnTouchListener(new gi.a(2));
        p10.addView(this.f53635s, na.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, 2131232491, getResourceProvider());
        c10.O();
        c10.I = new b3(this);
        this.f53637x = c10;
        c10.setSearchFieldHint(gd.N0(2131745640, null));
        this.f53637x.setContentDescription(gd.N0(2131745640, null));
        EditTextBoldCursor searchField = this.f53637x.getSearchField();
        u6.U(searchField, i11, getResourceProvider());
        u6.D(searchField, n6.Jj, getResourceProvider());
        u6.v(searchField, i11, getResourceProvider());
        mv0 mv0Var = new mv0(context, null, 1, null);
        this.f53638y = mv0Var;
        if (TextUtils.isEmpty(this.f53634r)) {
            i7 = 2131742647;
        } else {
            i7 = 2131742646;
        }
        mv0Var.d.setText(gd.N0(i7, null));
        this.f53638y.f37553e.setVisibility(8);
        this.f53638y.e(false, false);
        this.f53638y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f53638y, na.c(-1.0f, -1));
        this.f34213a.setEmptyView(this.f53638y);
        this.f34213a.j(new org.telegram.ui.Components.na(this, 28));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(n6.f29451d6)) > 0.721f) {
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
                kVar.setActionModeColor(n6.x0(null, n6.f29451d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.f53635s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(n6.f29845y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f53637x;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f53637x.getSearchField().setCursorColor(getThemedColor(n6.G6));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
