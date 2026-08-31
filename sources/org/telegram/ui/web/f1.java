package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ll0;
public final class f1 extends c61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f42537n;
    public NumberTextView f42538r;
    public org.telegram.ui.ActionBar.w0 v;
    public ax0 f42540w;
    public ArrayList f42535e = c1.a(new d1(this, 0));
    public final ArrayList f42536f = new ArrayList();
    public final HashSet f42539s = new HashSet();

    public f1(org.telegram.ui.c0 c0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    public static org.telegram.ui.ActionBar.k Y(f1 f1Var) {
        return f1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k Z(f1 f1Var) {
        return f1Var.actionBar;
    }

    @Override
    public final void U(ArrayList arrayList, x51 x51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f42537n)) {
            ArrayList arrayList2 = this.f42535e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    b1 b1Var = (b1) this.f42535e.get(size);
                    calendar.setTimeInMillis(b1Var.f42510b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(j51.q(LocaleController.formatDateChat(b1Var.f42510b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f42537n;
                    int i14 = g.f42552a;
                    j51 J = j51.J(g.class);
                    J.f28027z = 3;
                    J.f28019q = false;
                    J.H = b1Var;
                    J.f28015m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f42536f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                b1 b1Var2 = (b1) arrayList3.get(size2);
                calendar.setTimeInMillis(b1Var2.f42510b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(j51.q(LocaleController.formatDateChat(b1Var2.f42510b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f42537n;
                int i17 = g.f42552a;
                j51 J2 = j51.J(g.class);
                J2.f28027z = 3;
                J2.f28019q = false;
                J2.H = b1Var2;
                J2.f28015m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(j51.n(32));
                arrayList.add(j51.n(32));
                arrayList.add(j51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(j51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(j51 j51Var, View view) {
        if (j51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((b1) j51Var.H);
        }
    }

    @Override
    public final boolean X(j51 j51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = k6.f21659d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(k6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = k6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(k6.f22055z8), false);
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 26));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f42538r = numberTextView;
        numberTextView.setTextSize(18);
        this.f42538r.setTypeface(AndroidUtilities.bold());
        this.f42538r.setTextColor(getThemedColor(k6.f22038y8));
        this.f42538r.setOnTouchListener(new s2(1));
        j10.addView(this.f42538r, c6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new e1(this);
        this.v = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(k6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        ax0 ax0Var = new ax0(context, null, 1, null);
        this.f42540w = ax0Var;
        if (TextUtils.isEmpty(this.f42537n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        ax0Var.d.setText(LocaleController.getString(i10));
        this.f42540w.f25364e.setVisibility(8);
        this.f42540w.e(false, false);
        this.f42540w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f42540w, c6.c(-1.0f, -1));
        this.f25815a.setEmptyView(this.f42540w);
        this.f25815a.j(new nb0(this, 11));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.f21659d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
