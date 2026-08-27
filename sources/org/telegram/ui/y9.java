package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class y9 extends org.telegram.ui.ActionBar.n2 {

    public x9 f44740a;

    public x9 f44741b;

    public org.telegram.ui.ActionBar.v0 f44742c;
    public org.telegram.ui.ActionBar.c6 d;

    public static void U(y9 y9Var) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(y9Var.currentAccount).getCurrentUser();
        if (currentUser == null || y9Var.f44741b.getText() == null || y9Var.f44740a.getText() == null) {
            return;
        }
        String string = y9Var.f44740a.getText().toString();
        String string2 = y9Var.f44741b.getText().toString();
        String str2 = currentUser.first_name;
        if (str2 == null || !str2.equals(string) || (str = currentUser.last_name) == null || !str.equals(string2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = string;
            currentUser.first_name = string;
            updateprofile.last_name = string2;
            currentUser.last_name = string2;
            TLRPC.User user = MessagesController.getInstance(y9Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(y9Var.currentAccount).getClientUserId()));
            if (user != null) {
                user.first_name = updateprofile.first_name;
                user.last_name = updateprofile.last_name;
            }
            UserConfig.getInstance(y9Var.currentAccount).saveConfig(true);
            NotificationCenter.getInstance(y9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(y9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(y9Var.currentAccount).sendRequest(updateprofile, new jh.m5(5));
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23092f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        kVar.C(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 22));
        this.f44742c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new kh.e(2));
        x9 x9Var = new x9(this, context, 0);
        this.f44740a = x9Var;
        x9Var.setTextSize(1, 18.0f);
        x9 x9Var2 = this.f44740a;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        x9Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        x9 x9Var3 = this.f44740a;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        x9Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        this.f44740a.setBackgroundDrawable(null);
        x9 x9Var4 = this.f44740a;
        int i13 = org.telegram.ui.ActionBar.g6.f23181k6;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.g6.f23198l6;
        int themedColor2 = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.g6.f23269p7;
        x9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i15));
        this.f44740a.setMaxLines(1);
        this.f44740a.setLines(1);
        this.f44740a.setSingleLine(true);
        this.f44740a.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f44740a.setInputType(49152);
        this.f44740a.setImeOptions(5);
        this.f44740a.setHint(LocaleController.getString(R.string.FirstName));
        this.f44740a.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        this.f44740a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f44740a.setCursorWidth(1.5f);
        linearLayout.addView(this.f44740a, h7.z5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        final int i16 = 0;
        this.f44740a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final y9 f43673b;

            {
                this.f43673b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (i16) {
                    case 0:
                        if (i17 != 5) {
                            return false;
                        }
                        y9 y9Var = this.f43673b;
                        y9Var.f44741b.requestFocus();
                        x9 x9Var5 = y9Var.f44741b;
                        x9Var5.setSelection(x9Var5.length());
                        return true;
                    default:
                        if (i17 != 6) {
                            return false;
                        }
                        this.f43673b.f44742c.performClick();
                        return true;
                }
            }
        });
        x9 x9Var5 = new x9(this, context, 1);
        this.f44741b = x9Var5;
        x9Var5.setTextSize(1, 18.0f);
        this.f44741b.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f44741b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        this.f44741b.setBackgroundDrawable(null);
        this.f44741b.setLineColors(getThemedColor(i13), getThemedColor(i14), getThemedColor(i15));
        this.f44741b.setMaxLines(1);
        this.f44741b.setLines(1);
        this.f44741b.setSingleLine(true);
        this.f44741b.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f44741b.setInputType(49152);
        this.f44741b.setImeOptions(6);
        this.f44741b.setHint(LocaleController.getString(R.string.LastName));
        this.f44741b.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        this.f44741b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f44741b.setCursorWidth(1.5f);
        linearLayout.addView(this.f44741b, h7.z5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        final int i17 = 1;
        this.f44741b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final y9 f43673b;

            {
                this.f43673b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i18 != 5) {
                            return false;
                        }
                        y9 y9Var = this.f43673b;
                        y9Var.f44741b.requestFocus();
                        x9 x9Var6 = y9Var.f44741b;
                        x9Var6.setSelection(x9Var6.length());
                        return true;
                    default:
                        if (i18 != 6) {
                            return false;
                        }
                        this.f43673b.f44742c.performClick();
                        return true;
                }
            }
        });
        if (user != null) {
            this.f44740a.setText(user.first_name);
            x9 x9Var6 = this.f44740a;
            x9Var6.setSelection(x9Var6.length());
            this.f44741b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        x9 x9Var = this.f44740a;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x9Var, 4, null, null, null, null, i10));
        x9 x9Var2 = this.f44740a;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x9Var2, 8388608, null, null, null, null, i11));
        x9 x9Var3 = this.f44740a;
        int i12 = org.telegram.ui.ActionBar.g6.f23181k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x9Var3, 32, null, null, null, null, i12));
        x9 x9Var4 = this.f44740a;
        int i13 = org.telegram.ui.ActionBar.g6.f23198l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44741b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44741b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44741b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44741b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        this.f44740a.requestFocus();
        AndroidUtilities.showKeyboard(this.f44740a);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new lt0(this, 18), 100L);
        }
    }
}
