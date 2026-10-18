package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ua extends org.telegram.ui.ActionBar.n2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public ra E;
    public ta F;
    public org.telegram.ui.Cells.y1 G;
    public org.telegram.ui.ActionBar.u0 f41946a;
    public org.telegram.ui.Components.im0 f41947b;
    public la f41948c;
    public boolean d;
    public int e;
    public String f41949f;
    public i0 h;
    public boolean f41950n;
    public String f41951r;
    public final ArrayList f41952s;
    public final ArrayList v;
    public final ArrayList f41953w;
    public final long f41954x;
    public oa f41955y;

    public ua(Bundle bundle) {
        super(bundle);
        this.f41951r = "";
        this.f41952s = new ArrayList();
        this.v = new ArrayList();
        this.f41953w = new ArrayList();
        if (bundle != null) {
            this.f41954x = bundle.getLong("bot_id");
        }
    }

    public static void U(ua uaVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.f5.e0(uaVar.currentAccount, tL_error, uaVar, updateusername, new Object[0]);
        uaVar.h0();
    }

    public static void V(ua uaVar, int i10) {
        ConnectionsManager.getInstance(uaVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(ua uaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        uaVar.e = ConnectionsManager.getInstance(uaVar.currentAccount).sendRequest(checkusername, new ea(uaVar, str, checkusername, 0), 2);
    }

    public static void X(ua uaVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user) {
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(uaVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(uaVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(uaVar.currentAccount).saveConfig(true);
        uaVar.finishFragment();
    }

    public static void Y(ua uaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = uaVar.f41954x;
        ArrayList arrayList = uaVar.v;
        ArrayList arrayList2 = uaVar.f41952s;
        if (!uaVar.d) {
            return;
        }
        uaVar.d = false;
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (((TLRPC.TL_username) arrayList2.get(i10)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList2.get(i10)).username);
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((TLRPC.TL_username) arrayList.get(i11)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList.get(i11)).username);
            }
        }
        if (j10 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = MessagesController.getInstance(uaVar.currentAccount).getInputUser(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        uaVar.getConnectionsManager().sendRequest(reorderusernames, new ci.e6(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(uaVar.currentAccount).getUser(Long.valueOf(uaVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(uaVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(ua uaVar) {
        if (uaVar.f41954x != 0) {
            uaVar.finishFragment();
            return;
        }
        if (uaVar.f41951r.startsWith("@")) {
            uaVar.f41951r = uaVar.f41951r.substring(1);
        }
        if (!uaVar.f41951r.isEmpty() && !uaVar.d0(uaVar.f41951r)) {
            uaVar.h0();
            return;
        }
        TLRPC.User f02 = uaVar.f0();
        if (uaVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(uaVar.f41951r)) {
                uaVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(uaVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = uaVar.f41951r;
            NotificationCenter.getInstance(uaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(uaVar.currentAccount).sendRequest(updateusername, new ea(uaVar, b2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(uaVar.currentAccount).bindRequestToGuid(sendRequest, uaVar.classGuid);
            b2Var.setOnCancelListener(new ai.e0(uaVar, sendRequest, 1));
            b2Var.show();
        }
    }

    public static int b0(ua uaVar) {
        return uaVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 0));
        this.f41946a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f41951r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f41951r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f41951r == null && (str = user.username) != null) {
                this.f41951r = str;
            }
            if (this.f41951r == null) {
                this.f41951r = "";
            }
            this.f41952s.clear();
            ArrayList arrayList = this.v;
            arrayList.clear();
            for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                if (user.usernames.get(i11).active) {
                    arrayList.add(user.usernames.get(i11));
                }
            }
            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                if (!user.usernames.get(i12).active) {
                    arrayList.add(user.usernames.get(i12));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f41947b = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f41947b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20935a7));
        this.f41947b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.im0 im0Var2 = this.f41947b;
        la laVar = new la(this);
        this.f41948c = laVar;
        im0Var2.setAdapter(laVar);
        this.f41947b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21082i6));
        new s4.y(new pa(this)).d(this.f41947b);
        ((FrameLayout) this.fragmentView).addView(this.f41947b, w7.z5.d(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new di.d(6));
        this.f41947b.setOnItemClickListener(new ja(this));
        AndroidUtilities.runOnUIThread(new ut0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.y1 y1Var = this.G;
        if (y1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y1Var.setVisibility(i10);
            ta taVar = this.F;
            if (taVar != null) {
                ta.a(taVar);
            }
        }
        i0 i0Var = this.h;
        if (i0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i0Var);
            this.h = null;
            this.f41949f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.y1 y1Var2 = this.G;
                        if (y1Var2 != null) {
                            y1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.y1 y1Var3 = this.G;
                            int i12 = org.telegram.ui.ActionBar.h6.f21214p7;
                            y1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                            ta taVar2 = this.F;
                            if (taVar2 != null) {
                                ta.a(taVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.y1 y1Var4 = this.G;
                        if (y1Var4 != null) {
                            y1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.y1 y1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.h6.f21214p7;
                            y1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                            ta taVar3 = this.F;
                            if (taVar3 != null) {
                                ta.a(taVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.y1 y1Var6 = this.G;
                if (y1Var6 != null) {
                    y1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.y1 y1Var7 = this.G;
                    int i14 = org.telegram.ui.ActionBar.h6.f21214p7;
                    y1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                    ta taVar4 = this.F;
                    if (taVar4 != null) {
                        ta.a(taVar4);
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                org.telegram.ui.Cells.y1 y1Var8 = this.G;
                if (y1Var8 != null) {
                    y1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.y1 y1Var9 = this.G;
                    int i15 = org.telegram.ui.ActionBar.h6.f21214p7;
                    y1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                    ta taVar5 = this.F;
                    if (taVar5 != null) {
                        ta.a(taVar5);
                        return false;
                    }
                }
            } else {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.y1 y1Var10 = this.G;
                    if (y1Var10 != null) {
                        y1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.y1 y1Var11 = this.G;
                        int i16 = org.telegram.ui.ActionBar.h6.f21345w6;
                        y1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        ta taVar6 = this.F;
                        if (taVar6 != null) {
                            ta.a(taVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.y1 y1Var12 = this.G;
                if (y1Var12 != null) {
                    y1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.y1 y1Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.h6.F6;
                    y1Var13.setTag(Integer.valueOf(i17));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    ta taVar7 = this.F;
                    if (taVar7 != null) {
                        ta.a(taVar7);
                    }
                }
                this.f41949f = str;
                i0 i0Var2 = new i0(11, this, str);
                this.h = i0Var2;
                AndroidUtilities.runOnUIThread(i0Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.y1 y1Var14 = this.G;
            if (y1Var14 != null) {
                y1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.y1 y1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.h6.f21214p7;
                y1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                ta taVar8 = this.F;
                if (taVar8 != null) {
                    ta.a(taVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        oa oaVar = this.f41955y;
        if (oaVar != null) {
            if (!oaVar.f39717a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f41955y.f39717a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f41955y.f39717a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f41955y.f39717a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.f41954x;
        if (j10 != 0) {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.f41954x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20993d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f41947b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f41947b.getChildCount(); i10++) {
            View childAt = this.f41947b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.l4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.l4) childAt).getTextView());
            } else if (childAt instanceof ta) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof oa) {
                oa oaVar = (oa) childAt;
                AndroidUtilities.shakeViewSpring(oaVar.f39717a);
                AndroidUtilities.shakeViewSpring(oaVar.f39718b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ua.i0(int, boolean, boolean):void");
    }

    public final void j0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == tL_username) {
                    i0(i10 + 4, z10, z11);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            e0(false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            e0(false);
        }
    }
}
