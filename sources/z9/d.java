package z9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import cb.i;
import com.google.android.gms.tasks.OnFailureListener;
import d4.w;
import g5.o;
import g5.o0;
import h5.d0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import o1.j;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.xu0;
import ra.m;
public class d implements s0, OnFailureListener, w, c9.e, h3.a, kf.a, m6.c, of.a, mb, k1, p9.b, pf.a, q9.a, o0, m, rg.a {
    public final int f51101a;

    public d(int i10) {
        this.f51101a = i10;
    }

    public static p9.a X(db.a aVar) {
        return new p9.a(System.currentTimeMillis() + 3600000, new c5.c(8), new mb.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short z3(short s6, short s9) {
        int i10;
        int i11 = s6 + 32768;
        int i12 = s9 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    @Override
    public void A(nb nbVar, wa waVar, fg fgVar, il ilVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        ilVar.accept(Float.valueOf(nbVar.getTranslationY()));
        j jVar = new j(nbVar, nb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.f16336u.a(0.8f);
        jVar.f16336u.b(400.0f);
        jVar.a(new lb(0, nbVar, fgVar));
        jVar.b(new kb(ilVar, nbVar, 1));
        jVar.f();
        waVar.run();
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f51101a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean B(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void B1(t1 t1Var, float f10, float f11) {
        int i10 = this.f51101a;
    }

    @Override
    public void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f51101a;
    }

    @Override
    public p0 C(Class cls, v1.b bVar) {
        return h(cls);
    }

    @Override
    public void C0(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f51101a;
    }

    @Override
    public void D0() {
        int i10 = this.f51101a;
    }

    @Override
    public void E(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean E2(int i10) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int F() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void F0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f51101a;
    }

    @Override
    public int G(Context context, String str) {
        return m6.e.a(context, str);
    }

    @Override
    public void G0(t1 t1Var, float f10, float f11) {
        int i10 = this.f51101a;
    }

    @Override
    public void G2() {
        int i10 = this.f51101a;
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean H1() {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H2(t1 t1Var, int i10, int i11) {
        int i12 = this.f51101a;
    }

    @Override
    public int I() {
        return 0;
    }

    @Override
    public void I0(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public n9 I2() {
        switch (this.f51101a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean J() {
        return false;
    }

    @Override
    public void J1(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void K(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void K0(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void L(int i10, t1 t1Var) {
        int i11 = this.f51101a;
    }

    @Override
    public void L1(t1 t1Var, boolean z4) {
        int i10 = this.f51101a;
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N0(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean N1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O() {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean P(t1 t1Var) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P1() {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q(t1 t1Var, kh.f fVar) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean R() {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j10) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f51101a;
    }

    @Override
    public void S0(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public int S1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void T1(MessageObject messageObject) {
        int i10 = this.f51101a;
    }

    @Override
    public int U() {
        return 1711276032;
    }

    @Override
    public void U0(int i10, t1 t1Var) {
        int i11 = this.f51101a;
    }

    @Override
    public void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f51101a) {
            case 16:
            default:
                af.g.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public int V() {
        switch (this.f51101a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public long W() {
        return System.currentTimeMillis();
    }

    @Override
    public void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f51101a;
    }

    @Override
    public CharacterStyle W1(t1 t1Var) {
        switch (this.f51101a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(z3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f51101a;
    }

    @Override
    public boolean Y1(t1 t1Var, MessageObject messageObject) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public vg.a Z() {
        switch (this.f51101a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean a0(t1 t1Var) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f51101a;
    }

    @Override
    public void a2() {
        int i10 = this.f51101a;
    }

    @Override
    public boolean b(Context context) {
        return e0.b.j(context);
    }

    @Override
    public boolean b1(t1 t1Var, boolean z4) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        j jVar = new j(nbVar, nb.IN_OUT_OFFSET_Y, nbVar.getHeight());
        jVar.f16336u.a(0.8f);
        jVar.f16336u.b(400.0f);
        jVar.a(new ya(uaVar, 1));
        jVar.b(new kb(xaVar, nbVar, 0));
        jVar.f();
        waVar.run();
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c1(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean d() {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d1(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean e() {
        switch (this.f51101a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public Object e0(c5.j jVar) {
        switch (this.f51101a) {
            case 6:
                return new Object();
            default:
                return new cb.d(jVar.c(i.class));
        }
    }

    @Override
    public boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p9.a f(db.a aVar, JSONObject jSONObject) {
        return X(aVar);
    }

    @Override
    public void f0(int i10) {
        int i11 = this.f51101a;
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f51101a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g1(int i10, t1 t1Var) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public xu0 g2() {
        switch (this.f51101a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public p0 h(Class cls) {
        return new m0(true);
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f51101a;
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.f51101a;
    }

    @Override
    public void j() {
        int i10 = this.f51101a;
    }

    @Override
    public boolean j2(long j10) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int k() {
        return 872415231;
    }

    @Override
    public int k0(t1 t1Var) {
        switch (this.f51101a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f51101a;
    }

    @Override
    public boolean l(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void l0(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean l2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f51101a;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        int i10 = this.f51101a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean n0() {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o() {
        int i10 = this.f51101a;
    }

    @Override
    public void o2(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public boolean p(Context context) {
        return e0.b.m(context);
    }

    @Override
    public void p0(String str) {
        int i10 = this.f51101a;
    }

    @Override
    public void p1() {
        int i10 = this.f51101a;
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean q0(u5 u5Var) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q2(t1 t1Var, long j10) {
        int i10 = this.f51101a;
    }

    @Override
    public void r() {
        int i10 = this.f51101a;
    }

    @Override
    public void s(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.f51101a;
    }

    @Override
    public void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f51101a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public int u(Context context, String str, boolean z4) {
        return m6.e.d(context, str, z4);
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(l.d.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
            float f10 = remaining;
            float f11 = f10 / f10;
            float f12 = ceil;
            float f13 = f12 / f12;
            while (remaining > 0 && ceil > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f11 = remaining / f10;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    }
                    ceil--;
                    f13 = ceil / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public String v(long j10) {
        switch (this.f51101a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public StackTraceElement[] v0(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = i11;
            i13 = 1;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public void v1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f51101a;
    }

    @Override
    public boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f51101a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object w(Uri uri, o oVar) {
        return Long.valueOf(d0.J(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override
    public void w2(t1 t1Var) {
        int i10 = this.f51101a;
    }

    public Signature[] w3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public int x() {
        return 352321535;
    }

    @Override
    public void x0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f51101a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public Object y2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public void z(t1 t1Var) {
        int i10 = this.f51101a;
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.f51101a;
    }

    @Override
    public void z2() {
        int i10 = this.f51101a;
    }

    private final void B0() {
    }

    private final void C3() {
    }

    private final void D3() {
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void K3() {
    }

    private final void L3() {
    }

    private final void O2() {
    }

    private final void P2() {
    }

    private final void Q1() {
    }

    private final void V1() {
    }

    private final void j0() {
    }

    private final void m0() {
    }

    private final void x3() {
    }

    private final void y0() {
    }

    private final void y3() {
    }

    private final void A2(t1 t1Var) {
    }

    private final void C1(t1 t1Var) {
    }

    private final void C2(t1 t1Var) {
    }

    private final void D1(t1 t1Var) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void E0(t1 t1Var) {
    }

    private final void E1(t1 t1Var) {
    }

    private final void E3(int i10) {
    }

    private final void F1(t1 t1Var) {
    }

    private final void F2(t1 t1Var) {
    }

    private final void F3(int i10) {
    }

    private final void H0(t1 t1Var) {
    }

    private final void I3(MessageObject messageObject) {
    }

    private final void J2(t1 t1Var) {
    }

    private final void J3(MessageObject messageObject) {
    }

    private final void M0(t1 t1Var) {
    }

    private final void M2(t1 t1Var) {
    }

    private final void N2(t1 t1Var) {
    }

    private final void O0(t1 t1Var) {
    }

    private final void W2(String str) {
    }

    private final void X2(String str) {
    }

    private final void Y0(t1 t1Var) {
    }

    private final void Z0(t1 t1Var) {
    }

    private final void c3(t1 t1Var) {
    }

    private final void d3(t1 t1Var) {
    }

    private final void e1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void f1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void g3(t1 t1Var) {
    }

    private final void h1(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final void i1(t1 t1Var) {
    }

    private final void i3(MessageObject messageObject) {
    }

    private final void j3(MessageObject messageObject) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void l1(t1 t1Var) {
    }

    private final void l3(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void o0(t1 t1Var) {
    }

    private final void o3(t1 t1Var) {
    }

    private final void p3(t1 t1Var) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r0(t1 t1Var) {
    }

    private final void r1(t1 t1Var) {
    }

    private final void r2(t1 t1Var) {
    }

    private final void s2(t1 t1Var) {
    }

    private final void s3(t1 t1Var) {
    }

    private final void t0(t1 t1Var) {
    }

    private final void t1(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final void v3(t1 t1Var) {
    }

    private final void w0(t1 t1Var) {
    }

    private final void x2(t1 t1Var) {
    }

    private final void A1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void J0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void K1(int i10, t1 t1Var) {
    }

    private final void L0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void M1(int i10, t1 t1Var) {
    }

    private final void Y2(t1 t1Var, long j10) {
    }

    private final void Z2(t1 t1Var, long j10) {
    }

    private final void d0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void h0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void j1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void k1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void m3(t1 t1Var, kh.f fVar) {
    }

    private final void n3(t1 t1Var, kh.f fVar) {
    }

    private final void o1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void q1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r3(t1 t1Var, boolean z4) {
    }

    private final void t2(t1 t1Var, TLRPC.Document document) {
    }

    private final void t3(t1 t1Var, boolean z4) {
    }

    private final void u2(t1 t1Var, TLRPC.Document document) {
    }

    private final void x1(int i10, t1 t1Var) {
    }

    private final void y1(int i10, t1 t1Var) {
    }

    private final void z1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void K2(t1 t1Var, float f10, float f11) {
    }

    private final void L2(t1 t1Var, float f10, float f11) {
    }

    private final void Q2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void R2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void T0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void V0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void Y(t1 t1Var, float f10, float f11) {
    }

    private final void Z1(t1 t1Var, float f10, float f11) {
    }

    private final void b0(t1 t1Var, float f10, float f11) {
    }

    private final void b2(t1 t1Var, float f10, float f11) {
    }

    private final void e3(t1 t1Var, float f10, float f11) {
    }

    private final void f3(t1 t1Var, float f10, float f11) {
    }

    private final void u1(t1 t1Var, int i10, int i11) {
    }

    private final void w1(t1 t1Var, int i10, int i11) {
    }

    private final void G1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void I1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void S2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void T2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void U2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void V2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void f2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void h2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void a3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void b3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void i2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void m2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void n2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void p2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void P0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void Q0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void A3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void B3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
