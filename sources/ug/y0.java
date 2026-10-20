package ug;

import ai.bd;
import ai.m3;
import ai.z3;
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
import com.google.android.gms.internal.play_billing.k3;
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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.kh0;
import org.telegram.ui.m71;
import w7.z5;
public final class y0 extends bb {
    public final ei.d X;
    public final x0 Y;
    public final u3 Z;
    public final yg.c f47782a0;
    public final Paint f47783b0;
    public final ArrayList f47784c0;
    public final ArrayList f47785d0;
    public final HashSet f47786e0;
    public final HashSet f47787f0;
    public final ArrayList f47788g0;
    public final ArrayList f47789h0;
    public final HashMap f47790i0;
    public final ArrayList f47791j0;
    public final ArrayList f47792k0;
    public final LinkedHashMap f47793l0;
    public final f6 m0;
    public String f47794n0;
    public vg.h f47795o0;
    public int f47796p0;
    public final TLRPC.Chat f47797q0;
    public int f47798r0;
    public j f47799s0;
    public int f47800t0;
    public l f47801u0;
    public final p8.b f47802v0;

    public y0(n2 n2Var, long j10) {
        super(n2Var, false);
        this.f47783b0 = new Paint(1);
        this.f47784c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f47785d0 = arrayList;
        this.f47786e0 = new HashSet();
        this.f47787f0 = new HashSet();
        this.f47788g0 = new ArrayList();
        this.f47789h0 = new ArrayList();
        this.f47790i0 = new HashMap();
        this.f47791j0 = new ArrayList();
        this.f47792k0 = new ArrayList();
        this.f47793l0 = new LinkedHashMap();
        this.f47796p0 = AndroidUtilities.dp(134.0f);
        this.f47802v0 = new p8.b(this, 7);
        this.backgroundPaddingLeft = 0;
        this.f47797q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        bs bsVar = bs.h;
        this.m0 = new f6(viewGroup, 0L, 350L, bsVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.f47782a0 = cVar;
        cVar.setOnCloseClickListener(new s0(this, 7));
        cVar.setText(A());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        x0 x0Var = new x0(this, getContext(), this.resourcesProvider);
        this.Y = x0Var;
        int i10 = h6.f21061h5;
        x0Var.setBackgroundColor(getThemedColor(i10));
        x0Var.setOnSearchTextChange(new v0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        d0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(x0Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        bd bdVar = new bd(getContext(), this.resourcesProvider, (jm0) null);
        bdVar.setClickable(true);
        bdVar.setOrientation(1);
        bdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        bdVar.setBackgroundColor(h6.w0(i10, this.resourcesProvider));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new u0(this, 1));
        bdVar.addView(dVar, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(bdVar, z5.f(-2.0f, 87, i13, 0, i13, 0));
        vg.h hVar = this.f47795o0;
        jm0 jm0Var = this.d;
        hVar.f48382n = arrayList;
        hVar.f48381f = jm0Var;
        int i14 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new kv(this, 20));
        this.d.setOnItemClickListener(new qg.h0(this, 23));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bsVar);
        kVar.C = false;
        kVar.f45951m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new q1(this, 8));
        c0(false, true);
        U(1, null, true);
        U(3, null, true);
    }

    public static void Q(y0 y0Var, boolean z10, Pair pair) {
        HashMap hashMap = y0Var.f47790i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            y0Var.f47791j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new t0(y0Var, 0));
        }
        if (y0Var.f47798r0 == 3) {
            y0Var.c0(true, true);
            y0Var.Y(true);
        }
    }

    public static void R(y0 y0Var, View view) {
        long j10;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = y0Var.f47793l0;
        x0 x0Var = y0Var.Y;
        HashSet hashSet = y0Var.f47786e0;
        if (view instanceof q8) {
            linkedHashMap.clear();
            y0Var.X(true);
        } else if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            if (user != null) {
                j10 = user.f20423id;
            } else {
                j10 = -chat.f20276id;
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
            if ((hashSet.size() == 11 && y0Var.f47798r0 == 1) || (hashSet.size() == r.f() + 1 && y0Var.f47798r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                y0Var.Z();
                return;
            }
            x0Var.b(true, hashSet, new s0(y0Var, 1), null);
            y0Var.c0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = y0Var.f24882n.getContext();
                d6 d6Var = y0Var.resourcesProvider;
                kh0 kh0Var = new kh0(y0Var, j10, 4);
                s0 s0Var = new s0(y0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f20605a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f20605a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new org.telegram.ui.web.m(13, atomicBoolean, s0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new sg.y(12));
                alertDialog$Builder.j(new z3(18, atomicBoolean, kh0Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                y0Var.S();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && y0Var.f47798r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                y0Var.Z();
                return;
            }
            x0Var.b(true, hashSet, new s0(y0Var, 3), y0Var.f47792k0);
            if (!TextUtils.isEmpty(y0Var.f47794n0)) {
                y0Var.f47794n0 = null;
                x0Var.setText("");
                y0Var.c0(false, false);
                y0Var.c0(true, true);
                return;
            }
            y0Var.c0(true, false);
        }
    }

    public static boolean V(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (k3.s(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !org.telegram.messenger.g0.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || org.telegram.messenger.g0.w(" ", str, lowerCase2)) {
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
        int i10 = this.f47798r0;
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
        x0 x0Var;
        boolean z10;
        this.f47800t0 = i10;
        yg.c cVar = this.f47782a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((x0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = h6.w0(h6.f21061h5, this.resourcesProvider);
        Paint paint = this.f47783b0;
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
        float dp = (1.0f - f6Var.f26086c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void S() {
        if (!TextUtils.isEmpty(this.f47794n0)) {
            this.f47794n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f47802v0);
            ArrayList arrayList = this.f47788g0;
            arrayList.clear();
            arrayList.addAll(r.e(this.f47797q0.f20276id));
            c0(false, false);
            c0(true, true);
        }
    }

    public final boolean T() {
        String string;
        HashSet hashSet = this.f47786e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f47787f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f47798r0;
        Context context = getContext();
        d6 d6Var = this.resourcesProvider;
        s0 s0Var = new s0(this, 0);
        s0 s0Var2 = new s0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.f20605a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f20605a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new qg.h0(s0Var, 22));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new qg.h0(s0Var2, 19));
        alertDialog$Builder.o();
        return true;
    }

    public final void U(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f47797q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                w0 w0Var = new w0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ai.h(w0Var, 25));
                return;
            }
            long j10 = chat.f20276id;
            v0 v0Var = new v0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f20322q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new m3(messagesController, j10, v0Var, 7));
            return;
        }
        long j11 = chat.f20276id;
        w0 w0Var2 = new w0(this, z10, 0);
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
        tL_channelParticipantsSearch.f20275q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new m71(9, messagesController2, w0Var2));
    }

    public final void W(int i10, List list) {
        long j10;
        this.f47798r0 = i10;
        this.f47794n0 = null;
        HashSet hashSet = this.f47787f0;
        hashSet.clear();
        HashSet hashSet2 = this.f47786e0;
        hashSet2.clear();
        ArrayList arrayList = this.f47788g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f47793l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(r.e(this.f47797q0.f20276id));
            }
        } else {
            arrayList.addAll(this.f47789h0);
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
                    j10 = -((TLRPC.Chat) tLObject).f20276id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f20423id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        x0 x0Var = this.Y;
        x0Var.setText("");
        x0Var.d.b(false);
        x0Var.b(false, hashSet2, new s0(this, 4), this.f47792k0);
        d0();
        c0(false, true);
        this.f47782a0.setText(A());
        a0(false);
        Y(false);
    }

    public final void X(boolean z10) {
        m mVar;
        HashSet hashSet = this.f47786e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f47798r0;
            LinkedHashMap linkedHashMap = this.f47793l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f47792k0;
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
                        l lVar = this.f47801u0;
                        if (lVar != null) {
                            lVar.f47703c.f47708b.D(0);
                            z zVar = lVar.f47701a;
                            ArrayList arrayList3 = zVar.f47807e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            zVar.b0(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f20276id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                l lVar2 = this.f47801u0;
                if (lVar2 != null) {
                    lVar2.f47703c.f47708b.D(0);
                    z zVar2 = lVar2.f47701a;
                    ArrayList arrayList5 = zVar2.f47805c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    zVar2.b0(!mVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f20423id))) {
                        arrayList6.add(user);
                    }
                }
            }
            l lVar3 = this.f47801u0;
            if (lVar3 != null) {
                lVar3.f47703c.f47708b.D(0);
                z zVar3 = lVar3.f47701a;
                ArrayList arrayList7 = zVar3.f47806d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = wg.d.v;
                    zVar3.f47811i0 = 0;
                } else {
                    int i13 = wg.d.v;
                    zVar3.f47811i0 = 1;
                }
                zVar3.f47815n0 = 0;
                zVar3.b0(false, true);
                zVar3.a0(true);
                zVar3.O();
            }
        }
    }

    public final void Y(boolean z10) {
        jm0 jm0Var = this.d;
        if (z10) {
            li.n nVar = new li.n(getContext(), 2, 0.6f);
            nVar.f46058a = 1;
            nVar.f16144p = AndroidUtilities.dp(38.0f);
            jm0Var.getLayoutManager().w0(nVar);
            return;
        }
        jm0Var.u0(0);
    }

    public final void Z() {
        String string;
        int i10 = this.f47798r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) r.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        l lVar = this.f47801u0;
        if (lVar != null) {
            new xc(lVar.f47703c.container, lVar.f47702b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void a0(boolean z10) {
        String string;
        ei.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f47798r0;
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
        HashSet hashSet = this.f47786e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void b0(boolean z10, boolean z11) {
        int i10;
        vg.h hVar;
        ArrayList arrayList = this.f47784c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f47785d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f47798r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            vg.g gVar = new vg.g(9, false);
            gVar.f48371i = 1;
            gVar.f48372j = i11;
            gVar.f48370g = string;
            arrayList2.add(gVar);
        }
        vg.g gVar2 = new vg.g(10, false);
        u3 u3Var = this.Z;
        gVar2.f48379q = u3Var;
        arrayList2.add(gVar2);
        int i12 = this.f47798r0;
        HashSet hashSet = this.f47786e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f47791j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f47790i0.get(str)) {
                    if (TextUtils.isEmpty(this.f47794n0) || V(tL_help_country, AndroidUtilities.translitSafe(this.f47794n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        vg.g gVar3 = new vg.g(6, true);
                        gVar3.f48369f = tL_help_country;
                        gVar3.f48373k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    vg.g gVar4 = new vg.g(7, false);
                    gVar4.f48370g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f47788g0;
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
            gVar5.f48368c = null;
            gVar5.e = null;
            gVar5.f48373k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new vg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        vg.g gVar6 = new vg.g(-1, false);
        gVar6.f48374l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f47798r0 != 3) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new u0(this, 0));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.f23591b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f47795o0) != null) {
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
            jm0 jm0Var = this.d;
            if (i10 < jm0Var.getChildCount()) {
                View childAt = jm0Var.getChildAt(i10);
                if (childAt instanceof yg.k) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f47785d0;
                        if (R < arrayList.size()) {
                            vg.g gVar = (vg.g) arrayList.get(R);
                            yg.k kVar = (yg.k) childAt;
                            kVar.c(gVar.f48373k, z10);
                            TLRPC.Chat chat = gVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f47795o0.F(chat) > 200) {
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
                    bVar.c(this.f47786e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
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
        int i10 = this.f47798r0;
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
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) r.f(), new Object[0]);
                u3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f47797q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f47795o0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        j jVar = this.f47799s0;
        if (jVar != null) {
            jVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f47802v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0(false, true);
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.f47795o0 = hVar;
        return hVar;
    }
}
