package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.xm;
import org.telegram.ui.ed1;

public final class d1 extends f51 {
    public final Utilities.Callback d;
    public boolean h;

    public String f43808n;

    public NumberTextView f43809r;
    public org.telegram.ui.ActionBar.v0 v;

    public iw0 f43811w;

    public ArrayList f43806e = b1.a(new n6(this, 8));

    public final ArrayList f43807f = new ArrayList();

    public final HashSet f43810s = new HashSet();

    public d1(org.telegram.ui.d0 d0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, b51 b51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f43808n)) {
            ArrayList arrayList2 = this.f43806e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    a1 a1Var = (a1) this.f43806e.get(size);
                    calendar.setTimeInMillis(a1Var.f43775b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(n41.q(LocaleController.formatDateChat(a1Var.f43775b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f43808n;
                    int i14 = h.f43844a;
                    n41 n41VarJ = n41.J(h.class);
                    n41VarJ.f30857z = 3;
                    n41VarJ.f30849q = false;
                    n41VarJ.H = a1Var;
                    n41VarJ.f30845m = str;
                    arrayList.add(n41VarJ);
                }
            }
        } else {
            ArrayList arrayList3 = this.f43807f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                a1 a1Var2 = (a1) arrayList3.get(size2);
                calendar.setTimeInMillis(a1Var2.f43775b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(n41.q(LocaleController.formatDateChat(a1Var2.f43775b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f43808n;
                int i17 = h.f43844a;
                n41 n41VarJ2 = n41.J(h.class);
                n41VarJ2.f30857z = 3;
                n41VarJ2.f30849q = false;
                n41VarJ2.H = a1Var2;
                n41VarJ2.f30845m = str2;
                arrayList.add(n41VarJ2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(n41.n(32));
                arrayList.add(n41.n(32));
                arrayList.add(n41.n(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(n41.B(null));
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(n41 n41Var, View view) {
        if (!n41Var.G(h.class) || this.actionBar.t()) {
            return;
        }
        finishFragment();
        this.d.run((a1) n41Var.H);
    }

    @Override
    public final boolean X(n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = g6.f23053d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(g6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = g6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.C(getThemedColor(g6.f23443z8), false);
        this.actionBar.D(getThemedColor(i11), false);
        this.actionBar.D(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ed1(5, this));
        org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(zVarJ.getContext());
        this.f43809r = numberTextView;
        numberTextView.setTextSize(18);
        this.f43809r.setTypeface(AndroidUtilities.bold());
        this.f43809r.setTextColor(getThemedColor(g6.f23425y8));
        this.f43809r.setOnTouchListener(new kh.e(2));
        zVarJ.addView(this.f43809r, z5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 v0VarC = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        v0VarC.F();
        v0VarC.D = new c1(this);
        this.v = v0VarC;
        v0VarC.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(g6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        iw0 iw0Var = new iw0(context, null, 1, null);
        this.f43811w = iw0Var;
        iw0Var.d.setText(LocaleController.getString(TextUtils.isEmpty(this.f43808n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.f43811w.f29506e.setVisibility(8);
        this.f43811w.e(false, false);
        this.f43811w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f43811w, z5.c(-1.0f, -1));
        this.f28261a.setEmptyView(this.f43811w);
        this.f28261a.j(new xm(this, 18));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(g6.f23053d6)) > 0.721f;
    }
}
