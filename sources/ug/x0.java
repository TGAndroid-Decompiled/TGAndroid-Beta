package ug;

import ai.cd;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.nh0;
import org.telegram.ui.p71;
import w7.z5;
public final class x0 extends za {
    public final ei.d X;
    public final w0 Y;
    public final u3 Z;
    public final yg.c f48218a0;
    public final Paint f48219b0;
    public final ArrayList f48220c0;
    public final ArrayList f48221d0;
    public final HashSet f48222e0;
    public final HashSet f48223f0;
    public final ArrayList f48224g0;
    public final ArrayList f48225h0;
    public final HashMap f48226i0;
    public final ArrayList f48227j0;
    public final ArrayList f48228k0;
    public final LinkedHashMap f48229l0;
    public final d6 m0;
    public String f48230n0;
    public vg.h f48231o0;
    public int f48232p0;
    public final TLRPC.Chat f48233q0;
    public int f48234r0;
    public i f48235s0;
    public int f48236t0;
    public k f48237u0;
    public final m4 f48238v0;

    public x0(o2 o2Var, long j10) {
        super(o2Var, false);
        this.f48219b0 = new Paint(1);
        this.f48220c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f48221d0 = arrayList;
        this.f48222e0 = new HashSet();
        this.f48223f0 = new HashSet();
        this.f48224g0 = new ArrayList();
        this.f48225h0 = new ArrayList();
        this.f48226i0 = new HashMap();
        this.f48227j0 = new ArrayList();
        this.f48228k0 = new ArrayList();
        this.f48229l0 = new LinkedHashMap();
        this.f48232p0 = AndroidUtilities.dp(134.0f);
        this.f48238v0 = new m4(this, 11);
        this.backgroundPaddingLeft = 0;
        this.f48233q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        zr zrVar = zr.h;
        this.m0 = new d6(viewGroup, 0L, 350L, zrVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.f48218a0 = cVar;
        cVar.setOnCloseClickListener(new r0(this, 7));
        cVar.setText(z());
        cVar.setCloseImageVisible(true);
        cVar.f50585f.c(0.0f, false);
        w0 w0Var = new w0(this, getContext(), this.resourcesProvider);
        this.Y = w0Var;
        int i10 = k6.f21255h5;
        r6.i(i10, w0Var, this.resourcesProvider);
        w0Var.setOnSearchTextChange(new u0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(w0Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        cd cdVar = new cd(getContext(), this.resourcesProvider, (lm0) null);
        cdVar.setClickable(true);
        cdVar.setOrientation(1);
        cdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        r6.i(i10, cdVar, this.resourcesProvider);
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new t0(this, 1));
        cdVar.addView(dVar, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(cdVar, z5.f(-2.0f, 87, i13, 0, i13, 0));
        vg.h hVar = this.f48231o0;
        lm0 lm0Var = this.d;
        hVar.f48823n = arrayList;
        hVar.f48822f = lm0Var;
        int i14 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new iv(this, 20));
        this.d.setOnItemClickListener(new qg.g0(this, 23));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(zrVar);
        kVar.C = false;
        kVar.f46376m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new q1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(x0 x0Var, boolean z10, Pair pair) {
        HashMap hashMap = x0Var.f48226i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            x0Var.f48227j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new s0(x0Var, 0));
        }
        if (x0Var.f48234r0 == 3) {
            x0Var.b0(true, true);
            x0Var.X(true);
        }
    }

    public static void Q(x0 x0Var, View view) {
        long j10;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = x0Var.f48229l0;
        w0 w0Var = x0Var.Y;
        HashSet hashSet = x0Var.f48222e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            x0Var.W(true);
        } else if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            if (user != null) {
                j10 = user.f20491id;
            } else {
                j10 = -chat.f20344id;
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
            if ((hashSet.size() == 11 && x0Var.f48234r0 == 1) || (hashSet.size() == q.f() + 1 && x0Var.f48234r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                x0Var.Y();
                return;
            }
            w0Var.b(true, hashSet, new r0(x0Var, 1), null);
            x0Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = x0Var.f33212n.getContext();
                g6 g6Var = x0Var.resourcesProvider;
                nh0 nh0Var = new nh0(x0Var, j10, 4);
                r0 r0Var = new r0(x0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f20679a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new e8(15, atomicBoolean, r0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(24));
                alertDialog$Builder.j(new z3(18, atomicBoolean, nh0Var));
                alertDialog$Builder.p();
            } else if (chat != null) {
                x0Var.R();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && x0Var.f48234r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                x0Var.Y();
                return;
            }
            w0Var.b(true, hashSet, new r0(x0Var, 3), x0Var.f48228k0);
            if (!TextUtils.isEmpty(x0Var.f48230n0)) {
                x0Var.f48230n0 = null;
                w0Var.setText("");
                x0Var.b0(false, false);
                x0Var.b0(true, true);
                return;
            }
            x0Var.b0(true, false);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (k3.s(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !org.telegram.messenger.v0.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || org.telegram.messenger.v0.w(" ", str, lowerCase2)) {
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
    public final void C(Canvas canvas, int i10) {
        w0 w0Var;
        boolean z10;
        this.f48236t0 = i10;
        yg.c cVar = this.f48218a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((w0Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = k6.w0(k6.f21255h5, this.resourcesProvider);
        Paint paint = this.f48219b0;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        if (max < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6 d6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, d6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - d6Var.f25568c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (!TextUtils.isEmpty(this.f48230n0)) {
            this.f48230n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f48238v0);
            ArrayList arrayList = this.f48224g0;
            arrayList.clear();
            arrayList.addAll(q.e(this.f48233q0.f20344id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f48222e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f48223f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f48234r0;
        Context context = getContext();
        g6 g6Var = this.resourcesProvider;
        r0 r0Var = new r0(this, 0);
        r0 r0Var2 = new r0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.f20679a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f20679a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new qg.g0(r0Var, 22));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new qg.g0(r0Var2, 19));
        alertDialog$Builder.p();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f48233q0;
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
            long j10 = chat.f20344id;
            u0 u0Var = new u0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f20390q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new m3(messagesController, j10, u0Var, 7));
            return;
        }
        long j11 = chat.f20344id;
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
        tL_channelParticipantsSearch.f20343q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new p71(9, messagesController2, v0Var2));
    }

    public final void V(int i10, List list) {
        long j10;
        this.f48234r0 = i10;
        this.f48230n0 = null;
        HashSet hashSet = this.f48223f0;
        hashSet.clear();
        HashSet hashSet2 = this.f48222e0;
        hashSet2.clear();
        ArrayList arrayList = this.f48224g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f48229l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(q.e(this.f48233q0.f20344id));
            }
        } else {
            arrayList.addAll(this.f48225h0);
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
                    j10 = -((TLRPC.Chat) tLObject).f20344id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f20491id;
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
        w0Var.b(false, hashSet2, new r0(this, 4), this.f48228k0);
        c0();
        b0(false, true);
        this.f48218a0.setText(z());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        l lVar;
        HashSet hashSet = this.f48222e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f48234r0;
            LinkedHashMap linkedHashMap = this.f48229l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f48228k0;
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
                        k kVar = this.f48237u0;
                        if (kVar != null) {
                            kVar.f48139c.f48144b.D(0);
                            y yVar = kVar.f48137a;
                            ArrayList arrayList3 = yVar.f48243e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            yVar.a0(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f20344id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                k kVar2 = this.f48237u0;
                if (kVar2 != null) {
                    kVar2.f48139c.f48144b.D(0);
                    y yVar2 = kVar2.f48137a;
                    ArrayList arrayList5 = yVar2.f48241c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    yVar2.a0(!lVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f20491id))) {
                        arrayList6.add(user);
                    }
                }
            }
            k kVar3 = this.f48237u0;
            if (kVar3 != null) {
                kVar3.f48139c.f48144b.D(0);
                y yVar3 = kVar3.f48137a;
                ArrayList arrayList7 = yVar3.f48242d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = wg.d.v;
                    yVar3.f48247i0 = 0;
                } else {
                    int i13 = wg.d.v;
                    yVar3.f48247i0 = 1;
                }
                yVar3.f48251n0 = 0;
                yVar3.a0(false, true);
                yVar3.Z(true);
                yVar3.N();
            }
        }
    }

    public final void X(boolean z10) {
        lm0 lm0Var = this.d;
        if (z10) {
            li.n nVar = new li.n(getContext(), 2, 0.6f);
            nVar.f46483a = 1;
            nVar.f16207p = AndroidUtilities.dp(38.0f);
            lm0Var.getLayoutManager().w0(nVar);
            return;
        }
        lm0Var.u0(0);
    }

    public final void Y() {
        String string;
        int i10 = this.f48234r0;
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
        k kVar = this.f48237u0;
        if (kVar != null) {
            new vc(kVar.f48139c.container, kVar.f48138b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z10) {
        String string;
        ei.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f48234r0;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.Save);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        dVar.i(string, z10, true);
        HashSet hashSet = this.f48222e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        vg.h hVar;
        ArrayList arrayList = this.f48220c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f48221d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f48234r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            vg.g gVar = new vg.g(9, false);
            gVar.f48812i = 1;
            gVar.f48813j = i11;
            gVar.f48811g = string;
            arrayList2.add(gVar);
        }
        vg.g gVar2 = new vg.g(10, false);
        u3 u3Var = this.Z;
        gVar2.f48820q = u3Var;
        arrayList2.add(gVar2);
        int i12 = this.f48234r0;
        HashSet hashSet = this.f48222e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f48227j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f48226i0.get(str)) {
                    if (TextUtils.isEmpty(this.f48230n0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f48230n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        vg.g gVar3 = new vg.g(6, true);
                        gVar3.f48810f = tL_help_country;
                        gVar3.f48814k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    vg.g gVar4 = new vg.g(7, false);
                    gVar4.f48811g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f48224g0;
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
            gVar5.f48809c = null;
            gVar5.e = null;
            gVar5.f48814k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new vg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        vg.g gVar6 = new vg.g(-1, false);
        gVar6.f48815l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f48234r0 != 3) {
            u3Var.a(LocaleController.getString(R.string.UsersDeselectAll), new t0(this, 0));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.f23729b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f48231o0) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.l();
            }
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            lm0 lm0Var = this.d;
            if (i10 < lm0Var.getChildCount()) {
                View childAt = lm0Var.getChildAt(i10);
                if (childAt instanceof yg.k) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f48221d0;
                        if (R < arrayList.size()) {
                            vg.g gVar = (vg.g) arrayList.get(R);
                            yg.k kVar = (yg.k) childAt;
                            kVar.c(gVar.f48814k, z10);
                            TLRPC.Chat chat = gVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f48231o0.F(chat) > 200) {
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
                    bVar.c(this.f48222e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
                }
                i10++;
            } else {
                Z(z10);
                return;
            }
        }
    }

    public final void c0() {
        String str;
        String formatPluralStringComma;
        int i10 = this.f48234r0;
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
            TLRPC.Chat chat = this.f48233q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f48231o0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        i iVar = this.f48235s0;
        if (iVar != null) {
            iVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f48238v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.f48231o0 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence z() {
        int i10 = this.f48234r0;
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
}
