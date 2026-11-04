package org.telegram.utils.twidget;

import ai.z1;
import android.content.Context;
import android.text.TextUtils;
import ii.i2;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.yj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Wallet.f2;
import org.telegram.ui.Wallet.t1;
import org.telegram.ui.hb1;
import org.telegram.ui.hc1;
public abstract class p {
    public static boolean f52947i;
    public static boolean f52948j;
    public static final ConcurrentHashMap f52941a = new ConcurrentHashMap();
    public static final ConcurrentHashMap f52942b = new ConcurrentHashMap();
    public static final HashMap f52943c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final hb1 f52944e = new hb1(10);
    public static final ArrayList f52945f = new ArrayList();
    public static final ArrayList f52946g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] f52949k = new boolean[4];
    public static final HashMap f52950l = new HashMap();
    public static final mb.b f52951m = new mb.b(20);

    public static String A(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static void B() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : f52941a.values()) {
            if (mVar.f52927t != null && mVar.f52930x == 0 && !f52946g.contains(mVar)) {
                arrayList.add(mVar);
            }
        }
        Collections.sort(arrayList, new d80(28));
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            u uVar = ((m) arrayList.get(i3)).f52927t;
            if (i3 >= 4) {
                uVar.p();
            }
            if (i3 >= 12 && uVar.f52960f == null) {
                uVar.f52961g = null;
            }
        }
    }

    public static void C() {
        u uVar;
        HashMap hashMap = new HashMap();
        for (m mVar : f52941a.values()) {
            if (mVar.f52919l != 0 && !mVar.f52918k && mVar.f52930x != 0 && !f52948j && (uVar = mVar.f52927t) != null && uVar.f52960f != null && uVar.A) {
                hashMap.put(mVar.f52911b + "/" + mVar.f52919l, mVar);
            }
        }
        HashMap hashMap2 = f52950l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                o oVar = (o) entry.getValue();
                org.telegram.messenger.g0.r(oVar.f52940f);
                if (oVar.f52939e != 0) {
                    ConnectionsManager.getInstance(oVar.f52936a).cancelRequest(oVar.f52939e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                m mVar2 = (m) entry2.getValue();
                o oVar2 = new o(mVar2.f52911b, mVar2.f52919l);
                oVar2.f52938c = mVar2.f52924q;
                hashMap2.put((String) entry2.getKey(), oVar2);
                org.telegram.messenger.g0.i3(oVar2.f52940f, oVar2.d * 1000);
            }
        }
    }

    public static boolean D(m mVar) {
        if (mVar.f52916i && !mVar.f52918k && ((org.telegram.messenger.h0) hp.s1(mVar.f52911b).f23167x7.f24662j0.f13688b).f22814c) {
            return true;
        }
        return false;
    }

    public static void a(m mVar) {
        org.telegram.messenger.g0.r(mVar.G);
        if (!f52946g.remove(mVar)) {
            return;
        }
        B();
        o();
    }

    public static void b() {
        ArrayList arrayList = h;
        if (!arrayList.isEmpty() && x()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                org.telegram.messenger.g0.h3((Runnable) obj);
            }
        }
    }

    public static void c(m mVar, String str, String str2) {
        if (!TextUtils.equals(mVar.f52922o, str) || !TextUtils.equals(mVar.f52923p, str2)) {
            mVar.f52922o = str;
            mVar.f52923p = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar.f52925r;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = mVar.f52924q;
            }
            u uVar = mVar.f52927t;
            if (uVar != null) {
                uVar.j(g(str, str2));
            }
        }
    }

    public static int d(String str, u uVar, int i3) {
        m mVar;
        int i10;
        int i11;
        int i12;
        if (n(str)) {
            mVar = (m) f52941a.get(str);
        } else {
            mVar = null;
        }
        int i13 = 0;
        if (mVar == null) {
            return 0;
        }
        if (mVar.f52914f > 0) {
            return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, i10)));
        }
        if (uVar != null && Math.abs(uVar.f52964k - i3) <= 1) {
            i11 = uVar.f52962i;
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            return Math.min(org.telegram.messenger.g0.L(600.0f), Math.max(org.telegram.messenger.g0.L(50.0f), i11));
        }
        n nVar = (n) f52942b.get(mVar.a());
        if (nVar != null) {
            int f10 = f(i3);
            synchronized (nVar) {
                ArrayList arrayList = nVar.f52935a;
                int size = arrayList.size();
                int i14 = Integer.MAX_VALUE;
                i12 = 0;
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - f10);
                    if (abs < i14) {
                        i12 = iArr[1];
                        i14 = abs;
                    }
                }
            }
            i13 = i12;
        }
        if (i13 <= 0) {
            i13 = 160;
        }
        return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, i13)));
    }

    public static String e(m mVar) {
        TLRPC.User user;
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = mVar.h;
            boolean z11 = mVar.f52916i;
            jSONObject.put("isCopy", z10);
            jSONObject.put("canQuery", z11);
            jSONObject.put("backgroundQuery", mVar.f52917j);
            jSONObject.put("preview", mVar.f52918k);
            jSONObject.put("wallet", D(mVar));
            Object obj = mVar.f52920m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (z11) {
                user = h10.i(mVar.f52911b).f();
            } else {
                user = null;
            }
            if (user != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", user.f27150id);
                if (!TextUtils.isEmpty(user.first_name)) {
                    jSONObject2.put("firstName", user.first_name);
                }
                if (!TextUtils.isEmpty(user.last_name)) {
                    jSONObject2.put("lastName", user.last_name);
                }
                String n4 = l10.n(user);
                if (!TextUtils.isEmpty(n4)) {
                    jSONObject2.put("username", n4);
                }
                jSONObject2.put("isPremium", user.premium);
                jSONObject.put("viewer", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static int f(int i3) {
        return Math.round(i3 / org.telegram.messenger.g0.f22607p);
    }

    public static String g(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = str;
            if (str == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("chatData", obj);
            Object obj2 = str2;
            if (str2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("publicData", obj2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static m h(u uVar) {
        if (uVar == null) {
            return null;
        }
        return (m) f52941a.get(uVar.f52956a);
    }

    public static u i(String str) {
        m mVar;
        String str2;
        if (n(str)) {
            mVar = (m) f52941a.get(str);
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        synchronized (mVar) {
            try {
                if (mVar.f52927t == null) {
                    if (mVar.f52926s == null) {
                        mVar.f52926s = m(mVar.f52915g);
                    }
                    if (mVar.f52926s == null) {
                        return null;
                    }
                    u uVar = new u(t0.f25457b, mVar.f52910a, mVar.f52926s);
                    try {
                        str2 = bd.E0().f21812y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    uVar.f52973t = str2;
                    uVar.f52974u = null;
                    String e10 = e(mVar);
                    if (e10 != null) {
                        uVar.f52975w = e10;
                    }
                    uVar.j(g(mVar.f52922o, mVar.f52923p));
                    uVar.f52959e = f52951m;
                    mVar.f52927t = uVar;
                }
                return mVar.f52927t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        JSONObject jSONObject;
        String str;
        org.telegram.messenger.g0.r(f52944e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (m mVar : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) f52943c.get(mVar.a());
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.optJSONObject("local");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                str = jSONObject.toString();
            } else {
                str = "";
            }
            String str2 = str;
            qr a02 = qr.a0(mVar.f52911b);
            long j10 = mVar.f52912c;
            a02.f24934a.c(new yj(mVar.d, 9, j10, a02, str2));
        }
        hashMap.clear();
    }

    public static String k(String str, u uVar, int i3) {
        m mVar;
        int[] iArr = null;
        if (n(str)) {
            mVar = (m) f52941a.get(str);
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return "none";
        }
        if (mVar.f52914f > 0) {
            return "anchor " + mVar.f52914f;
        } else if (uVar != null && Math.abs(uVar.f52964k - i3) <= 1 && uVar.f52962i > 0) {
            return "frame";
        } else {
            n nVar = (n) f52942b.get(mVar.a());
            if (nVar != null) {
                int f10 = f(i3);
                synchronized (nVar) {
                    ArrayList arrayList = nVar.f52935a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        int[] iArr2 = (int[]) obj;
                        if (iArr == null || Math.abs(iArr2[0] - f10) < Math.abs(iArr[0] - f10)) {
                            iArr = iArr2;
                        }
                    }
                }
            }
            if (iArr != null && iArr[1] > 0) {
                if (iArr[0] == f(i3)) {
                    return "cache";
                }
                return "cache of width " + iArr[0];
            }
            return "placeholder";
        }
    }

    public static n l(String str) {
        ConcurrentHashMap concurrentHashMap = f52942b;
        n nVar = (n) concurrentHashMap.get(str);
        if (nVar == null) {
            n nVar2 = new n();
            n nVar3 = (n) concurrentHashMap.putIfAbsent(str, nVar2);
            if (nVar3 == null) {
                return nVar2;
            }
            return nVar3;
        }
        return nVar;
    }

    public static String m(byte[] bArr) {
        boolean z10;
        InputStream inflaterInputStream;
        String str;
        if (bArr == null) {
            return null;
        }
        if (bArr.length >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            if (z10) {
                inflaterInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            } else {
                inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 4);
            try {
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int read = inflaterInputStream.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                if (r2.f25040a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("widget payload: ");
                    if (z10) {
                        str = "gzip";
                    } else {
                        str = "zlib";
                    }
                    sb2.append(str);
                    sb2.append(", ");
                    sb2.append(bArr.length);
                    sb2.append(" -> ");
                    sb2.append(byteArrayOutputStream.size());
                    sb2.append(" bytes");
                    a8.b(sb2.toString());
                }
                String str2 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                byteArrayOutputStream.close();
                inflaterInputStream.close();
                return str2;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static boolean n(String str) {
        if (str != null && str.startsWith("tg-widget:")) {
            return true;
        }
        return false;
    }

    public static void o() {
        while (true) {
            ArrayList arrayList = f52946g;
            if (arrayList.size() < 3 && !f52948j) {
                ArrayList arrayList2 = f52945f;
                long j10 = Long.MAX_VALUE;
                m mVar = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    m mVar2 = (m) arrayList2.get(size);
                    if (mVar2.f52932z) {
                        long j11 = 9223372036854775806L;
                        for (m mVar3 : f52941a.values()) {
                            if (mVar3.f52930x != 0 && mVar3.f52911b == mVar2.f52911b && mVar3.f52912c == mVar2.f52912c) {
                                j11 = Math.min(j11, Math.abs(mVar3.d - mVar2.d));
                            }
                        }
                        if (j11 < j10) {
                            mVar = mVar2;
                            j10 = j11;
                        }
                    }
                }
                if (mVar != null) {
                    arrayList2.remove(mVar);
                    u uVar = mVar.f52927t;
                    if (uVar != null && !mVar.D && mVar.f52930x <= 0) {
                        String k10 = k(mVar.f52910a, uVar, mVar.E);
                        if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                            uVar.n(mVar.E);
                            if (uVar.f52972s == null) {
                                uVar.l(i0.a(null, mVar.F));
                            }
                            if (!uVar.f52968o) {
                                arrayList.add(mVar);
                                y(mVar);
                                org.telegram.messenger.g0.i3(mVar.G, 4000L);
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static gk0 p(ArrayList arrayList) {
        int size = arrayList.size();
        gk0 gk0Var = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            gk0 gk0Var2 = (gk0) obj;
            if (gk0Var == null || gk0Var2.f34131d0 > gk0Var.f34131d0) {
                gk0Var = gk0Var2;
            }
        }
        return gk0Var;
    }

    public static void q(boolean z10) {
        boolean z11;
        if (f52948j == z10) {
            return;
        }
        f52948j = z10;
        for (m mVar : f52941a.values()) {
            u uVar = mVar.f52927t;
            if (uVar != null && uVar.f52969p != z10) {
                uVar.f52969p = z10;
                h0 h0Var = uVar.f52960f;
                if (h0Var != null) {
                    if (uVar.f52967n && !z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h0Var.d(z11);
                }
            }
        }
        if (z10) {
            j();
        } else {
            o();
        }
        C();
    }

    public static void r(u uVar) {
        m h7 = h(uVar);
        if (h7 == null) {
            return;
        }
        h7.f52930x = Math.max(0, h7.f52930x - 1);
        h7.f52931y = System.currentTimeMillis();
        B();
        j();
        C();
    }

    public static void s(u uVar) {
        boolean z10;
        m h7 = h(uVar);
        if (h7 == null) {
            return;
        }
        h7.f52930x++;
        h7.f52931y = System.currentTimeMillis();
        boolean z11 = f52948j;
        if (uVar.f52969p != z11) {
            uVar.f52969p = z11;
            h0 h0Var = uVar.f52960f;
            if (h0Var != null) {
                if (uVar.f52967n && !z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h0Var.d(z10);
            }
        }
        if (h7.f52932z) {
            y(h7);
        } else {
            h7.A = true;
        }
        B();
        C();
    }

    public static void t(int i3) {
        org.telegram.messenger.g0.h3(new i2(i3, 14));
    }

    public static void u(m mVar, u uVar, long j10, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        z1 z1Var = new z1(zArr, ConnectionsManager.getInstance(mVar.f52911b), iArr, uVar, j10, 17);
        w(mVar, widgetQueryType, bArr, iArr, new i(zArr, z1Var, uVar, j10));
        org.telegram.messenger.g0.i3(z1Var, 30000L);
    }

    public static void v(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void w(m mVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, i iVar) {
        boolean z10;
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer;
        if ((widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i3 = mVar.f52911b;
        boolean z11 = f52949k[i3];
        if (z11 && !z10) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.g0.h3(new hc1(14, iVar, tL_error));
            return;
        }
        if (z11) {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
        } else {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        }
        tL_messages_getBotWidgetQueryAnswer.peer = hp.s1(i3).j1(mVar.f52912c);
        tL_messages_getBotWidgetQueryAnswer.msg_id = mVar.d;
        tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new c3.b(1), new t1(z11, mVar, widgetQueryType, bArr, iArr, iVar));
    }

    public static boolean x() {
        h0 h0Var;
        f0 f0Var;
        for (m mVar : f52941a.values()) {
            u uVar = mVar.f52927t;
            gk0 gk0Var = mVar.f52929w;
            if (mVar.f52930x != 0 && uVar != null && gk0Var != null && !mVar.D && ((h0Var = uVar.f52960f) == null || (f0Var = h0Var.F) == null || (!f0Var.f52853g && !h0Var.f52884x))) {
                String k10 = k(mVar.f52910a, uVar, gk0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void y(m mVar) {
        h0 h0Var;
        u uVar = mVar.f52927t;
        boolean z10 = false;
        if (mVar.D) {
            if (mVar.B < 2) {
                mVar.D = false;
                uVar.p();
            } else {
                return;
            }
        }
        if (uVar.f52968o) {
            return;
        }
        uVar.f52968o = true;
        h0 h0Var2 = uVar.f52960f;
        if (h0Var2 != null) {
            h0Var2.A = true;
            return;
        }
        String str = uVar.f52972s;
        String str2 = "light";
        if (str == null && uVar.f52973t == null && uVar.f52974u == null) {
            Context context = uVar.f52958c;
            String str3 = uVar.f52957b;
            boolean z11 = uVar.f52966m;
            int i3 = uVar.d;
            int[] iArr = i0.f52890a;
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (z11) {
                str2 = "dark";
            }
            h0Var = new h0(context, str3, a1.g.s(sb2, str2, "\"}"), i3, null, null);
        } else {
            Context context2 = uVar.f52958c;
            String str4 = uVar.f52957b;
            if (str == null) {
                boolean z12 = uVar.f52966m;
                int[] iArr2 = i0.f52890a;
                StringBuilder sb3 = new StringBuilder("{\"colorScheme\":\"");
                if (z12) {
                    str2 = "dark";
                }
                str = a1.g.s(sb3, str2, "\"}");
            }
            h0Var = new h0(context2, str4, str, uVar.d, uVar.f52973t, uVar.f52974u);
        }
        StringBuilder sb4 = new StringBuilder("{\"data\":");
        sb4.append(uVar.v);
        sb4.append(",\"context\":");
        String s6 = a1.g.s(sb4, uVar.f52975w, "}");
        if (s6 != null) {
            h0Var.h = s6;
        }
        h0Var.c(uVar.f52976x);
        h0Var.J = uVar;
        h0Var.K = uVar;
        if (uVar.f52967n && !uVar.f52969p) {
            z10 = true;
        }
        h0Var.d(z10);
        uVar.f52960f = h0Var;
        uVar.f52970q++;
        z.f53000a.execute(new f2(h0Var, uVar.f52963j, 5));
    }

    public static String z(int i3, int i10, long j10) {
        return i3 + "/" + j10 + "/" + i10;
    }
}
