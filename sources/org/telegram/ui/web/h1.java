package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.v81;
import w7.y5;
public final class h1 extends o61 {
    public final Utilities.Callback e;
    public boolean f38916n;
    public String f38917r;
    public NumberTextView f38918s;
    public org.telegram.ui.ActionBar.v0 f38919w;
    public kx0 f38920x;
    public ArrayList f38915f = f1.a(new b1(this, 1));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public h1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.e = callback;
    }

    @Override
    public final void U(ArrayList arrayList, l61 l61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f38917r)) {
            ArrayList arrayList2 = this.f38915f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) this.f38915f.get(size);
                    calendar.setTimeInMillis(e1Var.f38892b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(x51.q(LocaleController.formatDateChat(e1Var.f38892b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f38917r;
                    int i14 = g.f38903a;
                    x51 J = x51.J(g.class);
                    J.f30261z = 3;
                    J.f30253q = false;
                    J.H = e1Var;
                    J.f30249m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                e1 e1Var2 = (e1) arrayList3.get(size2);
                calendar.setTimeInMillis(e1Var2.f38892b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(x51.q(LocaleController.formatDateChat(e1Var2.f38892b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f38917r;
                int i17 = g.f38903a;
                x51 J2 = x51.J(g.class);
                J2.f30261z = 3;
                J2.f30253q = false;
                J2.H = e1Var2;
                J2.f30249m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.f38916n) {
                arrayList.add(x51.n(32));
                arrayList.add(x51.n(32));
                arrayList.add(x51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(x51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(x51 x51Var, View view) {
        if (x51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.e.run((e1) x51Var.H);
        }
    }

    @Override
    public final boolean X(x51 x51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = j6.f19062d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(j6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(j6.f19466z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new v81(this, 9));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f38918s = numberTextView;
        numberTextView.setTextSize(18);
        this.f38918s.setTypeface(AndroidUtilities.bold());
        this.f38918s.setTextColor(getThemedColor(j6.f19447y8));
        this.f38918s.setOnTouchListener(new bi.d(2));
        j3.addView(this.f38918s, y5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.f38919w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38919w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f38919w.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        kx0 kx0Var = new kx0(context, null, 1, null);
        this.f38920x = kx0Var;
        if (TextUtils.isEmpty(this.f38917r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        kx0Var.d.setText(LocaleController.getString(i10));
        this.f38920x.e.setVisibility(8);
        this.f38920x.e(false, false);
        this.f38920x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f38920x, y5.c(-1.0f, -1));
        this.f26891a.setEmptyView(this.f38920x);
        this.f26891a.j(new tb0(this, 12));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f19062d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
