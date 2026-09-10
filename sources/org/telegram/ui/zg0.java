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
public final class zg0 extends org.telegram.ui.ActionBar.p2 {
    public yg0 f39313a;
    public org.telegram.ui.Components.vl0 f39314b;
    public int f39315c;
    public int d;
    public int e;
    public int f39316f;
    public int h;
    public int f39317n;
    public int f39318r;
    public int f39319s;
    public int v;

    public static void U(zg0 zg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == zg0Var.f39315c) {
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
                zg0Var.presentFragment(new xg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                zg0Var.showDialog(new qg.k0(7, zg0Var.currentAccount, zg0Var.getParentActivity(), zg0Var, null));
            }
        } else if (i10 == zg0Var.d) {
            zg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == zg0Var.e) {
            zg0Var.presentFragment(new y6());
        } else if (i10 == zg0Var.f39316f) {
            zg0Var.presentFragment(new h(3));
        } else if (i10 == zg0Var.h) {
            zg0Var.showDialog(org.telegram.ui.Components.d5.U(zg0Var, null));
        } else if (i10 == zg0Var.f39318r && zg0Var.getParentActivity() != null) {
            Activity parentActivity = zg0Var.getParentActivity();
            int i13 = zg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.v(i13, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
            zg0Var.showDialog(d2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 6));
        this.f39313a = new yg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f39314b = vl0Var;
        vl0Var.setVerticalScrollBarEnabled(false);
        this.f39314b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f39314b, w7.a6.e(-1, -1, 51));
        this.f39314b.setAdapter(this.f39313a);
        this.f39314b.setOnItemClickListener(new iu(this, 21));
        this.f39314b.o1();
        this.actionBar.setAdaptiveBackground(this.f39314b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        int i10 = org.telegram.ui.ActionBar.j6.f17892b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18144p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39314b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
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
            this.f39315c = i10;
        } else {
            this.f39315c = -1;
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
        this.f39316f = i12 + 1;
        this.h = i12 + 2;
        this.f39317n = i12 + 3;
        this.f39318r = i12 + 4;
        this.v = i12 + 6;
        this.f39319s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        yg0 yg0Var = this.f39313a;
        if (yg0Var != null) {
            yg0Var.l();
        }
    }
}
