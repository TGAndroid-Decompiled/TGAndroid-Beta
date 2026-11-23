package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class ts extends org.telegram.ui.ActionBar.g2 {
    public org.telegram.ui.Components.ek0 f52462a;
    public org.telegram.ui.Components.sy f52463b;
    public rs f52464c;
    public org.telegram.ui.Components.dk d;
    public boolean f52465e;
    public boolean f52466f;
    public final boolean h;
    public boolean f52467n;
    public ss f52468r;
    public final ArrayList f52469s;

    public ts(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f52469s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.w9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.gd.f24314a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.gd.f24314a0) {
            f11 = 16.0f;
        }
        w9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        e5 e5Var = new e5();
        e5Var.f47435b = new os(0, w9Var);
        w9Var.addOnAttachStateChangeListener(e5Var);
        return w9Var;
    }

    public static SpannableStringBuilder a0(ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.gd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.ry(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.f51135a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131752122, null));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.u6.l(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.f29769u8, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new y7(this, 25));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232491);
        a10.O();
        a10.I = new bi.x1(this, 10);
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.actionBar.L(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false), true);
        this.actionBar.L(org.telegram.ui.ActionBar.n6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f52466f = false;
        this.f52465e = false;
        rs rsVar = new rs(this, context, this.f52469s, this.f52467n);
        this.f52464c = rsVar;
        this.d = new org.telegram.ui.Components.dk(this, context, rsVar.f51875s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.f52463b = syVar;
        syVar.c();
        this.f52463b.setShowAtCenter(true);
        this.f52463b.setText(org.telegram.messenger.gd.N0(2131747974, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52462a = ek0Var;
        ek0Var.setSectionsType(3);
        this.f52462a.setEmptyView(this.f52463b);
        this.f52462a.setVerticalScrollBarEnabled(false);
        this.f52462a.setFastScrollEnabled(0);
        this.f52462a.setFastScrollVisible(true);
        this.f52462a.setLayoutManager(new v4.c0(1, false));
        this.f52462a.setAdapter(this.f52464c);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f52462a;
        if (!org.telegram.messenger.gd.f24314a0) {
            i10 = 2;
        }
        ek0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f52462a, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.f52463b, c8.na.c(-1.0f, -1));
        this.f52462a.setOnItemClickListener(new h(this, 7));
        this.f52462a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52462a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29599l7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52462a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29617m7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52462a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29634n7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52463b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        rs rsVar = this.f52464c;
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
                kVar.L(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                kVar2.L(org.telegram.ui.ActionBar.n6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f52462a;
            if (ek0Var != null) {
                ek0Var.x1();
                if (this.f52462a.getFastScroll() != null) {
                    this.f52462a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
