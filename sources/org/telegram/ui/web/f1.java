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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w61;
import w7.z5;
public final class f1 extends w61 {
    public final Utilities.Callback d;
    public boolean h;
    public String f42628n;
    public NumberTextView f42629r;
    public org.telegram.ui.ActionBar.u0 v;
    public sx0 f42631w;
    public ArrayList e = c1.a(new ig.l0(this, 10));
    public final ArrayList f42627f = new ArrayList();
    public final HashSet f42630s = new HashSet();

    public f1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, t61 t61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f42628n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    b1 b1Var = (b1) this.e.get(size);
                    calendar.setTimeInMillis(b1Var.f42601b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(g61.q(LocaleController.formatDateChat(b1Var.f42601b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f42628n;
                    int i14 = g.f42642a;
                    g61 J = g61.J(g.class);
                    J.f26510z = 3;
                    J.f26502q = false;
                    J.H = b1Var;
                    J.f26498m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f42627f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                b1 b1Var2 = (b1) arrayList3.get(size2);
                calendar.setTimeInMillis(b1Var2.f42601b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(g61.q(LocaleController.formatDateChat(b1Var2.f42601b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f42628n;
                int i17 = g.f42642a;
                g61 J2 = g61.J(g.class);
                J2.f26510z = 3;
                J2.f26502q = false;
                J2.H = b1Var2;
                J2.f26498m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(g61.n(32));
                arrayList.add(g61.n(32));
                arrayList.add(g61.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(g61.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(g61 g61Var, View view) {
        if (g61Var.G(g.class) && !this.actionBar.t()) {
            finishFragment();
            this.d.run((b1) g61Var.H);
        }
    }

    @Override
    public final boolean X(g61 g61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = h6.f20987d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(h6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = h6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.B(getThemedColor(h6.f21394z8), false);
        this.actionBar.C(getThemedColor(i12), false);
        this.actionBar.C(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new d1(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f42629r = numberTextView;
        numberTextView.setTextSize(18);
        this.f42629r.setTypeface(AndroidUtilities.bold());
        this.f42629r.setTextColor(getThemedColor(h6.f21377y8));
        this.f42629r.setOnTouchListener(new di.d(2));
        j10.addView(this.f42629r, z5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new e1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(h6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        sx0 sx0Var = new sx0(context, null, 1, null);
        this.f42631w = sx0Var;
        if (TextUtils.isEmpty(this.f42628n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        sx0Var.d.setText(LocaleController.getString(i10));
        this.f42631w.e.setVisibility(8);
        this.f42631w.e(false, false);
        this.f42631w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f42631w, z5.c(-1.0f, -1));
        this.f32025a.setEmptyView(this.f42631w);
        this.f32025a.j(new kv(this, 18));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(h6.f20987d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
