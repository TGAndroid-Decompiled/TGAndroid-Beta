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
public final class yg0 extends org.telegram.ui.ActionBar.m2 {
    public xg0 f44389a;
    public org.telegram.ui.Components.sm0 f44390b;
    public int f44391c;
    public int d;
    public int f44392e;
    public int f44393f;
    public int h;
    public int f44394n;
    public int f44395r;
    public int f44396s;
    public int v;

    public static void V(org.telegram.ui.yg0 r8, org.telegram.ui.ActionBar.a2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yg0.V(org.telegram.ui.yg0, org.telegram.ui.ActionBar.a2):void");
    }

    public static void W(yg0 yg0Var, int i10) {
        Integer num = null;
        if (i10 == yg0Var.f44391c) {
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
                yg0Var.presentFragment(new vg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                yg0Var.showDialog(new rg.j0(7, yg0Var.currentAccount, yg0Var.getParentActivity(), yg0Var, null));
            }
        } else if (i10 == yg0Var.d) {
            yg0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == yg0Var.f44392e) {
            yg0Var.presentFragment(new x6());
        } else if (i10 == yg0Var.f44393f) {
            yg0Var.presentFragment(new h(3));
        } else if (i10 == yg0Var.h) {
            yg0Var.showDialog(org.telegram.ui.Components.g5.T(yg0Var, null));
        } else if (i10 == yg0Var.f44395r && yg0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(yg0Var.getParentActivity(), 3, null);
            a2Var.q(500L);
            int i13 = yg0Var.currentAccount;
            uf0 uf0Var = new uf0(3, yg0Var, a2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                uf0Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.j(i13, uf0Var, 1));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 6));
        this.f44389a = new xg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(context, null);
        this.f44390b = sm0Var;
        sm0Var.setVerticalScrollBarEnabled(false);
        this.f44390b.setLayoutManager(new s4.d0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f44390b, w7.x5.e(-1, -1, 51));
        this.f44390b.setAdapter(this.f44389a);
        this.f44390b.setOnItemClickListener(new wg0(this));
        this.f44390b.p1();
        this.actionBar.setAdaptiveBackground(this.f44390b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        int i10 = org.telegram.ui.ActionBar.h6.f20750b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21007p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44390b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20951m6));
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
            this.f44391c = i10;
        } else {
            this.f44391c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f44392e = i12;
        this.f44393f = i12 + 1;
        this.h = i12 + 2;
        this.f44394n = i12 + 3;
        this.f44395r = i12 + 4;
        this.v = i12 + 6;
        this.f44396s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        xg0 xg0Var = this.f44389a;
        if (xg0Var != null) {
            xg0Var.l();
        }
    }
}
