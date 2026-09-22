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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.w81;
import w7.x5;
public final class h1 extends z51 {
    public final Utilities.Callback d;
    public boolean h;
    public String f38974n;
    public NumberTextView f38975r;
    public org.telegram.ui.ActionBar.v0 v;
    public yw0 f38977w;
    public ArrayList e = f1.a(new b1(this, 1));
    public final ArrayList f38973f = new ArrayList();
    public final HashSet f38976s = new HashSet();

    public h1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.d = callback;
    }

    @Override
    public final void U(ArrayList arrayList, w51 w51Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f38974n)) {
            ArrayList arrayList2 = this.e;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    e1 e1Var = (e1) this.e.get(size);
                    calendar.setTimeInMillis(e1Var.f38943b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(i51.q(LocaleController.formatDateChat(e1Var.f38943b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f38974n;
                    int i14 = g.f38953a;
                    i51 J = i51.J(g.class);
                    J.f24913z = 3;
                    J.f24905q = false;
                    J.H = e1Var;
                    J.f24901m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.f38973f;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                e1 e1Var2 = (e1) arrayList3.get(size2);
                calendar.setTimeInMillis(e1Var2.f38943b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(i51.q(LocaleController.formatDateChat(e1Var2.f38943b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f38974n;
                int i17 = g.f38953a;
                i51 J2 = i51.J(g.class);
                J2.f24913z = 3;
                J2.f24905q = false;
                J2.H = e1Var2;
                J2.f24901m = str2;
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
            this.d.run((e1) i51Var.H);
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
        int i11 = i6.f18834d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(i6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = i6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(i6.f19236z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new w81(this, 9));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f38975r = numberTextView;
        numberTextView.setTextSize(18);
        this.f38975r.setTypeface(AndroidUtilities.bold());
        this.f38975r.setTextColor(getThemedColor(i6.f19217y8));
        this.f38975r.setOnTouchListener(new bi.d(2));
        j3.addView(this.f38975r, x5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.v = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.v.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.v.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        yw0 yw0Var = new yw0(context, null, 1, null);
        this.f38977w = yw0Var;
        if (TextUtils.isEmpty(this.f38974n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        yw0Var.d.setText(LocaleController.getString(i10));
        this.f38977w.e.setVisibility(8);
        this.f38977w.e(false, false);
        this.f38977w.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f38977w, x5.c(-1.0f, -1));
        this.f30482a.setEmptyView(this.f38977w);
        this.f30482a.j(new kb0(this, 11));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.f18834d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
