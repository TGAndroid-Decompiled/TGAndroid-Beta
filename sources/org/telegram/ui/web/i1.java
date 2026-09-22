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
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.o81;
import w7.y5;
public final class i1 extends p61 {
    public final Utilities.Callback e;
    public boolean f38956n;
    public String f38957r;
    public NumberTextView f38958s;
    public org.telegram.ui.ActionBar.v0 f38959w;
    public lx0 f38960x;
    public ArrayList f38955f = f1.a(new b1(this, 1));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public i1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.e = callback;
    }

    @Override
    public final void U(ArrayList arrayList, m61 m61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f38957r)) {
            ArrayList arrayList2 = this.f38955f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) this.f38955f.get(size);
                    calendar.setTimeInMillis(e1Var.f38913b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(y51.q(LocaleController.formatDateChat(e1Var.f38913b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f38957r;
                    int i14 = g.f38924a;
                    y51 J = y51.J(g.class);
                    J.f30531z = 3;
                    J.f30523q = false;
                    J.H = e1Var;
                    J.f30519m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                e1 e1Var2 = (e1) arrayList3.get(size2);
                calendar.setTimeInMillis(e1Var2.f38913b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(y51.q(LocaleController.formatDateChat(e1Var2.f38913b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f38957r;
                int i17 = g.f38924a;
                y51 J2 = y51.J(g.class);
                J2.f30531z = 3;
                J2.f30523q = false;
                J2.H = e1Var2;
                J2.f30519m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.f38956n) {
                arrayList.add(y51.n(32));
                arrayList.add(y51.n(32));
                arrayList.add(y51.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(y51.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(y51 y51Var, View view) {
        if (y51Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.e.run((e1) y51Var.H);
        }
    }

    @Override
    public final boolean X(y51 y51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = j6.f19109d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(j6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = j6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(j6.f19513z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 10));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f38958s = numberTextView;
        numberTextView.setTextSize(18);
        this.f38958s.setTypeface(AndroidUtilities.bold());
        this.f38958s.setTextColor(getThemedColor(j6.f19494y8));
        this.f38958s.setOnTouchListener(new bi.d(2));
        j3.addView(this.f38958s, y5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new h1(this);
        this.f38959w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38959w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f38959w.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(j6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        lx0 lx0Var = new lx0(context, null, 1, null);
        this.f38960x = lx0Var;
        if (TextUtils.isEmpty(this.f38957r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        lx0Var.d.setText(LocaleController.getString(i10));
        this.f38960x.e.setVisibility(8);
        this.f38960x.e(false, false);
        this.f38960x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f38960x, y5.c(-1.0f, -1));
        this.f27268a.setEmptyView(this.f38960x);
        this.f27268a.j(new vb0(this, 12));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(j6.f19109d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
