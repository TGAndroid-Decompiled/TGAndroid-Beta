package w7;

import a8.b8;
import a8.la;
import a8.r7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaDrmException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import bi.y0;
import c8.t9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.l0;
import h9.i0;
import java.io.ByteArrayOutputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m9.y;
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.j10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.ya;
import org.telegram.ui.fr0;
public final class s implements androidx.car.app.messaging.model.b, b7.e, com.google.android.gms.common.api.internal.r, eg.a, fg.a, si, ja.a, SuccessContinuation, u9.d, gh.a, kb, m1, q2.q, r0.q, u2.k, y9.a, s0 {
    public static s f59669b;
    public static final s f59670c = new s(13);
    public static s d;
    public final int f59671a;

    public s(int i7) {
        this.f59671a = i7;
    }

    public static MediaCodec V(b8 b8Var) {
        String str = ((u2.o) b8Var.f341a).f58383a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] a0(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            g2.b bVar = (g2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                la.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a10.putByteArray(g2.b.f13131x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a10);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static Calendar b0() {
        if (d == null) {
            d = new s(27);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static boolean m0(t1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: w7.s.m0(t1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static y s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((l0) it.next()).f10533b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return t9.b(list);
    }

    @Override
    public byte[] A(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public int A2() {
        return 1711276032;
    }

    @Override
    public void C(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public u2.l D(a8.b8 r6) {
        throw new UnsupportedOperationException("Method not decompiled: w7.s.D(a8.b8):u2.l");
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public q2.o G(byte[] bArr, List list, int i7, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public int H() {
        return 1;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void J(lb lbVar, wa waVar, og ogVar, rl rlVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        rlVar.accept(Float.valueOf(lbVar.getTranslationY()));
        r1.g gVar = new r1.g((Object) lbVar, lb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.f56368m.a(0.8f);
        gVar.f56368m.b(400.0f);
        gVar.a(new y0(2, lbVar, ogVar));
        gVar.b(new jb(rlVar, lbVar, 1));
        gVar.h();
        waVar.run();
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public void M(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return (i7 / i10) * i11;
    }

    @Override
    public boolean O(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i7, shortBuffer2.remaining() / i10);
        for (int i11 = 0; i11 < min; i11++) {
            short s5 = shortBuffer.get();
            short s9 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i10 == 2) {
                shortBuffer2.put(s5);
                shortBuffer2.put(s9);
            } else if (i10 == 1) {
                shortBuffer2.put(qb.a.W4(s5, s9));
            }
        }
    }

    @Override
    public b7.d Q(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        int o4 = cVar.o(context, str, true);
        dVar.f2963b = o4;
        if (o4 != 0) {
            dVar.f2964c = 1;
            return dVar;
        }
        int C = cVar.C(context, str);
        dVar.f2962a = C;
        if (C != 0) {
            dVar.f2964c = -1;
        }
        return dVar;
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override
    public boolean S(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(r1 r1Var, gj gjVar) {
        return false;
    }

    @Override
    public boolean U(r1 r1Var) {
        return false;
    }

    @Override
    public int U0() {
        return 352321535;
    }

    @Override
    public boolean V0(r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public int Z() {
        return 0;
    }

    @Override
    public float Z0() {
        return -1.0f;
    }

    @Override
    public boolean Z1(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public jh.a c0() {
        return null;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public Map d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean d0(r1 r1Var) {
        return false;
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f59671a) {
            case 14:
                return new ob.c(r7Var.L(ob.b.class));
            default:
                return new ob.b(r7Var.c(nb.a.class));
        }
    }

    @Override
    public boolean e0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public p0 f(Class cls) {
        return new z1.b();
    }

    @Override
    public void f0(gh ghVar) {
        ghVar.run();
    }

    @Override
    public boolean f1(gj gjVar) {
        return c0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public p0 g(Class cls, y1.b bVar) {
        return f(cls);
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean h2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String i(r1 r1Var) {
        return null;
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void j(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        r1.g gVar = new r1.g(lbVar, lb.IN_OUT_OFFSET_Y, lbVar.getHeight());
        gVar.f56368m.a(0.8f);
        gVar.f56368m.b(400.0f);
        gVar.a(new ya(uaVar, 1));
        gVar.b(new jb(xaVar, lbVar, 0));
        gVar.h();
        waVar.run();
    }

    @Override
    public Exception k(Status status) {
        return q6.m.m(status);
    }

    @Override
    public int k0(r1 r1Var) {
        return 0;
    }

    @Override
    public q2.p n() {
        throw new IllegalStateException();
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public boolean p0(y5 y5Var) {
        return false;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public k2.b r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 >= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(i5.c.i(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i11;
            int ceil = (int) Math.ceil((i10 / i7) * remaining);
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
    public byte[] t() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public int t0() {
        return 872415231;
    }

    @Override
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i7 = m6.c.h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    @Override
    public void u(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public boolean y0(gj gjVar) {
        return true;
    }

    @Override
    public String z(long j3) {
        return null;
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        return false;
    }

    @Override
    public k9 z2() {
        return null;
    }

    public s() {
        this.f59671a = 12;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void A0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void c() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void m() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void v() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void B(r1 r1Var) {
    }

    @Override
    public void C1(r1 r1Var) {
    }

    @Override
    public void E(r1 r1Var) {
    }

    @Override
    public void F0(r1 r1Var) {
    }

    @Override
    public void I0(r1 r1Var) {
    }

    @Override
    public void K(r1 r1Var) {
    }

    @Override
    public void L(dj djVar) {
    }

    @Override
    public void L1(r1 r1Var) {
    }

    @Override
    public void N0(r1 r1Var) {
    }

    @Override
    public void O1(gj gjVar) {
    }

    @Override
    public void P(r1 r1Var) {
    }

    @Override
    public void R(gj gjVar) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void W0(r1 r1Var) {
    }

    @Override
    public void X0(r1 r1Var) {
    }

    @Override
    public void Y(r1 r1Var) {
    }

    @Override
    public void a(c5 c5Var) {
    }

    @Override
    public void h0(int i7) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void j2(r1 r1Var) {
    }

    @Override
    public void l0(r1 r1Var) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void q(r1 r1Var) {
    }

    @Override
    public void q2(r1 r1Var) {
    }

    @Override
    public void s(r1 r1Var) {
    }

    @Override
    public void w(r1 r1Var) {
    }

    @Override
    public void x(byte[] bArr) {
    }

    @Override
    public void y(r1 r1Var) {
    }

    @Override
    public void z0(r1 r1Var) {
    }

    @Override
    public void F(byte[] bArr, m2.i iVar) {
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
    }

    @Override
    public void I(r1 r1Var, p2 p2Var) {
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(r1 r1Var, int i7) {
    }

    @Override
    public void O0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(r1 r1Var, j10 j10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(r1 r1Var, long j3) {
    }

    @Override
    public void p1(r1 r1Var, int i7) {
    }

    @Override
    public void B0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void H0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void j0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void q0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void y2(r1 r1Var, int i7, int i10) {
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void onScrollLimit(int i7, int i10, int i11, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i7, int i10, int i11, int i12) {
    }

    @Override
    public void p(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void u0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void l(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void X(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
