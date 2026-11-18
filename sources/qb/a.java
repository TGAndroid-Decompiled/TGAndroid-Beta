package qb;

import a8.r7;
import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import b3.h;
import b3.i;
import b3.j;
import b3.m;
import b3.o;
import c3.b;
import ca.d;
import com.google.android.gms.common.api.r;
import com.google.firebase.components.ComponentRegistrar;
import e2.t0;
import f3.b0;
import f3.i0;
import f3.q;
import j2.u;
import j2.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import l.k;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.z51;
import org.telegram.ui.fr0;
import pb.g;
import q6.l;
import sg.j1;
import u9.e;
import vf.c;
import w7.s;
public final class a implements gh.a, m, d, eg.a, q, ia.d, e, w, u9.d, qi, z51, l1, l, j1, x5.a {
    public final int f56082a;

    public a(int i7) {
        this.f56082a = i7;
    }

    public static i Q4(h hVar, j jVar) {
        IOException iOException = (IOException) jVar.f2902c;
        if (iOException instanceof x) {
            int i7 = ((x) iOException).f17225c;
            if (i7 == 403 || i7 == 404 || i7 == 410 || i7 == 416 || i7 == 500 || i7 == 503) {
                if (hVar.a(1)) {
                    return new i(1, 300000L);
                }
                if (hVar.a(2)) {
                    return new i(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long S4(j jVar) {
        for (Throwable th2 = (IOException) jVar.f2902c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof t0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof o)) {
                if ((th2 instanceof j2.j) && ((j2.j) th2).f17176a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((jVar.f2901b - 1) * 1000, 5000);
    }

    public static short W4(short s5, short s9) {
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

    @Override
    public void A0() {
        int i7 = this.f56082a;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public int A2() {
        return 0;
    }

    @Override
    public void B(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void B0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i7 = this.f56082a;
    }

    @Override
    public void B1(q1 q1Var, boolean z10, boolean z11) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean C(k kVar) {
        return false;
    }

    @Override
    public void C0(q1 q1Var, float f10, float f11) {
        int i7 = this.f56082a;
    }

    @Override
    public void C1(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void E(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void F0(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void F1(q1 q1Var, boolean z10) {
        int i7 = this.f56082a;
    }

    @Override
    public void H0(q1 q1Var, boolean z10, boolean z11) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean H1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(q1 q1Var, p2 p2Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void I0(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean J1() {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void K1(q1 q1Var, int i7) {
        int i10 = this.f56082a;
    }

    @Override
    public void L(cj cjVar) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean L0(long j3) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L1(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return i7 / 2;
    }

    @Override
    public void N(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.f56082a;
    }

    @Override
    public void N0(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.f56082a;
    }

    @Override
    public void O1(fj fjVar) {
        int i7 = this.f56082a;
    }

    @Override
    public void P(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(W4(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f56082a) {
            case 18:
            case 19:
            default:
                c.t(q1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void R(fj fjVar) {
        int i7 = this.f56082a;
    }

    @Override
    public CharacterStyle R1(q1 q1Var) {
        switch (this.f56082a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    public int R4(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public boolean S(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.f56082a;
    }

    @Override
    public boolean T() {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean T1(q1 q1Var, fj fjVar) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean U(q1 q1Var) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int U0() {
        return 0;
    }

    @Override
    public void U1() {
        int i7 = this.f56082a;
    }

    @Override
    public boolean V0(q1 q1Var, boolean z10) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean W() {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public void X(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f56082a;
    }

    @Override
    public void X0(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.f56082a;
    }

    @Override
    public void Y(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.f56082a;
    }

    @Override
    public int Z() {
        switch (this.f56082a) {
            case 18:
                return 0;
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public float Z0() {
        return -1.0f;
    }

    @Override
    public boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a() {
        synchronized (b.f4368a) {
            Object obj = b.f4369b;
            synchronized (obj) {
                if (b.f4370c) {
                    return;
                }
                long a10 = b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    b.d = a10;
                    b.f4370c = true;
                }
            }
        }
    }

    @Override
    public void a2(q1 q1Var, i10 i10Var) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean b() {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c() {
        int i7 = this.f56082a;
    }

    @Override
    public jh.a c0() {
        switch (this.f56082a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public fr0 c2() {
        switch (this.f56082a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean d0(q1 q1Var) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public i0 d2(int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f56082a) {
            case 14:
                g gVar = (g) r7Var.a(g.class);
                return new a(0);
            case 15:
                pb.a aVar = (pb.a) r7Var.a(pb.a.class);
                return new pb.b(0);
            case 21:
                return new pb.k((Context) r7Var.a(Context.class));
            default:
                return new Object();
        }
    }

    @Override
    public boolean e0(q1 q1Var, TLRPC.User user) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e2(String str, String str2) {
        int i7 = this.f56082a;
    }

    @Override
    public void f0(eh ehVar) {
        ehVar.run();
    }

    @Override
    public boolean f1(fj fjVar) {
        int i7 = this.f56082a;
        return c0.a(fjVar);
    }

    @Override
    public boolean f2(long j3) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public ia.b g(s sVar, JSONObject jSONObject) {
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
    public boolean g0() {
        return false;
    }

    @Override
    public void g2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f56082a;
    }

    @Override
    public boolean h() {
        switch (this.f56082a) {
            case 18:
                return true;
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void h0(int i7) {
        int i10 = this.f56082a;
    }

    @Override
    public boolean h2(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String i(q1 q1Var) {
        switch (this.f56082a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean i0() {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i1() {
        int i7 = this.f56082a;
    }

    @Override
    public void j(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void j0(q1 q1Var, float f10, float f11) {
        int i7 = this.f56082a;
    }

    @Override
    public void j2(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public List k(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (u9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f58527a;
            if (str != null) {
                aVar = new u9.a(str, aVar.f58528b, aVar.f58529c, aVar.d, aVar.f58530e, new ab.g(20, str, aVar), aVar.f58532g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public int k0(q1 q1Var) {
        switch (this.f56082a) {
            case 18:
                return 0;
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f56082a;
    }

    @Override
    public void l(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.f56082a;
    }

    @Override
    public void l0(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void l2(q1 q1Var, long j3) {
        int i7 = this.f56082a;
    }

    @Override
    public void m() {
        int i7 = this.f56082a;
    }

    @Override
    public String n() {
        return null;
    }

    @Override
    public boolean n0() {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object o(r rVar) {
        return null;
    }

    @Override
    public void o0(String str) {
        int i7 = this.f56082a;
    }

    @Override
    public void p(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.f56082a;
    }

    @Override
    public boolean p0(x5 x5Var) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p1(q1 q1Var, int i7) {
        int i10 = this.f56082a;
    }

    @Override
    public boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void q0(q1 q1Var, float f10, float f11) {
        int i7 = this.f56082a;
    }

    @Override
    public void q2(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public long r() {
        return System.currentTimeMillis();
    }

    @Override
    public void s(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void s2() {
        int i7 = this.f56082a;
    }

    @Override
    public boolean t() {
        if (n6.A0().f35806i != null) {
            return true;
        }
        return false;
    }

    @Override
    public int t0() {
        return 0;
    }

    @Override
    public void t1(q1 q1Var, float f10, float f11) {
        int i7 = this.f56082a;
    }

    @Override
    public void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i7 = this.f56082a;
    }

    @Override
    public void u0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.f56082a;
    }

    @Override
    public void v() {
        int i7 = this.f56082a;
    }

    @Override
    public boolean v2(int i7) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void w(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public void w0(q1 q1Var, float f10, float f11, boolean z10) {
        int i7 = this.f56082a;
    }

    @Override
    public void x(boolean z10, float[] fArr) {
        n6.A0().e(z10, fArr);
    }

    @Override
    public boolean x1() {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void x2() {
        int i7 = this.f56082a;
    }

    @Override
    public void y(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean y0(fj fjVar) {
        switch (this.f56082a) {
            case 18:
                return true;
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void y2(q1 q1Var, int i7, int i10) {
        int i11 = this.f56082a;
    }

    @Override
    public String z(long j3) {
        switch (this.f56082a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z0(q1 q1Var) {
        int i7 = this.f56082a;
    }

    @Override
    public boolean z1(q1 q1Var, int i7) {
        switch (this.f56082a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public j9 z2() {
        switch (this.f56082a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    public a(WearAuthListenerService wearAuthListenerService) {
        this.f56082a = 1;
    }

    public a() {
        this.f56082a = 23;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    private final void D0() {
    }

    private final void E0() {
    }

    private final void G0() {
    }

    private final void O() {
    }

    private final void O3() {
    }

    private final void P3() {
    }

    private final void Q() {
    }

    private final void Q3() {
    }

    private final void T4() {
    }

    private final void U4() {
    }

    private final void V() {
    }

    private final void V4() {
    }

    private final void a5() {
    }

    private final void b3() {
    }

    private final void b5() {
    }

    private final void c3() {
    }

    private final void c5() {
    }

    private final void d3() {
    }

    private final void g5() {
    }

    private final void h5() {
    }

    private final void i5() {
    }

    private final void m5() {
    }

    private final void n5() {
    }

    private final void o5() {
    }

    @Override
    public void A() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void f() {
    }

    @Override
    public void u() {
    }

    @Override
    public void v0() {
    }

    private final void A3(q1 q1Var) {
    }

    private final void B3(q1 q1Var) {
    }

    private final void B4(q1 q1Var) {
    }

    private final void C3(q1 q1Var) {
    }

    private final void C4(q1 q1Var) {
    }

    private final void D2(q1 q1Var) {
    }

    private final void D3(q1 q1Var) {
    }

    private final void D4(q1 q1Var) {
    }

    private final void E1(cj cjVar) {
    }

    private final void E2(q1 q1Var) {
    }

    private final void E3(q1 q1Var) {
    }

    private final void F2(q1 q1Var) {
    }

    private final void F3(q1 q1Var) {
    }

    private final void G1(cj cjVar) {
    }

    private final void G3(q1 q1Var) {
    }

    private final void H3(q1 q1Var) {
    }

    private final void J0(q1 q1Var) {
    }

    private final void K4(q1 q1Var) {
    }

    private final void L3(q1 q1Var) {
    }

    private final void M3(q1 q1Var) {
    }

    private final void M4(q1 q1Var) {
    }

    private final void N1(q1 q1Var) {
    }

    private final void N3(q1 q1Var) {
    }

    private final void O4(q1 q1Var) {
    }

    private final void P1(q1 q1Var) {
    }

    private final void P2(q1 q1Var) {
    }

    private final void Q0(q1 q1Var) {
    }

    private final void Q2(q1 q1Var) {
    }

    private final void R2(q1 q1Var) {
    }

    private final void S0(q1 q1Var) {
    }

    private final void S2(q1 q1Var) {
    }

    private final void T2(q1 q1Var) {
    }

    private final void U2(q1 q1Var) {
    }

    private final void a0(q1 q1Var) {
    }

    private final void a4(String str) {
    }

    private final void b0(q1 q1Var) {
    }

    private final void b4(String str) {
    }

    private final void c4(String str) {
    }

    private final void d5(int i7) {
    }

    private final void e1(q1 q1Var) {
    }

    private final void e5(int i7) {
    }

    private final void f5(int i7) {
    }

    private final void g1(q1 q1Var) {
    }

    private final void i2(q1 q1Var) {
    }

    private final void j1(q1 q1Var) {
    }

    private final void j4(q1 q1Var) {
    }

    private final void j5(fj fjVar) {
    }

    private final void k4(q1 q1Var) {
    }

    private final void k5(fj fjVar) {
    }

    private final void l4(q1 q1Var) {
    }

    private final void l5(fj fjVar) {
    }

    private final void m0(q1 q1Var) {
    }

    private final void o2(q1 q1Var) {
    }

    private final void p4(q1 q1Var) {
    }

    private final void q3(q1 q1Var) {
    }

    private final void q4(q1 q1Var) {
    }

    private final void r0(q1 q1Var) {
    }

    private final void r2(q1 q1Var) {
    }

    private final void r3(q1 q1Var) {
    }

    private final void r4(q1 q1Var) {
    }

    private final void s0(q1 q1Var) {
    }

    private final void s1(q1 q1Var) {
    }

    private final void s3(q1 q1Var) {
    }

    private final void s4(fj fjVar) {
    }

    private final void t4(fj fjVar) {
    }

    private final void u1(q1 q1Var) {
    }

    private final void u2(q1 q1Var) {
    }

    private final void u4(fj fjVar) {
    }

    private final void v1(q1 q1Var) {
    }

    private final void v4(q1 q1Var) {
    }

    private final void w1(cj cjVar) {
    }

    private final void w4(q1 q1Var) {
    }

    private final void x0(q1 q1Var) {
    }

    private final void x4(q1 q1Var) {
    }

    private final void z3(q1 q1Var) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    private final void A4(q1 q1Var, i10 i10Var) {
    }

    private final void B2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void C2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void E4(q1 q1Var, boolean z10) {
    }

    private final void G4(q1 q1Var, boolean z10) {
    }

    private final void H(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void I4(q1 q1Var, boolean z10) {
    }

    private final void J(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void J2(q1 q1Var, int i7) {
    }

    private final void K2(q1 q1Var, int i7) {
    }

    private final void L2(q1 q1Var, int i7) {
    }

    private final void M(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void M2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void N2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void O2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void Y2(q1 q1Var, int i7) {
    }

    private final void Z2(q1 q1Var, int i7) {
    }

    private final void a1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void a3(q1 q1Var, int i7) {
    }

    private final void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void c1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void d4(q1 q1Var, long j3) {
    }

    private final void e4(q1 q1Var, long j3) {
    }

    private final void f4(q1 q1Var, long j3) {
    }

    private final void k2(q1 q1Var, p2 p2Var) {
    }

    private final void m2(q1 q1Var, p2 p2Var) {
    }

    private final void n2(q1 q1Var, p2 p2Var) {
    }

    private final void t3(String str, String str2) {
    }

    private final void u3(String str, String str2) {
    }

    private final void v3(String str, String str2) {
    }

    private final void w2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void y4(q1 q1Var, i10 i10Var) {
    }

    private final void z4(q1 q1Var, i10 i10Var) {
    }

    @Override
    public void d(k kVar, boolean z10) {
    }

    private final void D(q1 q1Var, float f10, float f11) {
    }

    private final void F(q1 q1Var, float f10, float f11) {
    }

    private final void F4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void G(q1 q1Var, float f10, float f11) {
    }

    private final void G2(q1 q1Var, int i7, int i10) {
    }

    private final void H2(q1 q1Var, int i7, int i10) {
    }

    private final void H4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void I2(q1 q1Var, int i7, int i10) {
    }

    private final void I3(q1 q1Var, float f10, float f11) {
    }

    private final void J3(q1 q1Var, float f10, float f11) {
    }

    private final void J4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void K3(q1 q1Var, float f10, float f11) {
    }

    private final void L4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void N4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void P4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void R3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void S3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void T3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void e3(q1 q1Var, float f10, float f11) {
    }

    private final void f3(q1 q1Var, float f10, float f11) {
    }

    private final void g3(q1 q1Var, float f10, float f11) {
    }

    private final void m4(q1 q1Var, float f10, float f11) {
    }

    private final void n4(q1 q1Var, float f10, float f11) {
    }

    private final void o1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void o4(q1 q1Var, float f10, float f11) {
    }

    private final void q1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void r1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void w3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void x3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void y3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void U3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void V2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void V3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void W2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void W3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void X2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void X3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Y3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Z3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void h3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void i3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void j3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    private final void g4(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void h4(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void i4(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void k3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void l3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void m3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void n3(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void o3(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void p3(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void l1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void m1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void n1(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void X4(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final void Y4(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    private final void Z4(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
