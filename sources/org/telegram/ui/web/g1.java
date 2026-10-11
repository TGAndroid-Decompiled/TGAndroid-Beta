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
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.q61;
import w7.x5;
public final class g1 extends g71 {
    public final Utilities.Callback d;
    public boolean h;
    public String f43530n;
    public NumberTextView f43531r;
    public org.telegram.ui.ActionBar.u0 v;
    public by0 f43533w;
    public ArrayList f43528e = d1.a(new ii.q1(this, 4));
    public final ArrayList f43529f = new ArrayList();
    public final HashSet f43532s = new HashSet();

    public g1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, d71 d71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f43530n)) {
            ArrayList arrayList2 = this.f43528e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.f43528e.get(size);
                    calendar.setTimeInMillis(c1Var.f43500b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(q61.q(LocaleController.formatDateChat(c1Var.f43500b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f43530n;
                    int i14 = g.f43527a;
                    q61 J = q61.J(g.class);
                    J.f30180z = 3;
                    J.f30172q = false;
                    J.H = c1Var;
                    J.f30168m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f43529f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f43500b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(q61.q(LocaleController.formatDateChat(c1Var2.f43500b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f43530n;
                int i17 = g.f43527a;
                q61 J2 = q61.J(g.class);
                J2.f30180z = 3;
                J2.f30172q = false;
                J2.H = c1Var2;
                J2.f30168m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(q61.n(32));
                arrayList.add(q61.n(32));
                arrayList.add(q61.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(q61.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(q61 q61Var, View view) {
        if (q61Var.G(g.class) && !this.actionBar.t()) {
            finishFragment();
            this.d.run((c1) q61Var.H);
        }
    }

    @Override
    public final boolean X(q61 q61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f20822d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.C(getThemedColor(h6.f21227z8), false);
        this.actionBar.D(getThemedColor(i12), false);
        this.actionBar.D(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f43531r = numberTextView;
        numberTextView.setTextSize(18);
        this.f43531r.setTypeface(AndroidUtilities.bold());
        this.f43531r.setTextColor(getThemedColor(h6.f21209y8));
        this.f43531r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f43531r, x5.m(1.0f, 0, -1, 65, 0, 0));
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
        by0 by0Var = new by0(context, null, 1, null);
        this.f43533w = by0Var;
        if (TextUtils.isEmpty(this.f43530n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        by0Var.d.setText(LocaleController.getString(i10));
        this.f43533w.f25123e.setVisibility(8);
        this.f43533w.e(false, false);
        this.f43533w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f43533w, x5.d(-1.0f, -1));
        this.f26675a.setEmptyView(this.f43533w);
        this.f26675a.j(new nh0(this, 13));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f20822d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
