package v7;

import android.content.Context;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import b8.ke;
import c3.j0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d2.a2;
import e3.b0;
import e3.t;
import ii.z3;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.Executors;
import k2.p1;
import org.json.JSONObject;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.zk;
import org.telegram.ui.vq0;
public class s implements j0, e3.g, fg.a, gg.a, ha.d, ia.a, t9.d, em0, Continuation, p5.b, eb, l1, q0, t2.k, w5.a, z3.g {
    public static s f56473b;
    public static final s f56474c = new s(13);
    public static s d;
    public final int f56475a;

    public s(int i3) {
        this.f56475a = i3;
    }

    public static Calendar C0() {
        if (d == null) {
            d = new s(24);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static boolean F0(s1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: v7.s.F0(s1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static String M0(xc.c cVar) {
        String str = cVar.f58608a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    public static void O0(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new qc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new qc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static MediaCodec w0(l2.e eVar) {
        String str = ((t2.o) eVar.f17689a).f54852a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override
    public StackTraceElement[] A(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public long D(e3.p pVar) {
        return -1L;
    }

    @Override
    public d2 E() {
        return null;
    }

    @Override
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override
    public void G(fb fbVar, qa qaVar, vf vfVar, zk zkVar) {
        fbVar.setInOutOffset(fbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(fbVar.getTranslationY()));
        q1.g gVar = new q1.g((Object) fbVar, fb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.f53653m.a(0.8f);
        gVar.f53653m.b(400.0f);
        gVar.a(new z3(1, fbVar, vfVar));
        gVar.b(new db(zkVar, fbVar, 1));
        gVar.h();
        qaVar.run();
    }

    @Override
    public CharacterStyle G1(q1 q1Var) {
        return null;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    public boolean I0(CharSequence charSequence) {
        return false;
    }

    @Override
    public boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public t2.l L(l2.e r6) {
        throw new UnsupportedOperationException("Method not decompiled: v7.s.L(l2.e):t2.l");
    }

    @Override
    public b0 O() {
        return new t(-9223372036854775807L);
    }

    @Override
    public boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
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
    public vq0 S1() {
        return null;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean V1(long j10) {
        return false;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override
    public boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public kh.a Z() {
        return null;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public long b() {
        return 0L;
    }

    @Override
    public boolean b0(q1 q1Var) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        switch (this.f56475a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void e(fb fbVar, qa qaVar, oa oaVar, ra raVar) {
        q1.g gVar = new q1.g(fbVar, fb.IN_OUT_OFFSET_Y, fbVar.getHeight());
        gVar.f53653m.a(0.8f);
        gVar.f53653m.b(400.0f);
        gVar.a(new sa(oaVar, 1));
        gVar.b(new db(raVar, fbVar, 0));
        gVar.h();
        qaVar.run();
    }

    @Override
    public boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public String g(q1 q1Var) {
        return null;
    }

    @Override
    public Object mo5get() {
        return new n5.p(Executors.newSingleThreadExecutor());
    }

    @Override
    public int j0(q1 q1Var) {
        return 0;
    }

    @Override
    public ha.b l(nb.a aVar, JSONObject jSONObject) {
        a7.l lVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            lVar = new a7.l(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            lVar = new a7.l(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        a7.l lVar2 = lVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ha.a aVar2 = new ha.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new ha.b(currentTimeMillis, lVar2, aVar2, optDouble, optDouble2, optInt2);
    }

    @Override
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 >= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(p1.i(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i11;
            int ceil = (int) Math.ceil((i10 / i3) * remaining);
            int i12 = remaining - ceil;
            float f10 = ceil;
            float f11 = f10 / f10;
            float f12 = i12;
            float f13 = f12 / f12;
            while (ceil > 0 && i12 > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f11 = ceil / f10;
                } else {
                    shortBuffer.position(shortBuffer.position() + i11);
                    i12--;
                    f13 = i12 / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m2(int i3) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public long o() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public boolean p1(q1 q1Var, int i3) {
        return false;
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f56475a) {
            case 11:
                return new mb.d(keVar.f(mb.h.class));
            default:
                return new mb.k((Context) keVar.a(Context.class));
        }
    }

    @Override
    public i9 q2() {
        return null;
    }

    @Override
    public boolean r0(t0 t0Var, float f10, float f11) {
        return false;
    }

    @Override
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }

    @Override
    public boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean x0(zi ziVar) {
        return true;
    }

    @Override
    public boolean y1() {
        return false;
    }

    @Override
    public String z(long j10) {
        return null;
    }

    @Override
    public void K1() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void finish() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void i0() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void q() {
    }

    @Override
    public void v() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(q1 q1Var) {
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void C1(zi ziVar) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void F(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void I(q1 q1Var) {
    }

    @Override
    public void J(wi wiVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(zi ziVar) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void S0(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void W(long j10) {
    }

    @Override
    public void Y(t2 t2Var) {
    }

    @Override
    public void Z1(q1 q1Var) {
    }

    @Override
    public void c0(t0 t0Var) {
    }

    @Override
    public void e0(int i3) {
    }

    @Override
    public void f(a2 a2Var) {
    }

    @Override
    public void f2(q1 q1Var) {
    }

    @Override
    public long k(long j10) {
        return j10;
    }

    @Override
    public void k0(q1 q1Var) {
    }

    @Override
    public void m(float f10) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(q1 q1Var) {
    }

    @Override
    public void r(t0 t0Var) {
    }

    @Override
    public void s(q1 q1Var) {
    }

    @Override
    public void t1(q1 q1Var) {
    }

    @Override
    public void u(t0 t0Var) {
    }

    @Override
    public void u0(long j10) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void x(t0 t0Var) {
    }

    @Override
    public void y(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override
    public void U1(String str, String str2) {
    }

    @Override
    public void a2(q1 q1Var, long j10) {
    }

    @Override
    public void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void f1(q1 q1Var, int i3) {
    }

    @Override
    public void h(t0 t0Var, int i3) {
    }

    @Override
    public void q0(t0 t0Var, String str) {
    }

    @Override
    public void u1(q1 q1Var, boolean z10) {
    }

    @Override
    public void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void z1(q1 q1Var, int i3) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void M(t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void i1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p2(q1 q1Var, int i3, int i10) {
    }

    @Override
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void t(t0 t0Var, int i3, int i10) {
    }

    @Override
    public int v1(int i3, int i10, int i11) {
        return i3;
    }

    @Override
    public void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void v0(t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
