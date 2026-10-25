package u7;

import a8.me;
import aa.m0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodec;
import android.media.MediaDrmException;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.Trace;
import android.text.style.CharacterStyle;
import androidx.fragment.app.l0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.x0;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.z;
import g2.u;
import g2.x;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import li.e3;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.cv0;
import org.telegram.ui.d3;
import vi.y;
public class s implements s0, c3.g, j5.e, dg.a, eg.a, ga.a, hb.n, com.google.android.gms.common.api.internal.r, fh.a, n2.q, o6.k, j1, s9.d, r2.k, o5.b, v5.a, z6.d {
    public static s f49611b;
    public static s f49612c;
    public final int f49613a;

    public s(int i10) {
        this.f49613a = i10;
    }

    public static long H0(z zVar) {
        for (Throwable th2 = (IOException) zVar.f8027c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof x0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof y2.k)) {
                if ((th2 instanceof g2.j) && ((g2.j) th2).f12248a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((zVar.f8026b - 1) * 1000, 5000);
    }

    public static boolean N0(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: u7.s.N0(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static MediaCodec x0(m0 m0Var) {
        String str = ((r2.o) m0Var.f1150a).f47221a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static k4.d z0(y yVar, z zVar) {
        IOException iOException = (IOException) zVar.f8027c;
        if (iOException instanceof x) {
            int i10 = ((x) iOException).f12289c;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (yVar.a(1)) {
                    return new k4.d(1, 300000L);
                }
                if (yVar.a(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public int A() {
        return 352321535;
    }

    @Override
    public p0 B(Class cls, v1.b bVar) {
        switch (this.f49613a) {
            case 2:
                return a(cls);
            default:
                return a(cls);
        }
    }

    public int B0(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
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
    public void E(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public cv0 E1() {
        return null;
    }

    @Override
    public r2.l G(aa.m0 r6) {
        throw new UnsupportedOperationException("Method not decompiled: u7.s.G(aa.m0):r2.l");
    }

    @Override
    public void G0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        dg.a aVar;
        if (i10 == 6) {
            aVar = dg.a.f8351p;
        } else if (i10 > i11) {
            aVar = dg.a.f8348l;
        } else if (i10 < i11) {
            aVar = dg.a.f8349m;
        } else {
            aVar = dg.a.f8350o;
        }
        aVar.G0(shortBuffer, i10, shortBuffer2, i11);
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

    public Signature[] M0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
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
    public boolean Q1(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public byte[] R(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public int S() {
        return 0;
    }

    @Override
    public boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override
    public void U(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public Object U1() {
        switch (this.f49613a) {
            case 9:
                return new ArrayList();
            default:
                return new hb.m(true);
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
    public n2.o Y(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public p0 a(Class cls) {
        switch (this.f49613a) {
            case 2:
                return new l0(true);
            default:
                return new w1.b();
        }
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        k7.d dVar = (k7.d) ((k7.e) obj).u();
        c7.b bVar = new c7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = k7.c.f16429a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f16430a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public Map b(byte[] bArr) {
        throw new IllegalStateException();
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
        return true;
    }

    @Override
    public Object d1(me meVar) {
        switch (this.f49613a) {
            case 18:
                return new sb.d(meVar.d(sb.h.class));
            default:
                return new sb.k((Context) meVar.a(Context.class));
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public Object f(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public int f0() {
        return 0;
    }

    @Override
    public Object mo27get() {
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(j5.d.f15513a, new s5.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(j5.d.f15515c, new s5.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(s5.c.f47879b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(j5.d.f15514b, new s5.b(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= j5.d.values().length) {
                            new HashMap();
                            return new s5.a(obj, hashMap);
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
    public String h(s1 s1Var) {
        return null;
    }

    @Override
    public boolean h0(c6 c6Var) {
        return false;
    }

    @Override
    public int i0() {
        return 1;
    }

    @Override
    public n2.p k() {
        throw new IllegalStateException();
    }

    @Override
    public void k0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(ic.a.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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
    public boolean k1() {
        return false;
    }

    @Override
    public a3.l l0(Context context, String str, z6.c cVar) {
        a3.l lVar = new a3.l();
        int t10 = cVar.t(context, str, true);
        lVar.f140b = t10;
        if (t10 != 0) {
            lVar.f141c = 1;
            return lVar;
        }
        int U = cVar.U(context, str);
        lVar.f139a = U;
        if (U != 0) {
            lVar.f141c = -1;
        }
        return lVar;
    }

    @Override
    public long o() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public boolean p0(String str, byte[] bArr) {
        throw new IllegalStateException();
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
    public int t() {
        return 872415231;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        dg.a aVar;
        if (i11 == 6) {
            aVar = dg.a.f8351p;
        } else if (i11 > i12) {
            aVar = dg.a.f8348l;
        } else if (i11 < i12) {
            aVar = dg.a.f8349m;
        } else {
            aVar = dg.a.f8350o;
        }
        return aVar.t1(i10, i11, i12);
    }

    @Override
    public String u(long j10) {
        return null;
    }

    @Override
    public int v0() {
        return 1711276032;
    }

    @Override
    public void v1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override
    public StackTraceElement[] w(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public CharacterStyle w1(s1 s1Var) {
        return null;
    }

    @Override
    public h2.b y(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean y1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public byte[] z() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public s(Object obj, int i10) {
        this.f49613a = i10;
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
    public void release() {
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
    public void H(byte[] bArr) {
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
    public void Q(s1 s1Var) {
    }

    @Override
    public void R1(s1 s1Var) {
    }

    @Override
    public void T(e3 e3Var) {
    }

    @Override
    public void Z(int i10) {
    }

    @Override
    public void d0(s1 s1Var) {
    }

    @Override
    public long g(long j10) {
        return j10;
    }

    @Override
    public void g0(String str) {
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
    public void e(byte[] bArr, j2.j jVar) {
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
    public void H1(s1 s1Var, int i10, float f7, float f10, boolean z10) {
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
}
