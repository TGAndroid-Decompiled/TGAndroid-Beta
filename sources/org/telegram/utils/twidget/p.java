package org.telegram.utils.twidget;

import android.content.Context;
import android.text.TextUtils;
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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.sk;
import org.telegram.messenger.v2;
import org.telegram.messenger.w0;
import org.telegram.messenger.wp;
import org.telegram.messenger.xd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.dx0;
import org.telegram.ui.web.v1;
public abstract class p {
    public static boolean f44446i;
    public static boolean f44447j;
    public static final ConcurrentHashMap f44441a = new ConcurrentHashMap();
    public static final ConcurrentHashMap f44442b = new ConcurrentHashMap();
    public static final HashMap f44443c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final org.telegram.ui.Components.voip.n0 e = new org.telegram.ui.Components.voip.n0(27);
    public static final ArrayList f44444f = new ArrayList();
    public static final ArrayList f44445g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] f44448k = new boolean[4];
    public static final HashMap f44449l = new HashMap();
    public static final t7.u f44450m = new t7.u(16);

    public static String A(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static void B() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : f44441a.values()) {
            if (mVar.f44423u != null && mVar.f44426y == 0 && !f44445g.contains(mVar)) {
                arrayList.add(mVar);
            }
        }
        Collections.sort(arrayList, new dx0(10));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w wVar = ((m) arrayList.get(i10)).f44423u;
            if (i10 >= 4) {
                wVar.p();
            }
            if (i10 >= 12 && wVar.f44465f == null) {
                wVar.f44466g = null;
            }
        }
    }

    public static void C() {
        w wVar;
        HashMap hashMap = new HashMap();
        for (m mVar : f44441a.values()) {
            if (mVar.f44414l != 0 && !mVar.f44413k && mVar.f44426y != 0 && !f44447j && (wVar = mVar.f44423u) != null && wVar.f44465f != null && wVar.A) {
                hashMap.put(mVar.f44407b + "/" + mVar.f44414l, mVar);
            }
        }
        HashMap hashMap2 = f44449l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                o oVar = (o) entry.getValue();
                org.telegram.messenger.i0.r(oVar.f44435f);
                if (oVar.e != 0) {
                    ConnectionsManager.getInstance(oVar.f44432a).cancelRequest(oVar.e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                m mVar2 = (m) entry2.getValue();
                o oVar2 = new o(mVar2.f44407b, mVar2.f44414l);
                oVar2.f44434c = mVar2.f44420r;
                hashMap2.put((String) entry2.getKey(), oVar2);
                org.telegram.messenger.i0.h3(oVar2.f44435f, oVar2.d * 1000);
            }
        }
    }

    public static boolean D(m mVar) {
        if (mVar.f44411i && !mVar.f44413k && ((org.telegram.messenger.j0) wp.r1(mVar.f44407b).f19300y7.f18033j0.f11588b).f16393c) {
            return true;
        }
        return false;
    }

    public static void a(m mVar) {
        org.telegram.messenger.i0.r(mVar.H);
        if (!f44445g.remove(mVar)) {
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
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                org.telegram.messenger.i0.g3((Runnable) obj);
            }
        }
    }

    public static void c(m mVar, String str, String str2) {
        if (!TextUtils.equals(mVar.f44418p, str) || !TextUtils.equals(mVar.f44419q, str2)) {
            mVar.f44418p = str;
            mVar.f44419q = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = mVar.f44421s;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = mVar.f44420r;
            }
            w wVar = mVar.f44423u;
            if (wVar != null) {
                wVar.j(g(str, str2));
            }
        }
    }

    public static int d(String str, w wVar, int i10) {
        m mVar;
        int i11;
        int i12;
        int i13;
        if (n(str)) {
            mVar = (m) f44441a.get(str);
        } else {
            mVar = null;
        }
        int i14 = 0;
        if (mVar == null) {
            return 0;
        }
        if (mVar.f44409f > 0) {
            return org.telegram.messenger.i0.L(Math.max(50, Math.min(600, i11)));
        }
        if (wVar != null && Math.abs(wVar.f44469k - i10) <= 1) {
            i12 = wVar.f44467i;
        } else {
            i12 = 0;
        }
        if (i12 > 0) {
            return Math.min(org.telegram.messenger.i0.L(600.0f), Math.max(org.telegram.messenger.i0.L(50.0f), i12));
        }
        n nVar = (n) f44442b.get(mVar.a());
        if (nVar != null) {
            int f7 = f(i10);
            synchronized (nVar) {
                ArrayList arrayList = nVar.f44428a;
                int size = arrayList.size();
                int i15 = Integer.MAX_VALUE;
                i13 = 0;
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - f7);
                    if (abs < i15) {
                        i13 = iArr[1];
                        i15 = abs;
                    }
                }
            }
            i14 = i13;
        }
        if (i14 <= 0) {
            i14 = 160;
        }
        return org.telegram.messenger.i0.L(Math.max(50, Math.min(600, i14)));
    }

    public static String e(m mVar) {
        TLRPC.User user;
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = mVar.h;
            boolean z11 = mVar.f44411i;
            jSONObject.put("isCopy", z10);
            jSONObject.put("canQuery", z11);
            jSONObject.put("backgroundQuery", mVar.f44412j);
            jSONObject.put("preview", mVar.f44413k);
            jSONObject.put("wallet", D(mVar));
            Object obj = mVar.f44415m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (z11) {
                user = e20.i(mVar.f44407b).f();
            } else {
                user = null;
            }
            if (user != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", user.f19943id);
                if (!TextUtils.isEmpty(user.first_name)) {
                    jSONObject2.put("firstName", user.first_name);
                }
                if (!TextUtils.isEmpty(user.last_name)) {
                    jSONObject2.put("lastName", user.last_name);
                }
                String n10 = i20.n(user);
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

    public static int f(int i10) {
        return Math.round(i10 / org.telegram.messenger.i0.f16171p);
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

    public static m h(w wVar) {
        if (wVar == null) {
            return null;
        }
        return (m) f44441a.get(wVar.f44462a);
    }

    public static w i(String str) {
        m mVar;
        String str2;
        if (n(str)) {
            mVar = (m) f44441a.get(str);
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        synchronized (mVar) {
            try {
                if (mVar.f44423u == null) {
                    if (mVar.f44422t == null) {
                        mVar.f44422t = m(mVar.f44410g);
                    }
                    if (mVar.f44422t == null) {
                        return null;
                    }
                    w wVar = new w(w0.f18945b, mVar.f44406a, mVar.f44422t);
                    try {
                        str2 = dd.D0().f15365y.toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    wVar.f44478t = str2;
                    wVar.f44479u = null;
                    String e7 = e(mVar);
                    if (e7 != null) {
                        wVar.f44480w = e7;
                    }
                    wVar.j(g(mVar.f44418p, mVar.f44419q));
                    wVar.e = f44450m;
                    mVar.f44423u = wVar;
                }
                return mVar.f44423u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        JSONObject jSONObject;
        String str;
        org.telegram.messenger.i0.r(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (m mVar : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) f44443c.get(mVar.a());
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
            is a02 = is.a0(mVar.f44407b);
            long j10 = mVar.f44408c;
            a02.f16331a.c(new sk(mVar.d, 5, j10, a02, str2));
        }
        hashMap.clear();
    }

    public static String k(String str, w wVar, int i10) {
        m mVar;
        int[] iArr = null;
        if (n(str)) {
            mVar = (m) f44441a.get(str);
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return "none";
        }
        if (mVar.f44409f > 0) {
            return "anchor " + mVar.f44409f;
        } else if (wVar != null && Math.abs(wVar.f44469k - i10) <= 1 && wVar.f44467i > 0) {
            return "frame";
        } else {
            n nVar = (n) f44442b.get(mVar.a());
            if (nVar != null) {
                int f7 = f(i10);
                synchronized (nVar) {
                    ArrayList arrayList = nVar.f44428a;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        int[] iArr2 = (int[]) obj;
                        if (iArr == null || Math.abs(iArr2[0] - f7) < Math.abs(iArr[0] - f7)) {
                            iArr = iArr2;
                        }
                    }
                }
            }
            if (iArr != null && iArr[1] > 0) {
                if (iArr[0] == f(i10)) {
                    return "cache";
                }
                return "cache of width " + iArr[0];
            }
            return "placeholder";
        }
    }

    public static n l(String str) {
        ConcurrentHashMap concurrentHashMap = f44442b;
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
                if (v2.f18578a) {
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
                    f8.b(sb2.toString());
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
        } catch (Exception e7) {
            f8.g(e7, true);
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
            ArrayList arrayList = f44445g;
            if (arrayList.size() < 3 && !f44447j) {
                ArrayList arrayList2 = f44444f;
                long j10 = Long.MAX_VALUE;
                m mVar = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    m mVar2 = (m) arrayList2.get(size);
                    if (mVar2.A) {
                        long j11 = 9223372036854775806L;
                        for (m mVar3 : f44441a.values()) {
                            if (mVar3.f44426y != 0 && mVar3.f44407b == mVar2.f44407b && mVar3.f44408c == mVar2.f44408c) {
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
                    w wVar = mVar.f44423u;
                    if (wVar != null && !mVar.E && mVar.f44426y <= 0) {
                        String k10 = k(mVar.f44406a, wVar, mVar.F);
                        if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                            wVar.n(mVar.F);
                            if (wVar.f44477s == null) {
                                wVar.l(l0.a(null, mVar.G));
                            }
                            if (!wVar.f44473o) {
                                arrayList.add(mVar);
                                y(mVar);
                                org.telegram.messenger.i0.h3(mVar.H, 4000L);
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

    public static hl0 p(ArrayList arrayList) {
        int size = arrayList.size();
        hl0 hl0Var = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hl0 hl0Var2 = (hl0) obj;
            if (hl0Var == null || hl0Var2.f26819c0 > hl0Var.f26819c0) {
                hl0Var = hl0Var2;
            }
        }
        return hl0Var;
    }

    public static void q(boolean z10) {
        boolean z11;
        if (f44447j == z10) {
            return;
        }
        f44447j = z10;
        for (m mVar : f44441a.values()) {
            w wVar = mVar.f44423u;
            if (wVar != null && wVar.f44474p != z10) {
                wVar.f44474p = z10;
                k0 k0Var = wVar.f44465f;
                if (k0Var != null) {
                    if (wVar.f44472n && !z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k0Var.d(z11);
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

    public static void r(w wVar) {
        m h10 = h(wVar);
        if (h10 == null) {
            return;
        }
        h10.f44426y = Math.max(0, h10.f44426y - 1);
        h10.f44427z = System.currentTimeMillis();
        B();
        j();
        C();
    }

    public static void s(w wVar) {
        boolean z10;
        m h10 = h(wVar);
        if (h10 == null) {
            return;
        }
        h10.f44426y++;
        h10.f44427z = System.currentTimeMillis();
        boolean z11 = f44447j;
        if (wVar.f44474p != z11) {
            wVar.f44474p = z11;
            k0 k0Var = wVar.f44465f;
            if (k0Var != null) {
                if (wVar.f44472n && !z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k0Var.d(z10);
            }
        }
        if (h10.A) {
            y(h10);
        } else {
            h10.B = true;
        }
        B();
        C();
    }

    public static void t(int i10) {
        org.telegram.messenger.i0.g3(new xd(i10, 11));
    }

    public static void u(m mVar, w wVar, long j10, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(zArr, ConnectionsManager.getInstance(mVar.f44407b), iArr, wVar, j10, 8);
        w(mVar, widgetQueryType, bArr, iArr, new i(zArr, gVar, wVar, j10));
        org.telegram.messenger.i0.h3(gVar, 30000L);
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
        int i10 = mVar.f44407b;
        boolean z11 = f44448k[i10];
        if (z11 && !z10) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            org.telegram.messenger.i0.g3(new v1(3, iVar, tL_error));
            return;
        }
        if (z11) {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
        } else {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        }
        tL_messages_getBotWidgetQueryAnswer.peer = wp.r1(i10).i1(mVar.f44408c);
        tL_messages_getBotWidgetQueryAnswer.msg_id = mVar.d;
        tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new a3.b(1), new org.telegram.ui.Wallet.v1(z11, mVar, widgetQueryType, bArr, iArr, iVar));
    }

    public static boolean x() {
        k0 k0Var;
        i0 i0Var;
        for (m mVar : f44441a.values()) {
            w wVar = mVar.f44423u;
            hl0 hl0Var = mVar.f44425x;
            if (mVar.f44426y != 0 && wVar != null && hl0Var != null && !mVar.E && ((k0Var = wVar.f44465f) == null || (i0Var = k0Var.F) == null || (!i0Var.h && !k0Var.f44398x))) {
                String k10 = k(mVar.f44406a, wVar, hl0Var.u0());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void y(m mVar) {
        k0 k0Var;
        boolean z10;
        w wVar = mVar.f44423u;
        if (mVar.E) {
            if (mVar.C >= 2) {
                return;
            }
            mVar.E = false;
            wVar.p();
        }
        if (!wVar.f44473o) {
            wVar.f44473o = true;
            k0 k0Var2 = wVar.f44465f;
            if (k0Var2 != null) {
                k0Var2.A = true;
                return;
            }
            String str = wVar.f44477s;
            if (str == null && wVar.f44478t == null && wVar.f44479u == null) {
                k0Var = new k0(wVar.f44464c, wVar.f44463b, l0.d(wVar.f44471m), wVar.d, null, null);
            } else {
                Context context = wVar.f44464c;
                String str2 = wVar.f44463b;
                if (str == null) {
                    str = l0.d(wVar.f44471m);
                }
                k0Var = new k0(context, str2, str, wVar.d, wVar.f44478t, wVar.f44479u);
            }
            StringBuilder sb2 = new StringBuilder("{\"data\":");
            sb2.append(wVar.v);
            sb2.append(",\"context\":");
            String r10 = a1.g.r(sb2, wVar.f44480w, "}");
            if (r10 != null) {
                k0Var.h = r10;
            }
            k0Var.c(wVar.f44481x);
            k0Var.J = wVar;
            k0Var.L = wVar;
            if (wVar.f44472n && !wVar.f44474p) {
                z10 = true;
            } else {
                z10 = false;
            }
            k0Var.d(z10);
            wVar.f44465f = k0Var;
            wVar.f44475q++;
            b0.f44319a.execute(new v(k0Var, wVar.f44468j, 0));
        }
    }

    public static String z(int i10, int i11, long j10) {
        return i10 + "/" + j10 + "/" + i11;
    }
}
