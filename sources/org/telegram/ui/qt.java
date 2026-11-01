package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class qt extends org.telegram.ui.ActionBar.k2 {
    public org.telegram.ui.Components.uk0 f40892a;
    public org.telegram.ui.Components.xy f40893b;
    public ot f40894c;
    public org.telegram.ui.Components.pj d;
    public boolean e;
    public boolean f40895f;
    public final boolean h;
    public boolean f40896n;
    public pt f40897r;
    public final ArrayList f40898s;

    public qt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f40898s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.x9 Z(Context context) {
        float f7;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        float f10 = 12.0f;
        if (org.telegram.messenger.dd.X) {
            f7 = 16.0f;
        } else {
            f7 = 12.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        if (!org.telegram.messenger.dd.X) {
            f10 = 16.0f;
        }
        x9Var.setPadding(L, 0, org.telegram.messenger.i0.L(f10), 0);
        d5 d5Var = new d5();
        d5Var.f36486b = new lt(0, x9Var);
        x9Var.addOnAttachStateChangeListener(d5Var);
        return x9Var;
    }

    public static SpannableStringBuilder a0(mt mtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = org.telegram.messenger.dd.E0(mtVar.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wy(1), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) mtVar.f39611a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131752134, null));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        int i11 = 1;
        org.telegram.ui.ActionBar.a7.m(lVar, 1, i10, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21245u8, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, i10, null);
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 13));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 9);
        a2.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.actionBar.I(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f40895f = false;
        this.e = false;
        ot otVar = new ot(this, context, this.f40898s, this.f40896n);
        this.f40894c = otVar;
        this.d = new org.telegram.ui.Components.pj(this, context, otVar.f40264s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f40893b = xyVar;
        xyVar.c();
        this.f40893b.setShowAtCenter(true);
        this.f40893b.setText(org.telegram.messenger.dd.L0(2131748183, null));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f40892a = uk0Var;
        uk0Var.setSectionsType(3);
        this.f40892a.setEmptyView(this.f40893b);
        this.f40892a.setVerticalScrollBarEnabled(false);
        this.f40892a.setFastScrollEnabled(0);
        this.f40892a.setFastScrollVisible(true);
        this.f40892a.setLayoutManager(new s4.a0(1, false));
        this.f40892a.setAdapter(this.f40894c);
        org.telegram.ui.Components.uk0 uk0Var2 = this.f40892a;
        if (!org.telegram.messenger.dd.X) {
            i11 = 2;
        }
        uk0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f40892a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f40893b, w7.b6.c(-1.0f, -1));
        this.f40892a.setOnItemClickListener(new g(this, 7));
        this.f40892a.setOnScrollListener(new h3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40892a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21078l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40892a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21097m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40892a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21117n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40893b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ot otVar = this.f40894c;
        if (otVar != null) {
            otVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.I(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false), true);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                lVar2.I(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            }
            org.telegram.ui.Components.uk0 uk0Var = this.f40892a;
            if (uk0Var != null) {
                uk0Var.x1();
                if (this.f40892a.getFastScroll() != null) {
                    this.f40892a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
