package za;

import android.net.Uri;
import android.text.style.CharacterStyle;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d5.g0;
import e7.v;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import m3.t;
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
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.t5;
import org.telegram.ui.ou0;
import w3.b0;

public final class b implements y2.b, z8.d, e2.c, SuccessContinuation, g9.c, kf.a, l4.l, lf.a, s0, oa.m, pn0, j1, p4.q, ei, v3.g, y3.j {

    public final int f50280a;

    public b(int i10) {
        this.f50280a = i10;
    }

    public static String B(jc.c cVar) {
        String str = cVar.f12893a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    public static final CharSequence C(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void D0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public void E1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override
    public CharacterStyle F1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean H1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean L0(long j10) {
        return false;
    }

    @Override
    public boolean M1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean N0() {
        return false;
    }

    @Override
    public ou0 O1() {
        return null;
    }

    @Override
    public void P(float f10, boolean z10) {
        hh.m.f9702b = f10 * 2.0f;
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean S0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean U(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public s0 U1() {
        return new p4.p(p4.m.f45423n, null);
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public boolean V1(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean W(s1 s1Var) {
        return false;
    }

    @Override
    public boolean X() {
        return false;
    }

    @Override
    public boolean Y0(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public int a0() {
        return 0;
    }

    @Override
    public boolean a1(MessageObject messageObject) {
        return rl.a(messageObject);
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
    public String c() {
        return null;
    }

    @Override
    public void c0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 > i11) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(i0.a.k(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int iRemaining = shortBuffer.remaining() / i12;
        int iCeil = ((int) Math.ceil((((double) i11) / ((double) i10)) * ((double) iRemaining))) - iRemaining;
        float f10 = iRemaining;
        float f11 = f10 / f10;
        float f12 = iCeil;
        float f13 = f12 / f12;
        while (iRemaining > 0 && iCeil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                iRemaining--;
                f11 = iRemaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                if (i12 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                }
                iCeil--;
                f13 = iCeil / f12;
            }
        }
    }

    @Override
    public boolean c2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public qg.a d0() {
        return null;
    }

    @Override
    public Object e(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        return Long.valueOf(g0.K(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override
    public boolean e0(s1 s1Var) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public Object f2() {
        switch (this.f50280a) {
            case 16:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public long g() {
        throw new NoSuchElementException();
    }

    @Override
    public Object mo28get() {
        switch (this.f50280a) {
            case 2:
                w9.d dVar = new w9.d(6);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(t2.d.f48012a, new c3.b(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(t2.d.f48014c, new c3.b(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c3.c.f2422b)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(t2.d.f48013b, new c3.b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < t2.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new c3.a(dVar, map);
            default:
                return new g6.a(Executors.newSingleThreadExecutor());
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public String h(s1 s1Var) {
        return null;
    }

    @Override
    public long i() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public boolean k2(int i10) {
        return false;
    }

    @Override
    public t l() {
        return new m3.o(-9223372036854775807L);
    }

    @Override
    public int l0(s1 s1Var) {
        return 0;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public k9 o2() {
        return null;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public boolean s0(t5 t5Var) {
        return false;
    }

    @Override
    public boolean s1() {
        return false;
    }

    @Override
    public y3.k t1(y3.i iVar) {
        int i10 = g0.f4795a;
        if (i10 < 23 || i10 < 31) {
            return new v(26).t1(iVar);
        }
        int iG = d5.q.g(iVar.f49492c.B);
        d5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + g0.B(iG));
        return new b0(iG).t1(iVar);
    }

    @Override
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public Object u0(af.h hVar) {
        switch (this.f50280a) {
            case 3:
                return new cb.a();
            default:
                a aVar = new a();
                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(6);
                ReferenceQueue referenceQueue = aVar.f50278a;
                Set set = aVar.f50279b;
                set.add(new l(aVar, referenceQueue, set, nVar));
                Thread thread = new Thread(new o0.m(10, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
        }
    }

    @Override
    public boolean x1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void y(sg sgVar) {
        sgVar.run();
    }

    @Override
    public s0 y0(p4.m mVar, p4.j jVar) {
        return new p4.p(mVar, jVar);
    }

    @Override
    public String z(long j10) {
        return null;
    }

    @Override
    public boolean z1() {
        return false;
    }

    @Override
    public void C0() {
    }

    @Override
    public void F() {
    }

    @Override
    public void I1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void r() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w() {
    }

    @Override
    public void A(long j10) {
    }

    @Override
    public void B0(s1 s1Var) {
    }

    @Override
    public void B1(s1 s1Var) {
    }

    @Override
    public void D(s1 s1Var) {
    }

    @Override
    public void D1(MessageObject messageObject) {
    }

    @Override
    public void G0(s1 s1Var) {
    }

    @Override
    public void H(s1 s1Var) {
    }

    @Override
    public void H0(s1 s1Var) {
    }

    @Override
    public void I(Object obj) {
    }

    @Override
    public void J0(s1 s1Var) {
    }

    @Override
    public void M(s1 s1Var) {
    }

    @Override
    public void M0(s1 s1Var) {
    }

    @Override
    public void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void Q(s1 s1Var) {
    }

    @Override
    public void T(MessageObject messageObject) {
    }

    @Override
    public void U0(s1 s1Var) {
    }

    @Override
    public void W0(s1 s1Var) {
    }

    @Override
    public void Z(s1 s1Var) {
    }

    @Override
    public void Z1(s1 s1Var) {
    }

    @Override
    public void d2(s1 s1Var) {
    }

    @Override
    public void g0(TLRPC.User user) {
    }

    @Override
    public void i0(int i10) {
    }

    @Override
    public void m0(s1 s1Var) {
    }

    @Override
    public void p(s1 s1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void t(s1 s1Var) {
    }

    @Override
    public void u1(s1 s1Var) {
    }

    @Override
    public void v(s1 s1Var) {
    }

    @Override
    public void x(s1 s1Var) {
    }

    @Override
    public void K1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void L(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void O0(int i10, s1 s1Var) {
    }

    @Override
    public void Q0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void R(int i10, s1 s1Var) {
    }

    @Override
    public void a2(s1 s1Var, fh.f fVar) {
    }

    @Override
    public void b2(s1 s1Var, long j10) {
    }

    @Override
    public void e1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void h1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void n(int i10, Object obj) {
    }

    @Override
    public void v1(s1 s1Var, boolean z10) {
    }

    @Override
    public void y1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public int C1(int i10, int i11, int i12) {
        return i10;
    }

    @Override
    public void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void R0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void k0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void m1(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void n2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void t0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void L1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void o(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void v0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void x0(s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void Y(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override
    public void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
