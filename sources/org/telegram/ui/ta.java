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
public final class ta extends org.telegram.ui.ActionBar.o2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public qa E;
    public sa F;
    public org.telegram.ui.Cells.y1 G;
    public org.telegram.ui.ActionBar.w0 f37735a;
    public org.telegram.ui.Components.yl0 f37736b;
    public ka f37737c;
    public boolean d;
    public int e;
    public String f37738f;
    public n h;
    public boolean f37739n;
    public String f37740r;
    public final ArrayList f37741s;
    public final ArrayList v;
    public final ArrayList f37742w;
    public final long f37743x;
    public na f37744y;

    public ta(Bundle bundle) {
        super(bundle);
        this.f37740r = "";
        this.f37741s = new ArrayList();
        this.v = new ArrayList();
        this.f37742w = new ArrayList();
        if (bundle != null) {
            this.f37743x = bundle.getLong("bot_id");
        }
    }

    public static void U(ta taVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.e5.f0(taVar.currentAccount, tL_error, taVar, updateusername, new Object[0]);
        taVar.h0();
    }

    public static void V(ta taVar, int i10) {
        ConnectionsManager.getInstance(taVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(ta taVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        taVar.e = ConnectionsManager.getInstance(taVar.currentAccount).sendRequest(checkusername, new da(taVar, str, checkusername, 0), 2);
    }

    public static void X(ta taVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user) {
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(taVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(taVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(taVar.currentAccount).saveConfig(true);
        taVar.finishFragment();
    }

    public static void Y(ta taVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = taVar.f37743x;
        ArrayList arrayList = taVar.v;
        ArrayList arrayList2 = taVar.f37741s;
        if (!taVar.d) {
            return;
        }
        taVar.d = false;
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
            reorderusernames3.bot = MessagesController.getInstance(taVar.currentAccount).getInputUser(j3);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        taVar.getConnectionsManager().sendRequest(reorderusernames, new ai.u7(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(taVar.currentAccount).getUser(Long.valueOf(taVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(taVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(ta taVar) {
        if (taVar.f37743x != 0) {
            taVar.finishFragment();
            return;
        }
        if (taVar.f37740r.startsWith("@")) {
            taVar.f37740r = taVar.f37740r.substring(1);
        }
        if (!taVar.f37740r.isEmpty() && !taVar.d0(taVar.f37740r)) {
            taVar.h0();
            return;
        }
        TLRPC.User f02 = taVar.f0();
        if (taVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(taVar.f37740r)) {
                taVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(taVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = taVar.f37740r;
            NotificationCenter.getInstance(taVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(taVar.currentAccount).sendRequest(updateusername, new da(taVar, c2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(taVar.currentAccount).bindRequestToGuid(sendRequest, taVar.classGuid);
            c2Var.setOnCancelListener(new ea(taVar, sendRequest, 0));
            c2Var.show();
        }
    }

    public static int b0(ta taVar) {
        return taVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 27));
        this.f37735a = this.actionBar.o().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f37740r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f37740r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f37740r == null && (str = user.username) != null) {
                this.f37740r = str;
            }
            if (this.f37740r == null) {
                this.f37740r = "";
            }
            this.f37741s.clear();
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
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f37736b = yl0Var;
        yl0Var.q1();
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7));
        this.f37736b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.yl0 yl0Var2 = this.f37736b;
        ka kaVar = new ka(this);
        this.f37737c = kaVar;
        yl0Var2.setAdapter(kaVar);
        this.f37736b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19147i6));
        new s4.y(new oa(this)).e(this.f37736b);
        ((FrameLayout) this.fragmentView).addView(this.f37736b, w7.y5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new bi.d(6));
        this.f37736b.setOnItemClickListener(new ia(this));
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
            sa saVar = this.F;
            if (saVar != null) {
                sa.a(saVar);
            }
        }
        n nVar = this.h;
        if (nVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nVar);
            this.h = null;
            this.f37738f = null;
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
                            int i12 = org.telegram.ui.ActionBar.i6.f19278p7;
                            y1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                            sa saVar2 = this.F;
                            if (saVar2 != null) {
                                sa.a(saVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.y1 y1Var4 = this.G;
                        if (y1Var4 != null) {
                            y1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.y1 y1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.i6.f19278p7;
                            y1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                            sa saVar3 = this.F;
                            if (saVar3 != null) {
                                sa.a(saVar3);
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
                    int i14 = org.telegram.ui.ActionBar.i6.f19278p7;
                    y1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                    sa saVar4 = this.F;
                    if (saVar4 != null) {
                        sa.a(saVar4);
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
                    int i15 = org.telegram.ui.ActionBar.i6.f19278p7;
                    y1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                    sa saVar5 = this.F;
                    if (saVar5 != null) {
                        sa.a(saVar5);
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
                        int i16 = org.telegram.ui.ActionBar.i6.f19408w6;
                        y1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                        sa saVar6 = this.F;
                        if (saVar6 != null) {
                            sa.a(saVar6);
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
                    sa saVar7 = this.F;
                    if (saVar7 != null) {
                        sa.a(saVar7);
                    }
                }
                this.f37738f = str;
                n nVar2 = new n(12, this, str);
                this.h = nVar2;
                AndroidUtilities.runOnUIThread(nVar2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.y1 y1Var14 = this.G;
            if (y1Var14 != null) {
                y1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.y1 y1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.i6.f19278p7;
                y1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i18, false));
                sa saVar8 = this.F;
                if (saVar8 != null) {
                    sa.a(saVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        na naVar = this.f37744y;
        if (naVar != null) {
            if (!naVar.f35904a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f37744y.f35904a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f37744y.f35904a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f37744y.f35904a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j3 = this.f37743x;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j3 = this.f37743x;
        if (j3 != 0) {
            return j3;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.f37736b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f37736b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f37736b.getChildCount(); i10++) {
            View childAt = this.f37736b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof sa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof na) {
                na naVar = (na) childAt;
                AndroidUtilities.shakeViewSpring(naVar.f35904a);
                AndroidUtilities.shakeViewSpring(naVar.f35905b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ta.i0(int, boolean, boolean):void");
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
