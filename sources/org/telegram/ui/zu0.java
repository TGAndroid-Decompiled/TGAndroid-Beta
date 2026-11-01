package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class zu0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public final int D;
    public org.telegram.ui.Components.uk0 f44094a;
    public s4.a0 f44095b;
    public yu0 f44096c;
    public org.telegram.ui.Components.xy d;
    public int e;
    public int f44097f;
    public int h;
    public int f44098n;
    public int f44099r;
    public int f44100s;
    public int f44101w;
    public int f44102x;
    public final boolean f44103y;

    public zu0() {
        super(null);
        this.D = 1;
        this.f44103y = true;
    }

    public final void Z(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)));
        int i11 = this.D;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, org.telegram.messenger.dd.L0(2131743936, null), new hr0(8, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = 2131232414;
        }
        H.m(i10, new xu0(this, l4), org.telegram.messenger.dd.L0(2131746336, null), z11, true);
        H.S = 190;
        H.Z();
    }

    public final void a0() {
        this.e = 0;
        this.f44097f = -1;
        this.f44098n = -1;
        this.h = -1;
        this.f44102x = -1;
        if (!this.f44103y || getMessagesController().H0 >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f44097f = i10;
            int i12 = this.D;
            if (i12 == 1) {
                this.e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().G0.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.e;
                        this.e = i13 + 1;
                        this.f44098n = i13;
                    }
                    int i14 = this.e;
                    this.f44099r = i14;
                    int i15 = i14 + size;
                    this.f44100s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.f44101w = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f44102x = i16;
                    }
                } else {
                    this.f44098n = -1;
                    this.f44099r = -1;
                    this.f44100s = -1;
                    this.f44101w = -1;
                    this.f44102x = -1;
                }
            } else {
                throw null;
            }
        }
        yu0 yu0Var = this.f44096c;
        if (yu0Var != null) {
            yu0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21260v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21243u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = 2;
        int i11 = this.D;
        if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131753681, null));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131750730, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131748304, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        if (i11 == 1) {
            xyVar.setText(org.telegram.messenger.dd.L0(2131748256, null));
        } else {
            xyVar.setText(org.telegram.messenger.dd.L0(2131748240, null));
        }
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f44094a = uk0Var;
        uk0Var.r1();
        this.f44094a.setItemSelectorColorProvider(new wu0(this));
        this.f44094a.setSectionsDrawBackground(true);
        this.f44094a.setEmptyView(this.d);
        org.telegram.ui.Components.uk0 uk0Var2 = this.f44094a;
        s4.a0 a0Var = new s4.a0(1, false);
        this.f44095b = a0Var;
        uk0Var2.setLayoutManager(a0Var);
        this.f44094a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.uk0 uk0Var3 = this.f44094a;
        yu0 yu0Var = new yu0(this, context);
        this.f44096c = yu0Var;
        uk0Var3.setAdapter(yu0Var);
        org.telegram.ui.Components.uk0 uk0Var4 = this.f44094a;
        if (org.telegram.messenger.dd.X) {
            i10 = 1;
        }
        uk0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f44094a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.f44094a.setOnItemClickListener(new g(this, 27));
        this.f44094a.setOnItemLongClickListener(new wu0(this));
        if (i11 == 1) {
            this.f44094a.setOnScrollListener(new h3(this, 26));
            if (getMessagesController().H0 < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        a0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.uk0 uk0Var;
        if (i10 == org.telegram.messenger.at.f14772r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.wp.D8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (uk0Var = this.f44094a) != null) {
                int childCount = uk0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.f44094a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.e5) {
                        ((org.telegram.ui.Cells.e5) childAt).d(intValue);
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14710g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f44094a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f44094a, 16, new Class[]{org.telegram.ui.Cells.e5.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.p4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f44094a, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21312y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f44094a, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14772r);
        if (this.D == 1) {
            org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14710g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14772r);
        if (this.D == 1) {
            org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14710g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yu0 yu0Var = this.f44096c;
        if (yu0Var != null) {
            yu0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.xy xyVar = this.d;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
