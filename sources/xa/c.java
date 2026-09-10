package xa;

import a0.i;
import a4.m;
import a8.e;
import a8.g;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import bi.ad;
import bi.ce;
import bi.e8;
import bi.ge;
import bi.i0;
import bi.j0;
import bi.j7;
import bi.nd;
import bi.q0;
import bi.qd;
import bi.r9;
import bi.va;
import bi.wc;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.s0;
import ei.t0;
import fb.n;
import fg.c2;
import fg.l1;
import g.r;
import hi.g2;
import hi.g6;
import hi.k1;
import hi.k2;
import hi.l0;
import hi.m3;
import hi.m4;
import hi.s3;
import hi.t3;
import hi.w3;
import hi.x3;
import hi.x4;
import hi.y1;
import hi.y3;
import hi.z3;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import k2.f;
import k2.h0;
import k2.k;
import kg.o;
import l.l;
import l.x;
import m.r3;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import pg.b2;
import r2.j;
import v7.a7;
import w9.h;
import x2.p;
public final class c implements s, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, o, ge, OnCompleteListener, s0, n, c2, x, l0, x3, k2.n {
    public static volatile c f45075c;
    public final int f45076a;
    public Object f45077b;

    public c(Object obj, int i10) {
        this.f45076a = i10;
        this.f45077b = obj;
    }

    @Override
    public void A() {
        ((q0) this.f45077b).e.invalidate();
    }

    @Override
    public void B(float f7, int i10) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var != null && (arrayList = r9Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((r9) e8Var.d.T.get(i10)).P = f7;
        }
    }

    public JSONObject B0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f45077b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public float C0(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = (-abs) / 2;
        int i23 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i23 = 1;
        }
        int i24 = i16 + i18;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if (z10) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z10) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z12 = z10;
            if (i27 == i21) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i28 = abs;
            if (z11 == ((dc.b) this.f45077b).b(i19, i20)) {
                if (i27 == 2) {
                    return a7.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i26 == i17) {
                    break;
                }
                i26 += i23;
                i22 -= i28;
            }
            i25 += i18;
            abs = i28;
            z10 = z12;
            i21 = 1;
        }
        if (i27 == 2) {
            return a7.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public i D() {
        switch (this.f45076a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    public float D0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.f45077b;
        float C0 = C0(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f6389a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f7 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f6390b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (C0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + C0) - 1.0f;
    }

    @Override
    public s9 E() {
        switch (this.f45076a) {
            case 23:
                t3 t3Var = ((hi.a0) this.f45077b).O;
                if (t3Var != null) {
                    return t3Var.f9859a.getTextSelectionHelper();
                }
                return null;
            default:
                s3 s3Var = ((x4) this.f45077b).N;
                if (s3Var != null) {
                    return s3Var.f9848a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void F() {
        boolean z10;
        ei.s sVar = (ei.s) this.f45077b;
        le.b bVar = sVar.f7614a;
        t0 t0Var = sVar.v;
        if (t0Var.f7633n && t0Var.f7631l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.Y2.N(true);
    }

    @Override
    public void H(float f7) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.P = f7;
        e8Var.c();
    }

    @Override
    public void I(float f7, boolean z10) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var != null) {
            r9Var.Z = f7;
            r9Var.f3579j = true;
            t71 t71Var = e8Var.e;
            if (t71Var != null && t71Var.p() != -9223372036854775807L) {
                e8Var.m(f7 * ((float) e8Var.e.p()));
            }
        }
    }

    @Override
    public void J(CharSequence charSequence) {
        switch (this.f45076a) {
            case 23:
                t3 t3Var = ((hi.a0) this.f45077b).O;
                if (t3Var != null) {
                    t3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        t3Var.f9859a.s4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                s3 s3Var = ((x4) this.f45077b).N;
                if (s3Var != null) {
                    s3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        s3Var.f9848a.s4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void L() {
        p pVar;
        h0 h0Var = (h0) this.f45077b;
        synchronized (h0Var.f10173a) {
            pVar = h0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override
    public org.telegram.ui.Cells.r9 M() {
        switch (this.f45076a) {
            case 23:
                return (hi.a0) this.f45077b;
            default:
                return (x4) this.f45077b;
        }
    }

    @Override
    public hi.a O() {
        switch (this.f45076a) {
            case 23:
                return ((hi.a0) this.f45077b).f9464a;
            default:
                return ((x4) this.f45077b).f9464a;
        }
    }

    @Override
    public i P() {
        switch (this.f45076a) {
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Q(long j3) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.f3595r0 = j3;
        r9Var.f3579j = true;
        e8Var.y(true);
    }

    @Override
    public boolean R() {
        switch (this.f45076a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.f45077b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.f9464a;
                    if (t3Var.f9859a.R4()) {
                        return true;
                    }
                }
                return false;
            default:
                x4 x4Var = (x4) this.f45077b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.f9464a;
                    if (s3Var.f9848a.R4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void S(boolean z10) {
        b2 b2Var;
        ce ceVar = ((nd) ((e8) this.f45077b)).C0;
        ad adVar = ceVar.f2498v1;
        if (adVar != null) {
            b2 b2Var2 = null;
            if (!z10 && (adVar.getSelectedEntity() instanceof b2)) {
                ceVar.f2498v1.D0(null, true);
            } else if (z10 && !(ceVar.f2498v1.getSelectedEntity() instanceof b2)) {
                j7 j7Var = ceVar.f2498v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < j7Var.getChildCount()) {
                        View childAt = j7Var.getChildAt(i11);
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
                    ad adVar2 = ceVar.f2498v1;
                    j7 j7Var2 = adVar2.R0;
                    while (true) {
                        if (i10 >= j7Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = j7Var2.getChildAt(i10);
                        if (childAt2 instanceof b2) {
                            b2Var2 = (b2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    adVar2.D0(b2Var2, true);
                }
            }
        }
    }

    @Override
    public void T(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        of.b bVar = ((h0) this.f45077b).Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new f(bVar, exc, 1));
        }
    }

    @Override
    public void U(int i10, int i11) {
        switch (this.f45076a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.f45077b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.f9464a;
                    k2 k2Var = t3Var.f9859a.J3;
                    if (k2Var != null) {
                        k2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                x4 x4Var = (x4) this.f45077b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.f9464a;
                    k2 k2Var2 = s3Var.f9848a.J3;
                    if (k2Var2 != null) {
                        k2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void V(float f7, int i10) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var != null && (arrayList = r9Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((r9) e8Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void W() {
        ((h0) this.f45077b).f12144h1 = true;
    }

    @Override
    public void X(float f7) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.F = f7;
        r9Var.f3579j = true;
        e8Var.w(true);
    }

    @Override
    public void Y() {
        g2 g2Var = (g2) this.f45077b;
        int i10 = 0;
        g2.Z(g2Var, false, true);
        int i11 = g2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        g2Var.x0(i10, true);
    }

    @Override
    public void Z(k kVar) {
        of.b bVar = ((h0) this.f45077b).Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new k2.h(bVar, kVar, 0));
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f45076a) {
            case 19:
                ((l1) this.f45077b).l();
                return;
            default:
                AndroidUtilities.runOnUIThread(new wc(this, 27));
                return;
        }
    }

    @Override
    public w70 a0(View view) {
        return w70.H((g2) this.f45077b, view);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        e eVar = new e(0, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i10 = a8.a.f304a;
        obtain.writeStrongBinder(eVar);
        obtain.writeInt(1);
        ((l8.a) this.f45077b).writeToParcel(obtain, 0);
        ((a8.c) ((g) obj).u()).G0(obtain, 2);
    }

    @Override
    public void b(k1 k1Var) {
        switch (this.f45076a) {
            case 23:
                t3 t3Var = ((hi.a0) this.f45077b).O;
                if (t3Var != null) {
                    z3 z3Var = t3Var.f9859a;
                    z3.L1(z3Var, k1Var);
                    z3Var.f10001h3.C(k1Var, true);
                    return;
                }
                return;
            default:
                s3 s3Var = ((x4) this.f45077b).N;
                if (s3Var != null) {
                    z3 z3Var2 = s3Var.f9848a;
                    z3.L1(z3Var2, k1Var);
                    z3Var2.f10001h3.C(k1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void b0() {
        switch (this.f45076a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.f45077b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.f9464a;
                    z3 z3Var = t3Var.f9859a;
                    k2 k2Var = z3Var.J3;
                    if (k2Var != null) {
                        k2Var.g();
                    }
                    z3Var.f10001h3.onContentChanged();
                    return;
                }
                return;
            default:
                x4 x4Var = (x4) this.f45077b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.f9464a;
                    z3 z3Var2 = s3Var.f9848a;
                    k2 k2Var2 = z3Var2.J3;
                    if (k2Var2 != null) {
                        k2Var2.g();
                    }
                    z3Var2.f10001h3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void c(l lVar, boolean z10) {
        boolean z11;
        int i10;
        r rVar;
        g.s sVar = (g.s) this.f45077b;
        l k10 = lVar.k();
        int i11 = 0;
        if (k10 != lVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            lVar = k10;
        }
        r[] rVarArr = sVar.U;
        if (rVarArr != null) {
            i10 = rVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                rVar = rVarArr[i11];
                if (rVar != null && rVar.h == lVar) {
                    break;
                }
                i11++;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (z11) {
                sVar.f(rVar.f8405a, rVar, k10);
                sVar.h(rVar, true);
                return;
            }
            sVar.h(rVar, z10);
        }
    }

    @Override
    public boolean c0(int i10) {
        switch (this.f45076a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void close() {
        ((ei.s) this.f45077b).finishFragment();
    }

    @Override
    public void d(int i10) {
        j0 j0Var = ((e8) this.f45077b).E;
        if (j0Var != null) {
            ArrayList arrayList = j0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                i0 i0Var = (i0) obj;
                if (i0Var.f2825a == i10) {
                    i0Var.f2826b.d(1.0f, true);
                    j0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void d0(float f7) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.E = f7;
        r9Var.f3579j = true;
        e8Var.w(true);
    }

    @Override
    public void e(long j3) {
        of.b bVar = ((h0) this.f45077b).Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new va(bVar, j3, 7));
        }
    }

    @Override
    public void e0() {
        g2 g2Var = (g2) this.f45077b;
        g2Var.z0();
        g2Var.C0();
    }

    @Override
    public boolean f(float f7) {
        boolean z10;
        g2 g2Var = (g2) this.f45077b;
        FrameLayout frameLayout = g2Var.f9606v0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f7 >= iArr[1]) {
                z10 = true;
                g2.Z(g2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        g2.Z(g2Var, z10, true);
        return z10;
    }

    @Override
    public void f0(float f7, int i10) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var != null && (arrayList = r9Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((r9) e8Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void g() {
        switch (this.f45076a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.f45077b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    z3.O1(t3Var.f9859a, a0Var.f9464a);
                    return;
                }
                return;
            default:
                x4 x4Var = (x4) this.f45077b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    z3.O1(s3Var.f9848a, x4Var.f9464a);
                    return;
                }
                return;
        }
    }

    @Override
    public void g0(float f7) {
        r9 r9Var = ((e8) this.f45077b).d;
        if (r9Var == null) {
            return;
        }
        r9Var.f3560a0 = f7;
        r9Var.f3579j = true;
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(g6 g6Var, String str) {
        g2 g2Var = (g2) this.f45077b;
        if (g2Var.f9613z0 == null) {
            g2Var.f9613z0 = new r3(new y1(this, 0), g2Var.getResourceProvider());
        }
        g2Var.f9613z0.d(g6Var, str);
    }

    @Override
    public void h0() {
        ((e8) this.f45077b).q(null);
    }

    @Override
    public void i(float f7) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.f3601u0 = f7;
        r9Var.f3579j = true;
        e8Var.c();
    }

    @Override
    public void j(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f45077b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.f1105a;
        int i10 = f0Var.f1106b;
        androidx.fragment.app.s l4 = j0Var.f1119c.l(str);
        if (l4 == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        l4.x(i10, aVar.f602a, aVar.f603b);
    }

    @Override
    public void j0() {
        i2.h0 h0Var = ((h0) this.f45077b).W;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public void k(hi.a aVar) {
        g2 g2Var = (g2) this.f45077b;
        if (aVar != null && (aVar.f9421b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(g2Var)) {
            yi yiVar = new yi(g2Var.getParentActivity(), g2Var, false, false, false, g2Var.getResourceProvider());
            yiVar.Z1 = new qb.b(10);
            yiVar.P = true;
            yiVar.f29424x1.setVisibility(8);
            yiVar.f29411t2 = new androidx.car.app.utils.a(g2Var, aVar, yiVar, 9);
            yiVar.r1();
            yiVar.show();
        }
    }

    @Override
    public void k0(ArrayList arrayList) {
        switch (this.f45076a) {
            case 19:
                l1 l1Var = (l1) this.f45077b;
                String str = l1Var.Z;
                if (str != null) {
                    l1Var.U(str, l1Var.f8105c0, l1Var.f8106d0, l1Var.f8103b0, l1Var.f8102a0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void l() {
        ((h0) this.f45077b).f12146j1 = true;
    }

    @Override
    public void l0(float f7) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.f3599t0 = f7;
        r9Var.f3579j = true;
        e8Var.y(true);
    }

    @Override
    public void m(float f7) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.G = f7;
        r9Var.f3579j = true;
        e8Var.c();
    }

    @Override
    public void n(long j3, boolean z10) {
        e8 e8Var = (e8) this.f45077b;
        if (!z10) {
            e8Var.m(j3);
            return;
        }
        t71 t71Var = e8Var.e;
        if (t71Var != null) {
            t71Var.L(j3, true);
        } else if (e8Var.j()) {
            e8Var.E.m(j3, true);
        } else {
            t71 t71Var2 = e8Var.f2663y;
            if (t71Var2 != null) {
                t71Var2.L(j3, false);
            }
        }
    }

    @Override
    public void n0(int i10, long j3) {
        ArrayList arrayList;
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var != null && (arrayList = r9Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((r9) e8Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public Object n2() {
        Class cls = (Class) this.f45077b;
        try {
            return fb.s.f7935a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override
    public void o(y3 y3Var, View view) {
        g2 g2Var = (g2) this.f45077b;
        w70 H = w70.H(g2Var, view);
        H.Q = true;
        g2Var.getParentActivity();
        g2Var.getResourceProvider();
        g2Var.f9610x0 = m4.b(H, g2Var, y3Var, false);
    }

    @Override
    public void o0(k kVar) {
        of.b bVar = ((h0) this.f45077b).Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new k2.h(bVar, kVar, 1));
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        j jVar;
        h0 h0Var = (h0) this.f45077b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = h0Var.f12137a1) != null) {
            jVar.d(i10);
        }
        of.b bVar = h0Var.Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new bi.s(bVar, i10, 10));
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f45077b).f6322c, "joinApplication", task);
    }

    @Override
    public void onContentChanged() {
        g2 g2Var = (g2) this.f45077b;
        if (g2Var.f9612y0 != null) {
            boolean l32 = g2Var.P.l3();
            g2Var.L0 = l32;
            g2Var.f9612y0.h(l32);
            g2Var.f9612y0.invalidate();
        }
        g2Var.C0();
        Runnable runnable = g2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        of.b bVar = ((h0) this.f45077b).Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new ai.j(7, bVar, z10));
        }
    }

    @Override
    public void p() {
        i2.h0 h0Var = ((h0) this.f45077b).W;
        if (h0Var != null) {
            h0Var.f10218a.f10292g0 = true;
        }
    }

    @Override
    public void p0() {
        switch (this.f45076a) {
            case 23:
                hi.a0 a0Var = (hi.a0) this.f45077b;
                t3 t3Var = a0Var.O;
                if (t3Var != null) {
                    hi.a aVar = a0Var.f9464a;
                    z3.N1(t3Var.f9859a);
                    return;
                }
                return;
            default:
                x4 x4Var = (x4) this.f45077b;
                s3 s3Var = x4Var.N;
                if (s3Var != null) {
                    hi.a aVar2 = x4Var.f9464a;
                    z3.N1(s3Var.f9848a);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(int i10) {
        ((g2) this.f45077b).o0(74, i10);
    }

    @Override
    public void q0(long j3) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.D = j3;
        r9Var.f3579j = true;
        e8Var.w(true);
    }

    @Override
    public void r() {
        e8 e8Var = (e8) this.f45077b;
        e8Var.s(null, null, true);
        ce ceVar = ((nd) e8Var).C0;
        nd ndVar = ceVar.X0;
        if (ndVar != null) {
            ndVar.s(null, null, true);
        }
        ad adVar = ceVar.f2498v1;
        if (adVar != null) {
            adVar.q0();
        }
        qd qdVar = ceVar.f2439c1;
        if (qdVar != null) {
            qdVar.setHasRoundVideo(false);
        }
        r9 r9Var = ceVar.K1;
        if (r9Var != null) {
            File file = r9Var.f3589o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                ceVar.K1.f3589o0 = null;
            }
            if (ceVar.K1.f3591p0 != null) {
                try {
                    new File(ceVar.K1.f3591p0).delete();
                } catch (Exception unused2) {
                }
                ceVar.K1.f3591p0 = null;
            }
        }
    }

    @Override
    public void r0(Object obj) {
        switch (this.f45076a) {
            case 3:
                androidx.biometric.p pVar = (androidx.biometric.p) this.f45077b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(2131689613));
                    }
                    y yVar = pVar.f753l0;
                    if (!yVar.f770n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    }
                    y yVar2 = pVar.f753l0;
                    if (yVar2.f777u == null) {
                        yVar2.f777u = new z();
                    }
                    y.h(yVar2.f777u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.f45077b;
                if (tVar != null && pVar2.f1172r0) {
                    pVar2.getClass();
                    throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public void s() {
        int i10;
        g2 g2Var = (g2) this.f45077b;
        m3 m3Var = g2Var.P.f10011n3;
        if (m3Var != null && m3Var.y() && g2Var.P.B4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        g2Var.x0(i10, true);
        g2Var.y0();
        g2Var.w0();
    }

    public void s0(j6.l lVar, u uVar) {
        k0 k0Var = (k0) this.f45077b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f45077b;
            androidx.biometric.p pVar = (androidx.biometric.p) k0Var2.D("androidx.biometric.BiometricFragment");
            if (pVar == null) {
                pVar = new androidx.biometric.p();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            v k10 = pVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            y yVar = pVar.f753l0;
            yVar.f763f = lVar;
            int i10 = lVar.f11801a;
            if (i10 == 0) {
                if (uVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && i11 < 30 && i10 == 15 && uVar == null) {
                yVar.f764g = v7.o.a();
            } else {
                yVar.f764g = uVar;
            }
            if (pVar.Q()) {
                pVar.f753l0.f767k = pVar.q(2131689576);
            } else {
                pVar.f753l0.f767k = null;
            }
            if (pVar.Q() && new aa.a(new androidx.biometric.s(k10, 0)).f(255) != 0) {
                pVar.f753l0.f770n = true;
                pVar.S();
            } else if (pVar.f753l0.f772p) {
                pVar.f752k0.postDelayed(new androidx.biometric.o(pVar), 600L);
            } else {
                pVar.X();
            }
        }
    }

    @Override
    public void t(w3 w3Var, View view) {
        g2 g2Var = (g2) this.f45077b;
        w70 H = w70.H(g2Var, view);
        H.Q = true;
        g2Var.f9610x0 = m4.c(H, g2Var, g2Var.getParentActivity(), g2Var.getResourceProvider(), w3Var, false);
    }

    public c6.o t0() {
        c6.o oVar = (c6.o) this.f45077b;
        if (oVar.f4441a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4444f) && oVar.f4444f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public boolean u(l lVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.f45077b;
        if (lVar == lVar.k() && sVar.O && (callback = sVar.f8426f.getCallback()) != null && !sVar.Z) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    public float u0(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.f4630b;
        int i11 = (int) cVar2.f4630b;
        float D0 = D0((int) cVar.f4629a, i10, (int) cVar2.f4629a, i11);
        float D02 = D0((int) cVar2.f4629a, i11, (int) cVar.f4629a, i10);
        if (Float.isNaN(D0)) {
            return D02 / 7.0f;
        }
        if (Float.isNaN(D02)) {
            return D0 / 7.0f;
        }
        return (D0 + D02) / 14.0f;
    }

    @Override
    public void v(long j3) {
        ((ei.s) this.f45077b).presentFragment(eo.R9(j3));
    }

    public dc.d v0(com.google.firebase.messaging.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.v0(com.google.firebase.messaging.m):dc.d");
    }

    @Override
    public void w() {
        g2 g2Var = (g2) this.f45077b;
        g2Var.I0 = g2Var.K0;
        g2.Z(g2Var, false, false);
        g2Var.x0(2, true);
    }

    public ic.a w0(float f7, float f10, int i10, int i11) {
        int i12;
        ic.a b10;
        ic.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        dc.b bVar = (dc.b) this.f45077b;
        int min = Math.min(bVar.f6389a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f6390b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                dc.b bVar2 = (dc.b) this.f45077b;
                ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.e;
                int i15 = bVar3.f10554c;
                int i16 = i14 + i15;
                int i17 = bVar3.f10555f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f10553b;
                if (!arrayList.isEmpty()) {
                    return (ic.a) arrayList.get(0);
                }
                throw cc.e.a();
            }
            throw cc.e.a();
        }
        throw cc.e.a();
    }

    @Override
    public void x(float f7) {
        e8 e8Var = (e8) this.f45077b;
        r9 r9Var = e8Var.d;
        if (r9Var == null) {
            return;
        }
        r9Var.f3597s0 = f7;
        r9Var.f3579j = true;
        e8Var.y(true);
    }

    public Set x0() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f45077b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f45077b);
        }
        return unmodifiableSet;
    }

    @Override
    public void y(int i10, long j3, long j10) {
        of.b bVar = ((h0) this.f45077b).Y0;
        Handler handler = (Handler) bVar.f14294b;
        if (handler != null) {
            handler.post(new k2.i(bVar, i10, j3, j10, 0));
        }
    }

    public Boolean y0() {
        Bundle bundle = (Bundle) this.f45077b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public void z(boolean z10) {
        e8 e8Var = (e8) this.f45077b;
        if (e8Var.j()) {
            e8Var.E.getClass();
        }
        e8Var.x(-4, z10);
    }

    public boolean z0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f45077b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    public c(pb.c cVar) {
        this.f45076a = 11;
        this.f45077b = (com.google.android.gms.internal.play_billing.r) cVar.f39876b;
    }

    public c(MediaInfo mediaInfo) {
        this.f45076a = 12;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f45077b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.f45076a = 12;
        this.f45077b = new c6.o(jSONObject);
    }

    public c(Context context) {
        this.f45076a = 8;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f45077b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i10) {
        this.f45076a = i10;
        switch (i10) {
            case 22:
                this.f45077b = new m(fc.a.h, 16);
                return;
            case 26:
                return;
            default:
                this.f45077b = new HashSet();
                return;
        }
    }

    public c(ba.c cVar) {
        this.f45076a = 15;
        this.f45077b = new File(cVar.f2145b, "com.crashlytics.settings.json");
    }

    public c(LaunchActivity launchActivity, Executor executor, v7.n nVar) {
        this.f45076a = 4;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new aa.a(launchActivity).m(y.class);
            this.f45077b = s10;
            yVar.d = executor;
            yVar.e = nVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void G() {
    }

    @Override
    public void m0() {
    }

    private final void A0(ArrayList arrayList) {
    }

    @Override
    public void K(int i10) {
    }

    @Override
    public void N(boolean z10) {
    }

    @Override
    public void i0(boolean z10) {
    }

    @Override
    public void C(k1 k1Var, boolean z10) {
    }
}
