package wa;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.d;
import eh.f;
import h3.t0;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import l3.h;
import l3.i;
import m3.c;
import na.n;
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
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.nu0;
import ve.e;
import y2.b;
import y3.u;
import ya.g;
public class a implements l, d, SuccessContinuation, f3.a, jf.a, kf.a, i, c, m9.a, n, k1, ii, y8.d, b, u {
    public static a f48782b;
    public static volatile a f48783c;
    public final int f48784a;

    public a(int i9) {
        this.f48784a = i9;
    }

    public static short B3(short s10, short s11) {
        int i9;
        int i10 = s10 + 32768;
        int i11 = s11 + 32768;
        int i12 = 65535;
        if (i10 >= 32768 && i11 >= 32768) {
            i9 = (((i10 + i11) * 2) - ((i10 * i11) / 32768)) - 65535;
        } else {
            i9 = (i10 * i11) / 32768;
        }
        if (i9 != 65536) {
            i12 = i9;
        }
        return (short) (i12 - 32768);
    }

    public static String K3(ic.c cVar) {
        String str = cVar.f11091a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    @Override
    public void A0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void A1(t1 t1Var) {
        int i9 = this.f48784a;
    }

    public boolean A3(CharSequence charSequence) {
        return false;
    }

    @Override
    public int B() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void B0() {
        int i9 = this.f48784a;
    }

    @Override
    public int B1(int i9, int i10, int i11) {
        return i9 / 2;
    }

    @Override
    public String C(long j10) {
        switch (this.f48784a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void C1(MessageObject messageObject) {
        int i9 = this.f48784a;
    }

    @Override
    public h D(a6.a aVar, t0 t0Var) {
        return h.f16638a;
    }

    @Override
    public void D0(t1 t1Var, TLObject tLObject, boolean z10) {
        int i9 = this.f48784a;
    }

    @Override
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f48784a) {
            case 18:
            default:
                e.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void E0(t1 t1Var, float f10, float f11) {
        int i9 = this.f48784a;
    }

    @Override
    public CharacterStyle E1(t1 t1Var) {
        switch (this.f48784a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void F(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void F0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        int i11 = this.f48784a;
    }

    @Override
    public int G(t0 t0Var) {
        if (t0Var.E != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public void G0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean G1(t1 t1Var, MessageObject messageObject) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i11 = 0; i11 < min; i11++) {
            shortBuffer2.put(B3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public Object H1(b3.b bVar) {
        switch (this.f48784a) {
            case 23:
                g gVar = (g) bVar.a(g.class);
                return new za.a(0);
            default:
                ya.a aVar = (ya.a) bVar.a(ya.a.class);
                return new ya.b(0);
        }
    }

    @Override
    public boolean I() {
        return false;
    }

    @Override
    public void I0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void I1() {
        int i9 = this.f48784a;
    }

    @Override
    public void J(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean K0(long j10) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i9 = this.f48784a;
    }

    @Override
    public void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i9 = this.f48784a;
    }

    @Override
    public void M0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i9 = this.f48784a;
    }

    @Override
    public void N(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void O0(int i9, t1 t1Var) {
        int i10 = this.f48784a;
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i9 = this.f48784a;
    }

    @Override
    public nu0 P1() {
        switch (this.f48784a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i9 = this.f48784a;
    }

    @Override
    public void R(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean R1(long j10) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(int i9, t1 t1Var) {
        int i10 = this.f48784a;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
        int i10 = this.f48784a;
    }

    @Override
    public void U(MessageObject messageObject) {
        int i9 = this.f48784a;
    }

    @Override
    public void U0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W() {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean X(t1 t1Var) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y() {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y0(int i9, t1 t1Var) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object Y1() {
        switch (this.f48784a) {
            case 16:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        int i10 = this.f48784a;
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        int i9 = this.f48784a;
        return ll.a(messageObject);
    }

    @Override
    public void a0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public MediaCodecInfo b(int i9) {
        return MediaCodecList.getCodecInfoAt(i9);
    }

    @Override
    public int b0() {
        switch (this.f48784a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void b2(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public m createDataSource() {
        return new com.google.android.exoplayer2.upstream.g(false);
    }

    @Override
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public pg.a d0() {
        switch (this.f48784a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void d1() {
        int i9 = this.f48784a;
    }

    @Override
    public boolean e0(t1 t1Var) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.f48784a;
    }

    @Override
    public void e2(t1 t1Var, long j10) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean f() {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f0(t1 t1Var, TLRPC.User user) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 < i10) {
            kf.a.f14796o.g0(shortBuffer, i9, shortBuffer2, i10, i11);
        } else if (i9 > i10) {
            kf.a.f14795m.g0(shortBuffer, i9, shortBuffer2, i10, i11);
        } else if (i9 == i10) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void g1(t1 t1Var, TLRPC.Document document) {
        int i9 = this.f48784a;
    }

    @Override
    public void g2(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public Object mo28get() {
        return new f6.a(Executors.newSingleThreadExecutor());
    }

    @Override
    public boolean h() {
        switch (this.f48784a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public String i(t1 t1Var) {
        switch (this.f48784a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void i0(int i9) {
        int i10 = this.f48784a;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean j0() {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        int i9;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i9 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i9 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i9 = i10;
            i12 = 1;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i9 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        if (i11 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public void k0(t1 t1Var, float f10, float f11) {
        int i9 = this.f48784a;
    }

    @Override
    public void k2() {
        int i9 = this.f48784a;
    }

    @Override
    public void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        int i12 = this.f48784a;
    }

    @Override
    public int l0(t1 t1Var) {
        switch (this.f48784a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void l1(t1 t1Var, float f10, float f11) {
        int i9 = this.f48784a;
    }

    @Override
    public void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i9 = this.f48784a;
    }

    @Override
    public void m() {
        int i9 = this.f48784a;
    }

    @Override
    public void m0(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public l3.e n(a6.a aVar, t0 t0Var) {
        if (t0Var.E == null) {
            return null;
        }
        return new fa.c(new l3.d(new Exception(), 6001), 26);
    }

    @Override
    public boolean n2(int i9) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean o0() {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o2() {
        int i9 = this.f48784a;
    }

    @Override
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void p2(t1 t1Var, int i9, int i10) {
        int i11 = this.f48784a;
    }

    @Override
    public void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10 = this.f48784a;
    }

    @Override
    public void q0(String str) {
        int i9 = this.f48784a;
    }

    @Override
    public o9 q2() {
        switch (this.f48784a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void r(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean r0(t5 t5Var) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean r1() {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i9 = this.f48784a;
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
        int i9 = this.f48784a;
    }

    @Override
    public void s1(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void t(wg wgVar) {
        wgVar.run();
    }

    @Override
    public boolean t0() {
        return false;
    }

    @Override
    public void t1(t1 t1Var, boolean z10) {
        int i9 = this.f48784a;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i9 = this.f48784a;
    }

    @Override
    public void v(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public void w() {
        int i9 = this.f48784a;
    }

    @Override
    public void w0(t1 t1Var, float f10, float f11, boolean z10) {
        int i9 = this.f48784a;
    }

    @Override
    public void w1(t1 t1Var, f fVar) {
        int i9 = this.f48784a;
    }

    @Override
    public void x(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean x1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean y(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i9 = this.f48784a;
    }

    @Override
    public void z(t1 t1Var) {
        int i9 = this.f48784a;
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        switch (this.f48784a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean z1() {
        switch (this.f48784a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    private final void C0() {
    }

    private final void E3() {
    }

    private final void F3() {
    }

    private final void I3() {
    }

    private final void J0() {
    }

    private final void J3() {
    }

    private final void N3() {
    }

    private final void O3() {
    }

    private final void Q2() {
    }

    private final void R2() {
    }

    private final void c0() {
    }

    private final void h0() {
    }

    private final void s2() {
    }

    private final void t2() {
    }

    private final void y3() {
    }

    private final void z3() {
    }

    @Override
    public void a() {
    }

    @Override
    public void e() {
    }

    @Override
    public void o() {
    }

    @Override
    public void release() {
    }

    @Override
    public void u() {
    }

    private final void C2(t1 t1Var) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void G2(t1 t1Var) {
    }

    private final void G3(int i9) {
    }

    private final void H2(t1 t1Var) {
    }

    private final void H3(int i9) {
    }

    private final void I2(t1 t1Var) {
    }

    private final void J2(t1 t1Var) {
    }

    private final void K1(t1 t1Var) {
    }

    private final void K2(t1 t1Var) {
    }

    private final void L0(t1 t1Var) {
    }

    private final void L2(t1 t1Var) {
    }

    private final void L3(MessageObject messageObject) {
    }

    private final void M3(MessageObject messageObject) {
    }

    private final void N0(t1 t1Var) {
    }

    private final void N1(t1 t1Var) {
    }

    private final void O2(t1 t1Var) {
    }

    private final void P2(t1 t1Var) {
    }

    private final void V0(t1 t1Var) {
    }

    private final void X0(t1 t1Var) {
    }

    private final void Y2(String str) {
    }

    private final void Z2(String str) {
    }

    private final void a2(t1 t1Var) {
    }

    private final void c2(t1 t1Var) {
    }

    private final void d2(t1 t1Var) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void h1(t1 t1Var) {
    }

    private final void h2(t1 t1Var) {
    }

    private final void i1(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final void j1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void k3(MessageObject messageObject) {
    }

    private final void l3(MessageObject messageObject) {
    }

    private final void m1(t1 t1Var) {
    }

    private final void m3(t1 t1Var) {
    }

    private final void n0(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void n3(t1 t1Var) {
    }

    private final void p0(t1 t1Var) {
    }

    private final void q1(t1 t1Var) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r3(t1 t1Var) {
    }

    private final void s3(t1 t1Var) {
    }

    private final void u1(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final void w3(t1 t1Var) {
    }

    private final void x0(t1 t1Var) {
    }

    private final void x3(t1 t1Var) {
    }

    private final void y0(t1 t1Var) {
    }

    @Override
    public void A(Object obj) {
    }

    @Override
    public void E(TLRPC.User user) {
    }

    @Override
    public long c(long j10) {
        return j10;
    }

    private final void E2(t1 t1Var, TLRPC.Document document) {
    }

    private final void F2(t1 t1Var, TLRPC.Document document) {
    }

    private final void J1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void P0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Q(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void U1(int i9, t1 t1Var) {
    }

    private final void V1(int i9, t1 t1Var) {
    }

    private final void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void Z1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void a3(t1 t1Var, long j10) {
    }

    private final void b3(t1 t1Var, long j10) {
    }

    private final void m2(int i9, t1 t1Var) {
    }

    private final void o1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void o3(t1 t1Var, f fVar) {
    }

    private final void p1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void p3(t1 t1Var, f fVar) {
    }

    private final void r2(int i9, t1 t1Var) {
    }

    private final void t3(t1 t1Var, boolean z10) {
    }

    private final void v1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void v3(t1 t1Var, boolean z10) {
    }

    @Override
    public void H(Looper looper, i3.l lVar) {
    }

    @Override
    public void g(int i9, Object obj) {
    }

    private final void K(t1 t1Var, float f10, float f11) {
    }

    private final void M2(t1 t1Var, float f10, float f11) {
    }

    private final void N2(t1 t1Var, float f10, float f11) {
    }

    private final void O(t1 t1Var, float f10, float f11) {
    }

    private final void Q1(t1 t1Var, int i9, int i10) {
    }

    private final void S2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void T1(t1 t1Var, int i9, int i10) {
    }

    private final void T2(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void c1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void f1(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    private final void g3(t1 t1Var, float f10, float f11) {
    }

    private final void h3(t1 t1Var, float f10, float f11) {
    }

    private final void u2(t1 t1Var, float f10, float f11) {
    }

    private final void v2(t1 t1Var, float f10, float f11) {
    }

    private final void U2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void V2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void W2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void X2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void i2(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final void j2(t1 t1Var, float f10, float f11, boolean z10) {
    }

    private final void w2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final void x2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    private final void A2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final void B2(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    private final void c3(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final void d3(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    private final void y2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void z2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void a1(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final void b1(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    private final void C3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    private final void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    @Override
    public void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }

    @Override
    public void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
