package xa;

import a8.e;
import ai.e6;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.Window;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import c3.j;
import ci.mb;
import ci.qc;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e2.d;
import e2.d0;
import e2.h;
import e2.v;
import e6.o;
import ei.y4;
import g6.i;
import g6.n;
import g6.q;
import g6.r;
import gg.a2;
import gg.b2;
import i4.g;
import ii.d3;
import ii.e2;
import ii.h1;
import ii.i1;
import ii.i2;
import ii.q5;
import ii.x3;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.regex.Pattern;
import l.k;
import l.w;
import n6.l;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.oq0;
import org.telegram.ui.fy;
import org.telegram.ui.zi0;
import pg.m;
import pg.t1;
import pg.u0;
import qg.v1;
import v7.i5;
public final class c implements s, oq0, a0, androidx.activity.result.b, ce.b, v1, v0, OnSuccessListener, SuccessContinuation, n, f6.a, fb.n, w, b2, z3.n, d5, h1 {
    public static volatile c f49810c;
    public final int f49811a;
    public Object f49812b;

    public c(r rVar, String[] strArr) {
        this.f49811a = 22;
        this.f49812b = strArr;
    }

    public static p D(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public int A() {
        return 2;
    }

    @Override
    public void B(Editable editable) {
        q5 q5Var = (q5) this.f49812b;
        ii.a aVar = q5Var.f12203a;
        if (aVar != null) {
            aVar.f12201s = true;
            aVar.f12200r = q5Var.f12596r.E;
        }
        q5Var.u();
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12203a != null) {
            d3Var.a();
        }
    }

    @Override
    public void C(ArrayList arrayList) {
        boolean z10;
        switch (this.f49811a) {
            case 23:
                jo0 jo0Var = (jo0) this.f49812b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    jo0Var.J.add(((a2) arrayList.get(i10)).f10512a);
                }
                fy fyVar = jo0Var.U;
                if (fyVar != null) {
                    if (jo0Var.D0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fyVar.d(z10, false);
                }
                jo0Var.l();
                return;
            default:
                return;
        }
    }

    @Override
    public void E(float f7) {
        mb mbVar = (mb) this.f49812b;
        u0.e(mbVar.F1).k(String.valueOf(m.f44526a.indexOf(mbVar.O0.getCurrentBrush())), f7);
        t1 t1Var = mbVar.A1;
        t1Var.f44632c = f7;
        mbVar.E0(t1Var, null, false);
    }

    @Override
    public void F(byte[] bArr, int i10, int i11, z3.m mVar, h hVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        v vVar = (v) this.f49812b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            if (vVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            d.a("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int j3 = vVar.j();
            if (vVar.j() == 1987343459) {
                int i12 = j3 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d.a("Incomplete vtt cue box header found.", z11);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    int i13 = j10 - 8;
                    byte[] bArr2 = vVar.f8589a;
                    int i14 = vVar.f8590b;
                    String str = d0.f8537a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    vVar.K(i13);
                    i12 = (i12 - 8) - i13;
                    if (j11 == 1937011815) {
                        g gVar = new g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (j11 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f7999a = charSequence;
                    aVar.f8000b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f11954a;
                    g gVar2 = new g();
                    gVar2.f11947c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                vVar.K(j3 - 8);
            }
        }
        hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public boolean G(boolean z10) {
        return false;
    }

    public dc.d H(com.google.firebase.messaging.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.H(com.google.firebase.messaging.m):dc.d");
    }

    public int I(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        fc.a aVar = (fc.a) this.f49812b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z10 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f9835a[aVar.f9840g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            fc.a aVar2 = fc.a.h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            fc.b bVar = new fc.b(aVar, iArr5);
            fc.b a2 = aVar.a(i10, 1);
            fc.b bVar2 = aVar.f9837c;
            if (a2.d() >= bVar.d()) {
                a2 = bVar;
                bVar = a2;
            }
            fc.b bVar3 = aVar.d;
            fc.b bVar4 = a2;
            fc.b bVar5 = bVar;
            fc.b bVar6 = bVar4;
            fc.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i10) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    fc.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    fc.b a10 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        fc.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a10;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                fc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                fc.b bVar10 = bVarArr[0];
                fc.b bVar11 = bVarArr[1];
                int d10 = bVar10.d();
                if (d10 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d10];
                    int i20 = 0;
                    for (int i21 = 1; i21 < aVar.f9838e && i20 < d10; i21++) {
                        if (bVar10.b(i21) == 0) {
                            iArr6[i20] = aVar.b(i21);
                            i20++;
                        }
                    }
                    if (i20 == d10) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i22 = 0; i22 < length3; i22++) {
                    int b12 = aVar.b(iArr3[i22]);
                    int i23 = 1;
                    for (int i24 = 0; i24 < length3; i24++) {
                        if (i22 != i24) {
                            int c12 = aVar.c(iArr3[i24], b12);
                            if ((c12 & 1) == 0) {
                                i11 = c12 | 1;
                            } else {
                                i11 = c12 & (-2);
                            }
                            i23 = aVar.c(i23, i11);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i23));
                    iArr7[i22] = c13;
                    if (aVar.f9840g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f9836b[i26];
                        if (i27 >= 0) {
                            iArr[i27] = iArr[i27] ^ iArr7[i25];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    public Set J() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f49812b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f49812b);
        }
        return unmodifiableSet;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f49811a) {
            case 27:
                ((ii.r) this.f49812b).G(i10, z10, i11, false, 0L);
                ii.r rVar = (ii.r) this.f49812b;
                zi0 zi0Var = rVar.O;
                if (zi0Var != null) {
                    zi0Var.i();
                    rVar.O = null;
                    return;
                }
                return;
            default:
                ((e2) this.f49812b).s0(i10, i11, z10);
                return;
        }
    }

    public void L() {
        ((u) this.f49812b).d.R();
    }

    @Override
    public void a(int i10) {
        boolean z10;
        switch (this.f49811a) {
            case 23:
                jo0 jo0Var = (jo0) this.f49812b;
                jo0Var.D0--;
                jo0Var.f10615e0 = i10;
                if (jo0Var.f10617f0 != i10) {
                    jo0Var.f10631s.clear();
                }
                if (jo0Var.f10618g0 != i10) {
                    jo0Var.I.clear();
                }
                jo0Var.N = true;
                fy fyVar = jo0Var.U;
                if (fyVar != null) {
                    if (jo0Var.D0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fyVar.d(z10, true);
                }
                jo0Var.l();
                fy fyVar2 = jo0Var.U;
                if (fyVar2 != null) {
                    fyVar2.c();
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new qc(this, 21));
                return;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f49811a) {
            case 1:
                e eVar = new e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f331a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f49812b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).G0(obtain, 2);
                return;
            default:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f49812b);
                iVar.T0(O0, 5);
                return;
        }
    }

    @Override
    public void b(i1 i1Var) {
        d3 d3Var = ((q5) this.f49812b).E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f12298a;
            x3.O1(x3Var, i1Var);
            x3Var.f12769o3.P(i1Var, true);
        }
    }

    @Override
    public void c(k kVar, boolean z10) {
        ((g.s) this.f49812b).g(kVar);
    }

    @Override
    public java.lang.Object d(ce.c r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.d(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public boolean e() {
        q5 q5Var = (q5) this.f49812b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12203a != null) {
            return d3Var.f12298a.U4();
        }
        return false;
    }

    @Override
    public void f(int i10, int i11) {
        i2 i2Var;
        q5 q5Var = (q5) this.f49812b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12203a != null && (i2Var = d3Var.f12298a.Q3) != null) {
            i2Var.f(i10, i11);
        }
    }

    public void g(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f49812b;
        long[] jArr = jVar.f4078e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f4078e[0]), jVar);
        }
    }

    @Override
    public float get() {
        mb mbVar = (mb) this.f49812b;
        int i10 = mbVar.F1;
        m currentBrush = mbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f44645i;
        }
        return u0.e(i10).f(String.valueOf(m.f44526a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public z3.d h(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }

    @Override
    public void i(k6.a aVar) {
        x xVar = (x) this.f49812b;
        xVar.f6658o.lock();
        try {
            xVar.f6655l = aVar;
            x.l(xVar);
        } finally {
            xVar.f6658o.unlock();
        }
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f49812b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f2083b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4203a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f2082a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    public void k(StringBuilder sb2, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) ((String) this.f49812b));
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override
    public void m(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int A = (int) a4.a.A(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (A - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, A, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.f49812b).e(bitmap2, 0);
    }

    @Override
    public boolean n(i1 i1Var) {
        return false;
    }

    @Override
    public void o(int i10) {
        k6.a aVar;
        x xVar = (x) this.f49812b;
        Lock lock = xVar.f6658o;
        lock.lock();
        try {
            if (!xVar.f6657n && (aVar = xVar.f6656m) != null && aVar.c()) {
                xVar.f6657n = true;
                xVar.f6650e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f6657n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f49812b).getClass();
        i5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f49812b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumSet type: " + type.toString());
    }

    @Override
    public void q(String str, long j3, long j10, long j11) {
        e6.p pVar = (e6.p) this.f49812b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e7) {
            g6.b bVar = e6.h.f8675k;
            Log.e(bVar.f10249a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e7);
        }
        Iterator it = pVar.f8700q.f8682i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override
    public void s(Bundle bundle) {
        x xVar = (x) this.f49812b;
        xVar.f6658o.lock();
        try {
            Bundle bundle2 = xVar.f6654k;
            if (bundle2 == null) {
                xVar.f6654k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f6655l = k6.a.f14662e;
            x.l(xVar);
        } finally {
            xVar.f6658o.unlock();
        }
    }

    @Override
    public void t(i1 i1Var, int i10, int i11) {
        d3 d3Var;
        q9 textSelectionHelper;
        q5 q5Var = (q5) this.f49812b;
        if (!q5Var.G && i10 != i11 && (d3Var = q5Var.E) != null && (textSelectionHelper = d3Var.f12298a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != q5Var) {
                q5Var.post(new y4(this, i1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        da.b bVar = (da.b) this.f49812b;
        c5.i iVar = (c5.i) bVar.f8183f;
        da.d dVar = (da.d) bVar.f8180b;
        String str = iVar.f4209a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.i.b(dVar);
            aa.a aVar = new aa.a(str, b10);
            aVar.q("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.q("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.i.a(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = iVar.c(aVar.i());
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a P = ((a6.i) bVar.f8181c).P(jSONObject);
            a4.m mVar = (a4.m) bVar.f8182e;
            long j3 = P.f8176c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) mVar.f297b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        w9.h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f8190f;
                        SharedPreferences.Editor edit = ((Context) bVar.f8179a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(P);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f8185i).get()).trySetResult(P);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    w9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                w9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            w9.h.c(fileWriter, "Failed to close settings writer.");
            da.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f8190f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f8179a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(P);
            ((TaskCompletionSource) ((AtomicReference) bVar.f8185i).get()).trySetResult(P);
        }
        return Tasks.forResult(null);
    }

    @Override
    public void u(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.u(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public boolean v(k kVar) {
        Window.Callback callback = ((g.s) this.f49812b).f10102f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public a0.i w() {
        switch (this.f49811a) {
            case 23:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.w0(java.lang.Object):void");
    }

    @Override
    public void x(CharSequence charSequence) {
        d3 d3Var = ((q5) this.f49812b).E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f12298a.v4(charSequence.toString());
        }
    }

    @Override
    public void x0() {
        e6.j0((e6) this.f49812b);
    }

    @Override
    public a0.i y() {
        switch (this.f49811a) {
            case 23:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean z(int i10) {
        switch (this.f49811a) {
            case 23:
                if (i10 == ((jo0) this.f49812b).f10613d0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public c(Object obj, int i10) {
        this.f49811a = i10;
        this.f49812b = obj;
    }

    public c(int i10) {
        this.f49811a = i10;
        switch (i10) {
            case 6:
                return;
            case 7:
                this.f49812b = new LinkedHashMap();
                return;
            case 11:
                this.f49812b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 24:
                this.f49812b = new c(fc.a.h, 20);
                return;
            case 26:
                this.f49812b = new v();
                return;
            default:
                this.f49812b = new HashSet();
                return;
        }
    }

    public c(String str) {
        this.f49811a = 15;
        str.getClass();
        this.f49812b = str;
    }

    @Override
    public void V() {
    }

    @Override
    public void r() {
    }

    @Override
    public void reset() {
    }

    private final void M(ArrayList arrayList) {
    }

    @Override
    public void l(i1 i1Var) {
    }
}
