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
import f3.j0;
import f3.q;
import j2.u;
import j2.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import pb.g;
import pb.k;
import q6.l;
import sg.i1;
import u9.e;
import vf.c;
import w7.s;
public final class a implements gh.a, m, d, eg.a, q, ia.d, e, w, u9.d, ri, b61, m1, l, i1, x5.a {
    public final int f56205a;

    public a(int i7) {
        this.f56205a = i7;
    }

    public static i Q4(h hVar, j jVar) {
        IOException iOException = (IOException) jVar.f2874c;
        if (iOException instanceof x) {
            int i7 = ((x) iOException).f17313c;
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
        for (Throwable th2 = (IOException) jVar.f2874c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof t0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof o)) {
                if ((th2 instanceof j2.j) && ((j2.j) th2).f17264a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((jVar.f2873b - 1) * 1000, 5000);
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
    public void A(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
        int i7 = this.f56205a;
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public void A2(r1 r1Var, int i7, int i10) {
        int i11 = this.f56205a;
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.f56205a;
    }

    @Override
    public j9 B2() {
        switch (this.f56205a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void C(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11, boolean z10) {
        int i7 = this.f56205a;
    }

    @Override
    public void C1(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public String D(long j3) {
        switch (this.f56205a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int D0() {
        return 0;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(W4(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void F(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean F0(fj fjVar) {
        switch (this.f56205a) {
            case 18:
                return true;
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
        int i7 = this.f56205a;
    }

    @Override
    public void G0(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void H0() {
        int i7 = this.f56205a;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I0(r1 r1Var, TLObject tLObject, boolean z10) {
        int i7 = this.f56205a;
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f56205a;
    }

    @Override
    public void J(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void J0(r1 r1Var, float f10, float f11) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean J1() {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K1(r1 r1Var, int i7) {
        int i10 = this.f56205a;
    }

    @Override
    public void L(r1 r1Var, p2 p2Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void L0(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void L1(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void M(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void M0(r1 r1Var, boolean z10, boolean z11) {
        int i7 = this.f56205a;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return i7 / 2;
    }

    @Override
    public void N0(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void O(cj cjVar) {
        int i7 = this.f56205a;
    }

    @Override
    public void O1(fj fjVar) {
        int i7 = this.f56205a;
    }

    @Override
    public void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
        int i7 = this.f56205a;
    }

    @Override
    public int Q0() {
        return 0;
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f56205a) {
            case 18:
            case 19:
            default:
                c.t(r1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void R(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        switch (this.f56205a) {
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
    public void S(fh fhVar) {
        fhVar.run();
    }

    @Override
    public void S0(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        int i11 = this.f56205a;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public float T0() {
        return -1.0f;
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U1() {
        int i7 = this.f56205a;
    }

    @Override
    public float V0() {
        return -1.0f;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public void W(fj fjVar) {
        int i7 = this.f56205a;
    }

    @Override
    public void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int X1() {
        return 0;
    }

    @Override
    public boolean Y() {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean Z(r1 r1Var) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7 = this.f56205a;
    }

    @Override
    public void a() {
        synchronized (b.f4360a) {
            Object obj = b.f4361b;
            synchronized (obj) {
                if (b.f4362c) {
                    return;
                }
                long a10 = b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    b.d = a10;
                    b.f4362c = true;
                }
            }
        }
    }

    @Override
    public void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b0() {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b2(r1 r1Var, h10 h10Var) {
        int i7 = this.f56205a;
    }

    @Override
    public Object c(r7 r7Var) {
        switch (this.f56205a) {
            case 14:
                g gVar = (g) r7Var.a(g.class);
                return new a(0);
            case 15:
                pb.a aVar = (pb.a) r7Var.a(pb.a.class);
                return new pb.b(0);
            case 21:
                return new k((Context) r7Var.a(Context.class));
            default:
                return new Object();
        }
    }

    @Override
    public void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f56205a;
    }

    @Override
    public boolean c1(r1 r1Var, boolean z10) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public fr0 c2() {
        switch (this.f56205a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean d() {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d0(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public j0 d2(int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void e() {
        int i7 = this.f56205a;
    }

    @Override
    public int e0() {
        switch (this.f56205a) {
            case 18:
                return 0;
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void e1(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void e2(String str, String str2) {
        int i7 = this.f56205a;
    }

    @Override
    public void f1(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean f2(long j3) {
        switch (this.f56205a) {
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
    public boolean g1(fj fjVar) {
        int i7 = this.f56205a;
        return c0.a(fjVar);
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
        int i10 = this.f56205a;
    }

    @Override
    public void h(f3.c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public jh.a h0() {
        switch (this.f56205a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean i() {
        switch (this.f56205a) {
            case 18:
                return true;
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public List j(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (u9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f58653a;
            if (str != null) {
                aVar = new u9.a(str, aVar.f58654b, aVar.f58655c, aVar.d, aVar.f58656e, new ab.g(20, str, aVar), aVar.f58658g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean j0(r1 r1Var) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String k(r1 r1Var) {
        switch (this.f56205a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean k0(r1 r1Var, TLRPC.User user) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void k1() {
        int i7 = this.f56205a;
    }

    @Override
    public void k2(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public String l() {
        return null;
    }

    @Override
    public void l2(r1 r1Var, long j3) {
        int i7 = this.f56205a;
    }

    @Override
    public void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        int i12 = this.f56205a;
    }

    @Override
    public void m0(int i7) {
        int i10 = this.f56205a;
    }

    @Override
    public void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i7 = this.f56205a;
    }

    @Override
    public Object n(r rVar) {
        return null;
    }

    @Override
    public boolean n0() {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long o() {
        return System.currentTimeMillis();
    }

    @Override
    public void o0(r1 r1Var, float f10, float f11) {
        int i7 = this.f56205a;
    }

    @Override
    public void p() {
        int i7 = this.f56205a;
    }

    @Override
    public int p0(r1 r1Var) {
        switch (this.f56205a) {
            case 18:
                return 0;
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void p1(r1 r1Var, int i7) {
        int i10 = this.f56205a;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10 = this.f56205a;
    }

    @Override
    public void q0(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void q2(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean r() {
        if (n6.A0().f35046i != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean r0() {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void t(r1 r1Var) {
        int i7 = this.f56205a;
    }

    @Override
    public void t0(String str) {
        int i7 = this.f56205a;
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean u(l.k kVar) {
        return false;
    }

    @Override
    public void u2() {
        int i7 = this.f56205a;
    }

    @Override
    public boolean v0(x5 x5Var) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void w(boolean z10, float[] fArr) {
        n6.A0().e(z10, fArr);
    }

    @Override
    public void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i7 = this.f56205a;
    }

    @Override
    public void x() {
        int i7 = this.f56205a;
    }

    @Override
    public void x0(r1 r1Var, float f10, float f11) {
        int i7 = this.f56205a;
    }

    @Override
    public boolean x1() {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int x2() {
        return 0;
    }

    @Override
    public boolean y2(int i7) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        switch (this.f56205a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void z2() {
        int i7 = this.f56205a;
    }

    public a(WearAuthListenerService wearAuthListenerService) {
        this.f56205a = 1;
    }

    public a() {
        this.f56205a = 23;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    private final void K() {
    }

    private final void N() {
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

    private final void u0() {
    }

    private final void w0() {
    }

    private final void y0() {
    }

    @Override
    public void B0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void l0() {
    }

    @Override
    public void v() {
    }

    @Override
    public void y() {
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

    private final void K0(r1 r1Var) {
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

    private final void P0(r1 r1Var) {
    }

    private final void P1(r1 r1Var) {
    }

    private final void P2(r1 r1Var) {
    }

    private final void Q2(r1 r1Var) {
    }

    private final void R2(r1 r1Var) {
    }

    private final void S2(r1 r1Var) {
    }

    private final void T2(r1 r1Var) {
    }

    private final void U(r1 r1Var) {
    }

    private final void U2(r1 r1Var) {
    }

    private final void V(r1 r1Var) {
    }

    private final void a0(r1 r1Var) {
    }

    private final void a4(String str) {
    }

    private final void b1(r1 r1Var) {
    }

    private final void b4(String str) {
    }

    private final void c4(String str) {
    }

    private final void d1(r1 r1Var) {
    }

    private final void d5(int i7) {
    }

    private final void e5(int i7) {
    }

    private final void f0(r1 r1Var) {
    }

    private final void f5(int i7) {
    }

    private final void g0(r1 r1Var) {
    }

    private final void h2(r1 r1Var) {
    }

    private final void i1(r1 r1Var) {
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

    private final void o2(r1 r1Var) {
    }

    private final void p4(r1 r1Var) {
    }

    private final void q3(r1 r1Var) {
    }

    private final void q4(r1 r1Var) {
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

    private final void s2(r1 r1Var) {
    }

    private final void s3(r1 r1Var) {
    }

    private final void s4(fj fjVar) {
    }

    private final void t4(fj fjVar) {
    }

    private final void u1(r1 r1Var) {
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

    private final void x4(r1 r1Var) {
    }

    private final void z0(r1 r1Var) {
    }

    private final void z3(r1 r1Var) {
    }

    @Override
    public void O0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    private final void A4(r1 r1Var, h10 h10Var) {
    }

    private final void C2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void E4(r1 r1Var, boolean z10) {
    }

    private final void G(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void G4(r1 r1Var, boolean z10) {
    }

    private final void H(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void I(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void I4(r1 r1Var, boolean z10) {
    }

    private final void J2(r1 r1Var, int i7) {
    }

    private final void K2(r1 r1Var, int i7) {
    }

    private final void L2(r1 r1Var, int i7) {
    }

    private final void M2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void N2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void O2(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void U0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void X0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Y0(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Y2(r1 r1Var, int i7) {
    }

    private final void Z2(r1 r1Var, int i7) {
    }

    private final void a3(r1 r1Var, int i7) {
    }

    private final void d4(r1 r1Var, long j3) {
    }

    private final void e4(r1 r1Var, long j3) {
    }

    private final void f4(r1 r1Var, long j3) {
    }

    private final void i2(r1 r1Var, p2 p2Var) {
    }

    private final void m2(r1 r1Var, p2 p2Var) {
    }

    private final void n2(r1 r1Var, p2 p2Var) {
    }

    private final void t2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void t3(String str, String str2) {
    }

    private final void u3(String str, String str2) {
    }

    private final void v2(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void v3(String str, String str2) {
    }

    private final void y4(r1 r1Var, h10 h10Var) {
    }

    private final void z4(r1 r1Var, h10 h10Var) {
    }

    @Override
    public void f(l.k kVar, boolean z10) {
    }

    private final void B(r1 r1Var, float f10, float f11) {
    }

    private final void E(r1 r1Var, float f10, float f11) {
    }

    private final void F4(r1 r1Var, boolean z10, boolean z11) {
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

    private final void z(r1 r1Var, float f10, float f11) {
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

    private final void j1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    private final void l1(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
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
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
