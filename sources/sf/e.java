package sf;

import a0.k;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h5.d0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import k7.c6;
import k9.t0;
import k9.z0;
import l.b0;
import l.l;
import l.s;
import ld.e0;
import o3.m;
import o4.r;
import o4.v;
import o4.v0;
import o4.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.t5;
import q5.g0;
public final class e implements a3.b, z, m {
    public static volatile e f47313f;
    public final int f47314a;
    public Object f47315b;
    public Object f47316c;
    public Object d;
    public Object f47317e;

    public static final Message l(e eVar, ArrayList arrayList, int i10) {
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

    public boolean A(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f47315b).onActionItemClicked(s(aVar), new s((Context) this.f47316c, (l0.a) menuItem));
    }

    public boolean B(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f47315b;
        k.e s6 = s(aVar);
        k kVar = (k) this.f47317e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.f47316c, (l) menu);
            kVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(s6, menu2);
    }

    public ne.f C(String str) {
        if (str != null) {
            ke.e eVar = new ke.e((ArrayList) this.f47315b, (oe.b) this.d, (ArrayList) this.f47316c);
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
                eVar.i(str.substring(i10, i11));
                i10 = i11 + 1;
                if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                    i10 = i11 + 2;
                }
            }
            if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
                eVar.i(str.substring(i10));
            }
            eVar.f(eVar.f11130n);
            oe.a w10 = eVar.f11126j.w(new f7.b(22, eVar.f11127k, eVar.f11129m));
            for (pe.a aVar : eVar.f11131o) {
                aVar.g(w10);
            }
            ne.f fVar = (ne.f) eVar.f11128l.f11116b;
            Iterator it = ((ArrayList) this.f47317e).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public void D() {
        if (((d) this.f47316c) == null) {
            d dVar = (d) ((ArrayDeque) this.f47315b).pollFirst();
            this.f47316c = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.d = bVar;
                AndroidUtilities.runOnUIThread(bVar, 10000L);
                a aVar = dVar.f47311b;
                String str = aVar.f47301b;
                String str2 = aVar.f47304f;
                c cVar = new c(this, dVar);
                String i10 = j.i(str);
                byte[] d = j.d(str2);
                int i11 = 0;
                if (!TextUtils.isEmpty(i10) && d != null && j.h()) {
                    synchronized (j.f47326t) {
                        j jVar = j.v;
                        if (jVar != null) {
                            jVar.m();
                            j.v = null;
                        }
                        try {
                            j jVar2 = new j(i10, str2, d);
                            j.v = jVar2;
                            jVar2.f47344s = cVar;
                            h10 h10Var = h10.getInstance();
                            if (h10Var != null) {
                                h10Var.addListener(jVar2);
                            }
                            jVar2.h.execute(new f(jVar2, 2));
                            AndroidUtilities.runOnUIThread(new f(jVar2, 1));
                            i11 = j.v.f47333g.getLocalPort();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            j jVar3 = j.v;
                            if (jVar3 != null) {
                                jVar3.m();
                                j.v = null;
                            }
                        }
                    }
                }
                dVar.d = i11;
                if (i11 == 0) {
                    p(dVar);
                }
            }
        }
    }

    public void E(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.d;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void F(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.j.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((uc.h) this.f47315b), new k1.c(this, arrayList, null, 5));
    }

    public Bundle G(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public Task H(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.f47316c).continueWith((Executor) this.f47315b, new o5.i(callable, 16));
            this.f47316c = continueWith.continueWith((Executor) this.f47315b, new ab.a(9));
        }
        return continueWith;
    }

    public Task I(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.f47316c).continueWithTask((Executor) this.f47315b, new o5.i(callable, 16));
            this.f47316c = continueWithTask.continueWith((Executor) this.f47315b, new ab.a(9));
        }
        return continueWithTask;
    }

    @Override
    public void a(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47316c).q(jVar, z(rVar));
        }
    }

    @Override
    public void b(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).a();
        }
    }

    @Override
    public void c(int i10, v vVar, int i11) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).c(i11);
        }
    }

    @Override
    public void d(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47316c).o(jVar, z(rVar));
        }
    }

    @Override
    public void e(int i10, v vVar, Exception exc) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).d(exc);
        }
    }

    @Override
    public void f(int i10, v vVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47316c).i(z(rVar));
        }
    }

    @Override
    public void g(int i10, v vVar, o4.j jVar, r rVar, IOException iOException, boolean z4) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47316c).t(jVar, z(rVar), iOException, z4);
        }
    }

    @Override
    public Object mo38get() {
        ?? obj = new Object();
        obj.f4080a = (Executor) ((rc.a) this.f47315b).mo38get();
        obj.f4081b = (f3.d) ((rc.a) this.f47316c).mo38get();
        obj.f4082c = (androidx.biometric.e) ((androidx.biometric.e) this.d).mo38get();
        obj.d = (g3.c) ((rc.a) this.f47317e).mo38get();
        return obj;
    }

    @Override
    public void h(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47316c).v(jVar, z(rVar));
        }
    }

    @Override
    public void i(int i10, v vVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47316c).B(z(rVar));
        }
    }

    @Override
    public void j(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).b();
        }
    }

    @Override
    public void k(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((o3.l) this.d).e();
        }
    }

    public void m(androidx.fragment.app.s sVar) {
        if (!((ArrayList) this.f47315b).contains(sVar)) {
            synchronized (((ArrayList) this.f47315b)) {
                ((ArrayList) this.f47315b).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public t0 n() {
        String str;
        if (((String) this.f47315b) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f47316c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = w.c.e(str, " importance");
        }
        if (((Boolean) this.f47317e) == null) {
            str = w.c.e(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f47315b, ((Integer) this.f47316c).intValue(), ((Integer) this.d).intValue(), ((Boolean) this.f47317e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 o() {
        String str;
        if (((Integer) this.f47315b) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f47316c) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = w.c.e(str, " buildVersion");
        }
        if (((Boolean) this.f47317e) == null) {
            str = w.c.e(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.f47315b).intValue(), (String) this.f47316c, (String) this.d, ((Boolean) this.f47317e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void p(d dVar) {
        if (((d) this.f47316c) != dVar) {
            return;
        }
        b bVar = (b) this.d;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.d = null;
        }
        b bVar2 = (b) this.f47317e;
        if (bVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar2);
            this.f47317e = null;
        }
        synchronized (j.f47326t) {
            try {
                j jVar = j.v;
                if (jVar != null) {
                    jVar.m();
                    j.v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f47316c = null;
        dVar.f47312c.run(-1L);
        D();
    }

    public androidx.fragment.app.s q(String str) {
        p0 p0Var = (p0) ((HashMap) this.f47316c).get(str);
        if (p0Var != null) {
            return p0Var.f998c;
        }
        return null;
    }

    public androidx.fragment.app.s r(String str) {
        for (p0 p0Var : ((HashMap) this.f47316c).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.f998c;
                if (!str.equals(sVar.f1024e)) {
                    sVar = sVar.I.f929c.r(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public k.e s(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.f10206b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f47316c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f47316c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f47314a) {
            case 2:
                return ((f0) this.f47317e).toString();
            default:
                return super.toString();
        }
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f47316c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.f998c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.f47315b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f47315b)) {
            arrayList = new ArrayList((ArrayList) this.f47315b);
        }
        return arrayList;
    }

    public void w(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.f998c;
        String str = sVar.f1024e;
        HashMap hashMap = (HashMap) this.f47316c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.f1024e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void x(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f47316c;
        androidx.fragment.app.s sVar = p0Var.f998c;
        if (sVar.P) {
            ((m0) this.f47317e).f(sVar);
        }
        if (hashMap.get(sVar.f1024e) == p0Var && ((p0) hashMap.put(sVar.f1024e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean y(int i10, v vVar) {
        v vVar2;
        Object obj = this.f47315b;
        v0 v0Var = (v0) this.f47317e;
        if (vVar != null) {
            v0Var.getClass();
            Void r22 = (Void) obj;
            vVar2 = v0Var.s(vVar);
            if (vVar2 == null) {
                return false;
            }
        } else {
            vVar2 = null;
        }
        v0Var.getClass();
        Void r02 = (Void) obj;
        b4.e0 e0Var = (b4.e0) this.f47316c;
        if (e0Var.f1474b != i10 || !d0.a((v) e0Var.f1475c, vVar2)) {
            this.f47316c = new b4.e0((CopyOnWriteArrayList) v0Var.f16430c.d, i10, vVar2);
        }
        o3.l lVar = (o3.l) this.d;
        if (lVar.f16410a != i10 || !d0.a(lVar.f16411b, vVar2)) {
            this.d = new o3.l(v0Var.d.f16412c, i10, vVar2);
            return true;
        }
        return true;
    }

    public r z(r rVar) {
        v0 v0Var = (v0) this.f47317e;
        Object obj = this.f47315b;
        long j10 = rVar.f16557f;
        v0Var.t(obj, j10);
        long j11 = rVar.f16558g;
        v0Var.t(obj, j11);
        if (j10 == j10 && j11 == j11) {
            return rVar;
        }
        return new r(rVar.f16553a, rVar.f16554b, rVar.f16555c, rVar.d, rVar.f16556e, j10, j11);
    }

    public e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f47314a = i10;
        this.f47315b = obj;
        this.f47316c = obj2;
        this.d = obj3;
        this.f47317e = obj4;
    }

    public e(c5.j jVar) {
        this.f47314a = 10;
        LinkedHashSet linkedHashSet = ke.e.f11117p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) jVar.f2315a);
        for (Class cls : (LinkedHashSet) jVar.d) {
            arrayList.add(ke.e.f11118q.get(cls));
        }
        this.f47315b = arrayList;
        oe.b bVar = (g0) jVar.f2318e;
        bVar = bVar == null ? new db.a(14) : bVar;
        this.d = bVar;
        this.f47317e = (ArrayList) jVar.f2317c;
        ArrayList arrayList2 = (ArrayList) jVar.f2316b;
        this.f47316c = arrayList2;
        bVar.w(new f7.b(22, arrayList2, Collections.EMPTY_MAP));
    }

    public e(uc.h hVar) {
        this.f47314a = 8;
        this.f47315b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.f47317e = new jf.a(this, 1);
    }

    public e(ExecutorService executorService) {
        this.f47314a = 4;
        this.f47316c = Tasks.forResult(null);
        this.d = new Object();
        this.f47317e = new ThreadLocal();
        this.f47315b = executorService;
        executorService.execute(new androidx.activity.i(this, 24));
    }

    public e(int i10) {
        this.f47314a = i10;
        switch (i10) {
            case 1:
                this.f47315b = new ArrayList();
                this.f47316c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f47315b = new ArrayDeque();
                return;
        }
    }

    public e(f0 f0Var, Object obj, Object obj2, Object[] objArr) {
        this.f47314a = 2;
        this.f47317e = f0Var;
        this.f47315b = obj;
        this.f47316c = obj2;
        this.d = objArr;
    }

    public e(Context context, ActionMode.Callback callback) {
        this.f47314a = 5;
        this.f47316c = context;
        this.f47315b = callback;
        this.d = new ArrayList();
        this.f47317e = new k(0);
    }

    public e(v0 v0Var, Object obj) {
        this.f47314a = 9;
        this.f47317e = v0Var;
        this.f47316c = v0Var.a(null);
        this.d = new o3.l(v0Var.d.f16412c, 0, null);
        this.f47315b = obj;
    }

    public e(yf.e eVar) {
        this.f47314a = 13;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.f47317e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.B) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.f47316c = textView2;
        linearLayout.addView(textView2, c6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        t5 t5Var = new t5(eVar.getContext());
        this.f47315b = t5Var;
        linearLayout.addView(t5Var, c6.n(-1, -2));
        textView2.setGravity(8388611);
        t5Var.setGravity(8388613);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }
}
