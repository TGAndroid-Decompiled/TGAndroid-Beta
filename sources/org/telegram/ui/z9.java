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
public final class z9 extends org.telegram.ui.ActionBar.m2 {
    public y9 f40421a;
    public y9 f40422b;
    public org.telegram.ui.ActionBar.u0 f40423c;
    public org.telegram.ui.ActionBar.d6 d;

    public static void U(z9 z9Var) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(z9Var.currentAccount).getCurrentUser();
        if (currentUser != null && z9Var.f40422b.getText() != null && z9Var.f40421a.getText() != null) {
            String obj = z9Var.f40421a.getText().toString();
            String obj2 = z9Var.f40422b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(z9Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(z9Var.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(z9Var.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(z9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(z9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(z9Var.currentAccount).sendRequest(updateprofile, new ai.u7(8));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f19097f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19393v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 26));
        this.f40423c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        y9 y9Var = new y9(this, context, 0);
        this.f40421a = y9Var;
        y9Var.setTextSize(1, 18.0f);
        y9 y9Var2 = this.f40421a;
        int i13 = org.telegram.ui.ActionBar.h6.H6;
        y9Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
        y9 y9Var3 = this.f40421a;
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        y9Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        this.f40421a.setBackgroundDrawable(null);
        y9 y9Var4 = this.f40421a;
        int i15 = org.telegram.ui.ActionBar.h6.f19187k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.h6.f19205l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.h6.f19280p7;
        y9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f40421a.setMaxLines(1);
        this.f40421a.setLines(1);
        this.f40421a.setSingleLine(true);
        y9 y9Var5 = this.f40421a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y9Var5.setGravity(i10);
        this.f40421a.setInputType(49152);
        this.f40421a.setImeOptions(5);
        this.f40421a.setHint(LocaleController.getString(R.string.FirstName));
        this.f40421a.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        this.f40421a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f40421a.setCursorWidth(1.5f);
        linearLayout.addView(this.f40421a, w7.y5.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f40421a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z9 f39873b;

            {
                this.f39873b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            z9 z9Var = this.f39873b;
                            z9Var.f40422b.requestFocus();
                            y9 y9Var6 = z9Var.f40422b;
                            y9Var6.setSelection(y9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f39873b.f40423c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        y9 y9Var6 = new y9(this, context, 1);
        this.f40422b = y9Var6;
        y9Var6.setTextSize(1, 18.0f);
        this.f40422b.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
        this.f40422b.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        this.f40422b.setBackgroundDrawable(null);
        this.f40422b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f40422b.setMaxLines(1);
        this.f40422b.setLines(1);
        this.f40422b.setSingleLine(true);
        y9 y9Var7 = this.f40422b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y9Var7.setGravity(i11);
        this.f40422b.setInputType(49152);
        this.f40422b.setImeOptions(6);
        this.f40422b.setHint(LocaleController.getString(R.string.LastName));
        this.f40422b.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        this.f40422b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f40422b.setCursorWidth(1.5f);
        linearLayout.addView(this.f40422b, w7.y5.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f40422b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z9 f39873b;

            {
                this.f39873b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            z9 z9Var = this.f39873b;
                            z9Var.f40422b.requestFocus();
                            y9 y9Var62 = z9Var.f40422b;
                            y9Var62.setSelection(y9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f39873b.f40423c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f40421a.setText(user.first_name);
            y9 y9Var8 = this.f40421a;
            y9Var8.setSelection(y9Var8.length());
            this.f40422b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19060d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19338s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19393v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19357t8));
        y9 y9Var = this.f40421a;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y9Var, 4, null, null, null, null, i10));
        y9 y9Var2 = this.f40421a;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y9Var2, 8388608, null, null, null, null, i11));
        y9 y9Var3 = this.f40421a;
        int i12 = org.telegram.ui.ActionBar.h6.f19187k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y9Var3, 32, null, null, null, null, i12));
        y9 y9Var4 = this.f40421a;
        int i13 = org.telegram.ui.ActionBar.h6.f19205l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40422b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40422b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40422b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40422b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f40421a.requestFocus();
            AndroidUtilities.showKeyboard(this.f40421a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new eu0(this, 18), 100L);
        }
    }
}
