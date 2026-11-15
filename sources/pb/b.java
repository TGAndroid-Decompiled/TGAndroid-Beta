package pb;

import a8.r7;
import ai.k0;
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
import c8.b1;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.u;
import f3.b0;
import hi.l0;
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
import org.telegram.messenger.ba;
import org.telegram.messenger.bb;
import org.telegram.messenger.ca;
import org.telegram.messenger.dj;
import org.telegram.messenger.gj;
import org.telegram.messenger.l10;
import org.telegram.messenger.o2;
import org.telegram.messenger.ta;
import org.telegram.messenger.ua;
import org.telegram.messenger.va;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.ya;
import org.telegram.messenger.za;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.dr0;
import org.xml.sax.Attributes;
public final class b implements a4.h, c4.k, eg.a, f3.g, fg.a, ia.e, fm0, com.google.android.gms.common.api.internal.q, u9.d, q5.b, IMapsProvider, gh.a, l1, q0, OnFailureListener, s2.t, u4.c, x5.a {
    public final int f54940a;

    public b(int i7) {
        this.f54940a = i7;
    }

    public static ia.b D0(w7.s sVar) {
        return new ia.b(System.currentTimeMillis() + 3600000, new b7.l(8), new ia.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static bg.n E0(Editable editable, int i7) {
        Object[] objArr = (bg.n[]) editable.getSpans(0, editable.length(), bg.n.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i10 = length - 1;
                if (editable.getSpanFlags(objArr[i10]) == 17) {
                    bg.n nVar = objArr[i10];
                    if (nVar.f3312a == i7) {
                        return nVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean G0(boolean z10, String str, Editable editable, Attributes attributes) {
        int i7;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a10 = bg.m.a("data-document-id", attributes);
                if (a10 != null) {
                    editable.setSpan(new p5(Long.parseLong(a10), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), p5.class);
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
                Object obj2 = (p5) obj;
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
                editable.setSpan(new bg.n(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object E0 = E0(editable, 0);
            if (E0 != null) {
                int spanStart2 = editable.getSpanStart(E0);
                editable.removeSpan(E0);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(E0, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a11 = bg.m.a("language", attributes);
                if (a11 == null) {
                    a11 = bg.m.a("lang", attributes);
                }
                if (a11 == null) {
                    a11 = bg.m.a("lng", attributes);
                }
                editable.setSpan(new bg.n(a11), editable.length(), editable.length(), 17);
                return true;
            }
            Object E02 = E0(editable, 1);
            if (E02 != null) {
                int spanStart3 = editable.getSpanStart(E02);
                editable.removeSpan(E02);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(E02, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i11 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a12 = bg.m.a("class", attributes);
                    if (bg.m.a("data-collapsed", attributes) != null || (a12 != null && a12.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i11 = 2;
                    }
                    editable.setSpan(new bg.n(i11), editable.length(), editable.length(), 17);
                    return true;
                }
                bg.n[] nVarArr = (bg.n[]) editable.getSpans(0, editable.length(), bg.n.class);
                for (int length2 = nVarArr.length - 1; length2 >= 0; length2--) {
                    bg.n nVar = nVarArr[length2];
                    if (editable.getSpanFlags(nVar) == 17 && ((i7 = nVar.f3312a) == 2 || i7 == 3)) {
                        obj = nVar;
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
                    editable.setSpan(new bg.n(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object E03 = E0(editable, 3);
                if (E03 != null) {
                    int spanStart5 = editable.getSpanStart(E03);
                    editable.removeSpan(E03);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(E03, spanStart5, editable.length(), 33);
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
    public int A2() {
        return 0;
    }

    @Override
    public int D1() {
        return 0;
    }

    @Override
    public e2 F() {
        return null;
    }

    @Override
    public boolean H1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void I(int i7, Object obj) {
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
    public boolean J1() {
        return false;
    }

    @Override
    public boolean L(u uVar) {
        return false;
    }

    @Override
    public boolean L0(long j3) {
        return false;
    }

    @Override
    public int M0() {
        return 0;
    }

    @Override
    public int M1(int i7, int i10, int i11) {
        eg.a aVar;
        if (i10 == 6) {
            aVar = eg.a.f10644p;
        } else if (i10 > i11) {
            aVar = eg.a.f10641l;
        } else if (i10 < i11) {
            aVar = eg.a.f10642m;
        } else {
            aVar = eg.a.f10643o;
        }
        return aVar.M1(i7, i10, i11);
    }

    @Override
    public int O(u uVar) {
        return 1;
    }

    @Override
    public void P0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        eg.a aVar;
        if (i7 == 6) {
            aVar = eg.a.f10644p;
        } else if (i7 > i10) {
            aVar = eg.a.f10641l;
        } else if (i7 < i10) {
            aVar = eg.a.f10642m;
        } else {
            aVar = eg.a.f10643o;
        }
        aVar.P0(shortBuffer, i7, shortBuffer2, i10);
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
        return 0;
    }

    @Override
    public boolean V0(q1 q1Var, boolean z10) {
        return false;
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
    public b0 Y() {
        return new f3.t(-9223372036854775807L);
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
        int i7 = m7.c.f20523a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f20524a.transact(1, obtain, obtain2, 0);
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
    public ia.b d(w7.s sVar, JSONObject jSONObject) {
        return D0(sVar);
    }

    @Override
    public b3.q e(s2.p pVar, s2.m mVar) {
        return new s2.s(pVar, mVar);
    }

    @Override
    public c4.m f(u uVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
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
        switch (this.f54940a) {
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public Object mo24get() {
        switch (this.f54940a) {
            case 16:
                return new o5.q(Executors.newSingleThreadExecutor());
            default:
                qb.a aVar = new qb.a(28);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(l5.d.f19308a, new u5.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(l5.d.f19310c, new u5.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(u5.c.f57856b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(l5.d.f19309b, new u5.b(86400000L, 86400000L, unmodifiableSet));
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
        return 2131749196;
    }

    @Override
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
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
        a aVar = new a();
        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(9);
        ReferenceQueue referenceQueue = aVar.f54938a;
        Set set = aVar.f54939b;
        set.add(new m(aVar, referenceQueue, set, oVar));
        Thread thread = new Thread(new l(0, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public int i0(q1 q1Var) {
        return 0;
    }

    @Override
    public void initializeMaps(Context context) {
        synchronized (k8.b.class) {
            k8.b.a(context);
        }
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public xa loadRawResourceStyle(Context context, int i7) {
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
                    obj.f23462a = eVar;
                    return obj;
                }
            }
        } catch (IOException e10) {
            String obj2 = e10.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i7 + ": " + obj2);
        }
    }

    @Override
    public long m0(f3.p pVar) {
        return -1L;
    }

    @Override
    public ta newCameraUpdateLatLng(bb bbVar) {
        LatLng latLng = new LatLng(bbVar.f22677a, bbVar.f22678b);
        try {
            l8.a aVar = b1.f4210a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            Parcel o12 = aVar.o1(p12, 8);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ba(new gc.b(m12));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public ta newCameraUpdateLatLngBounds(va vaVar, int i7) {
        LatLngBounds latLngBounds = ((ca) vaVar).f22815a;
        try {
            l8.a aVar = b1.f4210a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLngBounds);
            p12.writeInt(i7);
            Parcel o12 = aVar.o1(p12, 10);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ba(new gc.b(m12));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public ta newCameraUpdateLatLngZoom(bb bbVar, float f10) {
        LatLng latLng = new LatLng(bbVar.f22677a, bbVar.f22678b);
        try {
            l8.a aVar = b1.f4210a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            p12.writeFloat(f10);
            Parcel o12 = aVar.o1(p12, 9);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ba(new gc.b(m12));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public ua onCreateCircleOptions() {
        gc.b bVar = new gc.b(28, false);
        ?? obj = new Object();
        obj.f20526a = null;
        obj.f20527b = 0.0d;
        obj.f20528c = 10.0f;
        obj.d = -16777216;
        obj.f20529e = 0;
        obj.f20530f = 0.0f;
        obj.h = true;
        obj.f20531n = false;
        obj.f20532r = null;
        bVar.f13134b = obj;
        return bVar;
    }

    @Override
    public wa onCreateLatLngBoundsBuilder() {
        ia.d dVar = new ia.d(23);
        m8.d dVar2 = new m8.d(0);
        dVar2.f20535b = Double.POSITIVE_INFINITY;
        dVar2.f20536c = Double.NEGATIVE_INFINITY;
        dVar2.d = Double.NaN;
        dVar2.f20537e = Double.NaN;
        dVar.f15881b = dVar2;
        return dVar;
    }

    @Override
    public ya onCreateMapView(Context context) {
        r7 r7Var = new r7(13, (byte) 0);
        r7Var.f617b = new k0(r7Var, context);
        return r7Var;
    }

    @Override
    public za onCreateMarkerOptions() {
        l0 l0Var = new l0(24);
        ?? obj = new Object();
        obj.f20543e = 0.5f;
        obj.f20544f = 1.0f;
        obj.f20545n = true;
        obj.f20546r = false;
        obj.f20547s = 0.0f;
        obj.f20548w = 0.5f;
        obj.f20549x = 0.0f;
        obj.f20550y = 1.0f;
        l0Var.f14544b = obj;
        return l0Var;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public boolean p0(t0 t0Var, float f10, float f11) {
        return false;
    }

    @Override
    public boolean p2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
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
    public long s() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public b3.q s0() {
        return new s2.s(s2.p.f56280n, null);
    }

    @Override
    public int t0() {
        return 0;
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
    public void y() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
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

    public b(m7.a aVar) {
        this.f54940a = 14;
    }

    @Override
    public void A0() {
    }

    @Override
    public void U1() {
    }

    @Override
    public void finish() {
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
    public void s2() {
    }

    @Override
    public void t() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void A(float f10) {
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C(t0 t0Var) {
    }

    @Override
    public void C1(q1 q1Var) {
    }

    @Override
    public void D(t2 t2Var) {
    }

    @Override
    public void E(t0 t0Var) {
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
    public void M(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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
    public void V(q1 q1Var) {
    }

    @Override
    public void W0(q1 q1Var) {
    }

    @Override
    public void X0(q1 q1Var) {
    }

    @Override
    public void b0(long j3) {
    }

    @Override
    public void d0(t0 t0Var) {
    }

    @Override
    public void e0(int i7) {
    }

    @Override
    public void j0(q1 q1Var) {
    }

    @Override
    public void j2(q1 q1Var) {
    }

    @Override
    public long l(long j3) {
        return j3;
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public void q(t0 t0Var) {
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
    public void v0(long j3) {
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
    public void k0(t0 t0Var, String str) {
    }

    @Override
    public void k1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void l2(q1 q1Var, long j3) {
    }

    @Override
    public void n(t0 t0Var, int i7) {
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
    public void W(t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void g0(t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
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
    public void v(t0 t0Var, int i7, int i10) {
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
    public void x0(t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
