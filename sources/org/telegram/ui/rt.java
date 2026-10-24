package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rt extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.lm0 f41223a;
    public org.telegram.ui.Components.tz f41224b;
    public nt f41225c;
    public pt d;
    public boolean e;
    public boolean f41226f;
    public final boolean h;
    public boolean f41227n;
    public qt f41228r;
    public final ArrayList f41229s;

    public rt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f41229s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ca U(Context context) {
        float f7;
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
        float f10 = 12.0f;
        if (LocaleController.isRTL) {
            f7 = 16.0f;
        } else {
            f7 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (!LocaleController.isRTL) {
            f10 = 16.0f;
        }
        caVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f39031a = new jt(0, caVar);
        caVar.addOnAttachStateChangeListener(obj);
        return caVar;
    }

    public static SpannableStringBuilder V(lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.sz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.f39375a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        int i11 = 1;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21502u8, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i10, null);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 19));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.F(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21572y6, false), true);
        this.actionBar.F(org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f41226f = false;
        this.e = false;
        nt ntVar = new nt(this, context, this.f41229s, this.f41227n);
        this.f41225c = ntVar;
        this.d = new pt(this, context, ntVar.f39982s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.f41224b = tzVar;
        tzVar.c();
        this.f41224b.setShowAtCenter(true);
        this.f41224b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f41224b, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f41223a = lm0Var;
        lm0Var.setSectionsType(3);
        this.f41223a.setEmptyView(this.f41224b);
        this.f41223a.setVerticalScrollBarEnabled(false);
        this.f41223a.setFastScrollEnabled(0);
        this.f41223a.setFastScrollVisible(true);
        this.f41223a.setLayoutManager(new s4.b0(1, false));
        this.f41223a.setAdapter(this.f41225c);
        org.telegram.ui.Components.lm0 lm0Var2 = this.f41223a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        lm0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f41223a, w7.z5.c(-1.0f, -1));
        this.f41223a.setOnItemClickListener(new h(this, 7));
        this.f41223a.setOnScrollListener(new j3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41223a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21329l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41223a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21348m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41223a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21368n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41224b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21166c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        nt ntVar = this.f41225c;
        if (ntVar != null) {
            ntVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.F(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21572y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i10 = org.telegram.ui.ActionBar.k6.G6;
                kVar2.F(org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
            org.telegram.ui.Components.lm0 lm0Var = this.f41223a;
            if (lm0Var != null) {
                lm0Var.A1();
                if (this.f41223a.getFastScroll() != null) {
                    this.f41223a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
