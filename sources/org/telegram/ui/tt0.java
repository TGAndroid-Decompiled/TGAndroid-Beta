package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class tt0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public final int E;
    public org.telegram.ui.Components.ek0 f52352a;
    public v4.b0 f52353b;
    public st0 f52354c;
    public org.telegram.ui.Components.vy d;
    public int f52355e;
    public int f52356f;
    public int h;
    public int f52357n;
    public int f52358r;
    public int f52359s;
    public int f52360w;
    public int f52361x;
    public final boolean f52362y;

    public tt0() {
        super(null);
        this.E = 1;
        this.f52362y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
        int i7 = 0;
        I.X(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false)));
        int i10 = this.E;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        I.l(0, org.telegram.messenger.hd.N0(2131743668, null), new ur0(5, this, l10), z10);
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i7 = 2131232417;
        }
        I.m(i7, new rt0(this, l10), org.telegram.messenger.hd.N0(2131746125, null), z11, true);
        I.V = 190;
        I.a0();
    }

    public final void a0() {
        this.f52355e = 0;
        this.f52356f = -1;
        this.f52357n = -1;
        this.h = -1;
        this.f52361x = -1;
        if (!this.f52362y || getMessagesController().I0 >= 0) {
            int i7 = this.f52355e;
            int i10 = i7 + 1;
            this.f52355e = i10;
            this.f52356f = i7;
            int i11 = this.E;
            if (i11 == 1) {
                this.f52355e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().H0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f52355e;
                        this.f52355e = i12 + 1;
                        this.f52357n = i12;
                    }
                    int i13 = this.f52355e;
                    this.f52358r = i13;
                    int i14 = i13 + size;
                    this.f52359s = i14;
                    int i15 = i14 + 1;
                    this.f52355e = i15;
                    this.f52360w = i14;
                    if (i11 != 1) {
                        this.f52355e = i14 + 2;
                        this.f52361x = i15;
                    }
                } else {
                    this.f52357n = -1;
                    this.f52358r = -1;
                    this.f52359s = -1;
                    this.f52360w = -1;
                    this.f52361x = -1;
                }
            } else {
                throw null;
            }
        }
        st0 st0Var = this.f52354c;
        if (st0Var != null) {
            st0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29682v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29663u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29512m6));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29311b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = 2;
        int i10 = this.E;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131753678, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131750717, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748097, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new is0(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.d = vyVar;
        if (i10 == 1) {
            vyVar.setText(org.telegram.messenger.hd.N0(2131748046, null));
        } else {
            vyVar.setText(org.telegram.messenger.hd.N0(2131748030, null));
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52352a = ek0Var;
        ek0Var.r1();
        this.f52352a.setItemSelectorColorProvider(new qt0(this));
        this.f52352a.setSectionsDrawBackground(true);
        this.f52352a.setEmptyView(this.d);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f52352a;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f52353b = b0Var;
        ek0Var2.setLayoutManager(b0Var);
        this.f52352a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f52352a;
        st0 st0Var = new st0(this, context);
        this.f52354c = st0Var;
        ek0Var3.setAdapter(st0Var);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f52352a;
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 1;
        }
        ek0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f52352a, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        this.f52352a.setOnItemClickListener(new h(this, 27));
        this.f52352a.setOnItemLongClickListener(new qt0(this));
        if (i10 == 1) {
            this.f52352a.setOnScrollListener(new g3(this, 27));
            if (getMessagesController().I0 < 0) {
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
        org.telegram.ui.Components.ek0 ek0Var;
        if (i7 == org.telegram.messenger.ls.f25335r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.I8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (ek0Var = this.f52352a) != null) {
                int childCount = ek0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f52352a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25274g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f52352a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52352a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29347d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29330c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29421h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52352a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29739y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52352a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29529n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25335r);
        if (this.E == 1) {
            org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25274g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25335r);
        if (this.E == 1) {
            org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25274g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        st0 st0Var = this.f52354c;
        if (st0Var != null) {
            st0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.vy vyVar = this.d;
            if (vyVar != null) {
                vyVar.setProgressBarColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29421h6, false));
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
