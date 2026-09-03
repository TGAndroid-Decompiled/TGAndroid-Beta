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
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.ll0;
public final class f1 extends b61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f42500n;
    public NumberTextView f42501r;
    public org.telegram.ui.ActionBar.w0 v;
    public zw0 f42503w;
    public ArrayList f42498e = c1.a(new d1(this, 0));
    public final ArrayList f42499f = new ArrayList();
    public final HashSet f42502s = new HashSet();

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
    public final void U(ArrayList arrayList, w51 w51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f42500n)) {
            ArrayList arrayList2 = this.f42498e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    b1 b1Var = (b1) this.f42498e.get(size);
                    calendar.setTimeInMillis(b1Var.f42473b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(h51.q(LocaleController.formatDateChat(b1Var.f42473b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f42500n;
                    int i14 = g.f42515a;
                    h51 J = h51.J(g.class);
                    J.f27388z = 3;
                    J.f27380q = false;
                    J.H = b1Var;
                    J.f27376m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f42499f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                b1 b1Var2 = (b1) arrayList3.get(size2);
                calendar.setTimeInMillis(b1Var2.f42473b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(h51.q(LocaleController.formatDateChat(b1Var2.f42473b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f42500n;
                int i17 = g.f42515a;
                h51 J2 = h51.J(g.class);
                J2.f27388z = 3;
                J2.f27380q = false;
                J2.H = b1Var2;
                J2.f27376m = str2;
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
            this.d.run((b1) h51Var.H);
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
        int i11 = k6.f21661d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(k6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = k6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(k6.f22057z8), false);
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 26));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f42501r = numberTextView;
        numberTextView.setTextSize(18);
        this.f42501r.setTypeface(AndroidUtilities.bold());
        this.f42501r.setTextColor(getThemedColor(k6.f22040y8));
        this.f42501r.setOnTouchListener(new s2(1));
        j10.addView(this.f42501r, c6.m(1.0f, 0, -1, 65, 0, 0));
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
        zw0 zw0Var = new zw0(context, null, 1, null);
        this.f42503w = zw0Var;
        if (TextUtils.isEmpty(this.f42500n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        zw0Var.d.setText(LocaleController.getString(i10));
        this.f42503w.f34033e.setVisibility(8);
        this.f42503w.e(false, false);
        this.f42503w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f42503w, c6.c(-1.0f, -1));
        this.f25523a.setEmptyView(this.f42503w);
        this.f25523a.j(new nb0(this, 11));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(k6.f21661d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
