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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.t61;
public final class f1 extends m71 {
    public final Utilities.Callback e;
    public boolean f45228n;
    public String f45229r;
    public NumberTextView f45230s;
    public org.telegram.ui.ActionBar.w0 f45231w;
    public ey0 f45232x;
    public ArrayList f45227f = c1.a(new ig.o(this, 14));
    public final ArrayList h = new ArrayList();
    public final HashSet v = new HashSet();

    public f1(org.telegram.ui.a0 a0Var, Utilities.Callback callback) {
        this.e = callback;
    }

    @Override
    public final void V(ArrayList arrayList, j71 j71Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i10 = 5;
        int i11 = 2;
        if (TextUtils.isEmpty(this.f45229r)) {
            ArrayList arrayList2 = this.f45227f;
            if (arrayList2 != null) {
                int i12 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    b1 b1Var = (b1) this.f45227f.get(size);
                    calendar.setTimeInMillis(b1Var.f45197b);
                    int i13 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i12 != i13) {
                        arrayList.add(t61.r(LocaleController.formatDateChat(b1Var.f45197b / 1000)));
                        i12 = i13;
                    }
                    String str = this.f45229r;
                    int i14 = h.f45252a;
                    t61 K = t61.K(h.class);
                    K.f32885z = 3;
                    K.f32877q = false;
                    K.H = b1Var;
                    K.f32873m = str;
                    arrayList.add(K);
                }
            }
        } else {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size() - 1;
            int i15 = 0;
            while (size2 >= 0) {
                b1 b1Var2 = (b1) arrayList3.get(size2);
                calendar.setTimeInMillis(b1Var2.f45197b);
                int i16 = calendar.get(i10) + (calendar.get(i11) * 100) + (calendar.get(1) * 10000);
                if (i15 != i16) {
                    arrayList.add(t61.r(LocaleController.formatDateChat(b1Var2.f45197b / 1000)));
                    i15 = i16;
                }
                String str2 = this.f45229r;
                int i17 = h.f45252a;
                t61 K2 = t61.K(h.class);
                K2.f32885z = 3;
                K2.f32877q = false;
                K2.H = b1Var2;
                K2.f32873m = str2;
                arrayList.add(K2);
                size2--;
                i10 = 5;
                i11 = 2;
            }
            if (this.f45228n) {
                arrayList.add(t61.p(32));
                arrayList.add(t61.p(32));
                arrayList.add(t61.p(32));
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(t61.C(null));
        }
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final void X(t61 t61Var, View view) {
        if (t61Var.H(h.class) && !this.actionBar.q()) {
            finishFragment();
            this.e.run((b1) t61Var.H);
        }
    }

    @Override
    public final boolean Y(t61 t61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.fragmentView = super.createView(context);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = y6.f23354d6;
        f7.i(i11, kVar, getResourceProvider());
        this.actionBar.setActionModeColor(y6.x0(null, i11, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = y6.G6;
        f7.m(kVar2, 5, i12, getResourceProvider());
        f7.m(this.actionBar, 3, y6.f23767z8, getResourceProvider());
        f7.m(this.actionBar, 1, i12, getResourceProvider());
        f7.b(this.actionBar, i12, getResourceProvider(), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new d1(this));
        org.telegram.ui.ActionBar.z i13 = this.actionBar.i(null);
        NumberTextView numberTextView = new NumberTextView(i13.getContext());
        this.f45230s = numberTextView;
        numberTextView.setTextSize(18);
        this.f45230s.setTypeface(AndroidUtilities.bold());
        this.f45230s.setTextColor(getThemedColor(y6.f23748y8));
        this.f45230s.setOnTouchListener(new ei.d(2));
        i13.addView(this.f45230s, gb1.q(1.0f, 0, -1, 65, 0, 0));
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.l().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.N();
        c10.H = new e1(this);
        this.f45231w = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f45231w.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = this.f45231w.getSearchField();
        f7.V(searchField, i12, getResourceProvider());
        f7.E(searchField, y6.Si, getResourceProvider());
        f7.w(searchField, i12, getResourceProvider());
        ey0 ey0Var = new ey0(context, null, 1, null);
        this.f45232x = ey0Var;
        if (TextUtils.isEmpty(this.f45229r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        ey0Var.d.setText(LocaleController.getString(i10));
        this.f45232x.e.setVisibility(8);
        this.f45232x.e(false, false);
        this.f45232x.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.f45232x, gb1.g(-1.0f, -1));
        this.f30417a.setEmptyView(this.f45232x);
        this.f30417a.j(new ml(this, 23));
        return this.fragmentView;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(y6.f23354d6)) > 0.721f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setActionModeColor(y6.x0(null, y6.f23354d6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            NumberTextView numberTextView = this.f45230s;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(y6.f23748y8));
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f45231w;
            if (w0Var != null && w0Var.getSearchField() != null) {
                this.f45231w.getSearchField().setCursorColor(getThemedColor(y6.G6));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
