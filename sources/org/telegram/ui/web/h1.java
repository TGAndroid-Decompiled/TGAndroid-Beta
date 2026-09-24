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
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.v51;
import w7.y5;
public final class h1 extends m61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f39070n;
    public NumberTextView f39071r;
    public org.telegram.ui.ActionBar.u0 v;
    public ix0 f39073w;
    public ArrayList e = d1.a(new ii.q1(this, 4));
    public final ArrayList f39069f = new ArrayList();
    public final HashSet f39072s = new HashSet();

    public h1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, j61 j61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f39070n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.e.get(size);
                    calendar.setTimeInMillis(c1Var.f39025b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(v51.q(LocaleController.formatDateChat(c1Var.f39025b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f39070n;
                    int i14 = g.f39048a;
                    v51 J = v51.J(g.class);
                    J.f29055z = 3;
                    J.f29047q = false;
                    J.H = c1Var;
                    J.f29043m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f39069f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f39025b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(v51.q(LocaleController.formatDateChat(c1Var2.f39025b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f39070n;
                int i17 = g.f39048a;
                v51 J2 = v51.J(g.class);
                J2.f29055z = 3;
                J2.f29047q = false;
                J2.H = c1Var2;
                J2.f29043m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(v51.n(32));
                arrayList.add(v51.n(32));
                arrayList.add(v51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(v51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(v51 v51Var, View view) {
        if (v51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((c1) v51Var.H);
        }
    }

    @Override
    public final boolean X(v51 v51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f19045d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(h6.f19449z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f39071r = numberTextView;
        numberTextView.setTextSize(18);
        this.f39071r.setTypeface(AndroidUtilities.bold());
        this.f39071r.setTextColor(getThemedColor(h6.f19430y8));
        this.f39071r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f39071r, y5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        ix0 ix0Var = new ix0(context, null, 1, null);
        this.f39073w = ix0Var;
        if (TextUtils.isEmpty(this.f39070n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        ix0Var.d.setText(LocaleController.getString(i10));
        this.f39073w.e.setVisibility(8);
        this.f39073w.e(false, false);
        this.f39073w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f39073w, y5.c(-1.0f, -1));
        this.f26364a.setEmptyView(this.f39073w);
        this.f26364a.j(new ug0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f19045d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
