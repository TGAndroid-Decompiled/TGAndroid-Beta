package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import c8.za;
import hi.g7;
import hi.s2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.ct0;
public final class x0 extends r41 {
    public final z10 f52868e;
    public boolean f52870n;
    public String f52871r;
    public NumberTextView f52872s;
    public org.telegram.ui.ActionBar.q0 f52874x;
    public cv0 f52875y;
    public ArrayList f52869f = za.a(new g7(this, 22));
    public final ArrayList h = new ArrayList();
    public final HashSet f52873w = new HashSet();

    public x0(org.telegram.ui.z zVar, z10 z10Var) {
        this.f52868e = z10Var;
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f52871r)) {
            ArrayList arrayList2 = this.f52869f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) this.f52869f.get(size);
                    calendar.setTimeInMillis(w0Var.f52859b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(b41.r(hd.u(w0Var.f52859b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.f52871r;
                    int i13 = g.f52611b;
                    b41 K = b41.K(g.class);
                    K.f33197z = 3;
                    K.f33189q = false;
                    K.H = w0Var;
                    K.f33185m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                w0 w0Var2 = (w0) arrayList3.get(size2);
                calendar.setTimeInMillis(w0Var2.f52859b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(b41.r(hd.u(w0Var2.f52859b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.f52871r;
                int i16 = g.f52611b;
                b41 K2 = b41.K(g.class);
                K2.f33197z = 3;
                K2.f33189q = false;
                K2.H = w0Var2;
                K2.f33185m = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.f52870n) {
                arrayList.add(b41.p(32));
                arrayList.add(b41.p(32));
                arrayList.add(b41.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(b41.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131742920, null);
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        if (b41Var.H(g.class) && !this.actionBar.x()) {
            finishFragment();
            this.f52868e.a((w0) b41Var.H);
        }
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = j6.f28849d6;
        q6.h(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(j6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = j6.G6;
        q6.l(kVar2, 5, i11, getResourceProvider());
        q6.l(this.actionBar, 3, j6.f29262z8, getResourceProvider());
        q6.l(this.actionBar, 1, i11, getResourceProvider());
        q6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 23));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f52872s = numberTextView;
        numberTextView.setTextSize(18);
        this.f52872s.setTypeface(org.telegram.messenger.g0.o());
        this.f52872s.setTextColor(getThemedColor(j6.f29243y8));
        this.f52872s.setOnTouchListener(new gi.a(2));
        p10.addView(this.f52872s, ja.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, 2131232487, getResourceProvider());
        c10.O();
        c10.I = new s2(this);
        this.f52874x = c10;
        c10.setSearchFieldHint(hd.M0(2131745836, null));
        this.f52874x.setContentDescription(hd.M0(2131745836, null));
        EditTextBoldCursor searchField = this.f52874x.getSearchField();
        q6.U(searchField, i11, getResourceProvider());
        q6.D(searchField, j6.Jj, getResourceProvider());
        q6.v(searchField, i11, getResourceProvider());
        cv0 cv0Var = new cv0(context, null, 1, null);
        this.f52875y = cv0Var;
        if (TextUtils.isEmpty(this.f52871r)) {
            i7 = 2131742918;
        } else {
            i7 = 2131742917;
        }
        cv0Var.d.setText(hd.M0(i7, null));
        this.f52875y.f33709e.setVisibility(8);
        this.f52875y.e(false, false);
        this.f52875y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f52875y, ja.c(-1.0f, -1));
        this.f38880a.setEmptyView(this.f52875y);
        this.f38880a.j(new ri(this, 27));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(j6.f28849d6)) > 0.721f) {
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
                kVar.setActionModeColor(j6.x0(null, j6.f28849d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.f52872s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(j6.f29243y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f52874x;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f52874x.getSearchField().setCursorColor(getThemedColor(j6.G6));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
