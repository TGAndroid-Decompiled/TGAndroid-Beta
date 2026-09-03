package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rg0 extends org.telegram.ui.ActionBar.p2 {
    public qg0 f37829a;
    public org.telegram.ui.Components.rl0 f37830b;
    public int f37831c;
    public int d;
    public int e;
    public int f37832f;
    public int h;
    public int f37833n;
    public int f37834r;
    public int f37835s;
    public int v;

    public static void U(rg0 rg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == rg0Var.f37831c) {
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
                rg0Var.presentFragment(new pg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                rg0Var.showDialog(new eg.v0(7, rg0Var.currentAccount, rg0Var.getParentActivity(), rg0Var, null));
            }
        } else if (i10 == rg0Var.d) {
            rg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == rg0Var.e) {
            rg0Var.presentFragment(new d7());
        } else if (i10 == rg0Var.f37832f) {
            rg0Var.presentFragment(new i(3));
        } else if (i10 == rg0Var.h) {
            rg0Var.showDialog(org.telegram.ui.Components.z4.U(rg0Var, null));
        } else if (i10 == rg0Var.f37834r && rg0Var.getParentActivity() != null) {
            Activity parentActivity = rg0Var.getParentActivity();
            int i13 = rg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new d4.b(i13, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
            }
            rg0Var.showDialog(d2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 23));
        this.f37829a = new qg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f37830b = rl0Var;
        rl0Var.setVerticalScrollBarEnabled(false);
        this.f37830b.setLayoutManager(new f2.i0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f37830b, k7.b6.e(-1, -1, 51));
        this.f37830b.setAdapter(this.f37829a);
        this.f37830b.setOnItemClickListener(new hu(this, 21));
        this.f37830b.o1();
        this.actionBar.setAdaptiveBackground(this.f37830b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        int i10 = org.telegram.ui.ActionBar.j6.f19846b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20097p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37830b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20042m6));
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
            this.f37831c = i10;
        } else {
            this.f37831c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.e = i12;
        this.f37832f = i12 + 1;
        this.h = i12 + 2;
        this.f37833n = i12 + 3;
        this.f37834r = i12 + 4;
        this.v = i12 + 6;
        this.f37835s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        qg0 qg0Var = this.f37829a;
        if (qg0Var != null) {
            qg0Var.l();
        }
    }
}
