package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class st0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public final int E;
    public org.telegram.ui.Components.ck0 f52074a;
    public v4.c0 f52075b;
    public rt0 f52076c;
    public org.telegram.ui.Components.ty d;
    public int f52077e;
    public int f52078f;
    public int h;
    public int f52079n;
    public int f52080r;
    public int f52081s;
    public int f52082w;
    public int f52083x;
    public final boolean f52084y;

    public st0() {
        super(null);
        this.E = 1;
        this.f52084y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(this, view);
        int i7 = 0;
        I.X(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false)));
        int i10 = this.E;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        I.l(0, org.telegram.messenger.gd.M0(2131743674, null), new tr0(5, this, l10), z10);
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i7 = 2131232417;
        }
        I.m(i7, new qt0(this, l10), org.telegram.messenger.gd.M0(2131746126, null), z11, true);
        I.V = 190;
        I.a0();
    }

    public final void a0() {
        this.f52077e = 0;
        this.f52078f = -1;
        this.f52079n = -1;
        this.h = -1;
        this.f52083x = -1;
        if (!this.f52084y || getMessagesController().I0 >= 0) {
            int i7 = this.f52077e;
            int i10 = i7 + 1;
            this.f52077e = i10;
            this.f52078f = i7;
            int i11 = this.E;
            if (i11 == 1) {
                this.f52077e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().H0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f52077e;
                        this.f52077e = i12 + 1;
                        this.f52079n = i12;
                    }
                    int i13 = this.f52077e;
                    this.f52080r = i13;
                    int i14 = i13 + size;
                    this.f52081s = i14;
                    int i15 = i14 + 1;
                    this.f52077e = i15;
                    this.f52082w = i14;
                    if (i11 != 1) {
                        this.f52077e = i14 + 2;
                        this.f52083x = i15;
                    }
                } else {
                    this.f52079n = -1;
                    this.f52080r = -1;
                    this.f52081s = -1;
                    this.f52082w = -1;
                    this.f52083x = -1;
                }
            } else {
                throw null;
            }
        }
        rt0 rt0Var = this.f52076c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29729v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29710u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = 2;
        int i10 = this.E;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131753679, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131750718, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748098, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.d = tyVar;
        if (i10 == 1) {
            tyVar.setText(org.telegram.messenger.gd.M0(2131748047, null));
        } else {
            tyVar.setText(org.telegram.messenger.gd.M0(2131748031, null));
        }
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f52074a = ck0Var;
        ck0Var.r1();
        this.f52074a.setItemSelectorColorProvider(new pt0(this));
        this.f52074a.setSectionsDrawBackground(true);
        this.f52074a.setEmptyView(this.d);
        org.telegram.ui.Components.ck0 ck0Var2 = this.f52074a;
        v4.c0 c0Var = new v4.c0(1, false);
        this.f52075b = c0Var;
        ck0Var2.setLayoutManager(c0Var);
        this.f52074a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ck0 ck0Var3 = this.f52074a;
        rt0 rt0Var = new rt0(this, context);
        this.f52076c = rt0Var;
        ck0Var3.setAdapter(rt0Var);
        org.telegram.ui.Components.ck0 ck0Var4 = this.f52074a;
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 1;
        }
        ck0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f52074a, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        this.f52074a.setOnItemClickListener(new h(this, 27));
        this.f52074a.setOnItemLongClickListener(new pt0(this));
        if (i10 == 1) {
            this.f52074a.setOnScrollListener(new g3(this, 27));
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
        org.telegram.ui.Components.ck0 ck0Var;
        if (i7 == org.telegram.messenger.ks.f25177r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (ck0Var = this.f52074a) != null) {
                int childCount = ck0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f52074a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25116g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f52074a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52074a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29377c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29468h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52074a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29786y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52074a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29576n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25177r);
        if (this.E == 1) {
            org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25116g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25177r);
        if (this.E == 1) {
            org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25116g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rt0 rt0Var = this.f52076c;
        if (rt0Var != null) {
            rt0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.ty tyVar = this.d;
            if (tyVar != null) {
                tyVar.setProgressBarColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29468h6, false));
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
