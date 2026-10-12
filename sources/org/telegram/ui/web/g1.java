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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.z61;
import w7.a6;
public final class g1 extends c71 {
    public final Utilities.Callback d;
    public boolean h;
    public String f41358n;
    public NumberTextView f41359r;
    public org.telegram.ui.ActionBar.u0 v;
    public wx0 f41361w;
    public ArrayList e = d1.a(new ji.p1(this, 4));
    public final ArrayList f41357f = new ArrayList();
    public final HashSet f41360s = new HashSet();

    public g1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, z61 z61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f41358n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.e.get(size);
                    calendar.setTimeInMillis(c1Var.f41322b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(l61.q(LocaleController.formatDateChat(c1Var.f41322b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f41358n;
                    int i14 = g.f41356a;
                    l61 J = l61.J(g.class);
                    J.f26967z = 3;
                    J.f26959q = false;
                    J.H = c1Var;
                    J.f26955m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f41357f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f41322b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(l61.q(LocaleController.formatDateChat(c1Var2.f41322b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f41358n;
                int i17 = g.f41356a;
                l61 J2 = l61.J(g.class);
                J2.f26967z = 3;
                J2.f26959q = false;
                J2.H = c1Var2;
                J2.f26955m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(l61.n(32));
                arrayList.add(l61.n(32));
                arrayList.add(l61.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(l61.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        if (l61Var.G(g.class) && !this.actionBar.t()) {
            finishFragment();
            this.d.run((c1) l61Var.H);
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = g6.f19901d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(g6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = g6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(g6.f20307z8), false);
        this.actionBar.D(getThemedColor(i12), false);
        this.actionBar.D(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f41359r = numberTextView;
        numberTextView.setTextSize(18);
        this.f41359r.setTypeface(AndroidUtilities.bold());
        this.f41359r.setTextColor(getThemedColor(g6.f20290y8));
        this.f41359r.setOnTouchListener(new ci.d(2));
        j10.addView(this.f41359r, a6.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(g6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        wx0 wx0Var = new wx0(context, null, 1, null);
        this.f41361w = wx0Var;
        if (TextUtils.isEmpty(this.f41358n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        wx0Var.d.setText(LocaleController.getString(i10));
        this.f41361w.e.setVisibility(8);
        this.f41361w.e(false, false);
        this.f41361w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f41361w, a6.d(-1.0f, -1));
        this.f23964a.setEmptyView(this.f41361w);
        this.f23964a.j(new kc0(this, 14));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(g6.f19901d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
