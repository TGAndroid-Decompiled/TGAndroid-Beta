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
import bi.h3;
import c8.ha;
import fi.o1;
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
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.n41;
public final class w0 extends na {
    public final fi.d P1;
    public final v0 Q1;
    public final x3 R1;
    public final ah.e S1;
    public final Paint T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final HashSet W1;
    public final HashSet X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashMap f57728a2;
    public final ArrayList f57729b2;
    public final ArrayList f57730c2;
    public final LinkedHashMap d2;
    public final w5 f57731e2;
    public String f57732f2;
    public xg.i f57733g2;
    public int f57734h2;
    public final TLRPC.Chat f57735i2;
    public int f57736j2;
    public i f57737k2;
    public int f57738l2;
    public k f57739m2;
    public final tg.y f57740n2;

    public w0(f2 f2Var, long j3) {
        super(f2Var, false);
        this.T1 = new Paint(1);
        this.U1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        this.W1 = new HashSet();
        this.X1 = new HashSet();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f57728a2 = new HashMap();
        this.f57729b2 = new ArrayList();
        this.f57730c2 = new ArrayList();
        this.d2 = new LinkedHashMap();
        this.f57734h2 = org.telegram.messenger.g0.L(134.0f);
        this.f57740n2 = new tg.y(this, 5);
        this.f28646t0 = 0;
        this.f57735i2 = qp.s1(this.f28613a).M0(Long.valueOf(-j3));
        ((ViewGroup) this.l1.getParent()).removeView(this.l1);
        ViewGroup viewGroup = this.f28616b;
        xq xqVar = xq.h;
        this.f57731e2 = new w5(viewGroup, 0L, 350L, xqVar);
        ah.e eVar = new ah.e(getContext(), this.I0);
        this.S1 = eVar;
        eVar.setOnCloseClickListener(new r0(this, 7));
        eVar.setText(O0());
        eVar.setCloseImageVisible(true);
        eVar.f1071f.c(false, 0.0f);
        v0 v0Var = new v0(this, getContext(), this.I0);
        this.Q1 = v0Var;
        int i7 = k6.f27922h5;
        r6.i(i7, v0Var, this.I0);
        v0Var.setOnSearchTextChange(new t0(this, 0));
        this.R1 = new x3(getContext(), this.I0);
        o1();
        ViewGroup viewGroup2 = this.f28616b;
        int i10 = this.f28646t0;
        viewGroup2.addView(eVar, ha.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.f28616b;
        int i11 = this.f28646t0;
        viewGroup3.addView(v0Var, ha.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ah.a aVar = new ah.a(getContext(), this.I0, (pj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        r6.i(i7, aVar, this.I0);
        fi.d dVar = new fi.d(getContext(), this.I0, true);
        this.P1 = dVar;
        dVar.setOnClickListener(new s0(this, 1));
        aVar.addView(dVar, ha.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f28616b;
        int i12 = this.f28646t0;
        viewGroup4.addView(aVar, ha.f(-2.0f, -1, 87, i12, 0, i12, 0));
        xg.i iVar = this.f57733g2;
        pj0 pj0Var = this.f36261k1;
        iVar.f58651n = arrayList;
        iVar.f58650f = pj0Var;
        int i13 = this.f28646t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.f36261k1.j(new ui(this, 28));
        this.f36261k1.setOnItemClickListener(new u5.e(this, 8));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(xqVar);
        kVar.C = false;
        kVar.f56978m = false;
        this.f36261k1.setItemAnimator(kVar);
        this.f36261k1.i(new o1(this, 8));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static void d1(w0 w0Var, boolean z9, Pair pair) {
        HashMap hashMap = w0Var.f57728a2;
        if (z9) {
            hashMap.putAll((Map) pair.first);
            w0Var.f57729b2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new vh.c(w0Var, 1));
        }
        if (w0Var.f57736j2 == 3) {
            w0Var.n1(true, true);
            w0Var.j1(true);
        }
    }

    public static boolean g1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (com.google.android.recaptcha.internal.a.u(tL_help_country)) {
                String lowerCase = org.telegram.messenger.g0.O3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !jg.g.A(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.O3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || jg.g.A(" ", str, lowerCase2)) {
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
    public final void K() {
        super.K();
        org.telegram.messenger.g0.r(this.f57740n2);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, true);
        this.f57733g2 = iVar;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        int i7 = this.f57736j2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return "";
                }
                return hd.M0(2131753288, null);
            }
            return hd.M0(2131753603, null);
        }
        return hd.M0(2131749679, null);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        v0 v0Var;
        boolean z9;
        this.f57738l2 = i7;
        ah.e eVar = this.S1;
        eVar.setTranslationY(Math.max(i7, (((eVar.getMeasuredHeight() - org.telegram.messenger.g0.f22538m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f22538m));
        float translationY = eVar.getTranslationY() + eVar.getMeasuredHeight();
        this.Q1.setTranslationY(translationY);
        this.f36261k1.setTranslationY((v0Var.getMeasuredHeight() + eVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = k6.w0(k6.f27922h5, this.I0);
        Paint paint = this.T1;
        paint.setColor(w02);
        int max = Math.max(0, i7);
        if (max < org.telegram.messenger.g0.f22538m) {
            z9 = true;
        } else {
            z9 = false;
        }
        w5 w5Var = this.f57731e2;
        int W1 = org.telegram.messenger.g0.W1(w5Var.d(z9), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.f28646t0, W1, this.f28616b.getWidth() - this.f28646t0, org.telegram.messenger.g0.L(14.0f) + this.f28616b.getHeight());
        float L = (1.0f - w5Var.f39855c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override
    public final void dismiss() {
        i iVar = this.f57737k2;
        if (iVar != null) {
            iVar.run();
        }
    }

    public final void e1() {
        if (!TextUtils.isEmpty(this.f57732f2)) {
            this.f57732f2 = null;
            this.Q1.setText("");
            org.telegram.messenger.g0.r(this.f57740n2);
            ArrayList arrayList = this.Y1;
            arrayList.clear();
            arrayList.addAll(s.e(this.f57735i2.f26953id));
            n1(false, false);
            n1(true, true);
        }
    }

    public final void f1(int i7, String str, boolean z9) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f57735i2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                u0 u0Var = new u0(this, z9, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24467s0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (hd.E0().B != null) {
                    country = hd.E0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new bi.j0(u0Var, 23));
                return;
            }
            long j3 = chat.f26953id;
            t0 t0Var = new t0(this, 1);
            qp s12 = qp.s1(p10.f24467s0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(p10.f24467s0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f26999q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new h3(s12, j3, t0Var, 7));
            return;
        }
        long j10 = chat.f26953id;
        u0 u0Var2 = new u0(this, z9, 0);
        qp s13 = qp.s1(p10.f24467s0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(p10.f24467s0);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = s13.h1(j10);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f26952q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new n41(8, s13, u0Var2));
    }

    public final void h1(int i7, List list) {
        long j3;
        this.f57736j2 = i7;
        this.f57732f2 = null;
        HashSet hashSet = this.X1;
        hashSet.clear();
        HashSet hashSet2 = this.W1;
        hashSet2.clear();
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.d2;
        linkedHashMap.clear();
        if (i7 != 1) {
            if (i7 == 2) {
                arrayList.addAll(s.e(this.f57735i2.f26953id));
            }
        } else {
            arrayList.addAll(this.Z1);
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
                    j3 = -((TLRPC.Chat) tLObject).f26953id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f27102id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        v0 v0Var = this.Q1;
        v0Var.setText("");
        v0Var.d.b(false);
        v0Var.b(false, hashSet2, new r0(this, 4), this.f57730c2);
        o1();
        n1(false, true);
        this.S1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z9) {
        l lVar;
        HashSet hashSet = this.W1;
        if (hashSet.size() != 0 || z9) {
            int i7 = this.f57736j2;
            LinkedHashMap linkedHashMap = this.d2;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f57730c2;
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
                        k kVar = this.f57739m2;
                        if (kVar != null) {
                            kVar.f57678c.f57679i1.E(0);
                            a0 a0Var = kVar.f57676a;
                            ArrayList arrayList3 = a0Var.W1;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a0Var.k1(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f26953id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                k kVar2 = this.f57739m2;
                if (kVar2 != null) {
                    kVar2.f57678c.f57679i1.E(0);
                    a0 a0Var2 = kVar2.f57676a;
                    ArrayList arrayList5 = a0Var2.U1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.k1(!lVar.d, true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f27102id))) {
                        arrayList6.add(user);
                    }
                }
            }
            k kVar3 = this.f57739m2;
            if (kVar3 != null) {
                kVar3.f57678c.f57679i1.E(0);
                a0 a0Var3 = kVar3.f57676a;
                ArrayList arrayList7 = a0Var3.V1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i11 = yg.d.f59351w;
                    a0Var3.f57585a2 = 0;
                } else {
                    int i12 = yg.d.f59351w;
                    a0Var3.f57585a2 = 1;
                }
                a0Var3.f57589f2 = 0;
                a0Var3.k1(false, true);
                a0Var3.j1(true);
                a0Var3.b1();
            }
        }
    }

    public final void j1(boolean z9) {
        pj0 pj0Var = this.f36261k1;
        if (z9) {
            mi.m mVar = new mi.m(getContext(), 2, 0.6f);
            mVar.f57120a = 1;
            mVar.f20108p = org.telegram.messenger.g0.L(38.0f);
            pj0Var.getLayoutManager().w0(mVar);
            return;
        }
        pj0Var.v0(0);
    }

    public final void k1() {
        String M0;
        int i7 = this.f57736j2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    M0 = "";
                } else {
                    M0 = hd.G((int) qp.s1(p10.f24467s0).f24854p0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                M0 = hd.G((int) s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            M0 = hd.M0(2131753272, null);
        }
        k kVar = this.f57739m2;
        if (kVar != null) {
            new hc(kVar.f57678c.f28619c, kVar.f57677b).Q(2131623981, 36, M0).k(true);
        }
    }

    public final void l1(boolean z9) {
        String M0;
        fi.d dVar = this.P1;
        boolean z10 = false;
        dVar.setShowZero(false);
        int i7 = this.f57736j2;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                M0 = "";
            } else {
                M0 = hd.M0(2131745947, null);
            }
        } else {
            M0 = hd.M0(2131753289, null);
        }
        dVar.i(M0, z9, true);
        HashSet hashSet = this.W1;
        dVar.c(hashSet.size(), z9);
        if (hashSet.size() > 0) {
            z10 = true;
        }
        dVar.setEnabled(z10);
    }

    public final void m1(boolean z9, boolean z10) {
        int i7;
        xg.i iVar;
        ArrayList arrayList = this.U1;
        arrayList.clear();
        ArrayList arrayList2 = this.V1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f57736j2 == 1) {
            String M0 = hd.M0(2131749551, null);
            xg.h hVar = new xg.h(9, false);
            hVar.f58639i = 1;
            hVar.f58640j = 2131231873;
            hVar.f58638g = M0;
            arrayList2.add(hVar);
        }
        xg.h hVar2 = new xg.h(10, false);
        x3 x3Var = this.R1;
        hVar2.f58647q = x3Var;
        arrayList2.add(hVar2);
        int i10 = this.f57736j2;
        HashSet hashSet = this.W1;
        if (i10 == 3) {
            ArrayList arrayList3 = this.f57729b2;
            int size = arrayList3.size();
            i7 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f57728a2.get(str)) {
                    if (TextUtils.isEmpty(this.f57732f2) || g1(tL_help_country, org.telegram.messenger.g0.O3(this.f57732f2).toLowerCase())) {
                        i7 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        xg.h hVar3 = new xg.h(6, true);
                        hVar3.f58637f = tL_help_country;
                        hVar3.f58641k = contains;
                        arrayList4.add(hVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    xg.h hVar4 = new xg.h(7, false);
                    hVar4.f58638g = upperCase;
                    arrayList2.add(hVar4);
                    arrayList2.addAll(arrayList4);
                    i7 = org.telegram.messenger.g0.L(32.0f) + i7;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i7 = 0;
        }
        ArrayList arrayList6 = this.Y1;
        int size2 = arrayList6.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList6.get(i12);
            i12++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i7 += org.telegram.messenger.g0.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(m5.n(inputPeer)));
            xg.h hVar5 = new xg.h(3, true);
            hVar5.d = inputPeer;
            hVar5.f58635c = null;
            hVar5.f58636e = null;
            hVar5.f58641k = contains2;
            arrayList2.add(hVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.h(5, false));
            i7 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f22544q.y * 0.6f)) - i7);
        xg.h hVar6 = new xg.h(-1, false);
        hVar6.f58642l = max;
        arrayList2.add(hVar6);
        if (hashSet.size() > 0 && this.f57736j2 != 3) {
            x3Var.a(hd.M0(2131743631, null), new s0(this, 0));
        } else if (z9) {
            x3Var.setRightText(null);
        } else {
            w3 w3Var = x3Var.f30873b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
        if (z10 && (iVar = this.f57733g2) != null) {
            if (z9) {
                iVar.E(arrayList, arrayList2);
            } else {
                iVar.f();
            }
        }
    }

    public final void n1(boolean z9, boolean z10) {
        m1(z9, z10);
        int i7 = 0;
        while (true) {
            pj0 pj0Var = this.f36261k1;
            if (i7 < pj0Var.getChildCount()) {
                View childAt = pj0Var.getChildAt(i7);
                if (childAt instanceof ah.r) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.V1;
                        if (R < arrayList.size()) {
                            xg.h hVar = (xg.h) arrayList.get(R);
                            ah.r rVar = (ah.r) childAt;
                            rVar.c(hVar.f58641k, z9);
                            TLRPC.Chat chat = hVar.f58636e;
                            float f10 = 1.0f;
                            if (chat != null) {
                                if (this.f57733g2.F(chat) > 200) {
                                    f10 = 0.3f;
                                }
                                rVar.i(z9, f10);
                            } else {
                                rVar.i(z9, 1.0f);
                            }
                        }
                    }
                    i7++;
                }
                if (childAt instanceof ah.c) {
                    ah.c cVar = (ah.c) childAt;
                    cVar.c(this.W1.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
                }
                i7++;
            } else {
                l1(z9);
                return;
            }
        }
    }

    public final void o1() {
        String str;
        String H;
        int i7 = this.f57736j2;
        x3 x3Var = this.R1;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    H = "";
                } else {
                    H = hd.G((int) qp.s1(p10.f24467s0).f24854p0, "BoostingSelectUpToCountriesPlural", new Object[0]);
                    x3Var.setLayerHeight(1);
                }
            } else {
                H = hd.G((int) s.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                x3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f57735i2;
            if (t3.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = hd.H(',', str, Math.max(0, this.f57733g2.F(chat) - 1));
            x3Var.setLayerHeight(32);
        }
        x3Var.setText(H);
    }
}
