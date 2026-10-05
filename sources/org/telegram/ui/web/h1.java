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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.z61;
import w7.z5;
public final class h1 extends z61 {
    public final Utilities.Callback f42217e;
    public boolean f42219n;
    public String f42220r;
    public NumberTextView f42221s;
    public org.telegram.ui.ActionBar.v0 f42222w;
    public ux0 f42223x;
    public ArrayList f42218f = e1.a(new ii.q1(this, 4));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public h1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.f42217e = callback;
    }

    @Override
    public final void S(ArrayList arrayList, w61 w61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f42220r)) {
            ArrayList arrayList2 = this.f42218f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) this.f42218f.get(size);
                    calendar.setTimeInMillis(d1Var.f42184b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(h61.r(LocaleController.formatDateChat(d1Var.f42184b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f42220r;
                    int i14 = g.f42203a;
                    h61 K = h61.K(g.class);
                    K.f27106z = 3;
                    K.f27098q = false;
                    K.H = d1Var;
                    K.f27094m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                d1 d1Var2 = (d1) arrayList3.get(size2);
                calendar.setTimeInMillis(d1Var2.f42184b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(h61.r(LocaleController.formatDateChat(d1Var2.f42184b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f42220r;
                int i17 = g.f42203a;
                h61 K2 = h61.K(g.class);
                K2.f27106z = 3;
                K2.f27098q = false;
                K2.H = d1Var2;
                K2.f27094m = str2;
                arrayList.add(K2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.f42219n) {
                arrayList.add(h61.p(32));
                arrayList.add(h61.p(32));
                arrayList.add(h61.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(h61.C(null));
        }
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void U(h61 h61Var, View view) {
        if (h61Var.H(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.f42217e.run((d1) h61Var.H);
        }
    }

    @Override
    public final boolean W(h61 h61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = i6.f20827d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(i6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = i6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.z(getThemedColor(i6.f21235z8), false);
        this.actionBar.A(getThemedColor(i12), false);
        this.actionBar.A(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new f1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f42221s = numberTextView;
        numberTextView.setTextSize(18);
        this.f42221s.setTypeface(AndroidUtilities.bold());
        this.f42221s.setTextColor(getThemedColor(i6.f21216y8));
        this.f42221s.setOnTouchListener(new bi.d(2));
        j3.addView(this.f42221s, z5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.f42222w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42222w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f42222w.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        ux0 ux0Var = new ux0(context, null, 1, null);
        this.f42223x = ux0Var;
        if (TextUtils.isEmpty(this.f42220r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        ux0Var.d.setText(LocaleController.getString(i10));
        this.f42223x.f31551e.setVisibility(8);
        this.f42223x.e(false, false);
        this.f42223x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f42223x, z5.c(-1.0f, -1));
        this.f33438a.setEmptyView(this.f42223x);
        this.f33438a.j(new xb0(this, 12));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.f20827d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
