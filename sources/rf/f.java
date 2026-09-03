package rf;

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
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import androidx.fragment.app.s;
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
import k7.b6;
import k9.t0;
import k9.z0;
import l.a0;
import l.r;
import ld.e0;
import o3.m;
import o3.n;
import o4.v;
import o4.v0;
import o4.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.t5;
import q5.c0;
import vh.w2;
public final class f implements a3.b, z, n {
    public static volatile f f43488f;
    public final int f43489a;
    public Object f43490b;
    public Object f43491c;
    public Object d;
    public Object e;

    public static final Message k(f fVar, ArrayList arrayList, int i10) {
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
        return ((ActionMode.Callback) this.f43490b).onActionItemClicked(s(aVar), new r((Context) this.f43491c, (l0.a) menuItem));
    }

    public boolean B(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f43490b;
        k.e s6 = s(aVar);
        k kVar = (k) this.e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f43491c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(s6, menu2);
    }

    public ne.f C(String str) {
        if (str != null) {
            ke.e eVar = new ke.e((ArrayList) this.f43490b, (oe.b) this.d, (ArrayList) this.f43491c);
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
            eVar.f(eVar.f10336n);
            oe.a P0 = eVar.f10332j.P0(new f7.b(22, eVar.f10333k, eVar.f10335m));
            for (pe.a aVar : eVar.f10337o) {
                aVar.g(P0);
            }
            ne.f fVar = (ne.f) eVar.f10334l.f10323b;
            Iterator it = ((ArrayList) this.e).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new NullPointerException("input must not be null");
    }

    public void D() {
        if (((e) this.f43491c) == null) {
            e eVar = (e) ((ArrayDeque) this.f43490b).pollFirst();
            this.f43491c = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.d = cVar;
                AndroidUtilities.runOnUIThread(cVar, 10000L);
                b bVar = eVar.f43486b;
                String str = bVar.f43477b;
                String str2 = bVar.f43479f;
                d dVar = new d(this, eVar);
                String i10 = j.i(str);
                byte[] d = j.d(str2);
                int i11 = 0;
                if (!TextUtils.isEmpty(i10) && d != null && j.h()) {
                    synchronized (j.f43497t) {
                        j jVar = j.v;
                        if (jVar != null) {
                            jVar.m();
                            j.v = null;
                        }
                        try {
                            j jVar2 = new j(i10, str2, d);
                            j.v = jVar2;
                            jVar2.f43514s = dVar;
                            h10 h10Var = h10.getInstance();
                            if (h10Var != null) {
                                h10Var.addListener(jVar2);
                            }
                            jVar2.h.execute(new g(jVar2, 2));
                            AndroidUtilities.runOnUIThread(new g(jVar2, 1));
                            i11 = j.v.f43503g.getLocalPort();
                        } catch (Exception e) {
                            FileLog.e(e);
                            j jVar3 = j.v;
                            if (jVar3 != null) {
                                jVar3.m();
                                j.v = null;
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
        e0.q(e0.b((uc.h) this.f43490b), new k1.c(this, arrayList, null, 5));
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
            continueWith = ((Task) this.f43491c).continueWith((Executor) this.f43490b, new ja.c(callable, 13));
            this.f43491c = continueWith.continueWith((Executor) this.f43490b, new z9.d(8));
        }
        return continueWith;
    }

    public Task I(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.f43491c).continueWithTask((Executor) this.f43490b, new ja.c(callable, 13));
            this.f43491c = continueWithTask.continueWith((Executor) this.f43490b, new z9.d(8));
        }
        return continueWithTask;
    }

    @Override
    public void a(int i10, v vVar, o4.j jVar, o4.r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f43491c).q(jVar, z(rVar));
        }
    }

    @Override
    public void b(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((m) this.d).a();
        }
    }

    @Override
    public void c(int i10, v vVar, int i11) {
        if (y(i10, vVar)) {
            ((m) this.d).c(i11);
        }
    }

    @Override
    public void d(int i10, v vVar, o4.j jVar, o4.r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f43491c).o(jVar, z(rVar));
        }
    }

    @Override
    public void e(int i10, v vVar, Exception exc) {
        if (y(i10, vVar)) {
            ((m) this.d).d(exc);
        }
    }

    @Override
    public void f(int i10, v vVar, o4.r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f43491c).i(z(rVar));
        }
    }

    @Override
    public void g(int i10, v vVar, o4.j jVar, o4.r rVar, IOException iOException, boolean z4) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f43491c).t(jVar, z(rVar), iOException, z4);
        }
    }

    @Override
    public Object mo28get() {
        ?? obj = new Object();
        obj.f4004a = (Executor) ((rc.a) this.f43490b).mo28get();
        obj.f4005b = (f3.d) ((rc.a) this.f43491c).mo28get();
        obj.f4006c = (af.d) ((af.d) this.d).mo28get();
        obj.d = (g3.c) ((rc.a) this.e).mo28get();
        return obj;
    }

    @Override
    public void h(int i10, v vVar, o4.j jVar, o4.r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f43491c).v(jVar, z(rVar));
        }
    }

    @Override
    public void i(int i10, v vVar, o4.r rVar) {
        if (y(i10, vVar)) {
            ((b4.e0) this.f43491c).B(z(rVar));
        }
    }

    @Override
    public void j(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((m) this.d).b();
        }
    }

    @Override
    public void l(int i10, v vVar) {
        if (y(i10, vVar)) {
            ((m) this.d).e();
        }
    }

    public void m(s sVar) {
        if (!((ArrayList) this.f43490b).contains(sVar)) {
            synchronized (((ArrayList) this.f43490b)) {
                ((ArrayList) this.f43490b).add(sVar);
            }
            sVar.v = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public t0 n() {
        String str;
        if (((String) this.f43490b) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f43491c) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.d) == null) {
            str = w2.k(str, " importance");
        }
        if (((Boolean) this.e) == null) {
            str = w2.k(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.f43490b, ((Integer) this.f43491c).intValue(), ((Integer) this.d).intValue(), ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 o() {
        String str;
        if (((Integer) this.f43490b) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f43491c) == null) {
            str = str.concat(" version");
        }
        if (((String) this.d) == null) {
            str = w2.k(str, " buildVersion");
        }
        if (((Boolean) this.e) == null) {
            str = w2.k(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.f43490b).intValue(), (String) this.f43491c, (String) this.d, ((Boolean) this.e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void p(e eVar) {
        if (((e) this.f43491c) != eVar) {
            return;
        }
        c cVar = (c) this.d;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.d = null;
        }
        c cVar2 = (c) this.e;
        if (cVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar2);
            this.e = null;
        }
        synchronized (j.f43497t) {
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
        this.f43491c = null;
        eVar.f43487c.run(-1L);
        D();
    }

    public s q(String str) {
        p0 p0Var = (p0) ((HashMap) this.f43491c).get(str);
        if (p0Var != null) {
            return p0Var.f932c;
        }
        return null;
    }

    public s r(String str) {
        for (p0 p0Var : ((HashMap) this.f43491c).values()) {
            if (p0Var != null) {
                s sVar = p0Var.f932c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.I.f868c.r(str);
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
            if (eVar != null && eVar.f9491b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f43491c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f43491c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f43489a) {
            case 2:
                return ((bb.b) this.e).toString();
            default:
                return super.toString();
        }
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.f43491c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.f932c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.f43490b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f43490b)) {
            arrayList = new ArrayList((ArrayList) this.f43490b);
        }
        return arrayList;
    }

    public void w(p0 p0Var) {
        s sVar = p0Var.f932c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.f43491c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void x(p0 p0Var) {
        HashMap hashMap = (HashMap) this.f43491c;
        s sVar = p0Var.f932c;
        if (sVar.P) {
            ((m0) this.e).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean y(int i10, v vVar) {
        v vVar2;
        Object obj = this.f43490b;
        v0 v0Var = (v0) this.e;
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
        b4.e0 e0Var = (b4.e0) this.f43491c;
        if (e0Var.f1378b != i10 || !d0.a((v) e0Var.f1379c, vVar2)) {
            this.f43491c = new b4.e0((CopyOnWriteArrayList) v0Var.f16271c.d, i10, vVar2);
        }
        m mVar = (m) this.d;
        if (mVar.f16254a != i10 || !d0.a(mVar.f16255b, vVar2)) {
            this.d = new m(v0Var.d.f16256c, i10, vVar2);
            return true;
        }
        return true;
    }

    public o4.r z(o4.r rVar) {
        v0 v0Var = (v0) this.e;
        Object obj = this.f43490b;
        long j10 = rVar.f16387f;
        v0Var.t(obj, j10);
        long j11 = rVar.f16388g;
        v0Var.t(obj, j11);
        if (j10 == j10 && j11 == j11) {
            return rVar;
        }
        return new o4.r(rVar.f16384a, rVar.f16385b, rVar.f16386c, rVar.d, rVar.e, j10, j11);
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43489a = i10;
        this.f43490b = obj;
        this.f43491c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public f(c5.j jVar) {
        this.f43489a = 10;
        LinkedHashSet linkedHashSet = ke.e.f10324p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) jVar.f2152a);
        for (Class cls : (LinkedHashSet) jVar.d) {
            arrayList.add(ke.e.f10325q.get(cls));
        }
        this.f43490b = arrayList;
        oe.b bVar = (c0) jVar.e;
        bVar = bVar == null ? new cb.b(15) : bVar;
        this.d = bVar;
        this.e = (ArrayList) jVar.f2154c;
        ArrayList arrayList2 = (ArrayList) jVar.f2153b;
        this.f43491c = arrayList2;
        bVar.P0(new f7.b(22, arrayList2, Collections.EMPTY_MAP));
    }

    public f(uc.h hVar) {
        this.f43489a = 8;
        this.f43490b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new hf.a(this, 1);
    }

    public f(ExecutorService executorService) {
        this.f43489a = 4;
        this.f43491c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.f43490b = executorService;
        executorService.execute(new androidx.activity.i(this, 24));
    }

    public f(int i10) {
        this.f43489a = i10;
        switch (i10) {
            case 1:
                this.f43490b = new ArrayList();
                this.f43491c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.f43490b = new ArrayDeque();
                return;
        }
    }

    public f(bb.b bVar, Object obj, Object obj2, Object[] objArr) {
        this.f43489a = 2;
        this.e = bVar;
        this.f43490b = obj;
        this.f43491c = obj2;
        this.d = objArr;
    }

    public f(Context context, ActionMode.Callback callback) {
        this.f43489a = 5;
        this.f43491c = context;
        this.f43490b = callback;
        this.d = new ArrayList();
        this.e = new k(0);
    }

    public f(v0 v0Var, Object obj) {
        this.f43489a = 9;
        this.e = v0Var;
        this.f43491c = v0Var.a(null);
        this.d = new m(v0Var.d.f16256c, 0, null);
        this.f43490b = obj;
    }

    public f(xf.e eVar) {
        this.f43489a = 13;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
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
        this.f43491c = textView2;
        linearLayout.addView(textView2, b6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        t5 t5Var = new t5(eVar.getContext());
        this.f43490b = t5Var;
        linearLayout.addView(t5Var, b6.n(-1, -2));
        textView2.setGravity(8388611);
        t5Var.setGravity(8388613);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }
}
