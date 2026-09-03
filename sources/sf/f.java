package sf;

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
import q5.c0;
public final class f implements a3.b, z, m {
    public static volatile f f47349f;
    public final int f47350a;
    public Object f47351b;
    public Object f47352c;
    public Object d;
    public Object f47353e;

    public static final Message l(f fVar, ArrayList arrayList, int i10) {
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
        return ((ActionMode.Callback) this.f47351b).onActionItemClicked(s(aVar), new s((Context) this.f47352c, (l0.a) menuItem));
    }

    public boolean B(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f47351b;
        k.e s6 = s(aVar);
        a0.k kVar = (a0.k) this.f47353e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) this.f47352c, (l) menu);
            kVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(s6, menu2);
    }

    public ne.f C(String str) {
        if (str != null) {
            ke.e eVar = new ke.e((ArrayList) this.f47351b, (oe.b) this.d, (ArrayList) this.f47352c);
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
            Iterator it = ((ArrayList) this.f47353e).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public void D() {
        if (((e) this.f47352c) == null) {
            e eVar = (e) ((ArrayDeque) this.f47351b).pollFirst();
            this.f47352c = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.d = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f47347b;
                String str = bVar.f47337b;
                String str2 = bVar.f47340f;
                d dVar = new d(this, eVar);
                String i10 = k.i(str);
                byte[] d = k.d(str2);
                int i11 = 0;
                if (!TextUtils.isEmpty(i10) && d != null && k.h()) {
                    synchronized (k.f47362t) {
                        k kVar = k.v;
                        if (kVar != null) {
                            kVar.m();
                            k.v = null;
                        }
                        try {
                            k kVar2 = new k(i10, str2, d);
                            k.v = kVar2;
                            kVar2.f47380s = dVar;
                            h10 h10Var = h10.getInstance();
                            if (h10Var != null) {
                                h10Var.addListener(kVar2);
                            }
                            kVar2.h.execute(new g(kVar2, 2));
                            AndroidUtilities.runOnUIThread(new g(kVar2, 1));
                            i11 = k.v.f47369g.getLocalPort();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            k kVar3 = k.v;
                            if (kVar3 != null) {
                                kVar3.m();
                                k.v = null;
                            }
                        }
                    }
                }
                eVar.d = i11;
                if (i11 == 0) {
                    p(eVar);
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
        e0.q(e0.b((uc.h) this.f47351b), new k1.c(this, arrayList, null, 5));
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
            continueWith = ((Task) this.f47352c).continueWith((Executor) this.f47351b, new o5.i(callable, 16));
            this.f47352c = continueWith.continueWith((Executor) this.f47351b, new ab.a(9));
        }
        return continueWith;
    }

    public Task I(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.f47352c).continueWithTask((Executor) this.f47351b, new o5.i(callable, 16));
            this.f47352c = continueWithTask.continueWith((Executor) this.f47351b, new ab.a(9));
        }
        return continueWithTask;
    }

    @Override
    public void a(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47352c).q(jVar, z(rVar));
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
            ((b4.e0) this.f47352c).o(jVar, z(rVar));
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
            ((b4.e0) this.f47352c).i(z(rVar));
        }
    }

    @Override
    public void g(int i10, v vVar, o4.j jVar, r rVar, IOException iOException, boolean z4) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47352c).t(jVar, z(rVar), iOException, z4);
        }
    }

    @Override
    public Object mo38get() {
        ?? obj = new Object();
        obj.f4080a = (Executor) ((rc.a) this.f47351b).mo38get();
        obj.f4081b = (f3.d) ((rc.a) this.f47352c).mo38get();
        obj.f4082c = (androidx.biometric.e) ((androidx.biometric.e) this.d).mo38get();
        obj.d = (g3.c) ((rc.a) this.f47353e).mo38get();
        return obj;
    }

    @Override
    public void h(int i10, v vVar, o4.j jVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47352c).v(jVar, z(rVar));
        }
    }

    @Override
    public void i(int i10, v vVar, r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f47352c).B(z(rVar));
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
        if (!((ArrayList) this.f47351b).contains(sVar)) {
            synchronized (((ArrayList) this.f47351b)) {
                ((ArrayList) this.f47351b).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public t0 n() {
        String str;
        if (((String) this.f47351b) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f47352c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = w.c.e(str, " importance");
        }
        if (((Boolean) this.f47353e) == null) {
            str = w.c.e(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f47351b, ((Integer) this.f47352c).intValue(), ((Integer) this.d).intValue(), ((Boolean) this.f47353e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 o() {
        String str;
        if (((Integer) this.f47351b) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f47352c) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = w.c.e(str, " buildVersion");
        }
        if (((Boolean) this.f47353e) == null) {
            str = w.c.e(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.f47351b).intValue(), (String) this.f47352c, (String) this.d, ((Boolean) this.f47353e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void p(e eVar) {
        if (((e) this.f47352c) != eVar) {
            return;
        }
        c cVar = (c) this.d;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.d = null;
        }
        c cVar2 = (c) this.f47353e;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.f47353e = null;
        }
        synchronized (k.f47362t) {
            try {
                k kVar = k.v;
                if (kVar != null) {
                    kVar.m();
                    k.v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f47352c = null;
        eVar.f47348c.run(-1L);
        D();
    }

    public androidx.fragment.app.s q(String str) {
        p0 p0Var = (p0) ((HashMap) this.f47352c).get(str);
        if (p0Var != null) {
            return p0Var.f998c;
        }
        return null;
    }

    public androidx.fragment.app.s r(String str) {
        for (p0 p0Var : ((HashMap) this.f47352c).values()) {
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
        k.e eVar2 = new k.e((Context) this.f47352c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f47352c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f47350a) {
            case 2:
                return ((f0) this.f47353e).toString();
            default:
                return super.toString();
        }
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f47352c).values()) {
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
        if (((ArrayList) this.f47351b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f47351b)) {
            arrayList = new ArrayList((ArrayList) this.f47351b);
        }
        return arrayList;
    }

    public void w(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.f998c;
        String str = sVar.f1024e;
        HashMap hashMap = (HashMap) this.f47352c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.f1024e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void x(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f47352c;
        androidx.fragment.app.s sVar = p0Var.f998c;
        if (sVar.P) {
            ((m0) this.f47353e).f(sVar);
        }
        if (hashMap.get(sVar.f1024e) == p0Var && ((p0) hashMap.put(sVar.f1024e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean y(int i10, v vVar) {
        v vVar2;
        Object obj = this.f47351b;
        v0 v0Var = (v0) this.f47353e;
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
        b4.e0 e0Var = (b4.e0) this.f47352c;
        if (e0Var.f1474b != i10 || !d0.a((v) e0Var.f1475c, vVar2)) {
            this.f47352c = new b4.e0((CopyOnWriteArrayList) v0Var.f16432c.d, i10, vVar2);
        }
        o3.l lVar = (o3.l) this.d;
        if (lVar.f16412a != i10 || !d0.a(lVar.f16413b, vVar2)) {
            this.d = new o3.l(v0Var.d.f16414c, i10, vVar2);
            return true;
        }
        return true;
    }

    public r z(r rVar) {
        v0 v0Var = (v0) this.f47353e;
        Object obj = this.f47351b;
        long j10 = rVar.f16559f;
        v0Var.t(obj, j10);
        long j11 = rVar.f16560g;
        v0Var.t(obj, j11);
        if (j10 == j10 && j11 == j11) {
            return rVar;
        }
        return new r(rVar.f16555a, rVar.f16556b, rVar.f16557c, rVar.d, rVar.f16558e, j10, j11);
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f47350a = i10;
        this.f47351b = obj;
        this.f47352c = obj2;
        this.d = obj3;
        this.f47353e = obj4;
    }

    public f(c5.j jVar) {
        this.f47350a = 10;
        LinkedHashSet linkedHashSet = ke.e.f11117p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) jVar.f2315a);
        for (Class cls : (LinkedHashSet) jVar.d) {
            arrayList.add(ke.e.f11118q.get(cls));
        }
        this.f47351b = arrayList;
        oe.b bVar = (c0) jVar.f2318e;
        bVar = bVar == null ? new db.a(14) : bVar;
        this.d = bVar;
        this.f47353e = (ArrayList) jVar.f2317c;
        ArrayList arrayList2 = (ArrayList) jVar.f2316b;
        this.f47352c = arrayList2;
        bVar.w(new f7.b(22, arrayList2, Collections.EMPTY_MAP));
    }

    public f(uc.h hVar) {
        this.f47350a = 8;
        this.f47351b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.f47353e = new jf.a(this, 1);
    }

    public f(ExecutorService executorService) {
        this.f47350a = 4;
        this.f47352c = Tasks.forResult(null);
        this.d = new Object();
        this.f47353e = new ThreadLocal();
        this.f47351b = executorService;
        executorService.execute(new androidx.activity.i(this, 24));
    }

    public f(int i10) {
        this.f47350a = i10;
        switch (i10) {
            case 1:
                this.f47351b = new ArrayList();
                this.f47352c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f47351b = new ArrayDeque();
                return;
        }
    }

    public f(f0 f0Var, Object obj, Object obj2, Object[] objArr) {
        this.f47350a = 2;
        this.f47353e = f0Var;
        this.f47351b = obj;
        this.f47352c = obj2;
        this.d = objArr;
    }

    public f(Context context, ActionMode.Callback callback) {
        this.f47350a = 5;
        this.f47352c = context;
        this.f47351b = callback;
        this.d = new ArrayList();
        this.f47353e = new a0.k(0);
    }

    public f(v0 v0Var, Object obj) {
        this.f47350a = 9;
        this.f47353e = v0Var;
        this.f47352c = v0Var.a(null);
        this.d = new o3.l(v0Var.d.f16414c, 0, null);
        this.f47351b = obj;
    }

    public f(yf.e eVar) {
        this.f47350a = 13;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.f47353e = linearLayout;
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
        this.f47352c = textView2;
        linearLayout.addView(textView2, c6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        t5 t5Var = new t5(eVar.getContext());
        this.f47351b = t5Var;
        linearLayout.addView(t5Var, c6.n(-1, -2));
        textView2.setGravity(8388611);
        t5Var.setGravity(8388613);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }
}
