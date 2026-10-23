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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wx0;
import w7.z5;
public final class g1 extends e71 {
    public final Utilities.Callback d;
    public boolean h;
    public String f43117n;
    public NumberTextView f43118r;
    public org.telegram.ui.ActionBar.u0 v;
    public wx0 f43120w;
    public ArrayList e = d1.a(new ig.k0(this, 10));
    public final ArrayList f43116f = new ArrayList();
    public final HashSet f43119s = new HashSet();

    public g1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, b71 b71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f43117n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.e.get(size);
                    calendar.setTimeInMillis(c1Var.f43088b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(m61.q(LocaleController.formatDateChat(c1Var.f43088b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f43117n;
                    int i14 = h.f43131a;
                    m61 J = m61.J(h.class);
                    J.f28572z = 3;
                    J.f28564q = false;
                    J.H = c1Var;
                    J.f28560m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f43116f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f43088b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(m61.q(LocaleController.formatDateChat(c1Var2.f43088b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f43117n;
                int i17 = h.f43131a;
                m61 J2 = m61.J(h.class);
                J2.f28572z = 3;
                J2.f28564q = false;
                J2.H = c1Var2;
                J2.f28560m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(m61.n(32));
                arrayList.add(m61.n(32));
                arrayList.add(m61.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(m61.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(m61 m61Var, View view) {
        if (m61Var.G(h.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((c1) m61Var.H);
        }
    }

    @Override
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = k6.f21183d6;
        r6.i(i11, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(k6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = k6.G6;
        r6.m(kVar2, 5, i12, getResourceProvider());
        r6.m(this.actionBar, 3, k6.f21590z8, getResourceProvider());
        r6.m(this.actionBar, 1, i12, getResourceProvider());
        r6.b(this.actionBar, i12, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y i13 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i13.getContext());
        this.f43118r = numberTextView;
        numberTextView.setTextSize(18);
        this.f43118r.setTypeface(AndroidUtilities.bold());
        this.f43118r.setTextColor(getThemedColor(k6.f21573y8));
        this.f43118r.setOnTouchListener(new di.d(2));
        i13.addView(this.f43118r, z5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.m().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        r6.W(searchField, i12, getResourceProvider());
        r6.F(searchField, k6.Si, getResourceProvider());
        r6.x(searchField, i12, getResourceProvider());
        wx0 wx0Var = new wx0(context, null, 1, null);
        this.f43120w = wx0Var;
        if (TextUtils.isEmpty(this.f43117n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        wx0Var.d.setText(LocaleController.getString(i10));
        this.f43120w.e.setVisibility(8);
        this.f43120w.e(false, false);
        this.f43120w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f43120w, z5.c(-1.0f, -1));
        this.f25907a.setEmptyView(this.f43120w);
        this.f25907a.j(new kv(this, 18));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.f21183d6)) > 0.721f) {
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
                kVar.setActionModeColor(k6.x0(null, k6.f21183d6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            NumberTextView numberTextView = this.f43118r;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(k6.f21573y8));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.v;
            if (u0Var != null && u0Var.getSearchField() != null) {
                this.v.getSearchField().setCursorColor(getThemedColor(k6.G6));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
