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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.p61;
import w7.x5;
public final class g1 extends f71 {
    public final Utilities.Callback d;
    public boolean h;
    public String f43306n;
    public NumberTextView f43307r;
    public org.telegram.ui.ActionBar.v0 v;
    public ay0 f43309w;
    public ArrayList f43304e = d1.a(new ii.q1(this, 4));
    public final ArrayList f43305f = new ArrayList();
    public final HashSet f43308s = new HashSet();

    public g1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, c71 c71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f43306n)) {
            ArrayList arrayList2 = this.f43304e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    c1 c1Var = (c1) this.f43304e.get(size);
                    calendar.setTimeInMillis(c1Var.f43279b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(p61.q(LocaleController.formatDateChat(c1Var.f43279b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f43306n;
                    int i14 = g.f43303a;
                    p61 J = p61.J(g.class);
                    J.f29747z = 3;
                    J.f29739q = false;
                    J.H = c1Var;
                    J.f29735m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f43305f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                c1 c1Var2 = (c1) arrayList3.get(size2);
                calendar.setTimeInMillis(c1Var2.f43279b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(p61.q(LocaleController.formatDateChat(c1Var2.f43279b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f43306n;
                int i17 = g.f43303a;
                p61 J2 = p61.J(g.class);
                J2.f29747z = 3;
                J2.f29739q = false;
                J2.H = c1Var2;
                J2.f29735m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.h) {
                arrayList.add(p61.n(32));
                arrayList.add(p61.n(32));
                arrayList.add(p61.n(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(p61.B(null));
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void W(p61 p61Var, View view) {
        if (p61Var.G(g.class) && !this.actionBar.t()) {
            finishFragment();
            this.d.run((c1) p61Var.H);
        }
    }

    @Override
    public final boolean X(p61 p61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = i6.f20797d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(i6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = i6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.C(getThemedColor(i6.f21201z8), false);
        this.actionBar.D(getThemedColor(i12), false);
        this.actionBar.D(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new e1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f43307r = numberTextView;
        numberTextView.setTextSize(18);
        this.f43307r.setTypeface(AndroidUtilities.bold());
        this.f43307r.setTextColor(getThemedColor(i6.f21183y8));
        this.f43307r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f43307r, x5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new f1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        ay0 ay0Var = new ay0(context, null, 1, null);
        this.f43309w = ay0Var;
        if (TextUtils.isEmpty(this.f43306n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        ay0Var.d.setText(LocaleController.getString(i10));
        this.f43309w.f24802e.setVisibility(8);
        this.f43309w.e(false, false);
        this.f43309w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f43309w, x5.d(-1.0f, -1));
        this.f26290a.setEmptyView(this.f43309w);
        this.f26290a.j(new mh0(this, 13));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.f20797d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
