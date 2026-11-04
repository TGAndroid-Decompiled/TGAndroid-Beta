package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zd0 extends org.telegram.ui.ActionBar.d2 {
    public n4 f52658a;
    public org.telegram.ui.Components.tj0 f52659b;
    public int f52660c;
    public int d;
    public int f52661e;
    public int f52662f;
    public int h;
    public int f52663n;
    public int f52664r;
    public int f52665s;
    public int f52666w;

    public static void Z(org.telegram.ui.zd0 r9, org.telegram.ui.ActionBar.s1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zd0.Z(org.telegram.ui.zd0, org.telegram.ui.ActionBar.s1):void");
    }

    public static void b0(zd0 zd0Var, int i3) {
        Integer num = null;
        if (i3 == zd0Var.f52660c) {
            int i10 = 0;
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.h10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.h10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                zd0Var.presentFragment(new xd0(num.intValue()));
            } else if (!org.telegram.messenger.h10.o()) {
                zd0Var.showDialog(new vg.i0(7, zd0Var.currentAccount, zd0Var.getParentActivity(), zd0Var, null));
            }
        } else if (i3 == zd0Var.d) {
            zd0Var.presentFragment(PasscodeActivity.p0());
        } else if (i3 == zd0Var.f52661e) {
            zd0Var.presentFragment(new z6());
        } else if (i3 == zd0Var.f52662f) {
            zd0Var.presentFragment(new g(3));
        } else if (i3 == zd0Var.h) {
            zd0Var.showDialog(org.telegram.ui.Components.t4.T(zd0Var, null));
        } else if (i3 == zd0Var.f52664r && zd0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, zd0Var.getParentActivity(), null);
            s1Var.r(500L);
            int i12 = zd0Var.currentAccount;
            tb0 tb0Var = new tb0(11, zd0Var, s1Var);
            org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.hp.s1(i12).f23167x7.f24662j0.f13688b).f22814c) {
                tb0Var.run();
            } else {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(i12, tb0Var, 29));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28102p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748749, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 15));
        this.f52658a = new n4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f52659b = tj0Var;
        tj0Var.setVerticalScrollBarEnabled(false);
        this.f52659b.setLayoutManager(new u4.b0(1, false));
        frameLayout.addView(this.f52659b, b8.mf.e(-1, -1, 51));
        this.f52659b.setAdapter(this.f52658a);
        this.f52659b.setOnItemClickListener(new yd0(this));
        this.f52659b.r1();
        this.f52659b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f52659b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f52666w = 1;
        if (org.telegram.messenger.h10.c() < 4) {
            int i3 = this.f52666w;
            this.f52666w = i3 + 1;
            this.f52660c = i3;
        } else {
            this.f52660c = -1;
        }
        if (org.telegram.messenger.az.f21661s.length() <= 0) {
            int i10 = this.f52666w;
            this.f52666w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f52666w;
        this.f52661e = i11;
        this.f52662f = i11 + 1;
        this.h = i11 + 2;
        this.f52663n = i11 + 3;
        this.f52664r = i11 + 4;
        this.f52666w = i11 + 6;
        this.f52665s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.f52658a;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
