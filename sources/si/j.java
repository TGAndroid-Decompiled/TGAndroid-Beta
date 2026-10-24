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
import k2.w0;
import m.g3;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.z50;
import org.telegram.ui.v90;
public final class j {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public boolean D0;
    public w E;
    public long E0;
    public volatile m0 F;
    public long F0;
    public m0 G;
    public long G0;
    public m0 H;
    public long H0;
    public n0 I;
    public long I0;
    public p0 J;
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
    public final Context f47061a;
    public volatile boolean f47062a0;
    public long f47063a1;
    public final CameraManager f47064b;
    public volatile boolean f47065b0;
    public long f47066b1;
    public final TextureView f47067c;
    public volatile boolean f47068c0;
    public long f47069c1;
    public final s0 d;
    public boolean f47070d0;
    public double f47071d1;
    public final int e;
    public boolean f47072e0;
    public long f47073e1;
    public final int f47074f;
    public boolean f47075f0;
    public long f47076f1;
    public final n0 f47077g;
    public boolean f47078g0;
    public long f47079g1;
    public final p0 h;
    public boolean f47080h0;
    public long f47081h1;
    public final boolean f47082i;
    public i f47083i0;
    public long f47084i1;
    public final n f47085j;
    public i f47086j0;
    public long f47087j1;
    public final w0 f47088k;
    public boolean f47089k0;
    public long f47090k1;
    public boolean f47092l0;
    public final y3 l1;
    public HandlerThread f47093m;
    public boolean m0;
    public final a f47094m1;
    public Handler f47095n;
    public boolean f47096n0;
    public final a f47097n1;
    public String f47098o;
    public boolean f47099o0;
    public final r50 f47100o1;
    public CameraCharacteristics f47101p;
    public boolean f47102p0;
    public final e f47103p1;
    public Size f47104q;
    public boolean f47105q0;
    public final e f47106q1;
    public volatile Size f47107r;
    public boolean f47108r0;
    public final f f47109r1;
    public volatile int f47110s;
    public CameraDevice f47111s0;
    public final f f47112s1;
    public Surface f47113t;
    public CameraDevice f47114t0;
    public final g f47115t1;
    public Surface f47116u;
    public CameraDevice f47117u0;
    public Surface v;
    public CameraDevice f47118v0;
    public t f47119w;
    public i f47120w0;
    public m f47121x;
    public m0 f47122x0;
    public m f47123y;
    public boolean f47124y0;
    public CameraDevice f47125z;
    public boolean f47126z0;
    public final Rect f47091l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, s0 s0Var, int i10, n0 n0Var, p0 p0Var, boolean z10, n nVar, w0 w0Var) {
        y3 y3Var = new y3(this, 2);
        this.l1 = y3Var;
        this.f47094m1 = new a(this, 4);
        this.f47097n1 = new a(this, 5);
        this.f47100o1 = new r50(this, 4);
        this.f47103p1 = new e(this, 0);
        this.f47106q1 = new e(this, 1);
        this.f47109r1 = new f(this, 0);
        this.f47112s1 = new f(this, 1);
        this.f47115t1 = new g(this);
        this.f47061a = context.getApplicationContext();
        this.f47064b = (CameraManager) context.getSystemService("camera");
        this.f47067c = textureView;
        this.d = s0Var;
        this.e = s0Var.f47195a;
        this.f47074f = i10;
        this.f47077g = n0Var;
        this.h = p0Var;
        this.f47082i = z10;
        this.f47085j = nVar;
        this.f47088k = w0Var;
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

    public static void a(j jVar) {
        CameraDevice cameraDevice = jVar.f47125z;
        CameraDevice cameraDevice2 = jVar.f47111s0;
        if (jVar.m0 && cameraDevice != null && cameraDevice2 != null && jVar.f47116u != null && jVar.v != null && jVar.A == null && jVar.B == null) {
            jVar.f47099o0 = false;
            jVar.f47102p0 = false;
            try {
                jVar.G0 = SystemClock.elapsedRealtimeNanos();
                n nVar = jVar.f47085j;
                nVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.f47107r + ", fpsRange=" + jVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(jVar.f47116u), jVar.f47112s1, jVar.f47095n);
                cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.f47109r1, jVar.f47095n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                jVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == jVar.f47125z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && jVar.m0) {
            n nVar = jVar.f47085j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            nVar.b(sb2.toString());
            jVar.m0 = false;
            jVar.f47089k0 = false;
            jVar.f47092l0 = true;
            jVar.f47108r0 = false;
            jVar.f47111s0 = null;
            jVar.f47120w0 = null;
            jVar.r();
            jVar.f47114t0 = cameraDevice;
            if (!jVar.V || jVar.f47125z == null || jVar.A != null || jVar.X) {
                z11 = false;
            }
            jVar.f47124y0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.f47111s0) {
            jVar.f47111s0 = null;
        }
        jVar.f47108r0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.f47125z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(o0.h("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.f47122x0 != null) {
            jVar.t();
        } else if (jVar.V && jVar.f47125z != null && jVar.A == null && !jVar.X) {
            jVar.f47085j.b("warm camera failed during startup; configuring active camera only");
            jVar.u();
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

    public static boolean d(j jVar, CameraDevice cameraDevice) {
        String id2;
        if (!jVar.G(cameraDevice)) {
            return false;
        }
        if (cameraDevice == jVar.f47117u0) {
            jVar.f47117u0 = null;
        }
        if (cameraDevice == jVar.f47118v0) {
            jVar.f47118v0 = null;
        }
        n nVar = jVar.f47085j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.f47117u0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f47118v0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f47114t0) {
            return false;
        }
        jVar.f47114t0 = null;
        n nVar = jVar.f47085j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f47124y0) {
            jVar.f47124y0 = false;
            if (jVar.V && !jVar.f47065b0 && jVar.f47125z != null) {
                jVar.f47085j.b("retrying capture session after standby camera closed");
                jVar.u();
                return true;
            }
            return true;
        } else if (jVar.X && jVar.f47122x0 != null) {
            jVar.f47085j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(j jVar) {
        m0 m0Var = jVar.f47122x0;
        if (m0Var != null && jVar.m0 && jVar.f47099o0 && jVar.f47102p0) {
            jVar.f47122x0 = null;
            if (!jVar.b0(m0Var)) {
                jVar.X = false;
                jVar.a0(m0Var);
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

    public static j6.l m(Size[] sizeArr, s0 s0Var, n0 n0Var) {
        int i10;
        j6.l o10;
        n0 n0Var2;
        j6.l o11;
        n0 n0Var3 = n0.f47175c;
        if (n0Var == n0Var3) {
            i10 = s0Var.f47195a;
        } else {
            s0 s0Var2 = s0.P480;
            n0 n0Var4 = n0.f47173a;
            if (s0Var == s0Var2) {
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
        if (s0Var == s0.P360 && n0Var == (n0Var2 = n0.f47174b) && (o11 = o(sizeArr, 480, n0Var2)) != null) {
            return o11;
        }
        int i11 = s0Var.f47195a;
        if (n0Var != n0Var3 && (o10 = o(sizeArr, i11, n0Var3)) != null) {
            return o10;
        }
        int i12 = s0Var.f47195a;
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
                    Size size2 = (Size) lVar.f14334b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14335c;
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
            this.f47085j.b(sb2.toString());
            this.m0 = false;
            this.f47089k0 = false;
            this.f47092l0 = true;
            this.f47099o0 = false;
            this.f47102p0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f47111s0;
                this.f47111s0 = null;
                this.f47120w0 = null;
                if (cameraDevice != null) {
                    this.f47114t0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f47114t0 == null && this.X && this.f47122x0 != null) {
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
        m mVar = this.f47121x;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.f47166z;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f47075f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f47075f0 = true;
        q();
        j6.l lVar = this.L;
        if (lVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = p0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f47101p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f47104q = (Size) lVar.f14334b;
        this.f47107r = (Size) lVar.f14335c;
        this.f47110s = lVar.f14333a;
        this.I = (n0) lVar.d;
        this.f47083i0 = null;
        this.f47086j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f47067c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f47104q.getWidth(), this.f47104q.getHeight());
        }
        t tVar = this.f47119w;
        if (tVar != null) {
            tVar.l();
            this.f47119w = null;
        }
        m mVar2 = this.f47121x;
        if (mVar2 != null) {
            mVar2.q();
            this.f47121x = null;
        }
        this.f47116u = null;
        try {
            v();
            O();
            n nVar = this.f47085j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f47104q);
            sb2.append(", recording=");
            sb2.append(this.f47107r);
            sb2.append(", crop=");
            sb2.append(this.f47110s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar.b(sb2.toString());
            Handler handler = this.f47095n;
            if (this.V && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e) {
            N(e);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f47064b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == m0.f47168b && (cameraCharacteristics = this.f47101p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.f47126z0) {
            if (cameraDevice == this.f47117u0 || cameraDevice == this.f47118v0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.f47126z0 && this.f47117u0 == null && this.f47118v0 == null) {
            this.f47126z0 = false;
            this.X = false;
            n nVar = this.f47085j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (this.V && !this.f47065b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f47125z == null) {
            if (f0.c.b(this.f47061a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f47061a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.C0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.C0);
                    if (this.f47125z == null && this.f47121x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f47067c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.m0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f47067c.getWidth(), this.f47067c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f47104q.getWidth(), this.f47104q.getHeight());
                        }
                        if (this.f47113t == null) {
                            this.f47113t = new Surface(surfaceTexture);
                        }
                        if (this.f47121x == null) {
                            w(surfaceTexture);
                        } else {
                            t tVar = this.f47119w;
                            if (tVar != null) {
                                tVar.n(this.f47107r, this.f47110s, D(this.f47101p));
                                Surface surface = null;
                                if (!this.m0 && this.f47105q0) {
                                    this.f47105q0 = false;
                                    t tVar2 = this.f47119w;
                                    Handler handler = tVar2.f47232u;
                                    if (tVar2.f47227r0 && handler != null) {
                                        handler.post(new v90((Object) tVar2, false, (Object) null, 16));
                                    }
                                }
                                t tVar3 = this.f47119w;
                                Surface surface2 = tVar3.f47235w;
                                if (surface2 != null) {
                                    this.f47116u = surface2;
                                    if (this.m0 && (!tVar3.f47204f || (surface = tVar3.f47239y) == null)) {
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
                        n nVar = this.f47085j;
                        nVar.b("camera open requested: id=" + this.f47098o + ", preview=" + this.f47104q + ", recording=" + this.f47107r + ", crop=" + this.f47110s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.m0);
                        this.f47064b.openCamera(this.f47098o, this.f47103p1, this.f47095n);
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
        i iVar;
        if (this.f47089k0 && !this.f47092l0 && !(z10 = this.f47108r0) && (cameraDevice = this.f47111s0) == null) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f47167a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f47168b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f47083i0;
            } else {
                iVar = this.f47086j0;
            }
            if (iVar != null) {
                String str = iVar.f47050a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f47120w0 = iVar;
                        this.f47108r0 = true;
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f47085j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f47051b);
                        this.f47064b.openCamera(str, this.f47106q1, this.f47095n);
                    } catch (Exception e) {
                        this.f47108r0 = false;
                        y("open request failed", e);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f47092l0) {
            return;
        }
        if (this.f47089k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f47085j;
        if (i10 < 30) {
            this.f47092l0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l4 = l();
        p0 p0Var = l4.h;
        String str2 = l4.f47050a;
        m0 m0Var = l4.f47051b;
        m0 m0Var2 = m0.f47167a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.f47168b;
        }
        try {
            try {
                S(m0Var2);
                i l10 = l();
                p0 p0Var2 = l10.h;
                String str3 = l10.f47050a;
                boolean E = E(str2, str3);
                this.f47089k0 = E;
                if (E && p0Var != p0Var2) {
                    this.f47089k0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f47053f + ", second=" + l10.e + "/" + l10.f47053f + ", firstFps=" + p0Var.f47183a + ", secondFps=" + p0Var2.f47183a);
                }
                boolean z10 = this.f47089k0;
                if (!z10) {
                    this.f47092l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f47089k0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f47089k0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.f47092l0 = true;
                nVar.b("camera warm-switch capability unavailable: " + e);
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
        if (this.f47126z0) {
            return;
        }
        this.f47126z0 = true;
        this.f47092l0 = true;
        this.f47089k0 = false;
        this.f47124y0 = false;
        this.f47122x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f47125z;
        this.f47117u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f47111s0;
        this.f47118v0 = cameraDevice2;
        this.f47125z = null;
        this.f47111s0 = null;
        this.f47120w0 = null;
        CameraDevice cameraDevice3 = this.f47114t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f47114t0 = null;
        }
        n nVar = this.f47085j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.f47117u0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        v.append(id2);
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f47118v0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        v.append(str3);
        v.append(", fps=");
        p0 p0Var = this.J;
        if (p0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(p0Var.f47183a);
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
        nVar.b(v.toString());
        CameraDevice cameraDevice6 = this.f47117u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f47118v0;
        if (cameraDevice7 != null && cameraDevice7 != this.f47117u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f47067c.setSurfaceTextureListener(null);
        this.f47067c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.f47095n;
        HandlerThread handlerThread = this.f47093m;
        this.f47095n = null;
        this.f47093m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new p2.b(24, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f47085j.a("camera error", exc);
        w0 w0Var = this.f47088k;
        ((u0) w0Var.f14874b).f47253i.post(new p2.b(27, w0Var, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f47063a1 = 0L;
        this.f47066b1 = 0L;
        this.f47069c1 = 0L;
        this.f47071d1 = 0.0d;
        this.f47073e1 = 0L;
        this.f47076f1 = 0L;
        this.f47079g1 = 0L;
        this.f47081h1 = 0L;
        this.f47084i1 = 0L;
        this.f47087j1 = 0L;
        this.f47090k1 = 0L;
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
        n nVar = this.f47085j;
        p0 p0Var = this.h;
        p0 p0Var2 = p0.FPS_30;
        if (p0Var != p0Var2) {
            if (this.f47080h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                lVar2 = lVar;
            } else {
                int i11 = p0Var.f47183a;
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
                        j6.l m10 = m(sizeArr2, this.d, this.f47077g);
                        nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new g3(p0.FPS_60, C, m10, 28);
                    } catch (RuntimeException unused) {
                        nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new g3(p0Var2, C2, lVar, 28);
            }
        } else {
            rangeArr = rangeArr4;
            lVar2 = lVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(p0Var.f47183a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        if (this.f47080h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        nVar.b(v.toString());
        return new g3(p0Var2, C3, lVar2, 28);
    }

    public final void R(String str, Exception exc) {
        this.f47124y0 = true;
        y(str, exc);
        if (this.f47114t0 == null) {
            this.f47124y0 = false;
            u();
            return;
        }
        this.f47085j.b("capture session retry waiting for standby camera close: id=" + this.f47114t0.getId());
    }

    public final void S(si.m0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: si.j.S(si.m0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f47095n;
        if (this.V && handler != null) {
            handler.post(new z50(19, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f47095n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f47097n1);
            handler.post(this.f47097n1);
            return true;
        }
        return false;
    }

    public final void X(w wVar, long j10, m0 m0Var) {
        if (this.f47093m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f47093m = handlerThread;
            handlerThread.start();
            this.f47095n = new Handler(this.f47093m.getLooper());
        }
        this.E = wVar;
        this.M = j10;
        this.F = m0Var;
        this.V = true;
        this.f47065b0 = false;
        this.f47123y = null;
        this.f47068c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        n nVar = this.f47085j;
        nVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f47067c.isAvailable());
        this.f47067c.setSurfaceTextureListener(this.f47100o1);
        Handler handler = this.f47095n;
        if (this.V && handler != null && this.f47067c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f47095n;
        if (!this.V || this.f47065b0 || handler == null) {
            return false;
        }
        this.f47065b0 = true;
        this.f47068c0 = false;
        this.f47085j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(m0 m0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f47167a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f47064b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((p0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f47077g)).f16265b) == p0.FPS_60) {
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
        throw new UnsupportedOperationException("Method not decompiled: si.j.a0(si.m0):void");
    }

    public final boolean b0(m0 m0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder x10;
        if (!this.m0 || !this.f47099o0 || !this.f47102p0 || (cameraDevice = this.f47125z) == null || (cameraDevice2 = this.f47111s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f47120w0) == null || iVar.f47051b != m0Var || this.f47119w == null) {
            return false;
        }
        this.f47125z = cameraDevice2;
        this.f47111s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f47116u;
        this.f47116u = this.v;
        this.v = surface;
        if (this.G == m0.f47167a) {
            iVar2 = this.f47083i0;
        } else {
            iVar2 = this.f47086j0;
        }
        this.f47120w0 = iVar2;
        h(iVar);
        this.G = m0Var;
        try {
            try {
                x10 = x(this.f47125z, this.f47116u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e7) {
            e = e7;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f47115t1, this.f47095n);
            i iVar3 = this.f47120w0;
            if (iVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f47111s0, this.v, iVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f47115t1, this.f47095n);
            }
            boolean z10 = !this.f47105q0;
            this.f47105q0 = z10;
            long j10 = this.H0;
            t tVar = this.f47119w;
            b bVar = new b(this, m0Var, j10, 0);
            Handler handler = tVar.f47232u;
            if (tVar.f47227r0 && handler != null) {
                handler.post(new v90(tVar, z10, bVar, 16));
            }
            this.f47099o0 = true;
            this.f47102p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.f47062a0 = false;
            O();
            this.f47085j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f47125z.getId() + ", standbyId=" + this.f47111s0.getId() + ", input=" + (this.f47105q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.f47067c.post(new a(this, 1));
            w0 w0Var = this.f47088k;
            ((u0) w0Var.f14874b).f47253i.post(new v90((Object) w0Var, (Object) new h(this.G, this.I, this.J, this.f47104q, this.f47107r, this.O, F()), true, 17));
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
        CameraDevice cameraDevice = this.f47111s0;
        i iVar = this.f47120w0;
        if (cameraDevice == null || iVar == null || iVar.f47051b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f47067c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f47125z;
        m0 m0Var2 = this.G;
        if (m0Var2 != null) {
            if (m0Var2 == m0.f47167a) {
                iVar2 = this.f47083i0;
            } else {
                iVar2 = this.f47086j0;
            }
        }
        q();
        this.f47111s0 = cameraDevice2;
        this.f47120w0 = iVar2;
        this.f47125z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.f47104q.getWidth(), this.f47104q.getHeight());
        t tVar = this.f47119w;
        if (tVar != null) {
            tVar.n(this.f47107r, this.f47110s, D(this.f47101p));
            Surface surface = this.f47119w.f47235w;
            if (surface != null) {
                this.f47116u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.D0 = true;
        n nVar = this.f47085j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f47098o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(z(this.H0));
        nVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        int width;
        int height;
        Integer num;
        if (this.f47068c0) {
            if (this.f47096n0) {
                this.f47067c.setTransform(new Matrix());
                this.f47085j.b("preview transform: GL output, identity matrix, view=" + this.f47067c.getWidth() + "x" + this.f47067c.getHeight());
                return;
            }
            Size size = this.f47107r;
            if (size != null && this.f47067c.getWidth() != 0 && this.f47067c.getHeight() != 0) {
                int min = Math.min(this.f47110s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f47067c;
                boolean z10 = false;
                if (this.f47101p != null && textureView.getDisplay() != null && (num = (Integer) this.f47101p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f47067c.getWidth() * 0.5f, this.f47067c.getHeight() * 0.5f);
                this.f47067c.setTransform(matrix);
                this.f47085j.b("preview transform: view=" + this.f47067c.getWidth() + "x" + this.f47067c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: si.j.g():void");
    }

    public final void h(i iVar) {
        this.f47098o = iVar.f47050a;
        this.H = iVar.f47051b;
        this.f47101p = iVar.f47052c;
        this.f47104q = iVar.d;
        this.f47107r = iVar.e;
        this.f47110s = iVar.f47053f;
        this.I = iVar.f47054g;
        this.J = iVar.h;
        this.K = iVar.f47055i;
        this.L = iVar.f47056j;
        this.O = iVar.f47057k;
        this.f47075f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f47095n;
        if (handler != null) {
            handler.removeCallbacks(this.f47094m1);
        }
        this.f47123y = null;
    }

    public final i l() {
        return new i(this.f47098o, this.H, this.f47101p, this.f47104q, this.f47107r, this.f47110s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f47126z0 = false;
        this.f47124y0 = false;
        this.f47117u0 = null;
        this.f47118v0 = null;
        this.f47068c0 = false;
        this.Z = false;
        this.f47062a0 = false;
        this.C = null;
        this.Q = false;
        this.f47122x0 = null;
        this.f47108r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f47125z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f47125z = null;
        }
        CameraDevice cameraDevice2 = this.f47111s0;
        this.f47111s0 = null;
        this.f47120w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f47114t0;
        this.f47114t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        t tVar = this.f47119w;
        if (tVar != null) {
            tVar.l();
            this.f47119w = null;
        }
        Surface surface = this.f47113t;
        if (surface != null) {
            surface.release();
            this.f47113t = null;
        }
        this.f47116u = null;
        this.v = null;
        this.m0 = false;
        this.f47096n0 = false;
        this.f47099o0 = false;
        this.f47102p0 = false;
        this.f47105q0 = false;
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
        this.f47102p0 = false;
    }

    public final void t() {
        String str;
        this.f47122x0 = null;
        this.D0 = false;
        if (this.f47089k0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f47085j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f47125z;
        if (cameraDevice != null) {
            this.f47125z = null;
            this.B0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.W) {
            this.X = false;
            I();
        }
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: si.j.u():void");
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        String str;
        boolean z10;
        Surface surface3;
        m0 m0Var;
        i iVar;
        Surface surface4;
        this.f47096n0 = this.m0;
        w wVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f47074f;
        int i12 = this.J.f47183a;
        n nVar = this.f47085j;
        w0 w0Var = this.f47088k;
        Objects.requireNonNull(w0Var);
        m mVar = new m(wVar, j10, i10, i11, i12, nVar, new c(w0Var));
        this.f47121x = mVar;
        synchronized (mVar) {
            if (mVar.f47165y) {
                surface = mVar.f47157p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f47154m.start();
                    mVar.f47165y = true;
                    mVar.f47148f.b("codecs prepared: video=" + mVar.f47154m.getName() + ", audio=" + mVar.f47155n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f47157p;
                } catch (IOException | RuntimeException e) {
                    mVar.j();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f47107r;
        if (this.f47096n0) {
            surface2 = this.f47113t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.m0;
        int i13 = this.e;
        int i14 = this.f47110s;
        boolean D = D(this.f47101p);
        boolean z12 = this.f47082i;
        n nVar2 = this.f47085j;
        m mVar2 = this.f47121x;
        w0 w0Var2 = this.f47088k;
        Objects.requireNonNull(w0Var2);
        t tVar = new t(size, surface5, surface2, z11, i13, i14, D, z12, nVar2, mVar2, new c(w0Var2));
        this.f47119w = tVar;
        tVar.f47231t0 = new a(this, 2);
        t tVar2 = this.f47119w;
        if (tVar2.f47227r0) {
            surface3 = tVar2.f47235w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar2.f47230t = handlerThread;
            handlerThread.start();
            tVar2.f47225q0 = System.nanoTime();
            n nVar3 = tVar2.f47209i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar2.f47196a);
            sb2.append(", crop=");
            sb2.append(tVar2.f47211j);
            sb2.append(", output=");
            sb2.append(tVar2.f47206g);
            sb2.append("x");
            sb2.append(tVar2.f47206g);
            sb2.append(", filter=");
            if (tVar2.f47211j == tVar2.f47206g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(tVar2.h);
            sb2.append(", dualInput=");
            sb2.append(tVar2.f47204f);
            sb2.append(", glPreview=");
            if (tVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(tVar2.f47230t.getLooper());
            tVar2.f47232u = handler;
            handler.post(new p2.b(25, tVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar2.f47236w0 == null) {
                    surface3 = tVar2.f47235w;
                } else {
                    RuntimeException runtimeException = tVar2.f47236w0;
                    tVar2.f47236w0 = null;
                    tVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                tVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f47116u = surface3;
        if (this.m0) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f47167a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f47168b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f47083i0;
            } else {
                iVar = this.f47086j0;
            }
            if (iVar != null) {
                t tVar3 = this.f47119w;
                Size size2 = iVar.e;
                int i15 = iVar.f47053f;
                boolean D2 = D(iVar.f47052c);
                Handler handler2 = tVar3.f47232u;
                if (tVar3.f47227r0 && tVar3.f47204f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new q(tVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
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
                t tVar4 = this.f47119w;
                if (tVar4.f47204f && (surface4 = tVar4.f47239y) != null) {
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
                this.f47085j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                t tVar = this.f47119w;
                if (tVar != null) {
                    tVar.l();
                    this.f47119w = null;
                }
                m mVar = this.f47121x;
                if (mVar != null) {
                    mVar.q();
                    this.f47121x = null;
                }
                this.f47116u = null;
                this.v = null;
                this.m0 = false;
                this.f47096n0 = false;
                this.f47089k0 = false;
                this.f47092l0 = true;
                surfaceTexture.setDefaultBufferSize(this.f47104q.getWidth(), this.f47104q.getHeight());
                v();
                return;
            }
            throw e;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, si.i r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: si.j.x(android.hardware.camera2.CameraDevice, android.view.Surface, si.i, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.f47092l0 = true;
        this.f47089k0 = false;
        this.m0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f47085j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f47111s0;
        this.f47111s0 = null;
        this.f47120w0 = null;
        if (cameraDevice != null && cameraDevice != this.f47125z) {
            this.f47114t0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
