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
public final class z9 extends org.telegram.ui.ActionBar.p2 {
    public y9 f39235a;
    public y9 f39236b;
    public org.telegram.ui.ActionBar.w0 f39237c;
    public org.telegram.ui.ActionBar.f6 d;

    public static void U(z9 z9Var) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(z9Var.currentAccount).getCurrentUser();
        if (currentUser != null && z9Var.f39236b.getText() != null && z9Var.f39235a.getText() != null) {
            String obj = z9Var.f39235a.getText().toString();
            String obj2 = z9Var.f39236b.getText().toString();
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
                ConnectionsManager.getInstance(z9Var.currentAccount).sendRequest(updateprofile, new bi.g1(4));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.f17965f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        lVar.A(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18256v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 26));
        this.f39237c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ai.h(2));
        y9 y9Var = new y9(this, context, 0);
        this.f39235a = y9Var;
        y9Var.setTextSize(1, 18.0f);
        y9 y9Var2 = this.f39235a;
        int i13 = org.telegram.ui.ActionBar.j6.H6;
        y9Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        y9 y9Var3 = this.f39235a;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        y9Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f39235a.setBackgroundDrawable(null);
        y9 y9Var4 = this.f39235a;
        int i15 = org.telegram.ui.ActionBar.j6.f18055k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.j6.f18073l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.j6.f18144p7;
        y9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f39235a.setMaxLines(1);
        this.f39235a.setLines(1);
        this.f39235a.setSingleLine(true);
        y9 y9Var5 = this.f39235a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y9Var5.setGravity(i10);
        this.f39235a.setInputType(49152);
        this.f39235a.setImeOptions(5);
        this.f39235a.setHint(LocaleController.getString(R.string.FirstName));
        this.f39235a.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f39235a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f39235a.setCursorWidth(1.5f);
        linearLayout.addView(this.f39235a, w7.a6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f39235a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z9 f38614b;

            {
                this.f38614b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            z9 z9Var = this.f38614b;
                            z9Var.f39236b.requestFocus();
                            y9 y9Var6 = z9Var.f39236b;
                            y9Var6.setSelection(y9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f38614b.f39237c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        y9 y9Var6 = new y9(this, context, 1);
        this.f39236b = y9Var6;
        y9Var6.setTextSize(1, 18.0f);
        this.f39236b.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        this.f39236b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f39236b.setBackgroundDrawable(null);
        this.f39236b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f39236b.setMaxLines(1);
        this.f39236b.setLines(1);
        this.f39236b.setSingleLine(true);
        y9 y9Var7 = this.f39236b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y9Var7.setGravity(i11);
        this.f39236b.setInputType(49152);
        this.f39236b.setImeOptions(6);
        this.f39236b.setHint(LocaleController.getString(R.string.LastName));
        this.f39236b.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        this.f39236b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f39236b.setCursorWidth(1.5f);
        linearLayout.addView(this.f39236b, w7.a6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f39236b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z9 f38614b;

            {
                this.f38614b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            z9 z9Var = this.f38614b;
                            z9Var.f39236b.requestFocus();
                            y9 y9Var62 = z9Var.f39236b;
                            y9Var62.setSelection(y9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f38614b.f39237c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f39235a.setText(user.first_name);
            y9 y9Var8 = this.f39235a;
            y9Var8.setSelection(y9Var8.length());
            this.f39236b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        y9 y9Var = this.f39235a;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var, 4, null, null, null, null, i10));
        y9 y9Var2 = this.f39235a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var2, 8388608, null, null, null, null, i11));
        y9 y9Var3 = this.f39235a;
        int i12 = org.telegram.ui.ActionBar.j6.f18055k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var3, 32, null, null, null, null, i12));
        y9 y9Var4 = this.f39235a;
        int i13 = org.telegram.ui.ActionBar.j6.f18073l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39236b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39236b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39236b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39236b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f39235a.requestFocus();
            AndroidUtilities.showKeyboard(this.f39235a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new mu0(this, 18), 100L);
        }
    }
}
