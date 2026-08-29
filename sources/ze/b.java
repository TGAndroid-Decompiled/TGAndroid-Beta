package ze;

import a0.k;
import a4.m;
import ah.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
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
import androidx.fragment.app.j0;
import c2.d0;
import c2.f0;
import c2.g0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.e1;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import f2.n1;
import f2.r1;
import f2.s1;
import f2.t1;
import g.q;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.j;
import l.a0;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tc;
import org.telegram.ui.PhotoViewer;
import p5.h;
import p5.y;
import r0.m0;
import r0.z;
public final class b implements h, m, vd.b, l, OnCompleteListener, com.google.android.gms.internal.clearcut.h, s, a3.b {
    public static volatile b f50823c;
    public Object f50824a;
    public Object f50825b;

    public b(Object obj) {
        this.f50824a = obj;
    }

    public static b H() {
        b bVar;
        b bVar2 = f50823c;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = f50823c;
                    if (bVar == null) {
                        bVar = new b(0, false);
                        f50823c = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    public static ze.b i(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: ze.b.i(android.content.Context):ze.b");
    }

    public static boolean m(Editable editable, KeyEvent keyEvent, boolean z10) {
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

    public void A(androidx.fragment.app.s f9, Bundle bundle, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.A(f9, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void B(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.B(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void C(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.C(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void D(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.D(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public byte[] E(d4.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f50825b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f50824a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f5302a);
            dataOutputStream.writeByte(0);
            String str = aVar.f5303b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f5304c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f5305e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public View F(int i10, int i11, int i12, int i13) {
        int i14;
        r1 r1Var = (r1) this.f50825b;
        s1 s1Var = (s1) this.f50824a;
        int n10 = s1Var.n();
        int s10 = s1Var.s();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View y8 = s1Var.y(i10);
            int d = s1Var.d(y8);
            int z10 = s1Var.z(y8);
            r1Var.f6470b = n10;
            r1Var.f6471c = s10;
            r1Var.d = d;
            r1Var.f6472e = z10;
            if (i12 != 0) {
                r1Var.f6469a = i12;
                if (r1Var.a()) {
                    return y8;
                }
            }
            if (i13 != 0) {
                r1Var.f6469a = i13;
                if (r1Var.a()) {
                    view = y8;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public File G() {
        if (((File) this.f50824a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f50824a) == null) {
                        u8.g gVar = (u8.g) this.f50825b;
                        gVar.a();
                        File filesDir = gVar.f49131a.getFilesDir();
                        this.f50824a = new File(filesDir, "PersistedInstallation." + ((u8.g) this.f50825b).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f50824a;
    }

    public synchronized Map I() {
        try {
            if (((Map) this.f50825b) == null) {
                this.f50825b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f50824a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f50825b;
    }

    public boolean J(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.n r13) {
        throw new UnsupportedOperationException("Method not decompiled: ze.b.J(java.lang.CharSequence, int, int, androidx.emoji2.text.n):boolean");
    }

    public void K(ba.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f2032a);
            jSONObject.put("Status", m1.j.b(bVar.f2033b));
            jSONObject.put("AuthToken", bVar.f2034c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f2036f);
            jSONObject.put("ExpiresInSecs", bVar.f2035e);
            jSONObject.put("FisError", bVar.f2037g);
            u8.g gVar = (u8.g) this.f50825b;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f49131a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(G())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean L() {
        if (((a) ((v5.c) this.f50824a).d) != null) {
            return true;
        }
        return false;
    }

    public boolean M(View view) {
        r1 r1Var = (r1) this.f50825b;
        s1 s1Var = (s1) this.f50824a;
        int n10 = s1Var.n();
        int s10 = s1Var.s();
        int d = s1Var.d(view);
        int z10 = s1Var.z(view);
        r1Var.f6470b = n10;
        r1Var.f6471c = s10;
        r1Var.d = d;
        r1Var.f6472e = z10;
        r1Var.f6469a = 24579;
        return r1Var.a();
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        i iVar = (i) this.f50825b;
        iVar.f751c.a(f9);
        iVar.d.a(f9);
        iVar.f750b.a(f9);
        ((Runnable) this.f50824a).run();
    }

    public void O(k.a aVar) {
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f50824a;
        ((ActionMode.Callback) sVar.f5185b).onDestroyActionMode(sVar.r(aVar));
        q qVar = (q) this.f50825b;
        if (qVar.A != null) {
            qVar.f6927f.getDecorView().removeCallbacks(qVar.B);
        }
        if (qVar.f6940y != null) {
            m0 m0Var = qVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            m0 a2 = r0.j0.a(qVar.f6940y);
            a2.a(0.0f);
            qVar.C = a2;
            a2.d(new g.i(this, 2));
        }
        qVar.f6939x = null;
        ViewGroup viewGroup = qVar.F;
        WeakHashMap weakHashMap = r0.j0.f46829a;
        z.c(viewGroup);
        qVar.y();
    }

    public boolean P(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((q) this.f50825b).F;
        WeakHashMap weakHashMap = r0.j0.f46829a;
        z.c(viewGroup);
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.f50824a;
        ActionMode.Callback callback = (ActionMode.Callback) sVar.f5185b;
        k.e r6 = sVar.r(aVar);
        k kVar = (k) sVar.f5187e;
        Menu menu2 = (Menu) kVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) sVar.f5186c, (l.k) menu);
            kVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r6, menu2);
    }

    public a5.e Q(n1 n1Var, int i10) {
        t1 t1Var;
        a5.e eVar;
        a0.f fVar = (a0.f) this.f50824a;
        int c3 = fVar.c(n1Var);
        if (c3 >= 0 && (t1Var = (t1) fVar.h(c3)) != null) {
            int i11 = t1Var.f6479a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                t1Var.f6479a = i12;
                if (i10 == 4) {
                    eVar = t1Var.f6480b;
                } else if (i10 == 8) {
                    eVar = t1Var.f6481c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c3);
                    t1Var.f6479a = 0;
                    t1Var.f6480b = null;
                    t1Var.f6481c = null;
                    t1.d.h(t1Var);
                }
                return eVar;
            }
        }
        return null;
    }

    public ba.b R() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(G());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.c(5)[optInt];
        if (i10 != 0) {
            if (i10 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new ba.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void S() {
        try {
            ((FileLock) this.f50825b).release();
            ((FileChannel) this.f50824a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public void T(n1 n1Var) {
        t1 t1Var = (t1) ((a0.f) this.f50824a).get(n1Var);
        if (t1Var == null) {
            return;
        }
        t1Var.f6479a &= -2;
    }

    public void U(n1 n1Var) {
        a0.f fVar = (a0.f) this.f50824a;
        a0.h hVar = (a0.h) this.f50825b;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (n1Var == hVar.n(m10)) {
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
        t1 t1Var = (t1) fVar.get(n1Var);
        if (t1Var != null) {
            fVar.remove(n1Var);
            t1Var.f6479a = 0;
            t1Var.f6480b = null;
            t1Var.f6481c = null;
            t1.d.h(t1Var);
        }
    }

    public void V(g gVar) {
        e eVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        v5.c cVar = (v5.c) this.f50824a;
        g gVar3 = (g) cVar.f49410c;
        if (d1.f.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f50844a;
                    if (gVar != null && arrayList.size() == gVar.f50844a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f50839a, a10.f50839a) && Objects.equals(a2.f50840b, a10.f50840b) && Objects.equals(a2.f50841c, a10.f50841c) && Objects.equals(a2.d, a10.d) && a2.f50842e == a10.f50842e && a2.f50843f == a10.f50843f)) {
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
        if (((a) cVar.d) != null && (gVar2 = (g) cVar.f49410c) != null) {
            cVar.g(gVar2);
        }
        if (gVar != null && gVar.f50844a.size() > 0 && !gVar.a(0).f50839a.startsWith("audio/") && (eVar = (e) cVar.f49409b) != null) {
            eVar.l(null, null);
        }
        a aVar = (a) cVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f50822g = 0;
            aVar.h = 0;
            aVar.p();
        }
        cVar.f49410c = gVar;
    }

    public void W(p5.c cVar) {
        String str;
        String string;
        v5.c cVar2 = (v5.c) this.f50824a;
        if (cVar != null) {
            z5.l.e("Must be called from the main thread.");
            q5.h hVar = cVar.f45629j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) cVar2.d;
                if (aVar == null || !TextUtils.equals(aVar.f50819c.a(), a2)) {
                    cVar2.i(new a(cVar, (p5.g) this.f50825b, hVar));
                    z5.l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f45630k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    e.i();
                    if (t12.A != null && t12.f35647a0 != null && t12.Q1()) {
                        tc tcVar = new tc(t12.f35647a0, new lh.b());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        tcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    @Override
    public void a(p5.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((p5.c) fVar).a() + " " + str);
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: ze.b.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void b(p5.f fVar) {
        p5.c cVar = (p5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        W(cVar);
    }

    @Override
    public void c(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((p5.c) fVar).a() + " " + i10);
    }

    @Override
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new v((Context) this.f50824a, ((w) this.f50825b).createDataSource());
    }

    @Override
    public void d(p5.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((p5.c) fVar).a());
    }

    @Override
    public void e(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((p5.c) fVar).a() + " " + i10);
    }

    @Override
    public void f(p5.f fVar, String str) {
        p5.c cVar = (p5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        W(cVar);
    }

    @Override
    public void g(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((p5.c) fVar).a() + " " + i10);
        ((v5.c) this.f50824a).i(null);
    }

    @Override
    public Object mo18get() {
        f7.v vVar = new f7.v(8);
        bb.a aVar = new bb.a(8);
        Object mo18get = ((pc.a) this.f50824a).mo18get();
        pc.a aVar2 = (pc.a) this.f50825b;
        return new f3.h(vVar, aVar, f3.a.f6524f, (f3.j) mo18get, aVar2);
    }

    @Override
    public void h(p5.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((p5.c) fVar).a() + " " + z10);
    }

    @Override
    public void j(p5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((p5.c) fVar).a() + " " + i10);
    }

    public void k(n1 n1Var, a5.e eVar) {
        a0.f fVar = (a0.f) this.f50824a;
        t1 t1Var = (t1) fVar.get(n1Var);
        if (t1Var == null) {
            t1Var = t1.a();
            fVar.put(n1Var, t1Var);
        }
        t1Var.f6481c = eVar;
        t1Var.f6479a |= 8;
    }

    @Override
    public a4.c x(a4.l lVar) {
        MediaCodec mediaCodec;
        String str = lVar.f99a.f104a;
        a4.c cVar = null;
        try {
            f5.a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                a4.c cVar2 = new a4.c(mediaCodec, (HandlerThread) ((a4.b) this.f50824a).get(), (HandlerThread) ((a4.b) this.f50825b).get());
                try {
                    f5.a.q();
                    a4.c.i(cVar2, lVar.f100b, lVar.d, lVar.f102e);
                    return cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    public void n(m3.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.f50824a;
        if (handler != null) {
            handler.post(new g5.w(this, fVar, 0));
        }
    }

    public ArrayList o() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f50824a;
        Class cls = (Class) ((m5.i) this.f50825b).f16880b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new a9.d(str2, 0));
        }
        return arrayList2;
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        p5.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.f50824a;
        p5.b bVar2 = (p5.b) this.f50825b;
        d0 d0Var = qVar.f4235c;
        s5.b bVar3 = com.google.android.gms.internal.cast.q.f4234j;
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
                Log.i(bVar3.f47580a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f45620x)));
                if (!z10 && bVar2.f45620x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (d0Var == null && (bVar = qVar.d) != null) {
                    boolean z13 = bVar.v;
                    boolean z14 = bVar.f45618s;
                    f0 f0Var = new f0();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        f0Var.f2834b = z11;
                    }
                    if (i10 >= 30) {
                        f0Var.d = z13;
                    }
                    if (i10 >= 30) {
                        f0Var.f2835c = z14;
                    }
                    d0.i(new g0(f0Var));
                    Log.i(bVar3.f47580a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.f4238i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        t tVar = qVar.f4237f;
                        z5.l.h(tVar);
                        p pVar = new p(tVar);
                        d0.b();
                        d0.c().f2808f = pVar;
                        e2.a(e1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f47580a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f45620x)));
        if (!z10) {
        }
        z11 = false;
        if (d0Var == null) {
        }
    }

    public void p(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.p(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void q(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        j0 j0Var = (j0) this.f50824a;
        androidx.fragment.app.v vVar = j0Var.f1463w.f1556b;
        androidx.fragment.app.s sVar = j0Var.f1465y;
        if (sVar != null) {
            sVar.p().f1456o.q(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void r(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.r(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void s(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.s(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void t(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.t(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void u(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.u(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void v(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        j0 j0Var = (j0) this.f50824a;
        androidx.fragment.app.v vVar = j0Var.f1463w.f1556b;
        androidx.fragment.app.s sVar = j0Var.f1465y;
        if (sVar != null) {
            sVar.p().f1456o.v(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void w(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.w(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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

    public void y(androidx.fragment.app.s f9, boolean z10) {
        j.e(f9, "f");
        androidx.fragment.app.s sVar = ((j0) this.f50824a).f1465y;
        if (sVar != null) {
            sVar.p().f1456o.y(f9, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f50825b).iterator();
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
    public void z(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ze.b.z(float, int):void");
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f50824a;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f50825b;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f4353e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f4353e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f4353e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f4365b);
    }

    public b(Object obj, Object obj2) {
        this.f50824a = obj;
        this.f50825b = obj2;
    }

    public b(Object obj, Object obj2, boolean z10) {
        this.f50825b = obj;
        this.f50824a = obj2;
    }

    public b(Object obj, boolean z10) {
        this.f50824a = obj;
        this.f50825b = null;
    }

    public b(int i10, boolean z10) {
        switch (i10) {
            case 7:
                return;
            case 14:
                this.f50824a = new HashMap();
                return;
            case 18:
                this.f50824a = new ConcurrentHashMap(16, 0.75f, 10);
                this.f50825b = new ReferenceQueue();
                return;
            case 19:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f50824a = byteArrayOutputStream;
                this.f50825b = new DataOutputStream(byteArrayOutputStream);
                return;
            case 24:
                this.f50824a = new k(0);
                this.f50825b = new a0.h();
                return;
            default:
                p5.a c3 = p5.a.c(ApplicationLoader.applicationContext);
                sg.j jVar = new sg.j(18);
                c3.getClass();
                z5.l.e("Must be called from the main thread.");
                p5.g gVar = c3.f45603c;
                gVar.getClass();
                try {
                    y yVar = gVar.f45638a;
                    p5.j jVar2 = new p5.j(jVar);
                    Parcel M0 = yVar.M0();
                    com.google.android.gms.internal.cast.u.d(M0, jVar2);
                    yVar.Q0(M0, 4);
                } catch (RemoteException e10) {
                    p5.g.f45637c.a(e10, "Unable to call %s on %s.", "addCastStateListener", y.class.getSimpleName());
                }
                this.f50824a = new v5.c(12);
                p5.g b10 = c3.b();
                this.f50825b = b10;
                b10.a(this);
                W(b10.c());
                return;
        }
    }

    public b(s1 s1Var) {
        this.f50824a = s1Var;
        ?? obj = new Object();
        obj.f6469a = 0;
        this.f50825b = obj;
    }

    public b(Animator animator) {
        this.f50824a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50825b = animatorSet;
        animatorSet.play(animator);
    }
}
