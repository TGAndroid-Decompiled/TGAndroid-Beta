package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.xe1;
public final class c1 extends d51 {
    public final Utilities.Callback d;
    public boolean h;
    public String f43821n;
    public NumberTextView f43822r;
    public org.telegram.ui.ActionBar.w0 v;
    public gw0 f43824w;
    public ArrayList f43819e = a1.a(new i9(this, 8));
    public final ArrayList f43820f = new ArrayList();
    public final HashSet f43823s = new HashSet();

    public c1(org.telegram.ui.c0 c0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void T(ArrayList arrayList, z41 z41Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i9 = 5;
        int i10 = 2;
        if (TextUtils.isEmpty(this.f43821n)) {
            ArrayList arrayList2 = this.f43819e;
            if (arrayList2 != null) {
                int i11 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    z0 z0Var = (z0) this.f43819e.get(size);
                    calendar.setTimeInMillis(z0Var.f44113b);
                    int i12 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i11 != i12) {
                        arrayList.add(l41.q(LocaleController.formatDateChat(z0Var.f44113b / 1000)));
                        i11 = i12;
                    }
                    String str = this.f43821n;
                    int i13 = g.f43857a;
                    l41 J = l41.J(g.class);
                    J.f30352z = 3;
                    J.f30344q = false;
                    J.H = z0Var;
                    J.f30340m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f43820f;
            int size2 = arrayList3.size() - 1;
            int i14 = 0;
            while (size2 >= 0) {
                z0 z0Var2 = (z0) arrayList3.get(size2);
                calendar.setTimeInMillis(z0Var2.f44113b);
                int i15 = calendar.get(i9) + (calendar.get(i10) * 100) + (calendar.get(1) * 10000);
                if (i14 != i15) {
                    arrayList.add(l41.q(LocaleController.formatDateChat(z0Var2.f44113b / 1000)));
                    i14 = i15;
                }
                String str2 = this.f43821n;
                int i16 = g.f43857a;
                l41 J2 = l41.J(g.class);
                J2.f30352z = 3;
                J2.f30344q = false;
                J2.H = z0Var2;
                J2.f30340m = str2;
                arrayList.add(J2);
                size2--;
                i9 = 5;
                i10 = 2;
            }
            if (this.h) {
                arrayList.add(l41.n(32));
                arrayList.add(l41.n(32));
                arrayList.add(l41.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(l41.B(null));
        }
    }

    @Override
    public final CharSequence U() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void V(l41 l41Var, View view) {
        if (l41Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((z0) l41Var.H);
        }
    }

    @Override
    public final boolean W(l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i9;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = f6.f23001d6;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(f6.w0(null, i10, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = f6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.A(getThemedColor(f6.f23388z8), false);
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(i11), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 4));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f43822r = numberTextView;
        numberTextView.setTextSize(18);
        this.f43822r.setTypeface(AndroidUtilities.bold());
        this.f43822r.setTextColor(getThemedColor(f6.f23371y8));
        this.f43822r.setOnTouchListener(new jh.d(2));
        j10.addView(this.f43822r, e6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.D = new b1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i11));
        searchField.setHintTextColor(getThemedColor(f6.Si));
        searchField.setCursorColor(getThemedColor(i11));
        gw0 gw0Var = new gw0(context, null, 1, null);
        this.f43824w = gw0Var;
        if (TextUtils.isEmpty(this.f43821n)) {
            i9 = R.string.WebNoHistory;
        } else {
            i9 = R.string.WebNoSearchedHistory;
        }
        gw0Var.d.setText(LocaleController.getString(i9));
        this.f43824w.f28885e.setVisibility(8);
        this.f43824w.e(false, false);
        this.f43824w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f43824w, e6.c(-1.0f, -1));
        this.f27658a.setEmptyView(this.f43824w);
        this.f27658a.j(new kn(this, 17));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(f6.f23001d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
