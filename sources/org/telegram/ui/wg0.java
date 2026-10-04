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
    public vg0 f42454a;
    public org.telegram.ui.Components.zl0 f42455b;
    public int f42456c;
    public int d;
    public int f42457e;
    public int f42458f;
    public int h;
    public int f42459n;
    public int f42460r;
    public int f42461s;
    public int v;

    public static void S(wg0 wg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == wg0Var.f42456c) {
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
        } else if (i10 == wg0Var.f42457e) {
            wg0Var.presentFragment(new a7());
        } else if (i10 == wg0Var.f42458f) {
            wg0Var.presentFragment(new h(3));
        } else if (i10 == wg0Var.h) {
            wg0Var.showDialog(org.telegram.ui.Components.e5.U(wg0Var, null));
        } else if (i10 == wg0Var.f42460r && wg0Var.getParentActivity() != null) {
            Activity parentActivity = wg0Var.getParentActivity();
            int i13 = wg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.w(i13, 10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
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
        this.f42454a = new vg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f42455b = zl0Var;
        zl0Var.setVerticalScrollBarEnabled(false);
        this.f42455b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f42455b, w7.z5.e(-1, -1, 51));
        this.f42455b.setAdapter(this.f42454a);
        this.f42455b.setOnItemClickListener(new bu(this, 22));
        this.f42455b.s1();
        this.f42455b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f42455b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20817d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21099s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21154v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21118t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20908i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20940k0, null, null, org.telegram.ui.ActionBar.i6.f20818d7));
        int i10 = org.telegram.ui.ActionBar.i6.f20781b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21039p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21223z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42455b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20983m6));
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
            this.f42456c = i10;
        } else {
            this.f42456c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f42457e = i12;
        this.f42458f = i12 + 1;
        this.h = i12 + 2;
        this.f42459n = i12 + 3;
        this.f42460r = i12 + 4;
        this.v = i12 + 6;
        this.f42461s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        vg0 vg0Var = this.f42454a;
        if (vg0Var != null) {
            vg0Var.l();
        }
    }
}
