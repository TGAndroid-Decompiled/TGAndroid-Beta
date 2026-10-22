package rb;

import ah.t;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
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
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.vu0;
import r2.u;
public final class b implements cg.a, dg.a, fa.a, gb.n, n6.k, r9.d, l1, u, u5.a, v9.a, Continuation, y6.d {
    public static volatile b f45188b;
    public final int f45189a;

    public b(int i10) {
        this.f45189a = i10;
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void A0(u1 u1Var, float f7, float f10) {
        int i10 = this.f45189a;
    }

    @Override
    public void A1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f45189a;
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public boolean B1() {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void C(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(i2.e.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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
    public void C0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void D(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f45189a;
    }

    @Override
    public void D1(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void E0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public int E1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void F(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void F1(MessageObject messageObject) {
        int i10 = this.f45189a;
    }

    @Override
    public void G(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f45189a;
    }

    @Override
    public void G0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void G1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f45189a) {
            case 17:
            default:
                pf.d.r(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public CharacterStyle H1(u1 u1Var) {
        switch (this.f45189a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void I(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f45189a;
    }

    @Override
    public boolean J0(long j10) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J1(u1 u1Var, MessageObject messageObject) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, u1 u1Var) {
        int i11 = this.f45189a;
    }

    @Override
    public void K0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void K1(u1 u1Var, t tVar) {
        int i10 = this.f45189a;
    }

    @Override
    public void L1() {
        int i10 = this.f45189a;
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f45189a;
    }

    @Override
    public void M0(int i10, u1 u1Var) {
        int i11 = this.f45189a;
    }

    @Override
    public void M1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f45189a;
    }

    @Override
    public boolean N(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f45189a;
    }

    @Override
    public void O0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f45189a;
    }

    @Override
    public boolean O1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P() {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public vu0 P1() {
        switch (this.f45189a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Q(u1 u1Var) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q1(long j10) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R() {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f45189a;
    }

    @Override
    public void R1(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f45189a;
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f45189a;
    }

    @Override
    public boolean S0(u1 u1Var, boolean z10) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S1(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void T(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void T0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void U1(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public int V() {
        switch (this.f45189a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public ih.a W() {
        switch (this.f45189a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void W1(u1 u1Var, long j10) {
        int i10 = this.f45189a;
    }

    @Override
    public boolean Z(u1 u1Var) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Z0(int i10, u1 u1Var) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean b2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c() {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c2(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public long d() {
        return System.currentTimeMillis();
    }

    @Override
    public void d0(int i10) {
        int i11 = this.f45189a;
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        int i10 = this.f45189a;
        return c1.a(messageObject);
    }

    @Override
    public boolean e() {
        switch (this.f45189a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean e0() {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void f0(u1 u1Var, float f7, float f10) {
        int i10 = this.f45189a;
    }

    @Override
    public void f1() {
        int i10 = this.f45189a;
    }

    @Override
    public Object f2() {
        switch (this.f45189a) {
            case 9:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f45189a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g2() {
        int i10 = this.f45189a;
    }

    @Override
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public int h0(u1 u1Var) {
        switch (this.f45189a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void h1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f45189a;
    }

    @Override
    public void i(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f45189a;
    }

    @Override
    public void i0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void i2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f45189a;
    }

    @Override
    public void j() {
        int i10 = this.f45189a;
    }

    @Override
    public Object j2(z5 z5Var) {
        switch (this.f45189a) {
            case 15:
                return new qb.c(z5Var.y(qb.b.class));
            default:
                return new qb.b(z5Var.b(pb.a.class));
        }
    }

    @Override
    public int k() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void k1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f45189a;
    }

    @Override
    public void l(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f45189a;
    }

    @Override
    public boolean l0() {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean l2(int i10) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void n() {
        int i10 = this.f45189a;
    }

    @Override
    public void n0(String str) {
        int i10 = this.f45189a;
    }

    @Override
    public void n2() {
        int i10 = this.f45189a;
    }

    @Override
    public void o(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean o0(a6 a6Var) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o2(u1 u1Var, int i10, int i11) {
        int i12 = this.f45189a;
    }

    @Override
    public void p(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void p1(u1 u1Var, float f7, float f10) {
        int i10 = this.f45189a;
    }

    @Override
    public o9 p2() {
        switch (this.f45189a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void q() {
        int i10 = this.f45189a;
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
        int i10 = this.f45189a;
    }

    @Override
    public a3.l r(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int o10 = cVar.o(context, str, true);
        lVar.f140b = o10;
        if (o10 != 0) {
            lVar.f141c = 1;
            return lVar;
        }
        int z10 = cVar.z(context, str);
        lVar.f139a = z10;
        if (z10 != 0) {
            lVar.f141c = -1;
        }
        return lVar;
    }

    @Override
    public void s(u1 u1Var) {
        int i10 = this.f45189a;
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
    public void t(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f45189a;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f45189a;
    }

    @Override
    public boolean v1() {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String w(long j10) {
        switch (this.f45189a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f45189a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w1(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void x0(u1 u1Var) {
        int i10 = this.f45189a;
    }

    @Override
    public void x1(u1 u1Var, boolean z10) {
        int i10 = this.f45189a;
    }

    @Override
    public void y0() {
        int i10 = this.f45189a;
    }

    @Override
    public void z0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f45189a;
    }

    @Override
    public boolean z1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f45189a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    private final void C1() {
    }

    private final void C2() {
    }

    private final void D2() {
    }

    private final void E() {
    }

    private final void H() {
    }

    private final void T1() {
    }

    private final void X() {
    }

    private final void Y() {
    }

    private final void k3() {
    }

    private final void l3() {
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

    private final void A2(u1 u1Var) {
    }

    private final void B2(u1 u1Var) {
    }

    private final void D0(u1 u1Var) {
    }

    private final void F0(u1 u1Var) {
    }

    private final void H0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void I0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void J(u1 u1Var) {
    }

    private final void K2(String str) {
    }

    private final void L(u1 u1Var) {
    }

    private final void L0(u1 u1Var) {
    }

    private final void L2(String str) {
    }

    private final void N0(u1 u1Var) {
    }

    private final void O(u1 u1Var) {
    }

    private final void Q2(u1 u1Var) {
    }

    private final void R2(u1 u1Var) {
    }

    private final void U(u1 u1Var) {
    }

    private final void U2(u1 u1Var) {
    }

    private final void V2(u1 u1Var) {
    }

    private final void W0(u1 u1Var) {
    }

    private final void W2(MessageObject messageObject) {
    }

    private final void X0(u1 u1Var) {
    }

    private final void X2(MessageObject messageObject) {
    }

    private final void Y2(u1 u1Var) {
    }

    private final void Z2(u1 u1Var) {
    }

    private final void a0(u1 u1Var) {
    }

    private final void b0(u1 u1Var) {
    }

    private final void b1(u1 u1Var) {
    }

    private final void c1(u1 u1Var) {
    }

    private final void c3(u1 u1Var) {
    }

    private final void d3(u1 u1Var) {
    }

    private final void e3(u1 u1Var) {
    }

    private final void g3(u1 u1Var) {
    }

    private final void i3(u1 u1Var) {
    }

    private final void j3(u1 u1Var) {
    }

    private final void k0(u1 u1Var) {
    }

    private final void k2(u1 u1Var) {
    }

    private final void m0(u1 u1Var) {
    }

    private final void m2(u1 u1Var) {
    }

    private final void n1(u1 u1Var) {
    }

    private final void o1(u1 u1Var) {
    }

    private final void q1(u1 u1Var) {
    }

    private final void q3(int i10) {
    }

    private final void r1(u1 u1Var) {
    }

    private final void r3(int i10) {
    }

    private final void s2(u1 u1Var) {
    }

    private final void t2(u1 u1Var) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void u3(MessageObject messageObject) {
    }

    private final void v2(u1 u1Var) {
    }

    private final void v3(MessageObject messageObject) {
    }

    private final void w2(u1 u1Var) {
    }

    private final void x2(u1 u1Var) {
    }

    private final void M2(u1 u1Var, long j10) {
    }

    private final void N2(u1 u1Var, long j10) {
    }

    private final void Q0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void U0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void Y0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void a1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void a3(u1 u1Var, t tVar) {
    }

    private final void b3(u1 u1Var, t tVar) {
    }

    private final void f3(u1 u1Var, boolean z10) {
    }

    private final void g0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void h3(u1 u1Var, boolean z10) {
    }

    private final void i1(int i10, u1 u1Var) {
    }

    private final void j0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void j1(int i10, u1 u1Var) {
    }

    private final void l1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void m1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void q2(u1 u1Var, TLRPC.Document document) {
    }

    private final void r2(u1 u1Var, TLRPC.Document document) {
    }

    private final void u1(int i10, u1 u1Var) {
    }

    private final void y(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void y1(int i10, u1 u1Var) {
    }

    private final void z(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void B0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void E2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void F2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void S2(u1 u1Var, float f7, float f10) {
    }

    private final void T2(u1 u1Var, float f7, float f10) {
    }

    private final void V1(u1 u1Var, float f7, float f10) {
    }

    private final void X1(u1 u1Var, float f7, float f10) {
    }

    private final void e1(u1 u1Var, int i10, int i11) {
    }

    private final void g1(u1 u1Var, int i10, int i11) {
    }

    private final void t0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void u(u1 u1Var, float f7, float f10) {
    }

    private final void x(u1 u1Var, float f7, float f10) {
    }

    private final void y2(u1 u1Var, float f7, float f10) {
    }

    private final void z2(u1 u1Var, float f7, float f10) {
    }

    private final void G2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void H2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void I2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void J2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Y1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void Z1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void s1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void t1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void O2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void P2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void a2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void d2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void e2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void p0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void r0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void m3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void n3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
