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
public final class tg0 extends org.telegram.ui.ActionBar.n2 {
    public sg0 f37642a;
    public org.telegram.ui.Components.ml0 f37643b;
    public int f37644c;
    public int d;
    public int e;
    public int f37645f;
    public int h;
    public int f37646n;
    public int f37647r;
    public int f37648s;
    public int v;

    public static void U(tg0 tg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == tg0Var.f37644c) {
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
                tg0Var.presentFragment(new rg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                tg0Var.showDialog(new rg.j0(7, tg0Var.currentAccount, tg0Var.getParentActivity(), tg0Var, null));
            }
        } else if (i10 == tg0Var.d) {
            tg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == tg0Var.e) {
            tg0Var.presentFragment(new z6());
        } else if (i10 == tg0Var.f37645f) {
            tg0Var.presentFragment(new h(3));
        } else if (i10 == tg0Var.h) {
            tg0Var.showDialog(org.telegram.ui.Components.e5.U(tg0Var, null));
        } else if (i10 == tg0Var.f37647r && tg0Var.getParentActivity() != null) {
            Activity parentActivity = tg0Var.getParentActivity();
            int i13 = tg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.w(i13, 10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
            }
            tg0Var.showDialog(b2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 6));
        this.f37642a = new sg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f37643b = ml0Var;
        ml0Var.setVerticalScrollBarEnabled(false);
        this.f37643b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f37643b, w7.x5.e(-1, -1, 51));
        this.f37643b.setAdapter(this.f37642a);
        this.f37643b.setOnItemClickListener(new eu(this, 21));
        this.f37643b.p1();
        this.actionBar.setAdaptiveBackground(this.f37643b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 16, new Class[]{org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        int i10 = org.telegram.ui.ActionBar.h6.f18753b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19008p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37643b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18953m6));
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
            this.f37644c = i10;
        } else {
            this.f37644c = -1;
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
        this.f37645f = i12 + 1;
        this.h = i12 + 2;
        this.f37646n = i12 + 3;
        this.f37647r = i12 + 4;
        this.v = i12 + 6;
        this.f37648s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        sg0 sg0Var = this.f37642a;
        if (sg0Var != null) {
            sg0Var.l();
        }
    }
}
