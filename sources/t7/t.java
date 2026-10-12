package t7;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaCodec;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import c5.b0;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.u;
import g2.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentSkipListMap;
import l.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.ce;
import org.telegram.ui.sv0;
public class t implements s0, bg.a, c3.g, cg.a, ea.a, fb.o, g2.g, com.google.android.gms.common.api.internal.s, w, n6.l, q9.d, pp0, l1, p2.s, OnFailureListener, r2.k, v2.l, y2.i {
    public static t f48469a;

    public t(Object obj) {
    }

    public static MediaCodec G(com.google.firebase.messaging.n nVar) {
        String str = ((r2.o) nVar.f7950a).f47118a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static k4.d H(m5 m5Var, b0 b0Var) {
        IOException iOException = (IOException) b0Var.f4202c;
        if (iOException instanceof x) {
            int i10 = ((x) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (m5Var.b(1)) {
                    return new k4.d(1, 300000L);
                }
                if (m5Var.b(2)) {
                    return new k4.d(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long K(b0 b0Var) {
        Throwable th2 = (IOException) b0Var.f4202c;
        if (!(th2 instanceof b2.s0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof u) && !(th2 instanceof y2.k)) {
            int i10 = g2.j.f10252b;
            while (th2 != null) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).f10253a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((b0Var.f4201b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static void W(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new uc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new uc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    @Override
    public boolean C0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean C2(int i10) {
        return false;
    }

    @Override
    public y2.n D(p2.o oVar, p2.l lVar) {
        return new p2.r(oVar, lVar);
    }

    @Override
    public p9 G2() {
        return null;
    }

    @Override
    public boolean H1() {
        return false;
    }

    public int J(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1() {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        bg.a aVar;
        if (i11 == 6) {
            aVar = bg.a.f3889l;
        } else if (i11 > i12) {
            aVar = bg.a.f3886i;
        } else if (i11 < i12) {
            aVar = bg.a.f3887j;
        } else {
            aVar = bg.a.f3888k;
        }
        return aVar.R1(i10, i11, i12);
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    public Signature[] U(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        return null;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void X(float f7, boolean z10) {
        ce.f36407b = f7 * 2.0f;
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        bg.a aVar;
        if (i10 == 6) {
            aVar = bg.a.f3889l;
        } else if (i10 > i11) {
            aVar = bg.a.f3886i;
        } else if (i10 < i11) {
            aVar = bg.a.f3887j;
        } else {
            aVar = bg.a.f3888k;
        }
        aVar.X0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public void a() {
        synchronized (z2.b.f53717a) {
            Object obj = z2.b.f53718b;
            synchronized (obj) {
                if (z2.b.f53719c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f53719c = true;
                }
            }
        }
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        j7.d dVar = (j7.d) ((j7.e) obj).u();
        b7.b bVar = new b7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = j7.c.f14064a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f14065a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean b1(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public p0 c(Class cls) {
        return new n0(true);
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public g2.h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public sv0 e2() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public p0 f1(Class cls, v1.b bVar) {
        return c(cls);
    }

    @Override
    public String g(u1 u1Var) {
        return null;
    }

    @Override
    public boolean g2(long j3) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public int j0(u1 u1Var) {
        return 0;
    }

    @Override
    public long l() {
        throw new NoSuchElementException();
    }

    @Override
    public r2.l m(com.google.firebase.messaging.n r6) {
        throw new UnsupportedOperationException("Method not decompiled: t7.t.m(com.google.firebase.messaging.n):r2.l");
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        return c1.a(messageObject);
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
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public StackTraceElement[] q(StackTraceElement[] stackTraceElementArr) {
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
            i13 = 1;
            i10 = i11;
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
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean s0(b6 b6Var) {
        return false;
    }

    @Override
    public long v() {
        throw new NoSuchElementException();
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public void w0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(hg.c.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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
    public Object w2() {
        return new ConcurrentSkipListMap();
    }

    @Override
    public boolean x(l.k kVar) {
        return false;
    }

    @Override
    public Object x0(u5 u5Var) {
        return new qb.d(u5Var.c(qb.h.class));
    }

    @Override
    public y2.n y() {
        return new p2.r(p2.o.f45148n, null);
    }

    @Override
    public void C() {
    }

    @Override
    public void E0() {
    }

    @Override
    public void E2() {
    }

    @Override
    public void X1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void z() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void J1(u1 u1Var) {
    }

    @Override
    public void K0(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void Q1(u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var) {
    }

    @Override
    public void S1(MessageObject messageObject) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void c1(u1 u1Var) {
    }

    @Override
    public void e0(int i10) {
    }

    @Override
    public void e1(u1 u1Var) {
    }

    @Override
    public long h(long j3) {
        return j3;
    }

    @Override
    public void k0(u1 u1Var) {
    }

    @Override
    public void k2(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void r0(String str) {
    }

    @Override
    public void s2(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void U0(int i10, u1 u1Var) {
    }

    @Override
    public void W0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void d(l.k kVar, boolean z10) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m2(u1 u1Var, long j3) {
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void B1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void F0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void F2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void G0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void a1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void u0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void z0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void z2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
