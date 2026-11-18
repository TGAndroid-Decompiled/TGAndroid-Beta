package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class ts extends org.telegram.ui.ActionBar.h2 {
    public org.telegram.ui.Components.ck0 f52340a;
    public org.telegram.ui.Components.ty f52341b;
    public rs f52342c;
    public org.telegram.ui.Components.ck d;
    public boolean f52343e;
    public boolean f52344f;
    public final boolean h;
    public boolean f52345n;
    public ss f52346r;
    public final ArrayList f52347s;

    public ts(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f52347s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.x9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.gd.f24213a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.gd.f24213a0) {
            f11 = 16.0f;
        }
        x9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        e5 e5Var = new e5();
        e5Var.f47065b = new os(0, x9Var);
        x9Var.addOnAttachStateChangeListener(e5Var);
        return x9Var;
    }

    public static SpannableStringBuilder a0(ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.gd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.sy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.f50920a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131752123, null));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.u6.l(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.f29712u8, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new x7(this, 25));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, 2131232488);
        a10.O();
        a10.I = new bi.s1(this, 10);
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        this.actionBar.M(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false), true);
        this.actionBar.M(org.telegram.ui.ActionBar.n6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f52344f = false;
        this.f52343e = false;
        rs rsVar = new rs(this, context, this.f52347s, this.f52345n);
        this.f52342c = rsVar;
        this.d = new org.telegram.ui.Components.ck(this, context, rsVar.f51781s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.f52341b = tyVar;
        tyVar.c();
        this.f52341b.setShowAtCenter(true);
        this.f52341b.setText(org.telegram.messenger.gd.M0(2131747975, null));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f52340a = ck0Var;
        ck0Var.setSectionsType(3);
        this.f52340a.setEmptyView(this.f52341b);
        this.f52340a.setVerticalScrollBarEnabled(false);
        this.f52340a.setFastScrollEnabled(0);
        this.f52340a.setFastScrollVisible(true);
        this.f52340a.setLayoutManager(new v4.c0(1, false));
        this.f52340a.setAdapter(this.f52342c);
        org.telegram.ui.Components.ck0 ck0Var2 = this.f52340a;
        if (!org.telegram.messenger.gd.f24213a0) {
            i10 = 2;
        }
        ck0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f52340a, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.f52341b, c8.ma.c(-1.0f, -1));
        this.f52340a.setOnItemClickListener(new h(this, 7));
        this.f52340a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52340a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29542l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52340a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29560m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52340a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29577n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52341b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29377c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        rs rsVar = this.f52342c;
        if (rsVar != null) {
            rsVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.M(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                kVar2.M(org.telegram.ui.ActionBar.n6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            }
            org.telegram.ui.Components.ck0 ck0Var = this.f52340a;
            if (ck0Var != null) {
                ck0Var.x1();
                if (this.f52340a.getFastScroll() != null) {
                    this.f52340a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
