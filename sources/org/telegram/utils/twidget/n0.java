package org.telegram.utils.twidget;

import android.text.TextUtils;
import hi.j2;
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
import org.telegram.messenger.hk;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Wallet.u1;
import org.telegram.ui.p61;
import org.telegram.ui.wn0;
public abstract class n0 {
    public static boolean f52935i;
    public static boolean f52936j;
    public static final ConcurrentHashMap f52929a = new ConcurrentHashMap();
    public static final ConcurrentHashMap f52930b = new ConcurrentHashMap();
    public static final HashMap f52931c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final p61 f52932e = new p61(12);
    public static final ArrayList f52933f = new ArrayList();
    public static final ArrayList f52934g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] f52937k = new boolean[4];
    public static final HashMap f52938l = new HashMap();
    public static final nb.a f52939m = new nb.a(20);

    public static void A(k0 k0Var) {
        v0 v0Var = k0Var.f52895t;
        if (k0Var.D) {
            if (k0Var.B >= 2) {
                return;
            }
            k0Var.D = false;
            v0Var.p();
        }
        v0Var.a();
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
        for (k0 k0Var : f52929a.values()) {
            if (k0Var.f52895t != null && k0Var.f52898x == 0 && !f52934g.contains(k0Var)) {
                arrayList.add(k0Var);
            }
        }
        Collections.sort(arrayList, new wn0(11));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            v0 v0Var = ((k0) arrayList.get(i7)).f52895t;
            if (i7 >= 4) {
                v0Var.p();
            }
            if (i7 >= 12 && v0Var.f52995f == null) {
                v0Var.f52996g = null;
            }
        }
    }

    public static void E() {
        v0 v0Var;
        HashMap hashMap = new HashMap();
        for (k0 k0Var : f52929a.values()) {
            if (k0Var.f52887l != 0 && !k0Var.f52886k && k0Var.f52898x != 0 && !f52936j && (v0Var = k0Var.f52895t) != null && v0Var.f52995f != null && v0Var.A) {
                hashMap.put(k0Var.f52879b + "/" + k0Var.f52887l, k0Var);
            }
        }
        HashMap hashMap2 = f52938l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                m0 m0Var = (m0) entry.getValue();
                org.telegram.messenger.g0.r(m0Var.f52924f);
                if (m0Var.f52923e != 0) {
                    ConnectionsManager.getInstance(m0Var.f52920a).cancelRequest(m0Var.f52923e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                k0 k0Var2 = (k0) entry2.getValue();
                m0 m0Var2 = new m0(k0Var2.f52879b, k0Var2.f52887l);
                m0Var2.f52922c = k0Var2.f52892q;
                hashMap2.put((String) entry2.getKey(), m0Var2);
                org.telegram.messenger.g0.i3(m0Var2.f52924f, m0Var2.d * 1000);
            }
        }
    }

    public static boolean F(k0 k0Var) {
        if (k0Var.f52884i && !k0Var.f52886k && ((org.telegram.messenger.h0) qp.s1(k0Var.f52879b).f24942x7.f24446j0.f13889b).f22780c) {
            return true;
        }
        return false;
    }

    public static void a(k0 k0Var) {
        org.telegram.messenger.g0.r(k0Var.G);
        if (!f52934g.remove(k0Var)) {
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
                org.telegram.messenger.g0.h3((Runnable) obj);
            }
        }
    }

    public static void c(k0 k0Var, String str, String str2) {
        if (!TextUtils.equals(k0Var.f52890o, str) || !TextUtils.equals(k0Var.f52891p, str2)) {
            k0Var.f52890o = str;
            k0Var.f52891p = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = k0Var.f52893r;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = k0Var.f52892q;
            }
            v0 v0Var = k0Var.f52895t;
            if (v0Var != null) {
                v0Var.j(g(str, str2));
            }
        }
    }

    public static int d(String str, v0 v0Var, int i7) {
        k0 k0Var;
        int i10;
        int i11;
        int i12;
        if (n(str)) {
            k0Var = (k0) f52929a.get(str);
        } else {
            k0Var = null;
        }
        int i13 = 0;
        if (k0Var == null) {
            return 0;
        }
        if (k0Var.f52882f > 0) {
            return org.telegram.messenger.g0.L(Math.max(50, Math.min(600, i10)));
        }
        if (v0Var != null && Math.abs(v0Var.f52999k - i7) <= 1) {
            i11 = v0Var.f52997i;
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            return Math.min(org.telegram.messenger.g0.L(600.0f), Math.max(org.telegram.messenger.g0.L(50.0f), i11));
        }
        l0 l0Var = (l0) f52930b.get(k0Var.a());
        if (l0Var != null) {
            int f10 = f(i7);
            synchronized (l0Var) {
                ArrayList arrayList = l0Var.f52908a;
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
            boolean z9 = k0Var.h;
            boolean z10 = k0Var.f52884i;
            jSONObject.put("isCopy", z9);
            jSONObject.put("canQuery", z10);
            jSONObject.put("backgroundQuery", k0Var.f52885j);
            jSONObject.put("preview", k0Var.f52886k);
            jSONObject.put("wallet", F(k0Var));
            Object obj = k0Var.f52888m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (z10) {
                user = p10.i(k0Var.f52879b).f();
            } else {
                user = null;
            }
            if (user != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", user.f27105id);
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
        return Math.round(i7 / org.telegram.messenger.g0.f22562p);
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

    public static k0 h(v0 v0Var) {
        if (v0Var == null) {
            return null;
        }
        return (k0) f52929a.get(v0Var.f52991a);
    }

    public static v0 i(String str) {
        k0 k0Var;
        String str2;
        if (n(str)) {
            k0Var = (k0) f52929a.get(str);
        } else {
            k0Var = null;
        }
        if (k0Var == null || i1.a()) {
            return null;
        }
        synchronized (k0Var) {
            try {
                if (k0Var.f52895t == null) {
                    if (k0Var.f52894s == null) {
                        k0Var.f52894s = m(k0Var.f52883g);
                    }
                    if (k0Var.f52894s == null) {
                        return null;
                    }
                    v0 v0Var = new v0(org.telegram.messenger.t0.f25566b, k0Var.f52878a, k0Var.f52894s);
                    try {
                        str2 = id.E0().f23185y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    v0Var.f53008t = str2;
                    v0Var.f53009u = null;
                    String e10 = e(k0Var);
                    if (e10 != null) {
                        v0Var.f53010w = e10;
                    }
                    v0Var.j(g(k0Var.f52890o, k0Var.f52891p));
                    v0Var.f52994e = f52939m;
                    k0Var.f52895t = v0Var;
                }
                return k0Var.f52895t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        JSONObject jSONObject;
        String str;
        org.telegram.messenger.g0.r(f52932e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (k0 k0Var : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) f52931c.get(k0Var.a());
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
            yr a02 = yr.a0(k0Var.f52879b);
            long j3 = k0Var.f52880c;
            a02.f26719a.c(new hk(k0Var.d, 8, j3, a02, str2));
        }
        hashMap.clear();
    }

    public static String k(String str, v0 v0Var, int i7) {
        k0 k0Var;
        int[] iArr = null;
        if (n(str)) {
            k0Var = (k0) f52929a.get(str);
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            return "none";
        }
        if (k0Var.f52882f > 0) {
            return "anchor " + k0Var.f52882f;
        } else if (v0Var != null && Math.abs(v0Var.f52999k - i7) <= 1 && v0Var.f52997i > 0) {
            return "frame";
        } else {
            l0 l0Var = (l0) f52930b.get(k0Var.a());
            if (l0Var != null) {
                int f10 = f(i7);
                synchronized (l0Var) {
                    ArrayList arrayList = l0Var.f52908a;
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
        ConcurrentHashMap concurrentHashMap = f52930b;
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
                if (r2.f25212a) {
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
            ArrayList arrayList = f52934g;
            if (arrayList.size() < 3 && !f52936j) {
                ArrayList arrayList2 = f52933f;
                long j3 = Long.MAX_VALUE;
                k0 k0Var = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    k0 k0Var2 = (k0) arrayList2.get(size);
                    if (k0Var2.f52900z) {
                        long j10 = 9223372036854775806L;
                        for (k0 k0Var3 : f52929a.values()) {
                            if (k0Var3.f52898x != 0 && k0Var3.f52879b == k0Var2.f52879b && k0Var3.f52880c == k0Var2.f52880c) {
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
                    v0 v0Var = k0Var.f52895t;
                    if (v0Var != null && !k0Var.D && k0Var.f52898x <= 0) {
                        String k10 = k(k0Var.f52878a, v0Var, k0Var.E);
                        if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                            v0Var.n(k0Var.E);
                            if (v0Var.f53007s == null) {
                                v0Var.l(j1.a(null, k0Var.F));
                            }
                            if (!v0Var.f53003o) {
                                arrayList.add(k0Var);
                                A(k0Var);
                                org.telegram.messenger.g0.i3(k0Var.G, 4000L);
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

    public static dk0 q(ArrayList arrayList) {
        int size = arrayList.size();
        dk0 dk0Var = null;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            dk0 dk0Var2 = (dk0) obj;
            if (dk0Var == null || dk0Var2.f33087c0 > dk0Var.f33087c0) {
                dk0Var = dk0Var2;
            }
        }
        return dk0Var;
    }

    public static void r(boolean z9) {
        boolean z10;
        if (f52936j == z9) {
            return;
        }
        f52936j = z9;
        for (k0 k0Var : f52929a.values()) {
            v0 v0Var = k0Var.f52895t;
            if (v0Var != null && v0Var.f53004p != z9) {
                v0Var.f53004p = z9;
                i1 i1Var = v0Var.f52995f;
                if (i1Var != null) {
                    if (v0Var.f53002n && !z9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i1Var.f(z10);
                }
            }
        }
        if (z9) {
            j();
        } else {
            p();
        }
        E();
    }

    public static void s(v0 v0Var) {
        k0 h7 = h(v0Var);
        if (h7 == null) {
            return;
        }
        h7.f52898x = Math.max(0, h7.f52898x - 1);
        h7.f52899y = System.currentTimeMillis();
        D();
        j();
        E();
    }

    public static void t(v0 v0Var) {
        boolean z9;
        k0 h7 = h(v0Var);
        if (h7 == null) {
            return;
        }
        h7.f52898x++;
        h7.f52899y = System.currentTimeMillis();
        boolean z10 = f52936j;
        if (v0Var.f53004p != z10) {
            v0Var.f53004p = z10;
            i1 i1Var = v0Var.f52995f;
            if (i1Var != null) {
                if (v0Var.f53002n && !z10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i1Var.f(z9);
            }
        }
        if (h7.f52900z) {
            A(h7);
        } else {
            h7.A = true;
        }
        D();
        E();
    }

    public static void u(int i7) {
        org.telegram.messenger.g0.h3(new j2(i7, 14));
    }

    public static String v(int i7, TLRPC.BotInlineResult botInlineResult) {
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder n10 = jg.g.n(i7, "tg-widget:preview/", "/");
        n10.append(botInlineResult.query_id);
        n10.append("/");
        n10.append(botInlineResult.f26954id);
        n10.append("/");
        n10.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb2 = n10.toString();
        ConcurrentHashMap concurrentHashMap = f52929a;
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
            k0Var.f52900z = true;
            concurrentHashMap.putIfAbsent(sb2, k0Var);
        }
        return sb2;
    }

    public static void w(k0 k0Var, v0 v0Var, long j3, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        bi.i0 i0Var = new bi.i0(zArr, ConnectionsManager.getInstance(k0Var.f52879b), iArr, v0Var, j3, 16);
        y(k0Var, widgetQueryType, bArr, iArr, new g0(zArr, i0Var, v0Var, j3));
        org.telegram.messenger.g0.i3(i0Var, 30000L);
    }

    public static void x(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void y(k0 k0Var, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, g0 g0Var) {
        boolean z9;
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer;
        if ((widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = k0Var.f52879b;
        boolean z10 = f52937k[i7];
        if (z10 && !z9) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.g0.h3(new f0(1, g0Var, tL_error));
            return;
        }
        if (z10) {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
        } else {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        }
        tL_messages_getBotWidgetQueryAnswer.peer = qp.s1(i7).j1(k0Var.f52880c);
        tL_messages_getBotWidgetQueryAnswer.msg_id = k0Var.d;
        tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new d3.b(1), new u1(z10, k0Var, widgetQueryType, bArr, iArr, g0Var));
    }

    public static boolean z() {
        i1 i1Var;
        g1 g1Var;
        for (k0 k0Var : f52929a.values()) {
            v0 v0Var = k0Var.f52895t;
            dk0 dk0Var = k0Var.f52897w;
            if (k0Var.f52898x != 0 && v0Var != null && dk0Var != null && !k0Var.D && ((i1Var = v0Var.f52995f) == null || (g1Var = i1Var.H) == null || (!g1Var.f52809g && !i1Var.f52871z))) {
                String k10 = k(k0Var.f52878a, v0Var, dk0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }
}
