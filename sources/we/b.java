package we;

import a0.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.u;
import c2.c0;
import c2.e0;
import c2.f0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.t;
import d3.j;
import d5.p;
import e5.x;
import e9.o;
import f2.q1;
import f2.u1;
import f2.v1;
import f2.w1;
import g.i;
import g.q;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l.a0;
import n5.h;
import n5.y;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.PhotoViewer;
import r0.j0;
import r0.m0;
import r0.z;
public final class b implements h, s, l, OnCompleteListener, com.google.android.gms.internal.clearcut.h, y2.b, SuccessContinuation {
    public static volatile b d;
    public final int f48792a;
    public Object f48793b;
    public Object f48794c;

    public b(int i9, Object obj, Object obj2) {
        this.f48792a = i9;
        this.f48794c = obj;
        this.f48793b = obj2;
    }

    public static b C() {
        b bVar;
        b bVar2 = d;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = d;
                    if (bVar == null) {
                        bVar = new b(0, (byte) 0);
                        d = bVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    public static boolean l(Editable editable, KeyEvent keyEvent, boolean z10) {
        u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
                for (u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public byte[] A(b4.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f48794c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f48793b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f1418a);
            dataOutputStream.writeByte(0);
            String str = aVar.f1419b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f1420c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f1421e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public View B(int i9, int i10, int i11, int i12) {
        int i13;
        u1 u1Var = (u1) this.f48794c;
        v1 v1Var = (v1) this.f48793b;
        int l10 = v1Var.l();
        int u10 = v1Var.u();
        if (i10 > i9) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i9 != i10) {
            View z10 = v1Var.z(i9);
            int c10 = v1Var.c(z10);
            int B = v1Var.B(z10);
            u1Var.f5540b = l10;
            u1Var.f5541c = u10;
            u1Var.d = c10;
            u1Var.f5542e = B;
            if (i11 != 0) {
                u1Var.f5539a = i11;
                if (u1Var.a()) {
                    return z10;
                }
            }
            if (i12 != 0) {
                u1Var.f5539a = i12;
                if (u1Var.a()) {
                    view = z10;
                }
            }
            i9 += i13;
        }
        return view;
    }

    public synchronized Map D() {
        try {
            if (((Map) this.f48794c) == null) {
                this.f48794c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f48793b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f48794c;
    }

    public boolean E(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.n r13) {
        throw new UnsupportedOperationException("Method not decompiled: we.b.E(java.lang.CharSequence, int, int, androidx.emoji2.text.n):boolean");
    }

    public boolean F() {
        if (((a) ((t5.c) this.f48793b).d) != null) {
            return true;
        }
        return false;
    }

    public boolean G(View view) {
        u1 u1Var = (u1) this.f48794c;
        v1 v1Var = (v1) this.f48793b;
        int l10 = v1Var.l();
        int u10 = v1Var.u();
        int c10 = v1Var.c(view);
        int B = v1Var.B(view);
        u1Var.f5540b = l10;
        u1Var.f5541c = u10;
        u1Var.d = c10;
        u1Var.f5542e = B;
        u1Var.f5539a = 24579;
        return u1Var.a();
    }

    public void H(k.a aVar) {
        t tVar = (t) this.f48793b;
        ((ActionMode.Callback) tVar.f4177b).onDestroyActionMode(tVar.r(aVar));
        q qVar = (q) this.f48794c;
        if (qVar.A != null) {
            qVar.f7017f.getDecorView().removeCallbacks(qVar.B);
        }
        if (qVar.f7030y != null) {
            m0 m0Var = qVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 a2 = j0.a(qVar.f7030y);
            a2.a(0.0f);
            qVar.C = a2;
            a2.d(new i(this, 2));
        }
        qVar.f7029x = null;
        ViewGroup viewGroup = qVar.F;
        WeakHashMap weakHashMap = j0.f46915a;
        z.c(viewGroup);
        qVar.y();
    }

    public boolean I(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((q) this.f48794c).F;
        WeakHashMap weakHashMap = j0.f46915a;
        z.c(viewGroup);
        t tVar = (t) this.f48793b;
        ActionMode.Callback callback = (ActionMode.Callback) tVar.f4177b;
        k.e r10 = tVar.r(aVar);
        k kVar = (k) tVar.f4179e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) tVar.f4178c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r10, menu2);
    }

    public p J(q1 q1Var, int i9) {
        w1 w1Var;
        p pVar;
        a0.f fVar = (a0.f) this.f48793b;
        int c10 = fVar.c(q1Var);
        if (c10 >= 0 && (w1Var = (w1) fVar.h(c10)) != null) {
            int i10 = w1Var.f5556a;
            if ((i10 & i9) != 0) {
                int i11 = i10 & (~i9);
                w1Var.f5556a = i11;
                if (i9 == 4) {
                    pVar = w1Var.f5557b;
                } else if (i9 == 8) {
                    pVar = w1Var.f5558c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    fVar.f(c10);
                    w1Var.f5556a = 0;
                    w1Var.f5557b = null;
                    w1Var.f5558c = null;
                    w1.d.h(w1Var);
                }
                return pVar;
            }
        }
        return null;
    }

    public void K(q1 q1Var) {
        w1 w1Var = (w1) ((a0.f) this.f48793b).get(q1Var);
        if (w1Var == null) {
            return;
        }
        w1Var.f5556a &= -2;
    }

    public void L(q1 q1Var) {
        a0.f fVar = (a0.f) this.f48793b;
        a0.h hVar = (a0.h) this.f48794c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (q1Var == hVar.n(m10)) {
                Object[] objArr = hVar.f18c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.f19a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.f16a = true;
                }
            } else {
                m10--;
            }
        }
        w1 w1Var = (w1) fVar.get(q1Var);
        if (w1Var != null) {
            fVar.remove(q1Var);
            w1Var.f5556a = 0;
            w1Var.f5557b = null;
            w1Var.f5558c = null;
            w1.d.h(w1Var);
        }
    }

    public void M(g gVar) {
        e eVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        t5.c cVar = (t5.c) this.f48793b;
        g gVar3 = (g) cVar.f47683c;
        if (d1.f.t()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f48813a;
                    if (gVar != null && arrayList.size() == gVar.f48813a.size()) {
                        for (int i9 = 0; i9 < arrayList.size(); i9++) {
                            f a2 = gVar3.a(i9);
                            f a3 = gVar.a(i9);
                            if ((a2 == null && a3 == null) || (a2 != null && a3 != null && Objects.equals(a2.f48808a, a3.f48808a) && Objects.equals(a2.f48809b, a3.f48809b) && Objects.equals(a2.f48810c, a3.f48810c) && Objects.equals(a2.d, a3.d) && a2.f48811e == a3.f48811e && a2.f48812f == a3.f48812f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) cVar.d) != null && gVar != null) {
            cVar.a(gVar);
        }
        if (((a) cVar.d) != null && (gVar2 = (g) cVar.f47683c) != null) {
            cVar.f(gVar2);
        }
        if (gVar != null && gVar.f48813a.size() > 0 && !gVar.a(0).f48808a.startsWith("audio/") && (eVar = (e) cVar.f47682b) != null) {
            eVar.l(null, null);
        }
        a aVar = (a) cVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f48791g = 0;
            aVar.h = 0;
            aVar.p();
        }
        cVar.f47683c = gVar;
    }

    public void N(n5.c cVar) {
        String str;
        String string;
        t5.c cVar2 = (t5.c) this.f48793b;
        if (cVar != null) {
            x5.l.e("Must be called from the main thread.");
            o5.h hVar = cVar.f18481j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) cVar2.d;
                if (aVar == null || !TextUtils.equals(aVar.f48788c.a(), a2)) {
                    cVar2.i(new a(cVar, (n5.g) this.f48794c, hVar));
                    x5.l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f18482k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    e.i();
                    if (t12.A != null && t12.f35580a0 != null && t12.Q1()) {
                        oc ocVar = new oc(t12.f35580a0, new ih.b());
                        int i9 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        ocVar.Q(i9, 36, string).j();
                    }
                }
            }
        }
    }

    @Override
    public void a(n5.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((n5.c) fVar).a());
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: we.b.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void b(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((n5.c) fVar).a() + " " + i9);
    }

    @Override
    public void c(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((n5.c) fVar).a() + " " + i9);
        ((t5.c) this.f48793b).i(null);
    }

    @Override
    public m createDataSource() {
        return new v((Context) this.f48793b, ((w) this.f48794c).createDataSource());
    }

    @Override
    public void d(n5.f fVar) {
        n5.c cVar = (n5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        N(cVar);
    }

    @Override
    public void e(n5.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((n5.c) fVar).a() + " " + z10);
    }

    @Override
    public void f(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((n5.c) fVar).a() + " " + i9);
    }

    @Override
    public void g(n5.f fVar, int i9) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((n5.c) fVar).a() + " " + i9);
    }

    @Override
    public Object mo28get() {
        ya.b bVar = new ya.b(7);
        wa.a aVar = new wa.a(7);
        Object mo28get = ((nc.a) this.f48793b).mo28get();
        nc.a aVar2 = (nc.a) this.f48794c;
        return new d3.h(bVar, aVar, d3.a.f4287f, (j) mo28get, aVar2);
    }

    @Override
    public void h(n5.f fVar, String str) {
        n5.c cVar = (n5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        N(cVar);
    }

    @Override
    public void i(n5.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((n5.c) fVar).a() + " " + str);
    }

    public void j(q1 q1Var, p pVar) {
        a0.f fVar = (a0.f) this.f48793b;
        w1 w1Var = (w1) fVar.get(q1Var);
        if (w1Var == null) {
            w1Var = w1.a();
            fVar.put(q1Var, w1Var);
        }
        w1Var.f5558c = pVar;
        w1Var.f5556a |= 8;
    }

    public void k() {
        String str = (String) this.f48793b;
        try {
            j9.c cVar = (j9.c) this.f48794c;
            cVar.getClass();
            new File(cVar.f14245b, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void m(k3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.f48793b;
        if (handler != null) {
            handler.post(new x(this, fVar, 0));
        }
    }

    public void n(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.n(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void o(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f48793b;
        androidx.fragment.app.v vVar = j0Var.f967w.f1060b;
        androidx.fragment.app.s sVar = j0Var.f969y;
        if (sVar != null) {
            sVar.p().f960o.o(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        n5.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.f48793b;
        n5.b bVar2 = (n5.b) this.f48794c;
        c0 c0Var = qVar.f3193c;
        q5.b bVar3 = com.google.android.gms.internal.cast.q.f3192j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (true != z12) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar3.b("The module-to-client output switcher flag %s", str);
            if (z12) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.f46009a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f18472x)));
                if (!z10 && bVar2.f18472x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0Var == null && (bVar = qVar.d) != null) {
                    boolean z13 = bVar.v;
                    boolean z14 = bVar.f18470s;
                    e0 e0Var = new e0();
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 30) {
                        e0Var.f2158b = z11;
                    }
                    if (i9 >= 30) {
                        e0Var.d = z13;
                    }
                    if (i9 >= 30) {
                        e0Var.f2159c = z14;
                    }
                    c0.i(new f0(e0Var));
                    Log.i(bVar3.f46009a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.f3196i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        com.google.android.gms.internal.cast.t tVar = qVar.f3195f;
                        x5.l.h(tVar);
                        com.google.android.gms.internal.cast.p pVar = new com.google.android.gms.internal.cast.p(tVar);
                        c0.b();
                        c0.c().f2138f = pVar;
                        d2.a(d1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f46009a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f18472x)));
        if (!z10) {
        }
        z11 = false;
        if (c0Var == null) {
        }
    }

    public void p(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.p(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void q(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void r(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.r(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void s(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.s(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void t(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f48793b;
        androidx.fragment.app.v vVar = j0Var.f967w.f1060b;
        androidx.fragment.app.s sVar = j0Var.f969y;
        if (sVar != null) {
            sVar.p().f960o.t(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public Task then(Object obj) {
        switch (this.f48792a) {
            case 21:
                l9.a aVar = (l9.a) obj;
                o oVar = ((e9.l) this.f48794c).f5016e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(o.b(oVar), oVar.f5033m.v((Executor) this.f48793b, null));
            case 22:
                l9.a aVar2 = (l9.a) obj;
                e9.m mVar = (e9.m) this.f48794c;
                if (aVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                b bVar = (b) mVar.f5019c;
                o.b((o) ((b) mVar.f5019c).f48794c);
                ((o) bVar.f48794c).f5033m.v((Executor) this.f48793b, null);
                ((o) bVar.f48794c).f5037q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((o) this.f48794c).f5026e.R(new e9.m(0, this, (Boolean) obj));
        }
    }

    public void u(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void v(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.v(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void w(androidx.fragment.app.s f10, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.w(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void x(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void y(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void z(androidx.fragment.app.s f10, boolean z10) {
        kotlin.jvm.internal.i.e(f10, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.f48793b).f969y;
        if (sVar != null) {
            sVar.p().f960o.z(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f48794c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f48793b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f48794c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f3336e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f3336e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f3336e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f3348b);
    }

    public b(Object obj, int i9) {
        this.f48792a = i9;
        this.f48793b = obj;
        this.f48794c = null;
    }

    public b(Object obj, Object obj2, boolean z10, int i9) {
        this.f48792a = i9;
        this.f48793b = obj;
        this.f48794c = obj2;
    }

    public b(androidx.fragment.app.j0 j0Var) {
        this.f48792a = 4;
        this.f48793b = j0Var;
        this.f48794c = new CopyOnWriteArrayList();
    }

    public b(int i9, byte b10) {
        this.f48792a = i9;
        switch (i9) {
            case 1:
                return;
            case 6:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f48793b = byteArrayOutputStream;
                this.f48794c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 13:
                this.f48793b = new HashMap();
                return;
            case 17:
                this.f48793b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f48794c = new ReferenceQueue();
                return;
            case 25:
                this.f48793b = new AtomicInteger();
                this.f48794c = new AtomicInteger();
                return;
            case 27:
                this.f48793b = new k(0);
                this.f48794c = new a0.h();
                return;
            default:
                n5.a c10 = n5.a.c(ApplicationLoader.applicationContext);
                v0.l lVar = new v0.l(2);
                c10.getClass();
                x5.l.e("Must be called from the main thread.");
                n5.g gVar = c10.f18454c;
                gVar.getClass();
                try {
                    y yVar = gVar.f18493a;
                    n5.j jVar = new n5.j(lVar);
                    Parcel M0 = yVar.M0();
                    com.google.android.gms.internal.cast.u.d(M0, jVar);
                    yVar.Q0(M0, 4);
                } catch (RemoteException e10) {
                    n5.g.f18492c.a(e10, "Unable to call %s on %s.", "addCastStateListener", y.class.getSimpleName());
                }
                this.f48793b = new t5.c(8);
                n5.g b11 = c10.b();
                this.f48794c = b11;
                b11.a(this);
                N(b11.c());
                return;
        }
    }

    public b(Context context, int i9) {
        this.f48792a = i9;
        switch (i9) {
            case 15:
                this.f48793b = context;
                return;
            default:
                w wVar = new w();
                this.f48793b = context.getApplicationContext();
                this.f48794c = wVar;
                return;
        }
    }

    public b(t tVar, d7.u uVar, androidx.emoji2.text.d dVar) {
        this.f48792a = 2;
        this.f48793b = tVar;
        this.f48794c = dVar;
    }

    public b(v1 v1Var) {
        this.f48792a = 26;
        this.f48793b = v1Var;
        ?? obj = new Object();
        obj.f5539a = 0;
        this.f48794c = obj;
    }

    public b(int i9) {
        this.f48792a = 19;
        Bitmap createBitmap = Bitmap.createBitmap(i9, i9, Bitmap.Config.ALPHA_8);
        this.f48793b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f48794c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public b(Animator animator) {
        this.f48792a = 3;
        this.f48793b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f48794c = animatorSet;
        animatorSet.play(animator);
    }

    public b(e9.l lVar, Executor executor, String str) {
        this.f48792a = 21;
        this.f48794c = lVar;
        this.f48793b = executor;
    }
}
