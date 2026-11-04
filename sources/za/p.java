package za;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import db.x0;
import g9.i0;
import g9.s1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.cs;
import org.telegram.messenger.ds;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.ge;
import org.telegram.ui.tx0;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.c1;
import org.telegram.ui.wm;
import org.telegram.ui.zx0;
import vg.v0;
public final class p implements fb.b, ds, zx0 {
    public static p f60310e;
    public Object f60311a;
    public Object f60312b;
    public Object f60313c;
    public Object d;

    public p(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f60311a = obj;
        this.f60312b = obj2;
        this.f60313c = obj3;
        this.d = obj4;
    }

    public static void e(String str, String str2, HashMap hashMap) {
        c1 c1Var = new c1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i3 = 0; i3 < split.length; i3++) {
            String trim = split[i3].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i3 != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = com.google.android.recaptcha.internal.a.j(trim3, 1, 1);
                    }
                    c1Var.f50825b.put(trim2, trim3);
                } else {
                    c1Var.f50824a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), c1Var);
    }

    public static synchronized p r() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f60310e == null) {
                    f60310e = new p(0);
                }
                pVar = f60310e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    public static void z(long j10, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hashMap.remove(arrayList.get(i3));
        }
    }

    public java.lang.Object A(hd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: za.p.A(hd.c):java.lang.Object");
    }

    public o2.b B(List list) {
        o2.b bVar;
        HashMap hashMap = (HashMap) this.f60313c;
        ArrayList h = h(list);
        if (h.size() < 2) {
            return (o2.b) g9.o.m(h, null);
        }
        Collections.sort(h, new a3.u(28));
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i10 = ((o2.b) h.get(0)).f20511c;
        int i11 = 0;
        while (true) {
            if (i11 >= h.size()) {
                break;
            }
            o2.b bVar2 = (o2.b) h.get(i11);
            if (i10 != bVar2.f20511c) {
                if (arrayList.size() == 1) {
                    return (o2.b) h.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f20510b, Integer.valueOf(bVar2.d)));
                i11++;
            }
        }
        o2.b bVar3 = (o2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = h.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < subList.size(); i13++) {
                i12 += ((o2.b) subList.get(i13)).d;
            }
            int nextInt = ((Random) this.d).nextInt(i12);
            int i14 = 0;
            while (true) {
                if (i3 < subList.size()) {
                    bVar = (o2.b) subList.get(i3);
                    i14 += bVar.d;
                    if (nextInt < i14) {
                        break;
                    }
                    i3++;
                } else {
                    bVar = (o2.b) g9.o.n(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public Bundle C(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f60313c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    @Override
    public void a() {
        a0.k kVar = (a0.k) this.f60313c;
        if (((cs) this.f60312b) == null) {
            return;
        }
        p pVar = (p) this.d;
        if (pVar != null) {
            pVar.a();
            this.d = null;
        }
        int i3 = kVar.f28b;
        for (int i10 = 0; i10 < i3; i10++) {
            hs hsVar = (hs) this.f60311a;
            cs csVar = (cs) this.f60312b;
            if (i10 >= 0) {
                if (i10 < kVar.f28b) {
                    hsVar.n(csVar, kVar.f27a[i10]);
                }
            } else {
                kVar.getClass();
            }
            StringBuilder m10 = p1.m(i10, "Index ", " must be in 0..");
            m10.append(kVar.f28b - 1);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        kVar.f28b = 0;
        this.f60311a = null;
        this.f60312b = null;
    }

    public p b(int i3) {
        if (((cs) this.f60312b) == null) {
            return this;
        }
        a0.k kVar = (a0.k) this.f60313c;
        int i10 = kVar.f28b + 1;
        int[] iArr = kVar.f27a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            kVar.f27a = copyOf;
        }
        int[] iArr2 = kVar.f27a;
        int i11 = kVar.f28b;
        iArr2[i11] = i3;
        kVar.f28b = i11 + 1;
        ((hs) this.f60311a).b((cs) this.f60312b, i3);
        return this;
    }

    public void c(androidx.fragment.app.s sVar) {
        if (!((ArrayList) this.f60311a).contains(sVar)) {
            synchronized (((ArrayList) this.f60311a)) {
                ((ArrayList) this.f60311a).add(sVar);
            }
            sVar.f1933w = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public p d(int i3) {
        if (((cs) this.f60312b) == null) {
            return this;
        }
        if (((p) this.d) == null) {
            this.d = new p(hs.e(), (cs) this.f60312b);
        }
        ((p) this.d).b(i3);
        return this;
    }

    @Override
    public void f() {
        g0.i3(new tx0((wm) this.f60311a, (Activity) this.f60312b, (e6) this.f60313c, (zi) this.d, 2), 200L);
    }

    @Override
    public void g() {
        g0.i3(new ge((wm) this.f60311a, (zi) this.d, 8), 200L);
    }

    @Override
    public Object mo5get() {
        return new db.n((n9.h) ((e.a) this.f60311a).f9205a, (gb.l) ((fb.c) this.f60312b).mo5get(), (fd.h) ((fb.c) this.f60313c).mo5get(), (x0) ((fb.c) this.d).mo5get());
    }

    public ArrayList h(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f60311a;
        z(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f60312b;
        z(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            o2.b bVar = (o2.b) list.get(i3);
            if (!hashMap.containsKey(bVar.f20510b) && !hashMap2.containsKey(Integer.valueOf(bVar.f20511c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override
    public void i() {
        wm wmVar = (wm) this.f60311a;
        wmVar.showDialog(new v0((d2) wmVar, 3, true));
    }

    public void j(String str, String[] strArr) {
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

    public java.lang.Object k(hd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: za.p.k(hd.c):java.lang.Object");
    }

    public String l(String str) {
        ArrayList arrayList = (ArrayList) this.f60312b;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f60311a);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                j(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e10) {
            arrayList.clear();
            a8.g(e10, true);
        }
        return TextUtils.join("", arrayList);
    }

    public androidx.fragment.app.s m(String str) {
        p0 p0Var = (p0) ((HashMap) this.f60312b).get(str);
        if (p0Var != null) {
            return p0Var.f1896c;
        }
        return null;
    }

    public androidx.fragment.app.s n(String str) {
        for (p0 p0Var : ((HashMap) this.f60312b).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.f1896c;
                if (!str.equals(sVar.f1922e)) {
                    sVar = sVar.M.f1828c.n(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f60312b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f60312b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.f1896c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List q() {
        ArrayList arrayList;
        if (((ArrayList) this.f60311a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f60311a)) {
            arrayList = new ArrayList((ArrayList) this.f60311a);
        }
        return arrayList;
    }

    public boolean s(Context context) {
        boolean z10;
        if (((Boolean) this.f60313c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f60313c = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f60312b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f60313c).booleanValue();
    }

    public boolean t(Context context) {
        boolean z10;
        if (((Boolean) this.f60312b) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f60312b = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f60312b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f60312b).booleanValue();
    }

    public void u(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: za.p.u(int, java.lang.String, java.util.HashMap):void");
    }

    public void v(String str, HashMap hashMap, boolean[] zArr, int i3) {
        if (i3 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = d71.f32994y0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = d71.f32995z0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            u(i3, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public void w(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.f1896c;
        String str = sVar.f1922e;
        HashMap hashMap = (HashMap) this.f60312b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.f1922e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void x(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f60312b;
        androidx.fragment.app.s sVar = p0Var.f1896c;
        if (sVar.T) {
            ((m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.f1922e) == p0Var && ((p0) hashMap.put(sVar.f1922e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public HashMap y(BufferedReader bufferedReader) {
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
                            sb2 = com.google.android.recaptcha.internal.a.l(trim3);
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

    public p(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f60312b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f60313c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f60311a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(y(bufferedReader));
        c1 c1Var = (c1) hashMap.get("content-type");
        String str = c1Var == null ? null : (String) c1Var.f50825b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            b1 b1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (b1Var != null) {
                        b1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(b1Var);
                        c1 c1Var2 = (c1) b1Var.f50818a.get("content-location");
                        hashMap2.put(c1Var2 == null ? null : c1Var2.f50824a, b1Var);
                    }
                    b1Var = new b1();
                    b1Var.f50819b = (File) this.f60311a;
                    b1Var.f50818a.putAll(y(bufferedReader));
                    b1Var.f50820c = jArr[0];
                }
            }
            if (b1Var != null && b1Var.f50820c != 0 && b1Var.d != 0) {
                arrayList.add(b1Var);
                c1 c1Var3 = (c1) b1Var.f50818a.get("content-location");
                hashMap2.put(c1Var3 != null ? c1Var3.f50824a : null, b1Var);
            }
        }
        bufferedReader.close();
    }

    public p(int i3) {
        switch (i3) {
            case 1:
                this.f60311a = new ArrayList();
                this.f60312b = new HashMap();
                this.f60313c = new HashMap();
                return;
            case 6:
                Random random = new Random();
                this.f60313c = new HashMap();
                this.d = random;
                this.f60311a = new HashMap();
                this.f60312b = new HashMap();
                return;
            default:
                this.f60311a = null;
                this.f60312b = null;
                this.f60313c = null;
                this.d = new ArrayDeque();
                return;
        }
    }

    public p(String str) {
        this.f60312b = new ArrayList();
        this.f60313c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f60311a = str;
    }

    public p(s1 s1Var, h2.i iVar, p4.q qVar, h2.i iVar2) {
        Object obj;
        if (s1Var != null) {
            obj = i0.q(s1Var);
        } else {
            g9.g0 g0Var = i0.f12083b;
            obj = s1.f12146e;
        }
        this.f60311a = obj;
        this.f60312b = iVar;
        this.f60313c = qVar;
        this.d = iVar2;
    }

    public p(hs hsVar, cs csVar) {
        ?? obj = new Object();
        obj.f27a = new int[16];
        this.f60313c = obj;
        this.f60311a = hsVar;
        this.f60312b = csVar;
    }
}
