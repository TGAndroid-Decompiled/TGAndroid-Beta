package w7;

import a8.b8;
import a8.ma;
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
import c8.u9;
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
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.xa;
import org.telegram.ui.fr0;
public final class s implements androidx.car.app.messaging.model.b, b7.e, com.google.android.gms.common.api.internal.r, eg.a, fg.a, ri, ja.a, SuccessContinuation, u9.d, gh.a, jb, m1, q2.q, r0.q, u2.k, y9.a, s0 {
    public static s f59754b;
    public static final s f59755c = new s(13);
    public static s d;
    public final int f59756a;

    public s(int i7) {
        this.f59756a = i7;
    }

    public static MediaCodec Q(b8 b8Var) {
        String str = ((u2.o) b8Var.f341a).f58463a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static byte[] U(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            g2.b bVar = (g2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ma.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a10.putByteArray(g2.b.f13093x, byteArrayOutputStream.toByteArray());
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

    public static Calendar V() {
        if (d == null) {
            d = new s(27);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static boolean a0(t1.c r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: w7.s.a0(t1.c, android.text.Editable, int, int, boolean):boolean");
    }

    public static y g0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((l0) it.next()).f10494b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return u9.b(list);
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public j9 B2() {
        return null;
    }

    @Override
    public String D(long j3) {
        return null;
    }

    @Override
    public int D0() {
        return 0;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public q2.o E(byte[] bArr, List list, int i7, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
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
    public boolean F0(fj fjVar) {
        return true;
    }

    @Override
    public int G() {
        return 1;
    }

    @Override
    public void H(kb kbVar, va vaVar, ng ngVar, pl plVar) {
        kbVar.setInOutOffset(kbVar.getMeasuredHeight());
        plVar.accept(Float.valueOf(kbVar.getTranslationY()));
        r1.g gVar = new r1.g((Object) kbVar, kb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.f56446m.a(0.8f);
        gVar.f56446m.b(400.0f);
        gVar.a(new y0(2, kbVar, ngVar));
        gVar.b(new ib(plVar, kbVar, 1));
        gVar.h();
        vaVar.run();
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void I(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public b7.d K(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        int l10 = cVar.l(context, str, true);
        dVar.f2915b = l10;
        if (l10 != 0) {
            dVar.f2916c = 1;
            return dVar;
        }
        int y10 = cVar.y(context, str);
        dVar.f2914a = y10;
        if (y10 != 0) {
            dVar.f2916c = -1;
        }
        return dVar;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        return (i7 / i10) * i11;
    }

    @Override
    public boolean N(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public int Q0() {
        return 352321535;
    }

    @Override
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override
    public boolean R0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override
    public void S(fh fhVar) {
        fhVar.run();
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public float T0() {
        return -1.0f;
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override
    public float V0() {
        return -1.0f;
    }

    @Override
    public boolean V1() {
        return false;
    }

    @Override
    public boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public int X1() {
        return 0;
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public boolean Z(r1 r1Var) {
        return false;
    }

    @Override
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void b(kb kbVar, va vaVar, ta taVar, wa waVar) {
        r1.g gVar = new r1.g(kbVar, kb.IN_OUT_OFFSET_Y, kbVar.getHeight());
        gVar.f56446m.a(0.8f);
        gVar.f56446m.b(400.0f);
        gVar.a(new xa(taVar, 1));
        gVar.b(new ib(waVar, kbVar, 0));
        gVar.h();
        vaVar.run();
    }

    @Override
    public boolean b0() {
        return false;
    }

    @Override
    public Object c(r7 r7Var) {
        switch (this.f59756a) {
            case 14:
                return new ob.c(r7Var.L(ob.b.class));
            default:
                return new ob.b(r7Var.c(nb.a.class));
        }
    }

    @Override
    public boolean c1(r1 r1Var, boolean z10) {
        return false;
    }

    @Override
    public fr0 c2() {
        return null;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int e0() {
        return 0;
    }

    @Override
    public Exception f(Status status) {
        return q6.m.m(status);
    }

    @Override
    public void f0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
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
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public q2.p g() {
        throw new IllegalStateException();
    }

    @Override
    public boolean g1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public jh.a h0() {
        return null;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public int i0() {
        return 872415231;
    }

    @Override
    public k2.b j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean j0(r1 r1Var) {
        return false;
    }

    @Override
    public boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String k(r1 r1Var) {
        return null;
    }

    @Override
    public boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public byte[] l() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void n(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public p0 o(Class cls) {
        return new z1.b();
    }

    @Override
    public int p0(r1 r1Var) {
        return 0;
    }

    @Override
    public boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean r0() {
        return false;
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
    public byte[] u(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean v0(x5 x5Var) {
        return false;
    }

    @Override
    public void w(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public int x2() {
        return 1711276032;
    }

    @Override
    public u2.l y(a8.b8 r6) {
        throw new UnsupportedOperationException("Method not decompiled: w7.s.y(a8.b8):u2.l");
    }

    @Override
    public boolean y2(int i7) {
        return false;
    }

    @Override
    public p0 z(Class cls, y1.b bVar) {
        return o(cls);
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        return false;
    }

    public s() {
        this.f59756a = 12;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void B0() {
    }

    @Override
    public void H0() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void e() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l0() {
    }

    @Override
    public void p() {
    }

    @Override
    public void release() {
    }

    @Override
    public void u2() {
    }

    @Override
    public void x() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void A(r1 r1Var) {
    }

    @Override
    public void C(r1 r1Var) {
    }

    @Override
    public void C1(r1 r1Var) {
    }

    @Override
    public void F(r1 r1Var) {
    }

    @Override
    public void G0(r1 r1Var) {
    }

    @Override
    public void J(r1 r1Var) {
    }

    @Override
    public void L0(r1 r1Var) {
    }

    @Override
    public void L1(r1 r1Var) {
    }

    @Override
    public void M(r1 r1Var) {
    }

    @Override
    public void N0(r1 r1Var) {
    }

    @Override
    public void O(cj cjVar) {
    }

    @Override
    public void O0(Object obj) {
    }

    @Override
    public void O1(fj fjVar) {
    }

    @Override
    public void R(r1 r1Var) {
    }

    @Override
    public void S0(r1 r1Var) {
    }

    @Override
    public void W(fj fjVar) {
    }

    @Override
    public void d0(r1 r1Var) {
    }

    @Override
    public void e1(r1 r1Var) {
    }

    @Override
    public void f1(r1 r1Var) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void k2(r1 r1Var) {
    }

    @Override
    public void m0(int i7) {
    }

    @Override
    public void q0(r1 r1Var) {
    }

    @Override
    public void q2(r1 r1Var) {
    }

    @Override
    public void r(byte[] bArr) {
    }

    @Override
    public void s(r1 r1Var) {
    }

    @Override
    public void t(r1 r1Var) {
    }

    @Override
    public void t0(String str) {
    }

    @Override
    public void v(i5 i5Var) {
    }

    @Override
    public void B(byte[] bArr, m2.i iVar) {
    }

    @Override
    public void F1(r1 r1Var, boolean z10) {
    }

    @Override
    public void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K1(r1 r1Var, int i7) {
    }

    @Override
    public void L(r1 r1Var, p2 p2Var) {
    }

    @Override
    public void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void b2(r1 r1Var, h10 h10Var) {
    }

    @Override
    public void e2(String str, String str2) {
    }

    @Override
    public void l2(r1 r1Var, long j3) {
    }

    @Override
    public void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(r1 r1Var, int i7) {
    }

    @Override
    public void A2(r1 r1Var, int i7, int i10) {
    }

    @Override
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void J0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void o0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void t1(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void x0(r1 r1Var, float f10, float f11) {
    }

    @Override
    public void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void onScrollLimit(int i7, int i10, int i11, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i7, int i10, int i11, int i12) {
    }

    @Override
    public void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
