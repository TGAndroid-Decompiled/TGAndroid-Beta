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
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.r61;
import w7.x5;
public final class g1 extends h71 {
    public final Utilities.Callback d;
    public boolean h;
    public String f43496n;
    public NumberTextView f43497r;
    public org.telegram.ui.ActionBar.u0 v;
    public cy0 f43499w;
    public ArrayList f43494e = d1.a(new ii.q1(this, 4));
    public final ArrayList f43495f = new ArrayList();
    public final HashSet f43498s = new HashSet();

    public g1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, e71 e71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f43496n)) {
            ArrayList arrayList2 = this.f43494e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.f43494e.get(size);
                    calendar.setTimeInMillis(c1Var.f43466b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(r61.q(LocaleController.formatDateChat(c1Var.f43466b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f43496n;
                    int i14 = g.f43493a;
                    r61 J = r61.J(g.class);
                    J.f30374z = 3;
                    J.f30366q = false;
                    J.H = c1Var;
                    J.f30362m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f43495f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f43466b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(r61.q(LocaleController.formatDateChat(c1Var2.f43466b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f43496n;
                int i17 = g.f43493a;
                r61 J2 = r61.J(g.class);
                J2.f30374z = 3;
                J2.f30366q = false;
                J2.H = c1Var2;
                J2.f30362m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(r61.n(32));
                arrayList.add(r61.n(32));
                arrayList.add(r61.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(r61.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(r61 r61Var, View view) {
        if (r61Var.G(g.class) && !this.actionBar.t()) {
            finishFragment();
            this.d.run((c1) r61Var.H);
        }
    }

    @Override
    public final boolean X(r61 r61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f20786d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.C(getThemedColor(h6.f21191z8), false);
        this.actionBar.D(getThemedColor(i12), false);
        this.actionBar.D(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f43497r = numberTextView;
        numberTextView.setTextSize(18);
        this.f43497r.setTypeface(AndroidUtilities.bold());
        this.f43497r.setTextColor(getThemedColor(h6.f21173y8));
        this.f43497r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f43497r, x5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        cy0 cy0Var = new cy0(context, null, 1, null);
        this.f43499w = cy0Var;
        if (TextUtils.isEmpty(this.f43496n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        cy0Var.d.setText(LocaleController.getString(i10));
        this.f43499w.f25351e.setVisibility(8);
        this.f43499w.e(false, false);
        this.f43499w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f43499w, x5.d(-1.0f, -1));
        this.f26922a.setEmptyView(this.f43499w);
        this.f26922a.j(new oh0(this, 13));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f20786d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
