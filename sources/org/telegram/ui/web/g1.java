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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.y51;
import w7.y5;
public final class g1 extends p61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f39152n;
    public NumberTextView f39153r;
    public org.telegram.ui.ActionBar.u0 v;
    public lx0 f39155w;
    public ArrayList e = d1.a(new ii.q1(this, 4));
    public final ArrayList f39151f = new ArrayList();
    public final HashSet f39154s = new HashSet();

    public g1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, m61 m61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f39152n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.e.get(size);
                    calendar.setTimeInMillis(c1Var.f39129b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(y51.q(LocaleController.formatDateChat(c1Var.f39129b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f39152n;
                    int i14 = g.f39150a;
                    y51 J = y51.J(g.class);
                    J.f30650z = 3;
                    J.f30642q = false;
                    J.H = c1Var;
                    J.f30638m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f39151f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f39129b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(y51.q(LocaleController.formatDateChat(c1Var2.f39129b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f39152n;
                int i17 = g.f39150a;
                y51 J2 = y51.J(g.class);
                J2.f30650z = 3;
                J2.f30642q = false;
                J2.H = c1Var2;
                J2.f30638m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(y51.n(32));
                arrayList.add(y51.n(32));
                arrayList.add(y51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(y51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(y51 y51Var, View view) {
        if (y51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((c1) y51Var.H);
        }
    }

    @Override
    public final boolean X(y51 y51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f19076d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(h6.f19480z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f39153r = numberTextView;
        numberTextView.setTextSize(18);
        this.f39153r.setTypeface(AndroidUtilities.bold());
        this.f39153r.setTextColor(getThemedColor(h6.f19461y8));
        this.f39153r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f39153r, y5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        lx0 lx0Var = new lx0(context, null, 1, null);
        this.f39155w = lx0Var;
        if (TextUtils.isEmpty(this.f39152n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        lx0Var.d.setText(LocaleController.getString(i10));
        this.f39155w.e.setVisibility(8);
        this.f39155w.e(false, false);
        this.f39155w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f39155w, y5.c(-1.0f, -1));
        this.f27258a.setEmptyView(this.f39155w);
        this.f27258a.j(new xg0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f19076d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
