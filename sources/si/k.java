package si;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import ei.y3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import m.g3;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.t50;
import org.telegram.ui.z70;
public final class k {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public boolean D0;
    public x E;
    public long E0;
    public volatile m0 F;
    public long F0;
    public m0 G;
    public long G0;
    public m0 H;
    public long H0;
    public n0 I;
    public long I0;
    public o0 J;
    public long J0;
    public Range K;
    public long K0;
    public j6.l L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public long N0;
    public double O0;
    public boolean P;
    public long P0;
    public boolean Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public int U;
    public long U0;
    public volatile boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public boolean X;
    public long X0;
    public boolean Y;
    public long Y0;
    public boolean Z;
    public long Z0;
    public final Context f46649a;
    public volatile boolean f46650a0;
    public long f46651a1;
    public final CameraManager f46652b;
    public volatile boolean f46653b0;
    public long f46654b1;
    public final TextureView f46655c;
    public volatile boolean f46656c0;
    public long f46657c1;
    public final r0 d;
    public boolean f46658d0;
    public double f46659d1;
    public final int e;
    public boolean f46660e0;
    public long f46661e1;
    public final int f46662f;
    public boolean f46663f0;
    public long f46664f1;
    public final n0 f46665g;
    public boolean f46666g0;
    public long f46667g1;
    public final o0 h;
    public boolean f46668h0;
    public long f46669h1;
    public final boolean f46670i;
    public j f46671i0;
    public long f46672i1;
    public final o f46673j;
    public j f46674j0;
    public long f46675j1;
    public final l2.f f46676k;
    public boolean f46677k0;
    public long f46678k1;
    public boolean f46680l0;
    public final y3 l1;
    public HandlerThread f46681m;
    public boolean m0;
    public final b f46682m1;
    public Handler f46683n;
    public boolean f46684n0;
    public final b f46685n1;
    public String f46686o;
    public boolean f46687o0;
    public final t50 f46688o1;
    public CameraCharacteristics f46689p;
    public boolean f46690p0;
    public final f f46691p1;
    public Size f46692q;
    public boolean f46693q0;
    public final f f46694q1;
    public volatile Size f46695r;
    public boolean f46696r0;
    public final g f46697r1;
    public volatile int f46698s;
    public CameraDevice f46699s0;
    public final g f46700s1;
    public Surface f46701t;
    public CameraDevice f46702t0;
    public final h f46703t1;
    public Surface f46704u;
    public CameraDevice f46705u0;
    public Surface v;
    public CameraDevice f46706v0;
    public u f46707w;
    public j f46708w0;
    public n f46709x;
    public m0 f46710x0;
    public n f46711y;
    public boolean f46712y0;
    public CameraDevice f46713z;
    public boolean f46714z0;
    public final Rect f46679l = new Rect();
    public float O = 1.0f;

    public k(Context context, TextureView textureView, r0 r0Var, int i10, n0 n0Var, o0 o0Var, boolean z10, o oVar, l2.f fVar) {
        y3 y3Var = new y3(this, 2);
        this.l1 = y3Var;
        this.f46682m1 = new b(this, 4);
        this.f46685n1 = new b(this, 5);
        this.f46688o1 = new t50(this, 4);
        this.f46691p1 = new f(this, 0);
        this.f46694q1 = new f(this, 1);
        this.f46697r1 = new g(this, 0);
        this.f46700s1 = new g(this, 1);
        this.f46703t1 = new h(this);
        this.f46649a = context.getApplicationContext();
        this.f46652b = (CameraManager) context.getSystemService("camera");
        this.f46655c = textureView;
        this.d = r0Var;
        this.e = r0Var.f46779a;
        this.f46662f = i10;
        this.f46665g = n0Var;
        this.h = o0Var;
        this.f46670i = z10;
        this.f46673j = oVar;
        this.f46676k = fVar;
        textureView.addOnLayoutChangeListener(y3Var);
    }

    public static Range C(Range[] rangeArr, int i10) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        for (Range range2 : rangeArr) {
            if (range2.contains((Range) Integer.valueOf(i10)) && (range == null || ((Integer) range2.getLower()).intValue() > ((Integer) range.getLower()).intValue() || (((Integer) range2.getLower()).equals(range.getLower()) && ((Integer) range2.getUpper()).intValue() < ((Integer) range.getUpper()).intValue()))) {
                range = range2;
            }
        }
        return range;
    }

    public static boolean D(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static int V(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float W(double d, long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        double d10 = j11;
        double d11 = j10 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static void a(k kVar) {
        CameraDevice cameraDevice = kVar.f46713z;
        CameraDevice cameraDevice2 = kVar.f46699s0;
        if (kVar.m0 && cameraDevice != null && cameraDevice2 != null && kVar.f46704u != null && kVar.v != null && kVar.A == null && kVar.B == null) {
            kVar.f46687o0 = false;
            kVar.f46690p0 = false;
            try {
                kVar.G0 = SystemClock.elapsedRealtimeNanos();
                o oVar = kVar.f46673j;
                oVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + kVar.f46695r + ", fpsRange=" + kVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(kVar.f46704u), kVar.f46700s1, kVar.f46683n);
                cameraDevice2.createCaptureSession(Arrays.asList(kVar.v), kVar.f46697r1, kVar.f46683n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                kVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(k kVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == kVar.f46713z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && kVar.m0) {
            o oVar = kVar.f46673j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            oVar.b(sb2.toString());
            kVar.m0 = false;
            kVar.f46677k0 = false;
            kVar.f46680l0 = true;
            kVar.f46696r0 = false;
            kVar.f46699s0 = null;
            kVar.f46708w0 = null;
            kVar.r();
            kVar.f46702t0 = cameraDevice;
            if (!kVar.V || kVar.f46713z == null || kVar.A != null || kVar.X) {
                z11 = false;
            }
            kVar.f46712y0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == kVar.f46699s0) {
            kVar.f46699s0 = null;
        }
        kVar.f46696r0 = false;
        cameraDevice.close();
        if (z10) {
            kVar.q();
            kVar.f46713z = null;
            if (illegalStateException != null) {
                kVar.N(illegalStateException);
                return;
            } else {
                kVar.N(new IllegalStateException(r.c.g("Active warm camera ", str)));
                return;
            }
        }
        kVar.y("standby device " + str, illegalStateException);
        if (kVar.f46710x0 != null) {
            kVar.t();
        } else if (kVar.V && kVar.f46713z != null && kVar.A == null && !kVar.X) {
            kVar.f46673j.b("warm camera failed during startup; configuring active camera only");
            kVar.u();
        }
    }

    public static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "UNKNOWN";
                        }
                        return "CAMERA_SERVICE";
                    }
                    return "CAMERA_DEVICE";
                }
                return "CAMERA_DISABLED";
            }
            return "MAX_CAMERAS_IN_USE";
        }
        return "CAMERA_IN_USE";
    }

    public static boolean d(k kVar, CameraDevice cameraDevice) {
        String id2;
        if (!kVar.G(cameraDevice)) {
            return false;
        }
        if (cameraDevice == kVar.f46705u0) {
            kVar.f46705u0 = null;
        }
        if (cameraDevice == kVar.f46706v0) {
            kVar.f46706v0 = null;
        }
        o oVar = kVar.f46673j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = kVar.f46705u0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = kVar.f46706v0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        oVar.b(sb2.toString());
        kVar.H();
        return true;
    }

    public static boolean e(k kVar, CameraDevice cameraDevice) {
        if (cameraDevice != kVar.f46702t0) {
            return false;
        }
        kVar.f46702t0 = null;
        o oVar = kVar.f46673j;
        oVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (kVar.f46712y0) {
            kVar.f46712y0 = false;
            if (kVar.V && !kVar.f46653b0 && kVar.f46713z != null) {
                kVar.f46673j.b("retrying capture session after standby camera closed");
                kVar.u();
                return true;
            }
            return true;
        } else if (kVar.X && kVar.f46710x0 != null) {
            kVar.f46673j.b("continuing pending switch after DUAL_ACTIVE fallback");
            kVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(k kVar) {
        m0 m0Var = kVar.f46710x0;
        if (m0Var != null && kVar.m0 && kVar.f46687o0 && kVar.f46690p0) {
            kVar.f46710x0 = null;
            if (!kVar.b0(m0Var)) {
                kVar.X = false;
                kVar.a0(m0Var);
            }
        }
    }

    public static long i(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float j(long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        return (((float) j10) / ((float) j11)) / 1000000.0f;
    }

    public static j6.l m(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i10;
        j6.l o10;
        n0 n0Var2;
        j6.l o11;
        n0 n0Var3 = n0.f46758c;
        if (n0Var == n0Var3) {
            i10 = r0Var.f46779a;
        } else {
            r0 r0Var2 = r0.P480;
            n0 n0Var4 = n0.f46756a;
            if (r0Var == r0Var2) {
                if (n0Var == n0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l o12 = o(sizeArr, i10, n0Var);
        if (o12 != null) {
            return o12;
        }
        if (r0Var == r0.P360 && n0Var == (n0Var2 = n0.f46757b) && (o11 = o(sizeArr, 480, n0Var2)) != null) {
            return o11;
        }
        int i11 = r0Var.f46779a;
        if (n0Var != n0Var3 && (o10 = o(sizeArr, i11, n0Var3)) != null) {
            return o10;
        }
        int i12 = r0Var.f46779a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (V(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || i(size2) < i(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (V(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && i(size3) < i(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(n(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size n(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(V(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(i(size3), i(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l o(Size[] sizeArr, int i10, n0 n0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.l lVar2 = new j6.l(n10, size, n0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f14284b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14285c;
                    int abs2 = Math.abs(V(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long i12 = i(size) + i(n10);
                        long i13 = i(size3) + i(size2);
                        if (i12 != i13) {
                            compare = Long.compare(i12, i13);
                        } else {
                            compare = Long.compare(i(size), i(size3));
                        }
                    }
                    if (compare >= 0) {
                    }
                }
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public static boolean s(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long z(long j10) {
        if (j10 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
    }

    public final void A(String str, Exception exc, boolean z10) {
        String str2;
        if (this.m0) {
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z10);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            this.f46673j.b(sb2.toString());
            this.m0 = false;
            this.f46677k0 = false;
            this.f46680l0 = true;
            this.f46687o0 = false;
            this.f46690p0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f46699s0;
                this.f46699s0 = null;
                this.f46708w0 = null;
                if (cameraDevice != null) {
                    this.f46702t0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f46702t0 == null && this.X && this.f46710x0 != null) {
                    t();
                    return;
                }
                return;
            }
            L("DUAL_ACTIVE ".concat(str), exc);
        }
    }

    public final void B(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        n nVar = this.f46709x;
        if (nVar != null) {
            synchronized (nVar) {
                z10 = nVar.f46755z;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f46663f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f46663f0 = true;
        q();
        j6.l lVar = this.L;
        if (lVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = o0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f46689p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f46692q = (Size) lVar.f14284b;
        this.f46695r = (Size) lVar.f14285c;
        this.f46698s = lVar.f14283a;
        this.I = (n0) lVar.d;
        this.f46671i0 = null;
        this.f46674j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f46655c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f46692q.getWidth(), this.f46692q.getHeight());
        }
        u uVar = this.f46707w;
        if (uVar != null) {
            uVar.l();
            this.f46707w = null;
        }
        n nVar2 = this.f46709x;
        if (nVar2 != null) {
            nVar2.q();
            this.f46709x = null;
        }
        this.f46704u = null;
        try {
            v();
            O();
            o oVar = this.f46673j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f46692q);
            sb2.append(", recording=");
            sb2.append(this.f46695r);
            sb2.append(", crop=");
            sb2.append(this.f46698s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            oVar.b(sb2.toString());
            Handler handler = this.f46683n;
            if (this.V && handler != null) {
                handler.post(new b(this, 0));
            }
        } catch (Exception e) {
            N(e);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f46652b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == m0.f46732b && (cameraCharacteristics = this.f46689p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.f46714z0) {
            if (cameraDevice == this.f46705u0 || cameraDevice == this.f46706v0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.f46714z0 && this.f46705u0 == null && this.f46706v0 == null) {
            this.f46714z0 = false;
            this.X = false;
            o oVar = this.f46673j;
            oVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (this.V && !this.f46653b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f46713z == null) {
            if (f0.c.b(this.f46649a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f46649a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.C0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.C0);
                    if (this.f46713z == null && this.f46709x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f46655c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.m0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f46655c.getWidth(), this.f46655c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f46692q.getWidth(), this.f46692q.getHeight());
                        }
                        if (this.f46701t == null) {
                            this.f46701t = new Surface(surfaceTexture);
                        }
                        if (this.f46709x == null) {
                            w(surfaceTexture);
                        } else {
                            u uVar = this.f46707w;
                            if (uVar != null) {
                                uVar.n(this.f46695r, this.f46698s, D(this.f46689p));
                                Surface surface = null;
                                if (!this.m0 && this.f46693q0) {
                                    this.f46693q0 = false;
                                    u uVar2 = this.f46707w;
                                    Handler handler = uVar2.f46844u;
                                    if (uVar2.f46839r0 && handler != null) {
                                        handler.post(new z70((Object) uVar2, false, (Object) null, 17));
                                    }
                                }
                                u uVar3 = this.f46707w;
                                Surface surface2 = uVar3.f46847w;
                                if (surface2 != null) {
                                    this.f46704u = surface2;
                                    if (this.m0 && (!uVar3.f46816f || (surface = uVar3.f46851y) == null)) {
                                        throw new IllegalStateException("Secondary GL camera surface is unavailable");
                                    }
                                    this.v = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        J();
                        this.W = true;
                        this.F0 = SystemClock.elapsedRealtimeNanos();
                        o oVar = this.f46673j;
                        oVar.b("camera open requested: id=" + this.f46686o + ", preview=" + this.f46692q + ", recording=" + this.f46695r + ", crop=" + this.f46698s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.m0);
                        this.f46652b.openCamera(this.f46686o, this.f46691p1, this.f46683n);
                    }
                } catch (Exception e) {
                    this.W = false;
                    N(e);
                }
            }
        }
    }

    public final void J() {
        boolean z10;
        CameraDevice cameraDevice;
        m0 m0Var;
        j jVar;
        if (this.f46677k0 && !this.f46680l0 && !(z10 = this.f46696r0) && (cameraDevice = this.f46699s0) == null) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f46731a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f46732b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                jVar = this.f46671i0;
            } else {
                jVar = this.f46674j0;
            }
            if (jVar != null) {
                String str = jVar.f46639a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f46708w0 = jVar;
                        this.f46696r0 = true;
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        o oVar = this.f46673j;
                        oVar.b("warm camera open requested: id=" + str + ", facing=" + jVar.f46640b);
                        this.f46652b.openCamera(str, this.f46694q1, this.f46683n);
                    } catch (Exception e) {
                        this.f46696r0 = false;
                        y("open request failed", e);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f46680l0) {
            return;
        }
        if (this.f46677k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        o oVar = this.f46673j;
        if (i10 < 30) {
            this.f46680l0 = true;
            oVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        j l4 = l();
        o0 o0Var = l4.h;
        String str2 = l4.f46639a;
        m0 m0Var = l4.f46640b;
        m0 m0Var2 = m0.f46731a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.f46732b;
        }
        try {
            try {
                S(m0Var2);
                j l10 = l();
                o0 o0Var2 = l10.h;
                String str3 = l10.f46639a;
                boolean E = E(str2, str3);
                this.f46677k0 = E;
                if (E && o0Var != o0Var2) {
                    this.f46677k0 = false;
                    oVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f46642f + ", second=" + l10.e + "/" + l10.f46642f + ", firstFps=" + o0Var.f46764a + ", secondFps=" + o0Var2.f46764a);
                }
                boolean z10 = this.f46677k0;
                if (!z10) {
                    this.f46680l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f46677k0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f46677k0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.f46680l0 = true;
                oVar.b("camera warm-switch capability unavailable: " + e);
                h(l4);
            }
        } catch (Throwable th2) {
            h(l4);
            throw th2;
        }
    }

    public final void L(String str, Exception exc) {
        String id2;
        Object valueOf;
        String str2;
        if (this.f46714z0) {
            return;
        }
        this.f46714z0 = true;
        this.f46680l0 = true;
        this.f46677k0 = false;
        this.f46712y0 = false;
        this.f46710x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f46713z;
        this.f46705u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f46699s0;
        this.f46706v0 = cameraDevice2;
        this.f46713z = null;
        this.f46699s0 = null;
        this.f46708w0 = null;
        CameraDevice cameraDevice3 = this.f46702t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f46702t0 = null;
        }
        o oVar = this.f46673j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.f46705u0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        v.append(id2);
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f46706v0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        v.append(str3);
        v.append(", fps=");
        o0 o0Var = this.J;
        if (o0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(o0Var.f46764a);
        }
        v.append(valueOf);
        v.append(", switchElapsedMs=");
        v.append(z(this.H0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        v.append(str2);
        oVar.b(v.toString());
        CameraDevice cameraDevice6 = this.f46705u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f46706v0;
        if (cameraDevice7 != null && cameraDevice7 != this.f46705u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f46655c.setSurfaceTextureListener(null);
        this.f46655c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.f46683n;
        HandlerThread handlerThread = this.f46681m;
        this.f46683n = null;
        this.f46681m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new p2.b(22, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f46673j.a("camera error", exc);
        l2.f fVar = this.f46676k;
        ((t0) fVar.f15837b).f46791i.post(new p2.b(25, fVar, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f46651a1 = 0L;
        this.f46654b1 = 0L;
        this.f46657c1 = 0L;
        this.f46659d1 = 0.0d;
        this.f46661e1 = 0L;
        this.f46664f1 = 0L;
        this.f46667g1 = 0L;
        this.f46669h1 = 0L;
        this.f46672i1 = 0L;
        this.f46675j1 = 0L;
        this.f46678k1 = 0L;
    }

    public final void P() {
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0.0d;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
    }

    public final g3 Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        j6.l lVar2;
        int i10;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        o oVar = this.f46673j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.FPS_30;
        if (o0Var != o0Var2) {
            if (this.f46668h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                lVar2 = lVar;
            } else {
                int i11 = o0Var.f46764a;
                Range C = C(rangeArr4, i11);
                if (C != null) {
                    ArrayList arrayList = new ArrayList(sizeArr.length);
                    int length = sizeArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        Size size = sizeArr[i12];
                        int i13 = i12;
                        int i14 = length;
                        long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                        if (outputMinFrameDuration > 0) {
                            rangeArr3 = rangeArr4;
                            if (outputMinFrameDuration > 1000000000 / i11) {
                                rangeArr4 = rangeArr3;
                                length = i14;
                                i12 = i13 + 1;
                            }
                        } else {
                            rangeArr3 = rangeArr4;
                        }
                        arrayList.add(size);
                        rangeArr4 = rangeArr3;
                        length = i14;
                        i12 = i13 + 1;
                    }
                    rangeArr2 = rangeArr4;
                    Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                    try {
                        j6.l m10 = m(sizeArr2, this.d, this.f46665g);
                        oVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new g3(o0.FPS_60, C, m10, 28);
                    } catch (RuntimeException unused) {
                        oVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    oVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                oVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new g3(o0Var2, C2, lVar, 28);
            }
        } else {
            rangeArr = rangeArr4;
            lVar2 = lVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(o0Var.f46764a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        if (this.f46668h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        oVar.b(v.toString());
        return new g3(o0Var2, C3, lVar2, 28);
    }

    public final void R(String str, Exception exc) {
        this.f46712y0 = true;
        y(str, exc);
        if (this.f46702t0 == null) {
            this.f46712y0 = false;
            u();
            return;
        }
        this.f46673j.b("capture session retry waiting for standby camera close: id=" + this.f46702t0.getId());
    }

    public final void S(si.m0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: si.k.S(si.m0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f46683n;
        if (this.V && handler != null) {
            handler.post(new b60(18, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f46683n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f46685n1);
            handler.post(this.f46685n1);
            return true;
        }
        return false;
    }

    public final void X(x xVar, long j10, m0 m0Var) {
        if (this.f46681m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f46681m = handlerThread;
            handlerThread.start();
            this.f46683n = new Handler(this.f46681m.getLooper());
        }
        this.E = xVar;
        this.M = j10;
        this.F = m0Var;
        this.V = true;
        this.f46653b0 = false;
        this.f46711y = null;
        this.f46656c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        o oVar = this.f46673j;
        oVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f46655c.isAvailable());
        this.f46655c.setSurfaceTextureListener(this.f46688o1);
        Handler handler = this.f46683n;
        if (this.V && handler != null && this.f46655c.isAvailable()) {
            handler.post(new b(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f46683n;
        if (!this.V || this.f46653b0 || handler == null) {
            return false;
        }
        this.f46653b0 = true;
        this.f46656c0 = false;
        this.f46673j.b("camera segment stop requested");
        handler.post(new b(this, 6));
        return true;
    }

    public final boolean Z(m0 m0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f46731a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f46652b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f46665g)).f16196b) == o0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(si.m0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: si.k.a0(si.m0):void");
    }

    public final boolean b0(m0 m0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        j jVar;
        j jVar2;
        CaptureRequest.Builder x10;
        if (!this.m0 || !this.f46687o0 || !this.f46690p0 || (cameraDevice = this.f46713z) == null || (cameraDevice2 = this.f46699s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (jVar = this.f46708w0) == null || jVar.f46640b != m0Var || this.f46707w == null) {
            return false;
        }
        this.f46713z = cameraDevice2;
        this.f46699s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f46704u;
        this.f46704u = this.v;
        this.v = surface;
        if (this.G == m0.f46731a) {
            jVar2 = this.f46671i0;
        } else {
            jVar2 = this.f46674j0;
        }
        this.f46708w0 = jVar2;
        h(jVar);
        this.G = m0Var;
        try {
            try {
                x10 = x(this.f46713z, this.f46704u, jVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e7) {
            e = e7;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f46703t1, this.f46683n);
            j jVar3 = this.f46708w0;
            if (jVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f46699s0, this.v, jVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f46703t1, this.f46683n);
            }
            boolean z10 = !this.f46693q0;
            this.f46693q0 = z10;
            long j10 = this.H0;
            u uVar = this.f46707w;
            c cVar = new c(this, m0Var, j10, 0);
            Handler handler = uVar.f46844u;
            if (uVar.f46839r0 && handler != null) {
                handler.post(new z70(uVar, z10, cVar, 17));
            }
            this.f46687o0 = true;
            this.f46690p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.f46650a0 = false;
            O();
            this.f46673j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f46713z.getId() + ", standbyId=" + this.f46699s0.getId() + ", input=" + (this.f46693q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.f46655c.post(new b(this, 1));
            l2.f fVar = this.f46676k;
            ((t0) fVar.f15837b).f46791i.post(new z70((Object) fVar, (Object) new i(this.G, this.I, this.J, this.f46692q, this.f46695r, this.O, F()), true, 18));
            return true;
        } catch (CameraAccessException e10) {
            e = e10;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalArgumentException e11) {
            e = e11;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalStateException e12) {
            e = e12;
            A("role switch request failed", e, false);
            return true;
        }
    }

    public final boolean c0(m0 m0Var) {
        String id2;
        CameraDevice cameraDevice = this.f46699s0;
        j jVar = this.f46708w0;
        if (cameraDevice == null || jVar == null || jVar.f46640b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f46655c.getSurfaceTexture();
        j jVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f46713z;
        m0 m0Var2 = this.G;
        if (m0Var2 != null) {
            if (m0Var2 == m0.f46731a) {
                jVar2 = this.f46671i0;
            } else {
                jVar2 = this.f46674j0;
            }
        }
        q();
        this.f46699s0 = cameraDevice2;
        this.f46708w0 = jVar2;
        this.f46713z = cameraDevice;
        h(jVar);
        surfaceTexture.setDefaultBufferSize(this.f46692q.getWidth(), this.f46692q.getHeight());
        u uVar = this.f46707w;
        if (uVar != null) {
            uVar.n(this.f46695r, this.f46698s, D(this.f46689p));
            Surface surface = this.f46707w.f46847w;
            if (surface != null) {
                this.f46704u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.D0 = true;
        o oVar = this.f46673j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f46686o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(z(this.H0));
        oVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        int width;
        int height;
        Integer num;
        if (this.f46656c0) {
            if (this.f46684n0) {
                this.f46655c.setTransform(new Matrix());
                this.f46673j.b("preview transform: GL output, identity matrix, view=" + this.f46655c.getWidth() + "x" + this.f46655c.getHeight());
                return;
            }
            Size size = this.f46695r;
            if (size != null && this.f46655c.getWidth() != 0 && this.f46655c.getHeight() != 0) {
                int min = Math.min(this.f46698s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f46655c;
                boolean z10 = false;
                if (this.f46689p != null && textureView.getDisplay() != null && (num = (Integer) this.f46689p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
                    int intValue = ((num.intValue() - (textureView.getDisplay().getRotation() * 90)) + 360) % 360;
                    if (intValue == 90 || intValue == 270) {
                        z10 = true;
                    }
                }
                if (z10) {
                    width = size.getHeight();
                } else {
                    width = size.getWidth();
                }
                float f7 = min;
                float f10 = width / f7;
                if (z10) {
                    height = size.getWidth();
                } else {
                    height = size.getHeight();
                }
                float f11 = height / f7;
                Matrix matrix = new Matrix();
                matrix.setScale(f10, f11, this.f46655c.getWidth() * 0.5f, this.f46655c.getHeight() * 0.5f);
                this.f46655c.setTransform(matrix);
                this.f46673j.b("preview transform: view=" + this.f46655c.getWidth() + "x" + this.f46655c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: si.k.g():void");
    }

    public final void h(j jVar) {
        this.f46686o = jVar.f46639a;
        this.H = jVar.f46640b;
        this.f46689p = jVar.f46641c;
        this.f46692q = jVar.d;
        this.f46695r = jVar.e;
        this.f46698s = jVar.f46642f;
        this.I = jVar.f46643g;
        this.J = jVar.h;
        this.K = jVar.f46644i;
        this.L = jVar.f46645j;
        this.O = jVar.f46646k;
        this.f46663f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f46683n;
        if (handler != null) {
            handler.removeCallbacks(this.f46682m1);
        }
        this.f46711y = null;
    }

    public final j l() {
        return new j(this.f46686o, this.H, this.f46689p, this.f46692q, this.f46695r, this.f46698s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f46714z0 = false;
        this.f46712y0 = false;
        this.f46705u0 = null;
        this.f46706v0 = null;
        this.f46656c0 = false;
        this.Z = false;
        this.f46650a0 = false;
        this.C = null;
        this.Q = false;
        this.f46710x0 = null;
        this.f46696r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f46713z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f46713z = null;
        }
        CameraDevice cameraDevice2 = this.f46699s0;
        this.f46699s0 = null;
        this.f46708w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f46702t0;
        this.f46702t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        u uVar = this.f46707w;
        if (uVar != null) {
            uVar.l();
            this.f46707w = null;
        }
        Surface surface = this.f46701t;
        if (surface != null) {
            surface.release();
            this.f46701t = null;
        }
        this.f46704u = null;
        this.v = null;
        this.m0 = false;
        this.f46684n0 = false;
        this.f46687o0 = false;
        this.f46690p0 = false;
        this.f46693q0 = false;
    }

    public final void q() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
    }

    public final void r() {
        CameraCaptureSession cameraCaptureSession = this.B;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.B = null;
        }
        this.D = null;
        this.f46690p0 = false;
    }

    public final void t() {
        String str;
        this.f46710x0 = null;
        this.D0 = false;
        if (this.f46677k0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f46673j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f46713z;
        if (cameraDevice != null) {
            this.f46713z = null;
            this.B0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.W) {
            this.X = false;
            I();
        }
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: si.k.u():void");
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        String str;
        boolean z10;
        Surface surface3;
        m0 m0Var;
        j jVar;
        Surface surface4;
        this.f46684n0 = this.m0;
        x xVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f46662f;
        int i12 = this.J.f46764a;
        o oVar = this.f46673j;
        l2.f fVar = this.f46676k;
        Objects.requireNonNull(fVar);
        n nVar = new n(xVar, j10, i10, i11, i12, oVar, new d(fVar));
        this.f46709x = nVar;
        synchronized (nVar) {
            if (nVar.f46754y) {
                surface = nVar.f46746p;
            } else {
                nVar.m();
                long nanoTime = System.nanoTime();
                try {
                    nVar.b();
                    nVar.a();
                    nVar.f46743m.start();
                    nVar.f46754y = true;
                    nVar.f46737f.b("codecs prepared: video=" + nVar.f46743m.getName() + ", audio=" + nVar.f46744n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = nVar.f46746p;
                } catch (IOException | RuntimeException e) {
                    nVar.j();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f46695r;
        if (this.f46684n0) {
            surface2 = this.f46701t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.m0;
        int i13 = this.e;
        int i14 = this.f46698s;
        boolean D = D(this.f46689p);
        boolean z12 = this.f46670i;
        o oVar2 = this.f46673j;
        n nVar2 = this.f46709x;
        l2.f fVar2 = this.f46676k;
        Objects.requireNonNull(fVar2);
        u uVar = new u(size, surface5, surface2, z11, i13, i14, D, z12, oVar2, nVar2, new d(fVar2));
        this.f46707w = uVar;
        uVar.f46843t0 = new b(this, 2);
        u uVar2 = this.f46707w;
        if (uVar2.f46839r0) {
            surface3 = uVar2.f46847w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            uVar2.f46842t = handlerThread;
            handlerThread.start();
            uVar2.f46837q0 = System.nanoTime();
            o oVar3 = uVar2.f46821i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(uVar2.f46808a);
            sb2.append(", crop=");
            sb2.append(uVar2.f46823j);
            sb2.append(", output=");
            sb2.append(uVar2.f46818g);
            sb2.append("x");
            sb2.append(uVar2.f46818g);
            sb2.append(", filter=");
            if (uVar2.f46823j == uVar2.f46818g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(uVar2.h);
            sb2.append(", dualInput=");
            sb2.append(uVar2.f46816f);
            sb2.append(", glPreview=");
            if (uVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            oVar3.b(sb2.toString());
            Handler handler = new Handler(uVar2.f46842t.getLooper());
            uVar2.f46844u = handler;
            handler.post(new p2.b(23, uVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (uVar2.f46848w0 == null) {
                    surface3 = uVar2.f46847w;
                } else {
                    RuntimeException runtimeException = uVar2.f46848w0;
                    uVar2.f46848w0 = null;
                    uVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                uVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f46704u = surface3;
        if (this.m0) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f46731a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f46732b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                jVar = this.f46671i0;
            } else {
                jVar = this.f46674j0;
            }
            if (jVar != null) {
                u uVar3 = this.f46707w;
                Size size2 = jVar.e;
                int i15 = jVar.f46642f;
                boolean D2 = D(jVar.f46641c);
                Handler handler2 = uVar3.f46844u;
                if (uVar3.f46839r0 && uVar3.f46816f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new r(uVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
                    try {
                        countDownLatch2.await();
                        RuntimeException runtimeException2 = runtimeExceptionArr[0];
                        if (runtimeException2 != null) {
                            throw runtimeException2;
                        }
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("Secondary input update was interrupted", e10);
                    }
                }
                u uVar4 = this.f46707w;
                if (uVar4.f46816f && (surface4 = uVar4.f46851y) != null) {
                    this.v = surface4;
                    return;
                }
                throw new IllegalStateException("Secondary GL camera surface is unavailable");
            }
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        this.v = null;
    }

    public final void w(SurfaceTexture surfaceTexture) {
        try {
            v();
        } catch (IOException | RuntimeException e) {
            if (this.m0) {
                this.f46673j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                u uVar = this.f46707w;
                if (uVar != null) {
                    uVar.l();
                    this.f46707w = null;
                }
                n nVar = this.f46709x;
                if (nVar != null) {
                    nVar.q();
                    this.f46709x = null;
                }
                this.f46704u = null;
                this.v = null;
                this.m0 = false;
                this.f46684n0 = false;
                this.f46677k0 = false;
                this.f46680l0 = true;
                surfaceTexture.setDefaultBufferSize(this.f46692q.getWidth(), this.f46692q.getHeight());
                v();
                return;
            }
            throw e;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, si.j r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: si.k.x(android.hardware.camera2.CameraDevice, android.view.Surface, si.j, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.f46680l0 = true;
        this.f46677k0 = false;
        this.m0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f46673j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f46699s0;
        this.f46699s0 = null;
        this.f46708w0 = null;
        if (cameraDevice != null && cameraDevice != this.f46713z) {
            this.f46702t0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
