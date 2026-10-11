package rb;

import android.media.MediaCodec;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.car.app.messaging.model.b;
import b2.s0;
import c5.b0;
import ci.u5;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnFailureListener;
import fb.m;
import fb.n;
import g2.j;
import g2.u;
import i5.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import ki.x;
import of.f;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.pv0;
import pb.c;
import q9.d;
import r2.l;
import r2.p;
import uc.g;
import y2.i;
import y2.k;
public final class a implements b, bg.a, e, cg.a, ea.a, n, dh.a, d, l1, OnFailureListener, l, v2.l, i {
    public static volatile a f47233b;
    public static a f47234c;
    public final int f47235a;

    public a(int i10) {
        this.f47235a = i10;
    }

    public static void A3(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static k4.d l3(x xVar, b0 b0Var) {
        IOException iOException = (IOException) b0Var.f4203c;
        if (iOException instanceof g2.x) {
            int i10 = ((g2.x) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (xVar.b(1)) {
                    return new k4.d(1, 300000L);
                }
                if (xVar.b(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long n3(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.f4203c;
        if (!(th2 instanceof s0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof k)) {
            int i10 = j.f10253b;
            while (th2 != null) {
                if (!(th2 instanceof j) || ((j) th2).f10254a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((b0Var.f4202b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static MediaCodec y(com.google.firebase.messaging.n nVar) {
        String str = ((p) nVar.f7953a).f46986a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f47235a;
    }

    @Override
    public void A1(u1 u1Var, float f7, float f10) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean A2(int i10) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f47235a;
    }

    @Override
    public void C2() {
        int i10 = this.f47235a;
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        switch (this.f47235a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void D2(u1 u1Var, int i10, int i11) {
        int i12 = this.f47235a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f47235a;
    }

    @Override
    public void E0(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public p9 E2() {
        switch (this.f47235a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void F0() {
        int i10 = this.f47235a;
    }

    @Override
    public void G(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void G0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f47235a;
    }

    @Override
    public void H0(u1 u1Var, float f7, float f10) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean H1() {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f47235a;
    }

    @Override
    public void J0(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void J1(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
        int i10 = this.f47235a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void L0(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f47235a;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f47235a;
    }

    @Override
    public void N0(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1() {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q() {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean R(u1 u1Var) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public boolean S() {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void S1(MessageObject messageObject) {
        int i10 = this.f47235a;
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47235a;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f47235a) {
            case 16:
            default:
                f.s(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void U(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        switch (this.f47235a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void V0(int i10, u1 u1Var) {
        int i11 = this.f47235a;
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f47235a;
    }

    @Override
    public int W() {
        switch (this.f47235a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f47235a;
    }

    @Override
    public void X1() {
        int i10 = this.f47235a;
    }

    @Override
    public hh.a Y() {
        switch (this.f47235a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f47235a;
    }

    @Override
    public void a() {
        synchronized (z2.b.f53572a) {
            Object obj = z2.b.f53573b;
            synchronized (obj) {
                if (z2.b.f53574c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f53574c = true;
                }
            }
        }
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f47235a;
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public r2.m b(com.google.firebase.messaging.n r6) {
        throw new UnsupportedOperationException("Method not decompiled: rb.a.b(com.google.firebase.messaging.n):r2.m");
    }

    @Override
    public boolean b0(u1 u1Var) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long c() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int d() {
        return 872415231;
    }

    @Override
    public void d1(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean e() {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public pv0 e2() {
        switch (this.f47235a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean f() {
        switch (this.f47235a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f1(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f47235a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(int i10) {
        int i11 = this.f47235a;
    }

    @Override
    public boolean g2(long j3) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public boolean h0() {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f47235a;
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f47235a;
    }

    @Override
    public void j0(u1 u1Var, float f7, float f10) {
        int i10 = this.f47235a;
    }

    @Override
    public void k() {
        int i10 = this.f47235a;
    }

    @Override
    public void k2(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public long l() {
        throw new NoSuchElementException();
    }

    @Override
    public int l0(u1 u1Var) {
        switch (this.f47235a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public int m() {
        return 352321535;
    }

    @Override
    public void m0(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void m2(u1 u1Var, long j3) {
        int i10 = this.f47235a;
    }

    public int m3(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f47235a;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        int i10 = this.f47235a;
        return c1.a(messageObject);
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p() {
        int i10 = this.f47235a;
    }

    @Override
    public boolean p0() {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int q() {
        return 0;
    }

    @Override
    public void q1() {
        int i10 = this.f47235a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void r0(String str) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f47235a;
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47235a;
    }

    @Override
    public void s2(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public boolean t0(b6 b6Var) {
        switch (this.f47235a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f47235a;
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10) {
        int i10 = this.f47235a;
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f47235a;
    }

    @Override
    public Object v2() {
        switch (this.f47235a) {
            case 8:
                return new ArrayList();
            default:
                return new m(true);
        }
    }

    @Override
    public String w(long j3) {
        switch (this.f47235a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w2() {
        int i10 = this.f47235a;
    }

    @Override
    public int x() {
        return 1711276032;
    }

    @Override
    public void x0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public Object y0(u5 u5Var) {
        switch (this.f47235a) {
            case 14:
                return new c(u5Var.y(pb.b.class));
            default:
                return new pb.b(u5Var.c(ob.a.class));
        }
    }

    @Override
    public void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f47235a;
    }

    public a() {
        this.f47235a = 10;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    private final void B2() {
    }

    private final void B3() {
    }

    private final void C3() {
    }

    private final void H() {
    }

    private final void J() {
    }

    private final void Z() {
    }

    private final void a0() {
    }

    private final void o3() {
    }

    private final void p3() {
    }

    private final void s3() {
    }

    private final void t3() {
    }

    private final void w3() {
    }

    private final void x3() {
    }

    private final void y1() {
    }

    private final void z1() {
    }

    private final void z2() {
    }

    @Override
    public void v() {
    }

    private final void B0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void I0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void K(u1 u1Var) {
    }

    private final void K0(u1 u1Var) {
    }

    private final void L2(String str) {
    }

    private final void M0(u1 u1Var) {
    }

    private final void M2(String str) {
    }

    private final void P(u1 u1Var) {
    }

    private final void P1(u1 u1Var) {
    }

    private final void Q0(u1 u1Var) {
    }

    private final void R2(u1 u1Var) {
    }

    private final void S2(u1 u1Var) {
    }

    private final void T0(u1 u1Var) {
    }

    private final void V(u1 u1Var) {
    }

    private final void V2(u1 u1Var) {
    }

    private final void W2(u1 u1Var) {
    }

    private final void X(u1 u1Var) {
    }

    private final void X2(MessageObject messageObject) {
    }

    private final void Y1(u1 u1Var) {
    }

    private final void Y2(MessageObject messageObject) {
    }

    private final void Z0(u1 u1Var) {
    }

    private final void Z2(u1 u1Var) {
    }

    private final void a1(u1 u1Var) {
    }

    private final void a3(u1 u1Var) {
    }

    private final void c0(u1 u1Var) {
    }

    private final void d0(u1 u1Var) {
    }

    private final void d3(u1 u1Var) {
    }

    private final void e3(u1 u1Var) {
    }

    private final void f2(u1 u1Var) {
    }

    private final void f3(u1 u1Var) {
    }

    private final void h3(u1 u1Var) {
    }

    private final void j2(u1 u1Var) {
    }

    private final void j3(u1 u1Var) {
    }

    private final void k0(u1 u1Var) {
    }

    private final void k3(u1 u1Var) {
    }

    private final void l2(u1 u1Var) {
    }

    private final void m1(u1 u1Var) {
    }

    private final void n0(u1 u1Var) {
    }

    private final void n2(u1 u1Var) {
    }

    private final void o1(u1 u1Var) {
    }

    private final void o2(u1 u1Var) {
    }

    private final void p1(u1 u1Var) {
    }

    private final void p2(u1 u1Var) {
    }

    private final void r1(u1 u1Var) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void u3(int i10) {
    }

    private final void v3(int i10) {
    }

    private final void w0(u1 u1Var) {
    }

    private final void x2(u1 u1Var) {
    }

    private final void y3(MessageObject messageObject) {
    }

    private final void z0(u1 u1Var) {
    }

    private final void z3(MessageObject messageObject) {
    }

    private final void D(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void F(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void N2(u1 u1Var, long j3) {
    }

    private final void O0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void O2(u1 u1Var, long j3) {
    }

    private final void P0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void U0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void b3(u1 u1Var, bi.f fVar) {
    }

    private final void c2(u1 u1Var, TLRPC.Document document) {
    }

    private final void c3(u1 u1Var, bi.f fVar) {
    }

    private final void d2(u1 u1Var, TLRPC.Document document) {
    }

    private final void f0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void g3(u1 u1Var, boolean z10) {
    }

    private final void h1(int i10, u1 u1Var) {
    }

    private final void i0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void i3(u1 u1Var, boolean z10) {
    }

    private final void j1(int i10, u1 u1Var) {
    }

    private final void k1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void l1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void w1(int i10, u1 u1Var) {
    }

    private final void x1(int i10, u1 u1Var) {
    }

    private final void B1(u1 u1Var, float f7, float f10) {
    }

    private final void C(u1 u1Var, float f7, float f10) {
    }

    private final void C1(u1 u1Var, float f7, float f10) {
    }

    private final void F2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void G2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void T2(u1 u1Var, float f7, float f10) {
    }

    private final void U2(u1 u1Var, float f7, float f10) {
    }

    private final void e1(u1 u1Var, int i10, int i11) {
    }

    private final void g1(u1 u1Var, int i10, int i11) {
    }

    private final void q2(u1 u1Var, float f7, float f10) {
    }

    private final void s0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void t2(u1 u1Var, float f7, float f10) {
    }

    private final void u0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void z(u1 u1Var, float f7, float f10) {
    }

    private final void D1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void E1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void H2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void I2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void J2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void K2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void t1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void u1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void F1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void G1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void I1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void L1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void P2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void Q2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void o0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void q0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void q3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
