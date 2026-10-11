package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class rj0 extends org.telegram.ui.Components.db {
    public static rj0 f41451u0;
    public final pj0 X;
    public final oj0 Y;
    public final q50 Z;
    public final nj0 f41452a0;
    public final ArrayList f41453b0;
    public final ArrayList f41454c0;
    public final HashSet f41455d0;
    public final ArrayList f41456e0;
    public final ArrayList f41457f0;
    public final HashMap f41458g0;
    public final ArrayList f41459h0;
    public final LinkedHashMap f41460i0;
    public String f41461j0;
    public ug.h f41462k0;
    public int f41463l0;
    public int m0;
    public float f41464n0;
    public org.telegram.ui.Components.ub0 f41465o0;
    public final int f41466p0;
    public final qj0 f41467q0;
    public final Boolean f41468r0;
    public final Boolean f41469s0;
    public final v5 f41470t0;

    public rj0(org.telegram.ui.ActionBar.m2 m2Var, int i10, Boolean bool, Boolean bool2, qj0 qj0Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        this.f41453b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f41454c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f41455d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f41456e0 = arrayList3;
        this.f41457f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f41458g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f41459h0 = arrayList4;
        this.f41460i0 = new LinkedHashMap();
        this.f41463l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.f41470t0 = new v5(this, 11);
        this.f41466p0 = i10;
        this.f41468r0 = bool;
        this.f41469s0 = bool2;
        this.f41467q0 = qj0Var;
        this.f25521e.setTitle(B());
        ?? cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f41452a0 = cVar;
        cVar.setOnCloseClickListener(new lj0(this, 0));
        cVar.setText(B());
        cVar.setCloseImageVisible(false);
        cVar.f51216e.c(0.0f, false);
        this.f41465o0 = new org.telegram.ui.Components.ub0(this, 1);
        oj0 oj0Var = new oj0(this, getContext(), this.resourcesProvider);
        this.Y = oj0Var;
        int i11 = org.telegram.ui.ActionBar.h6.f20857h5;
        oj0Var.setBackgroundColor(getThemedColor(i11));
        oj0Var.setOnSearchTextChange(new s3(this, 12));
        oj0Var.f51231b.setHintText(LocaleController.getString(R.string.Search), false);
        q50 q50Var = new q50(this, getContext(), 1);
        this.Z = q50Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w7.x5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(oj0Var, w7.x5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(q50Var, w7.x5.f(1.0f, 55, i14, 0, i14, 0));
        l20 l20Var = new l20(getContext(), this.resourcesProvider, (org.telegram.ui.Components.sm0) null);
        l20Var.setClickable(true);
        l20Var.setOrientation(1);
        l20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        l20Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourcesProvider));
        pj0 pj0Var = new pj0(this, getContext(), this.resourcesProvider);
        this.X = pj0Var;
        pj0Var.setOnClickListener(new mj0(this, 0));
        l20Var.addView(pj0Var, w7.x5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(l20Var, w7.x5.f(-2.0f, 87, i15, 0, i15, 0));
        ug.h hVar = this.f41462k0;
        org.telegram.ui.Components.sm0 sm0Var = this.d;
        hVar.f49030n = arrayList;
        hVar.f49029f = sm0Var;
        int i16 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new h3(this, 21));
        this.d.setOnItemClickListener(new i2.s(this, i10, 15));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.C = false;
        jVar.f47788m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new ci.q1(this, 6));
        oj0Var.setText("");
        oj0Var.d.b(false);
        oj0Var.b(false, hashSet, new lj0(this, 1), null);
        cVar.setText(B());
        T(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        V(false, true);
        fixNavigationBar();
    }

    public static void Q(rj0 rj0Var, int i10, View view) {
        oj0 oj0Var = rj0Var.Y;
        HashSet hashSet = rj0Var.f41455d0;
        if (view instanceof xg.l) {
            TLRPC.User user = ((xg.l) view).getUser();
            long j3 = user.f20179id;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                rj0Var.f41460i0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j3));
                new org.telegram.ui.Components.ad(rj0Var.container, rj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", rj0Var.f41466p0, new Object[0])).k(true);
                try {
                    rj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            oj0Var.b(true, hashSet, new lj0(rj0Var, 2), null);
            rj0Var.V(true, false);
            if (!TextUtils.isEmpty(rj0Var.f41461j0)) {
                rj0Var.f41461j0 = null;
                oj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(rj0Var.f41470t0);
                rj0Var.U(true, true);
            }
        }
    }

    public static void R(rj0 rj0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (rj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(rj0Var.currentAccount).cancelRequest(rj0Var.m0, true);
            rj0Var.m0 = -1;
        }
        Boolean bool = rj0Var.f41468r0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        et etVar = new et(6, rj0Var, str);
        int i10 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(i10).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(i10).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        String lowerCase = str.toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i11);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f20179id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.ai.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.ai.w(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.ai.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.ai.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, lowerCase4)) {
                                    arrayList.add(user);
                                }
                            }
                        }
                    } else {
                        arrayList.add(user);
                    }
                }
            }
        }
        etVar.run(arrayList);
    }

    @Override
    public final CharSequence B() {
        int i10;
        Boolean bool = this.f41468r0;
        if (bool != null && bool.booleanValue()) {
            if (this.f41466p0 > 1) {
                i10 = R.string.ChooseBots;
            } else {
                i10 = R.string.ChooseBot;
            }
            return LocaleController.getString(i10);
        }
        return LocaleController.getString(R.string.ChooseUsers);
    }

    @Override
    public final void E(Canvas canvas, int i10) {
        nj0 nj0Var = this.f41452a0;
        nj0Var.setTranslationY(Math.max(i10, (((nj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = nj0Var.getTranslationY() + nj0Var.getMeasuredHeight();
        oj0 oj0Var = this.Y;
        oj0Var.setTranslationY(translationY);
        float translationY2 = oj0Var.getTranslationY() + oj0Var.getMeasuredHeight();
        q50 q50Var = this.Z;
        q50Var.setTranslationY(translationY2);
        int measuredHeight = oj0Var.getMeasuredHeight() + nj0Var.getMeasuredHeight();
        this.d.setTranslationY((q50Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean S(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f41468r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f41469s0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void T(boolean z10) {
        int i10;
        pj0 pj0Var = this.X;
        pj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f41455d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f41465o0, 0, 1, 33);
            Boolean bool = this.f41468r0;
            if (bool != null && bool.booleanValue()) {
                if (this.f41466p0 > 1) {
                    i10 = R.string.ChooseBots;
                } else {
                    i10 = R.string.ChooseBot;
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(i10));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        pj0Var.b(hashSet.size(), true);
        pj0Var.g(spannableStringBuilder, z10, false);
        pj0Var.setEnabled(true);
    }

    public final void U(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        ug.h hVar;
        ArrayList arrayList3 = this.f41453b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f41454c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f41461j0);
        float f10 = 56.0f;
        HashSet hashSet = this.f41455d0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f41457f0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(ug.g.c(user, hashSet.contains(Long.valueOf(user.f20179id))));
            }
        } else {
            ArrayList arrayList6 = this.f41456e0;
            float f11 = 32.0f;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f20179id) && !UserObject.isDeleted(user2) && S(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(ug.g.c(user2, hashSet.contains(Long.valueOf(user2.f20179id))));
                    }
                }
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(ug.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList7);
                }
            } else {
                i10 = 0;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.f41468r0;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size3 = allDialogs.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Dialog dialog = allDialogs.get(i14);
                    i14++;
                    TLRPC.Dialog dialog2 = dialog;
                    float f12 = f11;
                    int i15 = size3;
                    if (dialog2.f20036id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f20036id));
                        if (S(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(ug.g.c(user3, hashSet.contains(Long.valueOf(user3.f20179id))));
                        }
                    }
                    f11 = f12;
                    size3 = i15;
                    allDialogs = arrayList2;
                }
                f7 = f11;
                if (!arrayList8.isEmpty()) {
                    i10 += AndroidUtilities.dp(f7);
                    arrayList4.add(ug.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f7 = 32.0f;
            }
            ArrayList arrayList9 = this.f41459h0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f41458g0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f10;
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (S(user4)) {
                                i11 += AndroidUtilities.dp(f13);
                                arrayList10.add(ug.g.c(user4, hashSet.contains(Long.valueOf(user4.f20179id))));
                                size4 = size4;
                                arrayList9 = arrayList;
                                f10 = f13;
                                str = str2;
                                i16 = i16;
                            }
                        }
                        arrayList9 = arrayList;
                        f10 = f13;
                        str = str2;
                    }
                    float f14 = f10;
                    int i17 = size4;
                    int i18 = i16;
                    String str3 = str;
                    ArrayList arrayList11 = arrayList9;
                    if (!arrayList10.isEmpty()) {
                        String upperCase = str3.toUpperCase();
                        ug.g gVar = new ug.g(7, false);
                        gVar.f49017g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList10);
                        i11 = AndroidUtilities.dp(f7) + i11;
                    }
                    size4 = i17;
                    arrayList9 = arrayList11;
                    f10 = f14;
                    i16 = i18;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ug.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        ug.g gVar2 = new ug.g(-1, false);
        gVar2.f49021l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ug.h hVar2 = this.f41462k0;
                mj0 mj0Var = new mj0(this, 1);
                org.telegram.ui.Cells.v3 v3Var = hVar2.v;
                if (v3Var != null) {
                    v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), mj0Var);
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var2 = this.f41462k0.v;
                if (v3Var2 != null) {
                    v3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f41462k0) != null) {
            if (z10) {
                hVar.E(arrayList3, arrayList4);
            } else {
                hVar.l();
            }
        }
    }

    public final void V(boolean z10, boolean z11) {
        int R;
        U(z10, z11);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.sm0 sm0Var = this.d;
            if (i11 >= sm0Var.getChildCount()) {
                break;
            }
            View childAt = sm0Var.getChildAt(i11);
            if ((childAt instanceof xg.l) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.f41454c0;
                    if (i13 < arrayList.size()) {
                        ug.g gVar = (ug.g) arrayList.get(i13);
                        xg.l lVar = (xg.l) childAt;
                        lVar.c(gVar.f49020k, z10);
                        TLRPC.Chat chat = gVar.f49015e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f41462k0.F(chat) > 200) {
                                f7 = 0.3f;
                            }
                            lVar.i(f7, z10);
                        } else {
                            lVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i11++;
        }
        if (z10) {
            this.f41462k0.q(0, i10);
            ug.h hVar = this.f41462k0;
            hVar.q(i12, hVar.h() - i12);
        }
        T(z10);
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f41451u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f41470t0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        U(false, true);
    }

    @Override
    public final org.telegram.ui.Components.rm0 x(org.telegram.ui.Components.sm0 sm0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, true);
        this.f41462k0 = hVar;
        hVar.f49032s = true;
        return hVar;
    }
}
