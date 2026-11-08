package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class qs extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Components.pj0 f49303a;
    public org.telegram.ui.Components.jy f49304b;
    public os f49305c;
    public org.telegram.ui.Components.oj d;
    public boolean f49306e;
    public boolean f49307f;
    public final boolean h;
    public boolean f49308n;
    public ps f49309r;
    public final ArrayList f49310s;

    public qs(ArrayList arrayList, boolean z9) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f49310s = new ArrayList(arrayList);
        }
        this.h = z9;
    }

    public static org.telegram.ui.Cells.w9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.id.f23157a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.id.f23157a0) {
            f11 = 16.0f;
        }
        w9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        e5 e5Var = new e5();
        e5Var.f45195b = new ls(0, w9Var);
        w9Var.addOnAttachStateChangeListener(e5Var);
        return w9Var;
    }

    public static SpannableStringBuilder a0(ms msVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.id.F0(msVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) msVar.f47869a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131752134, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28170u8, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 22));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 9);
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28244y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f49307f = false;
        this.f49306e = false;
        os osVar = new os(this, context, this.f49310s, this.f49308n);
        this.f49305c = osVar;
        this.d = new org.telegram.ui.Components.oj(this, context, osVar.f48531s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.f49304b = jyVar;
        jyVar.c();
        this.f49304b.setShowAtCenter(true);
        this.f49304b.setText(org.telegram.messenger.id.M0(2131748168, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f49303a = pj0Var;
        pj0Var.setSectionsType(3);
        this.f49303a.setEmptyView(this.f49304b);
        this.f49303a.setVerticalScrollBarEnabled(false);
        this.f49303a.setFastScrollEnabled(0);
        this.f49303a.setFastScrollVisible(true);
        this.f49303a.setLayoutManager(new v4.b0(1, false));
        this.f49303a.setAdapter(this.f49305c);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f49303a;
        if (!org.telegram.messenger.id.f23157a0) {
            i10 = 2;
        }
        pj0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f49303a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f49304b, c8.ha.c(-1.0f, -1));
        this.f49303a.setOnItemClickListener(new h(this, 7));
        this.f49303a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49303a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28000l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49303a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28018m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49303a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28035n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49304b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27835c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        os osVar = this.f49305c;
        if (osVar != null) {
            osVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28244y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.k6.G6;
                kVar2.I(org.telegram.ui.ActionBar.k6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f49303a;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.f49303a.getFastScroll() != null) {
                    this.f49303a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
