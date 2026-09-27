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
public final class vg0 extends org.telegram.ui.ActionBar.o2 {
    public ug0 f38569a;
    public org.telegram.ui.Components.yl0 f38570b;
    public int f38571c;
    public int d;
    public int e;
    public int f38572f;
    public int h;
    public int f38573n;
    public int f38574r;
    public int f38575s;
    public int v;

    public static void U(vg0 vg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == vg0Var.f38571c) {
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
                vg0Var.presentFragment(new tg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                vg0Var.showDialog(new rg.j0(7, vg0Var.currentAccount, vg0Var.getParentActivity(), vg0Var, null));
            }
        } else if (i10 == vg0Var.d) {
            vg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == vg0Var.e) {
            vg0Var.presentFragment(new b7());
        } else if (i10 == vg0Var.f38572f) {
            vg0Var.presentFragment(new h(3));
        } else if (i10 == vg0Var.h) {
            vg0Var.showDialog(org.telegram.ui.Components.e5.U(vg0Var, null));
        } else if (i10 == vg0Var.f38574r && vg0Var.getParentActivity() != null) {
            Activity parentActivity = vg0Var.getParentActivity();
            int i13 = vg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.w(i13, 10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
            }
            vg0Var.showDialog(c2Var);
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
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 6));
        this.f38569a = new ug0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f38570b = yl0Var;
        yl0Var.setVerticalScrollBarEnabled(false);
        this.f38570b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f38570b, w7.y5.e(-1, -1, 51));
        this.f38570b.setAdapter(this.f38569a);
        this.f38570b.setOnItemClickListener(new au(this, 23));
        this.f38570b.q1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.f38570b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        int i10 = org.telegram.ui.ActionBar.i6.f19021b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19278p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19461z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38570b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19222m6));
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
            this.f38571c = i10;
        } else {
            this.f38571c = -1;
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
        this.f38572f = i12 + 1;
        this.h = i12 + 2;
        this.f38573n = i12 + 3;
        this.f38574r = i12 + 4;
        this.v = i12 + 6;
        this.f38575s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ug0 ug0Var = this.f38569a;
        if (ug0Var != null) {
            ug0Var.l();
        }
    }
}
