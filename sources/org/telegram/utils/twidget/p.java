package org.telegram.utils.twidget;

import a8.p0;
import android.content.Context;
import android.text.TextUtils;
import hi.j2;
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
import org.telegram.messenger.hd;
import org.telegram.messenger.ik;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Wallet.h2;
import org.telegram.ui.Wallet.w1;
import org.telegram.ui.rv0;
public abstract class p {
    public static boolean f52856i;
    public static boolean f52857j;
    public static final ConcurrentHashMap f52850a = new ConcurrentHashMap();
    public static final ConcurrentHashMap f52851b = new ConcurrentHashMap();
    public static final HashMap f52852c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final org.telegram.ui.Wallet.z f52853e = new org.telegram.ui.Wallet.z(9);
    public static final ArrayList f52854f = new ArrayList();
    public static final ArrayList f52855g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] f52858k = new boolean[4];
    public static final HashMap f52859l = new HashMap();
    public static final nb.a f52860m = new nb.a(20);

    public static String A(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static void B() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : f52850a.values()) {
            if (mVar.f52836t != null && mVar.f52839x == 0 && !f52855g.contains(mVar)) {
                arrayList.add(mVar);
            }
        }
        Collections.sort(arrayList, new rv0(10));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            u uVar = ((m) arrayList.get(i7)).f52836t;
            if (i7 >= 4) {
                uVar.p();
            }
            if (i7 >= 12 && uVar.f52869f == null) {
                uVar.f52870g = null;
            }
        }
    }

    public static void C() {
        u uVar;
        HashMap hashMap = new HashMap();
        for (m mVar : f52850a.values()) {
            if (mVar.f52828l != 0 && !mVar.f52827k && mVar.f52839x != 0 && !f52857j && (uVar = mVar.f52836t) != null && uVar.f52869f != null && uVar.A) {
                hashMap.put(mVar.f52820b + "/" + mVar.f52828l, mVar);
            }
        }
        HashMap hashMap2 = f52859l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                o oVar = (o) entry.getValue();
                org.telegram.messenger.g0.r(oVar.f52849f);
                if (oVar.f52848e != 0) {
                    ConnectionsManager.getInstance(oVar.f52845a).cancelRequest(oVar.f52848e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                m mVar2 = (m) entry2.getValue();
                o oVar2 = new o(mVar2.f52820b, mVar2.f52828l);
                oVar2.f52847c = mVar2.f52833q;
                hashMap2.put((String) entry2.getKey(), oVar2);
                org.telegram.messenger.g0.i3(oVar2.f52849f, oVar2.d * 1000);
            }
        }
    }

    public static boolean D(m mVar) {
        if (mVar.f52825i && !mVar.f52827k && ((org.telegram.messenger.h0) qp.s1(mVar.f52820b).f24927x7.f24435j0.f13889b).f22767c) {
            return true;
        }
        return false;
    }

    public static void a(m mVar) {
        org.telegram.messenger.g0.r(mVar.G);
        if (!f52855g.remove(mVar)) {
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
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                org.telegram.messenger.g0.h3((Runnable) obj);
            }
        }
    }

    public static void c(m mVar, String str, String str2) {
        if (!TextUtils.equals(mVar.f52831o, str) || !TextUtils.equals(mVar.f52832p, str2)) {
            mVar.f52831o = str;
            mVar.f52832p = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar.f52834r;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = mVar.f52833q;
            }
            u uVar = mVar.f52836t;
            if (uVar != null) {
                uVar.j(g(str, str2));
            }
        }
    }

    public static int d(String str, u uVar, int i7) {
        m mVar;
        int i10;
        int i11;
        int i12;
        if (n(str)) {
            mVar = (m) f52850a.get(str);
        } else {
            mVar = null;
        }
        int i13 = 0;
        if (mVar == null) {
            return 0;
        }
        if (mVar.f52823f > 0) {
            return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, i10)));
        }
        if (uVar != null && Math.abs(uVar.f52873k - i7) <= 1) {
            i11 = uVar.f52871i;
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            return Math.min(org.telegram.messenger.g0.L(600.0f), Math.max(org.telegram.messenger.g0.L(50.0f), i11));
        }
        n nVar = (n) f52851b.get(mVar.a());
        if (nVar != null) {
            int f10 = f(i7);
            synchronized (nVar) {
                ArrayList arrayList = nVar.f52844a;
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
            boolean z9 = mVar.h;
            boolean z10 = mVar.f52825i;
            jSONObject.put("isCopy", z9);
            jSONObject.put("canQuery", z10);
            jSONObject.put("backgroundQuery", mVar.f52826j);
            jSONObject.put("preview", mVar.f52827k);
            jSONObject.put("wallet", D(mVar));
            Object obj = mVar.f52829m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (z10) {
                user = p10.i(mVar.f52820b).f();
            } else {
                user = null;
            }
            if (user != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", user.f27101id);
                if (!TextUtils.isEmpty(user.first_name)) {
                    jSONObject2.put("firstName", user.first_name);
                }
                if (!TextUtils.isEmpty(user.last_name)) {
                    jSONObject2.put("lastName", user.last_name);
                }
                String n10 = t10.n(user);
                if (!TextUtils.isEmpty(n10)) {
                    jSONObject2.put("username", n10);
                }
                jSONObject2.put("isPremium", user.premium);
                jSONObject.put("viewer", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static int f(int i7) {
        return Math.round(i7 / org.telegram.messenger.g0.f22536p);
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
        return (m) f52850a.get(uVar.f52865a);
    }

    public static u i(String str) {
        m mVar;
        String str2;
        if (n(str)) {
            mVar = (m) f52850a.get(str);
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        synchronized (mVar) {
            try {
                if (mVar.f52836t == null) {
                    if (mVar.f52835s == null) {
                        mVar.f52835s = m(mVar.f52824g);
                    }
                    if (mVar.f52835s == null) {
                        return null;
                    }
                    u uVar = new u(t0.f25555b, mVar.f52819a, mVar.f52835s);
                    try {
                        str2 = hd.E0().f22899y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    uVar.f52882t = str2;
                    uVar.f52883u = null;
                    String e10 = e(mVar);
                    if (e10 != null) {
                        uVar.f52884w = e10;
                    }
                    uVar.j(g(mVar.f52831o, mVar.f52832p));
                    uVar.f52868e = f52860m;
                    mVar.f52836t = uVar;
                }
                return mVar.f52836t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        JSONObject jSONObject;
        String str;
        org.telegram.messenger.g0.r(f52853e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (m mVar : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) f52852c.get(mVar.a());
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
            yr a02 = yr.a0(mVar.f52820b);
            long j3 = mVar.f52821c;
            a02.f26688a.c(new ik(mVar.d, 9, j3, a02, str2));
        }
        hashMap.clear();
    }

    public static String k(String str, u uVar, int i7) {
        m mVar;
        int[] iArr = null;
        if (n(str)) {
            mVar = (m) f52850a.get(str);
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return "none";
        }
        if (mVar.f52823f > 0) {
            return "anchor " + mVar.f52823f;
        } else if (uVar != null && Math.abs(uVar.f52873k - i7) <= 1 && uVar.f52871i > 0) {
            return "frame";
        } else {
            n nVar = (n) f52851b.get(mVar.a());
            if (nVar != null) {
                int f10 = f(i7);
                synchronized (nVar) {
                    ArrayList arrayList = nVar.f52844a;
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
                if (iArr[0] == f(i7)) {
                    return "cache";
                }
                return "cache of width " + iArr[0];
            }
            return "placeholder";
        }
    }

    public static n l(String str) {
        ConcurrentHashMap concurrentHashMap = f52851b;
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
        boolean z9;
        InputStream inflaterInputStream;
        String str;
        if (bArr == null) {
            return null;
        }
        if (bArr.length >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            if (z9) {
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
                if (r2.f25191a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("widget payload: ");
                    if (z9) {
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
            ArrayList arrayList = f52855g;
            if (arrayList.size() < 3 && !f52857j) {
                ArrayList arrayList2 = f52854f;
                long j3 = Long.MAX_VALUE;
                m mVar = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    m mVar2 = (m) arrayList2.get(size);
                    if (mVar2.f52841z) {
                        long j10 = 9223372036854775806L;
                        for (m mVar3 : f52850a.values()) {
                            if (mVar3.f52839x != 0 && mVar3.f52820b == mVar2.f52820b && mVar3.f52821c == mVar2.f52821c) {
                                j10 = Math.min(j10, Math.abs(mVar3.d - mVar2.d));
                            }
                        }
                        if (j10 < j3) {
                            mVar = mVar2;
                            j3 = j10;
                        }
                    }
                }
                if (mVar != null) {
                    arrayList2.remove(mVar);
                    u uVar = mVar.f52836t;
                    if (uVar != null && !mVar.D && mVar.f52839x <= 0) {
                        String k10 = k(mVar.f52819a, uVar, mVar.E);
                        if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                            uVar.n(mVar.E);
                            if (uVar.f52881s == null) {
                                uVar.l(i0.a(null, mVar.F));
                            }
                            if (!uVar.f52877o) {
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

    public static ck0 p(ArrayList arrayList) {
        int size = arrayList.size();
        ck0 ck0Var = null;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ck0 ck0Var2 = (ck0) obj;
            if (ck0Var == null || ck0Var2.f32590c0 > ck0Var.f32590c0) {
                ck0Var = ck0Var2;
            }
        }
        return ck0Var;
    }

    public static void q(boolean z9) {
        boolean z10;
        if (f52857j == z9) {
            return;
        }
        f52857j = z9;
        for (m mVar : f52850a.values()) {
            u uVar = mVar.f52836t;
            if (uVar != null && uVar.f52878p != z9) {
                uVar.f52878p = z9;
                h0 h0Var = uVar.f52869f;
                if (h0Var != null) {
                    if (uVar.f52876n && !z9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h0Var.d(z10);
                }
            }
        }
        if (z9) {
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
        h7.f52839x = Math.max(0, h7.f52839x - 1);
        h7.f52840y = System.currentTimeMillis();
        B();
        j();
        C();
    }

    public static void s(u uVar) {
        boolean z9;
        m h7 = h(uVar);
        if (h7 == null) {
            return;
        }
        h7.f52839x++;
        h7.f52840y = System.currentTimeMillis();
        boolean z10 = f52857j;
        if (uVar.f52878p != z10) {
            uVar.f52878p = z10;
            h0 h0Var = uVar.f52869f;
            if (h0Var != null) {
                if (uVar.f52876n && !z10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                h0Var.d(z9);
            }
        }
        if (h7.f52841z) {
            y(h7);
        } else {
            h7.A = true;
        }
        B();
        C();
    }

    public static void t(int i7) {
        org.telegram.messenger.g0.h3(new j2(i7, 14));
    }

    public static void u(m mVar, u uVar, long j3, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        bi.i0 i0Var = new bi.i0(zArr, ConnectionsManager.getInstance(mVar.f52820b), iArr, uVar, j3, 16);
        w(mVar, widgetQueryType, bArr, iArr, new i(zArr, i0Var, uVar, j3));
        org.telegram.messenger.g0.i3(i0Var, 30000L);
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
        boolean z9;
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer;
        if ((widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = mVar.f52820b;
        boolean z10 = f52858k[i7];
        if (z10 && !z9) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.g0.h3(new org.telegram.ui.web.w(9, iVar, tL_error));
            return;
        }
        if (z10) {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
        } else {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        }
        tL_messages_getBotWidgetQueryAnswer.peer = qp.s1(i7).j1(mVar.f52821c);
        tL_messages_getBotWidgetQueryAnswer.msg_id = mVar.d;
        tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new d3.b(1), new w1(z10, mVar, widgetQueryType, bArr, iArr, iVar));
    }

    public static boolean x() {
        h0 h0Var;
        f0 f0Var;
        for (m mVar : f52850a.values()) {
            u uVar = mVar.f52836t;
            ck0 ck0Var = mVar.f52838w;
            if (mVar.f52839x != 0 && uVar != null && ck0Var != null && !mVar.D && ((h0Var = uVar.f52869f) == null || (f0Var = h0Var.F) == null || (!f0Var.f52762g && !h0Var.f52793x))) {
                String k10 = k(mVar.f52819a, uVar, ck0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void y(m mVar) {
        h0 h0Var;
        u uVar = mVar.f52836t;
        boolean z9 = false;
        if (mVar.D) {
            if (mVar.B < 2) {
                mVar.D = false;
                uVar.p();
            } else {
                return;
            }
        }
        if (uVar.f52877o) {
            return;
        }
        uVar.f52877o = true;
        h0 h0Var2 = uVar.f52869f;
        if (h0Var2 != null) {
            h0Var2.A = true;
            return;
        }
        String str = uVar.f52881s;
        String str2 = "light";
        if (str == null && uVar.f52882t == null && uVar.f52883u == null) {
            Context context = uVar.f52867c;
            String str3 = uVar.f52866b;
            boolean z10 = uVar.f52875m;
            int i7 = uVar.d;
            int[] iArr = i0.f52799a;
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (z10) {
                str2 = "dark";
            }
            h0Var = new h0(context, str3, p0.s(sb2, str2, "\"}"), i7, null, null);
        } else {
            Context context2 = uVar.f52867c;
            String str4 = uVar.f52866b;
            if (str == null) {
                boolean z11 = uVar.f52875m;
                int[] iArr2 = i0.f52799a;
                StringBuilder sb3 = new StringBuilder("{\"colorScheme\":\"");
                if (z11) {
                    str2 = "dark";
                }
                str = p0.s(sb3, str2, "\"}");
            }
            h0Var = new h0(context2, str4, str, uVar.d, uVar.f52882t, uVar.f52883u);
        }
        StringBuilder sb4 = new StringBuilder("{\"data\":");
        sb4.append(uVar.v);
        sb4.append(",\"context\":");
        String s5 = p0.s(sb4, uVar.f52884w, "}");
        if (s5 != null) {
            h0Var.h = s5;
        }
        h0Var.c(uVar.f52885x);
        h0Var.J = uVar;
        h0Var.K = uVar;
        if (uVar.f52876n && !uVar.f52878p) {
            z9 = true;
        }
        h0Var.d(z9);
        uVar.f52869f = h0Var;
        uVar.f52879q++;
        z.f52909a.execute(new h2(h0Var, uVar.f52872j, 5));
    }

    public static String z(int i7, int i10, long j3) {
        return i7 + "/" + j3 + "/" + i10;
    }
}
