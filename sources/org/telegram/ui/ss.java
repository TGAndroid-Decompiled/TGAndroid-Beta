package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class ss extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Components.qj0 f49981a;
    public org.telegram.ui.Components.jy f49982b;
    public qs f49983c;
    public org.telegram.ui.Components.oj d;
    public boolean f49984e;
    public boolean f49985f;
    public final boolean h;
    public boolean f49986n;
    public rs f49987r;
    public final ArrayList f49988s;

    public ss(ArrayList arrayList, boolean z9) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f49988s = new ArrayList(arrayList);
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
        e5Var.f45299b = new ns(0, w9Var);
        w9Var.addOnAttachStateChangeListener(e5Var);
        return w9Var;
    }

    public static SpannableStringBuilder a0(os osVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.id.F0(osVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.iy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) osVar.f48510a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131752134, null));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.s6.l(kVar, 1, i7, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 3, org.telegram.ui.ActionBar.l6.f28183u8, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 5, i7, null);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 22));
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.r().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 9);
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.actionBar.J(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false), true);
        this.actionBar.J(org.telegram.ui.ActionBar.l6.x0(null, i7, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        this.f49985f = false;
        this.f49984e = false;
        qs qsVar = new qs(this, context, this.f49988s, this.f49986n);
        this.f49983c = qsVar;
        this.d = new org.telegram.ui.Components.oj(this, context, qsVar.f49184s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.f49982b = jyVar;
        jyVar.c();
        this.f49982b.setShowAtCenter(true);
        this.f49982b.setText(org.telegram.messenger.id.M0(2131748167, null));
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f49981a = qj0Var;
        qj0Var.setSectionsType(3);
        this.f49981a.setEmptyView(this.f49982b);
        this.f49981a.setVerticalScrollBarEnabled(false);
        this.f49981a.setFastScrollEnabled(0);
        this.f49981a.setFastScrollVisible(true);
        this.f49981a.setLayoutManager(new v4.b0(1, false));
        this.f49981a.setAdapter(this.f49983c);
        org.telegram.ui.Components.qj0 qj0Var2 = this.f49981a;
        if (!org.telegram.messenger.id.f23157a0) {
            i10 = 2;
        }
        qj0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f49981a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f49982b, c8.ha.c(-1.0f, -1));
        this.f49981a.setOnItemClickListener(new h(this, 7));
        this.f49981a.setOnScrollListener(new g3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f49981a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28013l7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f49981a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28031m7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f49981a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28048n7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f49982b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27848c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        qs qsVar = this.f49983c;
        if (qsVar != null) {
            qsVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.J(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i7 = org.telegram.ui.ActionBar.l6.G6;
                kVar2.J(org.telegram.ui.ActionBar.l6.x0(null, i7, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
            }
            org.telegram.ui.Components.qj0 qj0Var = this.f49981a;
            if (qj0Var != null) {
                qj0Var.x1();
                if (this.f49981a.getFastScroll() != null) {
                    this.f49981a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
