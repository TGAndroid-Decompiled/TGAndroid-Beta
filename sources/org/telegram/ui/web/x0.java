package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.hb;
import c8.na;
import hi.s2;
import hi.t6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oa;
import org.telegram.ui.is0;
public final class x0 extends e51 {
    public final y10 f53359e;
    public boolean f53361n;
    public String f53362r;
    public NumberTextView f53363s;
    public org.telegram.ui.ActionBar.q0 f53365x;
    public nv0 f53366y;
    public ArrayList f53360f = hb.a(new t6(this, 23));
    public final ArrayList h = new ArrayList();
    public final HashSet f53364w = new HashSet();

    public x0(org.telegram.ui.z zVar, y10 y10Var) {
        this.f53359e = y10Var;
    }

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i7 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f53362r)) {
            ArrayList arrayList2 = this.f53360f;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) this.f53360f.get(size);
                    calendar.setTimeInMillis(w0Var.f53350b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(o41.r(hd.u(w0Var.f53350b / 1000, false)));
                        i11 = i12;
                    }
                    String str = this.f53362r;
                    int i13 = g.f53102b;
                    o41 K = o41.K(g.class);
                    K.A = 3;
                    K.f38063r = false;
                    K.I = w0Var;
                    K.f38059n = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                w0 w0Var2 = (w0) arrayList3.get(size2);
                calendar.setTimeInMillis(w0Var2.f53350b);
                int i15 = calendar.get(i7) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(o41.r(hd.u(w0Var2.f53350b / 1000, false)));
                    i14 = i15;
                }
                String str2 = this.f53362r;
                int i16 = g.f53102b;
                o41 K2 = o41.K(g.class);
                K2.A = 3;
                K2.f38063r = false;
                K2.I = w0Var2;
                K2.f38059n = str2;
                arrayList.add(K2);
                size2--;
                i7 = 5;
                i10 = 2;
            }
            if (this.f53361n) {
                arrayList.add(o41.p(32));
                arrayList.add(o41.p(32));
                arrayList.add(o41.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(o41.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131742656, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        if (o41Var.H(g.class) && !this.actionBar.x()) {
            finishFragment();
            this.f53359e.a((w0) o41Var.I);
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = m6.f29347d6;
        org.telegram.ui.ActionBar.t6.h(i10, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(m6.x0(null, i10, false));
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = m6.G6;
        org.telegram.ui.ActionBar.t6.l(kVar2, 5, i11, getResourceProvider());
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, m6.f29760z8, getResourceProvider());
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.t6.b(this.actionBar, i11, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new is0(this, 25));
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f53363s = numberTextView;
        numberTextView.setTextSize(18);
        this.f53363s.setTypeface(org.telegram.messenger.g0.o());
        this.f53363s.setTextColor(getThemedColor(m6.f29741y8));
        this.f53363s.setOnTouchListener(new gi.a(2));
        p10.addView(this.f53363s, na.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.q0 c10 = this.actionBar.s().c(0, 2131232488, getResourceProvider());
        c10.O();
        c10.I = new s2(this);
        this.f53365x = c10;
        c10.setSearchFieldHint(hd.N0(2131745640, null));
        this.f53365x.setContentDescription(hd.N0(2131745640, null));
        EditTextBoldCursor searchField = this.f53365x.getSearchField();
        org.telegram.ui.ActionBar.t6.U(searchField, i11, getResourceProvider());
        org.telegram.ui.ActionBar.t6.D(searchField, m6.Jj, getResourceProvider());
        org.telegram.ui.ActionBar.t6.v(searchField, i11, getResourceProvider());
        nv0 nv0Var = new nv0(context, null, 1, null);
        this.f53366y = nv0Var;
        if (TextUtils.isEmpty(this.f53362r)) {
            i7 = 2131742654;
        } else {
            i7 = 2131742653;
        }
        nv0Var.d.setText(hd.N0(i7, null));
        this.f53366y.f37962e.setVisibility(8);
        this.f53366y.e(false, false);
        this.f53366y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f53366y, na.c(-1.0f, -1));
        this.f34671a.setEmptyView(this.f53366y);
        this.f34671a.j(new oa(this, 28));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.g0.B(getThemedColor(m6.f29347d6)) > 0.721f) {
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
                kVar.setActionModeColor(m6.x0(null, m6.f29347d6, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            NumberTextView numberTextView = this.f53363s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(m6.f29741y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f53365x;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f53365x.getSearchField().setCursorColor(getThemedColor(m6.G6));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }
}
