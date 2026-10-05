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
public final class sa extends org.telegram.ui.ActionBar.n2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public pa E;
    public ra F;
    public org.telegram.ui.Cells.y1 G;
    public org.telegram.ui.ActionBar.v0 f40411a;
    public org.telegram.ui.Components.zl0 f40412b;
    public ja f40413c;
    public boolean d;
    public int f40414e;
    public String f40415f;
    public org.telegram.ui.ActionBar.g6 h;
    public boolean f40416n;
    public String f40417r;
    public final ArrayList f40418s;
    public final ArrayList v;
    public final ArrayList f40419w;
    public final long f40420x;
    public ma f40421y;

    public sa(Bundle bundle) {
        super(bundle);
        this.f40417r = "";
        this.f40418s = new ArrayList();
        this.v = new ArrayList();
        this.f40419w = new ArrayList();
        if (bundle != null) {
            this.f40420x = bundle.getLong("bot_id");
        }
    }

    public static void S(sa saVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.e5.f0(saVar.currentAccount, tL_error, saVar, updateusername, new Object[0]);
        saVar.h0();
    }

    public static void T(sa saVar, int i10) {
        ConnectionsManager.getInstance(saVar.currentAccount).cancelRequest(i10, true);
    }

    public static void U(sa saVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        saVar.f40414e = ConnectionsManager.getInstance(saVar.currentAccount).sendRequest(checkusername, new ca(saVar, str, checkusername, 0), 2);
    }

    public static void W(sa saVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user) {
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(saVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(saVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(saVar.currentAccount).saveConfig(true);
        saVar.finishFragment();
    }

    public static void X(sa saVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = saVar.f40420x;
        ArrayList arrayList = saVar.v;
        ArrayList arrayList2 = saVar.f40418s;
        if (!saVar.d) {
            return;
        }
        saVar.d = false;
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
        if (j3 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = MessagesController.getInstance(saVar.currentAccount).getInputUser(j3);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        saVar.getConnectionsManager().sendRequest(reorderusernames, new ai.u7(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(saVar.currentAccount).getUser(Long.valueOf(saVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(saVar.currentAccount).putUser(user, false, true);
    }

    public static void Y(sa saVar) {
        if (saVar.f40420x != 0) {
            saVar.finishFragment();
            return;
        }
        if (saVar.f40417r.startsWith("@")) {
            saVar.f40417r = saVar.f40417r.substring(1);
        }
        if (!saVar.f40417r.isEmpty() && !saVar.d0(saVar.f40417r)) {
            saVar.h0();
            return;
        }
        TLRPC.User f02 = saVar.f0();
        if (saVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(saVar.f40417r)) {
                saVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(saVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = saVar.f40417r;
            NotificationCenter.getInstance(saVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(saVar.currentAccount).sendRequest(updateusername, new ca(saVar, b2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(saVar.currentAccount).bindRequestToGuid(sendRequest, saVar.classGuid);
            b2Var.setOnCancelListener(new da(saVar, sendRequest, 0));
            b2Var.show();
        }
    }

    public static int b0(sa saVar) {
        return saVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 27));
        this.f40411a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f40417r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f40417r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f40417r == null && (str = user.username) != null) {
                this.f40417r = str;
            }
            if (this.f40417r == null) {
                this.f40417r = "";
            }
            this.f40418s.clear();
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
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f40412b = zl0Var;
        zl0Var.r1();
        this.f40412b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.f40412b;
        ja jaVar = new ja(this);
        this.f40413c = jaVar;
        zl0Var2.setAdapter(jaVar);
        this.f40412b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20918i6));
        this.f40412b.setSectionsDrawBackground(true);
        new s4.y(new na(this)).e(this.f40412b);
        ((FrameLayout) this.fragmentView).addView(this.f40412b, w7.z5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new bi.d(6));
        this.f40412b.setOnItemClickListener(new ha(this));
        AndroidUtilities.runOnUIThread(new hu0(this, 19), 40L);
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
            ra raVar = this.F;
            if (raVar != null) {
                ra.a(raVar);
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.h;
        if (g6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            this.h = null;
            this.f40415f = null;
            if (this.f40414e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f40414e, true);
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
                            int i12 = org.telegram.ui.ActionBar.i6.f21049p7;
                            y1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                            ra raVar2 = this.F;
                            if (raVar2 != null) {
                                ra.a(raVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.y1 y1Var4 = this.G;
                        if (y1Var4 != null) {
                            y1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.y1 y1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.i6.f21049p7;
                            y1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                            ra raVar3 = this.F;
                            if (raVar3 != null) {
                                ra.a(raVar3);
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
                    int i14 = org.telegram.ui.ActionBar.i6.f21049p7;
                    y1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                    ra raVar4 = this.F;
                    if (raVar4 != null) {
                        ra.a(raVar4);
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
                    int i15 = org.telegram.ui.ActionBar.i6.f21049p7;
                    y1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                    ra raVar5 = this.F;
                    if (raVar5 != null) {
                        ra.a(raVar5);
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
                        int i16 = org.telegram.ui.ActionBar.i6.f21180w6;
                        y1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                        ra raVar6 = this.F;
                        if (raVar6 != null) {
                            ra.a(raVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.y1 y1Var12 = this.G;
                if (y1Var12 != null) {
                    y1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.y1 y1Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.i6.F6;
                    y1Var13.setTag(Integer.valueOf(i17));
                    this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                    ra raVar7 = this.F;
                    if (raVar7 != null) {
                        ra.a(raVar7);
                    }
                }
                this.f40415f = str;
                org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(13, this, str);
                this.h = g6Var2;
                AndroidUtilities.runOnUIThread(g6Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.y1 y1Var14 = this.G;
            if (y1Var14 != null) {
                y1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.y1 y1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.i6.f21049p7;
                y1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i18, false));
                ra raVar8 = this.F;
                if (raVar8 != null) {
                    ra.a(raVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ma maVar = this.f40421y;
        if (maVar != null) {
            if (!maVar.f38551a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f40421y.f38551a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f40421y.f38551a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f40421y.f38551a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j3 = this.f40420x;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j3 = this.f40420x;
        if (j3 != 0) {
            return j3;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f40412b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f40412b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f40412b.getChildCount(); i10++) {
            View childAt = this.f40412b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof ra) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ma) {
                ma maVar = (ma) childAt;
                AndroidUtilities.shakeViewSpring(maVar.f38551a);
                AndroidUtilities.shakeViewSpring(maVar.f38552b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sa.i0(int, boolean, boolean):void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
