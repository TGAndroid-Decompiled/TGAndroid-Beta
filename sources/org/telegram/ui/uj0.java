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
public final class uj0 extends org.telegram.ui.Components.ab {
    public static uj0 f38131u0;
    public final sj0 X;
    public final rj0 Y;
    public final s50 Z;
    public final qj0 f38132a0;
    public final ArrayList f38133b0;
    public final ArrayList f38134c0;
    public final HashSet f38135d0;
    public final ArrayList f38136e0;
    public final ArrayList f38137f0;
    public final HashMap f38138g0;
    public final ArrayList f38139h0;
    public final LinkedHashMap f38140i0;
    public String f38141j0;
    public ug.g f38142k0;
    public int f38143l0;
    public int m0;
    public float f38144n0;
    public org.telegram.ui.Components.cb0 f38145o0;
    public final int f38146p0;
    public final tj0 f38147q0;
    public final Boolean f38148r0;
    public final Boolean f38149s0;
    public final w5 f38150t0;

    public uj0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Boolean bool, Boolean bool2, tj0 tj0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        this.f38133b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f38134c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f38135d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f38136e0 = arrayList3;
        this.f38137f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f38138g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f38139h0 = arrayList4;
        this.f38140i0 = new LinkedHashMap();
        this.f38143l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.f38150t0 = new w5(this, 11);
        this.f38146p0 = i10;
        this.f38148r0 = bool;
        this.f38149s0 = bool2;
        this.f38147q0 = tj0Var;
        this.e.setTitle(y());
        ?? cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f38132a0 = cVar;
        cVar.setOnCloseClickListener(new nj0(this, 0));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f38145o0 = new org.telegram.ui.Components.cb0(this, 1);
        rj0 rj0Var = new rj0(this, getContext(), this.resourcesProvider);
        this.Y = rj0Var;
        int i11 = org.telegram.ui.ActionBar.j6.f19180h5;
        rj0Var.setBackgroundColor(getThemedColor(i11));
        rj0Var.setOnSearchTextChange(new s3(this, 10));
        rj0Var.f46092b.setHintText(LocaleController.getString(R.string.Search), false);
        s50 s50Var = new s50(this, getContext(), 1);
        this.Z = s50Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w7.y5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(rj0Var, w7.y5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(s50Var, w7.y5.f(1.0f, 55, i14, 0, i14, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (org.telegram.ui.Components.yl0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        sj0 sj0Var = new sj0(this, getContext(), this.resourcesProvider);
        this.X = sj0Var;
        sj0Var.setOnClickListener(new oj0(this, 0));
        o20Var.addView(sj0Var, w7.y5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, w7.y5.f(-2.0f, 87, i15, 0, i15, 0));
        ug.g gVar = this.f38142k0;
        org.telegram.ui.Components.yl0 yl0Var = this.d;
        gVar.f44060n = arrayList;
        gVar.f44059f = yl0Var;
        int i16 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new h3(this, 21));
        this.d.setOnItemClickListener(new i2.s(this, i10, 14));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.f43030m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new ci.r1(this, 6));
        rj0Var.setText("");
        rj0Var.d.b(false);
        rj0Var.b(false, hashSet, new nj0(this, 1), null);
        cVar.setText(y());
        S(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        U(false, true);
        fixNavigationBar();
    }

    public static void P(uj0 uj0Var, int i10, View view) {
        rj0 rj0Var = uj0Var.Y;
        HashSet hashSet = uj0Var.f38135d0;
        if (view instanceof xg.l) {
            TLRPC.User user = ((xg.l) view).getUser();
            long j3 = user.f18490id;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                uj0Var.f38140i0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j3));
                new org.telegram.ui.Components.xc(uj0Var.container, uj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", uj0Var.f38146p0, new Object[0])).k(true);
                try {
                    uj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            rj0Var.b(true, hashSet, new nj0(uj0Var, 2), null);
            uj0Var.U(true, false);
            if (!TextUtils.isEmpty(uj0Var.f38141j0)) {
                uj0Var.f38141j0 = null;
                rj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(uj0Var.f38150t0);
                uj0Var.T(true, true);
            }
        }
    }

    public static void Q(uj0 uj0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (uj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(uj0Var.currentAccount).cancelRequest(uj0Var.m0, true);
            uj0Var.m0 = -1;
        }
        Boolean bool = uj0Var.f38148r0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        of ofVar = new of(29, uj0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f18490id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.l0.v(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.l0.v("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.l0.v("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, lowerCase4)) {
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
        ofVar.run(arrayList);
    }

    @Override
    public final void B(Canvas canvas, int i10) {
        qj0 qj0Var = this.f38132a0;
        qj0Var.setTranslationY(Math.max(i10, (((qj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = qj0Var.getTranslationY() + qj0Var.getMeasuredHeight();
        rj0 rj0Var = this.Y;
        rj0Var.setTranslationY(translationY);
        float translationY2 = rj0Var.getTranslationY() + rj0Var.getMeasuredHeight();
        s50 s50Var = this.Z;
        s50Var.setTranslationY(translationY2);
        int measuredHeight = rj0Var.getMeasuredHeight() + qj0Var.getMeasuredHeight();
        this.d.setTranslationY((s50Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f38148r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f38149s0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void S(boolean z10) {
        int i10;
        sj0 sj0Var = this.X;
        sj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f38135d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f38145o0, 0, 1, 33);
            Boolean bool = this.f38148r0;
            if (bool != null && bool.booleanValue()) {
                if (this.f38146p0 > 1) {
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
        sj0Var.b(hashSet.size(), true);
        sj0Var.g(spannableStringBuilder, z10, false);
        sj0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        ug.g gVar;
        ArrayList arrayList3 = this.f38133b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f38134c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f38141j0);
        HashSet hashSet = this.f38135d0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f38137f0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(ug.f.c(user, hashSet.contains(Long.valueOf(user.f18490id))));
            }
        } else {
            ArrayList arrayList6 = this.f38136e0;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f18490id) && !UserObject.isDeleted(user2) && R(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(ug.f.c(user2, hashSet.contains(Long.valueOf(user2.f18490id))));
                    }
                }
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(ug.f.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList7);
                }
            } else {
                i10 = 0;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.f38148r0;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size3 = allDialogs.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Dialog dialog = allDialogs.get(i14);
                    i14++;
                    TLRPC.Dialog dialog2 = dialog;
                    int i15 = size3;
                    if (dialog2.f18347id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f18347id));
                        if (R(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(ug.f.c(user3, hashSet.contains(Long.valueOf(user3.f18490id))));
                        }
                    }
                    size3 = i15;
                    allDialogs = arrayList2;
                }
                f7 = 32.0f;
                if (!arrayList8.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(ug.f.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f7 = 32.0f;
            }
            ArrayList arrayList9 = this.f38139h0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f38138g0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (R(user4)) {
                                i11 += AndroidUtilities.dp(56.0f);
                                arrayList10.add(ug.f.c(user4, hashSet.contains(Long.valueOf(user4.f18490id))));
                                size4 = size4;
                                arrayList9 = arrayList;
                                str = str2;
                                i16 = i16;
                            }
                        }
                        arrayList9 = arrayList;
                        str = str2;
                    }
                    int i17 = size4;
                    int i18 = i16;
                    String str3 = str;
                    ArrayList arrayList11 = arrayList9;
                    if (!arrayList10.isEmpty()) {
                        String upperCase = str3.toUpperCase();
                        ug.f fVar = new ug.f(7, false);
                        fVar.f44048g = upperCase;
                        arrayList4.add(fVar);
                        arrayList4.addAll(arrayList10);
                        i11 = AndroidUtilities.dp(f7) + i11;
                    }
                    size4 = i17;
                    arrayList9 = arrayList11;
                    i16 = i18;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ug.f(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        ug.f fVar2 = new ug.f(-1, false);
        fVar2.f44052l = max;
        arrayList4.add(fVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ug.g gVar2 = this.f38142k0;
                oj0 oj0Var = new oj0(this, 1);
                org.telegram.ui.Cells.w3 w3Var = gVar2.v;
                if (w3Var != null) {
                    w3Var.b(LocaleController.getString(R.string.UsersDeselectAll), oj0Var);
                }
            } else {
                org.telegram.ui.Cells.w3 w3Var2 = this.f38142k0.v;
                if (w3Var2 != null) {
                    w3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (gVar = this.f38142k0) != null) {
            if (z10) {
                gVar.E(arrayList3, arrayList4);
            } else {
                gVar.l();
            }
        }
    }

    public final void U(boolean z10, boolean z11) {
        int S;
        T(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.yl0 yl0Var = this.d;
            if (i10 >= yl0Var.getChildCount()) {
                break;
            }
            View childAt = yl0Var.getChildAt(i10);
            if ((childAt instanceof xg.l) && (S = RecyclerView.S(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = S;
                }
                int i13 = S - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.f38134c0;
                    if (i13 < arrayList.size()) {
                        ug.f fVar = (ug.f) arrayList.get(i13);
                        xg.l lVar = (xg.l) childAt;
                        lVar.c(fVar.f44051k, z10);
                        TLRPC.Chat chat = fVar.e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f38142k0.F(chat) > 200) {
                                f7 = 0.3f;
                            }
                            lVar.i(f7, z10);
                        } else {
                            lVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = S;
            }
            i10++;
        }
        if (z10) {
            this.f38142k0.q(0, i11);
            ug.g gVar = this.f38142k0;
            gVar.q(i12, gVar.h() - i12);
        }
        S(z10);
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f38131u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f38150t0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override
    public final org.telegram.ui.Components.xl0 v(org.telegram.ui.Components.yl0 yl0Var) {
        ug.g gVar = new ug.g(getContext(), this.resourcesProvider, true);
        this.f38142k0 = gVar;
        gVar.f44062s = true;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        int i10;
        Boolean bool = this.f38148r0;
        if (bool != null && bool.booleanValue()) {
            if (this.f38146p0 > 1) {
                i10 = R.string.ChooseBots;
            } else {
                i10 = R.string.ChooseBot;
            }
            return LocaleController.getString(i10);
        }
        return LocaleController.getString(R.string.ChooseUsers);
    }
}
