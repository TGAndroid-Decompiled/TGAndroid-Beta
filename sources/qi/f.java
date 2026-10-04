package qi;

import a0.m;
import ai.m3;
import ai.u2;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.k0;
import androidx.fragment.app.n0;
import androidx.fragment.app.q0;
import androidx.fragment.app.s;
import b2.p;
import b2.u0;
import b2.x0;
import ci.g4;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.m0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ki.h0;
import l.k;
import m4.a0;
import m4.c1;
import m4.g1;
import m4.h1;
import m4.r;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.z91;
import org.telegram.ui.web.l1;
import org.telegram.ui.web.m1;
import y9.t0;
import zd.e0;
public final class f implements n5.b {
    public static volatile f f45533e;
    public Object f45534a;
    public Object f45535b;
    public Object f45536c;
    public Object d;

    public f(File file) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f45535b = arrayList;
        HashMap hashMap2 = new HashMap();
        this.f45536c = hashMap2;
        long[] jArr = new long[1];
        this.d = jArr;
        this.f45534a = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(J(bufferedReader));
        m1 m1Var = (m1) hashMap.get("content-type");
        String str = m1Var == null ? null : (String) m1Var.f42281b.get("boundary");
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
                        m1 m1Var2 = (m1) l1Var.f42271a.get("content-location");
                        hashMap2.put(m1Var2 == null ? null : m1Var2.f42280a, l1Var);
                    }
                    l1Var = new l1();
                    l1Var.f42272b = (File) this.f45534a;
                    l1Var.f42271a.putAll(J(bufferedReader));
                    l1Var.f42273c = jArr[0];
                }
            }
            if (l1Var != null && l1Var.f42273c != 0 && l1Var.d != 0) {
                arrayList.add(l1Var);
                m1 m1Var3 = (m1) l1Var.f42271a.get("content-location");
                hashMap2.put(m1Var3 != null ? m1Var3.f42280a : null, l1Var);
            }
        }
        bufferedReader.close();
    }

    public static final Message a(f fVar, ArrayList arrayList, int i10) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    public static void e(String str, String str2, HashMap hashMap) {
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
                        trim3 = e2.i(1, 1, trim3);
                    }
                    m1Var.f42281b.put(trim2, trim3);
                } else {
                    m1Var.f42280a = trim;
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), m1Var);
    }

    public boolean A(r rVar) {
        boolean z10;
        synchronized (this.f45534a) {
            if (((a0.f) this.f45536c).get(rVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean B(r rVar, int i10) {
        m4.e eVar;
        synchronized (this.f45534a) {
            eVar = (m4.e) ((a0.f) this.f45536c).get(rVar);
        }
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (eVar != null && eVar.f16125e.a(i10) && a0Var != null && a0Var.f16057t.t().a(i10)) {
            return true;
        }
        return false;
    }

    public boolean C(r rVar, int i10) {
        m4.e eVar;
        boolean z10;
        synchronized (this.f45534a) {
            eVar = (m4.e) ((a0.f) this.f45536c).get(rVar);
        }
        if (eVar != null) {
            h1 h1Var = eVar.d;
            h1Var.getClass();
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Use contains(Command) for custom command", z10);
            for (g1 g1Var : h1Var.f16181a) {
                if (g1Var.f16175a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean D(r rVar, g1 g1Var) {
        m4.e eVar;
        synchronized (this.f45534a) {
            eVar = (m4.e) ((a0.f) this.f45536c).get(rVar);
        }
        if (eVar != null) {
            m0 m0Var = eVar.d.f16181a;
            g1Var.getClass();
            if (m0Var.contains(g1Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void E(q0 q0Var) {
        s sVar = q0Var.f2690c;
        String str = sVar.f2715e;
        HashMap hashMap = (HashMap) this.f45535b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.f2715e, q0Var);
        if (k0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void F(q0 q0Var) {
        HashMap hashMap = (HashMap) this.f45535b;
        s sVar = q0Var.f2690c;
        if (sVar.S) {
            ((n0) this.d).f(sVar);
        }
        if (hashMap.get(sVar.f2715e) == q0Var && ((q0) hashMap.put(sVar.f2715e, null)) != null && k0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean G(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f45534a).onActionItemClicked(o(aVar), new l.r((Context) this.f45535b, (l0.a) menuItem));
    }

    public boolean H(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f45534a;
        k.e o9 = o(aVar);
        m mVar = (m) this.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) this.f45535b, (k) menu);
            mVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(o9, menu2);
    }

    public bf.f I(String str) {
        if (str != null) {
            ye.d dVar = new ye.d((ArrayList) this.f45534a, (cf.b) this.f45536c, (ArrayList) this.f45535b);
            int i10 = 0;
            while (true) {
                int length = str.length();
                int i11 = i10;
                while (true) {
                    if (i11 < length) {
                        char charAt = str.charAt(i11);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    break;
                }
                dVar.i(str.substring(i10, i11));
                i10 = i11 + 1;
                if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                    i10 = i11 + 2;
                }
            }
            if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
                dVar.i(str.substring(i10));
            }
            dVar.f(dVar.f50886n);
            cf.a F1 = dVar.f50882j.F1(new z0(27, dVar.f50883k, dVar.f50885m));
            for (df.a aVar : dVar.f50887o) {
                aVar.g(F1);
            }
            bf.f fVar = (bf.f) dVar.f50884l.f50872b;
            Iterator it = ((ArrayList) this.d).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            throw a4.a.k(it);
        }
        throw new NullPointerException("input must not be null");
    }

    public HashMap J(BufferedReader bufferedReader) {
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
                            sb2 = a4.a.v(trim3);
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

    public void K() {
        boolean z10;
        if (((e) this.f45535b) == null) {
            e eVar = (e) ((ArrayDeque) this.f45534a).pollFirst();
            this.f45535b = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.f45536c = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f45531b;
                String str = bVar.f45521b;
                String str2 = bVar.f45524f;
                d dVar = new d(this, eVar);
                la.h i10 = j.i(str);
                byte[] d = j.d(str2);
                int i11 = 0;
                if (i10 != null && d != null) {
                    try {
                        z10 = o.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (j.f45543y) {
                            j jVar = j.A;
                            if (jVar != null) {
                                jVar.o();
                                j.A = null;
                            }
                            try {
                                j jVar2 = new j(i10, str2, d);
                                j.A = jVar2;
                                jVar2.f45565x = dVar;
                                j10 j10Var = j10.getInstance();
                                if (j10Var != null) {
                                    j10Var.addListener(jVar2);
                                }
                                jVar2.f45552j.execute(new g(jVar2, 1));
                                AndroidUtilities.runOnUIThread(new g(jVar2, 2));
                                i11 = j.A.f45551i.getLocalPort();
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
                eVar.d = i11;
                if (i11 == 0) {
                    j(eVar);
                }
            }
        }
    }

    public void L(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f45536c;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void M(r rVar) {
        synchronized (this.f45534a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f45536c).remove(rVar);
                if (eVar == null) {
                    return;
                }
                ((a0.f) this.f45535b).remove(eVar.f16122a);
                eVar.f16123b.g();
                a0 a0Var = (a0) ((WeakReference) this.d).get();
                if (a0Var != null && !a0Var.j()) {
                    d0.U(a0Var.f16049l, new m4.b(a0Var, rVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void N(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f45536c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((id.h) this.f45534a), new bb.i(this, arrayList, null, 6));
    }

    public Bundle O(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f45536c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public void P(View view) {
        u2 u2Var = (u2) this.d;
        if (((View) this.f45535b) == view) {
            return;
        }
        Q(null);
        View view2 = (View) this.f45535b;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(u2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(u2Var);
            if (view.isAttachedToWindow()) {
                Q(view.getViewTreeObserver());
            }
        }
        this.f45535b = view;
    }

    public void Q(ViewTreeObserver viewTreeObserver) {
        g4 g4Var = (g4) this.f45534a;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f45536c;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.f45536c).removeOnGlobalLayoutListener(g4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(g4Var);
        }
        this.f45536c = viewTreeObserver;
    }

    public void b(Object obj, r rVar, h1 h1Var, x0 x0Var) {
        synchronized (this.f45534a) {
            try {
                r t10 = t(obj);
                if (t10 == null) {
                    ((a0.f) this.f45535b).put(obj, rVar);
                    ?? obj2 = new Object();
                    obj2.f6644c = new Object();
                    obj2.d = new m(0);
                    ((a0.f) this.f45536c).put(rVar, new m4.e(obj, obj2, h1Var, x0Var));
                } else {
                    m4.e eVar = (m4.e) ((a0.f) this.f45536c).get(t10);
                    e2.d.h(eVar);
                    eVar.d = h1Var;
                    eVar.f16125e = x0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(s sVar) {
        if (!((ArrayList) this.f45534a).contains(sVar)) {
            synchronized (((ArrayList) this.f45534a)) {
                ((ArrayList) this.f45534a).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public void d(r rVar, int i10, m4.d dVar) {
        synchronized (this.f45534a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f45536c).get(rVar);
                if (eVar != null) {
                    x0 x0Var = eVar.f16127g;
                    x0Var.getClass();
                    p pVar = new p();
                    pVar.c(x0Var.f3607a);
                    pVar.b(i10);
                    eVar.f16127g = new x0(pVar.d());
                    eVar.f16124c.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0 f() {
        String str;
        if (((String) this.f45534a) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f45535b) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.f45536c) == null) {
            str = sa.e.v(str, " importance");
        }
        if (((Boolean) this.d) == null) {
            str = sa.e.v(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f45534a, ((Integer) this.f45535b).intValue(), ((Integer) this.f45536c).intValue(), ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public y9.z0 g() {
        String str;
        if (((Integer) this.f45534a) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f45535b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.f45536c) == null) {
            str = sa.e.v(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = sa.e.v(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new y9.z0(((Integer) this.f45534a).intValue(), (String) this.f45535b, (String) this.f45536c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public Object mo28get() {
        return new com.google.firebase.messaging.s((Executor) ((fd.a) this.f45534a).mo28get(), (s5.d) ((fd.a) this.f45535b).mo28get(), (la.h) ((la.h) this.f45536c).mo28get(), (t5.c) ((fd.a) this.d).mo28get(), 9);
    }

    public void h(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            z(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String i(String str) {
        ArrayList arrayList = (ArrayList) this.f45534a;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.f45535b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                h(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e7) {
            arrayList.clear();
            FileLog.e(e7);
        }
        return TextUtils.join("", arrayList);
    }

    public void j(e eVar) {
        if (((e) this.f45535b) != eVar) {
            return;
        }
        c cVar = (c) this.f45536c;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.f45536c = null;
        }
        c cVar2 = (c) this.d;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.d = null;
        }
        synchronized (j.f45543y) {
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
        this.f45535b = null;
        eVar.f45532c.run(-1L);
        K();
    }

    public s k(String str) {
        q0 q0Var = (q0) ((HashMap) this.f45535b).get(str);
        if (q0Var != null) {
            return q0Var.f2690c;
        }
        return null;
    }

    public s l(String str) {
        for (q0 q0Var : ((HashMap) this.f45535b).values()) {
            if (q0Var != null) {
                s sVar = q0Var.f2690c;
                if (!str.equals(sVar.f2715e)) {
                    sVar = sVar.L.f2620c.l(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public void m(m4.e eVar) {
        a0 a0Var = (a0) ((WeakReference) this.d).get();
        if (a0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                m4.d dVar = (m4.d) eVar.f16124c.poll();
                if (dVar == null) {
                    eVar.f16126f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                m4.e eVar2 = eVar;
                d0.U(a0Var.f16049l, new h0(a0Var, t(eVar.f16122a), new m3(this, dVar, atomicBoolean2, eVar2, atomicBoolean, 10)));
                atomicBoolean2.set(false);
                eVar = eVar2;
            }
        }
    }

    public void n(final r rVar) {
        synchronized (this.f45534a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f45536c).get(rVar);
                if (eVar == null) {
                    return;
                }
                final x0 x0Var = eVar.f16127g;
                eVar.f16127g = x0.f3605b;
                eVar.f16124c.add(new m4.d(rVar, x0Var) {
                    public final r f16075b;

                    @Override
                    public final i9.w run() {
                        a0 a0Var = (a0) ((WeakReference) qi.f.this.d).get();
                        if (a0Var != null) {
                            a0Var.p(this.f16075b);
                        }
                        return i9.u.f12030b;
                    }
                });
                if (eVar.f16126f) {
                    return;
                }
                eVar.f16126f = true;
                m(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e o(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.f45536c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f14248b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f45535b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f45535b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f45535b).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.f2690c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x0 r(r rVar) {
        synchronized (this.f45534a) {
            try {
                m4.e eVar = (m4.e) ((a0.f) this.f45536c).get(rVar);
                if (eVar != null) {
                    return eVar.f16125e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 s() {
        i0 v;
        synchronized (this.f45534a) {
            v = i0.v(((a0.f) this.f45535b).values());
        }
        return v;
    }

    public r t(Object obj) {
        r rVar;
        synchronized (this.f45534a) {
            rVar = (r) ((a0.f) this.f45535b).get(obj);
        }
        return rVar;
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.f45534a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f45534a)) {
            arrayList = new ArrayList((ArrayList) this.f45534a);
        }
        return arrayList;
    }

    public u0 v(r rVar) {
        synchronized (this.f45534a) {
            try {
                return ((m4.e) ((a0.f) this.f45536c).get(rVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c1 w(r rVar) {
        synchronized (this.f45534a) {
            try {
                if (((m4.e) ((a0.f) this.f45536c).get(rVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v x(r rVar) {
        m4.e eVar;
        synchronized (this.f45534a) {
            eVar = (m4.e) ((a0.f) this.f45536c).get(rVar);
        }
        if (eVar != null) {
            return eVar.f16123b;
        }
        return null;
    }

    public void y(int r12, java.lang.String r13, java.util.HashMap r14) {
        throw new UnsupportedOperationException("Method not decompiled: qi.f.y(int, java.lang.String, java.util.HashMap):void");
    }

    public void z(String str, HashMap hashMap, boolean[] zArr, int i10) {
        if (i10 >= 0) {
            zArr[0] = false;
            String trim = str.trim();
            Matcher matcher = z91.f33443x0.matcher(trim);
            if (matcher.find()) {
                trim = trim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = z91.f33444y0.matcher(trim);
                if (matcher2.find()) {
                    trim = trim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            y(i10, trim, hashMap);
            return;
        }
        throw new Exception("recursion limit reached");
    }

    public f(int i10) {
        switch (i10) {
            case 1:
                this.f45534a = new ArrayList();
                this.f45535b = new HashMap();
                this.f45536c = new HashMap();
                return;
            default:
                this.f45534a = new ArrayDeque();
                return;
        }
    }

    public f(a0 a0Var) {
        this.f45535b = new m(0);
        this.f45536c = new m(0);
        this.f45534a = new Object();
        this.d = new WeakReference(a0Var);
    }

    public f(String str) {
        this.f45534a = new ArrayList();
        this.f45536c = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.d = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.f45535b = str;
    }

    public f(a1 a1Var, f2.i iVar, of.b bVar, f2.i iVar2) {
        Object obj;
        if (a1Var != null) {
            obj = i0.v(a1Var);
        } else {
            g0 g0Var = i0.f8758b;
            obj = a1.f8721e;
        }
        this.f45534a = obj;
        this.f45535b = iVar;
        this.f45536c = bVar;
        this.d = iVar2;
    }
}
