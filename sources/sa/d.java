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
import f3.q;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m2.j;
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.l10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.vg;
import org.telegram.ui.dr0;
import org.telegram.ui.m11;
import org.telegram.ui.qm;
import q2.k;
import q2.n;
import q2.o;
import u2.u;
import y2.m;
public class d implements SuccessContinuation, b7.c, m11, eg.a, q, fg.a, j2.g, Continuation, u9.d, ii, cg, gh.a, l1, n, u, m, yi.g {
    public static final d f56559b = new d(13);
    public final int f56560a;

    public d(int i7) {
        this.f56560a = i7;
    }

    public static void D2(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new tc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new tc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static final CharSequence E2(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public q2.h A(k kVar, e2.u uVar) {
        if (uVar.f10454w == null) {
            return null;
        }
        return new o(new q2.g(6001, new Exception()));
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public int A2() {
        return 0;
    }

    public boolean C2(CharSequence charSequence) {
        return false;
    }

    @Override
    public int D(Context context, String str) {
        return b7.f.a(context, str);
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
        if (uVar.f10454w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean H1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public q2.m L(k kVar, e2.u uVar) {
        return q2.m.f55188z;
    }

    @Override
    public boolean L0(long j3) {
        return false;
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
    public TLRPC.TL_channels_sendAsPeers O() {
        return null;
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
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public CharacterStyle R1(q1 q1Var) {
        return null;
    }

    @Override
    public boolean S(q1 q1Var) {
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
    public boolean T1(q1 q1Var, gj gjVar) {
        return false;
    }

    @Override
    public int U0() {
        return 0;
    }

    @Override
    public boolean V0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public float Z0() {
        return -1.0f;
    }

    @Override
    public boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean a0(q1 q1Var) {
        return false;
    }

    @Override
    public int b1() {
        return 0;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public dr0 c2() {
        return null;
    }

    @Override
    public j2.h createDataSource() {
        return new j2.c(false);
    }

    @Override
    public void d0(vg vgVar) {
        vgVar.run();
    }

    @Override
    public i0 d2(int i7, int i10) {
        return new f3.n();
    }

    @Override
    public MediaCodecInfo e(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override
    public boolean e1(long j3) {
        return false;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean f1(gj gjVar) {
        return y0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public boolean g() {
        return true;
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
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public boolean h2(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public Object i(r7 r7Var) {
        switch (this.f56560a) {
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
    public int i0(q1 q1Var) {
        return 0;
    }

    @Override
    public long k0() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean l0() {
        return false;
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
    public boolean next() {
        return false;
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public qm p0() {
        return null;
    }

    @Override
    public boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public int q(Context context, String str, boolean z10) {
        return b7.f.d(context, str, z10);
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            fg.a.v.r0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 > i10) {
            fg.a.f11293u.r0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 == i10) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public TLRPC.Peer s() {
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
    public String x(long j3) {
        return null;
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
    public boolean y0(gj gjVar) {
        return true;
    }

    @Override
    public boolean z1(q1 q1Var, int i7) {
        return false;
    }

    @Override
    public i9 z2() {
        return null;
    }

    public d(Context context) {
        this.f56560a = 10;
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
    public void E() {
    }

    @Override
    public void G0() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void I() {
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
    public void Y() {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void d() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m0() {
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
    public void p() {
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
    public void t() {
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
    public void B(q1 q1Var) {
    }

    @Override
    public void C(boolean z10) {
    }

    @Override
    public void C1(q1 q1Var) {
    }

    @Override
    public void D0(String str) {
    }

    @Override
    public void F0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void I0(q1 q1Var) {
    }

    @Override
    public void J(dj djVar) {
    }

    @Override
    public void L1(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void N0(q1 q1Var) {
    }

    @Override
    public void O1(gj gjVar) {
    }

    @Override
    public void P(gj gjVar) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void W0(q1 q1Var) {
    }

    @Override
    public void X0(q1 q1Var) {
    }

    @Override
    public void a1(int i7) {
    }

    @Override
    public void b0(boolean z10) {
    }

    @Override
    public void e0(int i7) {
    }

    @Override
    public void f(b0 b0Var) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void j0(q1 q1Var) {
    }

    @Override
    public void j2(q1 q1Var) {
    }

    @Override
    public void k2(int i7) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void n2(boolean z10) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public void q2(q1 q1Var) {
    }

    @Override
    public void r(q1 q1Var) {
    }

    @Override
    public void u(q1 q1Var) {
    }

    @Override
    public void u1(CharSequence charSequence) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void y(float f10) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void z0(q1 q1Var) {
    }

    @Override
    public void F(String str, Throwable th2) {
    }

    @Override
    public void F1(q1 q1Var, boolean z10) {
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(q1 q1Var, int i7) {
    }

    @Override
    public void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W(float f10, int i7) {
    }

    @Override
    public void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(q1 q1Var, l10 l10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(q1 q1Var, long j3) {
    }

    @Override
    public void p1(q1 q1Var, int i7) {
    }

    @Override
    public void r1(Looper looper, j jVar) {
    }

    @Override
    public void B0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void H0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return i7;
    }

    @Override
    public void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void q0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void t1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void y2(q1 q1Var, int i7, int i10) {
    }

    @Override
    public void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override
    public void g2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
