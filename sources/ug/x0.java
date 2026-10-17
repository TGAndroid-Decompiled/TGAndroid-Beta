package ug;

import ai.ad;
import ai.p9;
import ai.v3;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.a6;
import ei.q1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.mh0;
import org.telegram.ui.o71;
import w7.z5;
public final class x0 extends bb {
    public final ei.d X;
    public final w0 Y;
    public final u3 Z;
    public final yg.c f47794a0;
    public final Paint f47795b0;
    public final ArrayList f47796c0;
    public final ArrayList f47797d0;
    public final HashSet f47798e0;
    public final HashSet f47799f0;
    public final ArrayList f47800g0;
    public final ArrayList f47801h0;
    public final HashMap f47802i0;
    public final ArrayList f47803j0;
    public final ArrayList f47804k0;
    public final LinkedHashMap f47805l0;
    public final f6 m0;
    public String f47806n0;
    public vg.h f47807o0;
    public int f47808p0;
    public final TLRPC.Chat f47809q0;
    public int f47810r0;
    public i f47811s0;
    public int f47812t0;
    public k f47813u0;
    public final p4.s0 f47814v0;

    public x0(n2 n2Var, long j10) {
        super(n2Var, false);
        this.f47795b0 = new Paint(1);
        this.f47796c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47797d0 = arrayList;
        this.f47798e0 = new HashSet();
        this.f47799f0 = new HashSet();
        this.f47800g0 = new ArrayList();
        this.f47801h0 = new ArrayList();
        this.f47802i0 = new HashMap();
        this.f47803j0 = new ArrayList();
        this.f47804k0 = new ArrayList();
        this.f47805l0 = new LinkedHashMap();
        this.f47808p0 = AndroidUtilities.dp(134.0f);
        this.f47814v0 = new p4.s0(this, 8);
        this.backgroundPaddingLeft = 0;
        this.f47809q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        bs bsVar = bs.h;
        this.m0 = new f6(viewGroup, 0L, 350L, bsVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.f47794a0 = cVar;
        cVar.setOnCloseClickListener(new r0(this, 7));
        cVar.setText(A());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        w0 w0Var = new w0(this, getContext(), this.resourcesProvider);
        this.Y = w0Var;
        int i10 = h6.f21057h5;
        w0Var.setBackgroundColor(getThemedColor(i10));
        w0Var.setOnSearchTextChange(new u0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        d0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(w0Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        ad adVar = new ad(getContext(), this.resourcesProvider, (im0) null);
        adVar.setClickable(true);
        adVar.setOrientation(1);
        adVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        adVar.setBackgroundColor(h6.w0(i10, this.resourcesProvider));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new t0(this, 1));
        adVar.addView(dVar, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(adVar, z5.f(-2.0f, 87, i13, 0, i13, 0));
        vg.h hVar = this.f47807o0;
        im0 im0Var = this.d;
        hVar.f48397n = arrayList;
        hVar.f48396f = im0Var;
        int i14 = this.backgroundPaddingLeft;
        im0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new kv(this, 20));
        this.d.setOnItemClickListener(new qg.g0(this, 23));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bsVar);
        kVar.C = false;
        kVar.f45972m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new q1(this, 8));
        c0(false, true);
        U(1, null, true);
        U(3, null, true);
    }

    public static void Q(x0 x0Var, boolean z10, Pair pair) {
        HashMap hashMap = x0Var.f47802i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            x0Var.f47803j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new s0(x0Var, 0));
        }
        if (x0Var.f47810r0 == 3) {
            x0Var.c0(true, true);
            x0Var.Y(true);
        }
    }

    public static void R(x0 x0Var, View view) {
        long j10;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = x0Var.f47805l0;
        w0 w0Var = x0Var.Y;
        HashSet hashSet = x0Var.f47798e0;
        if (view instanceof q8) {
            linkedHashMap.clear();
            x0Var.X(true);
        } else if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            if (user != null) {
                j10 = user.f20419id;
            } else {
                j10 = -chat.f20272id;
            }
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                Long valueOf = Long.valueOf(j10);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && x0Var.f47810r0 == 1) || (hashSet.size() == q.f() + 1 && x0Var.f47810r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                x0Var.Z();
                return;
            }
            w0Var.b(true, hashSet, new r0(x0Var, 1), null);
            x0Var.c0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = x0Var.f24915n.getContext();
                d6 d6Var = x0Var.resourcesProvider;
                mh0 mh0Var = new mh0(x0Var, j10, 4);
                r0 r0Var = new r0(x0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f20601a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f20601a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new org.telegram.ui.web.c0(12, atomicBoolean, r0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new si.a(11));
                alertDialog$Builder.j(new v3(18, atomicBoolean, mh0Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                x0Var.S();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && x0Var.f47810r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                x0Var.Z();
                return;
            }
            w0Var.b(true, hashSet, new r0(x0Var, 3), x0Var.f47804k0);
            if (!TextUtils.isEmpty(x0Var.f47806n0)) {
                x0Var.f47806n0 = null;
                w0Var.setText("");
                x0Var.c0(false, false);
                x0Var.c0(true, true);
                return;
            }
            x0Var.c0(true, false);
        }
    }

    public static boolean V(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (a6.s(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !wh.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || wh.w(" ", str, lowerCase2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final CharSequence A() {
        int i10 = this.f47810r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "";
                }
                return LocaleController.getString(R.string.BoostingSelectCountry);
            }
            return LocaleController.getString(R.string.BoostingAddChannelOrGroup);
        }
        return LocaleController.getString(R.string.GiftPremium);
    }

    @Override
    public final void D(Canvas canvas, int i10) {
        w0 w0Var;
        boolean z10;
        this.f47812t0 = i10;
        yg.c cVar = this.f47794a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((w0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = h6.w0(h6.f21057h5, this.resourcesProvider);
        Paint paint = this.f47795b0;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        f6 f6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, f6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - f6Var.f26093c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void S() {
        if (!TextUtils.isEmpty(this.f47806n0)) {
            this.f47806n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47814v0);
            ArrayList arrayList = this.f47800g0;
            arrayList.clear();
            arrayList.addAll(q.e(this.f47809q0.f20272id));
            c0(false, false);
            c0(true, true);
        }
    }

    public final boolean T() {
        String string;
        HashSet hashSet = this.f47798e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f47799f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f47810r0;
        Context context = getContext();
        d6 d6Var = this.resourcesProvider;
        r0 r0Var = new r0(this, 0);
        r0 r0Var2 = new r0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.f20601a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries);
                }
            } else {
                string = LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels);
            }
        } else {
            string = LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        }
        alertDialog$Builder.f20601a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new qg.g0(r0Var, 22));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new qg.g0(r0Var2, 19));
        alertDialog$Builder.o();
        return true;
    }

    public final void U(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f47809q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                v0 v0Var = new v0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ai.h(v0Var, 25));
                return;
            }
            long j10 = chat.f20272id;
            u0 u0Var = new u0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f20318q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new p9(messagesController, j10, u0Var, 6));
            return;
        }
        long j11 = chat.f20272id;
        v0 v0Var2 = new v0(this, z10, 0);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = messagesController2.getInputChannel(j11);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f20271q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new o71(9, messagesController2, v0Var2));
    }

    public final void W(int i10, List list) {
        long j10;
        this.f47810r0 = i10;
        this.f47806n0 = null;
        HashSet hashSet = this.f47799f0;
        hashSet.clear();
        HashSet hashSet2 = this.f47798e0;
        hashSet2.clear();
        ArrayList arrayList = this.f47800g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f47805l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(q.e(this.f47809q0.f20272id));
            }
        } else {
            arrayList.addAll(this.f47801h0);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (tLObject instanceof TLRPC.TL_inputPeerChat) {
                    j10 = -((TLRPC.TL_inputPeerChat) tLObject).chat_id;
                } else {
                    j10 = 0;
                }
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).f20272id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f20419id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        w0 w0Var = this.Y;
        w0Var.setText("");
        w0Var.d.b(false);
        w0Var.b(false, hashSet2, new r0(this, 4), this.f47804k0);
        d0();
        c0(false, true);
        this.f47794a0.setText(A());
        a0(false);
        Y(false);
    }

    public final void X(boolean z10) {
        l lVar;
        HashSet hashSet = this.f47798e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f47810r0;
            LinkedHashMap linkedHashMap = this.f47805l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f47804k0;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                            if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                                arrayList.add(tL_help_country);
                            }
                        }
                        k kVar = this.f47813u0;
                        if (kVar != null) {
                            kVar.f47715c.f47720b.D(0);
                            y yVar = kVar.f47713a;
                            ArrayList arrayList3 = yVar.f47819e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            yVar.b0(false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (hashSet.contains(Long.valueOf(-chat.f20272id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                k kVar2 = this.f47813u0;
                if (kVar2 != null) {
                    kVar2.f47715c.f47720b.D(0);
                    y yVar2 = kVar2.f47713a;
                    ArrayList arrayList5 = yVar2.f47817c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    yVar2.b0(!lVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f20419id))) {
                        arrayList6.add(user);
                    }
                }
            }
            k kVar3 = this.f47813u0;
            if (kVar3 != null) {
                kVar3.f47715c.f47720b.D(0);
                y yVar3 = kVar3.f47713a;
                ArrayList arrayList7 = yVar3.f47818d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = wg.d.v;
                    yVar3.f47823i0 = 0;
                } else {
                    int i13 = wg.d.v;
                    yVar3.f47823i0 = 1;
                }
                yVar3.f47827n0 = 0;
                yVar3.b0(false, true);
                yVar3.a0(true);
                yVar3.O();
            }
        }
    }

    public final void Y(boolean z10) {
        im0 im0Var = this.d;
        if (z10) {
            li.n nVar = new li.n(getContext(), 2, 0.6f);
            nVar.f46079a = 1;
            nVar.f16138p = AndroidUtilities.dp(38.0f);
            im0Var.getLayoutManager().w0(nVar);
            return;
        }
        im0Var.u0(0);
    }

    public final void Z() {
        String string;
        int i10 = this.f47810r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) q.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        k kVar = this.f47813u0;
        if (kVar != null) {
            new xc(kVar.f47715c.container, kVar.f47714b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void a0(boolean z10) {
        String string;
        ei.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f47810r0;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.Save);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        dVar.g(string, z10, true);
        HashSet hashSet = this.f47798e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void b0(boolean z10, boolean z11) {
        int i10;
        vg.h hVar;
        ArrayList arrayList = this.f47796c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f47797d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f47810r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            vg.g gVar = new vg.g(9, false);
            gVar.f48386i = 1;
            gVar.f48387j = i11;
            gVar.f48385g = string;
            arrayList2.add(gVar);
        }
        vg.g gVar2 = new vg.g(10, false);
        u3 u3Var = this.Z;
        gVar2.f48394q = u3Var;
        arrayList2.add(gVar2);
        int i12 = this.f47810r0;
        HashSet hashSet = this.f47798e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f47803j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f47802i0.get(str)) {
                    if (TextUtils.isEmpty(this.f47806n0) || V(tL_help_country, AndroidUtilities.translitSafe(this.f47806n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        vg.g gVar3 = new vg.g(6, true);
                        gVar3.f48384f = tL_help_country;
                        gVar3.f48388k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    vg.g gVar4 = new vg.g(7, false);
                    gVar4.f48385g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f47800g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            vg.g gVar5 = new vg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f48383c = null;
            gVar5.e = null;
            gVar5.f48388k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new vg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        vg.g gVar6 = new vg.g(-1, false);
        gVar6.f48389l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f47810r0 != 3) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new t0(this, 0));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.f23584b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f47807o0) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.l();
            }
        }
    }

    public final void c0(boolean z10, boolean z11) {
        b0(z10, z11);
        int i10 = 0;
        while (true) {
            im0 im0Var = this.d;
            if (i10 < im0Var.getChildCount()) {
                View childAt = im0Var.getChildAt(i10);
                if (childAt instanceof yg.k) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f47797d0;
                        if (R < arrayList.size()) {
                            vg.g gVar = (vg.g) arrayList.get(R);
                            yg.k kVar = (yg.k) childAt;
                            kVar.c(gVar.f48388k, z10);
                            TLRPC.Chat chat = gVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f47807o0.F(chat) > 200) {
                                    f7 = 0.3f;
                                }
                                kVar.i(f7, z10);
                            } else {
                                kVar.i(1.0f, z10);
                            }
                        }
                    }
                    i10++;
                }
                if (childAt instanceof yg.b) {
                    yg.b bVar = (yg.b) childAt;
                    bVar.c(this.f47798e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                a0(z10);
                return;
            }
        }
    }

    public final void d0() {
        String str;
        String formatPluralStringComma;
        int i10 = this.f47810r0;
        u3 u3Var = this.Z;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    formatPluralStringComma = "";
                } else {
                    formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                    u3Var.setLayerHeight(1);
                }
            } else {
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) q.f(), new Object[0]);
                u3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f47809q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f47807o0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        i iVar = this.f47811s0;
        if (iVar != null) {
            iVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f47814v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0(false, true);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.f47807o0 = hVar;
        return hVar;
    }
}
