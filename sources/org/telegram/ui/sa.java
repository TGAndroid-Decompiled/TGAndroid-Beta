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
public final class sa extends org.telegram.ui.ActionBar.o2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public pa E;
    public ra F;
    public org.telegram.ui.Cells.x1 G;
    public org.telegram.ui.ActionBar.w0 f37429a;
    public org.telegram.ui.Components.ml0 f37430b;
    public ja f37431c;
    public boolean d;
    public int e;
    public String f37432f;
    public l4 h;
    public boolean f37433n;
    public String f37434r;
    public final ArrayList f37435s;
    public final ArrayList v;
    public final ArrayList f37436w;
    public final long f37437x;
    public ma f37438y;

    public sa(Bundle bundle) {
        super(bundle);
        this.f37434r = "";
        this.f37435s = new ArrayList();
        this.v = new ArrayList();
        this.f37436w = new ArrayList();
        if (bundle != null) {
            this.f37437x = bundle.getLong("bot_id");
        }
    }

    public static void U(sa saVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.c5.f0(saVar.currentAccount, tL_error, saVar, updateusername, new Object[0]);
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

    public static void X(sa saVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user) {
        try {
            c2Var.dismiss();
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
        long j3 = saVar.f37437x;
        ArrayList arrayList = saVar.v;
        ArrayList arrayList2 = saVar.f37435s;
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
        saVar.getConnectionsManager().sendRequest(reorderusernames, new ai.t7(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(saVar.currentAccount).getUser(Long.valueOf(saVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(saVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(sa saVar) {
        if (saVar.f37437x != 0) {
            saVar.finishFragment();
            return;
        }
        if (saVar.f37434r.startsWith("@")) {
            saVar.f37434r = saVar.f37434r.substring(1);
        }
        if (!saVar.f37434r.isEmpty() && !saVar.d0(saVar.f37434r)) {
            saVar.h0();
            return;
        }
        TLRPC.User f02 = saVar.f0();
        if (saVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(saVar.f37434r)) {
                saVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(saVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = saVar.f37434r;
            NotificationCenter.getInstance(saVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(saVar.currentAccount).sendRequest(updateusername, new ca(saVar, c2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(saVar.currentAccount).bindRequestToGuid(sendRequest, saVar.classGuid);
            c2Var.setOnCancelListener(new da(saVar, sendRequest, 0));
            c2Var.show();
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
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 27));
        this.f37429a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f37434r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f37434r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f37434r == null && (str = user.username) != null) {
                this.f37434r = str;
            }
            if (this.f37434r == null) {
                this.f37434r = "";
            }
            this.f37435s.clear();
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
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f37430b = ml0Var;
        ml0Var.q1();
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7));
        this.f37430b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ml0 ml0Var2 = this.f37430b;
        ja jaVar = new ja(this);
        this.f37431c = jaVar;
        ml0Var2.setAdapter(jaVar);
        this.f37430b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18952i6));
        new s4.y(new na(this)).e(this.f37430b);
        ((FrameLayout) this.fragmentView).addView(this.f37430b, w7.x5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new bi.d(6));
        this.f37430b.setOnItemClickListener(new ha(this));
        AndroidUtilities.runOnUIThread(new ou0(this, 19), 40L);
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
            ra raVar = this.F;
            if (raVar != null) {
                ra.a(raVar);
            }
        }
        l4 l4Var = this.h;
        if (l4Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l4Var);
            this.h = null;
            this.f37432f = null;
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
                            int i12 = org.telegram.ui.ActionBar.j6.f19082p7;
                            x1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                            ra raVar2 = this.F;
                            if (raVar2 != null) {
                                ra.a(raVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var4 = this.G;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.j6.f19082p7;
                            x1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                            ra raVar3 = this.F;
                            if (raVar3 != null) {
                                ra.a(raVar3);
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
                    int i14 = org.telegram.ui.ActionBar.j6.f19082p7;
                    x1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
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
                org.telegram.ui.Cells.x1 x1Var8 = this.G;
                if (x1Var8 != null) {
                    x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.x1 x1Var9 = this.G;
                    int i15 = org.telegram.ui.ActionBar.j6.f19082p7;
                    x1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
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
                    org.telegram.ui.Cells.x1 x1Var10 = this.G;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.G;
                        int i16 = org.telegram.ui.ActionBar.j6.f19210w6;
                        x1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        ra raVar6 = this.F;
                        if (raVar6 != null) {
                            ra.a(raVar6);
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
                    ra raVar7 = this.F;
                    if (raVar7 != null) {
                        ra.a(raVar7);
                    }
                }
                this.f37432f = str;
                l4 l4Var2 = new l4(9, this, str);
                this.h = l4Var2;
                AndroidUtilities.runOnUIThread(l4Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.x1 x1Var14 = this.G;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.j6.f19082p7;
                x1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                ra raVar8 = this.F;
                if (raVar8 != null) {
                    ra.a(raVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ma maVar = this.f37438y;
        if (maVar != null) {
            if (!maVar.f35733a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f37438y.f35733a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f37438y.f35733a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f37438y.f35733a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j3 = this.f37437x;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j3 = this.f37437x;
        if (j3 != 0) {
            return j3;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final org.telegram.ui.Components.ml0 getListViewForSimpleGlass() {
        return this.f37430b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18862d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19194v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19158t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f37430b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f37430b.getChildCount(); i10++) {
            View childAt = this.f37430b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.l4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.l4) childAt).getTextView());
            } else if (childAt instanceof ra) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ma) {
                ma maVar = (ma) childAt;
                AndroidUtilities.shakeViewSpring(maVar.f35733a);
                AndroidUtilities.shakeViewSpring(maVar.f35734b);
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
