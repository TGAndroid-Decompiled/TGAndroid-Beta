package pi;

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
import com.google.android.gms.internal.play_billing.k3;
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
import l.k;
import l.r;
import m.h3;
import m4.e0;
import m4.k1;
import m4.o1;
import m4.p1;
import m4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.da1;
import org.telegram.ui.Components.s10;
import org.telegram.ui.web.l1;
import org.telegram.ui.web.m1;
import v7.u6;
import z3.m;
import z3.n;
import z9.w0;
import z9.x0;
public final class e implements n, n5.b {
    public static volatile e e;
    public Object f42944a;
    public Object f42945b;
    public Object f42946c;
    public Object d;

    public e(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f42945b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f42946c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f42944a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(A(bufferedReader));
        m1 m1Var = (m1) hashMap.get("content-type");
        String str = m1Var == null ? null : (String) m1Var.f41120b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            l1 l1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (l1Var != null) {
                        l1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(l1Var);
                        m1 m1Var2 = (m1) l1Var.f41112a.get("content-location");
                        hashMap2.put(m1Var2 == null ? null : m1Var2.f41119a, l1Var);
                    }
                    l1Var = new l1();
                    l1Var.f41113b = (File) this.f42944a;
                    l1Var.f41112a.putAll(A(bufferedReader));
                    l1Var.f41114c = jArr[0];
                }
            }
            if (l1Var != null && l1Var.f41114c != 0 && l1Var.d != 0) {
                arrayList.add(l1Var);
                m1 m1Var3 = (m1) l1Var.f41112a.get("content-location");
                hashMap2.put(m1Var3 != null ? m1Var3.f41119a : null, l1Var);
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
        m1 m1Var = new m1();
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
                    m1Var.f41120b.put(trim2, trim3);
                } else {
                    m1Var.f41119a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), m1Var);
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
        if (((d) this.f42945b) == null) {
            d dVar = (d) ((ArrayDeque) this.f42944a).pollFirst();
            this.f42945b = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.f42946c = bVar;
                AndroidUtilities.runOnUIThread(bVar, 10000L);
                a aVar = dVar.f42942b;
                String str = aVar.f42933b;
                String str2 = aVar.f42935f;
                c cVar = new c(this, dVar);
                h3 i10 = j.i(str);
                byte[] d = j.d(str2);
                int i11 = 0;
                if (i10 != null && d != null) {
                    try {
                        z10 = a.a.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (j.f42955y) {
                            j jVar = j.A;
                            if (jVar != null) {
                                jVar.o();
                                j.A = null;
                            }
                            try {
                                j jVar2 = new j(i10, str2, d);
                                j.A = jVar2;
                                jVar2.f42976x = cVar;
                                s10 s10Var = s10.getInstance();
                                if (s10Var != null) {
                                    s10Var.addListener(jVar2);
                                }
                                jVar2.f42963j.execute(new f(jVar2, 1));
                                AndroidUtilities.runOnUIThread(new f(jVar2, 2));
                                i11 = j.A.f42962i.getLocalPort();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                j jVar3 = j.A;
                                if (jVar3 != null) {
                                    jVar3.o();
                                    j.A = null;
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

    public void C(v vVar) {
        synchronized (this.f42944a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f42946c).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.f42945b).remove(hVar.f15183a);
                hVar.f15184b.g();
                e0 e0Var = (e0) ((WeakReference) this.d).get();
                if (e0Var != null && !e0Var.j()) {
                    m0.W(e0Var.f15162l, new m4.e(e0Var, vVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b E(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.f42946c;
        ArrayList d = d(list);
        if (d.size() < 2) {
            return (m2.b) s.l(d, null);
        }
        Collections.sort(d, new a4.d(24));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) d.get(0)).f15055c;
        int i12 = 0;
        while (true) {
            if (i12 >= d.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) d.get(i12);
            if (i11 != bVar2.f15055c) {
                if (arrayList.size() == 1) {
                    return (m2.b) d.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f15054b, Integer.valueOf(bVar2.d)));
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

    @Override
    public int X() {
        return 2;
    }

    public void a(Object obj, v vVar, p1 p1Var, c1 c1Var) {
        synchronized (this.f42944a) {
            try {
                v n10 = n(obj);
                if (n10 == null) {
                    ((a0.f) this.f42945b).put(obj, vVar);
                    ?? obj2 = new Object();
                    obj2.f5049c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.f42946c).put(vVar, new m4.h(obj, obj2, p1Var, c1Var));
                } else {
                    m4.h hVar = (m4.h) ((a0.f) this.f42946c).get(n10);
                    hVar.getClass();
                    hVar.d = p1Var;
                    hVar.e = c1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(v vVar, int i10, m4.g gVar) {
        synchronized (this.f42944a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f42946c).get(vVar);
                if (hVar != null) {
                    c1 c1Var = hVar.f15187g;
                    c1Var.getClass();
                    u uVar = new u();
                    uVar.c(c1Var.f2097a);
                    uVar.b(i10);
                    hVar.f15187g = new c1(uVar.d());
                    hVar.f15185c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList d(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f42944a;
        D(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f42945b;
        D(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.f15054b) && !hashMap2.containsKey(Integer.valueOf(bVar.f15055c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public w0 e() {
        String str;
        if (((x0) this.f42944a) == null) {
            str = " rolloutVariant";
        } else {
            str = "";
        }
        if (((String) this.f42945b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.f42946c) == null) {
            str = t8.b.u(str, " parameterValue");
        }
        if (((Long) this.d) == null) {
            str = t8.b.u(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.f42944a, (String) this.f42945b, (String) this.f42946c, ((Long) this.d).longValue());
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
        ArrayList arrayList = (ArrayList) this.f42944a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f42945b);
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
        return new com.google.firebase.messaging.s((Executor) ((hd.a) this.f42944a).mo27get(), (s5.d) ((hd.a) this.f42945b).mo27get(), (h3) ((h3) this.f42946c).mo27get(), (t5.c) ((hd.a) this.d).mo27get(), 9);
    }

    public void h(d dVar) {
        if (((d) this.f42945b) != dVar) {
            return;
        }
        b bVar = (b) this.f42946c;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.f42946c = null;
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.d = null;
        }
        synchronized (j.f42955y) {
            try {
                j jVar = j.A;
                if (jVar != null) {
                    jVar.o();
                    j.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f42945b = null;
        dVar.f42943c.run(-1L);
        B();
    }

    public void i(m4.h hVar) {
        e0 e0Var = (e0) ((WeakReference) this.d).get();
        if (e0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.g gVar = (m4.g) hVar.f15185c.poll();
                if (gVar == null) {
                    hVar.f15186f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.h hVar2 = hVar;
                m0.W(e0Var.f15162l, new v2(e0Var, n(hVar.f15183a), new c3(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 10)));
                atomicBoolean2.set(false);
                hVar = hVar2;
            }
        }
    }

    public void j(final v vVar) {
        synchronized (this.f42944a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f42946c).get(vVar);
                if (hVar == null) {
                    return;
                }
                final c1 c1Var = hVar.f15187g;
                hVar.f15187g = c1.f2095b;
                hVar.f15185c.add(new m4.g(vVar, c1Var) {
                    public final v f15177b;

                    @Override
                    public final j9.y run() {
                        e0 e0Var = (e0) ((WeakReference) pi.e.this.d).get();
                        if (e0Var != null) {
                            e0Var.p(this.f15177b);
                        }
                        return j9.w.f12949b;
                    }
                });
                if (hVar.f15186f) {
                    return;
                }
                hVar.f15186f = true;
                i(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e k(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f42946c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f13730b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f42945b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public c1 l(v vVar) {
        synchronized (this.f42944a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f42946c).get(vVar);
                if (hVar != null) {
                    return hVar.e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n0 m() {
        n0 u10;
        synchronized (this.f42944a) {
            u10 = n0.u(((a0.f) this.f42945b).values());
        }
        return u10;
    }

    @Override
    public void m0(byte[] bArr, int i10, int i11, m mVar, e2.j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int A;
        int i15;
        int i16;
        int D;
        c4.a aVar = (c4.a) this.f42946c;
        x xVar = (x) this.f42945b;
        x xVar2 = (x) this.f42944a;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (m0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.f8416c, xVar.f8414a);
        }
        int i17 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f4321b;
        x xVar3 = aVar.f4320a;
        aVar.e = 0;
        aVar.f4323f = 0;
        aVar.f4324g = 0;
        aVar.h = 0;
        aVar.f4325i = 0;
        xVar3.K(0);
        aVar.f4322c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i18 = xVar2.f8416c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i19 = xVar2.f8415b + H;
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
                                aVar.f4322c = true;
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
                                        aVar.f4325i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i22 = H - 11;
                                    }
                                }
                                int i23 = xVar3.f8415b;
                                int i24 = xVar3.f8416c;
                                if (i23 < i24 && i22 > 0) {
                                    int min = Math.min(i22, i24 - i23);
                                    xVar2.k(i23, min, xVar3.f8414a);
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
                                aVar.f4323f = xVar2.H();
                                aVar.f4324g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.e != 0 && aVar.h != 0 && aVar.f4325i != 0 && (i13 = xVar3.f8416c) != 0 && xVar3.f8415b == i13 && aVar.f4322c) {
                        xVar3.N(0);
                        int i25 = aVar.h * aVar.f4325i;
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
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f4325i, Bitmap.Config.ARGB_8888);
                        float f7 = aVar.d;
                        float f10 = aVar.e;
                        bVar = new d2.b(null, null, null, createBitmap, aVar.f4324g / f10, 0, 0, aVar.f4323f / f7, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f7, aVar.f4325i / f10, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i12 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f4323f = 0;
                    aVar.f4324g = 0;
                    aVar.h = 0;
                    aVar.f4325i = 0;
                    xVar3.K(0);
                    aVar.f4322c = false;
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

    public v n(Object obj) {
        v vVar;
        synchronized (this.f42944a) {
            vVar = (v) ((a0.f) this.f42945b).get(obj);
        }
        return vVar;
    }

    public z0 o(v vVar) {
        synchronized (this.f42944a) {
            try {
                return ((m4.h) ((a0.f) this.f42946c).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k1 p(v vVar) {
        synchronized (this.f42944a) {
            try {
                if (((m4.h) ((a0.f) this.f42946c).get(vVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.v q(v vVar) {
        m4.h hVar;
        synchronized (this.f42944a) {
            hVar = (m4.h) ((a0.f) this.f42946c).get(vVar);
        }
        if (hVar != null) {
            return hVar.f15184b;
        }
        return null;
    }

    public void r(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: pi.e.r(int, java.lang.String, java.util.HashMap):void");
    }

    public void s(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = da1.f24043x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = da1.f24044y0.matcher(trim);
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

    public boolean t(v vVar) {
        boolean z10;
        synchronized (this.f42944a) {
            if (((a0.f) this.f42946c).get(vVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean u(v vVar, int i10) {
        m4.h hVar;
        synchronized (this.f42944a) {
            hVar = (m4.h) ((a0.f) this.f42946c).get(vVar);
        }
        e0 e0Var = (e0) ((WeakReference) this.d).get();
        if (hVar != null && hVar.e.a(i10) && e0Var != null && e0Var.f15170t.s().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean v(v vVar, int i10) {
        m4.h hVar;
        boolean z10;
        synchronized (this.f42944a) {
            hVar = (m4.h) ((a0.f) this.f42946c).get(vVar);
        }
        if (hVar != null) {
            p1 p1Var = hVar.d;
            p1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.f("Use contains(Command) for custom command", z10);
            for (o1 o1Var : p1Var.f15320a) {
                if (o1Var.f15298a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean w(v vVar, o1 o1Var) {
        m4.h hVar;
        synchronized (this.f42944a) {
            hVar = (m4.h) ((a0.f) this.f42946c).get(vVar);
        }
        if (hVar != null) {
            y0 y0Var = hVar.d.f15320a;
            o1Var.getClass();
            if (y0Var.contains(o1Var) || m4.d.j(o1Var.f15299b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public z3.e x(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    public boolean y(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f42944a).onActionItemClicked(k(aVar), new r((Context) this.f42945b, (l0.a) menuItem));
    }

    public boolean z(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f42944a;
        k.e k10 = k(aVar);
        l lVar = (l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f42945b, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(k10, menu2);
    }

    public e(int i10) {
        switch (i10) {
            case 2:
                this.f42944a = new x();
                this.f42945b = new x();
                this.f42946c = new c4.a();
                return;
            case 5:
                Random random = new Random();
                this.f42946c = new HashMap();
                this.d = random;
                this.f42944a = new HashMap();
                this.f42945b = new HashMap();
                return;
            default:
                this.f42944a = new ArrayDeque();
                return;
        }
    }

    public e(e0 e0Var) {
        this.f42945b = new l(0);
        this.f42946c = new l(0);
        this.f42944a = new Object();
        this.d = new WeakReference(e0Var);
    }

    public e(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.d = typeface;
        this.f42944a = bVar;
        this.f42946c = new androidx.emoji2.text.s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.f42530a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f42945b = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.f42530a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            o oVar = new o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.f42530a) : 0, (char[]) this.f42945b, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.f42530a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.f42946c;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.f42530a;
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
        this.f42944a = new ArrayList();
        this.f42946c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f42945b = str;
    }

    public e(x1 x1Var, f2.j jVar, qf.b bVar, f2.j jVar2) {
        Object obj;
        if (x1Var != null) {
            obj = n0.u(x1Var);
        } else {
            l0 l0Var = n0.f8595b;
            obj = x1.e;
        }
        this.f42944a = obj;
        this.f42945b = jVar;
        this.f42946c = bVar;
        this.d = jVar2;
    }
}
