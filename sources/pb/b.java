package pb;

import a8.b8;
import a8.r7;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.style.CharacterStyle;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import c8.s9;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.l0;
import e2.t0;
import f3.c0;
import f3.j0;
import f3.t;
import f5.u;
import j2.v;
import j2.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.r5;
import org.telegram.ui.er0;
public final class b implements a4.h, b3.l, ca.d, eg.a, f3.q, bi, ia.d, SuccessContinuation, u9.d, h51, l1, q2.q, r0.q, u2.k, y2.m, s0 {
    public static final b f53405b = new b(14);
    public final int f53406a;

    public b(int i7) {
        this.f53406a = i7;
    }

    public static MediaCodec C0(b8 b8Var) {
        String str = ((u2.o) b8Var.f335a).f56146a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static b3.i V0(b3.h hVar, u uVar) {
        IOException iOException = (IOException) uVar.f11191c;
        if (iOException instanceof y) {
            int i7 = ((y) iOException).f16486c;
            if (i7 == 403 || i7 == 404 || i7 == 410 || i7 == 416 || i7 == 500 || i7 == 503) {
                if (hVar.a(1)) {
                    return new b3.i(1, 300000L);
                }
                if (hVar.a(2)) {
                    return new b3.i(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long a1(u uVar) {
        for (Throwable th2 = (IOException) uVar.f11191c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof t0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof v) && !(th2 instanceof b3.n)) {
                if ((th2 instanceof j2.j) && ((j2.j) th2).f16434a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((uVar.f11190b - 1) * 1000, 5000);
    }

    public static boolean c1(t1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: pb.b.c1(t1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static short d1(short s5, short s9) {
        int i7;
        int i10 = s5 + 32768;
        int i11 = s9 + 32768;
        int i12 = 65535;
        if (i10 >= 32768 && i11 >= 32768) {
            i7 = (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        } else {
            i7 = (i10 * i11) / 32768;
        }
        if (i7 != 65536) {
            i12 = i7;
        }
        return (short) (i12 - 32768);
    }

    public static m9.y e1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((l0) it.next()).f10350b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return s9.b(list);
    }

    @Override
    public k2.b A(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public CharacterStyle C1(q1 q1Var) {
        return null;
    }

    @Override
    public byte[] D() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public long E() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean E1(q1 q1Var, ij ijVar) {
        return false;
    }

    @Override
    public void F(boolean z9, float[] fArr) {
        k6.A0().e(z9, fArr);
    }

    @Override
    public void F0() {
        int i7 = this.f53406a;
    }

    @Override
    public boolean G1() {
        switch (this.f53406a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(d1(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void I(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean J0(long j3) {
        return false;
    }

    @Override
    public boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public c0 M() {
        return new t(-9223372036854775807L);
    }

    @Override
    public void M0(Object obj) {
        int i7 = this.f53406a;
    }

    @Override
    public void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        int i11 = this.f53406a;
    }

    @Override
    public er0 N1() {
        return null;
    }

    @Override
    public byte[] O(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean O0(q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public j0 O1(int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public boolean Q1(long j3) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public void U0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void W(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean W0(ij ijVar) {
        return f1.a(ijVar);
    }

    @Override
    public int X() {
        return 0;
    }

    public int X0(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public u2.l Y(a8.b8 r6) {
        throw new UnsupportedOperationException("Method not decompiled: pb.b.Y(a8.b8):u2.l");
    }

    @Override
    public void Y0(TLRPC.User user) {
        int i7 = this.f53406a;
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public void a() {
        synchronized (c3.b.f5262a) {
            Object obj = c3.b.f5263b;
            synchronized (obj) {
                if (c3.b.f5264c) {
                    return;
                }
                long a10 = c3.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    c3.b.d = a10;
                    c3.b.f5264c = true;
                }
            }
        }
    }

    @Override
    public boolean a0(q1 q1Var) {
        return false;
    }

    @Override
    public boolean b0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public ia.b c(w7.s sVar, JSONObject jSONObject) {
        b7.l lVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            lVar = new b7.l(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            lVar = new b7.l(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        b7.l lVar2 = lVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ia.a aVar = new ia.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j3 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j3 * 1000) + System.currentTimeMillis();
        }
        return new ia.b(currentTimeMillis, lVar2, aVar, optDouble, optDouble2, optInt2);
    }

    @Override
    public void c0(qg qgVar) {
        switch (this.f53406a) {
            case 10:
                qgVar.run();
                return;
            default:
                qgVar.run();
                return;
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f53406a) {
            case 15:
                return new ob.c(r7Var.H(ob.b.class));
            default:
                return new ob.b(r7Var.c(nb.a.class));
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public void f(c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean f0() {
        switch (this.f53406a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g2(int i7) {
        return false;
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public int h0(q1 q1Var) {
        return 0;
    }

    @Override
    public p0 i(Class cls) {
        return new z1.b();
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public j9 k2() {
        return null;
    }

    @Override
    public Map l(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public q2.o l0(byte[] bArr, List list, int i7, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public String m() {
        return null;
    }

    @Override
    public boolean n0(r5 r5Var) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public int o0() {
        return 1;
    }

    @Override
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        int i12 = this.f53406a;
    }

    @Override
    public boolean p1(q1 q1Var, int i7) {
        return false;
    }

    @Override
    public q2.p q() {
        throw new IllegalStateException();
    }

    @Override
    public long r0(f3.p pVar) {
        return -1L;
    }

    @Override
    public boolean s() {
        if (k6.A0().f32454i != null) {
            return true;
        }
        return false;
    }

    @Override
    public p0 t(Class cls, y1.b bVar) {
        return i(cls);
    }

    @Override
    public void t0() {
        int i7 = this.f53406a;
    }

    @Override
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i7 = m6.c.h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    @Override
    public boolean u1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public long w() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean w0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public boolean x0(ij ijVar) {
        return true;
    }

    @Override
    public String y(long j3) {
        return null;
    }

    @Override
    public int z1(int i7, int i10, int i11) {
        return i7 / 2;
    }

    private final void f1() {
    }

    private final void h1() {
    }

    private final void l1() {
    }

    private final void m1() {
    }

    @Override
    public void F1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void release() {
    }

    @Override
    public void u() {
    }

    @Override
    public void z0() {
    }

    private final void S0(TLRPC.User user) {
    }

    private final void T0(TLRPC.User user) {
    }

    private final void i1(Object obj) {
    }

    private final void k1(Object obj) {
    }

    @Override
    public void A1(ij ijVar) {
    }

    @Override
    public void B(org.telegram.ui.Components.n nVar) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void J(fj fjVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void L(byte[] bArr) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(ij ijVar) {
    }

    @Override
    public void P0(q1 q1Var) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void U1(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void c2(q1 q1Var) {
    }

    @Override
    public void d0(int i7) {
    }

    @Override
    public void i0(q1 q1Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public void r(q1 q1Var) {
    }

    @Override
    public void r1(q1 q1Var) {
    }

    @Override
    public void v(q1 q1Var) {
    }

    @Override
    public void v0(long j3) {
    }

    @Override
    public void x(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void y1(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void K1(q1 q1Var, o10 o10Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(String str, String str2) {
    }

    @Override
    public void W1(q1 q1Var, long j3) {
    }

    @Override
    public void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void g1(q1 q1Var, int i7) {
    }

    @Override
    public void j0(byte[] bArr, m2.j jVar) {
    }

    @Override
    public void s1(q1 q1Var, boolean z9) {
    }

    @Override
    public void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void x1(q1 q1Var, int i7) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override
    public void g0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j2(q1 q1Var, int i7, int i10) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q1(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void onScrollLimit(int i7, int i10, int i11, boolean z9) {
    }

    @Override
    public void onScrollProgress(int i7, int i10, int i11, int i12) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void u0(q1 q1Var, float f10, float f11, boolean z9) {
    }

    private final void I0(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
    }

    private final void R0(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
    }

    @Override
    public void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    private final void L1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }

    private final void t1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }

    @Override
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
