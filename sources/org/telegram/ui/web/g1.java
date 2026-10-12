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
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.u61;
import w7.w5;
public final class g1 extends k71 {
    public final Utilities.Callback d;
    public boolean h;
    public String f43251n;
    public NumberTextView f43252r;
    public org.telegram.ui.ActionBar.u0 v;
    public gy0 f43254w;
    public ArrayList f43249e = d1.a(new ii.q1(this, 4));
    public final ArrayList f43250f = new ArrayList();
    public final HashSet f43253s = new HashSet();

    public g1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, h71 h71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f43251n)) {
            ArrayList arrayList2 = this.f43249e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.f43249e.get(size);
                    calendar.setTimeInMillis(c1Var.f43221b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(u61.q(LocaleController.formatDateChat(c1Var.f43221b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f43251n;
                    int i14 = g.f43248a;
                    u61 J = u61.J(g.class);
                    J.f31084z = 3;
                    J.f31076q = false;
                    J.H = c1Var;
                    J.f31072m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f43250f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f43221b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(u61.q(LocaleController.formatDateChat(c1Var2.f43221b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f43251n;
                int i17 = g.f43248a;
                u61 J2 = u61.J(g.class);
                J2.f31084z = 3;
                J2.f31076q = false;
                J2.H = c1Var2;
                J2.f31072m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(u61.n(32));
                arrayList.add(u61.n(32));
                arrayList.add(u61.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(u61.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(u61 u61Var, View view) {
        if (u61Var.G(g.class) && !this.actionBar.u()) {
            finishFragment();
            this.d.run((c1) u61Var.H);
        }
    }

    @Override
    public final boolean X(u61 u61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f20560d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.D(getThemedColor(h6.f20966z8), false);
        this.actionBar.E(getThemedColor(i12), false);
        this.actionBar.E(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y k10 = this.actionBar.k(null);
        NumberTextView numberTextView = new NumberTextView(k10.getContext());
        this.f43252r = numberTextView;
        numberTextView.setTextSize(18);
        this.f43252r.setTypeface(AndroidUtilities.bold());
        this.f43252r.setTextColor(getThemedColor(h6.f20948y8));
        this.f43252r.setOnTouchListener(new bi.d(2));
        k10.addView(this.f43252r, w5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.p().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        gy0 gy0Var = new gy0(context, null, 1, null);
        this.f43254w = gy0Var;
        if (TextUtils.isEmpty(this.f43251n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        gy0Var.d.setText(LocaleController.getString(i10));
        this.f43254w.f26561e.setVisibility(8);
        this.f43254w.e(false, false);
        this.f43254w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f43254w, w5.d(-1.0f, -1));
        this.f27776a.setEmptyView(this.f43254w);
        this.f27776a.j(new qh0(this, 13));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f20560d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
