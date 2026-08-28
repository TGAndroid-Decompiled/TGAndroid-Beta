package ya;

import android.content.Context;
import android.media.MediaCodec;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.s0;
import j3.r0;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import m3.t;
import m3.w;
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
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.nu0;
import y3.x;
public final class b implements androidx.car.app.messaging.model.b, n0, e2.d, f3.a, i6.c, jf.a, kf.a, l4.l, m3.m, na.n, on0, k1, p4.q, ii, v3.g, y8.d, y3.j {
    public static b f49684b;
    public final int f49685a;

    public b(int i9) {
        this.f49685a = i9;
    }

    public static MediaCodec T(y3.i iVar) {
        iVar.f49500a.getClass();
        String str = iVar.f49500a.f49505a;
        d5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        d5.a.q();
        return createByCodecName;
    }

    @Override
    public String C(long j10) {
        return null;
    }

    @Override
    public t D() {
        return new m3.o(-9223372036854775807L);
    }

    @Override
    public void D1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override
    public CharacterStyle E1(t1 t1Var) {
        return null;
    }

    @Override
    public y3.k G(y3.i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = T(iVar);
            d5.a.c("configureCodec");
            mediaCodec.configure(iVar.f49501b, iVar.d, iVar.f49503e, 0);
            d5.a.q();
            d5.a.c("startCodec");
            mediaCodec.start();
            d5.a.q();
            return new x(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }

    @Override
    public boolean G1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public int H(Context context, String str) {
        return i6.e.a(context, str);
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public Object H1(b3.b bVar) {
        switch (this.f49685a) {
            case 23:
                return new h();
            default:
                g gVar = (g) bVar.a(g.class);
                synchronized (androidx.activity.result.c.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        androidx.activity.result.c.b(new Object());
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
                return new wa.a(0);
        }
    }

    @Override
    public w I(int i9, int i10) {
        return new m3.j();
    }

    @Override
    public boolean K0(long j10) {
        return false;
    }

    @Override
    public boolean O1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public nu0 P1() {
        return null;
    }

    @Override
    public void Q(float f10, boolean z10) {
        gh.m.f8529b = f10 * 2.0f;
    }

    @Override
    public boolean R1(long j10) {
        return false;
    }

    @Override
    public boolean S0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean V(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public s0 V1() {
        return new p4.p(p4.m.f45417n, null);
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public boolean W1(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean X(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean Y0(int i9, t1 t1Var) {
        return false;
    }

    @Override
    public Object Y1() {
        switch (this.f49685a) {
            case 16:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public boolean Z0(MessageObject messageObject) {
        return ll.a(messageObject);
    }

    @Override
    public void a() {
        synchronized (d5.a.h) {
            Object obj = d5.a.f4327i;
            synchronized (obj) {
                if (d5.a.f4328j) {
                    return;
                }
                long a2 = d5.a.a();
                synchronized (obj) {
                    d5.a.f4329k = a2;
                    d5.a.f4328j = true;
                }
            }
        }
    }

    @Override
    public long b(m3.l lVar) {
        return -1L;
    }

    @Override
    public int b0() {
        return 0;
    }

    @Override
    public long c() {
        throw new NoSuchElementException();
    }

    @Override
    public int c0() {
        return 0;
    }

    @Override
    public long d() {
        return System.currentTimeMillis();
    }

    @Override
    public pg.a d0() {
        return null;
    }

    @Override
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean e0(t1 t1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean f0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean f2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void g(int i9, Object obj) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 != 6 && i9 != 7 && i9 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public void g0(ShortBuffer shortBuffer, int i9, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i9 >= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(r0.l(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i11;
            int ceil = (int) Math.ceil((i10 / i9) * remaining);
            int i12 = remaining - ceil;
            float f10 = ceil;
            float f11 = f10 / f10;
            float f12 = i12;
            float f13 = f12 / f12;
            while (ceil > 0 && i12 > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f11 = ceil / f10;
                } else {
                    shortBuffer.position(shortBuffer.position() + i11);
                    i12--;
                    f13 = i12 / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public String i(t1 t1Var) {
        return null;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public int k(Context context, String str, boolean z10) {
        return i6.e.d(context, str, z10);
    }

    @Override
    public int l0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean n2(int i9) {
        return false;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public long p() {
        throw new NoSuchElementException();
    }

    @Override
    public o9 q2() {
        return null;
    }

    @Override
    public boolean r0(t5 t5Var) {
        return false;
    }

    @Override
    public boolean r1() {
        return false;
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
    public s0 x0(p4.m mVar, p4.j jVar) {
        return new p4.p(mVar, jVar);
    }

    @Override
    public boolean x1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean z1() {
        return false;
    }

    @Override
    public void B() {
    }

    @Override
    public void B0() {
    }

    @Override
    public void I1() {
    }

    @Override
    public void K() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void k2() {
    }

    @Override
    public void m() {
    }

    @Override
    public void n() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w() {
    }

    @Override
    public void A(Object obj) {
    }

    @Override
    public void A0(t1 t1Var) {
    }

    @Override
    public void A1(t1 t1Var) {
    }

    @Override
    public void C1(MessageObject messageObject) {
    }

    @Override
    public void E(TLRPC.User user) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void J(t1 t1Var) {
    }

    @Override
    public void M0(t1 t1Var) {
    }

    @Override
    public void N(t1 t1Var) {
    }

    @Override
    public void O(long j10) {
    }

    @Override
    public void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void R(t1 t1Var) {
    }

    @Override
    public void U(MessageObject messageObject) {
    }

    @Override
    public void U0(t1 t1Var) {
    }

    @Override
    public void W0(t1 t1Var) {
    }

    @Override
    public void a0(t1 t1Var) {
    }

    @Override
    public void b2(t1 t1Var) {
    }

    @Override
    public void g2(t1 t1Var) {
    }

    @Override
    public void i0(int i9) {
    }

    @Override
    public void m0(t1 t1Var) {
    }

    @Override
    public void q0(String str) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void s1(t1 t1Var) {
    }

    @Override
    public void v(t1 t1Var) {
    }

    @Override
    public void x(t1 t1Var) {
    }

    @Override
    public void y(t tVar) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void L1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void M(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void O0(int i9, t1 t1Var) {
    }

    @Override
    public void Q0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S(int i9, t1 t1Var) {
    }

    @Override
    public void e1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void e2(t1 t1Var, long j10) {
    }

    @Override
    public void g1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void t1(t1 t1Var, boolean z10) {
    }

    @Override
    public void w1(t1 t1Var, eh.f fVar) {
    }

    @Override
    public void y1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public int B1(int i9, int i10, int i11) {
        return i9;
    }

    @Override
    public void D0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void E0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void R0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void k0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void l1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void p2(t1 t1Var, int i9, int i10) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void M1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void q(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override
    public void l2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void Z(t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override
    public void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }

    @Override
    public void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }

    @Override
    public void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }
}
