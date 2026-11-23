package wg;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c8.na;
import com.google.android.gms.internal.vision.e2;
import di.q2;
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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.d31;
import ug.i1;
public final class v0 extends ra {
    public final hi.e T1;
    public final u0 U1;
    public final y3 V1;
    public final ah.e W1;
    public final Paint X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashSet f59939a2;
    public final HashSet f59940b2;
    public final ArrayList f59941c2;
    public final ArrayList d2;
    public final HashMap f59942e2;
    public final ArrayList f59943f2;
    public final ArrayList f59944g2;
    public final LinkedHashMap f59945h2;
    public final c6 f59946i2;
    public String f59947j2;
    public xg.h f59948k2;
    public int f59949l2;
    public final TLRPC.Chat f59950m2;
    public int f59951n2;
    public i f59952o2;
    public int f59953p2;
    public k f59954q2;
    public final o5 f59955r2;

    public v0(g2 g2Var, long j3) {
        super(g2Var, false);
        this.X1 = new Paint(1);
        this.Y1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z1 = arrayList;
        this.f59939a2 = new HashSet();
        this.f59940b2 = new HashSet();
        this.f59941c2 = new ArrayList();
        this.d2 = new ArrayList();
        this.f59942e2 = new HashMap();
        this.f59943f2 = new ArrayList();
        this.f59944g2 = new ArrayList();
        this.f59945h2 = new LinkedHashMap();
        this.f59949l2 = org.telegram.messenger.g0.L(134.0f);
        this.f59955r2 = new o5(this, 12);
        this.f30261u0 = 0;
        this.f59950m2 = mp.u1(this.f30223a).O0(Long.valueOf(-j3));
        ((ViewGroup) this.f39247p1.getParent()).removeView(this.f39247p1);
        ViewGroup viewGroup = this.f30226b;
        kr krVar = kr.h;
        this.f59946i2 = new c6(viewGroup, 0L, 350L, krVar);
        ah.e eVar = new ah.e(getContext(), this.J0);
        this.W1 = eVar;
        eVar.setOnCloseClickListener(new q0(this, 7));
        eVar.setText(P0());
        eVar.setCloseImageVisible(true);
        eVar.f1068f.c(false, 0.0f);
        u0 u0Var = new u0(this, getContext(), this.J0);
        this.U1 = u0Var;
        int i7 = n6.f29524h5;
        u6.h(i7, u0Var, this.J0);
        u0Var.setOnSearchTextChange(new s0(this, 0));
        this.V1 = new y3(getContext(), this.J0);
        p1();
        ViewGroup viewGroup2 = this.f30226b;
        int i10 = this.f30261u0;
        viewGroup2.addView(eVar, na.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.f30226b;
        int i11 = this.f30261u0;
        viewGroup3.addView(u0Var, na.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (ek0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        u6.h(i7, aVar, this.J0);
        hi.e eVar2 = new hi.e(getContext(), this.J0, true);
        this.T1 = eVar2;
        eVar2.setOnClickListener(new r0(this, 1));
        aVar.addView(eVar2, na.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f30226b;
        int i12 = this.f30261u0;
        viewGroup4.addView(aVar, na.f(-2.0f, -1, 87, i12, 0, i12, 0));
        xg.h hVar = this.f59948k2;
        ek0 ek0Var = this.f39246o1;
        hVar.f60632n = arrayList;
        hVar.f60631f = ek0Var;
        int i13 = this.f30261u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.f39246o1.j(new i1(this, 2));
        this.f39246o1.setOnItemClickListener(new tg.s(this, 16));
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(krVar);
        lVar.C = false;
        lVar.f59274m = false;
        this.f39246o1.setItemAnimator(lVar);
        this.f39246o1.i(new ai.f0(this, 9));
        o1(false, true);
        g1(1, null, true);
        g1(3, null, true);
    }

    public static void e1(v0 v0Var, boolean z10, Pair pair) {
        HashMap hashMap = v0Var.f59942e2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            v0Var.f59943f2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new vh.c(v0Var, 1));
        }
        if (v0Var.f59951n2 == 3) {
            v0Var.o1(true, true);
            v0Var.k1(true);
        }
    }

    public static boolean h1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (e2.s(tL_help_country)) {
                String lowerCase = org.telegram.messenger.g0.M3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !i5.c.B(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.M3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || i5.c.B(" ", str, lowerCase2)) {
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
    public final void L() {
        super.L();
        org.telegram.messenger.g0.r(this.f59955r2);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, true);
        this.f59948k2 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.f59951n2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return "";
                }
                return gd.N0(2131753285, null);
            }
            return gd.N0(2131753600, null);
        }
        return gd.N0(2131749507, null);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        u0 u0Var;
        boolean z10;
        this.f59953p2 = i7;
        ah.e eVar = this.W1;
        eVar.setTranslationY(Math.max(i7, (((eVar.getMeasuredHeight() - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f24220m));
        float translationY = eVar.getTranslationY() + eVar.getMeasuredHeight();
        this.U1.setTranslationY(translationY);
        this.f39246o1.setTranslationY((u0Var.getMeasuredHeight() + eVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = n6.w0(n6.f29524h5, this.J0);
        Paint paint = this.X1;
        paint.setColor(w02);
        int max = Math.max(0, i7);
        if (max < org.telegram.messenger.g0.f24220m) {
            z10 = true;
        } else {
            z10 = false;
        }
        c6 c6Var = this.f59946i2;
        int W1 = org.telegram.messenger.g0.W1(c6Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.f30261u0, W1, this.f30226b.getWidth() - this.f30261u0, org.telegram.messenger.g0.L(14.0f) + this.f30226b.getHeight());
        float L = (1.0f - c6Var.f33931c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override
    public final void c0(Configuration configuration) {
        n1(false, true);
    }

    @Override
    public final void dismiss() {
        i iVar = this.f59952o2;
        if (iVar != null) {
            iVar.run();
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f59947j2)) {
            this.f59947j2 = null;
            this.U1.setText("");
            org.telegram.messenger.g0.r(this.f59955r2);
            ArrayList arrayList = this.f59941c2;
            arrayList.clear();
            arrayList.addAll(r.e(this.f59950m2.f28492id));
            o1(false, false);
            o1(true, true);
        }
    }

    public final void g1(int i7, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f59950m2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                t0 t0Var = new t0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.f24637t0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (gd.E0().B != null) {
                    country = gd.E0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ai.b1(t0Var, 26));
                return;
            }
            long j3 = chat.f28492id;
            s0 s0Var = new s0(this, 1);
            mp u12 = mp.u1(i10.f24637t0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10.f24637t0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f28538q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new q2(u12, j3, s0Var, 7));
            return;
        }
        long j10 = chat.f28492id;
        t0 t0Var2 = new t0(this, z10, 0);
        mp u13 = mp.u1(i10.f24637t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(i10.f24637t0);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = u13.j1(j10);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f28491q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new d31(10, u13, t0Var2));
    }

    public final void i1(int i7, List list) {
        long j3;
        this.f59951n2 = i7;
        this.f59947j2 = null;
        HashSet hashSet = this.f59940b2;
        hashSet.clear();
        HashSet hashSet2 = this.f59939a2;
        hashSet2.clear();
        ArrayList arrayList = this.f59941c2;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f59945h2;
        linkedHashMap.clear();
        if (i7 != 1) {
            if (i7 == 2) {
                arrayList.addAll(r.e(this.f59950m2.f28492id));
            }
        } else {
            arrayList.addAll(this.d2);
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
                    j3 = -((TLRPC.Chat) tLObject).f28492id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f28641id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        u0 u0Var = this.U1;
        u0Var.setText("");
        u0Var.d.b(false);
        u0Var.b(false, hashSet2, new q0(this, 4), this.f59944g2);
        p1();
        o1(false, true);
        this.W1.setText(P0());
        m1(false);
        k1(false);
    }

    public final void j1(boolean z10) {
        l lVar;
        HashSet hashSet = this.f59939a2;
        if (hashSet.size() != 0 || z10) {
            int i7 = this.f59951n2;
            LinkedHashMap linkedHashMap = this.f59945h2;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f59944g2;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                            if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                                arrayList.add(tL_help_country);
                            }
                        }
                        k kVar = this.f59954q2;
                        if (kVar != null) {
                            kVar.f59892c.f59895m1.C(0);
                            z zVar = kVar.f59890a;
                            ArrayList arrayList3 = zVar.f59969a2;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            zVar.l1(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f28492id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                k kVar2 = this.f59954q2;
                if (kVar2 != null) {
                    kVar2.f59892c.f59895m1.C(0);
                    z zVar2 = kVar2.f59890a;
                    ArrayList arrayList5 = zVar2.Y1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    zVar2.l1(!lVar.d, true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f28641id))) {
                        arrayList6.add(user);
                    }
                }
            }
            k kVar3 = this.f59954q2;
            if (kVar3 != null) {
                kVar3.f59892c.f59895m1.C(0);
                z zVar3 = kVar3.f59890a;
                ArrayList arrayList7 = zVar3.Z1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i11 = yg.d.f61358w;
                    zVar3.f59972e2 = 0;
                } else {
                    int i12 = yg.d.f61358w;
                    zVar3.f59972e2 = 1;
                }
                zVar3.f59977j2 = 0;
                zVar3.l1(false, true);
                zVar3.k1(true);
                zVar3.c1();
            }
        }
    }

    public final void k1(boolean z10) {
        ek0 ek0Var = this.f39246o1;
        if (z10) {
            pi.l lVar = new pi.l(getContext(), 2, 0.6f);
            lVar.f59190a = 1;
            lVar.f55822p = org.telegram.messenger.g0.L(38.0f);
            ek0Var.getLayoutManager().w0(lVar);
            return;
        }
        ek0Var.v0(0);
    }

    public final void l1() {
        String N0;
        int i7 = this.f59951n2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    N0 = "";
                } else {
                    N0 = gd.G((int) mp.u1(i10.f24637t0).f25830q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                N0 = gd.G((int) r.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            N0 = gd.N0(2131753269, null);
        }
        k kVar = this.f59954q2;
        if (kVar != null) {
            new kc(kVar.f59892c.f30229c, kVar.f59891b).Q(2131623982, 36, N0).k(true);
        }
    }

    public final void m1(boolean z10) {
        String N0;
        hi.e eVar = this.T1;
        boolean z11 = false;
        eVar.setShowZero(false);
        int i7 = this.f59951n2;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                N0 = "";
            } else {
                N0 = gd.N0(2131745750, null);
            }
        } else {
            N0 = gd.N0(2131753286, null);
        }
        eVar.i(N0, z10, true);
        HashSet hashSet = this.f59939a2;
        eVar.c(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        eVar.setEnabled(z11);
    }

    public final void n1(boolean z10, boolean z11) {
        int i7;
        xg.h hVar;
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f59951n2 == 1) {
            String N0 = gd.N0(2131749376, null);
            xg.g gVar = new xg.g(9, false);
            gVar.h = 1;
            gVar.f60622i = 2131231877;
            gVar.f60620f = N0;
            arrayList2.add(gVar);
        }
        xg.g gVar2 = new xg.g(10, false);
        y3 y3Var = this.V1;
        gVar2.f60629p = y3Var;
        arrayList2.add(gVar2);
        int i10 = this.f59951n2;
        HashSet hashSet = this.f59939a2;
        if (i10 == 3) {
            ArrayList arrayList3 = this.f59943f2;
            int size = arrayList3.size();
            i7 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f59942e2.get(str)) {
                    if (TextUtils.isEmpty(this.f59947j2) || h1(tL_help_country, org.telegram.messenger.g0.M3(this.f59947j2).toLowerCase())) {
                        i7 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        xg.g gVar3 = new xg.g(6, true);
                        gVar3.f60619e = tL_help_country;
                        gVar3.f60623j = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    xg.g gVar4 = new xg.g(7, false);
                    gVar4.f60620f = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i7 = org.telegram.messenger.g0.L(32.0f) + i7;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i7 = 0;
        }
        ArrayList arrayList6 = this.f59941c2;
        int size2 = arrayList6.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList6.get(i12);
            i12++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i7 += org.telegram.messenger.g0.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(n5.n(inputPeer)));
            xg.g gVar5 = new xg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f60618c = null;
            gVar5.f60623j = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.g(5, false));
            i7 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f24226q.y * 0.6f)) - i7);
        xg.g gVar6 = new xg.g(-1, false);
        gVar6.f60624k = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f59951n2 != 3) {
            y3Var.a(gd.N0(2131743383, null), new r0(this, 0));
        } else if (z10) {
            y3Var.setRightText(null);
        } else {
            x3 x3Var = y3Var.f32554b;
            x3Var.c(null, false, true);
            x3Var.setOnClickListener(null);
            x3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f59948k2) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.f();
            }
        }
    }

    public final void o1(boolean z10, boolean z11) {
        n1(z10, z11);
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f39246o1;
            if (i7 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof ah.r) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.Z1;
                        if (R < arrayList.size()) {
                            ah.r rVar = (ah.r) childAt;
                            rVar.c(((xg.g) arrayList.get(R)).f60623j, z10);
                            rVar.i(z10, 1.0f);
                        }
                    }
                    i7++;
                }
                if (childAt instanceof ah.c) {
                    ah.c cVar = (ah.c) childAt;
                    cVar.c(this.f59939a2.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
                }
                i7++;
            } else {
                m1(z10);
                return;
            }
        }
    }

    public final void p1() {
        String str;
        String H;
        int i7 = this.f59951n2;
        y3 y3Var = this.V1;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    H = "";
                } else {
                    H = gd.G((int) mp.u1(i10.f24637t0).f25830q0, "BoostingSelectUpToCountriesPlural", new Object[0]);
                    y3Var.setLayerHeight(1);
                }
            } else {
                H = gd.G((int) r.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                y3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f59950m2;
            if (v3.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = gd.H(',', str, Math.max(0, this.f59948k2.F(chat) - 1));
            y3Var.setLayerHeight(32);
        }
        y3Var.setText(H);
    }
}
