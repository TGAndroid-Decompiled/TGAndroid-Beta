package za;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnFailureListener;
import eh.f;
import f9.c;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import l9.b;
import m3.m;
import m3.t;
import m3.w;
import na.n;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.t5;
import org.telegram.ui.nu0;
import t2.e;
import x5.k;
import y8.d;
public class a implements s0, d, c, i6.d, jf.a, kf.a, b, m, e, n, k1, lg.a, k, OnFailureListener {
    public static a f50396b;
    public final int f50397a;

    public a(int i9) {
        this.f50397a = i9;
    }

    public static l9.a n(ya.b bVar) {
        return new l9.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ib.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static Calendar p3() {
        if (f50396b == null) {
            f50396b = new a(6);
        }
        f50396b.getClass();
        return Calendar.getInstance();
    }

    @Override
    public void A0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void A1(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void B0() {
        int i9 = this.f50397a;
    }

    @Override
    public int B1(int i9, int i10, int i11) {
        return (i9 / i10) * i11;
    }

    @Override
    public String C(long j10) {
        switch (this.f50397a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void C1(MessageObject messageObject) {
        int i9 = this.f50397a;
    }

    @Override
    public void D0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i9 = this.f50397a;
    }

    @Override
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f50397a) {
            case 18:
            default:
                ve.e.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void E0(t1 t1Var, float f10, float f11) {
        int i9 = this.f50397a;
    }

    @Override
    public CharacterStyle E1(t1 t1Var) {
        switch (this.f50397a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void F(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void F0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        int i11 = this.f50397a;
    }

    @Override
    public void G0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean G1(t1 t1Var, MessageObject messageObject) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i9, shortBuffer2.remaining() / i10);
        for (int i11 = 0; i11 < min; i11++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i10 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i10 == 1) {
                shortBuffer2.put(wa.a.B3(s10, s11));
            }
        }
    }

    @Override
    public Object H1(b3.b bVar) {
        switch (this.f50397a) {
            case 3:
                return new Object();
            case 23:
                return new xa.c(bVar.x(xa.b.class));
            default:
                return new xa.b(bVar.e(wa.a.class));
        }
    }

    @Override
    public w I(int i9, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void I0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void I1() {
        int i9 = this.f50397a;
    }

    @Override
    public void J(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public a8.b K(Context context, String str, i6.c cVar) {
        a8.b bVar = new a8.b();
        int k10 = cVar.k(context, str, true);
        bVar.f110b = k10;
        if (k10 != 0) {
            bVar.f111c = 1;
            return bVar;
        }
        int H = cVar.H(context, str);
        bVar.f109a = H;
        if (H != 0) {
            bVar.f111c = -1;
        }
        return bVar;
    }

    @Override
    public boolean K0(long j10) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i9 = this.f50397a;
    }

    @Override
    public void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i9 = this.f50397a;
    }

    @Override
    public void M0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i9 = this.f50397a;
    }

    @Override
    public void N(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void O0(int i9, t1 t1Var) {
        int i10 = this.f50397a;
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i9 = this.f50397a;
    }

    @Override
    public nu0 P1() {
        switch (this.f50397a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i9 = this.f50397a;
    }

    @Override
    public void R(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean R1(long j10) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(int i9, t1 t1Var) {
        int i10 = this.f50397a;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
        int i10 = this.f50397a;
    }

    @Override
    public void U(MessageObject messageObject) {
        int i9 = this.f50397a;
    }

    @Override
    public void U0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W() {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean X(t1 t1Var) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y() {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y0(int i9, t1 t1Var) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object Y1() {
        switch (this.f50397a) {
            case 16:
                return new ArrayList();
            default:
                return new na.m(true);
        }
    }

    @Override
    public void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        int i10 = this.f50397a;
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        int i9 = this.f50397a;
        return ll.a(messageObject);
    }

    @Override
    public p0 a(Class cls) {
        return new m0(true);
    }

    @Override
    public void a0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public int b0() {
        switch (this.f50397a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void b2(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public String c() {
        return null;
    }

    @Override
    public Object d(q qVar) {
        return null;
    }

    @Override
    public pg.a d0() {
        switch (this.f50397a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void d1() {
        int i9 = this.f50397a;
    }

    @Override
    public int e() {
        return 872415231;
    }

    @Override
    public boolean e0(t1 t1Var) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.f50397a;
    }

    @Override
    public void e2(t1 t1Var, long j10) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean f() {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f0(t1 t1Var, TLRPC.User user) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int g() {
        return 352321535;
    }

    @Override
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 == i10) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public void g1(t1 t1Var, TLRPC.Document document) {
        int i9 = this.f50397a;
    }

    @Override
    public void g2(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean h() {
        switch (this.f50397a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public String i(t1 t1Var) {
        switch (this.f50397a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void i0(int i9) {
        int i10 = this.f50397a;
    }

    @Override
    public int j() {
        return 0;
    }

    @Override
    public boolean j0() {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int k() {
        return 1711276032;
    }

    @Override
    public void k0(t1 t1Var, float f10, float f11) {
        int i9 = this.f50397a;
    }

    @Override
    public void k2() {
        int i9 = this.f50397a;
    }

    @Override
    public void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        int i12 = this.f50397a;
    }

    @Override
    public int l0(t1 t1Var) {
        switch (this.f50397a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void l1(t1 t1Var, float f10, float f11) {
        int i9 = this.f50397a;
    }

    @Override
    public void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i9 = this.f50397a;
    }

    @Override
    public void m() {
        int i9 = this.f50397a;
    }

    @Override
    public void m0(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean n2(int i9) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 o(Class cls, v1.b bVar) {
        return a(cls);
    }

    @Override
    public boolean o0() {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o2() {
        int i9 = this.f50397a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public void p2(t1 t1Var, int i9, int i10) {
        int i11 = this.f50397a;
    }

    @Override
    public void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10 = this.f50397a;
    }

    @Override
    public void q0(String str) {
        int i9 = this.f50397a;
    }

    @Override
    public o9 q2() {
        switch (this.f50397a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    public Signature[] q3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void r(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean r0(t5 t5Var) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean r1() {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i9 = this.f50397a;
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
        int i9 = this.f50397a;
    }

    @Override
    public void s1(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public l9.a t(ya.b bVar, JSONObject jSONObject) {
        return n(bVar);
    }

    @Override
    public void t1(t1 t1Var, boolean z10) {
        int i9 = this.f50397a;
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i9 = this.f50397a;
    }

    @Override
    public void v(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public void w() {
        int i9 = this.f50397a;
    }

    @Override
    public void w0(t1 t1Var, float f10, float f11, boolean z10) {
        int i9 = this.f50397a;
    }

    @Override
    public void w1(t1 t1Var, f fVar) {
        int i9 = this.f50397a;
    }

    @Override
    public void x(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean x1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void y(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.f50397a;
    }

    @Override
    public void z(t1 t1Var) {
        int i9 = this.f50397a;
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        switch (this.f50397a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean z1() {
        switch (this.f50397a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    private final void A3() {
    }

    private final void D3() {
    }

    private final void E() {
    }

    private final void E3() {
    }

    private final void G() {
    }

    private final void H2() {
    }

    private final void I2() {
    }

    private final void T() {
    }

    private final void Z1() {
    }

    private final void a2() {
    }

    private final void c0() {
    }

    private final void r3() {
    }

    private final void s3() {
    }

    private final void v3() {
    }

    private final void w3() {
    }

    private final void z3() {
    }

    @Override
    public void b() {
    }

    private final void A2(t1 t1Var) {
    }

    private final void B2(t1 t1Var) {
    }

    private final void B3(MessageObject messageObject) {
    }

    private final void C2(t1 t1Var) {
    }

    private final void C3(MessageObject messageObject) {
    }

    private final void F2(t1 t1Var) {
    }

    private final void G2(t1 t1Var) {
    }

    private final void H(t1 t1Var) {
    }

    private final void J1(t1 t1Var) {
    }

    private final void K1(t1 t1Var) {
    }

    private final void L(t1 t1Var) {
    }

    private final void N0(t1 t1Var) {
    }

    private final void N1(t1 t1Var) {
    }

    private final void O(t1 t1Var) {
    }

    private final void P0(t1 t1Var) {
    }

    private final void P2(String str) {
    }

    private final void Q(t1 t1Var) {
    }

    private final void Q1(t1 t1Var) {
    }

    private final void Q2(String str) {
    }

    private final void T0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void V0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void V2(t1 t1Var) {
    }

    private final void W2(t1 t1Var) {
    }

    private final void X0(t1 t1Var) {
    }

    private final void Z2(t1 t1Var) {
    }

    private final void a1(t1 t1Var) {
    }

    private final void a3(t1 t1Var) {
    }

    private final void b3(MessageObject messageObject) {
    }

    private final void c3(MessageObject messageObject) {
    }

    private final void d3(t1 t1Var) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void h0(t1 t1Var) {
    }

    private final void h1(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k1(t1 t1Var) {
    }

    private final void l3(t1 t1Var) {
    }

    private final void m1(t1 t1Var) {
    }

    private final void n0(t1 t1Var) {
    }

    private final void n3(t1 t1Var) {
    }

    private final void o3(t1 t1Var) {
    }

    private final void t2(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void v0(t1 t1Var) {
    }

    private final void x0(t1 t1Var) {
    }

    private final void x2(t1 t1Var) {
    }

    private final void x3(int i9) {
    }

    private final void y2(t1 t1Var) {
    }

    private final void y3(int i9) {
    }

    private final void z2(t1 t1Var) {
    }

    private final void A(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void D(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void R2(t1 t1Var, long j10) {
    }

    private final void S2(t1 t1Var, long j10) {
    }

    private final void V1(int i9, t1 t1Var) {
    }

    private final void X1(int i9, t1 t1Var) {
    }

    private final void b1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void c1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void f3(t1 t1Var, f fVar) {
    }

    private final void g3(t1 t1Var, f fVar) {
    }

    private final void i1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void j1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void k3(t1 t1Var, boolean z10) {
    }

    private final void m3(t1 t1Var, boolean z10) {
    }

    private final void p0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void p1(int i9, t1 t1Var) {
    }

    private final void q1(int i9, t1 t1Var) {
    }

    private final void t0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void u1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void v1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void v2(t1 t1Var, TLRPC.Document document) {
    }

    private final void w2(t1 t1Var, TLRPC.Document document) {
    }

    private final void D2(t1 t1Var, float f10, float f11) {
    }

    private final void E2(t1 t1Var, float f10, float f11) {
    }

    private final void J0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void J2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void K2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void L0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void X2(t1 t1Var, float f10, float f11) {
    }

    private final void Y2(t1 t1Var, float f10, float f11) {
    }

    private final void c2(t1 t1Var, float f10, float f11) {
    }

    private final void d2(t1 t1Var, float f10, float f11) {
    }

    private final void n1(t1 t1Var, int i9, int i10) {
    }

    private final void o1(t1 t1Var, int i9, int i10) {
    }

    private final void p(t1 t1Var, float f10, float f11) {
    }

    private final void u(t1 t1Var, float f10, float f11) {
    }

    private final void L2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void M2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void N2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void O2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void T1(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final void U1(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final void h2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final void i2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final void T2(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final void U2(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final void j2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void m2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void r2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final void s2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final void C0(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final void y0(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    private final void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
