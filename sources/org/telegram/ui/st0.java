package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class st0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final int D;
    public org.telegram.ui.Components.pj0 f49815a;
    public v4.b0 f49816b;
    public rt0 f49817c;
    public org.telegram.ui.Components.jy d;
    public int f49818e;
    public int f49819f;
    public int h;
    public int f49820n;
    public int f49821r;
    public int f49822s;
    public int f49823w;
    public int f49824x;
    public final boolean f49825y;

    public st0() {
        super(null);
        this.D = 1;
        this.f49825y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z9;
        boolean z10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
        int i7 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false)));
        int i10 = this.D;
        if (i10 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        H.l(0, org.telegram.messenger.id.M0(2131743914, null), new qn0(14, this, l10), z9);
        if (i10 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            i7 = 2131232415;
        }
        H.m(i7, new qt0(this, l10), org.telegram.messenger.id.M0(2131746322, null), z10, true);
        H.S = 190;
        H.Z();
    }

    public final void a0() {
        this.f49818e = 0;
        this.f49819f = -1;
        this.f49820n = -1;
        this.h = -1;
        this.f49824x = -1;
        if (!this.f49825y || getMessagesController().H0 >= 0) {
            int i7 = this.f49818e;
            int i10 = i7 + 1;
            this.f49818e = i10;
            this.f49819f = i7;
            int i11 = this.D;
            if (i11 == 1) {
                this.f49818e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().G0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f49818e;
                        this.f49818e = i12 + 1;
                        this.f49820n = i12;
                    }
                    int i13 = this.f49818e;
                    this.f49821r = i13;
                    int i14 = i13 + size;
                    this.f49822s = i14;
                    int i15 = i14 + 1;
                    this.f49818e = i15;
                    this.f49823w = i14;
                    if (i11 != 1) {
                        this.f49818e = i14 + 2;
                        this.f49824x = i15;
                    }
                } else {
                    this.f49820n = -1;
                    this.f49821r = -1;
                    this.f49822s = -1;
                    this.f49823w = -1;
                    this.f49824x = -1;
                }
            } else {
                throw null;
            }
        }
        rt0 rt0Var = this.f49817c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28187v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28168u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28017m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = 2;
        int i10 = this.D;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131753681, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131750730, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748291, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.d = jyVar;
        if (i10 == 1) {
            jyVar.setText(org.telegram.messenger.id.M0(2131748240, null));
        } else {
            jyVar.setText(org.telegram.messenger.id.M0(2131748224, null));
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f49815a = pj0Var;
        pj0Var.r1();
        this.f49815a.setItemSelectorColorProvider(new pt0(this));
        this.f49815a.setSectionsDrawBackground(true);
        this.f49815a.setEmptyView(this.d);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f49815a;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f49816b = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        this.f49815a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f49815a;
        rt0 rt0Var = new rt0(this, context);
        this.f49817c = rt0Var;
        pj0Var3.setAdapter(rt0Var);
        org.telegram.ui.Components.pj0 pj0Var4 = this.f49815a;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 1;
        }
        pj0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f49815a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f49815a.setOnItemClickListener(new h(this, 27));
        this.f49815a.setOnItemLongClickListener(new pt0(this));
        if (i10 == 1) {
            this.f49815a.setOnScrollListener(new g3(this, 27));
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
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.pj0 pj0Var;
        if (i7 == org.telegram.messenger.qs.f25063r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (pj0Var = this.f49815a) != null) {
                int childCount = pj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f49815a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25002g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f49815a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49815a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27852d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27835c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27926h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49815a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28244y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49815a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28034n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25063r);
        if (this.D == 1) {
            org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25002g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25063r);
        if (this.D == 1) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25002g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rt0 rt0Var = this.f49817c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.jy jyVar = this.d;
            if (jyVar != null) {
                jyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27926h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
