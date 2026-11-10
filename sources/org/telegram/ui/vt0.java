package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class vt0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final int D;
    public org.telegram.ui.Components.pj0 f50788a;
    public v4.b0 f50789b;
    public ut0 f50790c;
    public org.telegram.ui.Components.iy d;
    public int f50791e;
    public int f50792f;
    public int h;
    public int f50793n;
    public int f50794r;
    public int f50795s;
    public int f50796w;
    public int f50797x;
    public final boolean f50798y;

    public vt0() {
        super(null);
        this.D = 1;
        this.f50798y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z9;
        boolean z10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
        int i7 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)));
        int i10 = this.D;
        if (i10 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        H.l(0, org.telegram.messenger.id.M0(2131743911, null), new tn0(15, this, l10), z9);
        if (i10 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            i7 = 2131232415;
        }
        H.m(i7, new tt0(this, l10), org.telegram.messenger.id.M0(2131746321, null), z10, true);
        H.S = 190;
        H.Z();
    }

    public final void a0() {
        this.f50791e = 0;
        this.f50792f = -1;
        this.f50793n = -1;
        this.h = -1;
        this.f50797x = -1;
        if (!this.f50798y || getMessagesController().H0 >= 0) {
            int i7 = this.f50791e;
            int i10 = i7 + 1;
            this.f50791e = i10;
            this.f50792f = i7;
            int i11 = this.D;
            if (i11 == 1) {
                this.f50791e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().G0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f50791e;
                        this.f50791e = i12 + 1;
                        this.f50793n = i12;
                    }
                    int i13 = this.f50791e;
                    this.f50794r = i13;
                    int i14 = i13 + size;
                    this.f50795s = i14;
                    int i15 = i14 + 1;
                    this.f50791e = i15;
                    this.f50796w = i14;
                    if (i11 != 1) {
                        this.f50791e = i14 + 2;
                        this.f50797x = i15;
                    }
                } else {
                    this.f50793n = -1;
                    this.f50794r = -1;
                    this.f50795s = -1;
                    this.f50796w = -1;
                    this.f50797x = -1;
                }
            } else {
                throw null;
            }
        }
        ut0 ut0Var = this.f50790c;
        if (ut0Var != null) {
            ut0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28225v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28206u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
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
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131750729, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748290, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.d = iyVar;
        if (i10 == 1) {
            iyVar.setText(org.telegram.messenger.id.M0(2131748239, null));
        } else {
            iyVar.setText(org.telegram.messenger.id.M0(2131748223, null));
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f50788a = pj0Var;
        pj0Var.r1();
        this.f50788a.setItemSelectorColorProvider(new st0(this));
        this.f50788a.setSectionsDrawBackground(true);
        this.f50788a.setEmptyView(this.d);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f50788a;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f50789b = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        this.f50788a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f50788a;
        ut0 ut0Var = new ut0(this, context);
        this.f50790c = ut0Var;
        pj0Var3.setAdapter(ut0Var);
        org.telegram.ui.Components.pj0 pj0Var4 = this.f50788a;
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 1;
        }
        pj0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f50788a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f50788a.setOnItemClickListener(new h(this, 27));
        this.f50788a.setOnItemLongClickListener(new st0(this));
        if (i10 == 1) {
            this.f50788a.setOnScrollListener(new g3(this, 27));
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
        if (i7 == org.telegram.messenger.qs.f25067r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (pj0Var = this.f50788a) != null) {
                int childCount = pj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f50788a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25006g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f50788a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50788a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27873c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50788a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28282y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50788a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28072n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25067r);
        if (this.D == 1) {
            org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25006g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25067r);
        if (this.D == 1) {
            org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25006g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ut0 ut0Var = this.f50790c;
        if (ut0Var != null) {
            ut0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.iy iyVar = this.d;
            if (iyVar != null) {
                iyVar.setProgressBarColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27964h6, false));
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
