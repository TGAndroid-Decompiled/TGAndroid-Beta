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
    public org.telegram.ui.ActionBar.u0 f41411a;
    public org.telegram.ui.Components.jm0 f41412b;
    public ja f41413c;
    public boolean d;
    public int e;
    public String f41414f;
    public i0 h;
    public boolean f41415n;
    public String f41416r;
    public final ArrayList f41417s;
    public final ArrayList v;
    public final ArrayList f41418w;
    public final long f41419x;
    public ma f41420y;

    public sa(Bundle bundle) {
        super(bundle);
        this.f41416r = "";
        this.f41417s = new ArrayList();
        this.v = new ArrayList();
        this.f41418w = new ArrayList();
        if (bundle != null) {
            this.f41419x = bundle.getLong("bot_id");
        }
    }

    public static void U(sa saVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.f5.e0(saVar.currentAccount, tL_error, saVar, updateusername, new Object[0]);
        saVar.h0();
    }

    public static void V(sa saVar, int i10) {
        ConnectionsManager.getInstance(saVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(sa saVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        saVar.e = ConnectionsManager.getInstance(saVar.currentAccount).sendRequest(checkusername, new ca(saVar, str, checkusername, 0), 2);
    }

    public static void X(sa saVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user) {
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(saVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(saVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(saVar.currentAccount).saveConfig(true);
        saVar.finishFragment();
    }

    public static void Y(sa saVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = saVar.f41419x;
        ArrayList arrayList = saVar.v;
        ArrayList arrayList2 = saVar.f41417s;
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
        if (j10 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = MessagesController.getInstance(saVar.currentAccount).getInputUser(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        saVar.getConnectionsManager().sendRequest(reorderusernames, new ci.e6(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(saVar.currentAccount).getUser(Long.valueOf(saVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(saVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(sa saVar) {
        if (saVar.f41419x != 0) {
            saVar.finishFragment();
            return;
        }
        if (saVar.f41416r.startsWith("@")) {
            saVar.f41416r = saVar.f41416r.substring(1);
        }
        if (!saVar.f41416r.isEmpty() && !saVar.d0(saVar.f41416r)) {
            saVar.h0();
            return;
        }
        TLRPC.User f02 = saVar.f0();
        if (saVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(saVar.f41416r)) {
                saVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(saVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = saVar.f41416r;
            NotificationCenter.getInstance(saVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(saVar.currentAccount).sendRequest(updateusername, new ca(saVar, b2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(saVar.currentAccount).bindRequestToGuid(sendRequest, saVar.classGuid);
            b2Var.setOnCancelListener(new ai.e0(saVar, sendRequest, 1));
            b2Var.show();
        }
    }

    public static int b0(sa saVar) {
        return saVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 0));
        this.f41411a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f41416r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f41416r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f41416r == null && (str = user.username) != null) {
                this.f41416r = str;
            }
            if (this.f41416r == null) {
                this.f41416r = "";
            }
            this.f41417s.clear();
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
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f41412b = jm0Var;
        jm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f41412b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20932a7));
        this.f41412b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.jm0 jm0Var2 = this.f41412b;
        ja jaVar = new ja(this);
        this.f41413c = jaVar;
        jm0Var2.setAdapter(jaVar);
        this.f41412b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21079i6));
        new s4.y(new na(this)).d(this.f41412b);
        ((FrameLayout) this.fragmentView).addView(this.f41412b, w7.z5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new di.d(6));
        this.f41412b.setOnItemClickListener(new ha(this));
        AndroidUtilities.runOnUIThread(new st0(this, 19), 40L);
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
        i0 i0Var = this.h;
        if (i0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i0Var);
            this.h = null;
            this.f41414f = null;
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
                            int i12 = org.telegram.ui.ActionBar.h6.f21211p7;
                            y1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
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
                            int i13 = org.telegram.ui.ActionBar.h6.f21211p7;
                            y1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
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
                    int i14 = org.telegram.ui.ActionBar.h6.f21211p7;
                    y1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
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
                    int i15 = org.telegram.ui.ActionBar.h6.f21211p7;
                    y1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
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
                        int i16 = org.telegram.ui.ActionBar.h6.f21342w6;
                        y1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
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
                    int i17 = org.telegram.ui.ActionBar.h6.F6;
                    y1Var13.setTag(Integer.valueOf(i17));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                    ra raVar7 = this.F;
                    if (raVar7 != null) {
                        ra.a(raVar7);
                    }
                }
                this.f41414f = str;
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
                int i18 = org.telegram.ui.ActionBar.h6.f21211p7;
                y1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                ra raVar8 = this.F;
                if (raVar8 != null) {
                    ra.a(raVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ma maVar = this.f41420y;
        if (maVar != null) {
            if (!maVar.f39163a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f41420y.f39163a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f41420y.f39163a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f41420y.f39163a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.f41419x;
        if (j10 != 0) {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.f41419x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f41412b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f41412b.getChildCount(); i10++) {
            View childAt = this.f41412b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.l4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.l4) childAt).getTextView());
            } else if (childAt instanceof ra) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ma) {
                ma maVar = (ma) childAt;
                AndroidUtilities.shakeViewSpring(maVar.f39163a);
                AndroidUtilities.shakeViewSpring(maVar.f39164b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sa.i0(int, boolean, boolean):void");
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
