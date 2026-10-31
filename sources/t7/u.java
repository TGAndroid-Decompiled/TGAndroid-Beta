package t7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.x;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.firebase.components.ComponentRegistrar;
import ig.i1;
import ig.s1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ab;
import org.telegram.messenger.c20;
import org.telegram.messenger.cb;
import org.telegram.messenger.da;
import org.telegram.messenger.ea;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
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
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.o5;
import org.telegram.ui.qs0;
import v7.t7;
public class u implements s0, wg.a, i5.e, r9.e, r9.d, s1, IMapsProvider, l1, n5.b, r4.c, u5.a, uf.a, v2.m, vf.a, y9.c, z3.k {
    public static u f48559b;
    public final int f48560a;

    public u(int i10) {
        this.f48560a = i10;
    }

    @Override
    public boolean A1(q1 q1Var, jj jjVar) {
        return false;
    }

    @Override
    public long C() {
        throw new NoSuchElementException();
    }

    public Signature[] D(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public int E() {
        switch (this.f48560a) {
            case 3:
                return 352321535;
            default:
                return 0;
        }
    }

    @Override
    public p0 E0(Class cls, v1.b bVar) {
        return d(cls);
    }

    @Override
    public boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean F(x xVar) {
        String str = xVar.f2423s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public qs0 H1() {
        return null;
    }

    @Override
    public boolean I0(long j10) {
        return false;
    }

    @Override
    public Object K(bh.d dVar) {
        switch (this.f48560a) {
            case 6:
                return new jb.h();
            case 7:
                jb.g gVar = (jb.g) dVar.b(jb.g.class);
                synchronized (s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        s.c(new Object());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                }
                return new hb.a(0);
            default:
                return new Object();
        }
    }

    @Override
    public boolean K1(long j10) {
        return false;
    }

    @Override
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(i0.a.i(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
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
    public boolean M0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public float N() {
        switch (this.f48560a) {
            case 3:
                return -1.0f;
            default:
                return -1.0f;
        }
    }

    @Override
    public boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(q1 q1Var) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean S0(jj jjVar) {
        return f1.a(jjVar);
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public float X() {
        switch (this.f48560a) {
            case 3:
                return -1.0f;
            default:
                return -1.0f;
        }
    }

    @Override
    public zg.a Y() {
        return null;
    }

    @Override
    public boolean Z(q1 q1Var) {
        return false;
    }

    @Override
    public boolean a0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (r9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f46420a;
            if (str != null) {
                aVar = new r9.a(str, aVar.f46421b, aVar.f46422c, aVar.d, aVar.e, new ag.m(11, str, aVar), aVar.f46424g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public float b0() {
        switch (this.f48560a) {
            case 3:
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c2(int i10) {
        return false;
    }

    @Override
    public p0 d(Class cls) {
        return new m0(true);
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public String e() {
        return null;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(q1 q1Var) {
        return 0;
    }

    @Override
    public long g() {
        return System.currentTimeMillis();
    }

    @Override
    public l9 g2() {
        return null;
    }

    @Override
    public Object get() {
        u uVar = new u(21);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(i5.d.f8206a, new r5.c(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(i5.d.f8208c, new r5.c(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(r5.d.f46326b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(i5.d.f8207b, new r5.c(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= i5.d.values().length) {
                            new HashMap();
                            return new r5.b(uVar, hashMap);
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
    public int getInstallMapsString() {
        return 2131749205;
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
    public int h0() {
        switch (this.f48560a) {
            case 3:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public void initializeMaps(Context context) {
        synchronized (h8.a.class) {
            h8.a.b(context);
        }
    }

    @Override
    public int j0() {
        switch (this.f48560a) {
            case 3:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public long k() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean k1(q1 q1Var, int i10) {
        return false;
    }

    @Override
    public ya loadRawResourceStyle(Context context, int i10) {
        InputStream openRawResource = context.getResources().openRawResource(i10);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    u6.b.a(openRawResource);
                    u6.b.a(byteArrayOutputStream);
                    j8.d dVar = new j8.d(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    ?? obj = new Object();
                    obj.f15852a = dVar;
                    return obj;
                }
            }
        } catch (IOException e) {
            String obj2 = e.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + obj2);
        }
    }

    @Override
    public z3.m m(x xVar) {
        String str = xVar.f2423s;
        List list = xVar.v;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new b4.i(list);
                case 1:
                    return new xa.n(2);
                case 2:
                    return new k6.h(27);
                case 3:
                    return new n4.q(23);
                case 4:
                    return new g4.a(list);
                case 5:
                    return new d4.a(list);
                case 6:
                    return new h4.b(list);
                case 7:
                    return new e4.a();
                case '\b':
                    return new f4.e();
            }
        }
        throw new IllegalArgumentException(sc.e.h("Unsupported MIME type: ", str));
    }

    @Override
    public boolean m0(o5 o5Var) {
        return false;
    }

    @Override
    public int n0() {
        switch (this.f48560a) {
            case 3:
                return 1711276032;
            default:
                return 0;
        }
    }

    @Override
    public ua newCameraUpdateLatLng(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.f14971a, cbVar.f14972b);
        try {
            i8.a aVar = t7.f50614a;
            n6.l.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            s7.b.b(P0, latLng);
            Parcel O0 = aVar.O0(P0, 8);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new da(new za.c(M0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ua newCameraUpdateLatLngBounds(wa waVar, int i10) {
        LatLngBounds latLngBounds = ((ea) waVar).f15374a;
        try {
            i8.a aVar = t7.f50614a;
            n6.l.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            s7.b.b(P0, latLngBounds);
            P0.writeInt(i10);
            Parcel O0 = aVar.O0(P0, 10);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new da(new za.c(M0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ua newCameraUpdateLatLngZoom(cb cbVar, float f7) {
        LatLng latLng = new LatLng(cbVar.f14971a, cbVar.f14972b);
        try {
            i8.a aVar = t7.f50614a;
            n6.l.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            s7.b.b(P0, latLng);
            P0.writeFloat(f7);
            Parcel O0 = aVar.O0(P0, 9);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new da(new za.c(M0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public va onCreateCircleOptions() {
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.f9707a = null;
        obj2.f9708b = 0.0d;
        obj2.f9709c = 10.0f;
        obj2.d = -16777216;
        obj2.e = 0;
        obj2.f9710f = 0.0f;
        obj2.h = true;
        obj2.f9711n = false;
        obj2.f9712r = null;
        obj.f10700a = obj2;
        return obj;
    }

    @Override
    public xa onCreateLatLngBoundsBuilder() {
        m2.t tVar = new m2.t(5);
        i1 i1Var = new i1(1);
        i1Var.f8330b = Double.POSITIVE_INFINITY;
        i1Var.f8331c = Double.NEGATIVE_INFINITY;
        i1Var.d = Double.NaN;
        i1Var.e = Double.NaN;
        tVar.f12684b = i1Var;
        return tVar;
    }

    @Override
    public za onCreateMapView(Context context) {
        ?? obj = new Object();
        obj.f2777a = new fg.i((bh.d) obj, context);
        return obj;
    }

    @Override
    public ab onCreateMarkerOptions() {
        l2.f fVar = new l2.f(10, false);
        ?? obj = new Object();
        obj.e = 0.5f;
        obj.f9719f = 1.0f;
        obj.f9720n = true;
        obj.f9721r = false;
        obj.f9722s = 0.0f;
        obj.f9723w = 0.5f;
        obj.f9724x = 0.0f;
        obj.f9725y = 1.0f;
        fVar.f11587b = obj;
        return fVar;
    }

    @Override
    public boolean p1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        uf.a aVar;
        if (i11 == 6) {
            aVar = uf.a.f50231u;
        } else if (i11 > i12) {
            aVar = uf.a.f50228p;
        } else if (i11 < i12) {
            aVar = uf.a.f50229q;
        } else {
            aVar = uf.a.f50230t;
        }
        return aVar.t1(i10, i11, i12);
    }

    @Override
    public int u() {
        switch (this.f48560a) {
            case 3:
                return 872415231;
            default:
                return 0;
        }
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        uf.a aVar;
        if (i10 == 6) {
            aVar = uf.a.f50231u;
        } else if (i10 > i11) {
            aVar = uf.a.f50228p;
        } else if (i10 < i11) {
            aVar = uf.a.f50229q;
        } else {
            aVar = uf.a.f50230t;
        }
        aVar.u0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public int w() {
        switch (this.f48560a) {
            case 3:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean w0(jj jjVar) {
        return true;
    }

    @Override
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override
    public String x(long j10) {
        return null;
    }

    @Override
    public int y(x xVar) {
        String str = xVar.f2423s;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(sc.e.h("Unsupported MIME type: ", str));
    }

    @Override
    public CharacterStyle y1(q1 q1Var) {
        return null;
    }

    public u() {
        this.f48560a = 8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void B1() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p() {
    }

    @Override
    public void s() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void A(q1 q1Var) {
    }

    @Override
    public void C0(q1 q1Var) {
    }

    @Override
    public void F0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void J(gj gjVar) {
    }

    @Override
    public void J0(q1 q1Var) {
    }

    @Override
    public void M(q1 q1Var) {
    }

    @Override
    public void N0(q1 q1Var) {
    }

    @Override
    public void O(jj jjVar) {
    }

    @Override
    public void O0(q1 q1Var) {
    }

    @Override
    public void P1(q1 q1Var) {
    }

    @Override
    public void U(q1 q1Var) {
    }

    @Override
    public void X1(q1 q1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void g0(q1 q1Var) {
    }

    @Override
    public void l0(String str) {
    }

    @Override
    public void m1(q1 q1Var) {
    }

    @Override
    public void n(q1 q1Var) {
    }

    @Override
    public void q(q1 q1Var) {
    }

    @Override
    public void t(q1 q1Var) {
    }

    @Override
    public void u1(q1 q1Var) {
    }

    @Override
    public void v(q1 q1Var) {
    }

    @Override
    public void v1(jj jjVar) {
    }

    @Override
    public void x0(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void F1(q1 q1Var, c20 c20Var) {
    }

    @Override
    public void G(q1 q1Var, s2 s2Var) {
    }

    @Override
    public void J1(String str, String str2) {
    }

    @Override
    public void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(q1 q1Var, long j10) {
    }

    @Override
    public void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public void c1(q1 q1Var, int i10) {
    }

    @Override
    public void n1(q1 q1Var, boolean z10) {
    }

    @Override
    public void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void r(int i10, Object obj) {
    }

    @Override
    public void s1(q1 q1Var, int i10) {
    }

    @Override
    public void A0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void D0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f1(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f2(q1 q1Var, int i10, int i11) {
    }

    @Override
    public void l1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void o0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void z0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void s0(q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
