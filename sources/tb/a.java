package tb;

import a8.me;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.car.app.messaging.model.b;
import b2.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import g2.g;
import g2.h;
import hb.n;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import n2.f;
import n2.j;
import n2.l;
import n2.m;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.b61;
import org.telegram.ui.cv0;
import org.telegram.ui.d3;
import r2.u;
import s9.d;
import y2.i;
import z6.c;
import z6.e;
public final class a implements b, b61, dg.a, eg.a, g, n, ri, m, j1, d, u, OnFailureListener, Continuation, v2.m, i, c {
    public final int f48766a;

    public a(int i10) {
        this.f48766a = i10;
    }

    public static void X4(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new wc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new wc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    @Override
    public void A(gh ghVar) {
        ghVar.run();
    }

    @Override
    public void A0(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean B(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void B1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f48766a;
    }

    @Override
    public void C(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean C0(long j10) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean C1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void D(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public void E0(int i10, s1 s1Var) {
        int i11 = this.f48766a;
    }

    @Override
    public cv0 E1() {
        switch (this.f48766a) {
            case 15:
                return null;
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void F(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f48766a;
    }

    @Override
    public void F0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f48766a;
    }

    @Override
    public int G() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public boolean G1(long j10) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H1(s1 s1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f48766a;
    }

    @Override
    public void I(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void I0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean I1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(int i10, s1 s1Var) {
        int i11 = this.f48766a;
    }

    @Override
    public boolean J0(s1 s1Var, boolean z10) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(MessageObject messageObject) {
        int i10 = this.f48766a;
    }

    @Override
    public void K0(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void K1(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean L(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L0(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean M() {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void M1(s1 s1Var, long j10) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean N(s1 s1Var) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O() {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O0(int i10, s1 s1Var) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f48766a;
    }

    @Override
    public void Q(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public int S() {
        switch (this.f48766a) {
            case 15:
                return 0;
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        int i10 = this.f48766a;
        return d3.a(messageObject);
    }

    @Override
    public int U(Context context, String str) {
        return e.a(context, str);
    }

    @Override
    public void U0() {
        int i10 = this.f48766a;
    }

    @Override
    public Object U1() {
        switch (this.f48766a) {
            case 9:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public jh.a V() {
        switch (this.f48766a) {
            case 15:
                return null;
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void V1() {
        int i10 = this.f48766a;
    }

    @Override
    public boolean W(s1 s1Var) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f48766a;
    }

    @Override
    public void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean X(s1 s1Var, TLRPC.User user) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean X1(int i10) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z(int i10) {
        int i11 = this.f48766a;
    }

    @Override
    public void Z0(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f48766a;
    }

    @Override
    public void Z1() {
        int i10 = this.f48766a;
    }

    @Override
    public boolean a0() {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a2(s1 s1Var, int i10, int i11) {
        int i12 = this.f48766a;
    }

    @Override
    public void b() {
        synchronized (z2.b.f52635a) {
            Object obj = z2.b.f52636b;
            synchronized (obj) {
                if (z2.b.f52637c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f52637c = true;
                }
            }
        }
    }

    @Override
    public void b0(s1 s1Var, float f7, float f10) {
        int i10 = this.f48766a;
    }

    @Override
    public t9 b2() {
        switch (this.f48766a) {
            case 15:
                return null;
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean c() {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int c0(s1 s1Var) {
        switch (this.f48766a) {
            case 15:
                return 0;
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public boolean d() {
        switch (this.f48766a) {
            case 15:
                return true;
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void d0(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public Object d1(me meVar) {
        switch (this.f48766a) {
            case 18:
                return new rb.c(meVar.x(rb.b.class));
            default:
                return new rb.b(meVar.d(qb.a.class));
        }
    }

    @Override
    public MediaCodecInfo e(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean e0() {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f1(s1 s1Var, float f7, float f10) {
        int i10 = this.f48766a;
    }

    @Override
    public l g(j jVar, x xVar) {
        return l.f18628u;
    }

    @Override
    public void g0(String str) {
        int i10 = this.f48766a;
    }

    @Override
    public String h(s1 s1Var) {
        switch (this.f48766a) {
            case 15:
                return null;
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean h0(c6 c6Var) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f48766a;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void j() {
        int i10 = this.f48766a;
    }

    @Override
    public void j0(s1 s1Var, float f7, float f10) {
        int i10 = this.f48766a;
    }

    @Override
    public long k() {
        throw new NoSuchElementException();
    }

    @Override
    public void k0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public boolean k1() {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f48766a;
    }

    @Override
    public void l1(s1 s1Var, boolean z10, boolean z11) {
        int i10 = this.f48766a;
    }

    @Override
    public void m(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void m0(s1 s1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f48766a;
    }

    @Override
    public void m1(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void n() {
        int i10 = this.f48766a;
    }

    @Override
    public void n0(s1 s1Var, bh.n nVar) {
        int i10 = this.f48766a;
    }

    @Override
    public void n1(s1 s1Var, boolean z10) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public boolean o(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void o0(s1 s1Var, float f7, float f10, boolean z10) {
        int i10 = this.f48766a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public void p(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean p1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q() {
        int i10 = this.f48766a;
    }

    @Override
    public boolean q0(MessageObject messageObject) {
        switch (this.f48766a) {
            case 15:
                return true;
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void q1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f48766a;
    }

    @Override
    public void r(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void r0(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean r1() {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void s0() {
        int i10 = this.f48766a;
    }

    @Override
    public void s1(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public int t(Context context, String str, boolean z10) {
        return e.d(context, str, z10);
    }

    @Override
    public void t0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f48766a;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
            return null;
        }
        return null;
    }

    @Override
    public String u(long j10) {
        switch (this.f48766a) {
            case 15:
                return null;
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void u0(s1 s1Var, float f7, float f10) {
        int i10 = this.f48766a;
    }

    @Override
    public void u1(MessageObject messageObject) {
        int i10 = this.f48766a;
    }

    @Override
    public void v(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f48766a) {
            case 15:
            case 16:
            default:
                qf.d.r(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public int w(x xVar) {
        if (xVar.f3589w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public void w0(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public CharacterStyle w1(s1 s1Var) {
        switch (this.f48766a) {
            case 15:
                return null;
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void x(s1 s1Var) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean x0() {
        return false;
    }

    @Override
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f48766a;
    }

    @Override
    public long y() {
        throw new NoSuchElementException();
    }

    @Override
    public void y0(s1 s1Var, boolean z10, boolean z11) {
        int i10 = this.f48766a;
    }

    @Override
    public boolean y1(s1 s1Var, MessageObject messageObject) {
        switch (this.f48766a) {
            case 15:
                return false;
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public n2.g z(j jVar, x xVar) {
        if (xVar.f3589w == null) {
            return null;
        }
        return new n2.n(new f(6001, new Exception()));
    }

    @Override
    public void z1() {
        int i10 = this.f48766a;
    }

    private final void D3() {
    }

    private final void E3() {
    }

    private final void F3() {
    }

    private final void F4() {
    }

    private final void G4() {
    }

    private final void H4() {
    }

    private final void L4() {
    }

    private final void M4() {
    }

    private final void N4() {
    }

    private final void P0() {
    }

    private final void Q0() {
    }

    private final void R0() {
    }

    private final void R4() {
    }

    private final void S4() {
    }

    private final void T2() {
    }

    private final void T4() {
    }

    private final void U2() {
    }

    private final void V2() {
    }

    private final void Y4() {
    }

    private final void Z4() {
    }

    private final void a5() {
    }

    private final void c1() {
    }

    private final void e1() {
    }

    private final void g1() {
    }

    @Override
    public void H() {
    }

    @Override
    public void R() {
    }

    @Override
    public void a() {
    }

    @Override
    public void f0() {
    }

    @Override
    public void release() {
    }

    private final void A3(s1 s1Var) {
    }

    private final void B3(s1 s1Var) {
    }

    private final void B4(s1 s1Var) {
    }

    private final void C3(s1 s1Var) {
    }

    private final void D4(s1 s1Var) {
    }

    private final void H2(s1 s1Var) {
    }

    private final void I2(s1 s1Var) {
    }

    private final void J1(s1 s1Var) {
    }

    private final void J2(s1 s1Var) {
    }

    private final void K2(s1 s1Var) {
    }

    private final void L1(s1 s1Var) {
    }

    private final void L2(s1 s1Var) {
    }

    private final void M2(s1 s1Var) {
    }

    private final void N1(s1 s1Var) {
    }

    private final void O4(int i10) {
    }

    private final void P3(String str) {
    }

    private final void P4(int i10) {
    }

    private final void Q3(String str) {
    }

    private final void Q4(int i10) {
    }

    private final void R3(String str) {
    }

    private final void T0(s1 s1Var) {
    }

    private final void U4(MessageObject messageObject) {
    }

    private final void V0(s1 s1Var) {
    }

    private final void V4(MessageObject messageObject) {
    }

    private final void W4(MessageObject messageObject) {
    }

    private final void X0(s1 s1Var) {
    }

    private final void Y0(s1 s1Var) {
    }

    private final void Y3(s1 s1Var) {
    }

    private final void Z3(s1 s1Var) {
    }

    private final void a1(s1 s1Var) {
    }

    private final void a4(s1 s1Var) {
    }

    private final void b1(s1 s1Var) {
    }

    private final void d2(s1 s1Var) {
    }

    private final void e2(s1 s1Var) {
    }

    private final void e4(s1 s1Var) {
    }

    private final void f2(s1 s1Var) {
    }

    private final void f4(s1 s1Var) {
    }

    private final void g2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void g4(s1 s1Var) {
    }

    private final void h1(s1 s1Var) {
    }

    private final void h2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void h4(MessageObject messageObject) {
    }

    private final void i1(s1 s1Var) {
    }

    private final void i2(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void i3(s1 s1Var) {
    }

    private final void i4(MessageObject messageObject) {
    }

    private final void j1(s1 s1Var) {
    }

    private final void j2(s1 s1Var) {
    }

    private final void j3(s1 s1Var) {
    }

    private final void j4(MessageObject messageObject) {
    }

    private final void k2(s1 s1Var) {
    }

    private final void k3(s1 s1Var) {
    }

    private final void k4(s1 s1Var) {
    }

    private final void l2(s1 s1Var) {
    }

    private final void l4(s1 s1Var) {
    }

    private final void m4(s1 s1Var) {
    }

    private final void o3(s1 s1Var) {
    }

    private final void p2(s1 s1Var) {
    }

    private final void p3(s1 s1Var) {
    }

    private final void q2(s1 s1Var) {
    }

    private final void q3(s1 s1Var) {
    }

    private final void q4(s1 s1Var) {
    }

    private final void r2(s1 s1Var) {
    }

    private final void r3(s1 s1Var) {
    }

    private final void r4(s1 s1Var) {
    }

    private final void s3(s1 s1Var) {
    }

    private final void s4(s1 s1Var) {
    }

    private final void t3(s1 s1Var) {
    }

    private final void u3(s1 s1Var) {
    }

    private final void v2(s1 s1Var) {
    }

    private final void v3(s1 s1Var) {
    }

    private final void w2(s1 s1Var) {
    }

    private final void w3(s1 s1Var) {
    }

    private final void x2(s1 s1Var) {
    }

    private final void z4(s1 s1Var) {
    }

    @Override
    public void T(Object obj) {
    }

    @Override
    public void Y(TLRPC.User user) {
    }

    private final void B2(int i10, s1 s1Var) {
    }

    private final void C2(int i10, s1 s1Var) {
    }

    private final void D1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void D2(int i10, s1 s1Var) {
    }

    private final void E2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void F1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void F2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void G2(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void H0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void M0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void N0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Q2(int i10, s1 s1Var) {
    }

    private final void R2(int i10, s1 s1Var) {
    }

    private final void S2(int i10, s1 s1Var) {
    }

    private final void S3(s1 s1Var, long j10) {
    }

    private final void T3(s1 s1Var, long j10) {
    }

    private final void U3(s1 s1Var, long j10) {
    }

    private final void l3(s1 s1Var, TLRPC.Document document) {
    }

    private final void m2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void m3(s1 s1Var, TLRPC.Document document) {
    }

    private final void n2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void n3(s1 s1Var, TLRPC.Document document) {
    }

    private final void n4(s1 s1Var, bh.n nVar) {
    }

    private final void o1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o2(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void o4(s1 s1Var, bh.n nVar) {
    }

    private final void p4(s1 s1Var, bh.n nVar) {
    }

    private final void s2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void t2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void t4(s1 s1Var, boolean z10) {
    }

    private final void u2(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void v4(s1 s1Var, boolean z10) {
    }

    private final void x4(s1 s1Var, boolean z10) {
    }

    @Override
    public void f(Looper looper, j2.j jVar) {
    }

    private final void A2(s1 s1Var, int i10, int i11) {
    }

    private final void A4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void B0(s1 s1Var, float f7, float f10) {
    }

    private final void C4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void E4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void G3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void H3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void I3(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void T1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void W2(s1 s1Var, float f7, float f10) {
    }

    private final void X2(s1 s1Var, float f7, float f10) {
    }

    private final void Y1(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void Y2(s1 s1Var, float f7, float f10) {
    }

    private final void b4(s1 s1Var, float f7, float f10) {
    }

    private final void c2(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void c4(s1 s1Var, float f7, float f10) {
    }

    private final void d4(s1 s1Var, float f7, float f10) {
    }

    private final void l0(s1 s1Var, float f7, float f10) {
    }

    private final void u4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void v0(s1 s1Var, float f7, float f10) {
    }

    private final void w4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void x3(s1 s1Var, float f7, float f10) {
    }

    private final void y2(s1 s1Var, int i10, int i11) {
    }

    private final void y3(s1 s1Var, float f7, float f10) {
    }

    private final void y4(s1 s1Var, boolean z10, boolean z11) {
    }

    private final void z2(s1 s1Var, int i10, int i11) {
    }

    private final void z3(s1 s1Var, float f7, float f10) {
    }

    private final void J3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void K3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void L3(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void M3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void N2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final void N3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void O2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final void O3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void P2(s1 s1Var, float f7, float f10, boolean z10) {
    }

    private final void Z2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void a3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void b3(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void V3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void W3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void X3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void c3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void d3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void e3(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void f3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void g3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void h3(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void O1(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void P1(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void S1(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void I4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void J4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void K4(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
