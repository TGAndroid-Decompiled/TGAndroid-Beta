package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.al0;
public final class d1 extends p51 {
    public final Utilities.Callback d;
    public boolean h;
    public String f44001n;
    public NumberTextView f44002r;
    public org.telegram.ui.ActionBar.w0 v;
    public qw0 f44004w;
    public ArrayList f43999e = b1.a(new nh.b0(this, 11));
    public final ArrayList f44000f = new ArrayList();
    public final HashSet f44003s = new HashSet();

    public d1(org.telegram.ui.d0 d0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    public static org.telegram.ui.ActionBar.l Y(d1 d1Var) {
        return d1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l Z(d1 d1Var) {
        return d1Var.actionBar;
    }

    @Override
    public final void U(ArrayList arrayList, k51 k51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f44001n)) {
            ArrayList arrayList2 = this.f43999e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    a1 a1Var = (a1) this.f43999e.get(size);
                    calendar.setTimeInMillis(a1Var.f43976b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(w41.q(LocaleController.formatDateChat(a1Var.f43976b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f44001n;
                    int i14 = h.f44044a;
                    w41 J = w41.J(h.class);
                    J.f34313z = 3;
                    J.f34305q = false;
                    J.H = a1Var;
                    J.f34301m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f44000f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                a1 a1Var2 = (a1) arrayList3.get(size2);
                calendar.setTimeInMillis(a1Var2.f43976b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(w41.q(LocaleController.formatDateChat(a1Var2.f43976b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f44001n;
                int i17 = h.f44044a;
                w41 J2 = w41.J(h.class);
                J2.f34313z = 3;
                J2.f34305q = false;
                J2.H = a1Var2;
                J2.f34301m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(w41.n(32));
                arrayList.add(w41.n(32));
                arrayList.add(w41.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(w41.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(w41 w41Var, View view) {
        if (w41Var.G(h.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((a1) w41Var.H);
        }
    }

    @Override
    public final boolean X(w41 w41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = g6.f23062d6;
        lVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(g6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = g6.G6;
        lVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(g6.f23452z8), false);
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 26));
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f44002r = numberTextView;
        numberTextView.setTextSize(18);
        this.f44002r.setTypeface(AndroidUtilities.bold());
        this.f44002r.setTextColor(getThemedColor(g6.y8));
        this.f44002r.setOnTouchListener(new mh.d(2));
        j10.addView(this.f44002r, f6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.D = new c1(this);
        this.v = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(g6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        qw0 qw0Var = new qw0(context, null, 1, null);
        this.f44004w = qw0Var;
        if (TextUtils.isEmpty(this.f44001n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        qw0Var.d.setText(LocaleController.getString(i10));
        this.f44004w.f32122e.setVisibility(8);
        this.f44004w.e(false, false);
        this.f44004w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f44004w, f6.c(-1.0f, -1));
        this.f31601a.setEmptyView(this.f44004w);
        this.f31601a.j(new h00(this, 13));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(g6.f23062d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
