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
public final class va extends org.telegram.ui.ActionBar.m2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public sa E;
    public ua F;
    public org.telegram.ui.Cells.y1 G;
    public org.telegram.ui.ActionBar.u0 f40622a;
    public org.telegram.ui.Components.mm0 f40623b;
    public ma f40624c;
    public boolean d;
    public int e;
    public String f40625f;
    public org.telegram.messenger.voip.p0 h;
    public boolean f40626n;
    public String f40627r;
    public final ArrayList f40628s;
    public final ArrayList v;
    public final ArrayList f40629w;
    public final long f40630x;
    public pa f40631y;

    public va(Bundle bundle) {
        super(bundle);
        this.f40627r = "";
        this.f40628s = new ArrayList();
        this.v = new ArrayList();
        this.f40629w = new ArrayList();
        if (bundle != null) {
            this.f40630x = bundle.getLong("bot_id");
        }
    }

    public static void U(va vaVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            a2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.g5.e0(vaVar.currentAccount, tL_error, vaVar, updateusername, new Object[0]);
        vaVar.h0();
    }

    public static void V(va vaVar, int i10) {
        ConnectionsManager.getInstance(vaVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(va vaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        vaVar.e = ConnectionsManager.getInstance(vaVar.currentAccount).sendRequest(checkusername, new fa(vaVar, str, checkusername, 0), 2);
    }

    public static void X(va vaVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user) {
        try {
            a2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(vaVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(vaVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(vaVar.currentAccount).saveConfig(true);
        vaVar.finishFragment();
    }

    public static void Y(va vaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = vaVar.f40630x;
        ArrayList arrayList = vaVar.v;
        ArrayList arrayList2 = vaVar.f40628s;
        if (!vaVar.d) {
            return;
        }
        vaVar.d = false;
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
            reorderusernames3.bot = MessagesController.getInstance(vaVar.currentAccount).getInputUser(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        vaVar.getConnectionsManager().sendRequest(reorderusernames, new bi.g7(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(vaVar.currentAccount).getUser(Long.valueOf(vaVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(vaVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(va vaVar) {
        if (vaVar.f40630x != 0) {
            vaVar.finishFragment();
            return;
        }
        if (vaVar.f40627r.startsWith("@")) {
            vaVar.f40627r = vaVar.f40627r.substring(1);
        }
        if (!vaVar.f40627r.isEmpty() && !vaVar.d0(vaVar.f40627r)) {
            vaVar.h0();
            return;
        }
        TLRPC.User f02 = vaVar.f0();
        if (vaVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(vaVar.f40627r)) {
                vaVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(vaVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = vaVar.f40627r;
            NotificationCenter.getInstance(vaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(vaVar.currentAccount).sendRequest(updateusername, new fa(vaVar, a2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(vaVar.currentAccount).bindRequestToGuid(sendRequest, vaVar.classGuid);
            a2Var.setOnCancelListener(new ga(vaVar, sendRequest, 0));
            a2Var.show();
        }
    }

    public static int b0(va vaVar) {
        return vaVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 29));
        this.f40622a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f40627r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f40627r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f40627r == null && (str = user.username) != null) {
                this.f40627r = str;
            }
            if (this.f40627r == null) {
                this.f40627r = "";
            }
            this.f40628s.clear();
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
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f40623b = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40623b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
        this.f40623b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f40623b;
        ma maVar = new ma(this);
        this.f40624c = maVar;
        mm0Var2.setAdapter(maVar);
        this.f40623b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6));
        new s4.y(new qa(this)).d(this.f40623b);
        ((FrameLayout) this.fragmentView).addView(this.f40623b, w7.z5.d(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ci.d(6));
        this.f40623b.setOnItemClickListener(new ka(this));
        AndroidUtilities.runOnUIThread(new su0(this, 19), 40L);
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
            ua uaVar = this.F;
            if (uaVar != null) {
                ua.a(uaVar);
            }
        }
        org.telegram.messenger.voip.p0 p0Var = this.h;
        if (p0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p0Var);
            this.h = null;
            this.f40625f = null;
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
                            int i12 = org.telegram.ui.ActionBar.g6.f19822p7;
                            y1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                            ua uaVar2 = this.F;
                            if (uaVar2 != null) {
                                ua.a(uaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.y1 y1Var4 = this.G;
                        if (y1Var4 != null) {
                            y1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.y1 y1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.g6.f19822p7;
                            y1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                            ua uaVar3 = this.F;
                            if (uaVar3 != null) {
                                ua.a(uaVar3);
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
                    int i14 = org.telegram.ui.ActionBar.g6.f19822p7;
                    y1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
                    ua uaVar4 = this.F;
                    if (uaVar4 != null) {
                        ua.a(uaVar4);
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
                    int i15 = org.telegram.ui.ActionBar.g6.f19822p7;
                    y1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                    ua uaVar5 = this.F;
                    if (uaVar5 != null) {
                        ua.a(uaVar5);
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
                        int i16 = org.telegram.ui.ActionBar.g6.f19952w6;
                        y1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
                        ua uaVar6 = this.F;
                        if (uaVar6 != null) {
                            ua.a(uaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.y1 y1Var12 = this.G;
                if (y1Var12 != null) {
                    y1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.y1 y1Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.g6.F6;
                    y1Var13.setTag(Integer.valueOf(i17));
                    this.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
                    ua uaVar7 = this.F;
                    if (uaVar7 != null) {
                        ua.a(uaVar7);
                    }
                }
                this.f40625f = str;
                org.telegram.messenger.voip.p0 p0Var2 = new org.telegram.messenger.voip.p0(22, this, str);
                this.h = p0Var2;
                AndroidUtilities.runOnUIThread(p0Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.y1 y1Var14 = this.G;
            if (y1Var14 != null) {
                y1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.y1 y1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.g6.f19822p7;
                y1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
                ua uaVar8 = this.F;
                if (uaVar8 != null) {
                    ua.a(uaVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        pa paVar = this.f40631y;
        if (paVar != null) {
            if (!paVar.f38860a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f40631y.f38860a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f40631y.f38860a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f40631y.f38860a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.f40630x;
        if (j10 != 0) {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.f40630x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f40623b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f40623b.getChildCount(); i10++) {
            View childAt = this.f40623b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof ua) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof pa) {
                pa paVar = (pa) childAt;
                AndroidUtilities.shakeViewSpring(paVar.f38860a);
                AndroidUtilities.shakeViewSpring(paVar.f38861b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.va.i0(int, boolean, boolean):void");
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
