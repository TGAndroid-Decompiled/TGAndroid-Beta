package qi;

import a0.l;
import ai.t0;
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
import b2.b1;
import b2.t;
import b2.y0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.play_billing.k3;
import e2.j;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
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
import l.a0;
import l.k;
import l.r;
import m.g3;
import m4.f0;
import m4.o1;
import m4.p1;
import m4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.w91;
import org.telegram.ui.web.j1;
import org.telegram.ui.web.k1;
import v7.u6;
import z3.m;
import z9.w0;
import z9.x0;
public final class e implements m, n5.b {
    public static volatile e e;
    public Object f44760a;
    public Object f44761b;
    public Object f44762c;
    public Object d;

    public e(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f44761b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f44762c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f44760a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(C(bufferedReader));
        k1 k1Var = (k1) hashMap.get("content-type");
        String str = k1Var == null ? null : (String) k1Var.f42706b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            j1 j1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (j1Var != null) {
                        j1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(j1Var);
                        k1 k1Var2 = (k1) j1Var.f42688a.get("content-location");
                        hashMap2.put(k1Var2 == null ? null : k1Var2.f42705a, j1Var);
                    }
                    j1Var = new j1();
                    j1Var.f42689b = (File) this.f44760a;
                    j1Var.f42688a.putAll(C(bufferedReader));
                    j1Var.f42690c = jArr[0];
                }
            }
            if (j1Var != null && j1Var.f42690c != 0 && j1Var.d != 0) {
                arrayList.add(j1Var);
                k1 k1Var3 = (k1) j1Var.f42688a.get("content-location");
                hashMap2.put(k1Var3 != null ? k1Var3.f42705a : null, j1Var);
            }
        }
        bufferedReader.close();
    }

    public static void F(long j10, HashMap hashMap) {
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

    public static void e(String str, String str2, HashMap hashMap) {
        k1 k1Var = new k1();
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
                    k1Var.f42706b.put(trim2, trim3);
                } else {
                    k1Var.f42705a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), k1Var);
    }

    public boolean A(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f44760a).onActionItemClicked(n(aVar), new r((Context) this.f44761b, (l0.a) menuItem));
    }

    public boolean B(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f44760a;
        k.e n10 = n(aVar);
        l lVar = (l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f44761b, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(n10, menu2);
    }

    public HashMap C(BufferedReader bufferedReader) {
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
                            e(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            e(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            e(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void D() {
        boolean z10;
        if (((d) this.f44761b) == null) {
            d dVar = (d) ((ArrayDeque) this.f44760a).pollFirst();
            this.f44761b = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.f44762c = bVar;
                AndroidUtilities.runOnUIThread(bVar, 10000L);
                a aVar = dVar.f44758b;
                String str = aVar.f44749b;
                String str2 = aVar.f44751f;
                c cVar = new c(this, dVar);
                g3 i10 = i.i(str);
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
                        synchronized (i.f44768y) {
                            i iVar = i.A;
                            if (iVar != null) {
                                iVar.o();
                                i.A = null;
                            }
                            try {
                                i iVar2 = new i(i10, str2, d);
                                i.A = iVar2;
                                iVar2.f44789x = cVar;
                                o10 o10Var = o10.getInstance();
                                if (o10Var != null) {
                                    o10Var.addListener(iVar2);
                                }
                                iVar2.f44776j.execute(new f(iVar2, 1));
                                AndroidUtilities.runOnUIThread(new f(iVar2, 2));
                                i11 = i.A.f44775i.getLocalPort();
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
                    k(dVar);
                }
            }
        }
    }

    public void E(v vVar) {
        synchronized (this.f44760a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f44762c).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.f44761b).remove(hVar.f16542a);
                hVar.f16543b.g();
                f0 f0Var = (f0) ((WeakReference) this.d).get();
                if (f0Var != null && !f0Var.j()) {
                    m0.W(f0Var.f16526l, new m4.e(f0Var, vVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b G(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.f44762c;
        ArrayList g10 = g(list);
        if (g10.size() < 2) {
            return (m2.b) s.l(g10, null);
        }
        Collections.sort(g10, new a4.d(26));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) g10.get(0)).f16414c;
        int i12 = 0;
        while (true) {
            if (i12 >= g10.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) g10.get(i12);
            if (i11 != bVar2.f16414c) {
                if (arrayList.size() == 1) {
                    return (m2.b) g10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f16413b, Integer.valueOf(bVar2.d)));
                i12++;
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = g10.subList(0, arrayList.size());
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
    public z3.d a(int i10, int i11, byte[] bArr) {
        return r4.c.a(this, bArr, i11);
    }

    public void b(Object obj, v vVar, p1 p1Var, b1 b1Var) {
        synchronized (this.f44760a) {
            try {
                v q6 = q(obj);
                if (q6 == null) {
                    ((a0.f) this.f44761b).put(obj, vVar);
                    ?? obj2 = new Object();
                    obj2.f6497c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.f44762c).put(vVar, new m4.h(obj, obj2, p1Var, b1Var));
                } else {
                    m4.h hVar = (m4.h) ((a0.f) this.f44762c).get(q6);
                    hVar.getClass();
                    hVar.d = p1Var;
                    hVar.e = b1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public int c() {
        return 2;
    }

    public void d(v vVar, int i10, m4.g gVar) {
        synchronized (this.f44760a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f44762c).get(vVar);
                if (hVar != null) {
                    b1 b1Var = hVar.f16546g;
                    b1Var.getClass();
                    t tVar = new t();
                    tVar.c(b1Var.f3700a);
                    tVar.b(i10);
                    hVar.f16546g = new b1(tVar.d());
                    hVar.f16544c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void f(byte[] bArr, int i10, int i11, z3.l lVar, j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int A;
        int i15;
        int i16;
        int D;
        c4.a aVar = (c4.a) this.f44762c;
        x xVar = (x) this.f44761b;
        x xVar2 = (x) this.f44760a;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (m0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.f8293c, xVar.f8291a);
        }
        int i17 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f4689b;
        x xVar3 = aVar.f4688a;
        aVar.e = 0;
        aVar.f4691f = 0;
        aVar.f4692g = 0;
        aVar.h = 0;
        aVar.f4693i = 0;
        xVar3.K(0);
        aVar.f4690c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i18 = xVar2.f8293c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i19 = xVar2.f8292b + H;
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
                                aVar.f4690c = true;
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
                                        aVar.f4693i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i22 = H - 11;
                                    }
                                }
                                int i23 = xVar3.f8292b;
                                int i24 = xVar3.f8293c;
                                if (i23 < i24 && i22 > 0) {
                                    int min = Math.min(i22, i24 - i23);
                                    xVar2.k(i23, min, xVar3.f8291a);
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
                                aVar.f4691f = xVar2.H();
                                aVar.f4692g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.e != 0 && aVar.h != 0 && aVar.f4693i != 0 && (i13 = xVar3.f8293c) != 0 && xVar3.f8292b == i13 && aVar.f4690c) {
                        xVar3.N(0);
                        int i25 = aVar.h * aVar.f4693i;
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
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f4693i, Bitmap.Config.ARGB_8888);
                        float f7 = aVar.d;
                        float f10 = aVar.e;
                        bVar = new d2.b(null, null, null, createBitmap, aVar.f4692g / f10, 0, 0, aVar.f4691f / f7, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f7, aVar.f4693i / f10, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i12 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f4691f = 0;
                    aVar.f4692g = 0;
                    aVar.h = 0;
                    aVar.f4693i = 0;
                    xVar3.K(0);
                    aVar.f4690c = false;
                }
                xVar2.N(i19);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i17 = i12;
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public ArrayList g(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f44760a;
        F(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f44761b;
        F(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.f16413b) && !hashMap2.containsKey(Integer.valueOf(bVar.f16414c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override
    public Object mo27get() {
        return new com.google.firebase.messaging.r((Executor) ((hd.a) this.f44760a).mo27get(), (s5.d) ((hd.a) this.f44761b).mo27get(), (g3) ((g3) this.f44762c).mo27get(), (t5.c) ((hd.a) this.d).mo27get(), 9);
    }

    public w0 h() {
        String str;
        if (((x0) this.f44760a) == null) {
            str = " rolloutVariant";
        } else {
            str = "";
        }
        if (((String) this.f44761b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.f44762c) == null) {
            str = r4.c.u(str, " parameterValue");
        }
        if (((Long) this.d) == null) {
            str = r4.c.u(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.f44760a, (String) this.f44761b, (String) this.f44762c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void i(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            v(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String j(String str) {
        ArrayList arrayList = (ArrayList) this.f44760a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f44761b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                i(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    public void k(d dVar) {
        if (((d) this.f44761b) != dVar) {
            return;
        }
        b bVar = (b) this.f44762c;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.f44762c = null;
        }
        b bVar2 = (b) this.d;
        if (bVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.d = null;
        }
        synchronized (i.f44768y) {
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
        this.f44761b = null;
        dVar.f44759c.run(-1L);
        D();
    }

    public void l(m4.h hVar) {
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (f0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.g gVar = (m4.g) hVar.f16544c.poll();
                if (gVar == null) {
                    hVar.f16545f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.h hVar2 = hVar;
                m0.W(f0Var.f16526l, new hi.t(f0Var, q(hVar.f16542a), new t0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 18)));
                atomicBoolean2.set(false);
                hVar = hVar2;
            }
        }
    }

    public void m(final v vVar) {
        synchronized (this.f44760a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f44762c).get(vVar);
                if (hVar == null) {
                    return;
                }
                final b1 b1Var = hVar.f16546g;
                hVar.f16546g = b1.f3698b;
                hVar.f16544c.add(new m4.g(vVar, b1Var) {
                    public final v f16517b;

                    @Override
                    public final j9.y run() {
                        f0 f0Var = (f0) ((WeakReference) qi.e.this.d).get();
                        if (f0Var != null) {
                            f0Var.p(this.f16517b);
                        }
                        return j9.w.f14361b;
                    }
                });
                if (hVar.f16545f) {
                    return;
                }
                hVar.f16545f = true;
                l(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e n(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f44762c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f14529b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f44761b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public b1 o(v vVar) {
        synchronized (this.f44760a) {
            try {
                m4.h hVar = (m4.h) ((a0.f) this.f44762c).get(vVar);
                if (hVar != null) {
                    return hVar.e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n0 p() {
        n0 u10;
        synchronized (this.f44760a) {
            u10 = n0.u(((a0.f) this.f44761b).values());
        }
        return u10;
    }

    public v q(Object obj) {
        v vVar;
        synchronized (this.f44760a) {
            vVar = (v) ((a0.f) this.f44761b).get(obj);
        }
        return vVar;
    }

    public y0 r(v vVar) {
        synchronized (this.f44760a) {
            try {
                return ((m4.h) ((a0.f) this.f44762c).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m4.k1 s(v vVar) {
        synchronized (this.f44760a) {
            try {
                if (((m4.h) ((a0.f) this.f44762c).get(vVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u t(v vVar) {
        m4.h hVar;
        synchronized (this.f44760a) {
            hVar = (m4.h) ((a0.f) this.f44762c).get(vVar);
        }
        if (hVar != null) {
            return hVar.f16543b;
        }
        return null;
    }

    public void u(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: qi.e.u(int, java.lang.String, java.util.HashMap):void");
    }

    public void v(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = w91.f32014x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = w91.f32015y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            u(i10, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public boolean w(v vVar) {
        boolean z10;
        synchronized (this.f44760a) {
            if (((a0.f) this.f44762c).get(vVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean x(v vVar, int i10) {
        m4.h hVar;
        synchronized (this.f44760a) {
            hVar = (m4.h) ((a0.f) this.f44762c).get(vVar);
        }
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (hVar != null && hVar.e.a(i10) && f0Var != null && f0Var.f16534t.s().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean y(v vVar, int i10) {
        m4.h hVar;
        boolean z10;
        synchronized (this.f44760a) {
            hVar = (m4.h) ((a0.f) this.f44762c).get(vVar);
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
            for (o1 o1Var : p1Var.f16678a) {
                if (o1Var.f16656a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean z(v vVar, o1 o1Var) {
        m4.h hVar;
        synchronized (this.f44760a) {
            hVar = (m4.h) ((a0.f) this.f44762c).get(vVar);
        }
        if (hVar != null) {
            e9.y0 y0Var = hVar.d.f16678a;
            o1Var.getClass();
            if (y0Var.contains(o1Var) || m4.d.j(o1Var.f16657b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public e(int i10) {
        switch (i10) {
            case 2:
                this.f44760a = new x();
                this.f44761b = new x();
                this.f44762c = new c4.a();
                return;
            case 5:
                Random random = new Random();
                this.f44762c = new HashMap();
                this.d = random;
                this.f44760a = new HashMap();
                this.f44761b = new HashMap();
                return;
            default:
                this.f44760a = new ArrayDeque();
                return;
        }
    }

    public e(f0 f0Var) {
        this.f44761b = new l(0);
        this.f44762c = new l(0);
        this.f44760a = new Object();
        this.d = new WeakReference(f0Var);
    }

    public e(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.d = typeface;
        this.f44760a = bVar;
        this.f44762c = new androidx.emoji2.text.s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.f43919a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f44761b = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.f43919a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            o oVar = new o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.f43919a) : 0, (char[]) this.f44761b, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.f43919a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.f44762c;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.f43919a;
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
        this.f44760a = new ArrayList();
        this.f44762c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f44761b = str;
    }

    public e(x1 x1Var, f2.k kVar, qf.b bVar, f2.k kVar2) {
        Object obj;
        if (x1Var != null) {
            obj = n0.u(x1Var);
        } else {
            l0 l0Var = n0.f8474b;
            obj = x1.e;
        }
        this.f44760a = obj;
        this.f44761b = kVar;
        this.f44762c = bVar;
        this.d = kVar2;
    }
}
