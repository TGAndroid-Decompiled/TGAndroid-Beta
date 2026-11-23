package org.telegram.utils.twidget;

import android.text.TextUtils;
import bi.q2;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.fk;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.s2;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Wallet.c2;
import org.telegram.ui.cd0;
import org.telegram.ui.qw0;
public abstract class n0 {
    public static boolean f54862i;
    public static boolean f54863j;
    public static final ConcurrentHashMap f54856a = new ConcurrentHashMap();
    public static final ConcurrentHashMap f54857b = new ConcurrentHashMap();
    public static final HashMap f54858c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final cd0 f54859e = new cd0(19);
    public static final ArrayList f54860f = new ArrayList();
    public static final ArrayList f54861g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] f54864k = new boolean[4];
    public static final HashMap f54865l = new HashMap();
    public static final sa.d f54866m = new sa.d(20);

    public static void A(k0 k0Var) {
        d1 d1Var = k0Var.f54827t;
        if (k0Var.J) {
            if (k0Var.B >= 2) {
                return;
            }
            k0Var.J = false;
            d1Var.m();
        }
        d1Var.a();
    }

    public static String B(int i7, int i10, long j3) {
        return i7 + "/" + j3 + "/" + i10;
    }

    public static String C(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static void D() {
        ArrayList arrayList = new ArrayList();
        for (k0 k0Var : f54856a.values()) {
            if (k0Var.f54827t != null && k0Var.f54830x == 0 && !f54861g.contains(k0Var)) {
                arrayList.add(k0Var);
            }
        }
        Collections.sort(arrayList, new qw0(9));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            d1 d1Var = ((k0) arrayList.get(i7)).f54827t;
            if (i7 >= 4) {
                d1Var.m();
            }
            if (i7 >= 12 && d1Var.f54705f == null) {
                d1Var.f54706g = null;
            }
        }
    }

    public static void E() {
        d1 d1Var;
        HashMap hashMap = new HashMap();
        for (k0 k0Var : f54856a.values()) {
            if (k0Var.f54819l != 0 && !k0Var.f54818k && k0Var.f54830x != 0 && !f54863j && (d1Var = k0Var.f54827t) != null && d1Var.f54705f != null && d1Var.A) {
                hashMap.put(k0Var.f54811b + "/" + k0Var.f54819l, k0Var);
            }
        }
        HashMap hashMap2 = f54865l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                m0 m0Var = (m0) entry.getValue();
                org.telegram.messenger.g0.r(m0Var.f54848f);
                if (m0Var.f54847e != 0) {
                    ConnectionsManager.getInstance(m0Var.f54844a).cancelRequest(m0Var.f54847e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                k0 k0Var2 = (k0) entry2.getValue();
                m0 m0Var2 = new m0(k0Var2.f54811b, k0Var2.f54819l);
                m0Var2.f54846c = k0Var2.f54824q;
                hashMap2.put((String) entry2.getKey(), m0Var2);
                org.telegram.messenger.g0.h3(m0Var2.f54848f, m0Var2.d * 1000);
            }
        }
    }

    public static boolean F(k0 k0Var) {
        if (k0Var.f54816i && !k0Var.f54818k && ((org.telegram.messenger.h0) np.u1(k0Var.f54811b).A7.f26203p0.f13993b).f24305c) {
            return true;
        }
        return false;
    }

    public static void a(k0 k0Var) {
        org.telegram.messenger.g0.r(k0Var.M);
        if (!f54861g.remove(k0Var)) {
            return;
        }
        D();
        p();
    }

    public static void b() {
        ArrayList arrayList = h;
        if (!arrayList.isEmpty() && z()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                org.telegram.messenger.g0.g3((Runnable) obj);
            }
        }
    }

    public static void c(k0 k0Var, String str, String str2) {
        if (!TextUtils.equals(k0Var.f54822o, str) || !TextUtils.equals(k0Var.f54823p, str2)) {
            k0Var.f54822o = str;
            k0Var.f54823p = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var.f54825r;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = k0Var.f54824q;
            }
            d1 d1Var = k0Var.f54827t;
            if (d1Var != null) {
                d1Var.h(g(str, str2));
            }
        }
    }

    public static int d(String str, d1 d1Var, int i7) {
        k0 k0Var;
        int i10;
        int i11;
        int i12;
        if (n(str)) {
            k0Var = (k0) f54856a.get(str);
        } else {
            k0Var = null;
        }
        int i13 = 0;
        if (k0Var == null) {
            return 0;
        }
        if (k0Var.f54814f > 0) {
            return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, i10)));
        }
        if (d1Var != null && Math.abs(d1Var.f54709k - i7) <= 1) {
            i11 = d1Var.f54707i;
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            return Math.min(org.telegram.messenger.g0.L(600.0f), Math.max(org.telegram.messenger.g0.L(50.0f), i11));
        }
        l0 l0Var = (l0) f54857b.get(k0Var.a());
        if (l0Var != null) {
            int f10 = f(i7);
            synchronized (l0Var) {
                ArrayList arrayList = l0Var.f54839a;
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

    public static String e(k0 k0Var) {
        TLRPC.User user;
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = k0Var.h;
            boolean z11 = k0Var.f54816i;
            jSONObject.put("isCopy", z10);
            jSONObject.put("canQuery", z11);
            jSONObject.put("backgroundQuery", k0Var.f54817j);
            jSONObject.put("preview", k0Var.f54818k);
            jSONObject.put("wallet", F(k0Var));
            Object obj = k0Var.f54820m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (z11) {
                user = k10.i(k0Var.f54811b).f();
            } else {
                user = null;
            }
            if (user != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", user.f28547id);
                if (!TextUtils.isEmpty(user.first_name)) {
                    jSONObject2.put("firstName", user.first_name);
                }
                if (!TextUtils.isEmpty(user.last_name)) {
                    jSONObject2.put("lastName", user.last_name);
                }
                String o4 = p10.o(user);
                if (!TextUtils.isEmpty(o4)) {
                    jSONObject2.put("username", o4);
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
        return Math.round(i7 / org.telegram.messenger.g0.f24009p);
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

    public static k0 h(d1 d1Var) {
        if (d1Var == null) {
            return null;
        }
        return (k0) f54856a.get(d1Var.f54701a);
    }

    public static d1 i(String str) {
        k0 k0Var;
        String str2;
        if (n(str)) {
            k0Var = (k0) f54856a.get(str);
        } else {
            k0Var = null;
        }
        if (k0Var == null || p1.a()) {
            return null;
        }
        synchronized (k0Var) {
            try {
                if (k0Var.f54827t == null) {
                    if (k0Var.f54826s == null) {
                        k0Var.f54826s = m(k0Var.f54815g);
                    }
                    if (k0Var.f54826s == null) {
                        return null;
                    }
                    d1 d1Var = new d1(org.telegram.messenger.t0.f26895b, k0Var.f54810a, k0Var.f54826s);
                    try {
                        str2 = hd.E0().f24436y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    d1Var.f54718t = str2;
                    d1Var.f54719u = null;
                    int i7 = k0Var.f54811b;
                    long j3 = k0Var.f54821n;
                    long j10 = 0;
                    if (j3 != 0) {
                        j10 = j3 ^ ((i7 + 1) << 56);
                    }
                    d1Var.B = j10;
                    String e10 = e(k0Var);
                    if (e10 != null) {
                        d1Var.f54720w = e10;
                    }
                    d1Var.h(g(k0Var.f54822o, k0Var.f54823p));
                    d1Var.f54704e = f54866m;
                    k0Var.f54827t = d1Var;
                }
                return k0Var.f54827t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        JSONObject jSONObject;
        String str;
        org.telegram.messenger.g0.r(f54859e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (k0 k0Var : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) f54858c.get(k0Var.a());
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
            ur a02 = ur.a0(k0Var.f54811b);
            long j3 = k0Var.f54812c;
            a02.f27214a.c(new fk(k0Var.d, 9, j3, a02, str2));
        }
        hashMap.clear();
    }

    public static String k(String str, d1 d1Var, int i7) {
        k0 k0Var;
        int[] iArr = null;
        if (n(str)) {
            k0Var = (k0) f54856a.get(str);
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            return "none";
        }
        if (k0Var.f54814f > 0) {
            return "anchor " + k0Var.f54814f;
        } else if (d1Var != null && Math.abs(d1Var.f54709k - i7) <= 1 && d1Var.f54707i > 0) {
            return "frame";
        } else {
            l0 l0Var = (l0) f54857b.get(k0Var.a());
            if (l0Var != null) {
                int f10 = f(i7);
                synchronized (l0Var) {
                    ArrayList arrayList = l0Var.f54839a;
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

    public static l0 l(String str) {
        ConcurrentHashMap concurrentHashMap = f54857b;
        l0 l0Var = (l0) concurrentHashMap.get(str);
        if (l0Var == null) {
            l0 l0Var2 = new l0();
            l0 l0Var3 = (l0) concurrentHashMap.putIfAbsent(str, l0Var2);
            if (l0Var3 == null) {
                return l0Var2;
            }
            return l0Var3;
        }
        return l0Var;
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
                if (s2.f26694a) {
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

    public static TL_iv.RichMessage o(String str) {
        TL_iv.pageBlockEmbed pageblockembed = new TL_iv.pageBlockEmbed();
        pageblockembed.url = str;
        pageblockembed.html = "";
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageblockembed.caption = pageCaption;
        pageCaption.text = new TL_iv.textEmpty();
        pageblockembed.caption.credit = new TL_iv.textEmpty();
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks.add(pageblockembed);
        return richMessage;
    }

    public static void p() {
        while (true) {
            ArrayList arrayList = f54861g;
            if (arrayList.size() < 3 && !f54863j) {
                ArrayList arrayList2 = f54860f;
                long j3 = Long.MAX_VALUE;
                k0 k0Var = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    k0 k0Var2 = (k0) arrayList2.get(size);
                    if (k0Var2.f54832z) {
                        long j10 = 9223372036854775806L;
                        for (k0 k0Var3 : f54856a.values()) {
                            if (k0Var3.f54830x != 0 && k0Var3.f54811b == k0Var2.f54811b && k0Var3.f54812c == k0Var2.f54812c) {
                                j10 = Math.min(j10, Math.abs(k0Var3.d - k0Var2.d));
                            }
                        }
                        if (j10 < j3) {
                            k0Var = k0Var2;
                            j3 = j10;
                        }
                    }
                }
                if (k0Var != null) {
                    arrayList2.remove(k0Var);
                    d1 d1Var = k0Var.f54827t;
                    if (d1Var != null && !k0Var.J && k0Var.f54830x <= 0) {
                        String k10 = k(k0Var.f54810a, d1Var, k0Var.K);
                        if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                            d1Var.l(k0Var.K);
                            if (d1Var.f54717s == null) {
                                d1Var.j(q1.a(null, k0Var.L));
                            }
                            if (!d1Var.f54713o) {
                                arrayList.add(k0Var);
                                A(k0Var);
                                org.telegram.messenger.g0.h3(k0Var.M, 4000L);
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

    public static rk0 q(ArrayList arrayList) {
        int size = arrayList.size();
        rk0 rk0Var = null;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            rk0 rk0Var2 = (rk0) obj;
            if (rk0Var == null || rk0Var2.f39215d0 > rk0Var.f39215d0) {
                rk0Var = rk0Var2;
            }
        }
        return rk0Var;
    }

    public static void r(boolean z10) {
        boolean z11;
        if (f54863j == z10) {
            return;
        }
        f54863j = z10;
        for (k0 k0Var : f54856a.values()) {
            d1 d1Var = k0Var.f54827t;
            if (d1Var != null && d1Var.f54714p != z10) {
                d1Var.f54714p = z10;
                p1 p1Var = d1Var.f54705f;
                if (p1Var != null) {
                    if (d1Var.f54712n && !z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p1Var.g(z11);
                }
            }
        }
        if (z10) {
            j();
        } else {
            p();
        }
        E();
    }

    public static void s(d1 d1Var) {
        k0 h7 = h(d1Var);
        if (h7 == null) {
            return;
        }
        h7.f54830x = Math.max(0, h7.f54830x - 1);
        h7.f54831y = System.currentTimeMillis();
        D();
        j();
        E();
    }

    public static void t(d1 d1Var) {
        boolean z10;
        k0 h7 = h(d1Var);
        if (h7 == null) {
            return;
        }
        h7.f54830x++;
        h7.f54831y = System.currentTimeMillis();
        boolean z11 = f54863j;
        if (d1Var.f54714p != z11) {
            d1Var.f54714p = z11;
            p1 p1Var = d1Var.f54705f;
            if (p1Var != null) {
                if (d1Var.f54712n && !z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p1Var.g(z10);
            }
        }
        if (h7.f54832z) {
            A(h7);
        } else {
            h7.A = true;
        }
        D();
        E();
    }

    public static void u(int i7) {
        org.telegram.messenger.g0.g3(new jg.x(i7, 13));
    }

    public static String v(int i7, TLRPC.BotInlineResult botInlineResult) {
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder m10 = i5.c.m(i7, "tg-widget:preview/", "/");
        m10.append(botInlineResult.query_id);
        m10.append("/");
        m10.append(botInlineResult.f28396id);
        m10.append("/");
        m10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = m10.toString();
        ConcurrentHashMap concurrentHashMap = f54856a;
        if (!concurrentHashMap.containsKey(sb2)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            k0 k0Var = new k0(sb2, i7, 0L, 0, 0L, tL_messageMediaWidget, true);
            k0Var.f54832z = true;
            concurrentHashMap.putIfAbsent(sb2, k0Var);
        }
        return sb2;
    }

    public static void w(k0 k0Var, d1 d1Var, long j3, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        q2 q2Var = new q2(zArr, ConnectionsManager.getInstance(k0Var.f54811b), iArr, d1Var, j3, 16);
        y(k0Var, widgetQueryType, bArr, iArr, new ai.a(zArr, q2Var, d1Var, j3));
        org.telegram.messenger.g0.h3(q2Var, 30000L);
    }

    public static void x(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void y(k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, ai.a aVar) {
        boolean z10;
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer;
        if ((widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = k0Var.f54811b;
        boolean z11 = f54864k[i7];
        if (z11 && !z10) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.g0.g3(new g0(1, aVar, tL_error));
            return;
        }
        if (z11) {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
        } else {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        }
        tL_messages_getBotWidgetQueryAnswer.peer = np.u1(i7).l1(k0Var.f54812c);
        tL_messages_getBotWidgetQueryAnswer.msg_id = k0Var.d;
        tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new d3.b(1), new c2(z11, k0Var, widgetQueryType, bArr, iArr, aVar));
    }

    public static boolean z() {
        p1 p1Var;
        n1 n1Var;
        for (k0 k0Var : f54856a.values()) {
            d1 d1Var = k0Var.f54827t;
            rk0 rk0Var = k0Var.f54829w;
            if (k0Var.f54830x != 0 && d1Var != null && rk0Var != null && !k0Var.J && ((p1Var = d1Var.f54705f) == null || (n1Var = p1Var.N) == null || (!n1Var.h && !p1Var.F))) {
                String k10 = k(k0Var.f54810a, d1Var, rk0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }
}
