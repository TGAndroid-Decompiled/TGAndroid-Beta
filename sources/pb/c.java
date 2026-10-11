package pb;

import ae.m;
import ai.bc;
import ai.f6;
import ai.j;
import ai.p8;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.g;
import androidx.biometric.p;
import androidx.fragment.app.c0;
import androidx.fragment.app.k0;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import c6.d0;
import c6.e0;
import ci.b7;
import ci.j6;
import ci.l0;
import ci.l8;
import ci.lc;
import ci.nb;
import ci.pc;
import ci.zb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.w4;
import fb.n;
import g6.f;
import g6.q;
import g6.r;
import g6.w;
import h7.d;
import h7.e;
import ii.d3;
import ii.e2;
import ii.h1;
import ii.i2;
import ii.q5;
import ii.x3;
import j6.l;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k2.g0;
import l.i;
import l.k;
import lg.o;
import m.f3;
import m.i1;
import n4.x;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.l81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lv0;
import qg.b2;
import v7.a8;
public final class c implements lv0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, s, o, pc, OnCompleteListener, f6.a, n, i1, f5, h1, k2.n, i {
    public final int f45611a;
    public final Object f45612b;

    public c(r rVar, String[] strArr) {
        this.f45611a = 21;
        this.f45612b = strArr;
    }

    @Override
    public boolean A(k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.f45612b).P;
        if (kVar2 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((g0) kVar2).f14469b).W.d).iterator();
            while (it.hasNext()) {
                if (((c0) it.next()).f2674a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void B(long j3) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5430r0 = j3;
        l8Var.f5414j = true;
        b7Var.y(true);
    }

    @Override
    public void C(boolean z10) {
        b2 b2Var;
        lc lcVar = ((zb) ((b7) this.f45612b)).C0;
        nb nbVar = lcVar.f5526v1;
        if (nbVar != null) {
            b2 b2Var2 = null;
            if (!z10 && (nbVar.getSelectedEntity() instanceof b2)) {
                lcVar.f5526v1.C0(null, true);
            } else if (z10 && !(lcVar.f5526v1.getSelectedEntity() instanceof b2)) {
                j6 j6Var = lcVar.f5526v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < j6Var.getChildCount()) {
                        View childAt = j6Var.getChildAt(i11);
                        if (childAt instanceof b2) {
                            b2Var = (b2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        b2Var = null;
                        break;
                    }
                }
                if (b2Var != null) {
                    nb nbVar2 = lcVar.f5526v1;
                    j6 j6Var2 = nbVar2.R0;
                    while (true) {
                        if (i10 >= j6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = j6Var2.getChildAt(i10);
                        if (childAt2 instanceof b2) {
                            b2Var2 = (b2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    nbVar2.C0(b2Var2, true);
                }
            }
        }
    }

    @Override
    public void E(CharSequence charSequence) {
        d3 d3Var = ((q5) this.f45612b).E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f12346a.u4(charSequence.toString());
        }
    }

    public aa.a F(pf.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: pb.c.F(pf.b):aa.a");
    }

    @Override
    public void G(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void H(MessageObject messageObject) {
        ((bc) ((f6) this.f45612b).Q1).f(false);
    }

    @Override
    public void I(float f7) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.F = f7;
        l8Var.f5414j = true;
        b7Var.w(true);
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((e2) this.f45612b).s0(i10, i11, z10);
    }

    @Override
    public void K(float f7) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.E = f7;
        l8Var.f5414j = true;
        b7Var.w(true);
    }

    @Override
    public void L(Editable editable) {
        q5 q5Var = (q5) this.f45612b;
        ii.a aVar = q5Var.f12250a;
        if (aVar != null) {
            aVar.f12248s = true;
            aVar.f12247r = q5Var.f12643r.E;
        }
        q5Var.u();
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12250a != null) {
            d3Var.a();
        }
    }

    @Override
    public void M(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public boolean N(boolean z10) {
        return false;
    }

    @Override
    public void O(float f7) {
        l8 l8Var = ((b7) this.f45612b).d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5394a0 = f7;
        l8Var.f5414j = true;
    }

    @Override
    public void P(int i10, long j3, long j10) {
        x xVar = ((FfmpegAudioRenderer) this.f45612b).I;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new k2.i(xVar, i10, j3, j10, 0));
        }
    }

    @Override
    public void Q() {
        ((b7) this.f45612b).q(null);
    }

    @Override
    public void S(float f7) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5434t0 = f7;
        l8Var.f5414j = true;
        b7Var.y(true);
    }

    @Override
    public void T(int i10, long j3) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public void V(long j3) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.D = j3;
        l8Var.f5414j = true;
        b7Var.w(true);
    }

    @Override
    public void W(Object obj) {
        int i10 = this.f45611a;
        Object obj2 = this.f45612b;
        switch (i10) {
            case 4:
                p pVar = (p) obj2;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    androidx.biometric.x xVar = pVar.f2317l0;
                    if (!xVar.f2334n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = xVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new g(pVar, 0));
                    }
                    androidx.biometric.x xVar2 = pVar.f2317l0;
                    if (xVar2.f2341u == null) {
                        xVar2.f2341u = new z();
                    }
                    androidx.biometric.x.h(xVar2.f2341u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) obj2;
                if (((t) obj) != null && pVar2.f2746r0) {
                    pVar2.getClass();
                    throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    public int X(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        fc.a aVar = (fc.a) this.f45612b;
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
                int i17 = aVar.f9846a[aVar.f9851g + i16];
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
            fc.b bVar2 = aVar.f9848c;
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
                    for (int i21 = 1; i21 < aVar.f9849e && i20 < d10; i21++) {
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
                    if (aVar.f9851g != 0) {
                        iArr7[i22] = aVar.c(c13, b12);
                    }
                }
                for (int i25 = 0; i25 < iArr3.length; i25++) {
                    int length4 = iArr.length - 1;
                    int i26 = iArr3[i25];
                    if (i26 != 0) {
                        int i27 = length4 - aVar.f9847b[i26];
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

    public Boolean Y() {
        Bundle bundle = (Bundle) this.f45612b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public void Z() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f45612b;
        synchronized (ffmpegAudioRenderer.f11643a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public void a(long j3) {
        x xVar = ((FfmpegAudioRenderer) this.f45612b).I;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new j(xVar, j3, 13));
        }
    }

    public boolean a0() {
        x0 x0Var = ((j0) this.f45612b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f45611a;
        Object obj3 = this.f45612b;
        switch (i10) {
            case 11:
                w wVar = (w) obj;
                f fVar = (f) wVar.u();
                d0 d0Var = ((e0) obj3).f4346k;
                Parcel N0 = fVar.N0();
                v.d(N0, d0Var);
                fVar.S0(N0, 18);
                f fVar2 = (f) wVar.u();
                fVar2.S0(fVar2.N0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 21:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel N02 = iVar.N0();
                v.d(N02, qVar);
                N02.writeStringArray((String[]) obj3);
                iVar.S0(N02, 6);
                return;
            case 23:
                h7.f fVar3 = new h7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f46109a;
                obtain.writeStrongBinder(fVar3);
                q7.a.b(obtain, (GetCredentialRequest) obj3);
                q7.a.b(obtain, gVar);
                ((h7.b) ((d) ((e) obj).u())).F0(obtain, 1);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) obj3).f12036k;
                Parcel J0 = iVar2.J0();
                int i12 = i7.f.f12040a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar2.K0(J0, 2);
                return;
        }
    }

    @Override
    public void b(int i10) {
        ci.e0 e0Var = ((b7) this.f45612b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ci.d0 d0Var = (ci.d0) obj;
                if (d0Var.f4878a == i10) {
                    d0Var.f4879b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    public JSONObject b0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f45612b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(w9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        w9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    w9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void c(ii.i1 i1Var) {
        d3 d3Var = ((q5) this.f45612b).E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f12346a;
            x3.N1(x3Var, i1Var);
            x3Var.f12808f3.x(i1Var, true);
        }
    }

    @Override
    public void d() {
        ((FfmpegAudioRenderer) this.f45612b).f2947f0 = true;
    }

    @Override
    public TextureView d0() {
        return null;
    }

    @Override
    public void e(float f7) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5436u0 = f7;
        l8Var.f5414j = true;
        b7Var.c();
    }

    @Override
    public boolean f() {
        q5 q5Var = (q5) this.f45612b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12250a != null) {
            return d3Var.f12346a.T4();
        }
        return false;
    }

    @Override
    public void f0(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        x xVar = ((FfmpegAudioRenderer) this.f45612b).I;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new k2.f(xVar, exc, 1));
        }
    }

    @Override
    public void g(float f7) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.G = f7;
        l8Var.f5414j = true;
        b7Var.c();
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(long j3, boolean z10) {
        b7 b7Var = (b7) this.f45612b;
        if (!z10) {
            b7Var.m(j3);
            return;
        }
        l81 l81Var = b7Var.f4762e;
        if (l81Var != null) {
            l81Var.L(j3, true);
        } else if (b7Var.j()) {
            b7Var.E.m(j3, true);
        } else {
            l81 l81Var2 = b7Var.f4788y;
            if (l81Var2 != null) {
                l81Var2.L(j3, false);
            }
        }
    }

    @Override
    public void i(int i10, int i11) {
        i2 i2Var;
        q5 q5Var = (q5) this.f45612b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12250a != null && (i2Var = d3Var.f12346a.H3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        switch (this.f45611a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                k0 k0Var = (k0) this.f45612b;
                androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollFirst();
                if (g0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = g0Var.f2688a;
                int i10 = g0Var.f2689b;
                androidx.fragment.app.s l4 = k0Var.f2699c.l(str);
                if (l4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                l4.x(i10, aVar.f2160a, aVar.f2161b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f45612b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2161b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f4253a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2160a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void k0() {
        ((FfmpegAudioRenderer) this.f45612b).Z = true;
    }

    @Override
    public void l(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int B = (int) a1.g.B(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (B - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, B, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.f45612b).e(bitmap2, 0);
    }

    @Override
    public boolean m(ii.i1 i1Var) {
        return false;
    }

    @Override
    public void n(k kVar) {
        f3 f3Var = ((ActionMenuView) this.f45612b).K;
        if (f3Var != null) {
            f3Var.n(kVar);
        }
    }

    @Override
    public void o() {
        b7 b7Var = (b7) this.f45612b;
        b7Var.s(null, null, true);
        lc lcVar = ((zb) b7Var).C0;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.s(null, null, true);
        }
        nb nbVar = lcVar.f5526v1;
        if (nbVar != null) {
            nbVar.p0();
        }
        ci.bc bcVar = lcVar.f5466c1;
        if (bcVar != null) {
            bcVar.setHasRoundVideo(false);
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null) {
            File file = l8Var.f5424o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.K1.f5424o0 = null;
            }
            if (lcVar.K1.f5426p0 != null) {
                try {
                    new File(lcVar.K1.f5426p0).delete();
                } catch (Exception unused2) {
                }
                lcVar.K1.f5426p0 = null;
            }
        }
    }

    @Override
    public void o0(k2.k kVar) {
        x xVar = ((FfmpegAudioRenderer) this.f45612b).I;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new k2.h(xVar, kVar, 0));
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        x xVar = ((FfmpegAudioRenderer) this.f45612b).I;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new p8(xVar, i10, 11));
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f45611a) {
            case 15:
                d6.c.h((d6.c) ((d6.j) this.f45612b).f8196c, "joinApplication", task);
                return;
            default:
                m mVar = (m) this.f45612b;
                Exception exception = task.getException();
                if (exception == null) {
                    if (task.isCanceled()) {
                        mVar.n(null);
                        return;
                    } else {
                        mVar.resumeWith(task.getResult());
                        return;
                    }
                }
                mVar.resumeWith(a8.a(exception));
                return;
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: pb.c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        x xVar = ((FfmpegAudioRenderer) this.f45612b).I;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new bi.f(8, xVar, z10));
        }
    }

    @Override
    public void p(float f7) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.f5432s0 = f7;
        l8Var.f5414j = true;
        b7Var.y(true);
    }

    @Override
    public void q(boolean z10) {
        b7 b7Var = (b7) this.f45612b;
        if (b7Var.j()) {
            b7Var.E.getClass();
        }
        b7Var.x(-4, z10);
    }

    @Override
    public boolean r(ii.i1 i1Var) {
        return false;
    }

    @Override
    public void s(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var != null && (arrayList = l8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((l8) b7Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public void t() {
        ((l0) this.f45612b).f5368e.invalidate();
    }

    @Override
    public Object v2() {
        Type type = (Type) this.f45612b;
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
    public void w(float f7) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.P = f7;
        b7Var.c();
    }

    @Override
    public void w0(MessageObject messageObject) {
        ((bc) ((f6) this.f45612b).Q1).f(true);
    }

    @Override
    public void x(ii.i1 i1Var, int i10, int i11) {
        d3 d3Var;
        o9 textSelectionHelper;
        q5 q5Var = (q5) this.f45612b;
        if (!q5Var.G && i10 != i11 && (d3Var = q5Var.E) != null && (textSelectionHelper = d3Var.f12346a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != q5Var) {
                q5Var.post(new w4(this, i1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public void y(float f7, boolean z10) {
        b7 b7Var = (b7) this.f45612b;
        l8 l8Var = b7Var.d;
        if (l8Var != null) {
            l8Var.Z = f7;
            l8Var.f5414j = true;
            l81 l81Var = b7Var.f4762e;
            if (l81Var != null && l81Var.p() != -9223372036854775807L) {
                b7Var.m(f7 * ((float) b7Var.f4762e.p()));
            }
        }
    }

    public void z(l lVar, androidx.biometric.t tVar) {
        Object obj = this.f45612b;
        androidx.fragment.app.l0 l0Var = (androidx.fragment.app.l0) obj;
        if (l0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (l0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            androidx.fragment.app.l0 l0Var2 = (androidx.fragment.app.l0) obj;
            p pVar = (p) l0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(l0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                l0Var2.A(true);
                l0Var2.E();
            }
            androidx.fragment.app.v k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            androidx.biometric.x xVar = pVar.f2317l0;
            xVar.f2327f = lVar;
            int i10 = lVar.f14060a;
            if (i10 == 0) {
                if (tVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && tVar == null) {
                xVar.f2328g = v7.m.a();
            } else {
                xVar.f2328g = tVar;
            }
            if (pVar.Q()) {
                pVar.f2317l0.f2331k = pVar.q(2131689576);
            } else {
                pVar.f2317l0.f2331k = null;
            }
            if (pVar.Q() && new aa.a(new k6.h(k10, 1)).f(255) != 0) {
                pVar.f2317l0.f2334n = true;
                pVar.S();
            } else if (pVar.f2317l0.f2336p) {
                pVar.f2316k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public void z0(k2.k kVar) {
        x xVar = ((FfmpegAudioRenderer) this.f45612b).I;
        Handler handler = (Handler) xVar.f16694b;
        if (handler != null) {
            handler.post(new k2.h(xVar, kVar, 1));
        }
    }

    public c(Object obj, int i10) {
        this.f45611a = i10;
        this.f45612b = obj;
    }

    public c(Set set) {
        this.f45611a = 0;
        this.f45612b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f45612b).put(a.class, bVar.f45610a);
        }
    }

    public c(Context context) {
        this.f45611a = 9;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f45612b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(ba.c cVar) {
        this.f45611a = 16;
        this.f45612b = new File(cVar.f3800b, "com.crashlytics.settings.json");
    }

    public c() {
        this.f45611a = 22;
        this.f45612b = new xa.c(21);
    }

    public c(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.f45611a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            androidx.fragment.app.l0 s10 = launchActivity.s();
            androidx.biometric.x xVar = (androidx.biometric.x) new aa.a(launchActivity).j(androidx.biometric.x.class);
            this.f45612b = s10;
            xVar.d = executor;
            xVar.f2326e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void U() {
    }

    @Override
    public void u() {
    }

    @Override
    public void v() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void k(ii.i1 i1Var) {
    }
}
