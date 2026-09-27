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
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.x51;
import w7.y5;
public final class h1 extends o61 {
    public final Utilities.Callback e;
    public boolean f39030n;
    public String f39031r;
    public NumberTextView f39032s;
    public org.telegram.ui.ActionBar.w0 f39033w;
    public kx0 f39034x;
    public ArrayList f39029f = e1.a(new ii.q1(this, 4));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public h1(org.telegram.ui.c0 c0Var, Utilities.Callback callback) {
        this.e = callback;
    }

    @Override
    public final void U(ArrayList arrayList, l61 l61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f39031r)) {
            ArrayList arrayList2 = this.f39029f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) this.f39029f.get(size);
                    calendar.setTimeInMillis(d1Var.f38996b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(x51.q(LocaleController.formatDateChat(d1Var.f38996b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f39031r;
                    int i14 = g.f39015a;
                    x51 J = x51.J(g.class);
                    J.f30315z = 3;
                    J.f30307q = false;
                    J.H = d1Var;
                    J.f30303m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                d1 d1Var2 = (d1) arrayList3.get(size2);
                calendar.setTimeInMillis(d1Var2.f38996b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(x51.q(LocaleController.formatDateChat(d1Var2.f38996b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f39031r;
                int i17 = g.f39015a;
                x51 J2 = x51.J(g.class);
                J2.f30315z = 3;
                J2.f30307q = false;
                J2.H = d1Var2;
                J2.f30303m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.f39030n) {
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
        if (x51Var.G(g.class) && !this.actionBar.t()) {
            finishFragment();
            this.e.run((d1) x51Var.H);
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
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = i6.f19057d6;
        lVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(i6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = i6.G6;
        lVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(i6.f19463z8), false);
        this.actionBar.E(getThemedColor(i12), false);
        this.actionBar.E(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new f1(this));
        org.telegram.ui.ActionBar.a0 k10 = this.actionBar.k(null);
        NumberTextView numberTextView = new NumberTextView(k10.getContext());
        this.f39032s = numberTextView;
        numberTextView.setTextSize(18);
        this.f39032s.setTypeface(AndroidUtilities.bold());
        this.f39032s.setTextColor(getThemedColor(i6.f19444y8));
        this.f39032s.setOnTouchListener(new bi.d(2));
        k10.addView(this.f39032s, y5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.f39033w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39033w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f39033w.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        kx0 kx0Var = new kx0(context, null, 1, null);
        this.f39034x = kx0Var;
        if (TextUtils.isEmpty(this.f39031r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        kx0Var.d.setText(LocaleController.getString(i10));
        this.f39034x.e.setVisibility(8);
        this.f39034x.e(false, false);
        this.f39034x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f39034x, y5.c(-1.0f, -1));
        this.f27008a.setEmptyView(this.f39034x);
        this.f27008a.j(new hg0(this, 11));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.f19057d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
