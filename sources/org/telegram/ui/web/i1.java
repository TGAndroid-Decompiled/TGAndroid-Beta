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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.o81;
import w7.x5;
public final class i1 extends y51 {
    public final Utilities.Callback d;
    public boolean h;
    public String f42151n;
    public NumberTextView f42152r;
    public org.telegram.ui.ActionBar.v0 v;
    public xw0 f42154w;
    public ArrayList f42149e = f1.a(new b1(this, 1));
    public final ArrayList f42150f = new ArrayList();
    public final HashSet f42153s = new HashSet();

    public i1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, v51 v51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f42151n)) {
            ArrayList arrayList2 = this.f42149e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) this.f42149e.get(size);
                    calendar.setTimeInMillis(e1Var.f42104b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(h51.q(LocaleController.formatDateChat(e1Var.f42104b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f42151n;
                    int i14 = h.f42127a;
                    h51 J = h51.J(h.class);
                    J.f26634z = 3;
                    J.f26626q = false;
                    J.H = e1Var;
                    J.f26622m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f42150f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                e1 e1Var2 = (e1) arrayList3.get(size2);
                calendar.setTimeInMillis(e1Var2.f42104b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(h51.q(LocaleController.formatDateChat(e1Var2.f42104b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f42151n;
                int i17 = h.f42127a;
                h51 J2 = h51.J(h.class);
                J2.f26634z = 3;
                J2.f26626q = false;
                J2.H = e1Var2;
                J2.f26622m = str2;
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
        if (h51Var.G(h.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((e1) h51Var.H);
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
        int i11 = j6.f20690d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(j6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(j6.f21090z8), false);
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 10));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f42152r = numberTextView;
        numberTextView.setTextSize(18);
        this.f42152r.setTypeface(AndroidUtilities.bold());
        this.f42152r.setTextColor(getThemedColor(j6.f21071y8));
        this.f42152r.setOnTouchListener(new ci.d(2));
        j3.addView(this.f42152r, x5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new h1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        xw0 xw0Var = new xw0(context, null, 1, null);
        this.f42154w = xw0Var;
        if (TextUtils.isEmpty(this.f42151n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        xw0Var.d.setText(LocaleController.getString(i10));
        this.f42154w.f32782e.setVisibility(8);
        this.f42154w.e(false, false);
        this.f42154w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f42154w, x5.c(-1.0f, -1));
        this.f32876a.setEmptyView(this.f42154w);
        this.f32876a.j(new lb0(this, 11));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f20690d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
