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
public final class zi0 extends org.telegram.ui.Components.xa {
    public static zi0 f45236q0;
    public final xi0 T;
    public final wi0 U;
    public final cg.h0 V;
    public final vi0 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final HashSet Z;
    public final ArrayList f45237a0;
    public final ArrayList f45238b0;
    public final HashMap f45239c0;
    public final ArrayList f45240d0;
    public final LinkedHashMap f45241e0;
    public String f45242f0;
    public fg.h f45243g0;
    public int f45244h0;
    public int f45245i0;
    public float f45246j0;
    public eg.p2 f45247k0;
    public final int f45248l0;
    public final yi0 m0;
    public final Boolean f45249n0;
    public final Boolean f45250o0;
    public final w5 f45251p0;

    public zi0(org.telegram.ui.ActionBar.o2 o2Var, int i10, Boolean bool, Boolean bool2, yi0 yi0Var) {
        super(o2Var.getParentActivity(), o2Var, true, false, false, 1, o2Var.getResourceProvider());
        this.X = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        HashSet hashSet = new HashSet();
        this.Z = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f45237a0 = arrayList3;
        this.f45238b0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f45239c0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f45240d0 = arrayList4;
        this.f45241e0 = new LinkedHashMap();
        this.f45244h0 = AndroidUtilities.dp(120.0f);
        this.f45245i0 = -1;
        this.f45251p0 = new w5(this, 11);
        this.f45248l0 = i10;
        this.f45249n0 = bool;
        this.f45250o0 = bool2;
        this.m0 = yi0Var;
        this.f34660e.setTitle(y());
        ?? dVar = new ig.d(getContext(), this.resourcesProvider);
        this.W = dVar;
        dVar.setOnCloseClickListener(new ti0(this, 0));
        dVar.setText(y());
        dVar.setCloseImageVisible(false);
        dVar.f8974e.c(0.0f, false);
        this.f45247k0 = new eg.p2(this, 2);
        wi0 wi0Var = new wi0(this, getContext(), this.resourcesProvider);
        this.U = wi0Var;
        int i11 = org.telegram.ui.ActionBar.g6.f23133h5;
        wi0Var.setBackgroundColor(getThemedColor(i11));
        wi0Var.setOnSearchTextChange(new x3(this, 10));
        wi0Var.f8994b.setHintText(LocaleController.getString(R.string.Search), false);
        cg.h0 h0Var = new cg.h0(this, getContext(), 28);
        this.V = h0Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) dVar, 0, i7.f6.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(wi0Var, i7.f6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(h0Var, i7.f6.f(1.0f, 55, i14, 0, i14, 0));
        ig.a aVar = new ig.a(getContext(), this.resourcesProvider, (org.telegram.ui.Components.jl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourcesProvider));
        xi0 xi0Var = new xi0(this, getContext(), this.resourcesProvider);
        this.T = xi0Var;
        xi0Var.setOnClickListener(new ui0(this, 0));
        aVar.addView(xi0Var, i7.f6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, i7.f6.f(-2.0f, 87, i15, 0, i15, 0));
        fg.h hVar = this.f45243g0;
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        hVar.h = arrayList;
        hVar.f6758f = jl0Var;
        int i16 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new m3(this, 21));
        this.d.setOnItemClickListener(new eg.n2(this, i10, 13));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new eg.f2(this, 7));
        wi0Var.setText("");
        wi0Var.d.b(false);
        wi0Var.b(false, hashSet, new ti0(this, 1), null);
        dVar.setText(y());
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

    public static void P(zi0 zi0Var, int i10, View view) {
        wi0 wi0Var = zi0Var.U;
        HashSet hashSet = zi0Var.Z;
        if (view instanceof ig.n) {
            TLRPC.User user = ((ig.n) view).getUser();
            long j10 = user.f22539id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                zi0Var.f45241e0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.tc(zi0Var.container, zi0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", zi0Var.f45248l0, new Object[0])).k(true);
                try {
                    zi0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            wi0Var.b(true, hashSet, new ti0(zi0Var, 2), null);
            zi0Var.U(true, false);
            if (!TextUtils.isEmpty(zi0Var.f45242f0)) {
                zi0Var.f45242f0 = null;
                wi0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(zi0Var.f45251p0);
                zi0Var.T(true, true);
            }
        }
    }

    public static void Q(zi0 zi0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (zi0Var.f45245i0 >= 0) {
            ConnectionsManager.getInstance(zi0Var.currentAccount).cancelRequest(zi0Var.f45245i0, true);
            zi0Var.f45245i0 = -1;
        }
        Boolean bool = zi0Var.f45249n0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        tm tmVar = new tm(24, zi0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f22539id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.x3.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.x3.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.x3.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, lowerCase4)) {
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
        tmVar.run(arrayList);
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        vi0 vi0Var = this.W;
        vi0Var.setTranslationY(Math.max(i10, (((vi0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = vi0Var.getTranslationY() + vi0Var.getMeasuredHeight();
        wi0 wi0Var = this.U;
        wi0Var.setTranslationY(translationY);
        float translationY2 = wi0Var.getTranslationY() + wi0Var.getMeasuredHeight();
        cg.h0 h0Var = this.V;
        h0Var.setTranslationY(translationY2);
        int measuredHeight = wi0Var.getMeasuredHeight() + vi0Var.getMeasuredHeight();
        this.d.setTranslationY((h0Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f45249n0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f45250o0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void S(boolean z10) {
        int i10;
        xi0 xi0Var = this.T;
        xi0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Z;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f45247k0, 0, 1, 33);
            Boolean bool = this.f45249n0;
            if (bool != null && bool.booleanValue()) {
                if (this.f45248l0 > 1) {
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
        xi0Var.c(hashSet.size(), true);
        xi0Var.g(spannableStringBuilder, z10, false);
        xi0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f9;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        fg.h hVar;
        ArrayList arrayList3 = this.X;
        arrayList3.clear();
        ArrayList arrayList4 = this.Y;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f45242f0);
        HashSet hashSet = this.Z;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f45238b0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(fg.g.c(user, hashSet.contains(Long.valueOf(user.f22539id))));
            }
        } else {
            ArrayList arrayList6 = this.f45237a0;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f22539id) && !UserObject.isDeleted(user2) && R(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(fg.g.c(user2, hashSet.contains(Long.valueOf(user2.f22539id))));
                    }
                }
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(fg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList7);
                }
            } else {
                i10 = 0;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.f45249n0;
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
                    if (dialog2.f22396id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f22396id));
                        if (R(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(fg.g.c(user3, hashSet.contains(Long.valueOf(user3.f22539id))));
                        }
                    }
                    size3 = i15;
                    allDialogs = arrayList2;
                }
                f9 = 32.0f;
                if (!arrayList8.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(fg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f9 = 32.0f;
            }
            ArrayList arrayList9 = this.f45240d0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f45239c0.get(str);
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
                                arrayList10.add(fg.g.c(user4, hashSet.contains(Long.valueOf(user4.f22539id))));
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
                        fg.g gVar = new fg.g(7, false);
                        gVar.f6746g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList10);
                        i11 = AndroidUtilities.dp(f9) + i11;
                    }
                    size4 = i17;
                    arrayList9 = arrayList11;
                    i16 = i18;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new fg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        fg.g gVar2 = new fg.g(-1, false);
        gVar2.f6750l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                fg.h hVar2 = this.f45243g0;
                ui0 ui0Var = new ui0(this, 1);
                org.telegram.ui.Cells.s3 s3Var = hVar2.f6761s;
                if (s3Var != null) {
                    s3Var.b(LocaleController.getString(R.string.UsersDeselectAll), ui0Var);
                }
            } else {
                org.telegram.ui.Cells.s3 s3Var2 = this.f45243g0.f6761s;
                if (s3Var2 != null) {
                    s3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f45243g0) != null) {
            if (z10) {
                hVar.E(arrayList3, arrayList4);
            } else {
                hVar.l();
            }
        }
    }

    public final void U(boolean z10, boolean z11) {
        int R;
        T(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.jl0 jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if ((childAt instanceof ig.n) && (R = RecyclerView.R(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.Y;
                    if (i13 < arrayList.size()) {
                        fg.g gVar = (fg.g) arrayList.get(i13);
                        ig.n nVar = (ig.n) childAt;
                        nVar.c(gVar.f6749k, z10);
                        TLRPC.Chat chat = gVar.f6744e;
                        float f9 = 1.0f;
                        if (chat != null) {
                            if (this.f45243g0.F(chat) > 200) {
                                f9 = 0.3f;
                            }
                            nVar.i(f9, z10);
                        } else {
                            nVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i10++;
        }
        if (z10) {
            this.f45243g0.q(0, i11);
            fg.h hVar = this.f45243g0;
            hVar.q(i12, hVar.h() - i12);
        }
        S(z10);
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.U.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f45236q0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f45251p0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        fg.h hVar = new fg.h(getContext(), this.resourcesProvider, true);
        this.f45243g0 = hVar;
        hVar.f6760r = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10;
        Boolean bool = this.f45249n0;
        if (bool != null && bool.booleanValue()) {
            if (this.f45248l0 > 1) {
                i10 = R.string.ChooseBots;
            } else {
                i10 = R.string.ChooseBot;
            }
            return LocaleController.getString(i10);
        }
        return LocaleController.getString(R.string.ChooseUsers);
    }
}
