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
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.w51;
import w7.y5;
public final class g1 extends n61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f39062n;
    public NumberTextView f39063r;
    public org.telegram.ui.ActionBar.u0 v;
    public jx0 f39065w;
    public ArrayList e = d1.a(new ii.q1(this, 4));
    public final ArrayList f39061f = new ArrayList();
    public final HashSet f39064s = new HashSet();

    public g1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, k61 k61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f39062n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.e.get(size);
                    calendar.setTimeInMillis(c1Var.f39039b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(w51.q(LocaleController.formatDateChat(c1Var.f39039b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f39062n;
                    int i14 = g.f39060a;
                    w51 J = w51.J(g.class);
                    J.f29908z = 3;
                    J.f29900q = false;
                    J.H = c1Var;
                    J.f29896m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f39061f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f39039b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(w51.q(LocaleController.formatDateChat(c1Var2.f39039b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f39062n;
                int i17 = g.f39060a;
                w51 J2 = w51.J(g.class);
                J2.f29908z = 3;
                J2.f29900q = false;
                J2.H = c1Var2;
                J2.f29896m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(w51.n(32));
                arrayList.add(w51.n(32));
                arrayList.add(w51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(w51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(w51 w51Var, View view) {
        if (w51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((c1) w51Var.H);
        }
    }

    @Override
    public final boolean X(w51 w51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f19059d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(h6.f19463z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f39063r = numberTextView;
        numberTextView.setTextSize(18);
        this.f39063r.setTypeface(AndroidUtilities.bold());
        this.f39063r.setTextColor(getThemedColor(h6.f19444y8));
        this.f39063r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f39063r, y5.m(1.0f, 0, -1, 65, 0, 0));
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
        jx0 jx0Var = new jx0(context, null, 1, null);
        this.f39065w = jx0Var;
        if (TextUtils.isEmpty(this.f39062n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        jx0Var.d.setText(LocaleController.getString(i10));
        this.f39065w.e.setVisibility(8);
        this.f39065w.e(false, false);
        this.f39065w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f39065w, y5.c(-1.0f, -1));
        this.f26682a.setEmptyView(this.f39065w);
        this.f26682a.j(new vg0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f19059d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
