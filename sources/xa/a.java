package xa;

import af.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import fh.f;
import h3.t0;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import l3.i;
import l3.j;
import l3.l;
import m3.m;
import m3.t;
import m3.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.t5;
import org.telegram.ui.ou0;
import org.telegram.ui.z51;
import r0.s;
import t2.e;
import w1.b;
import y5.k;
import z8.d;

public final class a implements d9.a, Continuation, ff.a, z51, kf.a, j, lf.a, m, e, oa.m, j1, s, s0, d, k {

    public static a f49381b;

    public static a f49382c;
    public static volatile a d;

    public final int f49383a;

    public a(int i10) {
        this.f49383a = i10;
    }

    public static short q3(short s10, short s11) {
        int i10 = s10 + Short.MIN_VALUE;
        int i11 = s11 + Short.MIN_VALUE;
        int i12 = (i10 < 32768 || i11 < 32768) ? (i10 * i11) / 32768 : (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        return (short) ((i12 != 65536 ? i12 : 65535) - 32768);
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f49383a) {
        }
        return true;
    }

    @Override
    public void B0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void B1(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public w C(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void C0() {
        int i10 = this.f49383a;
    }

    @Override
    public int C1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void D(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int iMin = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < iMin; i12++) {
            shortBuffer2.put(q3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void D1(MessageObject messageObject) {
        int i10 = this.f49383a;
    }

    @Override
    public void E0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f49383a;
    }

    @Override
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f49383a) {
        }
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public void F0(s1 s1Var, float f10, float f11) {
        int i10 = this.f49383a;
    }

    @Override
    public CharacterStyle F1(s1 s1Var) {
        switch (this.f49383a) {
        }
        return null;
    }

    @Override
    public void G0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f49383a;
    }

    @Override
    public void H(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void H0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean H1(s1 s1Var, MessageObject messageObject) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void I1() {
        int i10 = this.f49383a;
    }

    @Override
    public void J0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f49383a;
    }

    @Override
    public void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean L0(long j10) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f49383a;
    }

    @Override
    public void M(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void M0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f49383a;
    }

    @Override
    public void O0(int i10, s1 s1Var) {
        int i11 = this.f49383a;
    }

    @Override
    public ou0 O1() {
        switch (this.f49383a) {
        }
        return null;
    }

    @Override
    public void Q(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean Q1(long j10) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void R(int i10, s1 s1Var) {
        int i11 = this.f49383a;
    }

    @Override
    public void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f49383a;
    }

    @Override
    public void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
        int i11 = this.f49383a;
    }

    @Override
    public boolean S0(s1 s1Var, boolean z10) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void T(MessageObject messageObject) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void U0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean V() {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public boolean W(s1 s1Var) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void W0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean X() {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        int i11 = this.f49383a;
    }

    @Override
    public boolean Y0(int i10, s1 s1Var) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void Z(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void Z1(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        int i10 = this.f49383a;
        return rl.a(messageObject);
    }

    @Override
    public void a2(s1 s1Var, f fVar) {
        int i10 = this.f49383a;
    }

    @Override
    public Object apply(Object obj) {
        return ((w3) obj).a();
    }

    @Override
    public boolean b(Context context) {
        return false;
    }

    @Override
    public int b0() {
        switch (this.f49383a) {
        }
        return 0;
    }

    @Override
    public void b2(s1 s1Var, long j10) {
        int i10 = this.f49383a;
    }

    @Override
    public Object c(q qVar) {
        return null;
    }

    @Override
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 != i11) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public boolean d() {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public qg.a d0() {
        switch (this.f49383a) {
        }
        return null;
    }

    @Override
    public void d1() {
        int i10 = this.f49383a;
    }

    @Override
    public void d2(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public p0 e(Class cls) {
        return new b();
    }

    @Override
    public boolean e0(s1 s1Var) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean f() {
        switch (this.f49383a) {
        }
        return true;
    }

    @Override
    public boolean f0(s1 s1Var, TLRPC.User user) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public Object f2() {
        switch (this.f49383a) {
            case 16:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public i g(b6.a aVar, t0 t0Var) {
        return i.f15395a;
    }

    @Override
    public String h(s1 s1Var) {
        switch (this.f49383a) {
        }
        return null;
    }

    @Override
    public void h1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f49383a;
    }

    @Override
    public void h2() {
        int i10 = this.f49383a;
    }

    @Override
    public boolean i(Context context) {
        return false;
    }

    @Override
    public void i0(int i10) {
        int i11 = this.f49383a;
    }

    @Override
    public void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i10 = this.f49383a;
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f49383a;
    }

    @Override
    public boolean j0() {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void k() {
        int i10 = this.f49383a;
    }

    @Override
    public void k0(s1 s1Var, float f10, float f11) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean k2(int i10) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public l3.f l(b6.a aVar, t0 t0Var) {
        if (t0Var.E == null) {
            return null;
        }
        return new k5.i(new l3.e(new l(), 6001), 22);
    }

    @Override
    public int l0(s1 s1Var) {
        switch (this.f49383a) {
        }
        return 0;
    }

    @Override
    public int m(t0 t0Var) {
        return t0Var.E != null ? 1 : 0;
    }

    @Override
    public void m0(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void m1(s1 s1Var, float f10, float f11) {
        int i10 = this.f49383a;
    }

    @Override
    public void m2() {
        int i10 = this.f49383a;
    }

    @Override
    public void n(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void n2(s1 s1Var, int i10, int i11) {
        int i12 = this.f49383a;
    }

    @Override
    public void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f49383a;
    }

    @Override
    public k9 o2() {
        switch (this.f49383a) {
        }
        return null;
    }

    @Override
    public void p(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean p0() {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void q() {
        int i10 = this.f49383a;
    }

    @Override
    public p0 r(Class cls, v1.b bVar) {
        return e(cls);
    }

    @Override
    public void r0(String str) {
        int i10 = this.f49383a;
    }

    @Override
    public void s(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean s0(t5 t5Var) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public boolean s1() {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void t(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void t0(s1 s1Var, float f10, float f11) {
        int i10 = this.f49383a;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u() {
        int i10 = this.f49383a;
    }

    @Override
    public Object u0(h hVar) {
        return new za.d(hVar.e(za.h.class));
    }

    @Override
    public void u1(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void v(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f49383a;
    }

    @Override
    public void v1(s1 s1Var, boolean z10) {
        int i10 = this.f49383a;
    }

    @Override
    public void x(s1 s1Var) {
        int i10 = this.f49383a;
    }

    @Override
    public void x0(s1 s1Var, float f10, float f11, boolean z10) {
        int i10 = this.f49383a;
    }

    @Override
    public boolean x1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f49383a) {
        }
        return false;
    }

    @Override
    public void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f49383a;
    }

    @Override
    public String z(long j10) {
        switch (this.f49383a) {
        }
        return null;
    }

    @Override
    public boolean z1() {
        switch (this.f49383a) {
        }
        return false;
    }

    private final void B3() {
    }

    private final void C3() {
    }

    private final void G() {
    }

    private final void G2() {
    }

    private final void H2() {
    }

    private final void I() {
    }

    private final void S() {
    }

    private final void W1() {
    }

    private final void X1() {
    }

    private final void a0() {
    }

    private final void o3() {
    }

    private final void p3() {
    }

    private final void t3() {
    }

    private final void u3() {
    }

    private final void x3() {
    }

    private final void y3() {
    }

    @Override
    public void a() {
    }

    @Override
    public void release() {
    }

    private final void A1(s1 s1Var) {
    }

    private final void A2(s1 s1Var) {
    }

    private final void A3(MessageObject messageObject) {
    }

    private final void B2(s1 s1Var) {
    }

    private final void E2(s1 s1Var) {
    }

    private final void F2(s1 s1Var) {
    }

    private final void J(s1 s1Var) {
    }

    private final void J1(s1 s1Var) {
    }

    private final void K(s1 s1Var) {
    }

    private final void N(s1 s1Var) {
    }

    private final void N0(s1 s1Var) {
    }

    private final void N1(s1 s1Var) {
    }

    private final void O2(String str) {
    }

    private final void P(s1 s1Var) {
    }

    private final void P0(s1 s1Var) {
    }

    private final void P2(String str) {
    }

    private final void T0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void U2(s1 s1Var) {
    }

    private final void V0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void V2(s1 s1Var) {
    }

    private final void X0(s1 s1Var) {
    }

    private final void Y2(s1 s1Var) {
    }

    private final void Z0(s1 s1Var) {
    }

    private final void Z2(s1 s1Var) {
    }

    private final void a3(MessageObject messageObject) {
    }

    private final void b3(MessageObject messageObject) {
    }

    private final void c3(s1 s1Var) {
    }

    private final void d3(s1 s1Var) {
    }

    private final void f1(s1 s1Var) {
    }

    private final void g0(s1 s1Var) {
    }

    private final void g1(s1 s1Var) {
    }

    private final void g3(s1 s1Var) {
    }

    private final void h0(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void i3(s1 s1Var) {
    }

    private final void k1(s1 s1Var) {
    }

    private final void k3(s1 s1Var) {
    }

    private final void l1(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void n3(s1 s1Var) {
    }

    private final void q0(s1 s1Var) {
    }

    private final void s2(s1 s1Var) {
    }

    private final void t2(s1 s1Var) {
    }

    private final void v3(int i10) {
    }

    private final void w0(s1 s1Var) {
    }

    private final void w1(s1 s1Var) {
    }

    private final void w2(s1 s1Var) {
    }

    private final void w3(int i10) {
    }

    private final void x2(s1 s1Var) {
    }

    private final void y2(s1 s1Var) {
    }

    private final void z2(s1 s1Var) {
    }

    private final void z3(MessageObject messageObject) {
    }

    private final void E(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void F(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Q2(s1 s1Var, long j10) {
    }

    private final void R2(s1 s1Var, long j10) {
    }

    private final void T1(int i10, s1 s1Var) {
    }

    private final void U1(int i10, s1 s1Var) {
    }

    private final void b1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void c1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void e3(s1 s1Var, f fVar) {
    }

    private final void f3(s1 s1Var, f fVar) {
    }

    private final void i1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void j1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void j3(s1 s1Var, boolean z10) {
    }

    private final void l3(s1 s1Var, boolean z10) {
    }

    private final void n0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void p1(int i10, s1 s1Var) {
    }

    private final void q1(int i10, s1 s1Var) {
    }

    private final void r1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void t1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void u2(s1 s1Var, TLRPC.Document document) {
    }

    private final void v2(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void w(Looper looper, i3.k kVar) {
    }

    private final void B(s1 s1Var, float f10, float f11) {
    }

    private final void C2(s1 s1Var, float f10, float f11) {
    }

    private final void D2(s1 s1Var, float f10, float f11) {
    }

    private final void I0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void I2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void J2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void K0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void W2(s1 s1Var, float f10, float f11) {
    }

    private final void X2(s1 s1Var, float f10, float f11) {
    }

    private final void Y1(s1 s1Var, float f10, float f11) {
    }

    private final void e2(s1 s1Var, float f10, float f11) {
    }

    private final void n1(s1 s1Var, int i10, int i11) {
    }

    private final void o1(s1 s1Var, int i10, int i11) {
    }

    private final void y(s1 s1Var, float f10, float f11) {
    }

    private final void K2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void L2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void N2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void P1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final void S1(s1 s1Var, float f10, float f11, boolean z10) {
    }

    private final void g2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void j2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void T2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void l2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void p2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void q2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final void r2(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    private final void y0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final void z0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    private final void r3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void s3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
