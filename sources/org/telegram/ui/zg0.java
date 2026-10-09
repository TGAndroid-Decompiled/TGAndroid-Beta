package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zg0 extends org.telegram.ui.ActionBar.n2 {
    public yg0 f44618a;
    public org.telegram.ui.Components.qm0 f44619b;
    public int f44620c;
    public int d;
    public int f44621e;
    public int f44622f;
    public int h;
    public int f44623n;
    public int f44624r;
    public int f44625s;
    public int v;

    public static void V(org.telegram.ui.zg0 r8, org.telegram.ui.ActionBar.b2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zg0.V(org.telegram.ui.zg0, org.telegram.ui.ActionBar.b2):void");
    }

    public static void W(zg0 zg0Var, int i10) {
        Integer num = null;
        if (i10 == zg0Var.f44620c) {
            int i11 = 0;
            for (int i12 = 3; i12 >= 0; i12--) {
                if (!UserConfig.getInstance(i12).isClientActivated()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                zg0Var.presentFragment(new wg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                zg0Var.showDialog(new rg.j0(7, zg0Var.currentAccount, zg0Var.getParentActivity(), zg0Var, null));
            }
        } else if (i10 == zg0Var.d) {
            zg0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == zg0Var.f44621e) {
            zg0Var.presentFragment(new y6());
        } else if (i10 == zg0Var.f44622f) {
            zg0Var.presentFragment(new h(3));
        } else if (i10 == zg0Var.h) {
            zg0Var.showDialog(org.telegram.ui.Components.g5.T(zg0Var, null));
        } else if (i10 == zg0Var.f44624r && zg0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(zg0Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            int i13 = zg0Var.currentAccount;
            tf0 tf0Var = new tf0(4, zg0Var, b2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                tf0Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.r(i13, tf0Var, 0));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 6));
        this.f44618a = new yg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f44619b = qm0Var;
        qm0Var.setVerticalScrollBarEnabled(false);
        this.f44619b.setLayoutManager(new s4.d0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f44619b, w7.x5.e(-1, -1, 51));
        this.f44619b.setAdapter(this.f44618a);
        this.f44619b.setOnItemClickListener(new xg0(this));
        this.f44619b.p1();
        this.actionBar.setAdaptiveBackground(this.f44619b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        int i10 = org.telegram.ui.ActionBar.i6.f20761b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21018p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f44619b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20962m6));
        return arrayList;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.v = 1;
        if (UserConfig.getActivatedAccountsCount() < 4) {
            int i10 = this.v;
            this.v = i10 + 1;
            this.f44620c = i10;
        } else {
            this.f44620c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f44621e = i12;
        this.f44622f = i12 + 1;
        this.h = i12 + 2;
        this.f44623n = i12 + 3;
        this.f44624r = i12 + 4;
        this.v = i12 + 6;
        this.f44625s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        yg0 yg0Var = this.f44618a;
        if (yg0Var != null) {
            yg0Var.l();
        }
    }
}
