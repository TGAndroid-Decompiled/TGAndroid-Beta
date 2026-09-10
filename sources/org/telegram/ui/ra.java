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
public final class ra extends org.telegram.ui.ActionBar.p2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public oa E;
    public qa F;
    public org.telegram.ui.Cells.x1 G;
    public org.telegram.ui.ActionBar.w0 f36272a;
    public org.telegram.ui.Components.vl0 f36273b;
    public ia f36274c;
    public boolean d;
    public int e;
    public String f36275f;
    public n h;
    public boolean f36276n;
    public String f36277r;
    public final ArrayList f36278s;
    public final ArrayList v;
    public final ArrayList f36279w;
    public final long f36280x;
    public la f36281y;

    public ra(Bundle bundle) {
        super(bundle);
        this.f36277r = "";
        this.f36278s = new ArrayList();
        this.v = new ArrayList();
        this.f36279w = new ArrayList();
        if (bundle != null) {
            this.f36280x = bundle.getLong("bot_id");
        }
    }

    public static void U(ra raVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.d5.f0(raVar.currentAccount, tL_error, raVar, updateusername, new Object[0]);
        raVar.h0();
    }

    public static void V(ra raVar, int i10) {
        ConnectionsManager.getInstance(raVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(ra raVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        raVar.e = ConnectionsManager.getInstance(raVar.currentAccount).sendRequest(checkusername, new aa(raVar, str, checkusername, 0), 2);
    }

    public static void X(ra raVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user) {
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(raVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(raVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(raVar.currentAccount).saveConfig(true);
        raVar.finishFragment();
    }

    public static void Y(ra raVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = raVar.f36280x;
        ArrayList arrayList = raVar.v;
        ArrayList arrayList2 = raVar.f36278s;
        if (!raVar.d) {
            return;
        }
        raVar.d = false;
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
            reorderusernames3.bot = MessagesController.getInstance(raVar.currentAccount).getInputUser(j3);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        raVar.getConnectionsManager().sendRequest(reorderusernames, new bi.g1(5));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(raVar.currentAccount).getUser(Long.valueOf(raVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(raVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(ra raVar) {
        if (raVar.f36280x != 0) {
            raVar.finishFragment();
            return;
        }
        if (raVar.f36277r.startsWith("@")) {
            raVar.f36277r = raVar.f36277r.substring(1);
        }
        if (!raVar.f36277r.isEmpty() && !raVar.d0(raVar.f36277r)) {
            raVar.h0();
            return;
        }
        TLRPC.User f02 = raVar.f0();
        if (raVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(raVar.f36277r)) {
                raVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(raVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = raVar.f36277r;
            NotificationCenter.getInstance(raVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(raVar.currentAccount).sendRequest(updateusername, new aa(raVar, d2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(raVar.currentAccount).bindRequestToGuid(sendRequest, raVar.classGuid);
            d2Var.setOnCancelListener(new ba(raVar, sendRequest, 0));
            d2Var.show();
        }
    }

    public static int b0(ra raVar) {
        return raVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 27));
        this.f36272a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f36277r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f36277r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f36277r == null && (str = user.username) != null) {
                this.f36277r = str;
            }
            if (this.f36277r == null) {
                this.f36277r = "";
            }
            this.f36278s.clear();
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
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f36273b = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f36273b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
        this.f36273b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var2 = this.f36273b;
        ia iaVar = new ia(this);
        this.f36274c = iaVar;
        vl0Var2.setAdapter(iaVar);
        this.f36273b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6));
        new s4.y(new ma(this)).d(this.f36273b);
        ((FrameLayout) this.fragmentView).addView(this.f36273b, w7.a6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ai.h(6));
        this.f36273b.setOnItemClickListener(new ga(this));
        AndroidUtilities.runOnUIThread(new mu0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.x1 x1Var = this.G;
        if (x1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x1Var.setVisibility(i10);
            qa qaVar = this.F;
            if (qaVar != null) {
                qa.a(qaVar);
            }
        }
        n nVar = this.h;
        if (nVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nVar);
            this.h = null;
            this.f36275f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.x1 x1Var2 = this.G;
                        if (x1Var2 != null) {
                            x1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.x1 x1Var3 = this.G;
                            int i12 = org.telegram.ui.ActionBar.j6.f18144p7;
                            x1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                            qa qaVar2 = this.F;
                            if (qaVar2 != null) {
                                qa.a(qaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var4 = this.G;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.j6.f18144p7;
                            x1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                            qa qaVar3 = this.F;
                            if (qaVar3 != null) {
                                qa.a(qaVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.x1 x1Var6 = this.G;
                if (x1Var6 != null) {
                    x1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.x1 x1Var7 = this.G;
                    int i14 = org.telegram.ui.ActionBar.j6.f18144p7;
                    x1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                    qa qaVar4 = this.F;
                    if (qaVar4 != null) {
                        qa.a(qaVar4);
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                org.telegram.ui.Cells.x1 x1Var8 = this.G;
                if (x1Var8 != null) {
                    x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.x1 x1Var9 = this.G;
                    int i15 = org.telegram.ui.ActionBar.j6.f18144p7;
                    x1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                    qa qaVar5 = this.F;
                    if (qaVar5 != null) {
                        qa.a(qaVar5);
                        return false;
                    }
                }
            } else {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.x1 x1Var10 = this.G;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.G;
                        int i16 = org.telegram.ui.ActionBar.j6.f18271w6;
                        x1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        qa qaVar6 = this.F;
                        if (qaVar6 != null) {
                            qa.a(qaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.x1 x1Var12 = this.G;
                if (x1Var12 != null) {
                    x1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.x1 x1Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.j6.F6;
                    x1Var13.setTag(Integer.valueOf(i17));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                    qa qaVar7 = this.F;
                    if (qaVar7 != null) {
                        qa.a(qaVar7);
                    }
                }
                this.f36275f = str;
                n nVar2 = new n(12, this, str);
                this.h = nVar2;
                AndroidUtilities.runOnUIThread(nVar2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.x1 x1Var14 = this.G;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.j6.f18144p7;
                x1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                qa qaVar8 = this.F;
                if (qaVar8 != null) {
                    qa.a(qaVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        la laVar = this.f36281y;
        if (laVar != null) {
            if (!laVar.f34625a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f36281y.f34625a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f36281y.f34625a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f36281y.f34625a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j3 = this.f36280x;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j3 = this.f36280x;
        if (j3 != 0) {
            return j3;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f36273b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f36273b.getChildCount(); i10++) {
            View childAt = this.f36273b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof qa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof la) {
                la laVar = (la) childAt;
                AndroidUtilities.shakeViewSpring(laVar.f34625a);
                AndroidUtilities.shakeViewSpring(laVar.f34626b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ra.i0(int, boolean, boolean):void");
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
