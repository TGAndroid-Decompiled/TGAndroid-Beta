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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.y31;
import org.telegram.ui.pt0;
public final class z0 extends o41 {
    public final c20 f51392e;
    public boolean f51394n;
    public String f51395r;
    public NumberTextView f51396s;
    public org.telegram.ui.ActionBar.r0 f51398x;
    public cv0 f51399y;
    public ArrayList f51393f = xa.a(new ii.c(this, 17));
    public final ArrayList h = new ArrayList();
    public final HashSet f51397w = new HashSet();

    public z0(org.telegram.ui.a0 a0Var, c20 c20Var) {
        this.f51392e = c20Var;
    }

    @Override
    public final void Z(ArrayList arrayList, m41 m41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f51395r)) {
            ArrayList arrayList2 = this.f51393f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    y0 y0Var = (y0) this.f51393f.get(size);
                    calendar.setTimeInMillis(y0Var.f51384b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(y31.r(id.u(y0Var.f51384b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.f51395r;
                    int i13 = f.f51106b;
                    y31 K = y31.K(f.class);
                    K.f40581z = 3;
                    K.f40573q = false;
                    K.H = y0Var;
                    K.f40569m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                y0 y0Var2 = (y0) arrayList3.get(size2);
                calendar.setTimeInMillis(y0Var2.f51384b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(y31.r(id.u(y0Var2.f51384b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.f51395r;
                int i16 = f.f51106b;
                y31 K2 = y31.K(f.class);
                K2.f40581z = 3;
                K2.f40573q = false;
                K2.H = y0Var2;
                K2.f40569m = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.f51394n) {
                arrayList.add(y31.p(32));
                arrayList.add(y31.p(32));
                arrayList.add(y31.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(y31.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131742920, null);
    }

    @Override
    public final void b0(y31 y31Var, View view) {
        if (y31Var.H(f.class) && !this.actionBar.w()) {
            finishFragment();
            this.f51392e.a((y0) y31Var.H);
        }
    }

    @Override
    public final boolean c0(y31 y31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = l6.f27865d6;
        s6.h(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(l6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = l6.G6;
        s6.l(kVar2, 5, i11, getResourceProvider());
        s6.l(this.actionBar, 3, l6.f28277z8, getResourceProvider());
        s6.l(this.actionBar, 1, i11, getResourceProvider());
        s6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new pt0(this, 22));
        org.telegram.ui.ActionBar.y o4 = this.actionBar.o(null);
        NumberTextView numberTextView = new NumberTextView(o4.getContext());
        this.f51396s = numberTextView;
        numberTextView.setTextSize(18);
        this.f51396s.setTypeface(org.telegram.messenger.g0.o());
        this.f51396s.setTextColor(getThemedColor(l6.f28259y8));
        this.f51396s.setOnTouchListener(new ei.b(2));
        o4.addView(this.f51396s, ha.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.r0 c10 = this.actionBar.r().c(0, 2131232486, getResourceProvider());
        c10.N();
        c10.H = new u2(this);
        this.f51398x = c10;
        c10.setSearchFieldHint(id.M0(2131745836, null));
        this.f51398x.setContentDescription(id.M0(2131745836, null));
        EditTextBoldCursor searchField = this.f51398x.getSearchField();
        s6.U(searchField, i11, getResourceProvider());
        s6.D(searchField, l6.Gj, getResourceProvider());
        s6.v(searchField, i11, getResourceProvider());
        cv0 cv0Var = new cv0(context, null, 1, null);
        this.f51399y = cv0Var;
        if (TextUtils.isEmpty(this.f51395r)) {
            i7 = 2131742918;
        } else {
            i7 = 2131742917;
        }
        cv0Var.d.setText(id.M0(i7, null));
        this.f51399y.f32768e.setVisibility(8);
        this.f51399y.e(false, false);
        this.f51399y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f51399y, ha.c(-1.0f, -1));
        this.f36649a.setEmptyView(this.f51399y);
        this.f36649a.j(new ui(this, 25));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(l6.f27865d6)) > 0.721f) {
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
                kVar.setActionModeColor(l6.x0(null, l6.f27865d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.f51396s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(l6.f28259y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f51398x;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f51398x.getSearchField().setCursorColor(getThemedColor(l6.G6));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
