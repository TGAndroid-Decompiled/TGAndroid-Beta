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
public final class wj0 extends org.telegram.ui.Components.db {
    public static wj0 f41299u0;
    public final uj0 X;
    public final tj0 Y;
    public final x50 Z;
    public final sj0 f41300a0;
    public final ArrayList f41301b0;
    public final ArrayList f41302c0;
    public final HashSet f41303d0;
    public final ArrayList f41304e0;
    public final ArrayList f41305f0;
    public final HashMap f41306g0;
    public final ArrayList f41307h0;
    public final LinkedHashMap f41308i0;
    public String f41309j0;
    public vg.h f41310k0;
    public int f41311l0;
    public int m0;
    public float f41312n0;
    public org.telegram.ui.Components.sb0 f41313o0;
    public final int f41314p0;
    public final vj0 f41315q0;
    public final Boolean f41316r0;
    public final Boolean f41317s0;
    public final a6 f41318t0;

    public wj0(org.telegram.ui.ActionBar.m2 m2Var, int i10, Boolean bool, Boolean bool2, vj0 vj0Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        this.f41301b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f41302c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f41303d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f41304e0 = arrayList3;
        this.f41305f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f41306g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f41307h0 = arrayList4;
        this.f41308i0 = new LinkedHashMap();
        this.f41311l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.f41318t0 = new a6(this, 11);
        this.f41314p0 = i10;
        this.f41316r0 = bool;
        this.f41317s0 = bool2;
        this.f41315q0 = vj0Var;
        this.e.setTitle(B());
        ?? cVar = new yg.c(getContext(), this.resourcesProvider);
        this.f41300a0 = cVar;
        cVar.setOnCloseClickListener(new qj0(this, 0));
        cVar.setText(B());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f41313o0 = new org.telegram.ui.Components.sb0(this, 1);
        tj0 tj0Var = new tj0(this, getContext(), this.resourcesProvider);
        this.Y = tj0Var;
        int i11 = org.telegram.ui.ActionBar.g6.f19672h5;
        tj0Var.setBackgroundColor(getThemedColor(i11));
        tj0Var.setOnSearchTextChange(new v3(this, 12));
        tj0Var.f48767b.setHintText(LocaleController.getString(R.string.Search), false);
        x50 x50Var = new x50(this, getContext(), 1);
        this.Z = x50Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w7.z5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(tj0Var, w7.z5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(x50Var, w7.z5.f(1.0f, 55, i14, 0, i14, 0));
        s20 s20Var = new s20(getContext(), this.resourcesProvider, (org.telegram.ui.Components.mm0) null);
        s20Var.setClickable(true);
        s20Var.setOrientation(1);
        s20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        s20Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, this.resourcesProvider));
        uj0 uj0Var = new uj0(this, getContext(), this.resourcesProvider);
        this.X = uj0Var;
        uj0Var.setOnClickListener(new rj0(this, 0));
        s20Var.addView(uj0Var, w7.z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(s20Var, w7.z5.f(-2.0f, 87, i15, 0, i15, 0));
        vg.h hVar = this.f41310k0;
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        hVar.f46990n = arrayList;
        hVar.f46989f = mm0Var;
        int i16 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new k3(this, 21));
        this.d.setOnItemClickListener(new i2.r(this, i10, 15));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.f44872m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new di.q1(this, 6));
        tj0Var.setText("");
        tj0Var.d.b(false);
        tj0Var.b(false, hashSet, new qj0(this, 1), null);
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

    public static void Q(wj0 wj0Var, int i10, View view) {
        tj0 tj0Var = wj0Var.Y;
        HashSet hashSet = wj0Var.f41303d0;
        if (view instanceof yg.l) {
            TLRPC.User user = ((yg.l) view).getUser();
            long j10 = user.f19063id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                wj0Var.f41308i0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.zc(wj0Var.container, wj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", wj0Var.f41314p0, new Object[0])).k(true);
                try {
                    wj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            tj0Var.b(true, hashSet, new qj0(wj0Var, 2), null);
            wj0Var.V(true, false);
            if (!TextUtils.isEmpty(wj0Var.f41309j0)) {
                wj0Var.f41309j0 = null;
                tj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(wj0Var.f41318t0);
                wj0Var.U(true, true);
            }
        }
    }

    public static void R(wj0 wj0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (wj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(wj0Var.currentAccount).cancelRequest(wj0Var.m0, true);
            wj0Var.m0 = -1;
        }
        Boolean bool = wj0Var.f41316r0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        mt mtVar = new mt(6, wj0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f19063id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.g0.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.g0.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.g0.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase4)) {
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
        mtVar.run(arrayList);
    }

    @Override
    public final CharSequence B() {
        int i10;
        Boolean bool = this.f41316r0;
        if (bool != null && bool.booleanValue()) {
            if (this.f41314p0 > 1) {
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
        sj0 sj0Var = this.f41300a0;
        sj0Var.setTranslationY(Math.max(i10, (((sj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = sj0Var.getTranslationY() + sj0Var.getMeasuredHeight();
        tj0 tj0Var = this.Y;
        tj0Var.setTranslationY(translationY);
        float translationY2 = tj0Var.getTranslationY() + tj0Var.getMeasuredHeight();
        x50 x50Var = this.Z;
        x50Var.setTranslationY(translationY2);
        int measuredHeight = tj0Var.getMeasuredHeight() + sj0Var.getMeasuredHeight();
        this.d.setTranslationY((x50Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean S(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f41316r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f41317s0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void T(boolean z10) {
        int i10;
        uj0 uj0Var = this.X;
        uj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f41303d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f41313o0, 0, 1, 33);
            Boolean bool = this.f41316r0;
            if (bool != null && bool.booleanValue()) {
                if (this.f41314p0 > 1) {
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
        uj0Var.b(hashSet.size(), true);
        uj0Var.g(spannableStringBuilder, z10, false);
        uj0Var.setEnabled(true);
    }

    public final void U(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        vg.h hVar;
        ArrayList arrayList3 = this.f41301b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f41302c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f41309j0);
        float f10 = 56.0f;
        HashSet hashSet = this.f41303d0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f41305f0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(vg.g.c(user, hashSet.contains(Long.valueOf(user.f19063id))));
            }
        } else {
            ArrayList arrayList6 = this.f41304e0;
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
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f19063id) && !UserObject.isDeleted(user2) && S(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(vg.g.c(user2, hashSet.contains(Long.valueOf(user2.f19063id))));
                    }
                }
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(vg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList7);
                }
            } else {
                i10 = 0;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.f41316r0;
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
                    if (dialog2.f18920id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f18920id));
                        if (S(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(vg.g.c(user3, hashSet.contains(Long.valueOf(user3.f19063id))));
                        }
                    }
                    f11 = f12;
                    size3 = i15;
                    allDialogs = arrayList2;
                }
                f7 = f11;
                if (!arrayList8.isEmpty()) {
                    i10 += AndroidUtilities.dp(f7);
                    arrayList4.add(vg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f7 = 32.0f;
            }
            ArrayList arrayList9 = this.f41307h0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f41306g0.get(str);
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
                                arrayList10.add(vg.g.c(user4, hashSet.contains(Long.valueOf(user4.f19063id))));
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
                        vg.g gVar = new vg.g(7, false);
                        gVar.f46978g = upperCase;
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
            arrayList4.add(new vg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        vg.g gVar2 = new vg.g(-1, false);
        gVar2.f46982l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                vg.h hVar2 = this.f41310k0;
                rj0 rj0Var = new rj0(this, 1);
                org.telegram.ui.Cells.v3 v3Var = hVar2.v;
                if (v3Var != null) {
                    v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), rj0Var);
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var2 = this.f41310k0.v;
                if (v3Var2 != null) {
                    v3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f41310k0) != null) {
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
            org.telegram.ui.Components.mm0 mm0Var = this.d;
            if (i11 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i11);
            if ((childAt instanceof yg.l) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.f41302c0;
                    if (i13 < arrayList.size()) {
                        vg.g gVar = (vg.g) arrayList.get(i13);
                        yg.l lVar = (yg.l) childAt;
                        lVar.c(gVar.f46981k, z10);
                        TLRPC.Chat chat = gVar.e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f41310k0.F(chat) > 200) {
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
            this.f41310k0.q(0, i10);
            vg.h hVar = this.f41310k0;
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
        f41299u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f41318t0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        U(false, true);
    }

    @Override
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.f41310k0 = hVar;
        hVar.f46992s = true;
        return hVar;
    }
}
