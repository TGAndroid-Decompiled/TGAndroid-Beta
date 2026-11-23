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
import f3.j0;
import f3.n;
import f3.q;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m2.i;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import org.telegram.ui.p11;
import org.telegram.ui.rm;
import org.telegram.utils.twidget.d1;
import org.telegram.utils.twidget.k0;
import org.telegram.utils.twidget.n0;
import q2.j;
import q2.l;
import q2.m;
import u2.u;
public class d implements SuccessContinuation, b7.c, p11, eg.a, q, fg.a, j2.g, Continuation, u9.d, ri, mg, gh.a, m1, m, u, y2.m, yi.f {
    public static final d f57257b = new d(13);
    public final int f57258a;

    public d(int i7) {
        this.f57258a = i7;
    }

    public static void D2(d1 d1Var, boolean z10) {
        String str;
        rk0 rk0Var;
        k0 h = n0.h(d1Var);
        StringBuilder sb2 = new StringBuilder("widget ");
        sb2.append(d1Var.f54817a);
        sb2.append(": engine process died");
        if (z10) {
            str = ", restarting";
        } else {
            str = "";
        }
        p5.c.s(str, sb2);
        if (z10 && h != null && (rk0Var = h.f54945w) != null && rk0Var.f39333f0 && rk0Var.Y != null) {
            rk0Var.s0();
            rk0Var.r0();
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
    public j9 B2() {
        return null;
    }

    public boolean C2(CharSequence charSequence) {
        return false;
    }

    @Override
    public String D(long j3) {
        return null;
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
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public int E1(e2.u uVar) {
        if (uVar.f10762w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean F0(fj fjVar) {
        return true;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public l I(j jVar, e2.u uVar) {
        return l.f55885z;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public boolean N1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public long P0() {
        throw new NoSuchElementException();
    }

    @Override
    public int P1() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public int Q0() {
        return 0;
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override
    public void S(fh fhVar) {
        fhVar.run();
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
        return false;
    }

    @Override
    public long U() {
        throw new NoSuchElementException();
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
    public boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public int X0() {
        return 0;
    }

    @Override
    public int X1() {
        return 0;
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public TL_stories.StoryItem Y0() {
        return null;
    }

    @Override
    public boolean Z(r1 r1Var) {
        return false;
    }

    @Override
    public rm a0() {
        return null;
    }

    @Override
    public boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean b0() {
        return false;
    }

    @Override
    public boolean b1(long j3) {
        return false;
    }

    @Override
    public Object c(r7 r7Var) {
        switch (this.f57258a) {
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
    public boolean c1(r1 r1Var, boolean z10) {
        return false;
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
    public boolean d() {
        return false;
    }

    @Override
    public boolean d1() {
        return false;
    }

    @Override
    public j0 d2(int i7, int i10) {
        return new n();
    }

    @Override
    public int e0() {
        return 0;
    }

    @Override
    public void f0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 < i10) {
            fg.a.v.f0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 > i10) {
            fg.a.f11604u.f0(shortBuffer, i7, shortBuffer2, i10, i11);
        } else if (i7 == i10) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public MediaCodecInfo g(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override
    public boolean g1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override
    public jh.a h0() {
        return null;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean j0(r1 r1Var) {
        return false;
    }

    @Override
    public boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String k(r1 r1Var) {
        return null;
    }

    @Override
    public boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public int l(Context context, String str, boolean z10) {
        return b7.f.d(context, str, z10);
    }

    @Override
    public boolean l1() {
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
    public TLRPC.Peer o() {
        return null;
    }

    @Override
    public int p0(r1 r1Var) {
        return 0;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public boolean s0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean s2() {
        return false;
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
    public q2.g v(j jVar, e2.u uVar) {
        if (uVar.f10762w == null) {
            return null;
        }
        return new q2.n(new q2.f(6001, new Exception()));
    }

    @Override
    public boolean v0(x5 x5Var) {
        return false;
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public boolean w0() {
        return true;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public int x2() {
        return 0;
    }

    @Override
    public int y(Context context, String str) {
        return b7.f.a(context, str);
    }

    @Override
    public boolean y2(int i7) {
        return false;
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        return false;
    }

    public d(Context context) {
        this.f57258a = 10;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void B0() {
    }

    @Override
    public void E() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void H0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void N() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void V() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void e() {
    }

    @Override
    public void f() {
    }

    @Override
    public void g0() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l0() {
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
    public void r() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void release() {
    }

    @Override
    public void t2() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void x() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void z() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void A(r1 r1Var) {
    }

    @Override
    public void C(r1 r1Var) {
    }

    @Override
    public void C1(r1 r1Var) {
    }

    @Override
    public void F(r1 r1Var) {
    }

    @Override
    public void G0(r1 r1Var) {
    }

    @Override
    public void J(r1 r1Var) {
    }

    @Override
    public void L0(r1 r1Var) {
    }

    @Override
    public void L1(r1 r1Var) {
    }

    @Override
    public void M(r1 r1Var) {
    }

    @Override
    public void N0(r1 r1Var) {
    }

    @Override
    public void O(cj cjVar) {
    }

    @Override
    public void O0(Object obj) {
    }

    @Override
    public void O1(fj fjVar) {
    }

    @Override
    public void Q(boolean z10) {
    }

    @Override
    public void R(r1 r1Var) {
    }

    @Override
    public void S0(r1 r1Var) {
    }

    @Override
    public void U0(int i7) {
    }

    @Override
    public void W(fj fjVar) {
    }

    @Override
    public void d0(r1 r1Var) {
    }

    @Override
    public void e1(r1 r1Var) {
    }

    @Override
    public void f1(r1 r1Var) {
    }

    @Override
    public void h(f3.c0 c0Var) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void i2(int i7) {
    }

    @Override
    public void k2(r1 r1Var) {
    }

    @Override
    public void m0(int i7) {
    }

    @Override
    public void n2(boolean z10) {
    }

    @Override
    public void q0(r1 r1Var) {
    }

    @Override
    public void q2(r1 r1Var) {
    }

    @Override
    public void s(r1 r1Var) {
    }

    @Override
    public void t(r1 r1Var) {
    }

    @Override
    public void t0(String str) {
    }

    @Override
    public void u(float f10) {
    }

    @Override
    public void u0(String str) {
    }

    @Override
    public void u1(CharSequence charSequence) {
    }

    @Override
    public void w(boolean z10) {
    }

    @Override
    public void B(String str, Throwable th2) {
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K(float f10, int i7) {
    }

    @Override
    public void K1(r1 r1Var, int i7) {
    }

    @Override
    public void L(r1 r1Var, p2 p2Var) {
    }

    @Override
    public void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void b2(r1 r1Var, h10 h10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void l2(r1 r1Var, long j3) {
    }

    @Override
    public void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(r1 r1Var, int i7) {
    }

    @Override
    public void r1(Looper looper, i iVar) {
    }

    @Override
    public void A2(r1 r1Var, int i7, int i10) {
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void J0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return i7;
    }

    @Override
    public void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void i1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void o0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void x0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void G(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
