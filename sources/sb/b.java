package sb;

import a8.me;
import android.os.Build;
import android.text.style.CharacterStyle;
import android.util.Log;
import b2.x;
import c3.b0;
import c3.t;
import com.google.android.gms.tasks.OnFailureListener;
import hi.k4;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.yl;
import org.telegram.ui.d3;
import org.telegram.ui.ev0;
public class b implements dg.a, eg.a, ff.b, hb.n, ri, o5.b, tb, j1, s0, s9.d, r0.r, OnFailureListener, ui.g, x3.g, z3.k {
    public static b f48080b;
    public final int f48081a;

    public b(int i10) {
        this.f48081a = i10;
    }

    public static Calendar R0() {
        if (f48080b == null) {
            f48080b = new b(29);
        }
        f48080b.getClass();
        return Calendar.getInstance();
    }

    @Override
    public void A(gh ghVar) {
        ghVar.run();
    }

    @Override
    public ff.a B(n4.s sVar) {
        return new bf.k(sVar);
    }

    @Override
    public int B0(x xVar) {
        return 1;
    }

    @Override
    public boolean C0(long j10) {
        return false;
    }

    @Override
    public boolean C1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public ev0 E1() {
        return null;
    }

    @Override
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(pa.d.k(s10, s11));
            }
        }
    }

    @Override
    public boolean G1(long j10) {
        return false;
    }

    @Override
    public boolean I1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean J0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean L(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean M() {
        return false;
    }

    @Override
    public boolean M0(v0 v0Var, float f7, float f10) {
        return false;
    }

    @Override
    public boolean N(s1 s1Var) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O0(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public void Q0(ub ubVar, fb fbVar, pg pgVar, yl ylVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        ylVar.accept(Float.valueOf(ubVar.getTranslationY()));
        o1.j jVar = new o1.j(ubVar, ub.IN_OUT_OFFSET_Y, 0.0f);
        jVar.f18968u.a(0.8f);
        jVar.f18968u.b(400.0f);
        jVar.a(new k4(1, ubVar, pgVar));
        jVar.b(new sb(ylVar, ubVar, 1));
        jVar.h();
        fbVar.run();
    }

    @Override
    public boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public int S() {
        return 0;
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    public boolean T0(CharSequence charSequence) {
        return false;
    }

    @Override
    public b0 U() {
        return new t(-9223372036854775807L);
    }

    @Override
    public Object U1() {
        switch (this.f48081a) {
            case 9:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public jh.a V() {
        return null;
    }

    @Override
    public boolean W(s1 s1Var) {
        return false;
    }

    @Override
    public boolean X(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean X1(int i10) {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public long b() {
        return 0L;
    }

    @Override
    public t9 b2() {
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int c0(s1 s1Var) {
        return 0;
    }

    @Override
    public boolean d() {
        switch (this.f48081a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public Object d1(me meVar) {
        switch (this.f48081a) {
            case 18:
                return new h();
            case 19:
                g gVar = (g) meVar.a(g.class);
                synchronized (u7.q.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        u7.q.b(new Object());
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
                return new qb.a(0);
            default:
                return new Object();
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public z3.m f0(x xVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public Object mo27get() {
        return new m5.q(Executors.newSingleThreadExecutor());
    }

    @Override
    public String h(s1 s1Var) {
        return null;
    }

    @Override
    public boolean h0(c6 c6Var) {
        return false;
    }

    @Override
    public boolean i1(x xVar) {
        return false;
    }

    @Override
    public void k0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(ic.a.i(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f7 = ceil;
            float f10 = f7 / f7;
            float f11 = i13;
            float f12 = f11 / f11;
            while (ceil > 0 && i13 > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f10 = ceil / f7;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f12 = i13 / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public void o(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        o1.j jVar = new o1.j(ubVar, ub.IN_OUT_OFFSET_Y, ubVar.getHeight());
        jVar.f18968u.a(0.8f);
        jVar.f18968u.b(400.0f);
        jVar.a(new hb(dbVar, 1));
        jVar.b(new sb(gbVar, ubVar, 0));
        jVar.h();
        fbVar.run();
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public boolean p1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public String u(long j10) {
        return null;
    }

    @Override
    public void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public long w(c3.p pVar) {
        return -1L;
    }

    @Override
    public CharacterStyle w1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean x0() {
        return false;
    }

    @Override
    public r2 y() {
        return null;
    }

    @Override
    public boolean y1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    public b() {
        this.f48081a = 11;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void H() {
    }

    @Override
    public void R() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n() {
    }

    @Override
    public void q() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void z1() {
    }

    @Override
    public void A0(s1 s1Var) {
    }

    @Override
    public void D(s1 s1Var) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I(s1 s1Var) {
    }

    @Override
    public void K(MessageObject messageObject) {
    }

    @Override
    public void K0(s1 s1Var) {
    }

    @Override
    public void K1(s1 s1Var) {
    }

    @Override
    public void L0(s1 s1Var) {
    }

    @Override
    public void N0(long j10) {
    }

    @Override
    public void Q(s1 s1Var) {
    }

    @Override
    public void R1(s1 s1Var) {
    }

    @Override
    public void T(Object obj) {
    }

    @Override
    public void Y(TLRPC.User user) {
    }

    @Override
    public void Z(int i10) {
    }

    @Override
    public void d0(s1 s1Var) {
    }

    @Override
    public void f(v0 v0Var) {
    }

    @Override
    public void g0(String str) {
    }

    @Override
    public void i0(long j10) {
    }

    @Override
    public void k(v0 v0Var) {
    }

    @Override
    public void l0(v0 v0Var) {
    }

    @Override
    public void log(String str) {
    }

    @Override
    public void m(s1 s1Var) {
    }

    @Override
    public void m1(s1 s1Var) {
    }

    @Override
    public void p(s1 s1Var) {
    }

    @Override
    public void r(s1 s1Var) {
    }

    @Override
    public void r0(s1 s1Var) {
    }

    @Override
    public void s(s1 s1Var) {
    }

    @Override
    public void s1(s1 s1Var) {
    }

    @Override
    public void t(v0 v0Var) {
    }

    @Override
    public void u1(MessageObject messageObject) {
    }

    @Override
    public void v(s1 s1Var) {
    }

    @Override
    public void w0(s1 s1Var) {
    }

    @Override
    public void x(s1 s1Var) {
    }

    @Override
    public void z(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void A1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void C(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, s1 s1Var) {
    }

    @Override
    public void F0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void H0(v0 v0Var, String str) {
    }

    @Override
    public void J(int i10, s1 s1Var) {
    }

    @Override
    public void M1(s1 s1Var, long j10) {
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void e(v0 v0Var, int i10) {
    }

    @Override
    public void error(String str, Throwable th2) {
    }

    @Override
    public void n0(s1 s1Var, bh.n nVar) {
    }

    @Override
    public void n1(s1 s1Var, boolean z10) {
    }

    @Override
    public void q1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void G(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void I0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void a2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void b0(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void f1(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void g(v0 v0Var, int i10, int i11) {
    }

    @Override
    public void j0(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void l1(s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void t0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void u0(s1 s1Var, float f7, float f10) {
    }

    @Override
    public void v0(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void y0(s1 s1Var, boolean z10, boolean z11) {
    }

    @Override
    public void B1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void m0(s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void o0(s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void H1(s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void P0(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void W1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void P(s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
