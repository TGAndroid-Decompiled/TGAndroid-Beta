package xa;

import ag.e3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import b2.b1;
import b2.y0;
import c3.i0;
import com.google.android.gms.tasks.Task;
import e2.l0;
import e9.n0;
import e9.x1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import kg.i1;
import l.b0;
import m4.f0;
import m4.l1;
import m4.p1;
import m4.q1;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.vs;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.m81;
import org.telegram.ui.rz0;
import org.telegram.ui.ue;
import org.telegram.ui.un;
import org.telegram.ui.web.e1;
import org.telegram.ui.web.f1;
import org.telegram.ui.xz0;
import v7.t6;
import z9.t0;
import z9.z0;
public final class n implements z3.m, vs, xz0, n5.b {
    public static n e;
    public Object f53554a;
    public Object f53555b;
    public Object f53556c;
    public Object d;

    public n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f53554a = obj;
        this.f53555b = obj2;
        this.f53556c = obj3;
        this.d = obj4;
    }

    public static synchronized n D() {
        n nVar;
        synchronized (n.class) {
            try {
                if (e == null) {
                    e = new n(0);
                }
                nVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    public static void V(long j10, HashMap hashMap) {
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

    public static void j(String str, String str2, HashMap hashMap) {
        f1 f1Var = new f1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i10 != 0 && indexOf >= 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = i0.m(1, 1, trim3);
                    }
                    f1Var.f43032b.put(trim2, trim3);
                } else {
                    f1Var.f43031a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), f1Var);
    }

    public n0 A() {
        n0 u10;
        synchronized (this.f53554a) {
            u10 = n0.u(((a0.f) this.f53555b).values());
        }
        return u10;
    }

    public m4.w B(Object obj) {
        m4.w wVar;
        synchronized (this.f53554a) {
            wVar = (m4.w) ((a0.f) this.f53555b).get(obj);
        }
        return wVar;
    }

    public List C() {
        ArrayList arrayList;
        if (((ArrayList) this.f53554a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f53554a)) {
            arrayList = new ArrayList((ArrayList) this.f53554a);
        }
        return arrayList;
    }

    public y0 E(m4.w wVar) {
        synchronized (this.f53554a) {
            try {
                return ((m4.i) ((a0.f) this.f53556c).get(wVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l1 F(m4.w wVar) {
        synchronized (this.f53554a) {
            try {
                if (((m4.i) ((a0.f) this.f53556c).get(wVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.v G(m4.w wVar) {
        m4.i iVar;
        synchronized (this.f53554a) {
            iVar = (m4.i) ((a0.f) this.f53556c).get(wVar);
        }
        if (iVar != null) {
            return iVar.f12768b;
        }
        return null;
    }

    public boolean H(Context context) {
        boolean z10;
        if (((Boolean) this.f53556c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f53556c = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f53555b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f53556c).booleanValue();
    }

    public boolean I(Context context) {
        boolean z10;
        if (((Boolean) this.f53555b) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f53555b = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f53555b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f53555b).booleanValue();
    }

    public void J(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: xa.n.J(int, java.lang.String, java.util.HashMap):void");
    }

    public void K(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = m81.f28356x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = m81.f28357y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            J(i10, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public boolean L(m4.w wVar) {
        boolean z10;
        synchronized (this.f53554a) {
            if (((a0.f) this.f53556c).get(wVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean M(m4.w wVar, int i10) {
        m4.i iVar;
        synchronized (this.f53554a) {
            iVar = (m4.i) ((a0.f) this.f53556c).get(wVar);
        }
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (iVar != null && iVar.e.a(i10) && f0Var != null && f0Var.f12754t.s().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean N(m4.w wVar, int i10) {
        m4.i iVar;
        boolean z10;
        synchronized (this.f53554a) {
            iVar = (m4.i) ((a0.f) this.f53556c).get(wVar);
        }
        if (iVar != null) {
            q1 q1Var = iVar.d;
            q1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.e("Use contains(Command) for custom command", z10);
            for (p1 p1Var : q1Var.f12903a) {
                if (p1Var.f12896a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean O(m4.w wVar, p1 p1Var) {
        m4.i iVar;
        synchronized (this.f53554a) {
            iVar = (m4.i) ((a0.f) this.f53556c).get(wVar);
        }
        if (iVar != null) {
            e9.y0 y0Var = iVar.d.f12903a;
            p1Var.getClass();
            if (y0Var.contains(p1Var) || m4.e.j(p1Var.f12897b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void P(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.f1542c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.f53555b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void Q(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f53555b;
        androidx.fragment.app.s sVar = p0Var.f1542c;
        if (sVar.S) {
            ((m0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean R(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f53554a).onActionItemClicked(v(aVar), new l.s((Context) this.f53555b, (l0.a) menuItem));
    }

    public boolean S(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f53554a;
        k.e v = v(aVar);
        a0.l lVar = (a0.l) this.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.f53555b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(v, menu2);
    }

    public HashMap T(BufferedReader bufferedReader) {
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
                            sb2 = a1.g.t(trim3);
                            str = trim2;
                        } else {
                            j(trim2, trim3, hashMap);
                        }
                    }
                }
            }
            j(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            j(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public void U(m4.w wVar) {
        synchronized (this.f53554a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f53556c).remove(wVar);
                if (iVar == null) {
                    return;
                }
                ((a0.f) this.f53555b).remove(iVar.f12767a);
                iVar.f12768b.g();
                f0 f0Var = (f0) ((WeakReference) this.d).get();
                if (f0Var != null && !f0Var.j()) {
                    l0.W(f0Var.f12746l, new m4.f(f0Var, wVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m2.b W(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.f53556c;
        ArrayList k10 = k(list);
        if (k10.size() < 2) {
            return (m2.b) e9.s.l(k10, null);
        }
        Collections.sort(k10, new a4.d(10));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) k10.get(0)).f12629c;
        int i12 = 0;
        while (true) {
            if (i12 >= k10.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) k10.get(i12);
            if (i11 != bVar2.f12629c) {
                if (arrayList.size() == 1) {
                    return (m2.b) k10.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f12628b, Integer.valueOf(bVar2.d)));
                i12++;
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = k10.subList(0, arrayList.size());
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
                    bVar = (m2.b) e9.s.m(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public Bundle X(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f53556c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public Task Y(Callable callable) {
        Task continueWith;
        synchronized (this.f53556c) {
            continueWith = ((Task) this.f53555b).continueWith((Executor) this.f53554a, new r2.y(callable, 16));
            this.f53555b = continueWith.continueWith((Executor) this.f53554a, new kb.a(26));
        }
        return continueWith;
    }

    public Task Z(Callable callable) {
        Task continueWithTask;
        synchronized (this.f53556c) {
            continueWithTask = ((Task) this.f53555b).continueWithTask((Executor) this.f53554a, new r2.y(callable, 16));
            this.f53555b = continueWithTask.continueWith((Executor) this.f53554a, new kb.a(26));
        }
        return continueWithTask;
    }

    @Override
    public void a() {
        a0.k kVar = (a0.k) this.f53556c;
        if (((us) this.f53555b) == null) {
            return;
        }
        n nVar = (n) this.d;
        if (nVar != null) {
            nVar.a();
            this.d = null;
        }
        int i10 = kVar.f24b;
        for (int i11 = 0; i11 < i10; i11++) {
            zs zsVar = (zs) this.f53554a;
            us usVar = (us) this.f53555b;
            if (i11 >= 0) {
                if (i11 < kVar.f24b) {
                    zsVar.n(usVar, kVar.f23a[i11]);
                }
            } else {
                kVar.getClass();
            }
            StringBuilder l4 = i0.a.l(i11, "Index ", " must be in 0..");
            l4.append(kVar.f24b - 1);
            throw new IndexOutOfBoundsException(l4.toString());
        }
        kVar.f24b = 0;
        this.f53554a = null;
        this.f53555b = null;
    }

    @Override
    public void b() {
        org.telegram.messenger.i0.h3(new rz0((un) this.f53554a, (Activity) this.f53555b, (p6) this.f53556c, (jj) this.d, 2), 200L);
    }

    @Override
    public void c() {
        org.telegram.messenger.i0.h3(new ue((un) this.f53554a, (jj) this.d, 8), 200L);
    }

    @Override
    public void d() {
        un unVar = (un) this.f53554a;
        unVar.showDialog(new i1((k2) unVar, 3, true));
    }

    public n e(int i10) {
        if (((us) this.f53555b) == null) {
            return this;
        }
        a0.k kVar = (a0.k) this.f53556c;
        int i11 = kVar.f24b + 1;
        int[] iArr = kVar.f23a;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            kVar.f23a = copyOf;
        }
        int[] iArr2 = kVar.f23a;
        int i12 = kVar.f24b;
        iArr2[i12] = i10;
        kVar.f24b = i12 + 1;
        ((zs) this.f53554a).b((us) this.f53555b, i10);
        return this;
    }

    public void f(Object obj, m4.w wVar, q1 q1Var, b1 b1Var) {
        synchronized (this.f53554a) {
            try {
                m4.w B = B(obj);
                if (B == null) {
                    ((a0.f) this.f53555b).put(obj, wVar);
                    ?? obj2 = new Object();
                    obj2.f4496c = new Object();
                    obj2.d = new a0.l(0);
                    ((a0.f) this.f53556c).put(wVar, new m4.i(obj, obj2, q1Var, b1Var));
                } else {
                    m4.i iVar = (m4.i) ((a0.f) this.f53556c).get(B);
                    iVar.getClass();
                    iVar.d = q1Var;
                    iVar.e = b1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(androidx.fragment.app.s sVar) {
        if (!((ArrayList) this.f53554a).contains(sVar)) {
            synchronized (((ArrayList) this.f53554a)) {
                ((ArrayList) this.f53554a).add(sVar);
            }
            sVar.f1574w = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    @Override
    public Object get() {
        return new ji.f((Executor) ((zc.a) this.f53554a).get(), (s5.d) ((zc.a) this.f53555b).get(), (q5.d) ((q5.d) this.f53556c).get(), (t5.c) ((zc.a) this.d).get(), 13);
    }

    public n h(int i10) {
        if (((us) this.f53555b) == null) {
            return this;
        }
        if (((n) this.d) == null) {
            this.d = new n(zs.e(), (us) this.f53555b);
        }
        ((n) this.d).e(i10);
        return this;
    }

    public void i(m4.w wVar, int i10, m4.h hVar) {
        synchronized (this.f53554a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f53556c).get(wVar);
                if (iVar != null) {
                    b1 b1Var = iVar.f12771g;
                    b1Var.getClass();
                    b2.u uVar = new b2.u();
                    uVar.c(b1Var.f1984a);
                    uVar.b(i10);
                    iVar.f12771g = new b1(uVar.d());
                    iVar.f12769c.add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList k(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f53554a;
        V(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f53555b;
        V(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.f12628b) && !hashMap2.containsKey(Integer.valueOf(bVar.f12629c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override
    public z3.d l(int i10, int i11, byte[] bArr) {
        return sc.e.a(this, bArr, i11);
    }

    public t0 m() {
        String str;
        if (((String) this.f53554a) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f53556c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = sc.e.A(str, " importance");
        }
        if (((Boolean) this.f53555b) == null) {
            str = sc.e.A(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0(((Integer) this.f53556c).intValue(), ((Integer) this.d).intValue(), (String) this.f53554a, ((Boolean) this.f53555b).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 n() {
        String str;
        if (((Integer) this.f53556c) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f53554a) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = sc.e.A(str, " buildVersion");
        }
        if (((Boolean) this.f53555b) == null) {
            str = sc.e.A(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.f53556c).intValue(), (String) this.f53554a, (String) this.d, ((Boolean) this.f53555b).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public int o() {
        return 2;
    }

    public void p(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            K(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String q(String str) {
        ArrayList arrayList = (ArrayList) this.f53555b;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f53554a);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                p(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            f8.g(e7, true);
        }
        return TextUtils.join("", arrayList);
    }

    public androidx.fragment.app.s r(String str) {
        p0 p0Var = (p0) ((HashMap) this.f53555b).get(str);
        if (p0Var != null) {
            return p0Var.f1542c;
        }
        return null;
    }

    public androidx.fragment.app.s s(String str) {
        for (p0 p0Var : ((HashMap) this.f53555b).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.f1542c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.L.f1478c.s(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void t(m4.i iVar) {
        f0 f0Var = (f0) ((WeakReference) this.d).get();
        if (f0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.h hVar = (m4.h) iVar.f12769c.poll();
                if (hVar == null) {
                    iVar.f12770f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.i iVar2 = iVar;
                l0.W(f0Var.f12746l, new k2.u(f0Var, B(iVar.f12767a), new e3(this, hVar, atomicBoolean2, iVar2, atomicBoolean, 3)));
                atomicBoolean2.set(false);
                iVar = iVar2;
            }
        }
    }

    public void u(final m4.w wVar) {
        synchronized (this.f53554a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f53556c).get(wVar);
                if (iVar == null) {
                    return;
                }
                final b1 b1Var = iVar.f12771g;
                iVar.f12771g = b1.f1982b;
                iVar.f12769c.add(new m4.h(wVar, b1Var) {
                    public final w f12761b;

                    @Override
                    public final j9.y run() {
                        f0 f0Var = (f0) ((WeakReference) xa.n.this.d).get();
                        if (f0Var != null) {
                            f0Var.p(this.f12761b);
                        }
                        return j9.w.f9768b;
                    }
                });
                if (iVar.f12770f) {
                    return;
                }
                iVar.f12770f = true;
                t(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e v(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f53556c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f10481b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f53555b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f53555b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList x() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f53555b).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.f1542c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public b1 y(m4.w wVar) {
        synchronized (this.f53554a) {
            try {
                m4.i iVar = (m4.i) ((a0.f) this.f53556c).get(wVar);
                if (iVar != null) {
                    return iVar.e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void z(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        d2.b bVar;
        int i12;
        int i13;
        int i14;
        int A;
        int i15;
        int i16;
        int D;
        c4.a aVar = (c4.a) this.f53556c;
        e2.x xVar = (e2.x) this.f53555b;
        e2.x xVar2 = (e2.x) this.f53554a;
        xVar2.L(i10 + i11, bArr);
        xVar2.N(i10);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        if (l0.Q(xVar2, xVar, (Inflater) this.d)) {
            xVar2.L(xVar.f6209c, xVar.f6207a);
        }
        int i17 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f3725b;
        e2.x xVar3 = aVar.f3724a;
        aVar.e = 0;
        aVar.f3727f = 0;
        aVar.f3728g = 0;
        aVar.h = 0;
        aVar.f3729i = 0;
        xVar3.K(0);
        aVar.f3726c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i18 = xVar2.f6209c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i19 = xVar2.f6208b + H;
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
                                    iArr[A3] = l0.i((int) ((A6 * 1.772d) + A4), 0, 255) | (xVar2.A() << 24) | (l0.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (l0.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8);
                                    i21++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.f3726c = true;
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
                                        aVar.f3729i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i22 = H - 11;
                                    }
                                }
                                int i23 = xVar3.f6208b;
                                int i24 = xVar3.f6209c;
                                if (i23 < i24 && i22 > 0) {
                                    int min = Math.min(i22, i24 - i23);
                                    xVar2.k(i23, min, xVar3.f6207a);
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
                                aVar.f3727f = xVar2.H();
                                aVar.f3728g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.e != 0 && aVar.h != 0 && aVar.f3729i != 0 && (i13 = xVar3.f6209c) != 0 && xVar3.f6208b == i13 && aVar.f3726c) {
                        xVar3.N(0);
                        int i25 = aVar.h * aVar.f3729i;
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
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f3729i, Bitmap.Config.ARGB_8888);
                        float f7 = aVar.d;
                        float f10 = aVar.e;
                        bVar = new d2.b(null, null, null, createBitmap, aVar.f3728g / f10, 0, 0, aVar.f3727f / f7, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f7, aVar.f3729i / f10, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i12 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f3727f = 0;
                    aVar.f3728g = 0;
                    aVar.h = 0;
                    aVar.f3729i = 0;
                    xVar3.K(0);
                    aVar.f3726c = false;
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

    public n(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f53555b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f53556c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f53554a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(T(bufferedReader));
        f1 f1Var = (f1) hashMap.get("content-type");
        String str = f1Var == null ? null : (String) f1Var.f43032b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            e1 e1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (e1Var != null) {
                        e1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(e1Var);
                        f1 f1Var2 = (f1) e1Var.f43024a.get("content-location");
                        hashMap2.put(f1Var2 == null ? null : f1Var2.f43031a, e1Var);
                    }
                    e1Var = new e1();
                    e1Var.f43025b = (File) this.f53554a;
                    e1Var.f43024a.putAll(T(bufferedReader));
                    e1Var.f43026c = jArr[0];
                }
            }
            if (e1Var != null && e1Var.f43026c != 0 && e1Var.d != 0) {
                arrayList.add(e1Var);
                f1 f1Var3 = (f1) e1Var.f43024a.get("content-location");
                hashMap2.put(f1Var3 != null ? f1Var3.f43031a : null, e1Var);
            }
        }
        bufferedReader.close();
    }

    @Override
    public void reset() {
    }

    public n(f0 f0Var) {
        this.f53555b = new a0.l(0);
        this.f53556c = new a0.l(0);
        this.f53554a = new Object();
        this.d = new WeakReference(f0Var);
    }

    public n(int i10) {
        switch (i10) {
            case 1:
                this.f53554a = new ArrayList();
                this.f53555b = new HashMap();
                this.f53556c = new HashMap();
                return;
            case 2:
                this.f53554a = new e2.x();
                this.f53555b = new e2.x();
                this.f53556c = new c4.a();
                return;
            case 3:
            case 4:
            default:
                this.f53554a = null;
                this.f53555b = null;
                this.f53556c = null;
                this.d = new ArrayDeque();
                return;
            case 5:
                Random random = new Random();
                this.f53556c = new HashMap();
                this.d = random;
                this.f53554a = new HashMap();
                this.f53555b = new HashMap();
                return;
        }
    }

    public n(String str) {
        this.f53555b = new ArrayList();
        this.f53556c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f53554a = str;
    }

    public n(x1 x1Var, f2.k kVar, n4.q qVar, f2.k kVar2) {
        Object obj;
        if (x1Var != null) {
            obj = n0.u(x1Var);
        } else {
            e9.l0 l0Var = n0.f6390b;
            obj = x1.e;
        }
        this.f53554a = obj;
        this.f53555b = kVar;
        this.f53556c = qVar;
        this.d = kVar2;
    }

    public n(zs zsVar, us usVar) {
        ?? obj = new Object();
        obj.f23a = new int[16];
        this.f53556c = obj;
        this.f53554a = zsVar;
        this.f53555b = usVar;
    }
}
