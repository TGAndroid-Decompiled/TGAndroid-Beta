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
public final class wg0 extends org.telegram.ui.ActionBar.n2 {
    public vg0 f42462a;
    public org.telegram.ui.Components.zl0 f42463b;
    public int f42464c;
    public int d;
    public int f42465e;
    public int f42466f;
    public int h;
    public int f42467n;
    public int f42468r;
    public int f42469s;
    public int v;

    public static void S(wg0 wg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == wg0Var.f42464c) {
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
                wg0Var.presentFragment(new ug0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                wg0Var.showDialog(new rg.k0(7, wg0Var.currentAccount, wg0Var.getParentActivity(), wg0Var, null));
            }
        } else if (i10 == wg0Var.d) {
            wg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == wg0Var.f42465e) {
            wg0Var.presentFragment(new a7());
        } else if (i10 == wg0Var.f42466f) {
            wg0Var.presentFragment(new h(3));
        } else if (i10 == wg0Var.h) {
            wg0Var.showDialog(org.telegram.ui.Components.e5.U(wg0Var, null));
        } else if (i10 == wg0Var.f42468r && wg0Var.getParentActivity() != null) {
            Activity parentActivity = wg0Var.getParentActivity();
            int i13 = wg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.w(i13, 10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
            }
            wg0Var.showDialog(b2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 6));
        this.f42462a = new vg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f42463b = zl0Var;
        zl0Var.setVerticalScrollBarEnabled(false);
        this.f42463b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f42463b, w7.z5.e(-1, -1, 51));
        this.f42463b.setAdapter(this.f42462a);
        this.f42463b.setOnItemClickListener(new bu(this, 22));
        this.f42463b.s1();
        this.f42463b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f42463b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        int i10 = org.telegram.ui.ActionBar.i6.f20786b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21044p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21228z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42463b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20988m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
            this.f42464c = i10;
        } else {
            this.f42464c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f42465e = i12;
        this.f42466f = i12 + 1;
        this.h = i12 + 2;
        this.f42467n = i12 + 3;
        this.f42468r = i12 + 4;
        this.v = i12 + 6;
        this.f42469s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg0 vg0Var = this.f42462a;
        if (vg0Var != null) {
            vg0Var.l();
        }
    }
}
