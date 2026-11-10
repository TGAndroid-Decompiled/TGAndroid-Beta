package sa;

import a8.ia;
import a8.r7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.emoji2.text.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h9.i0;
import hi.y3;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wf;
import org.telegram.ui.ir0;
import org.telegram.ui.ix;
import pb.l;
import s2.m;
import s2.s;
import s2.t;
public final class d implements SuccessContinuation, androidx.car.app.messaging.model.b, b7.e, q, eg.a, fg.a, j2.g, gh.a, p, u9.d, q5.b, eb, l1, q0, OnFailureListener, t, u4.c {
    public static d f55003b;
    public final int f55004a;

    public d(int i7) {
        this.f55004a = i7;
    }

    public static byte[] w0(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            g2.b bVar = (g2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ia.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a10.putByteArray(g2.b.f13435x, byteArrayOutputStream.toByteArray());
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

    @Override
    public int A() {
        return 872415231;
    }

    @Override
    public void B(fb fbVar, qa qaVar, wf wfVar, al alVar) {
        fbVar.setInOutOffset(fbVar.getMeasuredHeight());
        alVar.accept(Float.valueOf(fbVar.getTranslationY()));
        r1.g gVar = new r1.g((Object) fbVar, fb.IN_OUT_OFFSET_Y, 0.0f);
        gVar.f54279m.a(0.8f);
        gVar.f54279m.b(400.0f);
        gVar.a(new y3(1, fbVar, wfVar));
        gVar.b(new db(alVar, fbVar, 1));
        gVar.h();
        qaVar.run();
    }

    @Override
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public int C0() {
        return 0;
    }

    @Override
    public CharacterStyle C1(q1 q1Var) {
        return null;
    }

    @Override
    public boolean E1(q1 q1Var, ij ijVar) {
        return false;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
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
                shortBuffer2.put(pb.b.d1(s5, s9));
            }
        }
    }

    @Override
    public b3.q I(s2.p pVar, m mVar) {
        return new s(pVar, mVar);
    }

    @Override
    public boolean J0(long j3) {
        return false;
    }

    @Override
    public boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void L() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public int M() {
        return 0;
    }

    @Override
    public ir0 N1() {
        return null;
    }

    @Override
    public int O() {
        return 352321535;
    }

    @Override
    public boolean O0(q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public boolean Q1(long j3) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public int R0() {
        return 0;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean W0(ij ijVar) {
        return f1.a(ijVar);
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public b3.q Y() {
        return new s(s2.p.f54726n, null);
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0(q1 q1Var) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        m7.d dVar = (m7.d) ((m7.e) obj).n();
        e7.b bVar = new e7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i7 = m7.c.f19931a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f19932a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public long b() {
        return 0L;
    }

    @Override
    public boolean b0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void c(fb fbVar, qa qaVar, oa oaVar, ra raVar) {
        r1.g gVar = new r1.g(fbVar, fb.IN_OUT_OFFSET_Y, fbVar.getHeight());
        gVar.f54279m.a(0.8f);
        gVar.f54279m.b(400.0f);
        gVar.a(new sa(oaVar, 1));
        gVar.b(new db(raVar, fbVar, 0));
        gVar.h();
        qaVar.run();
    }

    @Override
    public j2.h createDataSource() {
        return new j2.c(false);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public Object e(r7 r7Var) {
        pb.a aVar = new pb.a();
        n nVar = new n(9);
        ReferenceQueue referenceQueue = aVar.f53532a;
        Set set = aVar.f53533b;
        set.add(new l(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new ix(referenceQueue, set, false, 1), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public int e1() {
        return 1711276032;
    }

    @Override
    public Exception f(Status status) {
        return q6.m.l(status);
    }

    @Override
    public b7.d f0(Context context, String str, b7.c cVar) {
        b7.d dVar = new b7.d();
        int m10 = cVar.m(context, str, true);
        dVar.f2992b = m10;
        if (m10 != 0) {
            dVar.f2993c = 1;
            return dVar;
        }
        int q10 = cVar.q(context, str);
        dVar.f2991a = q10;
        if (q10 != 0) {
            dVar.f2993c = -1;
        }
        return dVar;
    }

    @Override
    public boolean g() {
        switch (this.f55004a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean g2(int i7) {
        return false;
    }

    @Override
    public Object mo24get() {
        switch (this.f55004a) {
            case 16:
                return new o5.p(Executors.newSingleThreadExecutor());
            default:
                nb.a aVar = new nb.a(28);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(l5.d.f18178a, new u5.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(l5.d.f18180c, new u5.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(u5.c.f56357b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(l5.d.f18179b, new u5.b(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= l5.d.values().length) {
                                    new HashMap();
                                    return new u5.a(aVar, hashMap);
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
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public int h0(q1 q1Var) {
        return 0;
    }

    @Override
    public float j0() {
        return -1.0f;
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public j9 k2() {
        return null;
    }

    @Override
    public void l0(int i7, Object obj) {
        String str;
        switch (i7) {
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
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public boolean n0(q5 q5Var) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public float o0() {
        return -1.0f;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public boolean p1(q1 q1Var, int i7) {
        return false;
    }

    @Override
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 >= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(jg.g.j(i11, "Illegal use of DownsampleAudioResampler. Channels:"));
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
    public boolean r0(t0 t0Var, float f10, float f11) {
        return false;
    }

    @Override
    public f2 t() {
        return null;
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public boolean u1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public float v0() {
        return 0.0f;
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public boolean x0(ij ijVar) {
        return true;
    }

    @Override
    public String y(long j3) {
        return null;
    }

    @Override
    public int z1(int i7, int i10, int i11) {
        return (i7 / i10) * i11;
    }

    public d(Object obj, int i7) {
        this.f55004a = i7;
    }

    @Override
    public void F1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void u() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(ij ijVar) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void E(long j3) {
    }

    @Override
    public void F(t0 t0Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void J(fj fjVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(ij ijVar) {
    }

    @Override
    public void P0(q1 q1Var) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void U1(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void c2(q1 q1Var) {
    }

    @Override
    public void d0(int i7) {
    }

    @Override
    public void i0(q1 q1Var) {
    }

    @Override
    public void l(t0 t0Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public void q(t0 t0Var) {
    }

    @Override
    public void r(q1 q1Var) {
    }

    @Override
    public void r1(q1 q1Var) {
    }

    @Override
    public void s(t0 t0Var) {
    }

    @Override
    public void v(q1 q1Var) {
    }

    @Override
    public void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void x(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void y1(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void K1(q1 q1Var, o10 o10Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(String str, String str2) {
    }

    @Override
    public void W1(q1 q1Var, long j3) {
    }

    @Override
    public void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void c0(t0 t0Var, String str) {
    }

    @Override
    public void g1(q1 q1Var, int i7) {
    }

    @Override
    public void i(t0 t0Var, int i7) {
    }

    @Override
    public void s1(q1 q1Var, boolean z9) {
    }

    @Override
    public void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void x1(q1 q1Var, int i7) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void D(t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void E0(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override
    public void W(t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void g0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j2(q1 q1Var, int i7, int i10) {
    }

    @Override
    public void m(t0 t0Var, int i7, int i10) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q1(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void u0(q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override
    public void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void t0(t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
