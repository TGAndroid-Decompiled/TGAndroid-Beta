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
    public org.telegram.ui.Components.pj0 f49825a;
    public v4.b0 f49826b;
    public rt0 f49827c;
    public org.telegram.ui.Components.iy d;
    public int f49828e;
    public int f49829f;
    public int h;
    public int f49830n;
    public int f49831r;
    public int f49832s;
    public int f49833w;
    public int f49834x;
    public final boolean f49835y;

    public st0() {
        super(null);
        this.D = 1;
        this.f49835y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z9;
        boolean z10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
        int i7 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false)));
        int i10 = this.D;
        if (i10 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        H.l(0, org.telegram.messenger.hd.M0(2131743912, null), new qn0(14, this, l10), z9);
        if (i10 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            i7 = 2131232415;
        }
        H.m(i7, new qt0(this, l10), org.telegram.messenger.hd.M0(2131746320, null), z10, true);
        H.S = 190;
        H.Z();
    }

    public final void a0() {
        this.f49828e = 0;
        this.f49829f = -1;
        this.f49830n = -1;
        this.h = -1;
        this.f49834x = -1;
        if (!this.f49835y || getMessagesController().H0 >= 0) {
            int i7 = this.f49828e;
            int i10 = i7 + 1;
            this.f49828e = i10;
            this.f49829f = i7;
            int i11 = this.D;
            if (i11 == 1) {
                this.f49828e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().G0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f49828e;
                        this.f49828e = i12 + 1;
                        this.f49830n = i12;
                    }
                    int i13 = this.f49828e;
                    this.f49831r = i13;
                    int i14 = i13 + size;
                    this.f49832s = i14;
                    int i15 = i14 + 1;
                    this.f49828e = i15;
                    this.f49833w = i14;
                    if (i11 != 1) {
                        this.f49828e = i14 + 2;
                        this.f49834x = i15;
                    }
                } else {
                    this.f49830n = -1;
                    this.f49831r = -1;
                    this.f49832s = -1;
                    this.f49833w = -1;
                    this.f49834x = -1;
                }
            } else {
                throw null;
            }
        }
        rt0 rt0Var = this.f49827c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28183v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28164u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28013m6));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = 2;
        int i10 = this.D;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753681, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131750730, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748289, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.d = iyVar;
        if (i10 == 1) {
            iyVar.setText(org.telegram.messenger.hd.M0(2131748238, null));
        } else {
            iyVar.setText(org.telegram.messenger.hd.M0(2131748222, null));
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f49825a = pj0Var;
        pj0Var.r1();
        this.f49825a.setItemSelectorColorProvider(new pt0(this));
        this.f49825a.setSectionsDrawBackground(true);
        this.f49825a.setEmptyView(this.d);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f49825a;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f49826b = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        this.f49825a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f49825a;
        rt0 rt0Var = new rt0(this, context);
        this.f49827c = rt0Var;
        pj0Var3.setAdapter(rt0Var);
        org.telegram.ui.Components.pj0 pj0Var4 = this.f49825a;
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 1;
        }
        pj0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f49825a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f49825a.setOnItemClickListener(new h(this, 27));
        this.f49825a.setOnItemLongClickListener(new pt0(this));
        if (i10 == 1) {
            this.f49825a.setOnScrollListener(new g3(this, 27));
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
        if (i7 == org.telegram.messenger.qs.f25046r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (pj0Var = this.f49825a) != null) {
                int childCount = pj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f49825a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f24985g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f49825a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49825a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27831c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27922h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49825a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28240y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49825a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28030n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25046r);
        if (this.D == 1) {
            org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f24985g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25046r);
        if (this.D == 1) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f24985g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rt0 rt0Var = this.f49827c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.iy iyVar = this.d;
            if (iyVar != null) {
                iyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h6, false));
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
