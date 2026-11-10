package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class ts extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Components.pj0 f50330a;
    public org.telegram.ui.Components.iy f50331b;
    public rs f50332c;
    public org.telegram.ui.Components.nj d;
    public boolean f50333e;
    public boolean f50334f;
    public final boolean h;
    public boolean f50335n;
    public ss f50336r;
    public final ArrayList f50337s;

    public ts(ArrayList arrayList, boolean z9) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f50337s = new ArrayList(arrayList);
        }
        this.h = z9;
    }

    public static org.telegram.ui.Cells.w9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.id.f23161a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.id.f23161a0) {
            f11 = 16.0f;
        }
        w9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        e5 e5Var = new e5();
        e5Var.f45134b = new os(0, w9Var);
        w9Var.addOnAttachStateChangeListener(e5Var);
        return w9Var;
    }

    public static SpannableStringBuilder a0(ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.id.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.hy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.f48826a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131752134, null));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.t6.l(lVar, 1, i7, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.f28208u8, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 22));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.s().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 9);
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.actionBar.K(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false), true);
        this.actionBar.K(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f50334f = false;
        this.f50333e = false;
        rs rsVar = new rs(this, context, this.f50337s, this.f50335n);
        this.f50332c = rsVar;
        this.d = new org.telegram.ui.Components.nj(this, context, rsVar.f49565s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f50331b = iyVar;
        iyVar.c();
        this.f50331b.setShowAtCenter(true);
        this.f50331b.setText(org.telegram.messenger.id.M0(2131748167, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f50330a = pj0Var;
        pj0Var.setSectionsType(3);
        this.f50330a.setEmptyView(this.f50331b);
        this.f50330a.setVerticalScrollBarEnabled(false);
        this.f50330a.setFastScrollEnabled(0);
        this.f50330a.setFastScrollVisible(true);
        this.f50330a.setLayoutManager(new v4.b0(1, false));
        this.f50330a.setAdapter(this.f50332c);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f50330a;
        if (!org.telegram.messenger.id.f23161a0) {
            i10 = 2;
        }
        pj0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f50330a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f50331b, c8.ha.c(-1.0f, -1));
        this.f50330a.setOnItemClickListener(new h(this, 7));
        this.f50330a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50330a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28038l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50330a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28056m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50330a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28073n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50331b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        rs rsVar = this.f50332c;
        if (rsVar != null) {
            rsVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.K(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false), true);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                lVar2.K(org.telegram.ui.ActionBar.m6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f50330a;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.f50330a.getFastScroll() != null) {
                    this.f50330a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
