package xg;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import ci.u2;
import gi.o1;
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
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.m21;
public final class w0 extends ma {
    public final gi.d Q1;
    public final v0 R1;
    public final x3 S1;
    public final bh.d T1;
    public final Paint U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final HashSet X1;
    public final HashSet Y1;
    public final ArrayList Z1;
    public final ArrayList f58771a2;
    public final HashMap f58772b2;
    public final ArrayList c2;
    public final ArrayList f58773d2;
    public final LinkedHashMap f58774e2;
    public final u5 f58775f2;
    public String f58776g2;
    public yg.h f58777h2;
    public int f58778i2;
    public final TLRPC.Chat f58779j2;
    public int f58780k2;
    public k f58781l2;
    public int f58782m2;
    public m f58783n2;
    public final wi.i0 f58784o2;

    public w0(d2 d2Var, long j10) {
        super(d2Var, false);
        this.U1 = new Paint(1);
        this.V1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.W1 = arrayList;
        this.X1 = new HashSet();
        this.Y1 = new HashSet();
        this.Z1 = new ArrayList();
        this.f58771a2 = new ArrayList();
        this.f58772b2 = new HashMap();
        this.c2 = new ArrayList();
        this.f58773d2 = new ArrayList();
        this.f58774e2 = new LinkedHashMap();
        this.f58778i2 = org.telegram.messenger.g0.L(134.0f);
        this.f58784o2 = new wi.i0(this, 1);
        this.f28618u0 = 0;
        this.f58779j2 = hp.s1(this.f28583a).M0(Long.valueOf(-j10));
        ((ViewGroup) this.m1.getParent()).removeView(this.m1);
        ViewGroup viewGroup = this.f28586b;
        xq xqVar = xq.h;
        this.f58775f2 = new u5(viewGroup, 0L, 350L, xqVar);
        bh.d dVar = new bh.d(getContext(), this.J0);
        this.T1 = dVar;
        dVar.setOnCloseClickListener(new r0(this, 7));
        dVar.setText(O0());
        dVar.setCloseImageVisible(true);
        dVar.f3311f.c(false, 0.0f);
        v0 v0Var = new v0(this, getContext(), this.J0);
        this.R1 = v0Var;
        int i3 = k6.f27954h5;
        r6.i(i3, v0Var, this.J0);
        v0Var.setOnSearchTextChange(new t0(this, 0));
        this.S1 = new x3(getContext(), this.J0);
        o1();
        ViewGroup viewGroup2 = this.f28586b;
        int i10 = this.f28618u0;
        viewGroup2.addView(dVar, mf.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.f28586b;
        int i11 = this.f28618u0;
        viewGroup3.addView(v0Var, mf.f(-2.0f, -1, 55, i11, 0, i11, 0));
        bh.a aVar = new bh.a(getContext(), this.J0, (tj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        r6.i(i3, aVar, this.J0);
        gi.d dVar2 = new gi.d(getContext(), this.J0, true);
        this.Q1 = dVar2;
        dVar2.setOnClickListener(new s0(this, 1));
        aVar.addView(dVar2, mf.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f28586b;
        int i12 = this.f28618u0;
        viewGroup4.addView(aVar, mf.f(-2.0f, -1, 87, i12, 0, i12, 0));
        yg.h hVar = this.f58777h2;
        tj0 tj0Var = this.f36102l1;
        hVar.f59464n = arrayList;
        hVar.f59463f = tj0Var;
        int i13 = this.f28618u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.f36102l1.j(new wh.d(this, 1));
        this.f36102l1.setOnItemClickListener(new c(this, 3));
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(xqVar);
        kVar.C = false;
        kVar.f55567m = false;
        this.f36102l1.setItemAnimator(kVar);
        this.f36102l1.i(new o1(this, 8));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static void d1(w0 w0Var, boolean z10, Pair pair) {
        HashMap hashMap = w0Var.f58772b2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            w0Var.c2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new wh.c(w0Var, 1));
        }
        if (w0Var.f58780k2 == 3) {
            w0Var.n1(true, true);
            w0Var.j1(true);
        }
    }

    public static boolean g1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (com.google.android.recaptcha.internal.a.u(tL_help_country)) {
                String lowerCase = org.telegram.messenger.g0.O3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !p1.z(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.O3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || p1.z(" ", str, lowerCase2)) {
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
        org.telegram.messenger.g0.r(this.f58784o2);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        yg.h hVar = new yg.h(getContext(), this.J0, true);
        this.f58777h2 = hVar;
        return hVar;
    }

    @Override
    public final CharSequence O0() {
        int i3 = this.f58780k2;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return "";
                }
                return bd.M0(2131753288, null);
            }
            return bd.M0(2131753603, null);
        }
        return bd.M0(2131749688, null);
    }

    @Override
    public final void R0(Canvas canvas, int i3) {
        v0 v0Var;
        boolean z10;
        this.f58782m2 = i3;
        bh.d dVar = this.T1;
        dVar.setTranslationY(Math.max(i3, (((dVar.getMeasuredHeight() - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f22602m));
        float translationY = dVar.getTranslationY() + dVar.getMeasuredHeight();
        this.R1.setTranslationY(translationY);
        this.f36102l1.setTranslationY((v0Var.getMeasuredHeight() + dVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = k6.w0(k6.f27954h5, this.J0);
        Paint paint = this.U1;
        paint.setColor(w02);
        int max = Math.max(0, i3);
        if (max < org.telegram.messenger.g0.f22602m) {
            z10 = true;
        } else {
            z10 = false;
        }
        u5 u5Var = this.f58775f2;
        int W1 = org.telegram.messenger.g0.W1(u5Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.f28618u0, W1, this.f28586b.getWidth() - this.f28618u0, org.telegram.messenger.g0.L(14.0f) + this.f28586b.getHeight());
        float L = (1.0f - u5Var.f38645c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override
    public final void dismiss() {
        k kVar = this.f58781l2;
        if (kVar != null) {
            kVar.run();
        }
    }

    public final void e1() {
        if (!TextUtils.isEmpty(this.f58776g2)) {
            this.f58776g2 = null;
            this.R1.setText("");
            org.telegram.messenger.g0.r(this.f58784o2);
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            arrayList.addAll(s.e(this.f58779j2.f27001id));
            n1(false, false);
            n1(true, true);
        }
    }

    public final void f1(int i3, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f58779j2;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                u0 u0Var = new u0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.f22829t0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (bd.E0().B != null) {
                    country = bd.E0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new ci.d0(u0Var, 23));
                return;
            }
            long j10 = chat.f27001id;
            t0 t0Var = new t0(this, 1);
            hp s12 = hp.s1(h10.f22829t0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(h10.f22829t0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f27047q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new u2(s12, j10, t0Var, 7));
            return;
        }
        long j11 = chat.f27001id;
        u0 u0Var2 = new u0(this, z10, 0);
        hp s13 = hp.s1(h10.f22829t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(h10.f22829t0);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = s13.h1(j11);
        if (str == null) {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsRecent();
        } else {
            tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsSearch;
        if (str == null) {
            str = "";
        }
        tL_channelParticipantsSearch.f27000q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new m21(11, s13, u0Var2));
    }

    public final void h1(int i3, List list) {
        long j10;
        this.f58780k2 = i3;
        this.f58776g2 = null;
        HashSet hashSet = this.Y1;
        hashSet.clear();
        HashSet hashSet2 = this.X1;
        hashSet2.clear();
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f58774e2;
        linkedHashMap.clear();
        if (i3 != 1) {
            if (i3 == 2) {
                arrayList.addAll(s.e(this.f58779j2.f27001id));
            }
        } else {
            arrayList.addAll(this.f58771a2);
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
                    j10 = -((TLRPC.Chat) tLObject).f27001id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f27150id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        v0 v0Var = this.R1;
        v0Var.setText("");
        v0Var.d.b(false);
        v0Var.b(false, hashSet2, new r0(this, 4), this.f58773d2);
        o1();
        n1(false, true);
        this.T1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z10) {
        n nVar;
        HashSet hashSet = this.X1;
        if (hashSet.size() != 0 || z10) {
            int i3 = this.f58780k2;
            LinkedHashMap linkedHashMap = this.f58774e2;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f58773d2;
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
                        m mVar = this.f58783n2;
                        if (mVar != null) {
                            mVar.f58729c.f58731j1.D(0);
                            a0 a0Var = mVar.f58727a;
                            ArrayList arrayList3 = a0Var.X1;
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
                        if (hashSet.contains(Long.valueOf(-chat.f27001id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                m mVar2 = this.f58783n2;
                if (mVar2 != null) {
                    mVar2.f58729c.f58731j1.D(0);
                    a0 a0Var2 = mVar2.f58727a;
                    ArrayList arrayList5 = a0Var2.V1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    a0Var2.k1(!nVar.d, true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f27150id))) {
                        arrayList6.add(user);
                    }
                }
            }
            m mVar3 = this.f58783n2;
            if (mVar3 != null) {
                mVar3.f58729c.f58731j1.D(0);
                a0 a0Var3 = mVar3.f58727a;
                ArrayList arrayList7 = a0Var3.W1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i11 = zg.d.f60490w;
                    a0Var3.f58633b2 = 0;
                } else {
                    int i12 = zg.d.f60490w;
                    a0Var3.f58633b2 = 1;
                }
                a0Var3.f58637g2 = 0;
                a0Var3.k1(false, true);
                a0Var3.j1(true);
                a0Var3.b1();
            }
        }
    }

    public final void j1(boolean z10) {
        tj0 tj0Var = this.f36102l1;
        if (z10) {
            ni.m mVar = new ni.m(getContext(), 2, 0.6f);
            mVar.f55704a = 1;
            mVar.f20461p = org.telegram.messenger.g0.L(38.0f);
            tj0Var.getLayoutManager().w0(mVar);
            return;
        }
        tj0Var.v0(0);
    }

    public final void k1() {
        String M0;
        int i3 = this.f58780k2;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    M0 = "";
                } else {
                    M0 = bd.G((int) hp.s1(h10.f22829t0).f23095q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                M0 = bd.G((int) s.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            M0 = bd.M0(2131753272, null);
        }
        m mVar = this.f58783n2;
        if (mVar != null) {
            new fc(mVar.f58729c.f28589c, mVar.f58728b).Q(2131623981, 36, M0).k(true);
        }
    }

    public final void l1(boolean z10) {
        String M0;
        gi.d dVar = this.Q1;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i3 = this.f58780k2;
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                M0 = "";
            } else {
                M0 = bd.M0(2131745956, null);
            }
        } else {
            M0 = bd.M0(2131753289, null);
        }
        dVar.i(M0, z10, true);
        HashSet hashSet = this.X1;
        dVar.c(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void m1(boolean z10, boolean z11) {
        int i3;
        yg.h hVar;
        ArrayList arrayList = this.V1;
        arrayList.clear();
        ArrayList arrayList2 = this.W1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f58780k2 == 1) {
            String M0 = bd.M0(2131749560, null);
            yg.g gVar = new yg.g(9, false);
            gVar.f59452i = 1;
            gVar.f59453j = 2131231873;
            gVar.f59451g = M0;
            arrayList2.add(gVar);
        }
        yg.g gVar2 = new yg.g(10, false);
        x3 x3Var = this.S1;
        gVar2.f59460q = x3Var;
        arrayList2.add(gVar2);
        int i10 = this.f58780k2;
        HashSet hashSet = this.X1;
        if (i10 == 3) {
            ArrayList arrayList3 = this.c2;
            int size = arrayList3.size();
            i3 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f58772b2.get(str)) {
                    if (TextUtils.isEmpty(this.f58776g2) || g1(tL_help_country, org.telegram.messenger.g0.O3(this.f58776g2).toLowerCase())) {
                        i3 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        yg.g gVar3 = new yg.g(6, true);
                        gVar3.f59450f = tL_help_country;
                        gVar3.f59454k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    yg.g gVar4 = new yg.g(7, false);
                    gVar4.f59451g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i3 = org.telegram.messenger.g0.L(32.0f) + i3;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i3 = 0;
        }
        ArrayList arrayList6 = this.Z1;
        int size2 = arrayList6.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList6.get(i12);
            i12++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i3 += org.telegram.messenger.g0.L(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(m5.n(inputPeer)));
            yg.g gVar5 = new yg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.f59448c = null;
            gVar5.f59449e = null;
            gVar5.f59454k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new yg.g(5, false));
            i3 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f22608q.y * 0.6f)) - i3);
        yg.g gVar6 = new yg.g(-1, false);
        gVar6.f59455l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.f58780k2 != 3) {
            x3Var.a(bd.M0(2131743640, null), new s0(this, 0));
        } else if (z10) {
            x3Var.setRightText(null);
        } else {
            w3 w3Var = x3Var.f30950b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
        if (z11 && (hVar = this.f58777h2) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.f();
            }
        }
    }

    public final void n1(boolean z10, boolean z11) {
        m1(z10, z11);
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.f36102l1;
            if (i3 < tj0Var.getChildCount()) {
                View childAt = tj0Var.getChildAt(i3);
                if (childAt instanceof bh.p) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.W1;
                        if (R < arrayList.size()) {
                            yg.g gVar = (yg.g) arrayList.get(R);
                            bh.p pVar = (bh.p) childAt;
                            pVar.c(gVar.f59454k, z10);
                            TLRPC.Chat chat = gVar.f59449e;
                            float f10 = 1.0f;
                            if (chat != null) {
                                if (this.f58777h2.F(chat) > 200) {
                                    f10 = 0.3f;
                                }
                                pVar.i(z10, f10);
                            } else {
                                pVar.i(z10, 1.0f);
                            }
                        }
                    }
                    i3++;
                }
                if (childAt instanceof bh.c) {
                    bh.c cVar = (bh.c) childAt;
                    cVar.c(this.X1.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
                }
                i3++;
            } else {
                l1(z10);
                return;
            }
        }
    }

    public final void o1() {
        String str;
        String H;
        int i3 = this.f58780k2;
        x3 x3Var = this.S1;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    H = "";
                } else {
                    H = bd.G((int) hp.s1(h10.f22829t0).f23095q0, "BoostingSelectUpToCountriesPlural", new Object[0]);
                    x3Var.setLayerHeight(1);
                }
            } else {
                H = bd.G((int) s.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                x3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f58779j2;
            if (t3.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = bd.H(',', str, Math.max(0, this.f58777h2.F(chat) - 1));
            x3Var.setLayerHeight(32);
        }
        x3Var.setText(H);
    }
}
