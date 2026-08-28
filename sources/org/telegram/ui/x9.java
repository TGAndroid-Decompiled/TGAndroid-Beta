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
public final class x9 extends org.telegram.ui.ActionBar.o2 {
    public w9 f44406a;
    public w9 f44407b;
    public org.telegram.ui.ActionBar.w0 f44408c;
    public org.telegram.ui.ActionBar.b6 d;

    public static void T(x9 x9Var) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(x9Var.currentAccount).getCurrentUser();
        if (currentUser != null && x9Var.f44407b.getText() != null && x9Var.f44406a.getText() != null) {
            String obj = x9Var.f44406a.getText().toString();
            String obj2 = x9Var.f44407b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(x9Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(x9Var.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(x9Var.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(x9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(x9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(x9Var.currentAccount).sendRequest(updateprofile, new ih.q5(5));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.f23039f8;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, b6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 21));
        this.f44408c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new jh.d(2));
        w9 w9Var = new w9(this, context, 0);
        this.f44406a = w9Var;
        w9Var.setTextSize(1, 18.0f);
        w9 w9Var2 = this.f44406a;
        int i12 = org.telegram.ui.ActionBar.f6.H6;
        w9Var2.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        w9 w9Var3 = this.f44406a;
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        w9Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        this.f44406a.setBackgroundDrawable(null);
        w9 w9Var4 = this.f44406a;
        int i14 = org.telegram.ui.ActionBar.f6.f23127k6;
        int themedColor = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.f6.f23144l6;
        int themedColor2 = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.f6.f23212p7;
        w9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i16));
        this.f44406a.setMaxLines(1);
        this.f44406a.setLines(1);
        this.f44406a.setSingleLine(true);
        w9 w9Var5 = this.f44406a;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        w9Var5.setGravity(i9);
        this.f44406a.setInputType(49152);
        this.f44406a.setImeOptions(5);
        this.f44406a.setHint(LocaleController.getString(R.string.FirstName));
        this.f44406a.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        this.f44406a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f44406a.setCursorWidth(1.5f);
        linearLayout.addView(this.f44406a, g7.e6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f44406a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final x9 f43408b;

            {
                this.f43408b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            x9 x9Var = this.f43408b;
                            x9Var.f44407b.requestFocus();
                            w9 w9Var6 = x9Var.f44407b;
                            w9Var6.setSelection(w9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f43408b.f44408c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        w9 w9Var6 = new w9(this, context, 1);
        this.f44407b = w9Var6;
        w9Var6.setTextSize(1, 18.0f);
        this.f44407b.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        this.f44407b.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        this.f44407b.setBackgroundDrawable(null);
        this.f44407b.setLineColors(getThemedColor(i14), getThemedColor(i15), getThemedColor(i16));
        this.f44407b.setMaxLines(1);
        this.f44407b.setLines(1);
        this.f44407b.setSingleLine(true);
        w9 w9Var7 = this.f44407b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        w9Var7.setGravity(i10);
        this.f44407b.setInputType(49152);
        this.f44407b.setImeOptions(6);
        this.f44407b.setHint(LocaleController.getString(R.string.LastName));
        this.f44407b.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        this.f44407b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f44407b.setCursorWidth(1.5f);
        linearLayout.addView(this.f44407b, g7.e6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f44407b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final x9 f43408b;

            {
                this.f43408b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            x9 x9Var = this.f43408b;
                            x9Var.f44407b.requestFocus();
                            w9 w9Var62 = x9Var.f44407b;
                            w9Var62.setSelection(w9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f43408b.f44408c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f44406a.setText(user.first_name);
            w9 w9Var8 = this.f44406a;
            w9Var8.setSelection(w9Var8.length());
            this.f44407b.setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        w9 w9Var = this.f44406a;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w9Var, 4, null, null, null, null, i9));
        w9 w9Var2 = this.f44406a;
        int i10 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w9Var2, 8388608, null, null, null, null, i10));
        w9 w9Var3 = this.f44406a;
        int i11 = org.telegram.ui.ActionBar.f6.f23127k6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w9Var3, 32, null, null, null, null, i11));
        w9 w9Var4 = this.f44406a;
        int i12 = org.telegram.ui.ActionBar.f6.f23144l6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w9Var4, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44407b, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44407b, 8388608, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44407b, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44407b, 65568, null, null, null, null, i12));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f44406a.requestFocus();
            AndroidUtilities.showKeyboard(this.f44406a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new kt0(this, 18), 100L);
        }
    }
}
