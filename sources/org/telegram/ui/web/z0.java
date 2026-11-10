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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x31;
import org.telegram.ui.qt0;
public final class z0 extends o41 {
    public final c20 f51346e;
    public boolean f51348n;
    public String f51349r;
    public NumberTextView f51350s;
    public org.telegram.ui.ActionBar.r0 f51352x;
    public bv0 f51353y;
    public ArrayList f51347f = xa.a(new ii.c(this, 17));
    public final ArrayList h = new ArrayList();
    public final HashSet f51351w = new HashSet();

    public z0(org.telegram.ui.a0 a0Var, c20 c20Var) {
        this.f51346e = c20Var;
    }

    @Override
    public final void Z(ArrayList arrayList, m41 m41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f51349r)) {
            ArrayList arrayList2 = this.f51347f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    y0 y0Var = (y0) this.f51347f.get(size);
                    calendar.setTimeInMillis(y0Var.f51338b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(x31.r(id.u(y0Var.f51338b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.f51349r;
                    int i13 = f.f51060b;
                    x31 K = x31.K(f.class);
                    K.f40169z = 3;
                    K.f40161q = false;
                    K.H = y0Var;
                    K.f40157m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                y0 y0Var2 = (y0) arrayList3.get(size2);
                calendar.setTimeInMillis(y0Var2.f51338b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(x31.r(id.u(y0Var2.f51338b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.f51349r;
                int i16 = f.f51060b;
                x31 K2 = x31.K(f.class);
                K2.f40169z = 3;
                K2.f40161q = false;
                K2.H = y0Var2;
                K2.f40157m = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.f51348n) {
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
        return id.M0(2131742920, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        if (x31Var.H(f.class) && !this.actionBar.x()) {
            finishFragment();
            this.f51346e.a((y0) x31Var.H);
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
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = m6.f27890d6;
        t6.h(i10, lVar, getResourceProvider());
        this.actionBar.setActionModeColor(m6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = m6.G6;
        t6.l(lVar2, 5, i11, getResourceProvider());
        t6.l(this.actionBar, 3, m6.f28302z8, getResourceProvider());
        t6.l(this.actionBar, 1, i11, getResourceProvider());
        t6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new qt0(this, 22));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f51350s = numberTextView;
        numberTextView.setTextSize(18);
        this.f51350s.setTypeface(org.telegram.messenger.g0.o());
        this.f51350s.setTextColor(getThemedColor(m6.f28284y8));
        this.f51350s.setOnTouchListener(new ei.b(2));
        p10.addView(this.f51350s, ha.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.s().c(0, 2131232486, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.f51352x = c10;
        c10.setSearchFieldHint(id.M0(2131745836, null));
        this.f51352x.setContentDescription(id.M0(2131745836, null));
        EditTextBoldCursor searchField = this.f51352x.getSearchField();
        t6.U(searchField, i11, getResourceProvider());
        t6.D(searchField, m6.Gj, getResourceProvider());
        t6.v(searchField, i11, getResourceProvider());
        bv0 bv0Var = new bv0(context, null, 1, null);
        this.f51353y = bv0Var;
        if (TextUtils.isEmpty(this.f51349r)) {
            i7 = 2131742918;
        } else {
            i7 = 2131742917;
        }
        bv0Var.d.setText(id.M0(i7, null));
        this.f51353y.f32368e.setVisibility(8);
        this.f51353y.e(false, false);
        this.f51353y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f51353y, ha.c(-1.0f, -1));
        this.f36518a.setEmptyView(this.f51353y);
        this.f36518a.j(new ti(this, 25));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(m6.f27890d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.setActionModeColor(m6.x0(null, m6.f27890d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.f51350s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(m6.f28284y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f51352x;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f51352x.getSearchField().setCursorColor(getThemedColor(m6.G6));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
