package ra;

import a3.m;
import a3.s;
import a7.l;
import android.content.Context;
import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import b8.ke;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g2.n0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l2.k;
import org.json.JSONObject;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.uf;
import org.telegram.ui.f11;
import org.telegram.ui.mm;
import org.telegram.ui.vq0;
import p2.o;
import p2.q;
import r2.p;
import r2.t;
import t2.u;
public final class e implements a7.e, m, ba.d, f11, k5.e, fg.a, gg.a, ha.d, i2.g, t9.d, SuccessContinuation, OnFailureListener, s, uf, l1, q, t, u {
    public static final e f54461b = new e(13);
    public static e f54462c;
    public final int f54463a;

    public e(int i3) {
        this.f54463a = i3;
    }

    public static short D4(short s6, short s10) {
        int i3;
        int i10 = s6 + 32768;
        int i11 = s10 + 32768;
        int i12 = 65535;
        if (i10 >= 32768 && i11 >= 32768) {
            i3 = (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        } else {
            i3 = (i10 * i11) / 32768;
        }
        if (i3 != 65536) {
            i12 = i3;
        }
        return (short) (i12 - 32768);
    }

    public static ha.b s2(nb.a aVar) {
        return new ha.b(System.currentTimeMillis() + 3600000, new l(8), new ha.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i3 = this.f54463a;
    }

    @Override
    public void A1(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void B(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean B1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void C(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public byte[] C0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void C1(zi ziVar) {
        int i3 = this.f54463a;
    }

    @Override
    public String D() {
        return null;
    }

    @Override
    public void D0(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public int D1() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void E0(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.f54463a;
    }

    @Override
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f54463a) {
            case 18:
            default:
                sf.c.t(q1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void F1(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void G0(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public CharacterStyle G1(q1 q1Var) {
        switch (this.f54463a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void H(q1 q1Var, o2 o2Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(D4(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        int i11 = this.f54463a;
    }

    @Override
    public void I(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean I1(q1 q1Var, zi ziVar) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(wi wiVar) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean J0(long j10) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public o J1(byte[] bArr, List list, int i3, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i3 = this.f54463a;
    }

    @Override
    public void K0(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void K1() {
        int i3 = this.f54463a;
    }

    @Override
    public Object L(Uri uri, i2.l lVar) {
        return Long.valueOf(n0.V(new BufferedReader(new InputStreamReader(lVar)).readLine()));
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i3 = this.f54463a;
    }

    @Override
    public int L1() {
        return 1;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers M() {
        return null;
    }

    @Override
    public void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i3 = this.f54463a;
    }

    @Override
    public void N(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i3 = this.f54463a;
    }

    @Override
    public void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i3 = this.f54463a;
    }

    @Override
    public int O0() {
        return 0;
    }

    @Override
    public void P(zi ziVar) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean P0(q1 q1Var, boolean z10) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void Q1(q1 q1Var, g10 g10Var) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean R() {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public TL_stories.StoryItem R0() {
        return null;
    }

    @Override
    public s R1() {
        return new r2.s(p.f54180n, null);
    }

    @Override
    public boolean S(q1 q1Var) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public vq0 S1() {
        switch (this.f54463a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean T() {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean T0(long j10) {
        return false;
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        int i10 = this.f54463a;
    }

    @Override
    public void U0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void U1(String str, String str2) {
        int i3 = this.f54463a;
    }

    @Override
    public void V(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean V0() {
        return false;
    }

    @Override
    public boolean V1(long j10) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p2.p W() {
        throw new IllegalStateException();
    }

    @Override
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
        int i10 = this.f54463a;
    }

    @Override
    public int X() {
        switch (this.f54463a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean X0(zi ziVar) {
        int i3 = this.f54463a;
        return f1.a(ziVar);
    }

    @Override
    public boolean Y(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public kh.a Z() {
        switch (this.f54463a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z1(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void a() {
        synchronized (b3.b.f2345a) {
            Object obj = b3.b.f2346b;
            synchronized (obj) {
                if (b3.b.f2347c) {
                    return;
                }
                long a10 = b3.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    b3.b.d = a10;
                    b3.b.f2347c = true;
                }
            }
        }
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public void a2(q1 q1Var, long j10) {
        int i3 = this.f54463a;
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public boolean b0(q1 q1Var) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c() {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c1() {
        int i3 = this.f54463a;
    }

    @Override
    public i2.h createDataSource() {
        return new i2.c(false);
    }

    @Override
    public boolean d() {
        switch (this.f54463a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean d0(q1 q1Var, TLRPC.User user) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.f54463a;
    }

    @Override
    public void e0(int i3) {
        int i10 = this.f54463a;
    }

    @Override
    public boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f0() {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f1(q1 q1Var, int i3) {
        int i10 = this.f54463a;
    }

    @Override
    public void f2(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public String g(q1 q1Var) {
        switch (this.f54463a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public MediaCodecInfo h(int i3) {
        return MediaCodecList.getCodecInfoAt(i3);
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
        int i3 = this.f54463a;
    }

    @Override
    public void h2() {
        int i3 = this.f54463a;
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
        int i12 = this.f54463a;
    }

    @Override
    public mm i0() {
        return null;
    }

    @Override
    public void i1(q1 q1Var, float f10, float f11) {
        int i3 = this.f54463a;
    }

    @Override
    public void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i3 = this.f54463a;
    }

    @Override
    public void j() {
        int i3 = this.f54463a;
    }

    @Override
    public int j0(q1 q1Var) {
        switch (this.f54463a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public s j2(p pVar, r2.m mVar) {
        return new r2.s(pVar, mVar);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void k0(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public boolean k2() {
        return false;
    }

    @Override
    public ha.b l(nb.a aVar, JSONObject jSONObject) {
        return s2(aVar);
    }

    @Override
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 < i10) {
            gg.a.f12273u.l0(shortBuffer, i3, shortBuffer2, i10, i11);
        } else if (i3 > i10) {
            gg.a.f12272t.l0(shortBuffer, i3, shortBuffer2, i10, i11);
        } else if (i3 == i10) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public a7.d l1(Context context, String str, a7.c cVar) {
        a7.d dVar = new a7.d();
        dVar.f138a = cVar.k(context, str);
        int i3 = 1;
        int e10 = cVar.e(context, str, true);
        dVar.f139b = e10;
        int i10 = dVar.f138a;
        if (i10 == 0) {
            i10 = 0;
            if (e10 == 0) {
                i3 = 0;
                dVar.f140c = i3;
                return dVar;
            }
        }
        if (e10 < i10) {
            i3 = -1;
        }
        dVar.f140c = i3;
        return dVar;
    }

    @Override
    public boolean l2(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean m0() {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean m2(int i3) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
        int i10 = this.f54463a;
    }

    @Override
    public void n0(String str) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean n1() {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int o() {
        return 0;
    }

    @Override
    public boolean o0(p5 p5Var) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public byte[] o1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void o2() {
        int i3 = this.f54463a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public void p(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean p1(q1 q1Var, int i3) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p2(q1 q1Var, int i3, int i10) {
        int i11 = this.f54463a;
    }

    @Override
    public void q() {
        int i3 = this.f54463a;
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f54463a) {
            case 11:
                return new lb.c(keVar.I(lb.b.class));
            case 12:
                return new lb.b(keVar.f(kb.a.class));
            default:
                return new Object();
        }
    }

    @Override
    public i9 q2() {
        switch (this.f54463a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public Map r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public j2.b r0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void r1(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.f54463a;
    }

    @Override
    public void s(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i3 = this.f54463a;
    }

    @Override
    public TLRPC.Peer t() {
        return null;
    }

    @Override
    public void t0(q1 q1Var, float f10, float f11, boolean z10) {
        int i3 = this.f54463a;
    }

    @Override
    public void t1(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i3 = l6.c.h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    @Override
    public boolean u0() {
        return true;
    }

    @Override
    public void u1(q1 q1Var, boolean z10) {
        int i3 = this.f54463a;
    }

    @Override
    public void v() {
        int i3 = this.f54463a;
    }

    @Override
    public int v1(int i3, int i10, int i11) {
        return i3 / 2;
    }

    @Override
    public void w(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean w1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean x0(zi ziVar) {
        switch (this.f54463a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.f54463a;
    }

    @Override
    public void y(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public void y0(q1 q1Var) {
        int i3 = this.f54463a;
    }

    @Override
    public boolean y1() {
        switch (this.f54463a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String z(long j10) {
        switch (this.f54463a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z0() {
        int i3 = this.f54463a;
    }

    @Override
    public void z1(q1 q1Var, int i3) {
        int i10 = this.f54463a;
    }

    private final void B4() {
    }

    private final void C4() {
    }

    private final void D2() {
    }

    private final void E2() {
    }

    private final void G4() {
    }

    private final void H4() {
    }

    private final void K4() {
    }

    private final void L4() {
    }

    private final void O4() {
    }

    private final void P4() {
    }

    private final void R3() {
    }

    private final void S3() {
    }

    private final void r3() {
    }

    private final void s3() {
    }

    private final void x2() {
    }

    private final void y2() {
    }

    @Override
    public void E() {
    }

    @Override
    public void F() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void I0() {
    }

    @Override
    public void O1() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void b1() {
    }

    @Override
    public void b2() {
    }

    @Override
    public void e() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void f() {
    }

    @Override
    public void g0() {
    }

    @Override
    public void g1() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void m1() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s1() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w0() {
    }

    private final void A2(q1 q1Var) {
    }

    private final void B2(q1 q1Var) {
    }

    private final void B3(q1 q1Var) {
    }

    private final void C2(q1 q1Var) {
    }

    private final void C3(q1 q1Var) {
    }

    private final void F2(q1 q1Var) {
    }

    private final void G2(q1 q1Var) {
    }

    private final void H3(q1 q1Var) {
    }

    private final void I3(q1 q1Var) {
    }

    private final void I4(int i3) {
    }

    private final void J2(q1 q1Var) {
    }

    private final void J3(q1 q1Var) {
    }

    private final void J4(int i3) {
    }

    private final void K2(q1 q1Var) {
    }

    private final void K3(q1 q1Var) {
    }

    private final void L3(q1 q1Var) {
    }

    private final void M3(q1 q1Var) {
    }

    private final void M4(zi ziVar) {
    }

    private final void N4(zi ziVar) {
    }

    private final void P2(q1 q1Var) {
    }

    private final void P3(q1 q1Var) {
    }

    private final void Q2(q1 q1Var) {
    }

    private final void Q3(q1 q1Var) {
    }

    private final void R2(wi wiVar) {
    }

    private final void S2(wi wiVar) {
    }

    private final void T2(q1 q1Var) {
    }

    private final void U2(q1 q1Var) {
    }

    private final void X2(q1 q1Var) {
    }

    private final void Y2(q1 q1Var) {
    }

    private final void Z3(String str) {
    }

    private final void a4(String str) {
    }

    private final void b3(q1 q1Var) {
    }

    private final void c3(q1 q1Var) {
    }

    private final void f4(q1 q1Var) {
    }

    private final void g4(q1 q1Var) {
    }

    private final void j3(q1 q1Var) {
    }

    private final void j4(q1 q1Var) {
    }

    private final void k3(q1 q1Var) {
    }

    private final void k4(q1 q1Var) {
    }

    private final void l3(q1 q1Var) {
    }

    private final void l4(zi ziVar) {
    }

    private final void m3(q1 q1Var) {
    }

    private final void m4(zi ziVar) {
    }

    private final void n4(q1 q1Var) {
    }

    private final void o4(q1 q1Var) {
    }

    private final void r4(q1 q1Var) {
    }

    private final void s4(q1 q1Var) {
    }

    private final void x4(q1 q1Var) {
    }

    private final void z2(q1 q1Var) {
    }

    private final void z4(q1 q1Var) {
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void M0(int i3) {
    }

    @Override
    public void T1(int i3) {
    }

    @Override
    public void W0(byte[] bArr) {
    }

    @Override
    public void c0(boolean z10) {
    }

    @Override
    public void c2(boolean z10) {
    }

    @Override
    public void j1(CharSequence charSequence) {
    }

    @Override
    public void m(org.telegram.ui.Components.i9 i9Var) {
    }

    @Override
    public void x(float f10) {
    }

    private final void D3(String str, String str2) {
    }

    private final void E3(String str, String str2) {
    }

    private final void H2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void I2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V2(q1 q1Var, o2 o2Var) {
    }

    private final void W2(q1 q1Var, o2 o2Var) {
    }

    private final void Z2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void a3(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void b4(q1 q1Var, long j10) {
    }

    private final void c4(q1 q1Var, long j10) {
    }

    private final void f3(q1 q1Var, int i3) {
    }

    private final void g3(q1 q1Var, int i3) {
    }

    private final void h3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void i3(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void p3(q1 q1Var, int i3) {
    }

    private final void p4(q1 q1Var, g10 g10Var) {
    }

    private final void q3(q1 q1Var, int i3) {
    }

    private final void q4(q1 q1Var, g10 g10Var) {
    }

    private final void t4(q1 q1Var, boolean z10) {
    }

    private final void v2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v4(q1 q1Var, boolean z10) {
    }

    private final void w2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void O(float f10, int i3) {
    }

    @Override
    public void v0(byte[] bArr, k kVar) {
    }

    private final void A4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void F3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void G3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void N2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void N3(q1 q1Var, float f10, float f11) {
    }

    private final void O2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void O3(q1 q1Var, float f10, float f11) {
    }

    private final void T3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void U3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void d3(q1 q1Var, int i3, int i10) {
    }

    private final void e3(q1 q1Var, int i3, int i10) {
    }

    private final void h4(q1 q1Var, float f10, float f11) {
    }

    private final void i4(q1 q1Var, float f10, float f11) {
    }

    private final void t2(q1 q1Var, float f10, float f11) {
    }

    private final void t3(q1 q1Var, float f10, float f11) {
    }

    private final void u2(q1 q1Var, float f10, float f11) {
    }

    private final void u3(q1 q1Var, float f10, float f11) {
    }

    private final void u4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void w4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void y4(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void Y0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void h1(View view, CharSequence charSequence, boolean z10) {
    }

    private final void V3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void W3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void X3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Y3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void n3(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void o3(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void v3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final void w3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final void A3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    private final void d4(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final void e4(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final void x3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void y3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void z3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
    }

    private final void L2(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    private final void M2(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
    }

    private final void E4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }

    private final void F4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
