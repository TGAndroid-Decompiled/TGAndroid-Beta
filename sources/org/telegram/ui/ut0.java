package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class ut0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final int D;
    public org.telegram.ui.Components.qj0 f50459a;
    public v4.b0 f50460b;
    public tt0 f50461c;
    public org.telegram.ui.Components.jy d;
    public int f50462e;
    public int f50463f;
    public int h;
    public int f50464n;
    public int f50465r;
    public int f50466s;
    public int f50467w;
    public int f50468x;
    public final boolean f50469y;

    public ut0() {
        super(null);
        this.D = 1;
        this.f50469y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z9;
        boolean z10;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(this, view);
        int i7 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)));
        int i10 = this.D;
        if (i10 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        H.l(0, org.telegram.messenger.id.M0(2131743911, null), new sn0(14, this, l10), z9);
        if (i10 != 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            i7 = 2131232415;
        }
        H.m(i7, new st0(this, l10), org.telegram.messenger.id.M0(2131746321, null), z10, true);
        H.S = 190;
        H.Z();
    }

    public final void a0() {
        this.f50462e = 0;
        this.f50463f = -1;
        this.f50464n = -1;
        this.h = -1;
        this.f50468x = -1;
        if (!this.f50469y || getMessagesController().H0 >= 0) {
            int i7 = this.f50462e;
            int i10 = i7 + 1;
            this.f50462e = i10;
            this.f50463f = i7;
            int i11 = this.D;
            if (i11 == 1) {
                this.f50462e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().G0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f50462e;
                        this.f50462e = i12 + 1;
                        this.f50464n = i12;
                    }
                    int i13 = this.f50462e;
                    this.f50465r = i13;
                    int i14 = i13 + size;
                    this.f50466s = i14;
                    int i15 = i14 + 1;
                    this.f50462e = i15;
                    this.f50467w = i14;
                    if (i11 != 1) {
                        this.f50462e = i14 + 2;
                        this.f50468x = i15;
                    }
                } else {
                    this.f50464n = -1;
                    this.f50465r = -1;
                    this.f50466s = -1;
                    this.f50467w = -1;
                    this.f50468x = -1;
                }
            } else {
                throw null;
            }
        }
        tt0 tt0Var = this.f50461c;
        if (tt0Var != null) {
            tt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28200v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28181u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28030m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.d = jyVar;
        if (i10 == 1) {
            jyVar.setText(org.telegram.messenger.id.M0(2131748239, null));
        } else {
            jyVar.setText(org.telegram.messenger.id.M0(2131748223, null));
        }
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f50459a = qj0Var;
        qj0Var.r1();
        this.f50459a.setItemSelectorColorProvider(new rt0(this));
        this.f50459a.setSectionsDrawBackground(true);
        this.f50459a.setEmptyView(this.d);
        org.telegram.ui.Components.qj0 qj0Var2 = this.f50459a;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f50460b = b0Var;
        qj0Var2.setLayoutManager(b0Var);
        this.f50459a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.qj0 qj0Var3 = this.f50459a;
        tt0 tt0Var = new tt0(this, context);
        this.f50461c = tt0Var;
        qj0Var3.setAdapter(tt0Var);
        org.telegram.ui.Components.qj0 qj0Var4 = this.f50459a;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 1;
        }
        qj0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f50459a, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f50459a.setOnItemClickListener(new h(this, 27));
        this.f50459a.setOnItemLongClickListener(new rt0(this));
        if (i10 == 1) {
            this.f50459a.setOnScrollListener(new g3(this, 27));
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
        org.telegram.ui.Components.qj0 qj0Var;
        if (i7 == org.telegram.messenger.qs.f25063r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (qj0Var = this.f50459a) != null) {
                int childCount = qj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f50459a.getChildAt(i12);
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
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f50459a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f50459a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27865d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27848c7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27939h6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f50459a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.f28257y6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f50459a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.f28047n6));
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
        tt0 tt0Var = this.f50461c;
        if (tt0Var != null) {
            tt0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.jy jyVar = this.d;
            if (jyVar != null) {
                jyVar.setProgressBarColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27939h6, false));
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
