package sg;

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
import bi.c2;
import bi.va;
import bi.z1;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.messenger.a2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.fz0;
import org.telegram.ui.p20;
import org.telegram.ui.rg0;
import w7.a6;
public final class c1 extends ab {
    public final bi.d X;
    public final b1 Y;
    public final u3 Z;
    public final wg.c f41879a0;
    public final Paint f41880b0;
    public final ArrayList f41881c0;
    public final ArrayList f41882d0;
    public final HashSet f41883e0;
    public final HashSet f41884f0;
    public final ArrayList f41885g0;
    public final ArrayList f41886h0;
    public final HashMap f41887i0;
    public final ArrayList f41888j0;
    public final ArrayList f41889k0;
    public final LinkedHashMap f41890l0;
    public final d6 m0;
    public String f41891n0;
    public tg.g f41892o0;
    public int f41893p0;
    public final TLRPC.Chat f41894q0;
    public int f41895r0;
    public j f41896s0;
    public int f41897t0;
    public l f41898u0;
    public final a1 f41899v0;

    public c1(p2 p2Var, long j3) {
        super(p2Var, false);
        this.f41880b0 = new Paint(1);
        this.f41881c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f41882d0 = arrayList;
        this.f41883e0 = new HashSet();
        this.f41884f0 = new HashSet();
        this.f41885g0 = new ArrayList();
        this.f41886h0 = new ArrayList();
        this.f41887i0 = new HashMap();
        this.f41888j0 = new ArrayList();
        this.f41889k0 = new ArrayList();
        this.f41890l0 = new LinkedHashMap();
        this.f41893p0 = AndroidUtilities.dp(134.0f);
        this.f41899v0 = new a1(this, 0);
        this.backgroundPaddingLeft = 0;
        this.f41894q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        wr wrVar = wr.h;
        this.m0 = new d6(viewGroup, 0L, 350L, wrVar);
        wg.c cVar = new wg.c(getContext(), this.resourcesProvider);
        this.f41879a0 = cVar;
        cVar.setOnCloseClickListener(new v0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        b1 b1Var = new b1(this, getContext(), this.resourcesProvider);
        this.Y = b1Var;
        int i10 = j6.f17998h5;
        b1Var.setBackgroundColor(getThemedColor(i10));
        b1Var.setOnSearchTextChange(new y0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, a6.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(b1Var, a6.f(-2.0f, 55, i12, 0, i12, 0));
        p20 p20Var = new p20(getContext(), this.resourcesProvider, (vl0) null);
        p20Var.setClickable(true);
        p20Var.setOrientation(1);
        p20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        p20Var.setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        bi.d dVar = new bi.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new x0(this, 1));
        p20Var.addView(dVar, a6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(p20Var, a6.f(-2.0f, 87, i13, 0, i13, 0));
        tg.g gVar = this.f41892o0;
        vl0 vl0Var = this.d;
        gVar.f42172n = arrayList;
        gVar.f42171f = vl0Var;
        int i14 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new al0(this, 10));
        this.d.setOnItemClickListener(new org.telegram.tgnet.j(this, 27));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(wrVar);
        jVar.C = false;
        jVar.f41645m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new z1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static void P(c1 c1Var, boolean z10, Pair pair) {
        HashMap hashMap = c1Var.f41887i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            c1Var.f41888j0.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new w0(c1Var, 0));
        }
        if (c1Var.f41895r0 == 3) {
            c1Var.b0(true, true);
            c1Var.X(true);
        }
    }

    public static void Q(c1 c1Var, View view) {
        long j3;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap = c1Var.f41890l0;
        b1 b1Var = c1Var.Y;
        HashSet hashSet = c1Var.f41883e0;
        if (view instanceof s8) {
            linkedHashMap.clear();
            c1Var.W(true);
        } else if (view instanceof wg.k) {
            wg.k kVar = (wg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            if (user != null) {
                j3 = user.f17342id;
            } else {
                j3 = -chat.f17195id;
            }
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                Long valueOf = Long.valueOf(j3);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && c1Var.f41895r0 == 1) || (hashSet.size() == s.f() + 1 && c1Var.f41895r0 == 2)) {
                hashSet.remove(Long.valueOf(j3));
                c1Var.Y();
                return;
            }
            b1Var.b(true, hashSet, new v0(c1Var, 1), null);
            c1Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j3))) {
                Context context = c1Var.f21452n.getContext();
                f6 f6Var = c1Var.resourcesProvider;
                va vaVar = new va(c1Var, j3, 24);
                v0 v0Var = new v0(c1Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (isChannelAndNotMegaGroup) {
                    i10 = R.string.BoostingGiveawayPrivateChannel;
                } else {
                    i10 = R.string.BoostingGiveawayPrivateGroup;
                }
                alertDialog$Builder.f17528a.R = LocaleController.getString(i10);
                if (isChannelAndNotMegaGroup) {
                    i11 = R.string.BoostingGiveawayPrivateChannelWarning;
                } else {
                    i11 = R.string.BoostingGiveawayPrivateGroupWarning;
                }
                alertDialog$Builder.f17528a.T = LocaleController.getString(i11);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new fz0(26, atomicBoolean, v0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(22));
                alertDialog$Builder.j(new di.h0(15, atomicBoolean, vaVar));
                alertDialog$Builder.o();
            } else if (chat != null) {
                c1Var.R();
            }
        }
        if (view instanceof wg.b) {
            long hashCode = ((wg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && c1Var.f41895r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                c1Var.Y();
                return;
            }
            b1Var.b(true, hashSet, new v0(c1Var, 3), c1Var.f41889k0);
            if (!TextUtils.isEmpty(c1Var.f41891n0)) {
                c1Var.f41891n0 = null;
                b1Var.setText("");
                c1Var.b0(false, false);
                c1Var.b0(true, true);
                return;
            }
            c1Var.b0(true, false);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (e2.u(tL_help_country)) {
                String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !a2.w(" ", str, lowerCase)) {
                    String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || a2.w(" ", str, lowerCase2)) {
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
        boolean z10;
        this.f41897t0 = i10;
        wg.c cVar = this.f41879a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        b1 b1Var = this.Y;
        b1Var.setTranslationY(translationY);
        this.d.setTranslationY((b1Var.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int v02 = j6.v0(j6.f17998h5, this.resourcesProvider);
        Paint paint = this.f41880b0;
        paint.setColor(v02);
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
        float dp = (1.0f - d6Var.f22295c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (!TextUtils.isEmpty(this.f41891n0)) {
            this.f41891n0 = null;
            this.Y.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.f41899v0);
            ArrayList arrayList = this.f41885g0;
            arrayList.clear();
            arrayList.addAll(s.e(this.f41894q0.f17195id));
            b0(false, false);
            b0(true, true);
        }
    }

    public final boolean S() {
        String string;
        HashSet hashSet = this.f41883e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f41884f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.f41895r0;
        Context context = getContext();
        f6 f6Var = this.resourcesProvider;
        v0 v0Var = new v0(this, 0);
        v0 v0Var2 = new v0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.f17528a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
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
        alertDialog$Builder.f17528a.T = string;
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new org.telegram.tgnet.j(v0Var, 26));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new org.telegram.tgnet.j(v0Var2, 23));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f41894q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                z0 z0Var = new z0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
                    country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new c2(z0Var, 16));
                return;
            }
            long j3 = chat.f17195id;
            y0 y0Var = new y0(this, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f17241q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new org.telegram.messenger.voip.h(messagesController, j3, y0Var, 3));
            return;
        }
        long j10 = chat.f17195id;
        z0 z0Var2 = new z0(this, z10, 0);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = messagesController2.getInputChannel(j10);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f17194q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new rg0(27, messagesController2, z0Var2));
    }

    public final void V(int i10, List list) {
        long j3;
        this.f41895r0 = i10;
        this.f41891n0 = null;
        HashSet hashSet = this.f41884f0;
        hashSet.clear();
        HashSet hashSet2 = this.f41883e0;
        hashSet2.clear();
        ArrayList arrayList = this.f41885g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f41890l0;
        linkedHashMap.clear();
        if (i10 != 1) {
            if (i10 == 2) {
                arrayList.addAll(s.e(this.f41894q0.f17195id));
            }
        } else {
            arrayList.addAll(this.f41886h0);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (tLObject instanceof TLRPC.TL_inputPeerChat) {
                    j3 = -((TLRPC.TL_inputPeerChat) tLObject).chat_id;
                } else {
                    j3 = 0;
                }
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j3 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) tLObject).f17195id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f17342id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        b1 b1Var = this.Y;
        b1Var.setText("");
        b1Var.d.b(false);
        b1Var.b(false, hashSet2, new v0(this, 4), this.f41889k0);
        c0();
        b0(false, true);
        this.f41879a0.setText(y());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        HashSet hashSet = this.f41883e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.f41895r0;
            LinkedHashMap linkedHashMap = this.f41890l0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f41889k0;
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
                        l lVar = this.f41898u0;
                        if (lVar != null) {
                            lVar.f41948c.f41953b.D(0);
                            a0 a0Var = lVar.f41946a;
                            ArrayList arrayList3 = a0Var.f41850e0;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a0Var.a0(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f17195id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                l lVar2 = this.f41898u0;
                if (lVar2 != null) {
                    m mVar = lVar2.f41948c;
                    mVar.f41953b.D(0);
                    a0 a0Var2 = lVar2.f41946a;
                    ArrayList arrayList5 = a0Var2.f41848c0;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.a0(!mVar.isKeyboardVisible(), true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f17342id))) {
                        arrayList6.add(user);
                    }
                }
            }
            l lVar3 = this.f41898u0;
            if (lVar3 != null) {
                lVar3.f41948c.f41953b.D(0);
                a0 a0Var3 = lVar3.f41946a;
                ArrayList arrayList7 = a0Var3.f41849d0;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i12 = ug.d.f42690s;
                    a0Var3.f41854i0 = 0;
                } else {
                    int i13 = ug.d.f42690s;
                    a0Var3.f41854i0 = 1;
                }
                a0Var3.f41858n0 = 0;
                a0Var3.a0(false, true);
                a0Var3.Z(true);
                a0Var3.N();
            }
        }
    }

    public final void X(boolean z10) {
        vl0 vl0Var = this.d;
        if (z10) {
            ii.o oVar = new ii.o(getContext(), 2, 0.6f);
            oVar.f41760a = 1;
            oVar.f10694p = AndroidUtilities.dp(38.0f);
            vl0Var.getLayoutManager().w0(oVar);
            return;
        }
        vl0Var.u0(0);
    }

    public final void Y() {
        String string;
        int i10 = this.f41895r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = "";
                } else {
                    string = LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
                }
            } else {
                string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) s.f(), new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        l lVar = this.f41898u0;
        if (lVar != null) {
            new wc(lVar.f41948c.container, lVar.f41947b).Q(R.raw.chats_infotip, 36, string).k(true);
        }
    }

    public final void Z(boolean z10) {
        String string;
        bi.d dVar = this.X;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i10 = this.f41895r0;
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
        HashSet hashSet = this.f41883e0;
        dVar.b(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        tg.g gVar;
        ArrayList arrayList = this.f41881c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f41882d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f41895r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            tg.f fVar = new tg.f(9, false);
            fVar.f42161i = 1;
            fVar.f42162j = i11;
            fVar.f42160g = string;
            arrayList2.add(fVar);
        }
        tg.f fVar2 = new tg.f(10, false);
        u3 u3Var = this.Z;
        fVar2.f42169q = u3Var;
        arrayList2.add(fVar2);
        int i12 = this.f41895r0;
        HashSet hashSet = this.f41883e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.f41888j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f41887i0.get(str)) {
                    if (TextUtils.isEmpty(this.f41891n0) || U(tL_help_country, AndroidUtilities.translitSafe(this.f41891n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        tg.f fVar3 = new tg.f(6, true);
                        fVar3.f42159f = tL_help_country;
                        fVar3.f42163k = contains;
                        arrayList4.add(fVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    tg.f fVar4 = new tg.f(7, false);
                    fVar4.f42160g = upperCase;
                    arrayList2.add(fVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = AndroidUtilities.dp(32.0f) + i10;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.f41885g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            tg.f fVar5 = new tg.f(3, true);
            fVar5.d = inputPeer;
            fVar5.f42158c = null;
            fVar5.e = null;
            fVar5.f42163k = contains2;
            arrayList2.add(fVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new tg.f(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        tg.f fVar6 = new tg.f(-1, false);
        fVar6.f42164l = max;
        arrayList2.add(fVar6);
        if (hashSet.size() > 0 && this.f41895r0 != 3) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new x0(this, 0));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.f20476b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (z11 && (gVar = this.f41892o0) != null) {
            if (z10) {
                gVar.E(arrayList, arrayList2);
            } else {
                gVar.l();
            }
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            vl0 vl0Var = this.d;
            if (i10 < vl0Var.getChildCount()) {
                View childAt = vl0Var.getChildAt(i10);
                if (childAt instanceof wg.k) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.f41882d0;
                        if (R < arrayList.size()) {
                            tg.f fVar = (tg.f) arrayList.get(R);
                            wg.k kVar = (wg.k) childAt;
                            kVar.c(fVar.f42163k, z10);
                            TLRPC.Chat chat = fVar.e;
                            float f7 = 1.0f;
                            if (chat != null) {
                                if (this.f41892o0.F(chat) > 200) {
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
                if (childAt instanceof wg.b) {
                    wg.b bVar = (wg.b) childAt;
                    bVar.c(this.f41883e0.contains(Long.valueOf(bVar.getCountry().default_name.hashCode())), true);
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
        int i10 = this.f41895r0;
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
                formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) s.f(), new Object[0]);
                u3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f41894q0;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            formatPluralStringComma = LocaleController.formatPluralStringComma(str, Math.max(0, this.f41892o0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override
    public final void dismiss() {
        j jVar = this.f41896s0;
        if (jVar != null) {
            jVar.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.f41899v0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        tg.g gVar = new tg.g(getContext(), this.resourcesProvider, true);
        this.f41892o0 = gVar;
        return gVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f41895r0;
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
