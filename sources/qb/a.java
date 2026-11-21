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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y5;
import org.telegram.ui.fr0;
import pb.g;
import q6.l;
import sg.j1;
import u9.e;
import vf.c;
import w7.s;
public final class a implements gh.a, m, d, eg.a, q, ia.d, e, w, u9.d, si, c61, m1, l, j1, x5.a {
    public final int f56123a;

    public a(int i7) {
        this.f56123a = i7;
    }

    public static i Q4(h hVar, j jVar) {
        IOException iOException = (IOException) jVar.f2915c;
        if (iOException instanceof x) {
            int i7 = ((x) iOException).f17247c;
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
        for (Throwable th2 = (IOException) jVar.f2915c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof t0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof o)) {
                if ((th2 instanceof j2.j) && ((j2.j) th2).f17198a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((jVar.f2914b - 1) * 1000, 5000);
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
        int i7 = this.f56123a;
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
    public void B(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void B0(r1 r1Var, TLObject tLObject, boolean z10) {
        int i7 = this.f56123a;
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean C(k kVar) {
        return false;
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11) {
        int i7 = this.f56123a;
    }

    @Override
    public void C1(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void E(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void F0(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
        int i7 = this.f56123a;
    }

    @Override
    public void H0(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(r1 r1Var, p2 p2Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void I0(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean J1() {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void K1(r1 r1Var, int i7) {
        int i10 = this.f56123a;
    }

    @Override
    public void L(cj cjVar) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean L0(long j3) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L1(r1 r1Var) {
        int i7 = this.f56123a;
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
    public void N(r1 r1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.f56123a;
    }

    @Override
    public void N0(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void O0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.f56123a;
    }

    @Override
    public void O1(fj fjVar) {
        int i7 = this.f56123a;
    }

    @Override
    public void P(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(W4(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f56123a) {
            case 18:
            case 19:
            default:
                c.t(r1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void R(fj fjVar) {
        int i7 = this.f56123a;
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        switch (this.f56123a) {
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
    public boolean S(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f56123a) {
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
        int i11 = this.f56123a;
    }

    @Override
    public boolean T() {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T0(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean U(r1 r1Var) {
        switch (this.f56123a) {
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
        int i7 = this.f56123a;
    }

    @Override
    public boolean V0(r1 r1Var, boolean z10) {
        switch (this.f56123a) {
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
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public void X(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f56123a;
    }

    @Override
    public void X0(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void X1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.f56123a;
    }

    @Override
    public void Y(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.f56123a;
    }

    @Override
    public int Z() {
        switch (this.f56123a) {
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
    public boolean Z1(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f56123a) {
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
        synchronized (b.f4394a) {
            Object obj = b.f4395b;
            synchronized (obj) {
                if (b.f4396c) {
                    return;
                }
                long a10 = b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    b.d = a10;
                    b.f4396c = true;
                }
            }
        }
    }

    @Override
    public void a2(r1 r1Var, i10 i10Var) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean b() {
        switch (this.f56123a) {
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
        int i7 = this.f56123a;
    }

    @Override
    public jh.a c0() {
        switch (this.f56123a) {
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
        switch (this.f56123a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean d0(r1 r1Var) {
        switch (this.f56123a) {
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
        switch (this.f56123a) {
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
    public boolean e0(r1 r1Var, TLRPC.User user) {
        switch (this.f56123a) {
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
        int i7 = this.f56123a;
    }

    @Override
    public void f0(gh ghVar) {
        ghVar.run();
    }

    @Override
    public boolean f1(fj fjVar) {
        int i7 = this.f56123a;
        return c0.a(fjVar);
    }

    @Override
    public boolean f2(long j3) {
        switch (this.f56123a) {
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
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f56123a;
    }

    @Override
    public boolean h() {
        switch (this.f56123a) {
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
        int i10 = this.f56123a;
    }

    @Override
    public boolean h2(r1 r1Var, TLRPC.TodoItem todoItem) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String i(r1 r1Var) {
        switch (this.f56123a) {
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
        switch (this.f56123a) {
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
        int i7 = this.f56123a;
    }

    @Override
    public void j(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void j0(r1 r1Var, float f10, float f11) {
        int i7 = this.f56123a;
    }

    @Override
    public void j2(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public List k(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (u9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f58569a;
            if (str != null) {
                aVar = new u9.a(str, aVar.f58570b, aVar.f58571c, aVar.d, aVar.f58572e, new ab.g(20, str, aVar), aVar.f58574g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public int k0(r1 r1Var) {
        switch (this.f56123a) {
            case 18:
                return 0;
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f56123a;
    }

    @Override
    public void l(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.f56123a;
    }

    @Override
    public void l0(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void l2(r1 r1Var, long j3) {
        int i7 = this.f56123a;
    }

    @Override
    public void m() {
        int i7 = this.f56123a;
    }

    @Override
    public String n() {
        return null;
    }

    @Override
    public boolean n0() {
        switch (this.f56123a) {
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
        int i7 = this.f56123a;
    }

    @Override
    public void p(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.f56123a;
    }

    @Override
    public boolean p0(y5 y5Var) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p1(r1 r1Var, int i7) {
        int i10 = this.f56123a;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void q0(r1 r1Var, float f10, float f11) {
        int i7 = this.f56123a;
    }

    @Override
    public void q2(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public long r() {
        return System.currentTimeMillis();
    }

    @Override
    public void s(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void s2() {
        int i7 = this.f56123a;
    }

    @Override
    public boolean t() {
        if (m6.A0().f35438i != null) {
            return true;
        }
        return false;
    }

    @Override
    public int t0() {
        return 0;
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
        int i7 = this.f56123a;
    }

    @Override
    public void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i7 = this.f56123a;
    }

    @Override
    public void u0(r1 r1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.f56123a;
    }

    @Override
    public void v() {
        int i7 = this.f56123a;
    }

    @Override
    public boolean v2(int i7) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void w(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public void w0(r1 r1Var, float f10, float f11, boolean z10) {
        int i7 = this.f56123a;
    }

    @Override
    public void x(boolean z10, float[] fArr) {
        m6.A0().e(z10, fArr);
    }

    @Override
    public boolean x1() {
        switch (this.f56123a) {
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
        int i7 = this.f56123a;
    }

    @Override
    public void y(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean y0(fj fjVar) {
        switch (this.f56123a) {
            case 18:
                return true;
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void y2(r1 r1Var, int i7, int i10) {
        int i11 = this.f56123a;
    }

    @Override
    public String z(long j3) {
        switch (this.f56123a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z0(r1 r1Var) {
        int i7 = this.f56123a;
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        switch (this.f56123a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public k9 z2() {
        switch (this.f56123a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    public a(WearAuthListenerService wearAuthListenerService) {
        this.f56123a = 1;
    }

    public a() {
        this.f56123a = 23;
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

    private final void A3(r1 r1Var) {
    }

    private final void B3(r1 r1Var) {
    }

    private final void B4(r1 r1Var) {
    }

    private final void C3(r1 r1Var) {
    }

    private final void C4(r1 r1Var) {
    }

    private final void D2(r1 r1Var) {
    }

    private final void D3(r1 r1Var) {
    }

    private final void D4(r1 r1Var) {
    }

    private final void E1(cj cjVar) {
    }

    private final void E2(r1 r1Var) {
    }

    private final void E3(r1 r1Var) {
    }

    private final void F2(r1 r1Var) {
    }

    private final void F3(r1 r1Var) {
    }

    private final void G1(cj cjVar) {
    }

    private final void G3(r1 r1Var) {
    }

    private final void H3(r1 r1Var) {
    }

    private final void J0(r1 r1Var) {
    }

    private final void K4(r1 r1Var) {
    }

    private final void L3(r1 r1Var) {
    }

    private final void M3(r1 r1Var) {
    }

    private final void M4(r1 r1Var) {
    }

    private final void N1(r1 r1Var) {
    }

    private final void N3(r1 r1Var) {
    }

    private final void O4(r1 r1Var) {
    }

    private final void P1(r1 r1Var) {
    }

    private final void P2(r1 r1Var) {
    }

    private final void Q0(r1 r1Var) {
    }

    private final void Q2(r1 r1Var) {
    }

    private final void R2(r1 r1Var) {
    }

    private final void S0(r1 r1Var) {
    }

    private final void S2(r1 r1Var) {
    }

    private final void T2(r1 r1Var) {
    }

    private final void U2(r1 r1Var) {
    }

    private final void a0(r1 r1Var) {
    }

    private final void a4(String str) {
    }

    private final void b0(r1 r1Var) {
    }

    private final void b4(String str) {
    }

    private final void c4(String str) {
    }

    private final void d5(int i7) {
    }

    private final void e1(r1 r1Var) {
    }

    private final void e5(int i7) {
    }

    private final void f5(int i7) {
    }

    private final void g1(r1 r1Var) {
    }

    private final void i2(r1 r1Var) {
    }

    private final void j1(r1 r1Var) {
    }

    private final void j4(r1 r1Var) {
    }

    private final void j5(fj fjVar) {
    }

    private final void k4(r1 r1Var) {
    }

    private final void k5(fj fjVar) {
    }

    private final void l4(r1 r1Var) {
    }

    private final void l5(fj fjVar) {
    }

    private final void m0(r1 r1Var) {
    }

    private final void o2(r1 r1Var) {
    }

    private final void p4(r1 r1Var) {
    }

    private final void q3(r1 r1Var) {
    }

    private final void q4(r1 r1Var) {
    }

    private final void r0(r1 r1Var) {
    }

    private final void r2(r1 r1Var) {
    }

    private final void r3(r1 r1Var) {
    }

    private final void r4(r1 r1Var) {
    }

    private final void s0(r1 r1Var) {
    }

    private final void s1(r1 r1Var) {
    }

    private final void s3(r1 r1Var) {
    }

    private final void s4(fj fjVar) {
    }

    private final void t4(fj fjVar) {
    }

    private final void u1(r1 r1Var) {
    }

    private final void u2(r1 r1Var) {
    }

    private final void u4(fj fjVar) {
    }

    private final void v1(r1 r1Var) {
    }

    private final void v4(r1 r1Var) {
    }

    private final void w1(cj cjVar) {
    }

    private final void w4(r1 r1Var) {
    }

    private final void x0(r1 r1Var) {
    }

    private final void x4(r1 r1Var) {
    }

    private final void z3(r1 r1Var) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    private final void A4(r1 r1Var, i10 i10Var) {
    }

    private final void B2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void C2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void E4(r1 r1Var, boolean z10) {
    }

    private final void G4(r1 r1Var, boolean z10) {
    }

    private final void H(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void I4(r1 r1Var, boolean z10) {
    }

    private final void J(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void J2(r1 r1Var, int i7) {
    }

    private final void K2(r1 r1Var, int i7) {
    }

    private final void L2(r1 r1Var, int i7) {
    }

    private final void M(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void M2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void N2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void O2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void Y2(r1 r1Var, int i7) {
    }

    private final void Z2(r1 r1Var, int i7) {
    }

    private final void a1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void a3(r1 r1Var, int i7) {
    }

    private final void b1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void c1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void d4(r1 r1Var, long j3) {
    }

    private final void e4(r1 r1Var, long j3) {
    }

    private final void f4(r1 r1Var, long j3) {
    }

    private final void k2(r1 r1Var, p2 p2Var) {
    }

    private final void m2(r1 r1Var, p2 p2Var) {
    }

    private final void n2(r1 r1Var, p2 p2Var) {
    }

    private final void t3(String str, String str2) {
    }

    private final void u3(String str, String str2) {
    }

    private final void v3(String str, String str2) {
    }

    private final void w2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void y4(r1 r1Var, i10 i10Var) {
    }

    private final void z4(r1 r1Var, i10 i10Var) {
    }

    @Override
    public void d(k kVar, boolean z10) {
    }

    private final void D(r1 r1Var, float f10, float f11) {
    }

    private final void F(r1 r1Var, float f10, float f11) {
    }

    private final void F4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void G(r1 r1Var, float f10, float f11) {
    }

    private final void G2(r1 r1Var, int i7, int i10) {
    }

    private final void H2(r1 r1Var, int i7, int i10) {
    }

    private final void H4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void I2(r1 r1Var, int i7, int i10) {
    }

    private final void I3(r1 r1Var, float f10, float f11) {
    }

    private final void J3(r1 r1Var, float f10, float f11) {
    }

    private final void J4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void K3(r1 r1Var, float f10, float f11) {
    }

    private final void L4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void N4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void P4(r1 r1Var, boolean z10, boolean z11) {
    }

    private final void R3(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void S3(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void T3(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void e3(r1 r1Var, float f10, float f11) {
    }

    private final void f3(r1 r1Var, float f10, float f11) {
    }

    private final void g3(r1 r1Var, float f10, float f11) {
    }

    private final void m4(r1 r1Var, float f10, float f11) {
    }

    private final void n4(r1 r1Var, float f10, float f11) {
    }

    private final void o1(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final void o4(r1 r1Var, float f10, float f11) {
    }

    private final void q1(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final void r1(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    private final void w3(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void x3(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void y3(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void U3(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void V2(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final void V3(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void W2(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final void W3(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void X2(r1 r1Var, float f10, float f11, boolean z10) {
    }

    private final void X3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Y3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Z3(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void h3(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void i3(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    private final void j3(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    private final void g4(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void h4(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void i4(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    private final void k3(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void l3(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void m3(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void n3(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void o3(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void p3(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    private final void l1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void m1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void n1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
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
