package z9;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.i;
import d4.j;
import d4.k;
import d4.z;
import dg.u3;
import g5.b0;
import g5.e0;
import g5.g0;
import g5.j0;
import g5.l0;
import g5.n;
import g5.o0;
import j$.util.concurrent.ConcurrentHashMap;
import j3.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import l7.w0;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.cv0;
import p2.w;
import r0.s;
import ra.m;
import u4.l;
import u4.o;
import u4.p;
public final class d implements OnFailureListener, j, Continuation, j0, m6.d, nf.a, of.a, io0, j1, s, m, p, com.google.android.gms.common.api.internal.s, c9.f {
    public final int f47463a;

    public d(int i10) {
        this.f47463a = i10;
    }

    public static MediaCodec c(i iVar) {
        iVar.f4141a.getClass();
        String str = iVar.f4141a.f4145a;
        h5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        h5.a.q();
        return createByCodecName;
    }

    public static c4.e d(g0 g0Var, w wVar) {
        IOException iOException = (IOException) wVar.f41052c;
        if (iOException instanceof e0) {
            int i10 = ((e0) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (g0Var.a(1)) {
                    return new c4.e(1, 300000L);
                }
                if (g0Var.a(2)) {
                    return new c4.e(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long v(w wVar) {
        Throwable th2 = (IOException) wVar.f41052c;
        if (!(th2 instanceof r1) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof b0) && !(th2 instanceof l0)) {
            int i10 = n.f6395b;
            while (th2 != null) {
                if (!(th2 instanceof n) || ((n) th2).f6396a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((wVar.f41051b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static boolean x(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: z9.d.x(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override
    public m9 D2() {
        return null;
    }

    @Override
    public boolean F1() {
        return false;
    }

    @Override
    public boolean K1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean M1() {
        return false;
    }

    @Override
    public boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public int P1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(s1 s1Var) {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public CharacterStyle S1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean U1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public k V(i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = c(iVar);
            h5.a.c("configureCodec");
            mediaCodec.configure(iVar.f4142b, iVar.d, iVar.e, 0);
            h5.a.q();
            h5.a.c("startCodec");
            mediaCodec.start();
            h5.a.q();
            return new z(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            short s9 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s6);
                shortBuffer2.put(s9);
            } else if (i11 == 1) {
                shortBuffer2.put(db.a.I3(s6, s9));
            }
        }
    }

    @Override
    public void Y(float f10, boolean z4) {
        u3.f4818b = f10 * 2.0f;
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public void a() {
        synchronized (h5.a.h) {
            Object obj = h5.a.f6909i;
            synchronized (obj) {
                if (h5.a.f6910j) {
                    return;
                }
                long a2 = h5.a.a();
                synchronized (obj) {
                    h5.a.f6911k = a2;
                    h5.a.f6910j = true;
                }
            }
        }
    }

    @Override
    public boolean a0(s1 s1Var) {
        return false;
    }

    @Override
    public boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        x6.d dVar = (x6.d) ((x6.e) obj).u();
        p6.b bVar = new p6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = x6.c.f46896a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f46897a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public boolean c0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(s1 s1Var, boolean z4) {
        return false;
    }

    @Override
    public cv0 c2() {
        return null;
    }

    @Override
    public Object d0(c5.j jVar) {
        cb.a aVar = new cb.a();
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(1);
        ReferenceQueue referenceQueue = aVar.f2233a;
        Set set = aVar.f2234b;
        set.add(new cb.n(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new androidx.biometric.j(referenceQueue, set, false, 1), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e2(long j10) {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(s1 s1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public e8.a h(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        int h = cVar.h(context, str, true);
        aVar.f5163b = h;
        if (h != 0) {
            aVar.f5164c = 1;
            return aVar;
        }
        int z4 = cVar.z(context, str);
        aVar.f5162a = z4;
        if (z4 != 0) {
            aVar.f5164c = -1;
        }
        return aVar;
    }

    @Override
    public boolean h1(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public int j0() {
        return 0;
    }

    @Override
    public o0 k(l lVar, u4.i iVar) {
        return new o(lVar, iVar);
    }

    @Override
    public int k0(s1 s1Var) {
        return 0;
    }

    @Override
    public o0 l() {
        return new o(l.f45118n, null);
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    public int p(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean t0(u5 u5Var) {
        return false;
    }

    @Override
    public Object then(Task task) {
        switch (this.f47463a) {
            case 5:
                if (!task.isSuccessful()) {
                    Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    @Override
    public Object u2() {
        switch (this.f47463a) {
            case 21:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean z2(int i10) {
        return false;
    }

    public d(x6.a aVar) {
        this.f47463a = 24;
    }

    public d(Context context, r3.i iVar) {
        this.f47463a = 14;
        f7.b bVar = new f7.b(context, 4);
        w0 w0Var = new w0(iVar, 16);
        if (bVar != ((f7.b) w0Var.d)) {
            w0Var.d = bVar;
            ((HashMap) w0Var.f11786b).clear();
            ((HashMap) w0Var.f11787c).clear();
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void B2() {
    }

    @Override
    public void E0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void b() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void s() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void A(s1 s1Var) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void F(s1 s1Var) {
    }

    @Override
    public void H1(s1 s1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(s1 s1Var) {
    }

    @Override
    public void K0(s1 s1Var) {
    }

    @Override
    public void L(s1 s1Var) {
    }

    @Override
    public void N0(s1 s1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(s1 s1Var) {
    }

    @Override
    public void Q1(MessageObject messageObject) {
    }

    @Override
    public void S0(s1 s1Var) {
    }

    @Override
    public void U(s1 s1Var) {
    }

    @Override
    public void d1(s1 s1Var) {
    }

    @Override
    public void e1(s1 s1Var) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void j2(s1 s1Var) {
    }

    @Override
    public void l0(s1 s1Var) {
    }

    @Override
    public void n(s1 s1Var) {
    }

    @Override
    public void q(s1 s1Var) {
    }

    @Override
    public void s0(String str) {
    }

    @Override
    public void s2(s1 s1Var) {
    }

    @Override
    public void t(s1 s1Var) {
    }

    @Override
    public void u(s1 s1Var) {
    }

    @Override
    public void y(s1 s1Var) {
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void I1(s1 s1Var, boolean z4) {
    }

    @Override
    public void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(s1 s1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, s1 s1Var) {
    }

    @Override
    public void U0(int i10, s1 s1Var) {
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void l2(s1 s1Var, long j10) {
    }

    @Override
    public void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void C2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void F0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void v0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void z1(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void A0(s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z4) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
