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
public final class w9 extends org.telegram.ui.ActionBar.o2 {
    public v9 f43878a;
    public v9 f43879b;
    public org.telegram.ui.ActionBar.w0 f43880c;
    public org.telegram.ui.ActionBar.c6 d;

    public static void U(w9 w9Var) {
        String str;
        TLRPC.User currentUser = UserConfig.getInstance(w9Var.currentAccount).getCurrentUser();
        if (currentUser != null && w9Var.f43879b.getText() != null && w9Var.f43878a.getText() != null) {
            String obj = w9Var.f43878a.getText().toString();
            String obj2 = w9Var.f43879b.getText().toString();
            String str2 = currentUser.first_name;
            if (str2 == null || !str2.equals(obj) || (str = currentUser.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                currentUser.first_name = obj;
                updateprofile.last_name = obj2;
                currentUser.last_name = obj2;
                TLRPC.User user = MessagesController.getInstance(w9Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(w9Var.currentAccount).getClientUserId()));
                if (user != null) {
                    user.first_name = updateprofile.first_name;
                    user.last_name = updateprofile.last_name;
                }
                UserConfig.getInstance(w9Var.currentAccount).saveConfig(true);
                NotificationCenter.getInstance(w9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(w9Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                ConnectionsManager.getInstance(w9Var.currentAccount).sendRequest(updateprofile, new lh.o5(5));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f23101f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        lVar.B(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 13));
        this.f43880c = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new mh.d(2));
        v9 v9Var = new v9(this, context, 0);
        this.f43878a = v9Var;
        v9Var.setTextSize(1, 18.0f);
        v9 v9Var2 = this.f43878a;
        int i13 = org.telegram.ui.ActionBar.g6.H6;
        v9Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        v9 v9Var3 = this.f43878a;
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        v9Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        this.f43878a.setBackgroundDrawable(null);
        v9 v9Var4 = this.f43878a;
        int i15 = org.telegram.ui.ActionBar.g6.f23189k6;
        int themedColor = getThemedColor(i15);
        int i16 = org.telegram.ui.ActionBar.g6.f23206l6;
        int themedColor2 = getThemedColor(i16);
        int i17 = org.telegram.ui.ActionBar.g6.f23279p7;
        v9Var4.setLineColors(themedColor, themedColor2, getThemedColor(i17));
        this.f43878a.setMaxLines(1);
        this.f43878a.setLines(1);
        this.f43878a.setSingleLine(true);
        v9 v9Var5 = this.f43878a;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        v9Var5.setGravity(i10);
        this.f43878a.setInputType(49152);
        this.f43878a.setImeOptions(5);
        this.f43878a.setHint(LocaleController.getString(R.string.FirstName));
        this.f43878a.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        this.f43878a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f43878a.setCursorWidth(1.5f);
        linearLayout.addView(this.f43878a, i7.f6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f43878a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final w9 f43200b;

            {
                this.f43200b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            w9 w9Var = this.f43200b;
                            w9Var.f43879b.requestFocus();
                            v9 v9Var6 = w9Var.f43879b;
                            v9Var6.setSelection(v9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f43200b.f43880c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        v9 v9Var6 = new v9(this, context, 1);
        this.f43879b = v9Var6;
        v9Var6.setTextSize(1, 18.0f);
        this.f43879b.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        this.f43879b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        this.f43879b.setBackgroundDrawable(null);
        this.f43879b.setLineColors(getThemedColor(i15), getThemedColor(i16), getThemedColor(i17));
        this.f43879b.setMaxLines(1);
        this.f43879b.setLines(1);
        this.f43879b.setSingleLine(true);
        v9 v9Var7 = this.f43879b;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        v9Var7.setGravity(i11);
        this.f43879b.setInputType(49152);
        this.f43879b.setImeOptions(6);
        this.f43879b.setHint(LocaleController.getString(R.string.LastName));
        this.f43879b.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        this.f43879b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f43879b.setCursorWidth(1.5f);
        linearLayout.addView(this.f43879b, i7.f6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f43879b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final w9 f43200b;

            {
                this.f43200b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i18 == 5) {
                            w9 w9Var = this.f43200b;
                            w9Var.f43879b.requestFocus();
                            v9 v9Var62 = w9Var.f43879b;
                            v9Var62.setSelection(v9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i18 == 6) {
                            this.f43200b.f43880c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (user != null) {
            this.f43878a.setText(user.first_name);
            v9 v9Var8 = this.f43878a;
            v9Var8.setSelection(v9Var8.length());
            this.f43879b.setText(user.last_name);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        v9 v9Var = this.f43878a;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v9Var, 4, null, null, null, null, i10));
        v9 v9Var2 = this.f43878a;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v9Var2, 8388608, null, null, null, null, i11));
        v9 v9Var3 = this.f43878a;
        int i12 = org.telegram.ui.ActionBar.g6.f23189k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v9Var3, 32, null, null, null, null, i12));
        v9 v9Var4 = this.f43878a;
        int i13 = org.telegram.ui.ActionBar.g6.f23206l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v9Var4, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43879b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43879b, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43879b, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43879b, 65568, null, null, null, null, i13));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.f43878a.requestFocus();
            AndroidUtilities.showKeyboard(this.f43878a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new it0(this, 18), 100L);
        }
    }
}
