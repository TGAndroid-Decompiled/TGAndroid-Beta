package sa;

import a8.r7;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import f3.b0;
import f3.i0;
import f3.n;
import f3.q;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m2.i;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import org.telegram.ui.q11;
import org.telegram.ui.rm;
import org.telegram.utils.twidget.d1;
import org.telegram.utils.twidget.k0;
import org.telegram.utils.twidget.n0;
import q2.j;
import q2.l;
import q2.m;
import u2.u;
public class d implements SuccessContinuation, b7.c, q11, eg.a, q, fg.a, j2.g, Continuation, u9.d, qi, kg, gh.a, m1, m, u, y2.m, yi.f {
    public static final d f57133b = new d(13);
    public final int f57134a;

    public d(int i7) {
        this.f57134a = i7;
    }

    public static void D2(d1 d1Var, boolean z10) {
        String str;
        pk0 pk0Var;
        k0 h = n0.h(d1Var);
        StringBuilder sb2 = new StringBuilder("widget ");
        sb2.append(d1Var.f54691a);
        sb2.append(": engine process died");
        if (z10) {
            str = ", restarting";
        } else {
            str = "";
        }
        p5.c.s(str, sb2);
        if (z10 && h != null && (pk0Var = h.f54819w) != null && pk0Var.f38469f0 && pk0Var.Y != null) {
            pk0Var.s0();
            pk0Var.r0();
        }
    }

    public static void E2(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new tc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new tc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static final CharSequence F2(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
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
    public int C(Context context, String str) {
        return b7.f.a(context, str);
    }

    public boolean C2(CharSequence charSequence) {
        return false;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public boolean E0() {
        return true;
    }

    @Override
    public int E1(e2.u uVar) {
        if (uVar.f10769w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public l M(j jVar, e2.u uVar) {
        return l.f55762z;
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public boolean N1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public long O() {
        throw new NoSuchElementException();
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public int P1() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override
    public boolean S(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public long S0() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override
    public boolean U(r1 r1Var) {
        return false;
    }

    @Override
    public int U0() {
        return 0;
    }

    @Override
    public boolean V0(r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public int Z() {
        return 0;
    }

    @Override
    public float Z0() {
        return -1.0f;
    }

    @Override
    public boolean Z1(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public int b1() {
        return 0;
    }

    @Override
    public jh.a c0() {
        return null;
    }

    @Override
    public TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public j2.h createDataSource() {
        return new j2.c(false);
    }

    @Override
    public boolean d0(r1 r1Var) {
        return false;
    }

    @Override
    public i0 d2(int i7, int i10) {
        return new n();
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f57134a) {
            case 14:
                return new pb.h();
            default:
                pb.g gVar = (pb.g) r7Var.a(pb.g.class);
                synchronized (w7.q.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        w7.q.a(new Object());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                }
                return new nb.a(0);
        }
    }

    @Override
    public boolean e0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean e1(long j3) {
        return false;
    }

    @Override
    public MediaCodecInfo f(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override
    public void f0(eh ehVar) {
        ehVar.run();
    }

    @Override
    public boolean f1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1() {
        return false;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String i(r1 r1Var) {
        return null;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public int k0(r1 r1Var) {
        return 0;
    }

    @Override
    public rm m0() {
        return null;
    }

    @Override
    public boolean m1() {
        return false;
    }

    @Override
    public int n() {
        return 0;
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public int o(Context context, String str, boolean z10) {
        return b7.f.d(context, str, z10);
    }

    @Override
    public boolean p0(x5 x5Var) {
        return false;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public q2.g r(j jVar, e2.u uVar) {
        if (uVar.f10769w == null) {
            return null;
        }
        return new q2.n(new q2.f(6001, new Exception()));
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            fg.a.v.r0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 > i10) {
            fg.a.f11610u.r0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 == i10) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public TLRPC.Peer t() {
        return null;
    }

    @Override
    public int t0() {
        return 0;
    }

    @Override
    public Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new m6.a(intent);
        }
        return null;
    }

    @Override
    public boolean u2() {
        return false;
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    @Override
    public boolean x0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public boolean y0(fj fjVar) {
        return true;
    }

    @Override
    public String z(long j3) {
        return null;
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        return false;
    }

    @Override
    public k9 z2() {
        return null;
    }

    public d(Context context) {
        this.f57134a = 10;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void A0() {
    }

    @Override
    public void B2() {
    }

    @Override
    public void D() {
    }

    @Override
    public void G() {
    }

    @Override
    public void G0() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void J0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void V() {
    }

    @Override
    public void a() {
    }

    @Override
    public void b0() {
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void g() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void n1() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void u() {
    }

    @Override
    public void v() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void B(r1 r1Var) {
    }

    @Override
    public void C1(r1 r1Var) {
    }

    @Override
    public void D0(String str) {
    }

    @Override
    public void E(r1 r1Var) {
    }

    @Override
    public void F0(r1 r1Var) {
    }

    @Override
    public void I0(r1 r1Var) {
    }

    @Override
    public void K(r1 r1Var) {
    }

    @Override
    public void L(cj cjVar) {
    }

    @Override
    public void L1(r1 r1Var) {
    }

    @Override
    public void N0(r1 r1Var) {
    }

    @Override
    public void O1(fj fjVar) {
    }

    @Override
    public void P(r1 r1Var) {
    }

    @Override
    public void R(fj fjVar) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void W0(r1 r1Var) {
    }

    @Override
    public void X0(r1 r1Var) {
    }

    @Override
    public void Y(r1 r1Var) {
    }

    @Override
    public void a0(boolean z10) {
    }

    @Override
    public void a1(int i7) {
    }

    @Override
    public void h0(int i7) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void j(b0 b0Var) {
    }

    @Override
    public void j2(r1 r1Var) {
    }

    @Override
    public void k2(int i7) {
    }

    @Override
    public void l0(r1 r1Var) {
    }

    @Override
    public void n2(boolean z10) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void q(r1 r1Var) {
    }

    @Override
    public void q2(r1 r1Var) {
    }

    @Override
    public void s(r1 r1Var) {
    }

    @Override
    public void u1(CharSequence charSequence) {
    }

    @Override
    public void w(r1 r1Var) {
    }

    @Override
    public void x(float f10) {
    }

    @Override
    public void y(r1 r1Var) {
    }

    @Override
    public void z0(r1 r1Var) {
    }

    @Override
    public void F(String str, Throwable th2) {
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
    }

    @Override
    public void I(r1 r1Var, p2 p2Var) {
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(r1 r1Var, int i7) {
    }

    @Override
    public void O0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Q(float f10, int i7) {
    }

    @Override
    public void X1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(r1 r1Var, i10 i10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(r1 r1Var, long j3) {
    }

    @Override
    public void p1(r1 r1Var, int i7) {
    }

    @Override
    public void r1(Looper looper, i iVar) {
    }

    @Override
    public void B0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void H0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return i7;
    }

    @Override
    public void N(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void j1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void q0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void y2(r1 r1Var, int i7, int i10) {
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void p(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void X(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
