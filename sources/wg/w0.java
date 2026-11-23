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
import di.p2;
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
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.e31;
import tg.o1;
import ug.i1;
public final class w0 extends sa {
    public final hi.d T1;
    public final v0 U1;
    public final y3 V1;
    public final ah.e W1;
    public final Paint X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashSet f59844a2;
    public final HashSet f59845b2;
    public final ArrayList f59846c2;
    public final ArrayList d2;
    public final HashMap f59847e2;
    public final ArrayList f59848f2;
    public final ArrayList f59849g2;
    public final LinkedHashMap f59850h2;
    public final d6 f59851i2;
    public String f59852j2;
    public xg.h f59853k2;
    public int f59854l2;
    public final TLRPC.Chat f59855m2;
    public int f59856n2;
    public i f59857o2;
    public int f59858p2;
    public k f59859q2;
    public final s4.s0 f59860r2;

    public w0(g2 g2Var, long j3) {
        super(g2Var, false);
        this.X1 = new Paint(1);
        this.Y1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z1 = arrayList;
        this.f59844a2 = new HashSet();
        this.f59845b2 = new HashSet();
        this.f59846c2 = new ArrayList();
        this.d2 = new ArrayList();
        this.f59847e2 = new HashMap();
        this.f59848f2 = new ArrayList();
        this.f59849g2 = new ArrayList();
        this.f59850h2 = new LinkedHashMap();
        this.f59854l2 = org.telegram.messenger.g0.L(134.0f);
        this.f59860r2 = new s4.s0(this, 8);
        this.f30177u0 = 0;
        this.f59855m2 = np.u1(this.f30139a).O0(Long.valueOf(-j3));
        ((ViewGroup) this.f39488p1.getParent()).removeView(this.f39488p1);
        ViewGroup viewGroup = this.f30142b;
        nr nrVar = nr.h;
        this.f59851i2 = new d6(viewGroup, 0L, 350L, nrVar);
        ah.e eVar = new ah.e(getContext(), this.J0);
        this.W1 = eVar;
        eVar.setOnCloseClickListener(new r0(this, 7));
        eVar.setText(P0());
        eVar.setCloseImageVisible(true);
        eVar.f1068f.c(false, 0.0f);
        v0 v0Var = new v0(this, getContext(), this.J0);
        this.U1 = v0Var;
        int i7 = m6.f29420h5;
        t6.h(i7, v0Var, this.J0);
        v0Var.setOnSearchTextChange(new t0(this, 0));
        this.V1 = new y3(getContext(), this.J0);
        p1();
        ViewGroup viewGroup2 = this.f30142b;
        int i10 = this.f30177u0;
        viewGroup2.addView(eVar, na.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.f30142b;
        int i11 = this.f30177u0;
        viewGroup3.addView(v0Var, na.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (ek0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        t6.h(i7, aVar, this.J0);
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        this.T1 = dVar;
        dVar.setOnClickListener(new s0(this, 1));
        aVar.addView(dVar, na.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f30142b;
        int i12 = this.f30177u0;
        viewGroup4.addView(aVar, na.f(-2.0f, -1, 87, i12, 0, i12, 0));
        xg.h hVar = this.f59853k2;
        ek0 ek0Var = this.f39487o1;
        hVar.f60514n = arrayList;
        hVar.f60513f = ek0Var;
        int i13 = this.f30177u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.f39487o1.j(new i1(this, 2));
        this.f39487o1.setOnItemClickListener(new o1(this, 14));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(nrVar);
        kVar.C = false;
        kVar.f59139m = false;
        this.f39487o1.setItemAnimator(kVar);
        this.f39487o1.i(new ai.e0(this, 9));
        o1(false, true);
        g1(1, null, true);
        g1(3, null, true);
    }

    public static void e1(w0 w0Var, boolean z10, Pair pair) {
        HashMap hashMap = w0Var.f59847e2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            w0Var.f59848f2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new vh.c(w0Var, 1));
        }
        if (w0Var.f59856n2 == 3) {
            w0Var.o1(true, true);
            w0Var.k1(true);
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
        org.telegram.messenger.g0.r(this.f59860r2);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, true);
        this.f59853k2 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.f59856n2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return "";
                }
                return hd.N0(2131753285, null);
            }
            return hd.N0(2131753600, null);
        }
        return hd.N0(2131749507, null);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        v0 v0Var;
        boolean z10;
        this.f59858p2 = i7;
        ah.e eVar = this.W1;
        eVar.setTranslationY(Math.max(i7, (((eVar.getMeasuredHeight() - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f24004m));
        float translationY = eVar.getTranslationY() + eVar.getMeasuredHeight();
        this.U1.setTranslationY(translationY);
        this.f39487o1.setTranslationY((v0Var.getMeasuredHeight() + eVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = m6.w0(m6.f29420h5, this.J0);
        Paint paint = this.X1;
        paint.setColor(w02);
        int max = Math.max(0, i7);
        if (max < org.telegram.messenger.g0.f24004m) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6 d6Var = this.f59851i2;
        int W1 = org.telegram.messenger.g0.W1(d6Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.f30177u0, W1, this.f30142b.getWidth() - this.f30177u0, org.telegram.messenger.g0.L(14.0f) + this.f30142b.getHeight());
        float L = (1.0f - d6Var.f34349c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override
    public final void c0(Configuration configuration) {
        n1(false, true);
    }

    @Override
    public final void dismiss() {
        i iVar = this.f59857o2;
        if (iVar != null) {
            iVar.run();
        }
    }

    public final void f1() {
        if (!TextUtils.isEmpty(this.f59852j2)) {
            this.f59852j2 = null;
            this.U1.setText("");
            org.telegram.messenger.g0.r(this.f59860r2);
            ArrayList arrayList = this.f59846c2;
            arrayList.clear();
            arrayList.addAll(s.e(this.f59855m2.f28398id));
            o1(false, false);
            o1(true, true);
        }
    }

    public final void g1(int i7, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f59855m2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                u0 u0Var = new u0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24932t0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (hd.E0().B != null) {
                    country = hd.E0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ai.a1(u0Var, 26));
                return;
            }
            long j3 = chat.f28398id;
            t0 t0Var = new t0(this, 1);
            np u12 = np.u1(k10.f24932t0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(k10.f24932t0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f28444q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new p2(u12, j3, t0Var, 7));
            return;
        }
        long j10 = chat.f28398id;
        u0 u0Var2 = new u0(this, z10, 0);
        np u13 = np.u1(k10.f24932t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(k10.f24932t0);
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
        tL_channelParticipantsSearch.f28397q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new e31(10, u13, u0Var2));
    }

    public final void i1(int i7, List list) {
        long j3;
        this.f59856n2 = i7;
        this.f59852j2 = null;
        HashSet hashSet = this.f59845b2;
        hashSet.clear();
        HashSet hashSet2 = this.f59844a2;
        hashSet2.clear();
        ArrayList arrayList = this.f59846c2;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f59850h2;
        linkedHashMap.clear();
        if (i7 != 1) {
            if (i7 == 2) {
                arrayList.addAll(s.e(this.f59855m2.f28398id));
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
                    j3 = -((TLRPC.Chat) tLObject).f28398id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f28547id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        v0 v0Var = this.U1;
        v0Var.setText("");
        v0Var.d.b(false);
        v0Var.b(false, hashSet2, new r0(this, 4), this.f59849g2);
        p1();
        o1(false, true);
        this.W1.setText(P0());
        m1(false);
        k1(false);
    }

    public final void j1(boolean z10) {
        l lVar;
        HashSet hashSet = this.f59844a2;
        if (hashSet.size() != 0 || z10) {
            int i7 = this.f59856n2;
            LinkedHashMap linkedHashMap = this.f59850h2;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f59849g2;
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
                        k kVar = this.f59859q2;
                        if (kVar != null) {
                            kVar.f59794c.f59796m1.A(0);
                            a0 a0Var = kVar.f59792a;
                            ArrayList arrayList3 = a0Var.f59703a2;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a0Var.l1(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f28398id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                k kVar2 = this.f59859q2;
                if (kVar2 != null) {
                    kVar2.f59794c.f59796m1.A(0);
                    a0 a0Var2 = kVar2.f59792a;
                    ArrayList arrayList5 = a0Var2.Y1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.l1(!lVar.d, true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f28547id))) {
                        arrayList6.add(user);
                    }
                }
            }
            k kVar3 = this.f59859q2;
            if (kVar3 != null) {
                kVar3.f59794c.f59796m1.A(0);
                a0 a0Var3 = kVar3.f59792a;
                ArrayList arrayList7 = a0Var3.Z1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i11 = yg.d.f61239w;
                    a0Var3.f59706e2 = 0;
                } else {
                    int i12 = yg.d.f61239w;
                    a0Var3.f59706e2 = 1;
                }
                a0Var3.f59711j2 = 0;
                a0Var3.l1(false, true);
                a0Var3.k1(true);
                a0Var3.c1();
            }
        }
    }

    public final void k1(boolean z10) {
        ek0 ek0Var = this.f39487o1;
        if (z10) {
            pi.l lVar = new pi.l(getContext(), 2, 0.6f);
            lVar.f59055a = 1;
            lVar.f55709p = org.telegram.messenger.g0.L(38.0f);
            ek0Var.getLayoutManager().w0(lVar);
            return;
        }
        ek0Var.v0(0);
    }

    public final void l1() {
        String N0;
        int i7 = this.f59856n2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    N0 = "";
                } else {
                    N0 = hd.G((int) np.u1(k10.f24932t0).f25898q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                N0 = hd.G((int) s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            N0 = hd.N0(2131753269, null);
        }
        k kVar = this.f59859q2;
        if (kVar != null) {
            new lc(kVar.f59794c.f30145c, kVar.f59793b).Q(2131623982, 36, N0).k(true);
        }
    }

    public final void m1(boolean z10) {
        String N0;
        hi.d dVar = this.T1;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i7 = this.f59856n2;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                N0 = "";
            } else {
                N0 = hd.N0(2131745750, null);
            }
        } else {
            N0 = hd.N0(2131753286, null);
        }
        dVar.i(N0, z10, true);
        HashSet hashSet = this.f59844a2;
        dVar.c(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void n1(boolean z10, boolean z11) {
        int i7;
        xg.h hVar;
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f59856n2 == 1) {
            String N0 = hd.N0(2131749376, null);
            xg.g gVar = new xg.g(9, false);
            gVar.h = 1;
            gVar.f60504i = 2131231874;
            gVar.f60502f = N0;
            arrayList2.add(gVar);
        }
        xg.g gVar2 = new xg.g(10, false);
        y3 y3Var = this.V1;
        gVar2.f60511p = y3Var;
        arrayList2.add(gVar2);
        int i10 = this.f59856n2;
        HashSet hashSet = this.f59844a2;
        if (i10 == 3) {
            ArrayList arrayList3 = this.f59848f2;
            int size = arrayList3.size();
            i7 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f59847e2.get(str)) {
                    if (TextUtils.isEmpty(this.f59852j2) || h1(tL_help_country, org.telegram.messenger.g0.M3(this.f59852j2).toLowerCase())) {
                        i7 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        xg.g gVar3 = new xg.g(6, true);
                        gVar3.f60501e = tL_help_country;
                        gVar3.f60505j = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    xg.g gVar4 = new xg.g(7, false);
                    gVar4.f60502f = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i7 = org.telegram.messenger.g0.L(32.0f) + i7;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i7 = 0;
        }
        ArrayList arrayList6 = this.f59846c2;
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
            gVar5.f60500c = null;
            gVar5.f60505j = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.g(5, false));
            i7 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f24010q.y * 0.6f)) - i7);
        xg.g gVar6 = new xg.g(-1, false);
        gVar6.f60506k = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f59856n2 != 3) {
            y3Var.a(hd.N0(2131743387, null), new s0(this, 0));
        } else if (z10) {
            y3Var.setRightText(null);
        } else {
            x3 x3Var = y3Var.f32453b;
            x3Var.c(null, false, true);
            x3Var.setOnClickListener(null);
            x3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f59853k2) != null) {
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
            ek0 ek0Var = this.f39487o1;
            if (i7 < ek0Var.getChildCount()) {
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof ah.r) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.Z1;
                        if (R < arrayList.size()) {
                            ah.r rVar = (ah.r) childAt;
                            rVar.c(((xg.g) arrayList.get(R)).f60505j, z10);
                            rVar.i(z10, 1.0f);
                        }
                    }
                    i7++;
                }
                if (childAt instanceof ah.c) {
                    ah.c cVar = (ah.c) childAt;
                    cVar.c(this.f59844a2.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
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
        int i7 = this.f59856n2;
        y3 y3Var = this.V1;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    H = "";
                } else {
                    H = hd.G((int) np.u1(k10.f24932t0).f25898q0, "BoostingSelectUpToCountriesPlural", new Object[0]);
                    y3Var.setLayerHeight(1);
                }
            } else {
                H = hd.G((int) s.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                y3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f59855m2;
            if (v3.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = hd.H(',', str, Math.max(0, this.f59853k2.F(chat) - 1));
            y3Var.setLayerHeight(32);
        }
        y3Var.setText(H);
    }
}
