package w7;

import a8.b8;
import a8.ja;
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
import bi.v0;
import c8.r9;
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
import org.telegram.messenger.l10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.vg;
import org.telegram.ui.dr0;
public final class s implements androidx.car.app.messaging.model.b, b7.e, com.google.android.gms.common.api.internal.r, eg.a, fg.a, ii, ja.a, SuccessContinuation, u9.d, gh.a, bb, l1, q2.r, r0.q, u2.k, y9.a, s0 {
    public static s f59061b;
    public static final s f59062c = new s(13);
    public static s d;
    public final int f59063a;

    public s(int i7) {
        this.f59063a = i7;
    }

    public static MediaCodec b0(b8 b8Var) {
        String str = ((u2.o) b8Var.f341a).f57770a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] k0(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            g2.b bVar = (g2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ja.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a10.putByteArray(g2.b.f12785x, byteArrayOutputStream.toByteArray());
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

    public static Calendar m0() {
        if (d == null) {
            d = new s(27);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static boolean p0(t1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: w7.s.p0(t1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static y s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((l0) it.next()).f10186b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return r9.b(list);
    }

    @Override
    public void A(byte[] bArr, byte[] bArr2) {
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
    public byte[] D(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public void E(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public u2.l F(a8.b8 r6) {
        throw new UnsupportedOperationException("Method not decompiled: w7.s.F(a8.b8):u2.l");
    }

    @Override
    public boolean H1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public q2.p L(byte[] bArr, List list, int i7, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public int M() {
        return 1;
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
    public void O(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
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
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void Q1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public CharacterStyle R1(q1 q1Var) {
        return null;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean T1(q1 q1Var, gj gjVar) {
        return false;
    }

    @Override
    public int U0() {
        return 352321535;
    }

    @Override
    public boolean V0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public b7.d W(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        int q10 = cVar.q(context, str, true);
        dVar.f2949b = q10;
        if (q10 != 0) {
            dVar.f2950c = 1;
            return dVar;
        }
        int D = cVar.D(context, str);
        dVar.f2948a = D;
        if (D != 0) {
            dVar.f2950c = -1;
        }
        return dVar;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean Y(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public float Y0() {
        return -1.0f;
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public float Z0() {
        return -1.0f;
    }

    @Override
    public boolean Z1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean a0(q1 q1Var) {
        return false;
    }

    @Override
    public void b(cb cbVar, na naVar, la laVar, oa oaVar) {
        r1.g gVar = new r1.g(cbVar, cb.IN_OUT_OFFSET_Y, cbVar.getHeight());
        gVar.f55748m.a(0.8f);
        gVar.f55748m.b(400.0f);
        gVar.a(new pa(laVar, 1));
        gVar.b(new ab(oaVar, cbVar, 0));
        gVar.h();
        naVar.run();
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public dr0 c2() {
        return null;
    }

    @Override
    public p0 d(Class cls) {
        return new z1.b();
    }

    @Override
    public void d0(vg vgVar) {
        vgVar.run();
    }

    @Override
    public p0 e(Class cls, y1.b bVar) {
        return d(cls);
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean f1(gj gjVar) {
        return y0.a(gjVar);
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public boolean h2(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public Object i(r7 r7Var) {
        switch (this.f59063a) {
            case 14:
                return new ob.c(r7Var.I(ob.b.class));
            default:
                return new ob.b(r7Var.c(nb.a.class));
        }
    }

    @Override
    public int i0(q1 q1Var) {
        return 0;
    }

    @Override
    public Exception l(Status status) {
        return q6.m.l(status);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public q2.q n() {
        throw new IllegalStateException();
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public StackTraceElement[] q(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
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
    public k2.b s(byte[] bArr) {
        throw new IllegalStateException();
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
    public byte[] v() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public boolean v2(int i7) {
        return false;
    }

    @Override
    public String x(long j3) {
        return null;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public void y(cb cbVar, na naVar, dg dgVar, il ilVar) {
        cbVar.setInOutOffset(cbVar.getMeasuredHeight());
        ilVar.accept(Float.valueOf(cbVar.getTranslationY()));
        r1.g gVar = new r1.g((Object) cbVar, cb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.f55748m.a(0.8f);
        gVar.f55748m.b(400.0f);
        gVar.a(new v0(2, cbVar, dgVar));
        gVar.b(new ab(ilVar, cbVar, 1));
        gVar.h();
        naVar.run();
    }

    @Override
    public boolean y0(gj gjVar) {
        return true;
    }

    @Override
    public boolean z1(q1 q1Var, int i7) {
        return false;
    }

    @Override
    public i9 z2() {
        return null;
    }

    public s() {
        this.f59063a = 12;
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
    public void i1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void t() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C(byte[] bArr) {
    }

    @Override
    public void C1(q1 q1Var) {
    }

    @Override
    public void F0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void I0(q1 q1Var) {
    }

    @Override
    public void J(dj djVar) {
    }

    @Override
    public void L1(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void N0(q1 q1Var) {
    }

    @Override
    public void O1(gj gjVar) {
    }

    @Override
    public void P(gj gjVar) {
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void W0(q1 q1Var) {
    }

    @Override
    public void X0(q1 q1Var) {
    }

    @Override
    public void e0(int i7) {
    }

    @Override
    public void f(cf cfVar) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void j0(q1 q1Var) {
    }

    @Override
    public void j2(q1 q1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public void q2(q1 q1Var) {
    }

    @Override
    public void r(q1 q1Var) {
    }

    @Override
    public void u(q1 q1Var) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void z0(q1 q1Var) {
    }

    @Override
    public void F1(q1 q1Var, boolean z10) {
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void I(byte[] bArr, m2.j jVar) {
    }

    @Override
    public void I1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(q1 q1Var, int i7) {
    }

    @Override
    public void O0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void X1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void a2(q1 q1Var, l10 l10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(q1 q1Var, long j3) {
    }

    @Override
    public void p1(q1 q1Var, int i7) {
    }

    @Override
    public void B0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void C0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void H0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void t1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void y2(q1 q1Var, int i7, int i10) {
    }

    @Override
    public void Y1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void onScrollLimit(int i7, int i10, int i11, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i7, int i10, int i11, int i12) {
    }

    @Override
    public void u0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void w0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void g2(q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
