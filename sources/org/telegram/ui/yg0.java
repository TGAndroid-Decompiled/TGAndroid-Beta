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
public final class yg0 extends org.telegram.ui.ActionBar.n2 {
    public xg0 f43108a;
    public org.telegram.ui.Components.ll0 f43109b;
    public int f43110c;
    public int d;
    public int f43111e;
    public int f43112f;
    public int h;
    public int f43113n;
    public int f43114r;
    public int f43115s;
    public int v;

    public static void U(yg0 yg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == yg0Var.f43110c) {
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
                yg0Var.presentFragment(new wg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                yg0Var.showDialog(new sg.k0(7, yg0Var.currentAccount, yg0Var.getParentActivity(), yg0Var, null));
            }
        } else if (i10 == yg0Var.d) {
            yg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == yg0Var.f43111e) {
            yg0Var.presentFragment(new z6());
        } else if (i10 == yg0Var.f43112f) {
            yg0Var.presentFragment(new h(3));
        } else if (i10 == yg0Var.h) {
            yg0Var.showDialog(org.telegram.ui.Components.e5.U(yg0Var, null));
        } else if (i10 == yg0Var.f43114r && yg0Var.getParentActivity() != null) {
            Activity parentActivity = yg0Var.getParentActivity();
            int i13 = yg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.w(i13, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
            }
            yg0Var.showDialog(b2Var);
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
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 7));
        this.f43108a = new xg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f43109b = ll0Var;
        ll0Var.setVerticalScrollBarEnabled(false);
        this.f43109b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f43109b, w7.x5.e(-1, -1, 51));
        this.f43109b.setAdapter(this.f43108a);
        this.f43109b.setOnItemClickListener(new iu(this, 21));
        this.f43109b.o1();
        this.actionBar.setAdaptiveBackground(this.f43109b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        int i10 = org.telegram.ui.ActionBar.j6.f20627b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20880p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21061z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43109b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20827m6));
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
            this.f43110c = i10;
        } else {
            this.f43110c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f43111e = i12;
        this.f43112f = i12 + 1;
        this.h = i12 + 2;
        this.f43113n = i12 + 3;
        this.f43114r = i12 + 4;
        this.v = i12 + 6;
        this.f43115s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        xg0 xg0Var = this.f43108a;
        if (xg0Var != null) {
            xg0Var.l();
        }
    }
}
