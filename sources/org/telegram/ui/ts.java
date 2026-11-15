package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class ts extends org.telegram.ui.ActionBar.e2 {
    public org.telegram.ui.Components.uj0 f51658a;
    public org.telegram.ui.Components.ny f51659b;
    public rs f51660c;
    public org.telegram.ui.Components.vj d;
    public boolean f51661e;
    public boolean f51662f;
    public final boolean h;
    public boolean f51663n;
    public ss f51664r;
    public final ArrayList f51665s;

    public ts(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f51665s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.v9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.hd.f24104a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.hd.f24104a0) {
            f11 = 16.0f;
        }
        v9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        e5 e5Var = new e5();
        e5Var.f46554b = new os(0, v9Var);
        v9Var.addOnAttachStateChangeListener(e5Var);
        return v9Var;
    }

    public static SpannableStringBuilder a0(ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.hd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.my(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.f50349a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752134, null));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.q6.l(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.f29167u8, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 23));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232487);
        a10.O();
        a10.I = new kg.x1(this, 9);
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.actionBar.L(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false), true);
        this.actionBar.L(org.telegram.ui.ActionBar.j6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f51662f = false;
        this.f51661e = false;
        rs rsVar = new rs(this, context, this.f51665s, this.f51663n);
        this.f51660c = rsVar;
        this.d = new org.telegram.ui.Components.vj(this, context, rsVar.f51008s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.f51659b = nyVar;
        nyVar.c();
        this.f51659b.setShowAtCenter(true);
        this.f51659b.setText(org.telegram.messenger.hd.M0(2131748167, null));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f51658a = uj0Var;
        uj0Var.setSectionsType(3);
        this.f51658a.setEmptyView(this.f51659b);
        this.f51658a.setVerticalScrollBarEnabled(false);
        this.f51658a.setFastScrollEnabled(0);
        this.f51658a.setFastScrollVisible(true);
        this.f51658a.setLayoutManager(new v4.b0(1, false));
        this.f51658a.setAdapter(this.f51660c);
        org.telegram.ui.Components.uj0 uj0Var2 = this.f51658a;
        if (!org.telegram.messenger.hd.f24104a0) {
            i10 = 2;
        }
        uj0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f51658a, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.f51659b, c8.ja.c(-1.0f, -1));
        this.f51658a.setOnItemClickListener(new h(this, 7));
        this.f51658a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51658a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28997l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51658a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29015m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51658a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29032n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51659b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        rs rsVar = this.f51660c;
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
                kVar.L(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.j6.G6;
                kVar2.L(org.telegram.ui.ActionBar.j6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
            }
            org.telegram.ui.Components.uj0 uj0Var = this.f51658a;
            if (uj0Var != null) {
                uj0Var.x1();
                if (this.f51658a.getFastScroll() != null) {
                    this.f51658a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
