package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.r20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.eo0;
import org.telegram.ui.z01;
import w7.b6;
import w7.m6;
public final class b1 extends s51 {
    public final r20 e;
    public boolean f42798n;
    public String f42799r;
    public NumberTextView f42800s;
    public org.telegram.ui.ActionBar.t0 f42802x;
    public ew0 f42803y;
    public ArrayList f42797f = m6.a(new ag.l(this, 28));
    public final ArrayList h = new ArrayList();
    public final HashSet f42801w = new HashSet();

    public b1(org.telegram.ui.y yVar, r20 r20Var) {
        this.e = r20Var;
    }

    @Override
    public final void Z(ArrayList arrayList, q51 q51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f42799r)) {
            ArrayList arrayList2 = this.f42797f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    a1 a1Var = (a1) this.f42797f.get(size);
                    calendar.setTimeInMillis(a1Var.f42785b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(b51.r(dd.u(a1Var.f42785b / 1000, false)));
                        i12 = i13;
                    }
                    String str = this.f42799r;
                    int i14 = f.f42829b;
                    b51 K = b51.K(f.class);
                    K.f24656z = 3;
                    K.f24648q = false;
                    K.H = a1Var;
                    K.f24644m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                a1 a1Var2 = (a1) arrayList3.get(size2);
                calendar.setTimeInMillis(a1Var2.f42785b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(b51.r(dd.u(a1Var2.f42785b / 1000, false)));
                    i15 = i16;
                }
                String str2 = this.f42799r;
                int i17 = f.f42829b;
                b51 K2 = b51.K(f.class);
                K2.f24656z = 3;
                K2.f24648q = false;
                K2.H = a1Var2;
                K2.f24644m = str2;
                arrayList.add(K2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.f42798n) {
                arrayList.add(b51.p(32));
                arrayList.add(b51.p(32));
                arrayList.add(b51.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(b51.C(null));
        }
    }

    @Override
    public final CharSequence a0() {
        return dd.L0(2131742946, null);
    }

    @Override
    public final void b0(b51 b51Var, View view) {
        if (b51Var.H(f.class) && !this.actionBar.u()) {
            finishFragment();
            this.e.a((a1) b51Var.H);
        }
    }

    @Override
    public final boolean c0(b51 b51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = t6.f20930d6;
        a7.i(i11, lVar, getResourceProvider());
        this.actionBar.setActionModeColor(t6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(2131231241);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = t6.G6;
        a7.m(lVar2, 5, i12, getResourceProvider());
        a7.m(this.actionBar, 3, t6.f21333z8, getResourceProvider());
        a7.m(this.actionBar, 1, i12, getResourceProvider());
        a7.b(this.actionBar, i12, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 13));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(null);
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.f42800s = numberTextView;
        numberTextView.setTextSize(18);
        this.f42800s.setTypeface(org.telegram.messenger.i0.o());
        this.f42800s.setTextColor(getThemedColor(t6.f21314y8));
        this.f42800s.setOnTouchListener(new n2(1));
        m10.addView(this.f42800s, b6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.t0 c10 = this.actionBar.p().c(0, 2131232485, getResourceProvider());
        c10.N();
        c10.H = new eo0(this);
        this.f42802x = c10;
        c10.setSearchFieldHint(dd.L0(2131745853, null));
        this.f42802x.setContentDescription(dd.L0(2131745853, null));
        EditTextBoldCursor searchField = this.f42802x.getSearchField();
        a7.V(searchField, i12, getResourceProvider());
        a7.E(searchField, t6.Gj, getResourceProvider());
        a7.w(searchField, i12, getResourceProvider());
        ew0 ew0Var = new ew0(context, null, 1, null);
        this.f42803y = ew0Var;
        if (TextUtils.isEmpty(this.f42799r)) {
            i10 = 2131742944;
        } else {
            i10 = 2131742943;
        }
        ew0Var.d.setText(dd.L0(i10, null));
        this.f42803y.e.setVisibility(8);
        this.f42803y.e(false, false);
        this.f42803y.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f42803y, b6.c(-1.0f, -1));
        this.f30217a.setEmptyView(this.f42803y);
        this.f30217a.j(new cu0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.i0.B(getThemedColor(t6.f20930d6)) > 0.721f) {
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
                lVar.setActionModeColor(t6.x0(null, t6.f20930d6, false));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            NumberTextView numberTextView = this.f42800s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(t6.f21314y8));
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.f42802x;
            if (t0Var != null && t0Var.getSearchField() != null) {
                this.f42802x.getSearchField().setCursorColor(getThemedColor(t6.G6));
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }
}
