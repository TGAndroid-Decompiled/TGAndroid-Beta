package rb;

import ah.t;
import android.content.Context;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import org.telegram.ui.vv0;
public final class b implements cg.a, dg.a, fa.a, gb.p, n6.k, r9.d, l1, r0.r, u5.a, v9.a, Continuation, y6.d {
    public static volatile b f43847b;
    public final int f43848a;

    public b(int i10) {
        this.f43848a = i10;
    }

    @Override
    public void A(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(i2.d.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
            float f7 = remaining;
            float f10 = f7 / f7;
            float f11 = ceil;
            float f12 = f11 / f11;
            while (remaining > 0 && ceil > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f10 = remaining / f7;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    }
                    ceil--;
                    f12 = ceil / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f43848a;
    }

    @Override
    public boolean A1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
        int i10 = this.f43848a;
    }

    @Override
    public void B1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f43848a;
    }

    @Override
    public void C(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public boolean C1() {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void D0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f43848a;
    }

    @Override
    public void E1(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void F0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public int F1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void G(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void H0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void H1(MessageObject messageObject) {
        int i10 = this.f43848a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f43848a;
    }

    @Override
    public void J1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f43848a) {
            case 17:
            default:
                pf.d.r(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean K0(long j10) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public CharacterStyle K1(u1 u1Var) {
        switch (this.f43848a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void L0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f43848a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f43848a;
    }

    @Override
    public boolean M1(u1 u1Var, MessageObject messageObject) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f43848a;
    }

    @Override
    public void N0(int i10, u1 u1Var) {
        int i11 = this.f43848a;
    }

    @Override
    public void N1(u1 u1Var, t tVar) {
        int i10 = this.f43848a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1() {
        int i10 = this.f43848a;
    }

    @Override
    public boolean P() {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f43848a;
    }

    @Override
    public void P1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f43848a;
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public void Q1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f43848a;
    }

    @Override
    public boolean R() {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f43848a;
    }

    @Override
    public void S0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f43848a;
    }

    @Override
    public vv0 S1() {
        switch (this.f43848a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public boolean T0(u1 u1Var, boolean z10) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean T1(long j10) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void U1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f43848a;
    }

    @Override
    public int V() {
        switch (this.f43848a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void X1(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public ih.a Y() {
        switch (this.f43848a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(u1 u1Var) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z1(u1 u1Var, long j10) {
        int i10 = this.f43848a;
    }

    @Override
    public Object a(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean a1(int i10, u1 u1Var) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long b() {
        return System.currentTimeMillis();
    }

    @Override
    public boolean c() {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f43848a;
    }

    @Override
    public boolean e() {
        switch (this.f43848a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e1(MessageObject messageObject) {
        int i10 = this.f43848a;
        return c1.a(messageObject);
    }

    @Override
    public boolean e2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.f43848a;
    }

    @Override
    public void f2(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f43848a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g1() {
        int i10 = this.f43848a;
    }

    @Override
    public int h0(u1 u1Var) {
        switch (this.f43848a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f43848a;
    }

    @Override
    public void i0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void i1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f43848a;
    }

    @Override
    public Object i2() {
        switch (this.f43848a) {
            case 9:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public void j() {
        int i10 = this.f43848a;
    }

    @Override
    public void j2() {
        int i10 = this.f43848a;
    }

    @Override
    public boolean l0() {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f43848a;
    }

    @Override
    public void l2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f43848a;
    }

    @Override
    public void m(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f43848a;
    }

    @Override
    public void n(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f43848a;
    }

    @Override
    public Object n2(z5 z5Var) {
        switch (this.f43848a) {
            case 15:
                return new qb.c(z5Var.w(qb.b.class));
            default:
                return new qb.b(z5Var.b(pb.a.class));
        }
    }

    @Override
    public void o() {
        int i10 = this.f43848a;
    }

    @Override
    public boolean o0(b6 b6Var) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean p2(int i10) {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public a3.l q(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int q6 = cVar.q(context, str, true);
        lVar.f140b = q6;
        if (q6 != 0) {
            lVar.f141c = 1;
            return lVar;
        }
        int H = cVar.H(context, str);
        lVar.f139a = H;
        if (H != 0) {
            lVar.f141c = -1;
        }
        return lVar;
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.f43848a;
    }

    @Override
    public void q1(u1 u1Var, float f7, float f10) {
        int i10 = this.f43848a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void r2() {
        int i10 = this.f43848a;
    }

    @Override
    public void s() {
        int i10 = this.f43848a;
    }

    @Override
    public StackTraceElement[] s0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public void s2(u1 u1Var, int i10, int i11) {
        int i12 = this.f43848a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public p9 t2() {
        switch (this.f43848a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f43848a;
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f43848a;
    }

    @Override
    public boolean w1() {
        switch (this.f43848a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String x(long j10) {
        switch (this.f43848a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        switch (this.f43848a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x1(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void y0(u1 u1Var) {
        int i10 = this.f43848a;
    }

    @Override
    public void y1(u1 u1Var, boolean z10) {
        int i10 = this.f43848a;
    }

    @Override
    public void z0() {
        int i10 = this.f43848a;
    }

    private final void F() {
    }

    private final void H() {
    }

    private final void f3() {
    }

    private final void g3() {
    }

    private final void j3() {
    }

    private final void k3() {
    }

    private final void n3() {
    }

    private final void o3() {
    }

    private final void p() {
    }

    private final void r1() {
    }

    private final void r3() {
    }

    private final void s1() {
    }

    private final void s3() {
    }

    private final void v() {
    }

    private final void x2() {
    }

    private final void y2() {
    }

    private final void C0(u1 u1Var) {
    }

    private final void D(u1 u1Var) {
    }

    private final void F2(String str) {
    }

    private final void G2(String str) {
    }

    private final void I0(u1 u1Var) {
    }

    private final void J(u1 u1Var) {
    }

    private final void J0(u1 u1Var) {
    }

    private final void K(u1 u1Var) {
    }

    private final void L2(u1 u1Var) {
    }

    private final void M2(u1 u1Var) {
    }

    private final void P2(u1 u1Var) {
    }

    private final void Q2(u1 u1Var) {
    }

    private final void R0(u1 u1Var) {
    }

    private final void R2(MessageObject messageObject) {
    }

    private final void S2(MessageObject messageObject) {
    }

    private final void T2(u1 u1Var) {
    }

    private final void U2(u1 u1Var) {
    }

    private final void V0(u1 u1Var) {
    }

    private final void X(u1 u1Var) {
    }

    private final void X2(u1 u1Var) {
    }

    private final void Y1(u1 u1Var) {
    }

    private final void Y2(u1 u1Var) {
    }

    private final void Z2(u1 u1Var) {
    }

    private final void a0(u1 u1Var) {
    }

    private final void a2(u1 u1Var) {
    }

    private final void b3(u1 u1Var) {
    }

    private final void d2(u1 u1Var) {
    }

    private final void d3(u1 u1Var) {
    }

    private final void e3(u1 u1Var) {
    }

    private final void f1(u1 u1Var) {
    }

    private final void g2(u1 u1Var) {
    }

    private final void h1(u1 u1Var) {
    }

    private final void h2(u1 u1Var) {
    }

    private final void j1(u1 u1Var) {
    }

    private final void k1(u1 u1Var) {
    }

    private final void k2(u1 u1Var) {
    }

    private final void l3(int i10) {
    }

    private final void m0(u1 u1Var) {
    }

    private final void m2(u1 u1Var) {
    }

    private final void m3(int i10) {
    }

    private final void o2(u1 u1Var) {
    }

    private final void p0(u1 u1Var) {
    }

    private final void p3(MessageObject messageObject) {
    }

    private final void q3(MessageObject messageObject) {
    }

    private final void r0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void t0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void v2(u1 u1Var) {
    }

    private final void w(u1 u1Var) {
    }

    private final void w0(u1 u1Var) {
    }

    private final void w2(u1 u1Var) {
    }

    private final void y(u1 u1Var) {
    }

    private final void z(u1 u1Var) {
    }

    private final void E0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void G0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void H2(u1 u1Var, long j10) {
    }

    private final void I2(u1 u1Var, long j10) {
    }

    private final void M0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void U(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V2(u1 u1Var, t tVar) {
    }

    private final void W(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void W2(u1 u1Var, t tVar) {
    }

    private final void Z0(int i10, u1 u1Var) {
    }

    private final void a3(u1 u1Var, boolean z10) {
    }

    private final void b1(int i10, u1 u1Var) {
    }

    private final void b2(u1 u1Var, TLRPC.Document document) {
    }

    private final void c1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void c2(u1 u1Var, TLRPC.Document document) {
    }

    private final void c3(u1 u1Var, boolean z10) {
    }

    private final void d1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void k(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void l(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o1(int i10, u1 u1Var) {
    }

    private final void p1(int i10, u1 u1Var) {
    }

    private final void A2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void N2(u1 u1Var, float f7, float f10) {
    }

    private final void O2(u1 u1Var, float f7, float f10) {
    }

    private final void X0(u1 u1Var, int i10, int i11) {
    }

    private final void Y0(u1 u1Var, int i10, int i11) {
    }

    private final void f(u1 u1Var, float f7, float f10) {
    }

    private final void h(u1 u1Var, float f7, float f10) {
    }

    private final void j0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void k0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void q2(u1 u1Var, float f7, float f10) {
    }

    private final void t1(u1 u1Var, float f7, float f10) {
    }

    private final void u1(u1 u1Var, float f7, float f10) {
    }

    private final void u2(u1 u1Var, float f7, float f10) {
    }

    private final void z2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void B2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void C2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void D2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void E2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void m1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void n1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void v1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void z1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final void D1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void G1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void I1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void J2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void K2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void W1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void b0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void g0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void h3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void i3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
