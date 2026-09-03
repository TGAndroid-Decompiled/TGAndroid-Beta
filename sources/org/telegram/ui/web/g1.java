package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.ll0;
public final class g1 extends b61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f39450n;
    public NumberTextView f39451r;
    public org.telegram.ui.ActionBar.w0 v;
    public zw0 f39453w;
    public ArrayList e = e1.a(new a1(this, 1));
    public final ArrayList f39449f = new ArrayList();
    public final HashSet f39452s = new HashSet();

    public g1(org.telegram.ui.d0 d0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    public static org.telegram.ui.ActionBar.k Y(g1 g1Var) {
        return g1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k Z(g1 g1Var) {
        return g1Var.actionBar;
    }

    @Override
    public final void U(ArrayList arrayList, w51 w51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f39450n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) this.e.get(size);
                    calendar.setTimeInMillis(d1Var.f39423b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(i51.q(LocaleController.formatDateChat(d1Var.f39423b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f39450n;
                    int i14 = g.f39448a;
                    i51 J = i51.J(g.class);
                    J.f25598z = 3;
                    J.f25590q = false;
                    J.H = d1Var;
                    J.f25586m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f39449f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                d1 d1Var2 = (d1) arrayList3.get(size2);
                calendar.setTimeInMillis(d1Var2.f39423b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(i51.q(LocaleController.formatDateChat(d1Var2.f39423b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f39450n;
                int i17 = g.f39448a;
                i51 J2 = i51.J(g.class);
                J2.f25598z = 3;
                J2.f25590q = false;
                J2.H = d1Var2;
                J2.f25586m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(i51.n(32));
                arrayList.add(i51.n(32));
                arrayList.add(i51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(i51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(i51 i51Var, View view) {
        if (i51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.d.run((d1) i51Var.H);
        }
    }

    @Override
    public final boolean X(i51 i51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = j6.f19881d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(j6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(j6.f20275z8), false);
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 26));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f39451r = numberTextView;
        numberTextView.setTextSize(18);
        this.f39451r.setTypeface(AndroidUtilities.bold());
        this.f39451r.setTextColor(getThemedColor(j6.f20258y8));
        this.f39451r.setOnTouchListener(new oh.d(2));
        j10.addView(this.f39451r, b6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new f1(this);
        this.v = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        zw0 zw0Var = new zw0(context, null, 1, null);
        this.f39453w = zw0Var;
        if (TextUtils.isEmpty(this.f39450n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        zw0Var.d.setText(LocaleController.getString(i10));
        this.f39453w.e.setVisibility(8);
        this.f39453w.e(false, false);
        this.f39453w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f39453w, b6.c(-1.0f, -1));
        this.f23568a.setEmptyView(this.f39453w);
        this.f23568a.j(new mb0(this, 11));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f19881d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
