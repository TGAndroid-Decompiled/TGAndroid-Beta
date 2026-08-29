package ya;

import a3.b;
import a9.e;
import ab.h;
import android.content.Context;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.tasks.OnFailureListener;
import e2.c;
import f7.v;
import g9.l;
import hh.f;
import ie.j;
import j$.util.DesugarCollections;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import k6.d;
import o3.m;
import o3.t;
import o3.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zg;
import org.telegram.ui.c61;
import org.telegram.ui.jn;
import org.telegram.ui.lu0;
public final class a implements OnFailureListener, b, c, hf.a, d, c61, me.b, mf.a, nf.a, m, hg, j1, t0, pa.m, li, s0, e {
    public final int f50511a;

    public a(int i10) {
        this.f50511a = i10;
    }

    public static boolean A2(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: ya.a.A2(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public boolean C0() {
        return true;
    }

    @Override
    public me.a E1(l lVar) {
        return new j(lVar);
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override
    public boolean H0(Context context) {
        return e0.b.m(context);
    }

    @Override
    public boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Object I0(a5.j jVar) {
        switch (this.f50511a) {
            case 24:
                h hVar = (h) jVar.a(h.class);
                return new bb.a(0);
            default:
                ab.a aVar = (ab.a) jVar.a(ab.a.class);
                return new ab.b(0);
        }
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public boolean M0(long j10) {
        return false;
    }

    @Override
    public int M1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public o2 O0() {
        return null;
    }

    @Override
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean Q(s1 s1Var) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            shortBuffer2.put(s10);
            shortBuffer2.put(s10);
        }
    }

    @Override
    public boolean T1() {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean W0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public sg.a X() {
        return null;
    }

    @Override
    public boolean Y(s1 s1Var) {
        return false;
    }

    @Override
    public lu0 Y1() {
        return null;
    }

    @Override
    public boolean Z(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public p0 Z0(Class cls, v1.b bVar) {
        return h(cls);
    }

    @Override
    public w Z1(int i10, int i11) {
        return new o3.j();
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
    public boolean a2(long j10) {
        return false;
    }

    @Override
    public long b() {
        return 0L;
    }

    @Override
    public int b1() {
        return 0;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean d(Context context) {
        return e0.b.j(context);
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public boolean f() {
        switch (this.f50511a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(s1 s1Var) {
        return 0;
    }

    @Override
    public boolean f1(long j10) {
        return false;
    }

    @Override
    public String g(s1 s1Var) {
        return null;
    }

    @Override
    public Object mo18get() {
        v vVar = new v(8);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(v2.d.f49328a, new e3.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(v2.d.f49330c, new e3.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(e3.c.f5804b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(v2.d.f49329b, new e3.b(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= v2.d.values().length) {
                            new HashMap();
                            return new e3.a(vVar, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    @Override
    public p0 h(Class cls) {
        return new w1.b();
    }

    @Override
    public void h0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean i1() {
        return false;
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public void l0(int i10, Object obj) {
        String str;
        switch (i10) {
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
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public int m() {
        return 0;
    }

    @Override
    public boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean n0(y5 y5Var) {
        return false;
    }

    @Override
    public jn o0() {
        return null;
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public Object p2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public TLRPC.Peer q() {
        return null;
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            nf.a.f17320t.r0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            nf.a.f17319q.r0(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public boolean r2(v0 v0Var, float f9, float f10) {
        return false;
    }

    @Override
    public boolean u2(int i10) {
        return false;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public void x0(zg zgVar) {
        zgVar.run();
    }

    @Override
    public String y(long j10) {
        return null;
    }

    @Override
    public l9 y2() {
        return null;
    }

    @Override
    public c8.a z(Context context, String str, k6.c cVar) {
        c8.a aVar = new c8.a();
        aVar.f3002a = cVar.l(context, str);
        int i10 = 1;
        int i11 = cVar.i(context, str, true);
        aVar.f3003b = i11;
        int i12 = aVar.f3002a;
        if (i12 == 0) {
            i12 = 0;
            if (i11 == 0) {
                i10 = 0;
                aVar.f3004c = i10;
                return aVar;
            }
        }
        if (i11 < i12) {
            i10 = -1;
        }
        aVar.f3004c = i10;
        return aVar;
    }

    @Override
    public void B() {
    }

    @Override
    public void G0() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void L0() {
    }

    @Override
    public void M() {
    }

    @Override
    public void S1() {
    }

    @Override
    public void T0() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void e() {
    }

    @Override
    public void e1() {
    }

    @Override
    public void i() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k0() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void n1() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void r() {
    }

    @Override
    public void r1() {
    }

    @Override
    public void s0() {
    }

    @Override
    public void s1() {
    }

    @Override
    public void t() {
    }

    @Override
    public void u0() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void z1() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void A(s1 s1Var) {
    }

    @Override
    public void C(s1 s1Var) {
    }

    @Override
    public void C1(s1 s1Var) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void D1(t tVar) {
    }

    @Override
    public void F(s1 s1Var) {
    }

    @Override
    public void F0(s1 s1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(s1 s1Var) {
    }

    @Override
    public void K(s1 s1Var) {
    }

    @Override
    public void L1(s1 s1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(s1 s1Var) {
    }

    @Override
    public void N1(MessageObject messageObject) {
    }

    @Override
    public void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void T(s1 s1Var) {
    }

    @Override
    public void U(boolean z10) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void W(v0 v0Var) {
    }

    @Override
    public void X0(s1 s1Var) {
    }

    @Override
    public void Y0(s1 s1Var) {
    }

    @Override
    public void a1(int i10) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void e2(s1 s1Var) {
    }

    @Override
    public void f2(int i10) {
    }

    @Override
    public void g0(s1 s1Var) {
    }

    @Override
    public void i0(v0 v0Var) {
    }

    @Override
    public void j1(TLRPC.User user) {
    }

    @Override
    public void k2(boolean z10) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n2(s1 s1Var) {
    }

    @Override
    public void o(s1 s1Var) {
    }

    @Override
    public void q0(v0 v0Var) {
    }

    @Override
    public void s(s1 s1Var) {
    }

    @Override
    public void u(s1 s1Var) {
    }

    @Override
    public void v(float f9) {
    }

    @Override
    public void v1(CharSequence charSequence) {
    }

    @Override
    public void w(s1 s1Var) {
    }

    @Override
    public void x(boolean z10) {
    }

    @Override
    public void x1(long j10) {
    }

    @Override
    public void y0(s1 s1Var) {
    }

    @Override
    public void y1(v0 v0Var) {
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, int i11) {
    }

    @Override
    public void F1(s1 s1Var, boolean z10) {
    }

    @Override
    public void I(float f9, int i10) {
    }

    @Override
    public void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void J(v0 v0Var, int i10) {
    }

    @Override
    public void L(int i10, s1 s1Var) {
    }

    @Override
    public void P0(int i10, s1 s1Var) {
    }

    @Override
    public void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(s1 s1Var, long j10) {
    }

    @Override
    public void h2(v0 v0Var, String str) {
    }

    @Override
    public void j2(s1 s1Var, f fVar) {
    }

    @Override
    public void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void K1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void b0(v0 v0Var, int i10, int i11) {
    }

    @Override
    public void e0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void g1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void p0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void u1(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void x2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override
    public void v0(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    @Override
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override
    public void t2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override
    public void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
