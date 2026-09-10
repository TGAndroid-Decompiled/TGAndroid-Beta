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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.b91;
import w7.a6;
public final class h1 extends m61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f37944n;
    public NumberTextView f37945r;
    public org.telegram.ui.ActionBar.w0 v;
    public jx0 f37947w;
    public ArrayList e = f1.a(new ai.b(this, 29));
    public final ArrayList f37943f = new ArrayList();
    public final HashSet f37946s = new HashSet();

    public h1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, j61 j61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f37944n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) this.e.get(size);
                    calendar.setTimeInMillis(e1Var.f37927b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(v51.q(LocaleController.formatDateChat(e1Var.f37927b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f37944n;
                    int i14 = h.f37942a;
                    v51 J = v51.J(h.class);
                    J.f27842z = 3;
                    J.f27834q = false;
                    J.H = e1Var;
                    J.f27830m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f37943f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                e1 e1Var2 = (e1) arrayList3.get(size2);
                calendar.setTimeInMillis(e1Var2.f37927b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(v51.q(LocaleController.formatDateChat(e1Var2.f37927b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f37944n;
                int i17 = h.f37942a;
                v51 J2 = v51.J(h.class);
                J2.f27842z = 3;
                J2.f27834q = false;
                J2.H = e1Var2;
                J2.f27830m = str2;
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
        if (v51Var.G(h.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((e1) v51Var.H);
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
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = j6.f17928d6;
        lVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(j6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = j6.G6;
        lVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(j6.f18327z8), false);
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new b91(this, 9));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f37945r = numberTextView;
        numberTextView.setTextSize(18);
        this.f37945r.setTypeface(AndroidUtilities.bold());
        this.f37945r.setTextColor(getThemedColor(j6.f18308y8));
        this.f37945r.setOnTouchListener(new ai.h(2));
        j3.addView(this.f37945r, a6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        jx0 jx0Var = new jx0(context, null, 1, null);
        this.f37947w = jx0Var;
        if (TextUtils.isEmpty(this.f37944n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        jx0Var.d.setText(LocaleController.getString(i10));
        this.f37947w.e.setVisibility(8);
        this.f37947w.e(false, false);
        this.f37947w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f37947w, a6.c(-1.0f, -1));
        this.f25171a.setEmptyView(this.f37947w);
        this.f25171a.j(new al0(this, 8));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f17928d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
