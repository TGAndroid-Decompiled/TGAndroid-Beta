package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class rt extends org.telegram.ui.ActionBar.k2 {
    public org.telegram.ui.Components.tk0 f41280a;
    public org.telegram.ui.Components.xy f41281b;
    public pt f41282c;
    public org.telegram.ui.Components.pj d;
    public boolean e;
    public boolean f41283f;
    public final boolean h;
    public boolean f41284n;
    public qt f41285r;
    public final ArrayList f41286s;

    public rt(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f41286s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.x9 Y(Context context) {
        float f7;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        float f10 = 12.0f;
        if (org.telegram.messenger.cd.X) {
            f7 = 16.0f;
        } else {
            f7 = 12.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        if (!org.telegram.messenger.cd.X) {
            f10 = 16.0f;
        }
        x9Var.setPadding(L, 0, org.telegram.messenger.i0.L(f10), 0);
        d5 d5Var = new d5();
        d5Var.f36618b = new mt(0, x9Var);
        x9Var.addOnAttachStateChangeListener(d5Var);
        return x9Var;
    }

    public static SpannableStringBuilder Z(nt ntVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = org.telegram.messenger.cd.E0(ntVar.d);
        if (E0 != null) {
            spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wy(1), E0.length(), E0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ntVar.f40047a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131752134, null));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        int i11 = 1;
        org.telegram.ui.ActionBar.a7.m(lVar, 1, i10, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21244u8, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, i10, null);
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 13));
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 9);
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.actionBar.I(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f41283f = false;
        this.e = false;
        pt ptVar = new pt(this, context, this.f41286s, this.f41284n);
        this.f41282c = ptVar;
        this.d = new org.telegram.ui.Components.pj(this, context, ptVar.f40783s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f41281b = xyVar;
        xyVar.c();
        this.f41281b.setShowAtCenter(true);
        this.f41281b.setText(org.telegram.messenger.cd.L0(2131748183, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f41280a = tk0Var;
        tk0Var.setSectionsType(3);
        this.f41280a.setEmptyView(this.f41281b);
        this.f41280a.setVerticalScrollBarEnabled(false);
        this.f41280a.setFastScrollEnabled(0);
        this.f41280a.setFastScrollVisible(true);
        this.f41280a.setLayoutManager(new s4.a0(1, false));
        this.f41280a.setAdapter(this.f41282c);
        org.telegram.ui.Components.tk0 tk0Var2 = this.f41280a;
        if (!org.telegram.messenger.cd.X) {
            i11 = 2;
        }
        tk0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f41280a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f41281b, w7.b6.c(-1.0f, -1));
        this.f41280a.setOnItemClickListener(new g(this, 7));
        this.f41280a.setOnScrollListener(new h3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41280a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41280a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21096m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41280a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21116n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41281b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20911c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        pt ptVar = this.f41282c;
        if (ptVar != null) {
            ptVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.I(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false), true);
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                lVar2.I(org.telegram.ui.ActionBar.t6.x0(null, i10, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            }
            org.telegram.ui.Components.tk0 tk0Var = this.f41280a;
            if (tk0Var != null) {
                tk0Var.x1();
                if (this.f41280a.getFastScroll() != null) {
                    this.f41280a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
