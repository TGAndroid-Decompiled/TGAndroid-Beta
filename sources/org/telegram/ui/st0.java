package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class st0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public final int E;
    public org.telegram.ui.Components.ek0 f52126a;
    public v4.c0 f52127b;
    public rt0 f52128c;
    public org.telegram.ui.Components.vy d;
    public int f52129e;
    public int f52130f;
    public int h;
    public int f52131n;
    public int f52132r;
    public int f52133s;
    public int f52134w;
    public int f52135x;
    public final boolean f52136y;

    public st0() {
        super(null);
        this.E = 1;
        this.f52136y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(this, view);
        int i7 = 0;
        I.X(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false)));
        int i10 = this.E;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        I.l(0, org.telegram.messenger.hd.N0(2131743666, null), new tr0(7, this, l10), z10);
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i7 = 2131232417;
        }
        I.m(i7, new qt0(this, l10), org.telegram.messenger.hd.N0(2131746125, null), z11, true);
        I.V = 190;
        I.a0();
    }

    public final void a0() {
        this.f52129e = 0;
        this.f52130f = -1;
        this.f52131n = -1;
        this.h = -1;
        this.f52135x = -1;
        if (!this.f52136y || getMessagesController().I0 >= 0) {
            int i7 = this.f52129e;
            int i10 = i7 + 1;
            this.f52129e = i10;
            this.f52130f = i7;
            int i11 = this.E;
            if (i11 == 1) {
                this.f52129e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().H0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f52129e;
                        this.f52129e = i12 + 1;
                        this.f52131n = i12;
                    }
                    int i13 = this.f52129e;
                    this.f52132r = i13;
                    int i14 = i13 + size;
                    this.f52133s = i14;
                    int i15 = i14 + 1;
                    this.f52129e = i15;
                    this.f52134w = i14;
                    if (i11 != 1) {
                        this.f52129e = i14 + 2;
                        this.f52135x = i15;
                    }
                } else {
                    this.f52131n = -1;
                    this.f52132r = -1;
                    this.f52133s = -1;
                    this.f52134w = -1;
                    this.f52135x = -1;
                }
            } else {
                throw null;
            }
        }
        rt0 rt0Var = this.f52128c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29716v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29697u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 4));
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
        this.f52126a = ek0Var;
        ek0Var.r1();
        this.f52126a.setItemSelectorColorProvider(new pt0(this));
        this.f52126a.setSectionsDrawBackground(true);
        this.f52126a.setEmptyView(this.d);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f52126a;
        v4.c0 c0Var = new v4.c0(1, false);
        this.f52127b = c0Var;
        ek0Var2.setLayoutManager(c0Var);
        this.f52126a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f52126a;
        rt0 rt0Var = new rt0(this, context);
        this.f52128c = rt0Var;
        ek0Var3.setAdapter(rt0Var);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f52126a;
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 1;
        }
        ek0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f52126a, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        this.f52126a.setOnItemClickListener(new h(this, 27));
        this.f52126a.setOnItemLongClickListener(new pt0(this));
        if (i10 == 1) {
            this.f52126a.setOnScrollListener(new g3(this, 27));
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
        if (i7 == org.telegram.messenger.ls.f25371r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.I8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (ek0Var = this.f52126a) != null) {
                int childCount = ek0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f52126a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25310g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f52126a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52126a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29381d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29364c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29455h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52126a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29773y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52126a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29563n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25371r);
        if (this.E == 1) {
            org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25310g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25371r);
        if (this.E == 1) {
            org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25310g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rt0 rt0Var = this.f52128c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.vy vyVar = this.d;
            if (vyVar != null) {
                vyVar.setProgressBarColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29455h6, false));
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
