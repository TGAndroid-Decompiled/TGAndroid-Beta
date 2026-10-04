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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import w7.z5;
public final class h1 extends x61 {
    public final Utilities.Callback f42198e;
    public boolean f42200n;
    public String f42201r;
    public NumberTextView f42202s;
    public org.telegram.ui.ActionBar.v0 f42203w;
    public tx0 f42204x;
    public ArrayList f42199f = e1.a(new ii.q1(this, 4));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public h1(org.telegram.ui.b0 b0Var, Utilities.Callback callback) {
        this.f42198e = callback;
    }

    @Override
    public final void S(ArrayList arrayList, u61 u61Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f42201r)) {
            ArrayList arrayList2 = this.f42199f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    d1 d1Var = (d1) this.f42199f.get(size);
                    calendar.setTimeInMillis(d1Var.f42165b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(g61.q(LocaleController.formatDateChat(d1Var.f42165b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f42201r;
                    int i14 = g.f42184a;
                    g61 J = g61.J(g.class);
                    J.f26682z = 3;
                    J.f26674q = false;
                    J.H = d1Var;
                    J.f26670m = str;
                    arrayList.add(J);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                d1 d1Var2 = (d1) arrayList3.get(size2);
                calendar.setTimeInMillis(d1Var2.f42165b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(g61.q(LocaleController.formatDateChat(d1Var2.f42165b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f42201r;
                int i17 = g.f42184a;
                g61 J2 = g61.J(g.class);
                J2.f26682z = 3;
                J2.f26674q = false;
                J2.H = d1Var2;
                J2.f26670m = str2;
                arrayList.add(J2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.f42200n) {
                arrayList.add(g61.o(32));
                arrayList.add(g61.o(32));
                arrayList.add(g61.o(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(g61.B(null));
        }
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void U(g61 g61Var, View view) {
        if (g61Var.G(g.class) && !this.actionBar.s()) {
            finishFragment();
            this.f42198e.run((d1) g61Var.H);
        }
    }

    @Override
    public final boolean W(g61 g61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = i6.f20818d6;
        kVar.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setActionModeColor(i6.w0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = i6.G6;
        kVar2.setTitleColor(getThemedColor(i12));
        this.actionBar.A(getThemedColor(i6.f21226z8), false);
        this.actionBar.B(getThemedColor(i12), false);
        this.actionBar.B(getThemedColor(i12), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new f1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f42202s = numberTextView;
        numberTextView.setTextSize(18);
        this.f42202s.setTypeface(AndroidUtilities.bold());
        this.f42202s.setTextColor(getThemedColor(i6.f21207y8));
        this.f42202s.setOnTouchListener(new bi.d(2));
        j3.addView(this.f42202s, z5.m(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new g1(this);
        this.f42203w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42203w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f42203w.getSearchField();
        searchField.setTextColor(getThemedColor(i12));
        searchField.setHintTextColor(getThemedColor(i6.Si));
        searchField.setCursorColor(getThemedColor(i12));
        tx0 tx0Var = new tx0(context, null, 1, null);
        this.f42204x = tx0Var;
        if (TextUtils.isEmpty(this.f42201r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        tx0Var.d.setText(LocaleController.getString(i10));
        this.f42204x.f31195e.setVisibility(8);
        this.f42204x.e(false, false);
        this.f42204x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f42204x, z5.c(-1.0f, -1));
        this.f32725a.setEmptyView(this.f42204x);
        this.f32725a.j(new xb0(this, 12));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(i6.f20818d6)) > 0.721f) {
            return true;
        }
        return false;
    }
}
