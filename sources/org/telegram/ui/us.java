package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class us extends org.telegram.ui.ActionBar.g2 {
    public org.telegram.ui.Components.ek0 f52619a;
    public org.telegram.ui.Components.vy f52620b;
    public rs f52621c;
    public org.telegram.ui.Components.ek d;
    public boolean f52622e;
    public boolean f52623f;
    public final boolean h;
    public boolean f52624n;
    public ts f52625r;
    public final ArrayList f52626s;

    public us(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f52626s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.x9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.gd.f24241a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.gd.f24241a0) {
            f11 = 16.0f;
        }
        x9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        e5 e5Var = new e5();
        e5Var.f47138b = new os(0, x9Var);
        x9Var.addOnAttachStateChangeListener(e5Var);
        return x9Var;
    }

    public static SpannableStringBuilder a0(ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.gd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.f50965a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131752122, null));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.t6.l(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.f29696u8, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new x7(this, 25));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232488);
        a10.O();
        a10.I = new bi.w1(this, 10);
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.actionBar.L(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29770y6, false), true);
        this.actionBar.L(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f52623f = false;
        this.f52622e = false;
        rs rsVar = new rs(this, context, this.f52626s, this.f52624n);
        this.f52621c = rsVar;
        this.d = new org.telegram.ui.Components.ek(this, context, rsVar.f51756s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.f52620b = vyVar;
        vyVar.c();
        this.f52620b.setShowAtCenter(true);
        this.f52620b.setText(org.telegram.messenger.gd.N0(2131747974, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52619a = ek0Var;
        ek0Var.setSectionsType(3);
        this.f52619a.setEmptyView(this.f52620b);
        this.f52619a.setVerticalScrollBarEnabled(false);
        this.f52619a.setFastScrollEnabled(0);
        this.f52619a.setFastScrollVisible(true);
        this.f52619a.setLayoutManager(new v4.c0(1, false));
        this.f52619a.setAdapter(this.f52621c);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f52619a;
        if (!org.telegram.messenger.gd.f24241a0) {
            i10 = 2;
        }
        ek0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f52619a, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.f52620b, c8.ma.c(-1.0f, -1));
        this.f52619a.setOnItemClickListener(new h(this, 7));
        this.f52619a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52619a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29526l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52619a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29544m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52619a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29561n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52620b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29361c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        rs rsVar = this.f52621c;
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
                kVar.L(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29770y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                kVar2.L(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f52619a;
            if (ek0Var != null) {
                ek0Var.x1();
                if (this.f52619a.getFastScroll() != null) {
                    this.f52619a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
