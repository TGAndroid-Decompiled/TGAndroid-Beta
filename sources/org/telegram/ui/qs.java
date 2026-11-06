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
    public org.telegram.ui.Components.pj0 f49300a;
    public org.telegram.ui.Components.iy f49301b;
    public os f49302c;
    public org.telegram.ui.Components.oj d;
    public boolean f49303e;
    public boolean f49304f;
    public final boolean h;
    public boolean f49305n;
    public ps f49306r;
    public final ArrayList f49307s;

    public qs(ArrayList arrayList, boolean z9) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f49307s = new ArrayList(arrayList);
        }
        this.h = z9;
    }

    public static org.telegram.ui.Cells.w9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.hd.f22878a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.hd.f22878a0) {
            f11 = 16.0f;
        }
        w9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        e5 e5Var = new e5();
        e5Var.f45200b = new ls(0, w9Var);
        w9Var.addOnAttachStateChangeListener(e5Var);
        return w9Var;
    }

    public static SpannableStringBuilder a0(ms msVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.hd.F0(msVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.hy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) msVar.f47869a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752134, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28167u8, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 22));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 9);
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28241y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f49304f = false;
        this.f49303e = false;
        os osVar = new os(this, context, this.f49307s, this.f49305n);
        this.f49302c = osVar;
        this.d = new org.telegram.ui.Components.oj(this, context, osVar.f48537s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f49301b = iyVar;
        iyVar.c();
        this.f49301b.setShowAtCenter(true);
        this.f49301b.setText(org.telegram.messenger.hd.M0(2131748166, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f49300a = pj0Var;
        pj0Var.setSectionsType(3);
        this.f49300a.setEmptyView(this.f49301b);
        this.f49300a.setVerticalScrollBarEnabled(false);
        this.f49300a.setFastScrollEnabled(0);
        this.f49300a.setFastScrollVisible(true);
        this.f49300a.setLayoutManager(new v4.b0(1, false));
        this.f49300a.setAdapter(this.f49302c);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f49300a;
        if (!org.telegram.messenger.hd.f22878a0) {
            i10 = 2;
        }
        pj0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f49300a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f49301b, c8.ha.c(-1.0f, -1));
        this.f49300a.setOnItemClickListener(new h(this, 7));
        this.f49300a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49300a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27997l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49300a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28015m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49300a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28032n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49301b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27832c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        os osVar = this.f49302c;
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
                kVar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28241y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.k6.G6;
                kVar2.I(org.telegram.ui.ActionBar.k6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f49300a;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.f49300a.getFastScroll() != null) {
                    this.f49300a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
