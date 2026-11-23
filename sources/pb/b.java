package pb;

import a8.r7;
import ai.h0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import c8.e1;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.c0;
import hi.u0;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.aa;
import org.telegram.messenger.ab;
import org.telegram.messenger.ba;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.messenger.sa;
import org.telegram.messenger.ta;
import org.telegram.messenger.ua;
import org.telegram.messenger.va;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.ya;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fr0;
import org.xml.sax.Attributes;
import s2.u;
public final class b implements a4.h, c4.k, eg.a, f3.g, fg.a, ia.d, pm0, com.google.android.gms.common.api.internal.q, u9.d, q5.b, IMapsProvider, gh.a, m1, s0, OnFailureListener, u, u4.c, x5.a {
    public final int f55639a;

    public b(int i7) {
        this.f55639a = i7;
    }

    public static ia.b u0(w7.s sVar) {
        return new ia.b(System.currentTimeMillis() + 3600000, new b7.l(8), new ia.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static bg.o w0(Editable editable, int i7) {
        Object[] objArr = (bg.o[]) editable.getSpans(0, editable.length(), bg.o.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i10 = length - 1;
                if (editable.getSpanFlags(objArr[i10]) == 17) {
                    bg.o oVar = objArr[i10];
                    if (oVar.f3290a == i7) {
                        return oVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean y0(boolean z10, String str, Editable editable, Attributes attributes) {
        int i7;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a10 = bg.n.a("data-document-id", attributes);
                if (a10 != null) {
                    editable.setSpan(new x5(Long.parseLong(a10), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), x5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i10 = length - 1;
                        if (editable.getSpanFlags(spans[i10]) == 17) {
                            obj = spans[i10];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (x5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        } else if (str.equals("spoiler")) {
            if (z10) {
                editable.setSpan(new bg.o(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object w02 = w0(editable, 0);
            if (w02 != null) {
                int spanStart2 = editable.getSpanStart(w02);
                editable.removeSpan(w02);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(w02, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a11 = bg.n.a("language", attributes);
                if (a11 == null) {
                    a11 = bg.n.a("lang", attributes);
                }
                if (a11 == null) {
                    a11 = bg.n.a("lng", attributes);
                }
                editable.setSpan(new bg.o(a11), editable.length(), editable.length(), 17);
                return true;
            }
            Object w03 = w0(editable, 1);
            if (w03 != null) {
                int spanStart3 = editable.getSpanStart(w03);
                editable.removeSpan(w03);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(w03, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i11 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a12 = bg.n.a("class", attributes);
                    if (bg.n.a("data-collapsed", attributes) != null || (a12 != null && a12.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i11 = 2;
                    }
                    editable.setSpan(new bg.o(i11), editable.length(), editable.length(), 17);
                    return true;
                }
                bg.o[] oVarArr = (bg.o[]) editable.getSpans(0, editable.length(), bg.o.class);
                for (int length2 = oVarArr.length - 1; length2 >= 0; length2--) {
                    bg.o oVar = oVarArr[length2];
                    if (editable.getSpanFlags(oVar) == 17 && ((i7 = oVar.f3290a) == 2 || i7 == 3)) {
                        obj = oVar;
                        break;
                    }
                }
                if (obj != null) {
                    int spanStart4 = editable.getSpanStart(obj);
                    editable.removeSpan(obj);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(obj, spanStart4, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (str.equals("details")) {
                if (z10) {
                    editable.setSpan(new bg.o(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object w04 = w0(editable, 3);
                if (w04 != null) {
                    int spanStart5 = editable.getSpanStart(w04);
                    editable.removeSpan(w04);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(w04, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public float A1() {
        return 0.0f;
    }

    @Override
    public g2 B() {
        return null;
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
    public void E(int i7, Object obj) {
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
    public void E0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        eg.a aVar;
        if (i7 == 6) {
            aVar = eg.a.f10954p;
        } else if (i7 > i10) {
            aVar = eg.a.f10951l;
        } else if (i7 < i10) {
            aVar = eg.a.f10952m;
        } else {
            aVar = eg.a.f10953o;
        }
        aVar.E0(shortBuffer, i7, shortBuffer2, i10);
    }

    @Override
    public boolean F0(fj fjVar) {
        return true;
    }

    @Override
    public boolean G(e2.u uVar) {
        return false;
    }

    @Override
    public boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public int I(e2.u uVar) {
        return 1;
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        eg.a aVar;
        if (i10 == 6) {
            aVar = eg.a.f10954p;
        } else if (i10 > i11) {
            aVar = eg.a.f10951l;
        } else if (i10 < i11) {
            aVar = eg.a.f10952m;
        } else {
            aVar = eg.a.f10953o;
        }
        return aVar.M1(i7, i10, i11);
    }

    @Override
    public c0 N() {
        return new f3.t(-9223372036854775807L);
    }

    @Override
    public int Q0() {
        return 0;
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
    public float T0() {
        return -1.0f;
    }

    @Override
    public boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override
    public b3.r U() {
        return new s2.t(s2.q.f56980n, null);
    }

    @Override
    public float V0() {
        return -1.0f;
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
    public long a() {
        return 0L;
    }

    @Override
    public long a0(f3.p pVar) {
        return -1L;
    }

    @Override
    public boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        m7.d dVar = (m7.d) ((m7.e) obj).n();
        e7.b bVar = new e7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i7 = m7.c.f20977a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f20978a.transact(1, obtain, obtain2, 0);
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
    public boolean b0() {
        return false;
    }

    @Override
    public Object c(r7 r7Var) {
        a aVar = new a();
        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(9);
        ReferenceQueue referenceQueue = aVar.f55637a;
        Set set = aVar.f55638b;
        set.add(new m(aVar, referenceQueue, set, oVar));
        Thread thread = new Thread(new l(0, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
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
    public c4.m f(e2.u uVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void f0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 <= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(i5.c.i(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i11;
            int ceil = ((int) Math.ceil((i10 / i7) * remaining)) - remaining;
            float f10 = remaining;
            float f11 = f10 / f10;
            float f12 = ceil;
            float f13 = f12 / f12;
            while (remaining > 0 && ceil > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f11 = remaining / f10;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    }
                    ceil--;
                    f13 = ceil / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public boolean f2(long j3) {
        return false;
    }

    @Override
    public ia.b g(w7.s sVar, JSONObject jSONObject) {
        return u0(sVar);
    }

    @Override
    public boolean g0(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override
    public boolean g1(fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override
    public Object mo23get() {
        switch (this.f55639a) {
            case 16:
                return new o5.q(Executors.newSingleThreadExecutor());
            default:
                qb.a aVar = new qb.a(28);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(l5.d.f19769a, new u5.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(l5.d.f19771c, new u5.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(u5.c.f58549b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(l5.d.f19770b, new u5.b(86400000L, 86400000L, unmodifiableSet));
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
    public int getInstallMapsString() {
        return 2131749003;
    }

    @Override
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override
    public jh.a h0() {
        return null;
    }

    @Override
    public boolean i() {
        switch (this.f55639a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public void initializeMaps(Context context) {
        synchronized (k8.a.class) {
            k8.a.a(context);
        }
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
    public wa loadRawResourceStyle(Context context, int i7) {
        InputStream openRawResource = context.getResources().openRawResource(i7);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    x6.b.a(openRawResource);
                    x6.b.a(byteArrayOutputStream);
                    m8.e eVar = new m8.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    ?? obj = new Object();
                    obj.f23780a = eVar;
                    return obj;
                }
            }
        } catch (IOException e10) {
            String obj2 = e10.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i7 + ": " + obj2);
        }
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public sa newCameraUpdateLatLng(ab abVar) {
        LatLng latLng = new LatLng(abVar.f22962a, abVar.f22963b);
        try {
            l8.a aVar = e1.f4541a;
            q6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            Parcel o12 = aVar.o1(p12, 8);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new aa(new h6.o(m12));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public sa newCameraUpdateLatLngBounds(ua uaVar, int i7) {
        LatLngBounds latLngBounds = ((ba) uaVar).f23176a;
        try {
            l8.a aVar = e1.f4541a;
            q6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLngBounds);
            p12.writeInt(i7);
            Parcel o12 = aVar.o1(p12, 10);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new aa(new h6.o(m12));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public sa newCameraUpdateLatLngZoom(ab abVar, float f10) {
        LatLng latLng = new LatLng(abVar.f22962a, abVar.f22963b);
        try {
            l8.a aVar = e1.f4541a;
            q6.m.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            p12.writeFloat(f10);
            Parcel o12 = aVar.o1(p12, 9);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new aa(new h6.o(m12));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public long o() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public ta onCreateCircleOptions() {
        h6.o oVar = new h6.o(25, false);
        ?? obj = new Object();
        obj.f20980a = null;
        obj.f20981b = 0.0d;
        obj.f20982c = 10.0f;
        obj.d = -16777216;
        obj.f20983e = 0;
        obj.f20984f = 0.0f;
        obj.h = true;
        obj.f20985n = false;
        obj.f20986r = null;
        oVar.f13936b = obj;
        return oVar;
    }

    @Override
    public va onCreateLatLngBoundsBuilder() {
        u0 u0Var = new u0(27);
        m8.d dVar = new m8.d(0);
        dVar.f20989b = Double.POSITIVE_INFINITY;
        dVar.f20990c = Double.NEGATIVE_INFINITY;
        dVar.d = Double.NaN;
        dVar.f20991e = Double.NaN;
        u0Var.f15482b = dVar;
        return u0Var;
    }

    @Override
    public xa onCreateMapView(Context context) {
        r7 r7Var = new r7(13, (byte) 0);
        r7Var.f616b = new h0(r7Var, context);
        return r7Var;
    }

    @Override
    public ya onCreateMarkerOptions() {
        j6.r rVar = new j6.r(21);
        ?? obj = new Object();
        obj.f20997e = 0.5f;
        obj.f20998f = 1.0f;
        obj.f20999n = true;
        obj.f21000r = false;
        obj.f21001s = 0.0f;
        obj.f21002w = 0.5f;
        obj.f21003x = 0.0f;
        obj.f21004y = 1.0f;
        rVar.f17372b = obj;
        return rVar;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
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
    public void u() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean v0(x5 x5Var) {
        return false;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public int x2() {
        return 0;
    }

    @Override
    public boolean y2(int i7) {
        return false;
    }

    @Override
    public b3.r z(s2.q qVar, s2.n nVar) {
        return new s2.t(qVar, nVar);
    }

    @Override
    public boolean z1(r1 r1Var, int i7) {
        return false;
    }

    public b(m7.a aVar) {
        this.f55639a = 14;
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
    public void finish() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void p() {
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
    public void H(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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
    public void O1(fj fjVar) {
    }

    @Override
    public void Q(long j3) {
    }

    @Override
    public void R(r1 r1Var) {
    }

    @Override
    public void S(v0 v0Var) {
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
    public long h(long j3) {
        return j3;
    }

    @Override
    public void k2(r1 r1Var) {
    }

    @Override
    public void l(v0 v0Var) {
    }

    @Override
    public void l0(long j3) {
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
    public void r(v0 v0Var) {
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
    public void v(float f10) {
    }

    @Override
    public void w(v0 v0Var) {
    }

    @Override
    public void y(u2 u2Var) {
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
    public void V(v0 v0Var, String str) {
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
    public void j(v0 v0Var, int i7) {
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
    public void K(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override
    public void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void T(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void n(v0 v0Var, int i7, int i10) {
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
    public void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void s0(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
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
}
