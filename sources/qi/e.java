package qi;

import a0.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.emoji2.text.o;
import b2.c1;
import b2.u;
import b2.z0;
import bi.c3;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.play_billing.k3;
import e2.j;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import e9.y0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import ji.v2;
import l.a0;
import l.r;
import li.k;
import m4.f0;
import m4.p1;
import m4.q1;
import m4.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ca1;
import org.telegram.ui.Components.s10;
import org.telegram.ui.web.k1;
import org.telegram.ui.web.l1;
import v7.u6;
import z3.m;
import z3.n;
import z9.w0;
import z9.x0;
public final class e implements n, n5.b {
    public static volatile e e;
    public Object f43662a;
    public Object f43663b;
    public Object f43664c;
    public Object d;

    public e(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f43663b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f43664c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f43662a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(A(bufferedReader));
        l1 l1Var = (l1) hashMap.get("content-type");
        String str = l1Var == null ? null : (String) l1Var.f41422b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            k1 k1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (k1Var != null) {
                        k1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(k1Var);
                        l1 l1Var2 = (l1) k1Var.f41414a.get("content-location");
                        hashMap2.put(l1Var2 == null ? null : l1Var2.f41421a, k1Var);
                    }
                    k1Var = new k1();
                    k1Var.f41415b = (File) this.f43662a;
                    k1Var.f41414a.putAll(A(bufferedReader));
                    k1Var.f41416c = jArr[0];
                }
            }
            if (k1Var != null && k1Var.f41416c != 0 && k1Var.d != 0) {
                arrayList.add(k1Var);
                l1 l1Var3 = (l1) k1Var.f41414a.get("content-location");
                hashMap2.put(l1Var3 != null ? l1Var3.f41421a : null, k1Var);
            }
        }
        bufferedReader.close();
    }

    public static void D(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    public static void c(String str, String str2, HashMap hashMap) {
        l1 l1Var = new l1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = k3.j(1, 1, trim3);
                    }
                    l1Var.f41422b.put(trim2, trim3);
                } else {
                    l1Var.f41421a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), l1Var);
    }

    public HashMap A(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.d;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                } else if (str != null && sb2 != null) {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                } else {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb2 = a1.g.u(trim3);
                            str = trim2;
                        } else {
                            c(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            c(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            c(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void B() {
        boolean z10;
        if (((d) this.f43663b) == null) {
            d dVar = (d) ((ArrayDeque) this.f43662a).pollFirst();
            this.f43663b = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.f43664c = bVar;
                AndroidUtilities.runOnUIThread(bVar, 10000L);
                a aVar = dVar.f43660b;
                String str = aVar.f43651b;
                String str2 = aVar.f43653f;
                c cVar = new c(this, dVar);
                k i10 = i.i(str);
                byte[] d = i.d(str2);
                int i11 = 0;
                if (i10 != null && d != null) {
                    try {
                        z10 = a.a.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (i.f43670y) {
                            i iVar = i.A;
                            if (iVar != null) {
                                iVar.o();
                                i.A = null;
                            }
                            try {
                                i iVar2 = new i(i10, str2, d);
                                i.A = iVar2;
                                iVar2.f43691x = cVar;
                                s10 s10Var = s10.getInstance();
                                if (s10Var != null) {
                                    s10Var.addListener(iVar2);
                                }
                                iVar2.f43678j.execute(new f(iVar2, 1));
                                AndroidUtilities.runOnUIThread(new f(iVar2, 2));
                                i11 = i.A.f43677i.getLocalPort();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                i iVar3 = i.A;
                                if (iVar3 != null) {
                                    iVar3.o();
                                    i.A = null;
                                }
                            }
                        }
                    }
                }
                dVar.d = i11;
                if (i11 == 0) {
                    h(dVar);
                }
            }
        }
    }

    public void C(w wVar) {
        synchronized (this.f43662a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f43664c).remove(wVar);
                if (iVar == null) {
                    return;
                }
                ((a0.f) this.f43663b).remove(iVar.f15453a);
                iVar.f15454b.g();
                f0 f0Var = (f0) ((WeakReference) this.d).get();
                if (f0Var != null && !f0Var.j()) {
                    m0.W(f0Var.f15432l, new m4.f(f0Var, wVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b E(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.f43664c;
        ArrayList d = d(list);
        if (d.size() < 2) {
            return (m2.b) s.l(d, null);
        }
        Collections.sort(d, new a4.d(24));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) d.get(0)).f15320c;
        int i12 = 0;
        while (true) {
            if (i12 >= d.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) d.get(i12);
            if (i11 != bVar2.f15320c) {
                if (arrayList.size() == 1) {
                    return (m2.b) d.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f15319b, Integer.valueOf(bVar2.d)));
                i12++;
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = d.subList(0, arrayList.size());
            int i13 = 0;
            for (int i14 = 0; i14 < subList.size(); i14++) {
                i13 += ((m2.b) subList.get(i14)).d;
            }
            int nextInt = ((Random) this.d).nextInt(i13);
            int i15 = 0;
            while (true) {
                if (i10 < subList.size()) {
                    bVar = (m2.b) subList.get(i10);
                    i15 += bVar.d;
                    if (nextInt < i15) {
                        break;
                    }
                    i10++;
                } else {
                    bVar = (m2.b) s.m(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public void a(Object obj, w wVar, q1 q1Var, c1 c1Var) {
        synchronized (this.f43662a) {
            try {
                w n10 = n(obj);
                if (n10 == null) {
                    ((a0.f) this.f43663b).put(obj, wVar);
                    ?? obj2 = new Object();
                    obj2.f5046c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.f43664c).put(wVar, new m4.i(obj, obj2, q1Var, c1Var));
                } else {
                    m4.i iVar = (m4.i) ((a0.f) this.f43664c).get(n10);
                    iVar.getClass();
                    iVar.d = q1Var;
                    iVar.e = c1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(w wVar, int i10, m4.h hVar) {
        synchronized (this.f43662a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f43664c).get(wVar);
                if (iVar != null) {
                    c1 c1Var = iVar.f15457g;
                    c1Var.getClass();
                    u uVar = new u();
                    uVar.c(c1Var.f2093a);
                    uVar.b(i10);
                    iVar.f15457g = new c1(uVar.d());
                    iVar.f15455c.add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList d(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f43662a;
        D(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f43663b;
        D(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.f15319b) && !hashMap2.containsKey(Integer.valueOf(bVar.f15320c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public w0 e() {
        String str;
        if (((x0) this.f43662a) == null) {
            str = " rolloutVariant";
        } else {
            str = "";
        }
        if (((String) this.f43663b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.f43664c) == null) {
            str = t8.b.u(str, " parameterValue");
        }
        if (((Long) this.d) == null) {
            str = t8.b.u(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.f43662a, (String) this.f43663b, (String) this.f43664c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void f(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            s(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String g(String str) {
        ArrayList arrayList = (ArrayList) this.f43662a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f43663b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                f(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    @Override
    public Object mo27get() {
        return new com.google.firebase.messaging.s((Executor) ((hd.a) this.f43662a).mo27get(), (s5.d) ((hd.a) this.f43663b).mo27get(), (k) ((k) this.f43664c).mo27get(), (t5.c) ((hd.a) this.d).mo27get(), 9);
    }

    public void h(d dVar) {
        if (((d) this.f43663b) != dVar) {
            return;
        }
        b bVar = (b) this.f43664c;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.f43664c = null;
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.d = null;
        }
        synchronized (i.f43670y) {
            try {
                i iVar = i.A;
                if (iVar != null) {
                    iVar.o();
                    i.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f43663b = null;
        dVar.f43661c.run(-1L);
        B();
    }

    @Override
    public int h0() {
        return 2;
    }

    public void i(m4.i iVar) {
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (f0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.h hVar = (m4.h) iVar.f15455c.poll();
                if (hVar == null) {
                    iVar.f15456f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.i iVar2 = iVar;
                m0.W(f0Var.f15432l, new v2(f0Var, n(iVar.f15453a), new c3(this, hVar, atomicBoolean2, iVar2, atomicBoolean, 10)));
                atomicBoolean2.set(false);
                iVar = iVar2;
            }
        }
    }

    public void j(final w wVar) {
        synchronized (this.f43662a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f43664c).get(wVar);
                if (iVar == null) {
                    return;
                }
                final c1 c1Var = iVar.f15457g;
                iVar.f15457g = c1.f2091b;
                iVar.f15455c.add(new m4.h(wVar, c1Var) {
                    public final w f15447b;

                    @Override
                    public final j9.y run() {
                        f0 f0Var = (f0) ((WeakReference) qi.e.this.d).get();
                        if (f0Var != null) {
                            f0Var.p(this.f15447b);
                        }
                        return j9.w.f12945b;
                    }
                });
                if (iVar.f15456f) {
                    return;
                }
                iVar.f15456f = true;
                i(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e k(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f43664c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f13727b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f43663b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public c1 l(w wVar) {
        synchronized (this.f43662a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f43664c).get(wVar);
                if (iVar != null) {
                    return iVar.e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n0 m() {
        n0 u10;
        synchronized (this.f43662a) {
            u10 = n0.u(((a0.f) this.f43663b).values());
        }
        return u10;
    }

    public w n(Object obj) {
        w wVar;
        synchronized (this.f43662a) {
            wVar = (w) ((a0.f) this.f43663b).get(obj);
        }
        return wVar;
    }

    public z0 o(w wVar) {
        synchronized (this.f43662a) {
            try {
                return ((m4.i) ((a0.f) this.f43664c).get(wVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m4.l1 p(w wVar) {
        synchronized (this.f43662a) {
            try {
                if (((m4.i) ((a0.f) this.f43664c).get(wVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v q(w wVar) {
        m4.i iVar;
        synchronized (this.f43662a) {
            iVar = (m4.i) ((a0.f) this.f43664c).get(wVar);
        }
        if (iVar != null) {
            return iVar.f15454b;
        }
        return null;
    }

    public void r(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: qi.e.r(int, java.lang.String, java.util.HashMap):void");
    }

    public void s(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = ca1.f23987x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = ca1.f23988y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            r(i10, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public boolean t(w wVar) {
        boolean z10;
        synchronized (this.f43662a) {
            if (((a0.f) this.f43664c).get(wVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean u(w wVar, int i10) {
        m4.i iVar;
        synchronized (this.f43662a) {
            iVar = (m4.i) ((a0.f) this.f43664c).get(wVar);
        }
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (iVar != null && iVar.e.a(i10) && f0Var != null && f0Var.f15440t.s().a(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public void u0(byte[] bArr, int i10, int i11, m mVar, j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int A;
        int i15;
        int i16;
        int D;
        c4.a aVar = (c4.a) this.f43664c;
        x xVar = (x) this.f43663b;
        x xVar2 = (x) this.f43662a;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (m0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.f8413c, xVar.f8411a);
        }
        int i17 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f4317b;
        x xVar3 = aVar.f4316a;
        aVar.e = 0;
        aVar.f4319f = 0;
        aVar.f4320g = 0;
        aVar.h = 0;
        aVar.f4321i = 0;
        xVar3.K(0);
        aVar.f4318c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i18 = xVar2.f8413c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i19 = xVar2.f8412b + H;
            if (i19 > i18) {
                xVar2.N(i18);
                i12 = i17;
                bVar = null;
            } else {
                char c10 = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i17);
                                int i20 = H / 5;
                                int i21 = i17;
                                while (i21 < i20) {
                                    int A3 = xVar2.A();
                                    char c11 = c10;
                                    double A4 = xVar2.A();
                                    double A5 = xVar2.A() - 128;
                                    double A6 = xVar2.A() - 128;
                                    iArr[A3] = m0.i((int) ((A6 * 1.772d) + A4), 0, 255) | (xVar2.A() << 24) | (m0.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (m0.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8);
                                    i21++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.f4318c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xVar2.O(3);
                                if ((128 & xVar2.A()) != 0) {
                                    i16 = 1;
                                } else {
                                    i16 = i17;
                                }
                                int i22 = H - 4;
                                if (i16 != 0) {
                                    if (i22 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.f4321i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i22 = H - 11;
                                    }
                                }
                                int i23 = xVar3.f8412b;
                                int i24 = xVar3.f8413c;
                                if (i23 < i24 && i22 > 0) {
                                    int min = Math.min(i22, i24 - i23);
                                    xVar2.k(i23, min, xVar3.f8411a);
                                    xVar3.N(i23 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.e = xVar2.H();
                                xVar2.O(11);
                                aVar.f4319f = xVar2.H();
                                aVar.f4320g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.e != 0 && aVar.h != 0 && aVar.f4321i != 0 && (i13 = xVar3.f8413c) != 0 && xVar3.f8412b == i13 && aVar.f4318c) {
                        xVar3.N(0);
                        int i25 = aVar.h * aVar.f4321i;
                        int[] iArr2 = new int[i25];
                        int i26 = 0;
                        while (i26 < i25) {
                            int A7 = xVar3.A();
                            if (A7 != 0) {
                                i14 = i26 + 1;
                                iArr2[i26] = iArr[A7];
                            } else {
                                int A8 = xVar3.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | xVar3.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i15 = iArr[0];
                                    } else {
                                        i15 = iArr[xVar3.A()];
                                    }
                                    i14 = A + i26;
                                    Arrays.fill(iArr2, i26, i14, i15);
                                }
                            }
                            i26 = i14;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f4321i, Bitmap.Config.ARGB_8888);
                        float f7 = aVar.d;
                        float f10 = aVar.e;
                        bVar = new d2.b(null, null, null, createBitmap, aVar.f4320g / f10, 0, 0, aVar.f4319f / f7, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f7, aVar.f4321i / f10, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i12 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f4319f = 0;
                    aVar.f4320g = 0;
                    aVar.h = 0;
                    aVar.f4321i = 0;
                    xVar3.K(0);
                    aVar.f4318c = false;
                }
                xVar2.N(i19);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i17 = i12;
        }
        jVar.accept(new z3.b(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public boolean v(w wVar, int i10) {
        m4.i iVar;
        boolean z10;
        synchronized (this.f43662a) {
            iVar = (m4.i) ((a0.f) this.f43664c).get(wVar);
        }
        if (iVar != null) {
            q1 q1Var = iVar.d;
            q1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.f("Use contains(Command) for custom command", z10);
            for (p1 p1Var : q1Var.f15590a) {
                if (p1Var.f15568a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public z3.e w(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    public boolean x(w wVar, p1 p1Var) {
        m4.i iVar;
        synchronized (this.f43662a) {
            iVar = (m4.i) ((a0.f) this.f43664c).get(wVar);
        }
        if (iVar != null) {
            y0 y0Var = iVar.d.f15590a;
            p1Var.getClass();
            if (y0Var.contains(p1Var) || m4.e.j(p1Var.f15569b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean y(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f43662a).onActionItemClicked(k(aVar), new r((Context) this.f43663b, (l0.a) menuItem));
    }

    public boolean z(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f43662a;
        k.e k10 = k(aVar);
        l lVar = (l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f43663b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(k10, menu2);
    }

    public e(int i10) {
        switch (i10) {
            case 2:
                this.f43662a = new x();
                this.f43663b = new x();
                this.f43664c = new c4.a();
                return;
            case 5:
                Random random = new Random();
                this.f43664c = new HashMap();
                this.d = random;
                this.f43662a = new HashMap();
                this.f43663b = new HashMap();
                return;
            default:
                this.f43662a = new ArrayDeque();
                return;
        }
    }

    public e(f0 f0Var) {
        this.f43663b = new l(0);
        this.f43664c = new l(0);
        this.f43662a = new Object();
        this.d = new WeakReference(f0Var);
    }

    public e(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.d = typeface;
        this.f43662a = bVar;
        this.f43664c = new androidx.emoji2.text.s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.f42830a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f43663b = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.f42830a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            o oVar = new o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.f42830a) : 0, (char[]) this.f43663b, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.f42830a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.f43664c;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.f42830a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(oVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    @Override
    public void reset() {
    }

    public e(String str) {
        this.f43662a = new ArrayList();
        this.f43664c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f43663b = str;
    }

    public e(x1 x1Var, f2.j jVar, qf.b bVar, f2.j jVar2) {
        Object obj;
        if (x1Var != null) {
            obj = n0.u(x1Var);
        } else {
            l0 l0Var = n0.f8592b;
            obj = x1.e;
        }
        this.f43662a = obj;
        this.f43663b = jVar;
        this.f43664c = bVar;
        this.d = jVar2;
    }
}
