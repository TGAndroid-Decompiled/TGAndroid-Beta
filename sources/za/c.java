package za;

import a8.g;
import ag.d3;
import ag.w;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.b0;
import bi.d4;
import bi.k2;
import bi.m0;
import bi.n1;
import bi.o2;
import bi.w4;
import bi.y4;
import bi.z3;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.u;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fe.e;
import fe.k;
import g.r;
import g6.i;
import i7.f;
import ig.h;
import ig.q1;
import ig.s0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import jg.c2;
import jg.v2;
import k2.q;
import k2.t;
import k2.v;
import k2.x0;
import k2.z;
import l.j;
import l.x;
import n6.l;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.q4;
import org.telegram.ui.cr0;
import org.telegram.ui.ih0;
import v7.d8;
import v7.t6;
import w7.z8;
import x2.o;
public final class c implements s, ai, a0, kn0, q4, m0, androidx.activity.result.b, w0, OnSuccessListener, e, x, c2, z, j {
    public static volatile c f55448c;
    public final int f55449a;
    public Object f55450b;

    public c(int i10, boolean z10) {
        this.f55449a = i10;
    }

    public static p k(Looper looper, Object obj, String str) {
        l.h(obj, "Listener must not be null");
        l.h(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    public float A(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        c cVar;
        int i22;
        boolean z12 = true;
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
        int i23 = 2;
        int i24 = (-abs) / 2;
        int i25 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i25 = 1;
        }
        int i26 = i16 + i18;
        int i27 = i14;
        int i28 = i15;
        int i29 = 0;
        while (true) {
            if (i27 != i26) {
                if (z10) {
                    i20 = i28;
                } else {
                    i20 = i27;
                }
                if (z10) {
                    i21 = i27;
                } else {
                    i21 = i28;
                }
                boolean z13 = z10;
                if (i29 == z12) {
                    z11 = z12;
                    i22 = abs;
                    cVar = this;
                } else {
                    z11 = false;
                    cVar = this;
                    i22 = abs;
                }
                if (z11 == ((wb.b) cVar.f55450b).b(i20, i21)) {
                    if (i29 == 2) {
                        return z8.b(i27, i28, i14, i15);
                    }
                    i29++;
                }
                i24 += abs2;
                if (i24 > 0) {
                    if (i28 == i17) {
                        i19 = 2;
                        break;
                    }
                    i28 += i25;
                    i24 -= i22;
                }
                i27 += i18;
                abs = i22;
                z10 = z13;
                z12 = true;
                i23 = 2;
            } else {
                i19 = i23;
                break;
            }
        }
        if (i29 == i19) {
            return z8.b(i26, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public boolean B(l.l lVar) {
        Window.Callback callback = ((r) this.f55450b).f7229f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    @Override
    public void C(mg mgVar) {
        at.f(w.f0((w) this.f55450b)).d(mgVar);
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void E(float f7, int i10) {
        ((k) this.f55450b).l(f7);
    }

    @Override
    public void F(CharSequence charSequence) {
        w4 w4Var = ((y4) this.f55450b).G;
        if (w4Var != null) {
            z3 z3Var = (z3) w4Var;
            z3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                z3Var.f3478a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public void G(float f7) {
        switch (this.f55449a) {
            case 25:
                cr0 cr0Var = (cr0) this.f55450b;
                s0.e(cr0Var.f10202y1).k(String.valueOf(h.f8316a.indexOf(cr0Var.F0.getCurrentBrush())), f7);
                q1 q1Var = cr0Var.f10192t1;
                q1Var.f8435c = f7;
                cr0Var.r0(q1Var, null);
                return;
            default:
                ((v2) this.f55450b).setOutlineWidth(f7);
                return;
        }
    }

    @Override
    public void H() {
        o oVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f55450b;
        synchronized (ffmpegAudioRenderer.f7808a) {
            oVar = ffmpegAudioRenderer.H;
        }
        if (oVar != null) {
            oVar.m();
        }
    }

    public float I(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        wb.b bVar = (wb.b) this.f55450b;
        float A = A(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f52793a;
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
            int i19 = bVar.f52794b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (A(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + A) - 1.0f;
    }

    @Override
    public j9 J() {
        return (y4) this.f55450b;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        k2 k2Var = (k2) this.f55450b;
        k2Var.x0(i10, i11, z10);
        ih0 ih0Var = k2Var.O0;
        if (ih0Var != null) {
            ih0Var.h();
            k2Var.O0 = null;
        }
    }

    @Override
    public bi.a L() {
        return ((y4) this.f55450b).f2881a;
    }

    @Override
    public boolean O() {
        y4 y4Var = (y4) this.f55450b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            bi.a aVar = y4Var.f2881a;
            if (((z3) w4Var).f3478a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void P(Exception exc) {
        e2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        hf.b bVar = ((FfmpegAudioRenderer) this.f55450b).I;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 1));
        }
    }

    @Override
    public void R(int i10, int i11) {
        y4 y4Var = (y4) this.f55450b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            bi.a aVar = y4Var.f2881a;
            o2 o2Var = ((z3) w4Var).f3478a.Q3;
            if (o2Var != null) {
                o2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void S() {
        ((FfmpegAudioRenderer) this.f55450b).Z = true;
    }

    @Override
    public void W() {
        y4 y4Var = (y4) this.f55450b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            bi.a aVar = y4Var.f2881a;
            d4 d4Var = ((z3) w4Var).f3478a;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.g();
            }
            d4Var.f2938o3.onContentChanged();
        }
    }

    @Override
    public void a(int i10) {
        hf.b bVar = ((FfmpegAudioRenderer) this.f55450b).I;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new d3(bVar, i10, 9));
        }
    }

    @Override
    public void a0(x0 x0Var) {
        hf.b bVar = ((FfmpegAudioRenderer) this.f55450b).I;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 1));
        }
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f55449a) {
            case 1:
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f310a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f55450b).writeToParcel(obtain, 0);
                ((a8.c) ((g) obj).v()).H0(obtain, 2);
                return;
            case 21:
                g6.q qVar = new g6.q(0, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).v();
                Parcel P0 = iVar.P0();
                u.d(P0, qVar);
                P0.writeStringArray((String[]) this.f55450b);
                iVar.U0(P0, 5);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).v();
                String str = ((i7.b) this.f55450b).f8228k;
                Parcel L0 = iVar2.L0();
                int i11 = f.f8232a;
                L0.writeStrongBinder(aVar);
                L0.writeString(str);
                iVar2.M0(L0, 2);
                return;
        }
    }

    @Override
    public void b(n1 n1Var) {
        w4 w4Var = ((y4) this.f55450b).G;
        if (w4Var != null) {
            d4 d4Var = ((z3) w4Var).f3478a;
            d4.P1(d4Var, n1Var);
            d4Var.f2938o3.h(n1Var, true);
        }
    }

    @Override
    public void c(float f7) {
        b0 b0Var = (b0) this.f55450b;
        kj kjVar = b0Var.P;
        if (kjVar == null) {
            return;
        }
        kjVar.f16652b0 = f7;
        MediaController.B().i0(b0Var.P, f7);
    }

    @Override
    public void d(float f7) {
        kj kjVar = ((b0) this.f55450b).P;
        if (kjVar == null) {
            return;
        }
        kjVar.f16652b0 = f7;
    }

    @Override
    public void e(boolean z10) {
        hf.b bVar = ((FfmpegAudioRenderer) this.f55450b).I;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new v(0, bVar, z10));
        }
    }

    @Override
    public void e0(x0 x0Var) {
        hf.b bVar = ((FfmpegAudioRenderer) this.f55450b).I;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new t(bVar, x0Var, 0));
        }
    }

    @Override
    public void f(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f55450b;
        ffmpegAudioRenderer.f1709g0 = true;
        hf.b bVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new bi.e(bVar, j10, 2));
        }
    }

    @Override
    public void g(l.l lVar, boolean z10) {
        ((r) this.f55450b).g(lVar);
    }

    @Override
    public float get() {
        switch (this.f55449a) {
            case 25:
                cr0 cr0Var = (cr0) this.f55450b;
                int i10 = cr0Var.f10202y1;
                h currentBrush = cr0Var.F0.getCurrentBrush();
                if (currentBrush == null) {
                    return s0.e(i10).f8457i;
                }
                return s0.e(i10).f(String.valueOf(h.f8316a.indexOf(currentBrush)), currentBrush.d());
            default:
                return ((v2) this.f55450b).F;
        }
    }

    public void h(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f55450b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public void h0() {
        y4 y4Var = (y4) this.f55450b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            bi.a aVar = y4Var.f2881a;
            d4.R1(((z3) w4Var).f3478a);
        }
    }

    public float i(bc.c cVar, bc.c cVar2) {
        int i10 = (int) cVar.f50781b;
        int i11 = (int) cVar2.f50781b;
        float I = I((int) cVar.f50780a, i10, (int) cVar2.f50780a, i11);
        float I2 = I((int) cVar2.f50780a, i11, (int) cVar.f50780a, i10);
        if (Float.isNaN(I)) {
            return I2 / 7.0f;
        }
        if (Float.isNaN(I2)) {
            return I / 7.0f;
        }
        return (I + I2) / 14.0f;
    }

    @Override
    public void i0(long j10, int i10, long j11) {
        hf.b bVar = ((FfmpegAudioRenderer) this.f55450b).I;
        Handler handler = (Handler) bVar.f7658b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public void j() {
        y4 y4Var = (y4) this.f55450b;
        w4 w4Var = y4Var.G;
        if (w4Var != null) {
            d4.S1(((z3) w4Var).f3478a, y4Var.f2881a);
        }
    }

    @Override
    public void k0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: za.c.k0(java.lang.Object):void");
    }

    public bc.a l(float f7, float f10, int i10, int i11) {
        int i12;
        bc.a b10;
        bc.a b11;
        int i13 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i13);
        wb.b bVar = (wb.b) this.f55450b;
        int min = Math.min(bVar.f52793a - 1, i10 + i13) - max;
        float f11 = 3.0f * f7;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f52794b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                wb.b bVar2 = (wb.b) this.f55450b;
                bc.b bVar3 = new bc.b(bVar2, max, max2, min, min2, f7);
                int i14 = bVar3.e;
                int i15 = bVar3.f2639c;
                int i16 = i14 + i15;
                int i17 = bVar3.f2640f;
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
                ArrayList arrayList = bVar3.f2638b;
                if (!arrayList.isEmpty()) {
                    return (bc.a) arrayList.get(0);
                }
                throw vb.e.a();
            }
            throw vb.e.a();
        }
        throw vb.e.a();
    }

    @Override
    public void m(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f55450b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f965b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f3785a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f964a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void n() {
        ((FfmpegAudioRenderer) this.f55450b).f1708f0 = true;
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        com.google.android.gms.internal.cast.c2 c2Var;
        c1 b10;
        d6.a aVar = (d6.a) this.f55450b;
        Bundle bundle = (Bundle) obj;
        if (o0.f4723j) {
            Context context = aVar.f5743a;
            g6.r rVar = aVar.f5746f;
            o0 o0Var = new o0(context, rVar, aVar.f5745c, aVar.f5749j, aVar.f5747g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z10) {
                    i10 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String A = sc.e.A(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            o0Var.h = i11;
            l5.s.b(context);
            o0Var.f4728g = l5.s.a().c(j5.a.e).a("CAST_SENDER_SDK", new i5.c("proto"), y.f4824a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                o0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(A, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.f4496c = new k6.h(rVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new k6.c[]{c6.y.f3957c};
                b11.f4495b = false;
                b11.f4494a = 8426;
                Task e = rVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f9700b = o0Var;
                obj2.f9701c = packageName;
                obj2.f9699a = i10;
                obj2.d = sharedPreferences;
                e.addOnSuccessListener(obj2);
            }
            if (z10) {
                l.g(sharedPreferences);
                g6.b bVar = com.google.android.gms.internal.cast.c2.f4618i;
                synchronized (com.google.android.gms.internal.cast.c2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.c2.f4620k == null) {
                            com.google.android.gms.internal.cast.c2.f4620k = new com.google.android.gms.internal.cast.c2(sharedPreferences, o0Var, packageName);
                        }
                        c2Var = com.google.android.gms.internal.cast.c2.f4620k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = c2Var.f4623c;
                SharedPreferences sharedPreferences2 = c2Var.f4622b;
                HashSet hashSet = c2Var.f4624f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c2Var.f4625g;
                hashSet2.clear();
                c2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.c2.f4619j;
                if (str2.equals(string) && str.equals(string2)) {
                    c2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                c1 b12 = com.google.android.gms.internal.cast.c2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.c2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    c2Var.c(hashSet3);
                    l.g(c2Var.e);
                    l.g(c2Var.d);
                    c2Var.e.post(c2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.c2.a(c1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public void p(l.l lVar) {
        k2.m0 m0Var = ((ActionMenuView) this.f55450b).K;
        if (m0Var != null) {
            m0Var.p(lVar);
        }
    }

    public Set q() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f55450b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f55450b);
        }
        return unmodifiableSet;
    }

    public Boolean r() {
        Bundle bundle = (Bundle) this.f55450b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public c3.j s() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.f55450b).values()) {
            arrayList.add(jVar.f3658b);
            arrayList2.add(jVar.f3659c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        if (j10 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.d(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, d8.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), d8.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), d8.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    @Override
    public void t(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f55450b;
        xVar.f4512o.lock();
        try {
            xVar.f4509l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f4512o.unlock();
        }
    }

    public String toString() {
        switch (this.f55449a) {
            case 28:
                le.b bVar = le.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((kg.s0) this.f55450b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public boolean u(l.l lVar, MenuItem menuItem) {
        m.k kVar = ((ActionMenuView) this.f55450b).P;
        if (kVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((a4.l) kVar).f279b).W.f45499c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.b0) it.next()).f1451a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((k) this.f55450b).l(f7);
    }

    @Override
    public void w(int i10) {
        k6.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f55450b;
        Lock lock = xVar.f4512o;
        lock.lock();
        try {
            if (!xVar.f4511n && (aVar = xVar.f4510m) != null && aVar.c()) {
                xVar.f4511n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f4511n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public void x() {
        ((androidx.fragment.app.u) this.f55450b).d.R();
    }

    @Override
    public k9 y() {
        w4 w4Var = ((y4) this.f55450b).G;
        if (w4Var != null) {
            return ((z3) w4Var).f3478a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void z(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f55450b;
        xVar.f4512o.lock();
        try {
            Bundle bundle2 = xVar.f4508k;
            if (bundle2 == null) {
                xVar.f4508k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f4509l = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f4512o.unlock();
        }
    }

    public c(g6.r rVar, String[] strArr) {
        this.f55449a = 21;
        this.f55450b = strArr;
    }

    public c(Object obj, int i10) {
        this.f55449a = i10;
        this.f55450b = obj;
    }

    public c(x6.a aVar) {
        this.f55449a = 22;
        l.g(aVar);
        this.f55450b = aVar;
    }

    public c(Context context) {
        this.f55449a = 16;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f55450b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i10) {
        this.f55449a = i10;
        switch (i10) {
            case 11:
                this.f55450b = new LinkedHashMap();
                return;
            case 12:
            default:
                this.f55450b = new HashSet();
                return;
            case 13:
                this.f55450b = Collections.newSetFromMap(new WeakHashMap());
                return;
        }
    }

    @Override
    public void N() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void o() {
    }

    @Override
    public void n0(Object obj) {
    }

    @Override
    public void v0(TLRPC.User user) {
    }

    @Override
    public void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
