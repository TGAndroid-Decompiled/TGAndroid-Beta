package wg;

import ai.e1;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import di.o2;
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
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.a31;
import tg.z1;
public final class u0 extends ja {
    public final hi.d T1;
    public final t0 U1;
    public final x3 V1;
    public final ah.e W1;
    public final Paint X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashSet f59243a2;
    public final HashSet f59244b2;
    public final ArrayList f59245c2;
    public final ArrayList d2;
    public final HashMap f59246e2;
    public final ArrayList f59247f2;
    public final ArrayList f59248g2;
    public final LinkedHashMap f59249h2;
    public final u5 f59250i2;
    public String f59251j2;
    public xg.i f59252k2;
    public int f59253l2;
    public final TLRPC.Chat f59254m2;
    public int f59255n2;
    public i f59256o2;
    public int f59257p2;
    public k f59258q2;
    public final s4.s0 f59259r2;

    public u0(e2 e2Var, long j3) {
        super(e2Var, false);
        this.X1 = new Paint(1);
        this.Y1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z1 = arrayList;
        this.f59243a2 = new HashSet();
        this.f59244b2 = new HashSet();
        this.f59245c2 = new ArrayList();
        this.d2 = new ArrayList();
        this.f59246e2 = new HashMap();
        this.f59247f2 = new ArrayList();
        this.f59248g2 = new ArrayList();
        this.f59249h2 = new LinkedHashMap();
        this.f59253l2 = org.telegram.messenger.g0.L(134.0f);
        this.f59259r2 = new s4.s0(this, 8);
        this.f29717u0 = 0;
        this.f59254m2 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
        ((ViewGroup) this.f35932p1.getParent()).removeView(this.f35932p1);
        ViewGroup viewGroup = this.f29682b;
        er erVar = er.h;
        this.f59250i2 = new u5(viewGroup, 0L, 350L, erVar);
        ah.e eVar = new ah.e(getContext(), this.J0);
        this.W1 = eVar;
        eVar.setOnCloseClickListener(new p0(this, 7));
        eVar.setText(O0());
        eVar.setCloseImageVisible(true);
        eVar.f1069f.c(false, 0.0f);
        t0 t0Var = new t0(this, getContext(), this.J0);
        this.U1 = t0Var;
        int i7 = j6.f28922h5;
        q6.h(i7, t0Var, this.J0);
        t0Var.setOnSearchTextChange(new r0(this, 0));
        this.V1 = new x3(getContext(), this.J0);
        o1();
        ViewGroup viewGroup2 = this.f29682b;
        int i10 = this.f29717u0;
        viewGroup2.addView(eVar, c8.ja.f(-2.0f, -1, 55, i10, 0, i10, 0));
        ViewGroup viewGroup3 = this.f29682b;
        int i11 = this.f29717u0;
        viewGroup3.addView(t0Var, c8.ja.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (uj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        q6.h(i7, aVar, this.J0);
        hi.d dVar = new hi.d(getContext(), this.J0, true);
        this.T1 = dVar;
        dVar.setOnClickListener(new q0(this, 1));
        aVar.addView(dVar, c8.ja.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f29682b;
        int i12 = this.f29717u0;
        viewGroup4.addView(aVar, c8.ja.f(-2.0f, -1, 87, i12, 0, i12, 0));
        xg.i iVar = this.f59252k2;
        uj0 uj0Var = this.f35931o1;
        iVar.f59938n = arrayList;
        iVar.f59937f = uj0Var;
        int i13 = this.f29717u0;
        uj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(60.0f));
        this.f35931o1.j(new vh.d(this, 1));
        this.f35931o1.setOnItemClickListener(new z1(this, 12));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(erVar);
        kVar.C = false;
        kVar.f58564m = false;
        this.f35931o1.setItemAnimator(kVar);
        this.f35931o1.i(new ai.i0(this, 9));
        n1(false, true);
        f1(1, null, true);
        f1(3, null, true);
    }

    public static void d1(u0 u0Var, boolean z10, Pair pair) {
        HashMap hashMap = u0Var.f59246e2;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            u0Var.f59247f2.addAll((Collection) pair.second);
            Map.EL.forEach(hashMap, new vh.c(u0Var, 1));
        }
        if (u0Var.f59255n2 == 3) {
            u0Var.n1(true, true);
            u0Var.j1(true);
        }
    }

    public static boolean g1(TLRPC.TL_help_country tL_help_country, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (com.google.android.gms.internal.vision.e2.s(tL_help_country)) {
                String lowerCase = org.telegram.messenger.g0.N3(tL_help_country.default_name).toLowerCase();
                if (!lowerCase.startsWith(str) && !i5.c.A(" ", str, lowerCase)) {
                    String lowerCase2 = org.telegram.messenger.g0.N3(tL_help_country.iso2).toLowerCase();
                    if (lowerCase2.startsWith(str) || i5.c.A(" ", str, lowerCase2)) {
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
        org.telegram.messenger.g0.r(this.f59259r2);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        xg.i iVar = new xg.i(getContext(), this.J0, true);
        this.f59252k2 = iVar;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        int i7 = this.f59255n2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return "";
                }
                return hd.M0(2131753288, null);
            }
            return hd.M0(2131753603, null);
        }
        return hd.M0(2131749680, null);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        t0 t0Var;
        boolean z10;
        this.f59257p2 = i7;
        ah.e eVar = this.W1;
        eVar.setTranslationY(Math.max(i7, (((eVar.getMeasuredHeight() - org.telegram.messenger.g0.f23605m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f23605m));
        float translationY = eVar.getTranslationY() + eVar.getMeasuredHeight();
        this.U1.setTranslationY(translationY);
        this.f35931o1.setTranslationY((t0Var.getMeasuredHeight() + eVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(16.0f));
        int w02 = j6.w0(j6.f28922h5, this.J0);
        Paint paint = this.X1;
        paint.setColor(w02);
        int max = Math.max(0, i7);
        if (max < org.telegram.messenger.g0.f23605m) {
            z10 = true;
        } else {
            z10 = false;
        }
        u5 u5Var = this.f59250i2;
        int W1 = org.telegram.messenger.g0.W1(u5Var.d(z10), max, 0);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(this.f29717u0, W1, this.f29682b.getWidth() - this.f29717u0, org.telegram.messenger.g0.L(14.0f) + this.f29682b.getHeight());
        float L = (1.0f - u5Var.f39900c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    @Override
    public final void c0(Configuration configuration) {
        m1(false, true);
    }

    @Override
    public final void dismiss() {
        i iVar = this.f59256o2;
        if (iVar != null) {
            iVar.run();
        }
    }

    public final void e1() {
        if (!TextUtils.isEmpty(this.f59251j2)) {
            this.f59251j2 = null;
            this.U1.setText("");
            org.telegram.messenger.g0.r(this.f59259r2);
            ArrayList arrayList = this.f59245c2;
            arrayList.clear();
            arrayList.addAll(q.e(this.f59254m2.f28051id));
            n1(false, false);
            n1(true, true);
        }
    }

    public final void f1(int i7, String str, boolean z10) {
        TLRPC.ChannelParticipantsFilter tL_channelParticipantsSearch;
        String country;
        TLRPC.Chat chat = this.f59254m2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                s0 s0Var = new s0(this, z10, 1);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.f24940t0);
                TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
                if (hd.E0().B != null) {
                    country = hd.E0().B.c();
                } else {
                    country = Locale.getDefault().getCountry();
                }
                tL_help_getCountriesList.lang_code = country;
                connectionsManager.sendRequest(tL_help_getCountriesList, new e1(s0Var, 24));
                return;
            }
            long j3 = chat.f28051id;
            r0 r0Var = new r0(this, 1);
            np s12 = np.s1(m10.f24940t0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(m10.f24940t0);
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.f28097q = str;
            tL_contacts_search.limit = 50;
            connectionsManager2.sendRequest(tL_contacts_search, new o2(s12, j3, r0Var, 7));
            return;
        }
        long j10 = chat.f28051id;
        s0 s0Var2 = new s0(this, z10, 0);
        np s13 = np.s1(m10.f24940t0);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(m10.f24940t0);
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
        tL_channelParticipantsSearch.f28050q = str;
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 50;
        connectionsManager3.sendRequest(tL_channels_getParticipants, new a31(10, s13, s0Var2));
    }

    public final void h1(int i7, List list) {
        long j3;
        this.f59255n2 = i7;
        this.f59251j2 = null;
        HashSet hashSet = this.f59244b2;
        hashSet.clear();
        HashSet hashSet2 = this.f59243a2;
        hashSet2.clear();
        ArrayList arrayList = this.f59245c2;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.f59249h2;
        linkedHashMap.clear();
        if (i7 != 1) {
            if (i7 == 2) {
                arrayList.addAll(q.e(this.f59254m2.f28051id));
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
                    j3 = -((TLRPC.Chat) tLObject).f28051id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f28200id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        t0 t0Var = this.U1;
        t0Var.setText("");
        t0Var.d.b(false);
        t0Var.b(false, hashSet2, new p0(this, 4), this.f59248g2);
        o1();
        n1(false, true);
        this.W1.setText(O0());
        l1(false);
        j1(false);
    }

    public final void i1(boolean z10) {
        l lVar;
        HashSet hashSet = this.f59243a2;
        if (hashSet.size() != 0 || z10) {
            int i7 = this.f59255n2;
            LinkedHashMap linkedHashMap = this.f59249h2;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = this.f59248g2;
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
                        k kVar = this.f59258q2;
                        if (kVar != null) {
                            kVar.f59200c.f59203m1.C(0);
                            y yVar = kVar.f59198a;
                            ArrayList arrayList3 = yVar.f59273a2;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            yVar.k1(false, true);
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
                        if (hashSet.contains(Long.valueOf(-chat.f28051id))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                k kVar2 = this.f59258q2;
                if (kVar2 != null) {
                    kVar2.f59200c.f59203m1.C(0);
                    y yVar2 = kVar2.f59198a;
                    ArrayList arrayList5 = yVar2.Y1;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList4);
                    yVar2.k1(!lVar.d, true);
                    return;
                }
                return;
            }
            ArrayList arrayList6 = new ArrayList();
            for (TLObject tLObject2 : linkedHashMap.values()) {
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    if (hashSet.contains(Long.valueOf(user.f28200id))) {
                        arrayList6.add(user);
                    }
                }
            }
            k kVar3 = this.f59258q2;
            if (kVar3 != null) {
                kVar3.f59200c.f59203m1.C(0);
                y yVar3 = kVar3.f59198a;
                ArrayList arrayList7 = yVar3.Z1;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                if (arrayList6.isEmpty()) {
                    int i11 = yg.d.f60661w;
                    yVar3.f59276e2 = 0;
                } else {
                    int i12 = yg.d.f60661w;
                    yVar3.f59276e2 = 1;
                }
                yVar3.f59281j2 = 0;
                yVar3.k1(false, true);
                yVar3.j1(true);
                yVar3.b1();
            }
        }
    }

    public final void j1(boolean z10) {
        uj0 uj0Var = this.f35931o1;
        if (z10) {
            pi.l lVar = new pi.l(getContext(), 2, 0.6f);
            lVar.f58480a = 1;
            lVar.f55123p = org.telegram.messenger.g0.L(38.0f);
            uj0Var.getLayoutManager().w0(lVar);
            return;
        }
        uj0Var.v0(0);
    }

    public final void k1() {
        String M0;
        int i7 = this.f59255n2;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    M0 = "";
                } else {
                    M0 = hd.G((int) np.s1(m10.f24940t0).f25369q0, "BoostingSelectUpToWarningCountriesPlural", new Object[0]);
                }
            } else {
                M0 = hd.G((int) q.f(), "BoostingSelectUpToWarningChannelsGroupsPlural", new Object[0]);
            }
        } else {
            M0 = hd.M0(2131753272, null);
        }
        k kVar = this.f59258q2;
        if (kVar != null) {
            new cc(kVar.f59200c.f29685c, kVar.f59199b).Q(2131623982, 36, M0).k(true);
        }
    }

    public final void l1(boolean z10) {
        String M0;
        hi.d dVar = this.T1;
        boolean z11 = false;
        dVar.setShowZero(false);
        int i7 = this.f59255n2;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                M0 = "";
            } else {
                M0 = hd.M0(2131745946, null);
            }
        } else {
            M0 = hd.M0(2131753289, null);
        }
        dVar.i(M0, z10, true);
        HashSet hashSet = this.f59243a2;
        dVar.c(hashSet.size(), z10);
        if (hashSet.size() > 0) {
            z11 = true;
        }
        dVar.setEnabled(z11);
    }

    public final void m1(boolean z10, boolean z11) {
        int i7;
        xg.i iVar;
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f59255n2 == 1) {
            String M0 = hd.M0(2131749552, null);
            xg.h hVar = new xg.h(9, false);
            hVar.f59926i = 1;
            hVar.f59927j = 2131231873;
            hVar.f59925g = M0;
            arrayList2.add(hVar);
        }
        xg.h hVar2 = new xg.h(10, false);
        x3 x3Var = this.V1;
        hVar2.f59934q = x3Var;
        arrayList2.add(hVar2);
        int i10 = this.f59255n2;
        HashSet hashSet = this.f59243a2;
        if (i10 == 3) {
            ArrayList arrayList3 = this.f59247f2;
            int size = arrayList3.size();
            i7 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.f59246e2.get(str)) {
                    if (TextUtils.isEmpty(this.f59251j2) || g1(tL_help_country, org.telegram.messenger.g0.N3(this.f59251j2).toLowerCase())) {
                        i7 += org.telegram.messenger.g0.L(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        xg.h hVar3 = new xg.h(6, true);
                        hVar3.f59924f = tL_help_country;
                        hVar3.f59928k = contains;
                        arrayList4.add(hVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    String upperCase = str.toUpperCase();
                    xg.h hVar4 = new xg.h(7, false);
                    hVar4.f59925g = upperCase;
                    arrayList2.add(hVar4);
                    arrayList2.addAll(arrayList4);
                    i7 = org.telegram.messenger.g0.L(32.0f) + i7;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i7 = 0;
        }
        ArrayList arrayList6 = this.f59245c2;
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
            hVar5.f59922c = null;
            hVar5.f59923e = null;
            hVar5.f59928k = contains2;
            arrayList2.add(hVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.h(5, false));
            i7 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f23611q.y * 0.6f)) - i7);
        xg.h hVar6 = new xg.h(-1, false);
        hVar6.f59929l = max;
        arrayList2.add(hVar6);
        if (hashSet.size() > 0 && this.f59255n2 != 3) {
            x3Var.a(hd.M0(2131743630, null), new q0(this, 0));
        } else if (z10) {
            x3Var.setRightText(null);
        } else {
            w3 w3Var = x3Var.f32026b;
            w3Var.c(null, false, true);
            w3Var.setOnClickListener(null);
            w3Var.setVisibility(0);
        }
        if (z11 && (iVar = this.f59252k2) != null) {
            if (z10) {
                iVar.E(arrayList, arrayList2);
            } else {
                iVar.f();
            }
        }
    }

    public final void n1(boolean z10, boolean z11) {
        m1(z10, z11);
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.f35931o1;
            if (i7 < uj0Var.getChildCount()) {
                View childAt = uj0Var.getChildAt(i7);
                if (childAt instanceof ah.r) {
                    int R = RecyclerView.R(childAt) - 1;
                    if (R >= 0) {
                        ArrayList arrayList = this.Z1;
                        if (R < arrayList.size()) {
                            xg.h hVar = (xg.h) arrayList.get(R);
                            ah.r rVar = (ah.r) childAt;
                            rVar.c(hVar.f59928k, z10);
                            TLRPC.Chat chat = hVar.f59923e;
                            float f10 = 1.0f;
                            if (chat != null) {
                                if (this.f59252k2.F(chat) > 200) {
                                    f10 = 0.3f;
                                }
                                rVar.i(z10, f10);
                            } else {
                                rVar.i(z10, 1.0f);
                            }
                        }
                    }
                    i7++;
                }
                if (childAt instanceof ah.c) {
                    ah.c cVar = (ah.c) childAt;
                    cVar.c(this.f59243a2.contains(Long.valueOf(cVar.getCountry().default_name.hashCode())), true);
                }
                i7++;
            } else {
                l1(z10);
                return;
            }
        }
    }

    public final void o1() {
        String str;
        String H;
        int i7 = this.f59255n2;
        x3 x3Var = this.V1;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    H = "";
                } else {
                    H = hd.G((int) np.s1(m10.f24940t0).f25369q0, "BoostingSelectUpToCountriesPlural", new Object[0]);
                    x3Var.setLayerHeight(1);
                }
            } else {
                H = hd.G((int) q.f(), "BoostingSelectUpToGroupChannelPlural", new Object[0]);
                x3Var.setLayerHeight(32);
            }
        } else {
            TLRPC.Chat chat = this.f59254m2;
            if (t3.V(chat)) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            H = hd.H(',', str, Math.max(0, this.f59252k2.F(chat) - 1));
            x3Var.setLayerHeight(32);
        }
        x3Var.setText(H);
    }
}
