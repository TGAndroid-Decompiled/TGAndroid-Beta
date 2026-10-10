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
public final class sj0 extends org.telegram.ui.Components.eb {
    public static sj0 f41752u0;
    public final qj0 X;
    public final pj0 Y;
    public final q50 Z;
    public final oj0 f41753a0;
    public final ArrayList f41754b0;
    public final ArrayList f41755c0;
    public final HashSet f41756d0;
    public final ArrayList f41757e0;
    public final ArrayList f41758f0;
    public final HashMap f41759g0;
    public final ArrayList f41760h0;
    public final LinkedHashMap f41761i0;
    public String f41762j0;
    public ug.h f41763k0;
    public int f41764l0;
    public int m0;
    public float f41765n0;
    public org.telegram.ui.Components.ub0 f41766o0;
    public final int f41767p0;
    public final rj0 f41768q0;
    public final Boolean f41769r0;
    public final Boolean f41770s0;
    public final w5 f41771t0;

    public sj0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Boolean bool, Boolean bool2, rj0 rj0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        this.f41754b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f41755c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f41756d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f41757e0 = arrayList3;
        this.f41758f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f41759g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f41760h0 = arrayList4;
        this.f41761i0 = new LinkedHashMap();
        this.f41764l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.f41771t0 = new w5(this, 11);
        this.f41767p0 = i10;
        this.f41769r0 = bool;
        this.f41770s0 = bool2;
        this.f41768q0 = rj0Var;
        this.f25983e.setTitle(B());
        ?? cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f41753a0 = cVar;
        cVar.setOnCloseClickListener(new mj0(this, 0));
        cVar.setText(B());
        cVar.setCloseImageVisible(false);
        cVar.f51173e.c(0.0f, false);
        this.f41766o0 = new org.telegram.ui.Components.ub0(this, 1);
        pj0 pj0Var = new pj0(this, getContext(), this.resourcesProvider);
        this.Y = pj0Var;
        int i11 = org.telegram.ui.ActionBar.i6.f20872h5;
        pj0Var.setBackgroundColor(getThemedColor(i11));
        pj0Var.setOnSearchTextChange(new t3(this, 12));
        pj0Var.f51188b.setHintText(LocaleController.getString(R.string.Search), false);
        q50 q50Var = new q50(this, getContext(), 1);
        this.Z = q50Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w7.x5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(pj0Var, w7.x5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(q50Var, w7.x5.f(1.0f, 55, i14, 0, i14, 0));
        m20 m20Var = new m20(getContext(), this.resourcesProvider, (org.telegram.ui.Components.rm0) null);
        m20Var.setClickable(true);
        m20Var.setOrientation(1);
        m20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        m20Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i11, this.resourcesProvider));
        qj0 qj0Var = new qj0(this, getContext(), this.resourcesProvider);
        this.X = qj0Var;
        qj0Var.setOnClickListener(new nj0(this, 0));
        m20Var.addView(qj0Var, w7.x5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(m20Var, w7.x5.f(-2.0f, 87, i15, 0, i15, 0));
        ug.h hVar = this.f41763k0;
        org.telegram.ui.Components.rm0 rm0Var = this.d;
        hVar.f48987n = arrayList;
        hVar.f48986f = rm0Var;
        int i16 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new i3(this, 21));
        this.d.setOnItemClickListener(new i2.s(this, i10, 15));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.C = false;
        jVar.f47742m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new ci.q1(this, 6));
        pj0Var.setText("");
        pj0Var.d.b(false);
        pj0Var.b(false, hashSet, new mj0(this, 1), null);
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

    public static void Q(sj0 sj0Var, int i10, View view) {
        pj0 pj0Var = sj0Var.Y;
        HashSet hashSet = sj0Var.f41756d0;
        if (view instanceof xg.l) {
            TLRPC.User user = ((xg.l) view).getUser();
            long j3 = user.f20189id;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                sj0Var.f41761i0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j3));
                new org.telegram.ui.Components.ad(sj0Var.container, sj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", sj0Var.f41767p0, new Object[0])).k(true);
                try {
                    sj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            pj0Var.b(true, hashSet, new mj0(sj0Var, 2), null);
            sj0Var.V(true, false);
            if (!TextUtils.isEmpty(sj0Var.f41762j0)) {
                sj0Var.f41762j0 = null;
                pj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(sj0Var.f41771t0);
                sj0Var.U(true, true);
            }
        }
    }

    public static void R(sj0 sj0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (sj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(sj0Var.currentAccount).cancelRequest(sj0Var.m0, true);
            sj0Var.m0 = -1;
        }
        Boolean bool = sj0Var.f41769r0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        ft ftVar = new ft(6, sj0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f20189id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.bi.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.bi.w(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.bi.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.bi.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, lowerCase4)) {
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
        ftVar.run(arrayList);
    }

    @Override
    public final CharSequence B() {
        int i10;
        Boolean bool = this.f41769r0;
        if (bool != null && bool.booleanValue()) {
            if (this.f41767p0 > 1) {
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
        oj0 oj0Var = this.f41753a0;
        oj0Var.setTranslationY(Math.max(i10, (((oj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = oj0Var.getTranslationY() + oj0Var.getMeasuredHeight();
        pj0 pj0Var = this.Y;
        pj0Var.setTranslationY(translationY);
        float translationY2 = pj0Var.getTranslationY() + pj0Var.getMeasuredHeight();
        q50 q50Var = this.Z;
        q50Var.setTranslationY(translationY2);
        int measuredHeight = pj0Var.getMeasuredHeight() + oj0Var.getMeasuredHeight();
        this.d.setTranslationY((q50Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean S(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f41769r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f41770s0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void T(boolean z10) {
        int i10;
        qj0 qj0Var = this.X;
        qj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f41756d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f41766o0, 0, 1, 33);
            Boolean bool = this.f41769r0;
            if (bool != null && bool.booleanValue()) {
                if (this.f41767p0 > 1) {
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
        qj0Var.b(hashSet.size(), true);
        qj0Var.g(spannableStringBuilder, z10, false);
        qj0Var.setEnabled(true);
    }

    public final void U(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        ug.h hVar;
        ArrayList arrayList3 = this.f41754b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f41755c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f41762j0);
        float f10 = 56.0f;
        HashSet hashSet = this.f41756d0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f41758f0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(ug.g.c(user, hashSet.contains(Long.valueOf(user.f20189id))));
            }
        } else {
            ArrayList arrayList6 = this.f41757e0;
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
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f20189id) && !UserObject.isDeleted(user2) && S(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(ug.g.c(user2, hashSet.contains(Long.valueOf(user2.f20189id))));
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
            Boolean bool = this.f41769r0;
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
                    if (dialog2.f20046id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f20046id));
                        if (S(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(ug.g.c(user3, hashSet.contains(Long.valueOf(user3.f20189id))));
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
            ArrayList arrayList9 = this.f41760h0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f41759g0.get(str);
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
                                arrayList10.add(ug.g.c(user4, hashSet.contains(Long.valueOf(user4.f20189id))));
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
                        gVar.f48974g = upperCase;
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
        gVar2.f48978l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ug.h hVar2 = this.f41763k0;
                nj0 nj0Var = new nj0(this, 1);
                org.telegram.ui.Cells.v3 v3Var = hVar2.v;
                if (v3Var != null) {
                    v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), nj0Var);
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var2 = this.f41763k0.v;
                if (v3Var2 != null) {
                    v3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f41763k0) != null) {
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
            org.telegram.ui.Components.rm0 rm0Var = this.d;
            if (i11 >= rm0Var.getChildCount()) {
                break;
            }
            View childAt = rm0Var.getChildAt(i11);
            if ((childAt instanceof xg.l) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.f41755c0;
                    if (i13 < arrayList.size()) {
                        ug.g gVar = (ug.g) arrayList.get(i13);
                        xg.l lVar = (xg.l) childAt;
                        lVar.c(gVar.f48977k, z10);
                        TLRPC.Chat chat = gVar.f48972e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f41763k0.F(chat) > 200) {
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
            this.f41763k0.q(0, i10);
            ug.h hVar = this.f41763k0;
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
        f41752u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f41771t0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        U(false, true);
    }

    @Override
    public final org.telegram.ui.Components.qm0 x(org.telegram.ui.Components.rm0 rm0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, true);
        this.f41763k0 = hVar;
        hVar.f48989s = true;
        return hVar;
    }
}
