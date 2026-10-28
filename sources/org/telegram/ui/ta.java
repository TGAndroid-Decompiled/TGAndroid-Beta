package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
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
public final class ta extends org.telegram.ui.ActionBar.r2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public qa E;
    public sa F;
    public org.telegram.ui.Cells.w1 G;
    public org.telegram.ui.ActionBar.u5 f43576a;
    public org.telegram.ui.Components.nm0 f43577b;
    public ka f43578c;
    public boolean d;
    public int e;
    public String f43579f;
    public org.telegram.messenger.voip.m0 h;
    public boolean f43580n;
    public String f43581r;
    public final ArrayList f43582s;
    public final ArrayList v;
    public final ArrayList f43583w;
    public final long f43584x;
    public na f43585y;

    public ta(Bundle bundle) {
        super(bundle);
        this.f43581r = "";
        this.f43582s = new ArrayList();
        this.v = new ArrayList();
        this.f43583w = new ArrayList();
        if (bundle != null) {
            this.f43584x = bundle.getLong("bot_id");
        }
    }

    public static void V(ta taVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.g5.e0(taVar.currentAccount, tL_error, taVar, updateusername, new Object[0]);
        taVar.i0();
    }

    public static void W(ta taVar, int i10) {
        ConnectionsManager.getInstance(taVar.currentAccount).cancelRequest(i10, true);
    }

    public static void X(ta taVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        taVar.e = ConnectionsManager.getInstance(taVar.currentAccount).sendRequest(checkusername, new ea(taVar, str, checkusername, 0), 2);
    }

    public static void Y(ta taVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user) {
        try {
            e2Var.dismiss();
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

    public static void Z(ta taVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = taVar.f43584x;
        ArrayList arrayList = taVar.v;
        ArrayList arrayList2 = taVar.f43582s;
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
        if (j10 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = MessagesController.getInstance(taVar.currentAccount).getInputUser(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        taVar.getConnectionsManager().sendRequest(reorderusernames, new di.d6(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(taVar.currentAccount).getUser(Long.valueOf(taVar.h0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(taVar.currentAccount).putUser(user, false, true);
    }

    public static void a0(ta taVar) {
        if (taVar.f43584x != 0) {
            taVar.finishFragment();
            return;
        }
        if (taVar.f43581r.startsWith("@")) {
            taVar.f43581r = taVar.f43581r.substring(1);
        }
        if (!taVar.f43581r.isEmpty() && !taVar.e0(taVar.f43581r)) {
            taVar.i0();
            return;
        }
        TLRPC.User g02 = taVar.g0();
        if (taVar.getParentActivity() != null && g02 != null) {
            String publicUsername = UserObject.getPublicUsername(g02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(taVar.f43581r)) {
                taVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(taVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = taVar.f43581r;
            NotificationCenter.getInstance(taVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(taVar.currentAccount).sendRequest(updateusername, new ea(taVar, e2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(taVar.currentAccount).bindRequestToGuid(sendRequest, taVar.classGuid);
            e2Var.setOnCancelListener(new bi.f0(taVar, sendRequest, 1));
            e2Var.show();
        }
    }

    public static int c0(ta taVar) {
        return taVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        String str;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Username));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 0));
        this.f43576a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(h0()));
        if (user == null) {
            user = g0();
        }
        if (user != null) {
            this.f43581r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f43581r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f43581r == null && (str = user.username) != null) {
                this.f43581r = str;
            }
            if (this.f43581r == null) {
                this.f43581r = "";
            }
            this.f43582s.clear();
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
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f43577b = nm0Var;
        nm0Var.u1();
        this.f43577b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.nm0 nm0Var2 = this.f43577b;
        ka kaVar = new ka(this);
        this.f43578c = kaVar;
        nm0Var2.setAdapter(kaVar);
        org.telegram.ui.ActionBar.f7.K(this.f43577b, org.telegram.ui.ActionBar.y6.f23449i6, getResourceProvider());
        this.f43577b.setSectionsDrawBackground(true);
        new s4.z(new oa(this)).h(this.f43577b);
        ((FrameLayout) this.fragmentView).addView(this.f43577b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ei.d(6));
        this.f43577b.setOnItemClickListener(new ia(this));
        AndroidUtilities.runOnUIThread(new bu0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean e0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.w1 w1Var = this.G;
        if (w1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            w1Var.setVisibility(i10);
            sa saVar = this.F;
            if (saVar != null) {
                sa.a(saVar);
            }
        }
        org.telegram.messenger.voip.m0 m0Var = this.h;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
            this.h = null;
            this.f43579f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.w1 w1Var2 = this.G;
                        if (w1Var2 != null) {
                            w1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.w1 w1Var3 = this.G;
                            int i12 = org.telegram.ui.ActionBar.y6.f23582p7;
                            w1Var3.setTag(Integer.valueOf(i12));
                            org.telegram.ui.ActionBar.f7.V(this.G, i12, null);
                            sa saVar2 = this.F;
                            if (saVar2 != null) {
                                sa.a(saVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.w1 w1Var4 = this.G;
                        if (w1Var4 != null) {
                            w1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.w1 w1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.y6.f23582p7;
                            w1Var5.setTag(Integer.valueOf(i13));
                            org.telegram.ui.ActionBar.f7.V(this.G, i13, null);
                            sa saVar3 = this.F;
                            if (saVar3 != null) {
                                sa.a(saVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.w1 w1Var6 = this.G;
                if (w1Var6 != null) {
                    w1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.w1 w1Var7 = this.G;
                    int i14 = org.telegram.ui.ActionBar.y6.f23582p7;
                    w1Var7.setTag(Integer.valueOf(i14));
                    org.telegram.ui.ActionBar.f7.V(this.G, i14, null);
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
                org.telegram.ui.Cells.w1 w1Var8 = this.G;
                if (w1Var8 != null) {
                    w1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.w1 w1Var9 = this.G;
                    int i15 = org.telegram.ui.ActionBar.y6.f23582p7;
                    w1Var9.setTag(Integer.valueOf(i15));
                    org.telegram.ui.ActionBar.f7.V(this.G, i15, null);
                    sa saVar5 = this.F;
                    if (saVar5 != null) {
                        sa.a(saVar5);
                        return false;
                    }
                }
            } else {
                String str2 = g0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.w1 w1Var10 = this.G;
                    if (w1Var10 != null) {
                        w1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.w1 w1Var11 = this.G;
                        int i16 = org.telegram.ui.ActionBar.y6.f23712w6;
                        w1Var11.setTag(Integer.valueOf(i16));
                        org.telegram.ui.ActionBar.f7.V(this.G, i16, null);
                        sa saVar6 = this.F;
                        if (saVar6 != null) {
                            sa.a(saVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.w1 w1Var12 = this.G;
                if (w1Var12 != null) {
                    w1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.w1 w1Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.y6.F6;
                    w1Var13.setTag(Integer.valueOf(i17));
                    org.telegram.ui.ActionBar.f7.V(this.G, i17, null);
                    sa saVar7 = this.F;
                    if (saVar7 != null) {
                        sa.a(saVar7);
                    }
                }
                this.f43579f = str;
                org.telegram.messenger.voip.m0 m0Var2 = new org.telegram.messenger.voip.m0(22, this, str);
                this.h = m0Var2;
                AndroidUtilities.runOnUIThread(m0Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.w1 w1Var14 = this.G;
            if (w1Var14 != null) {
                w1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.w1 w1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.y6.f23582p7;
                w1Var15.setTag(Integer.valueOf(i18));
                org.telegram.ui.ActionBar.f7.V(this.G, i18, null);
                sa saVar8 = this.F;
                if (saVar8 != null) {
                    sa.a(saVar8);
                }
            }
        }
        return false;
    }

    public final void f0(boolean z10) {
        na naVar = this.f43585y;
        if (naVar != null) {
            if (!naVar.f41721a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f43585y.f41721a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f43585y.f41721a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f43585y.f41721a);
            }
        }
    }

    public final TLRPC.User g0() {
        long j10 = this.f43584x;
        if (j10 != 0) {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f43577b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final long h0() {
        long j10 = this.f43584x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public final void i0() {
        if (this.f43577b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f43577b.getChildCount(); i10++) {
            View childAt = this.f43577b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.q4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.q4) childAt).getTextView());
            } else if (childAt instanceof sa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof na) {
                na naVar = (na) childAt;
                AndroidUtilities.shakeViewSpring(naVar.f41721a);
                AndroidUtilities.shakeViewSpring(naVar.f41722b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ta.j0(int, boolean, boolean):void");
    }

    public final void k0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == tL_username) {
                    j0(i10 + 4, z10, z11);
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
            f0(false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            f0(false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
