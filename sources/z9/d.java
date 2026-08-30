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
import kh.a2;
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
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.vu0;
import ra.m;
public class d implements s0, OnFailureListener, w, c9.e, h3.a, kf.a, m6.c, of.a, mb, k1, p9.b, pf.a, q9.a, o0, m {
    public final int f47399a;

    public d(int i10) {
        this.f47399a = i10;
    }

    public static p9.a G(db.a aVar) {
        return new p9.a(System.currentTimeMillis() + 3600000, new c5.c(8), new mb.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static short v3(short s6, short s9) {
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
    public void A(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f47399a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void A2() {
        int i10 = this.f47399a;
    }

    @Override
    public int B() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void B0(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void B2(t1 t1Var, int i10, int i11) {
        int i12 = this.f47399a;
    }

    @Override
    public int C(Context context, String str) {
        return m6.e.a(context, str);
    }

    @Override
    public void C0() {
        int i10 = this.f47399a;
    }

    @Override
    public n9 C2() {
        switch (this.f47399a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean D1() {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f47399a;
    }

    @Override
    public void E0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f47399a;
    }

    @Override
    public void E1(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void F0(t1 t1Var, float f10, float f11) {
        int i10 = this.f47399a;
    }

    @Override
    public void G1(t1 t1Var, boolean z4) {
        int i10 = this.f47399a;
    }

    @Override
    public void H0(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean I1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J0(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean K1() {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void L0(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void M(t1 t1Var, jh.f fVar) {
        int i10 = this.f47399a;
    }

    @Override
    public void M1(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void N(int i10, t1 t1Var) {
        int i11 = this.f47399a;
    }

    @Override
    public int N1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void O(MessageObject messageObject) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean O0(long j10) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(MessageObject messageObject) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f47399a) {
            case 16:
            default:
                af.g.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean Q() {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R(t1 t1Var) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(int i10, t1 t1Var) {
        int i11 = this.f47399a;
    }

    @Override
    public CharacterStyle R1(t1 t1Var) {
        switch (this.f47399a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean S() {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f47399a;
    }

    @Override
    public void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f47399a;
    }

    @Override
    public void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean T1(t1 t1Var, MessageObject messageObject) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(v3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void V1() {
        int i10 = this.f47399a;
    }

    @Override
    public int W() {
        switch (this.f47399a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f47399a;
    }

    @Override
    public long X() {
        return System.currentTimeMillis();
    }

    @Override
    public void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean Y0(t1 t1Var, boolean z4) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f47399a;
    }

    @Override
    public ug.a Z() {
        switch (this.f47399a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f47399a) {
            case 16:
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
    public boolean a0(t1 t1Var) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public vu0 a2() {
        switch (this.f47399a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean b(Context context) {
        return e0.b.j(context);
    }

    @Override
    public void c(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        j jVar = new j(nbVar, nb.IN_OUT_OFFSET_Y, nbVar.getHeight());
        jVar.f16198u.a(0.8f);
        jVar.f16198u.b(400.0f);
        jVar.a(new ya(uaVar, 1));
        jVar.b(new kb(xaVar, nbVar, 0));
        jVar.f();
        waVar.run();
    }

    @Override
    public boolean d() {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d0(t1 t1Var, TLRPC.User user) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d1(int i10, t1 t1Var) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d2(long j10) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e() {
        switch (this.f47399a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f47399a;
    }

    @Override
    public p0 f(Class cls) {
        switch (this.f47399a) {
            case 2:
                return new m0(true);
            default:
                return new w1.b();
        }
    }

    @Override
    public Object f0(c5.j jVar) {
        switch (this.f47399a) {
            case 6:
                return new Object();
            default:
                return new cb.d(jVar.d(i.class));
        }
    }

    @Override
    public boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f47399a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(int i10) {
        int i11 = this.f47399a;
    }

    @Override
    public p9.a h(db.a aVar, JSONObject jSONObject) {
        return G(aVar);
    }

    @Override
    public boolean h0() {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f47399a;
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.f47399a;
    }

    @Override
    public void i2(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void j() {
        int i10 = this.f47399a;
    }

    @Override
    public boolean j1(MessageObject messageObject) {
        int i10 = this.f47399a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean k(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public int k0(t1 t1Var) {
        switch (this.f47399a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k2(t1 t1Var, long j10) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean l(Context context) {
        return e0.b.m(context);
    }

    @Override
    public void l0(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void l1() {
        int i10 = this.f47399a;
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f47399a;
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean n0() {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o() {
        int i10 = this.f47399a;
    }

    @Override
    public void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f47399a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public int p(Context context, String str, boolean z4) {
        return m6.e.d(context, str, z4);
    }

    @Override
    public void p0(String str) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean q0(u5 u5Var) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q2(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public Object r(Uri uri, o oVar) {
        return Long.valueOf(d0.J(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override
    public void r1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f47399a;
    }

    @Override
    public void s() {
        int i10 = this.f47399a;
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.f47399a;
    }

    @Override
    public Object s2() {
        return new ConcurrentSkipListMap();
    }

    public Signature[] s3(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void t2() {
        int i10 = this.f47399a;
    }

    @Override
    public void u(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(a2.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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
    public void v(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        j jVar = new j(nbVar, nb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.f16198u.a(0.8f);
        jVar.f16198u.b(400.0f);
        jVar.a(new lb(0, nbVar, fgVar));
        jVar.b(new kb(glVar, nbVar, 1));
        jVar.f();
        waVar.run();
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
    public void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f47399a;
    }

    @Override
    public String w(long j10) {
        switch (this.f47399a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public p0 x(Class cls, v1.b bVar) {
        switch (this.f47399a) {
            case 2:
                return f(cls);
            default:
                return f(cls);
        }
    }

    @Override
    public void x1(t1 t1Var, float f10, float f11) {
        int i10 = this.f47399a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f47399a;
    }

    @Override
    public void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f47399a;
    }

    @Override
    public boolean y2(int i10) {
        switch (this.f47399a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean z(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.f47399a;
    }

    private final void C3() {
    }

    private final void D3() {
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void K2() {
    }

    private final void L2() {
    }

    private final void Q1() {
    }

    private final void U1() {
    }

    private final void Y() {
    }

    private final void b0() {
    }

    private final void o0() {
    }

    private final void r0() {
    }

    private final void t3() {
    }

    private final void u3() {
    }

    private final void y3() {
    }

    private final void z3() {
    }

    private final void A1(t1 t1Var) {
    }

    private final void A3(int i10) {
    }

    private final void B1(t1 t1Var) {
    }

    private final void B3(int i10) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void E2(t1 t1Var) {
    }

    private final void E3(MessageObject messageObject) {
    }

    private final void F2(t1 t1Var) {
    }

    private final void F3(MessageObject messageObject) {
    }

    private final void G0(t1 t1Var) {
    }

    private final void I0(t1 t1Var) {
    }

    private final void I2(t1 t1Var) {
    }

    private final void J2(t1 t1Var) {
    }

    private final void S0(t1 t1Var) {
    }

    private final void S2(String str) {
    }

    private final void T2(String str) {
    }

    private final void V0(t1 t1Var) {
    }

    private final void X0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void Y2(t1 t1Var) {
    }

    private final void Z2(t1 t1Var) {
    }

    private final void b1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void c0(t1 t1Var) {
    }

    private final void c1(t1 t1Var) {
    }

    private final void c3(t1 t1Var) {
    }

    private final void d3(t1 t1Var) {
    }

    private final void e0(t1 t1Var) {
    }

    private final void e1(t1 t1Var) {
    }

    private final void e3(MessageObject messageObject) {
    }

    private final void f3(MessageObject messageObject) {
    }

    private final void g3(t1 t1Var) {
    }

    private final void h1(t1 t1Var) {
    }

    private final void h3(t1 t1Var) {
    }

    private final void i1(t1 t1Var) {
    }

    private final void j0(t1 t1Var) {
    }

    private final void k3(t1 t1Var) {
    }

    private final void l3(t1 t1Var) {
    }

    private final void m0(t1 t1Var) {
    }

    private final void m3(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void n2(t1 t1Var) {
    }

    private final void o2(t1 t1Var) {
    }

    private final void o3(t1 t1Var) {
    }

    private final void p1(t1 t1Var) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r3(t1 t1Var) {
    }

    private final void t0(t1 t1Var) {
    }

    private final void w0(t1 t1Var) {
    }

    private final void w2(t1 t1Var) {
    }

    private final void x2(t1 t1Var) {
    }

    private final void y1(t1 t1Var) {
    }

    private final void z1(t1 t1Var) {
    }

    private final void z2(t1 t1Var) {
    }

    private final void D0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void H1(int i10, t1 t1Var) {
    }

    private final void K(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void L1(int i10, t1 t1Var) {
    }

    private final void U2(t1 t1Var, long j10) {
    }

    private final void V(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V2(t1 t1Var, long j10) {
    }

    private final void f1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void g1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void i3(t1 t1Var, jh.f fVar) {
    }

    private final void j3(t1 t1Var, jh.f fVar) {
    }

    private final void k1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void m1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void n3(t1 t1Var, boolean z4) {
    }

    private final void p3(t1 t1Var, boolean z4) {
    }

    private final void r2(t1 t1Var, TLRPC.Document document) {
    }

    private final void t1(int i10, t1 t1Var) {
    }

    private final void u1(int i10, t1 t1Var) {
    }

    private final void u2(t1 t1Var, TLRPC.Document document) {
    }

    private final void v1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void w1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void x0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void G2(t1 t1Var, float f10, float f11) {
    }

    private final void H(t1 t1Var, float f10, float f11) {
    }

    private final void H2(t1 t1Var, float f10, float f11) {
    }

    private final void J(t1 t1Var, float f10, float f11) {
    }

    private final void M2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void N0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void N2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void Q0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void W1(t1 t1Var, float f10, float f11) {
    }

    private final void a3(t1 t1Var, float f10, float f11) {
    }

    private final void b2(t1 t1Var, float f10, float f11) {
    }

    private final void b3(t1 t1Var, float f10, float f11) {
    }

    private final void q1(t1 t1Var, int i10, int i11) {
    }

    private final void s1(t1 t1Var, int i10, int i11) {
    }

    private final void C1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void F1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void O2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void P2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void Q2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void R2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void c2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void g2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void W2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void X2(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void h2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void j2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void l2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void m2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void K0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void M0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void w3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void x3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
