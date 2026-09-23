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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y51;
import w7.x5;
public final class g1 extends y51 {
    public final Utilities.Callback d;
    public boolean h;
    public String f38702n;
    public NumberTextView f38703r;
    public org.telegram.ui.ActionBar.v0 v;
    public xw0 f38705w;
    public ArrayList e = d1.a(new ii.q1(this, 4));
    public final ArrayList f38701f = new ArrayList();
    public final HashSet f38704s = new HashSet();

    public g1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, v51 v51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f38702n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.e.get(size);
                    calendar.setTimeInMillis(c1Var.f38669b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(h51.q(LocaleController.formatDateChat(c1Var.f38669b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f38702n;
                    int i14 = g.f38700a;
                    h51 J = h51.J(g.class);
                    J.f24520z = 3;
                    J.f24512q = false;
                    J.H = c1Var;
                    J.f24508m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f38701f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f38669b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(h51.q(LocaleController.formatDateChat(c1Var2.f38669b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f38702n;
                int i17 = g.f38700a;
                h51 J2 = h51.J(g.class);
                J2.f24520z = 3;
                J2.f24512q = false;
                J2.H = c1Var2;
                J2.f24508m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(h51.n(32));
                arrayList.add(h51.n(32));
                arrayList.add(h51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(h51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(h51 h51Var, View view) {
        if (h51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((c1) h51Var.H);
        }
    }

    @Override
    public final boolean X(h51 h51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f18789d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(h6.f19191z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f38703r = numberTextView;
        numberTextView.setTextSize(18);
        this.f38703r.setTypeface(AndroidUtilities.bold());
        this.f38703r.setTextColor(getThemedColor(h6.f19172y8));
        this.f38703r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f38703r, x5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        xw0 xw0Var = new xw0(context, null, 1, null);
        this.f38705w = xw0Var;
        if (TextUtils.isEmpty(this.f38702n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        xw0Var.d.setText(LocaleController.getString(i10));
        this.f38705w.e.setVisibility(8);
        this.f38705w.e(false, false);
        this.f38705w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f38705w, x5.c(-1.0f, -1));
        this.f30163a.setEmptyView(this.f38705w);
        this.f30163a.j(new kg0(this, 10));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f18789d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
