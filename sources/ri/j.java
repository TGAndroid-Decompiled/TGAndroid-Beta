package ri;

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
import di.e4;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import m.h3;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.gm0;
public final class j {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public boolean D0;
    public v E;
    public long E0;
    public volatile k0 F;
    public long F0;
    public k0 G;
    public long G0;
    public k0 H;
    public long H0;
    public l0 I;
    public long I0;
    public m0 J;
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
    public final Context f44550a;
    public volatile boolean f44551a0;
    public long f44552a1;
    public final CameraManager f44553b;
    public volatile boolean f44554b0;
    public long f44555b1;
    public final TextureView f44556c;
    public volatile boolean f44557c0;
    public long f44558c1;
    public final p0 d;
    public boolean f44559d0;
    public double f44560d1;
    public final int e;
    public boolean f44561e0;
    public long f44562e1;
    public final int f44563f;
    public boolean f44564f0;
    public long f44565f1;
    public final l0 f44566g;
    public boolean f44567g0;
    public long f44568g1;
    public final m0 h;
    public boolean f44569h0;
    public long f44570h1;
    public final boolean f44571i;
    public i f44572i0;
    public long f44573i1;
    public final n f44574j;
    public i f44575j0;
    public long f44576j1;
    public final m.h f44577k;
    public boolean f44578k0;
    public long f44579k1;
    public boolean f44581l0;
    public final e4 l1;
    public HandlerThread f44582m;
    public boolean m0;
    public final a f44583m1;
    public Handler f44584n;
    public boolean f44585n0;
    public final a f44586n1;
    public String f44587o;
    public boolean f44588o0;
    public final x50 f44589o1;
    public CameraCharacteristics f44590p;
    public boolean f44591p0;
    public final e f44592p1;
    public Size f44593q;
    public boolean f44594q0;
    public final e f44595q1;
    public volatile Size f44596r;
    public boolean f44597r0;
    public final f f44598r1;
    public volatile int f44599s;
    public CameraDevice f44600s0;
    public final f f44601s1;
    public Surface f44602t;
    public CameraDevice f44603t0;
    public final g f44604t1;
    public Surface f44605u;
    public CameraDevice f44606u0;
    public Surface v;
    public CameraDevice f44607v0;
    public s f44608w;
    public i f44609w0;
    public m f44610x;
    public k0 f44611x0;
    public m f44612y;
    public boolean f44613y0;
    public CameraDevice f44614z;
    public boolean f44615z0;
    public final Rect f44580l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, p0 p0Var, int i10, l0 l0Var, m0 m0Var, boolean z10, n nVar, m.h hVar) {
        e4 e4Var = new e4(this, 2);
        this.l1 = e4Var;
        this.f44583m1 = new a(this, 4);
        this.f44586n1 = new a(this, 5);
        this.f44589o1 = new x50(this, 4);
        this.f44592p1 = new e(this, 0);
        this.f44595q1 = new e(this, 1);
        this.f44598r1 = new f(this, 0);
        this.f44601s1 = new f(this, 1);
        this.f44604t1 = new g(this);
        this.f44550a = context.getApplicationContext();
        this.f44553b = (CameraManager) context.getSystemService("camera");
        this.f44556c = textureView;
        this.d = p0Var;
        this.e = p0Var.f44668a;
        this.f44563f = i10;
        this.f44566g = l0Var;
        this.h = m0Var;
        this.f44571i = z10;
        this.f44574j = nVar;
        this.f44577k = hVar;
        textureView.addOnLayoutChangeListener(e4Var);
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
        CameraDevice cameraDevice = jVar.f44614z;
        CameraDevice cameraDevice2 = jVar.f44600s0;
        if (jVar.m0 && cameraDevice != null && cameraDevice2 != null && jVar.f44605u != null && jVar.v != null && jVar.A == null && jVar.B == null) {
            jVar.f44588o0 = false;
            jVar.f44591p0 = false;
            try {
                jVar.G0 = SystemClock.elapsedRealtimeNanos();
                n nVar = jVar.f44574j;
                nVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.f44596r + ", fpsRange=" + jVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(jVar.f44605u), jVar.f44601s1, jVar.f44584n);
                cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.f44598r1, jVar.f44584n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                jVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == jVar.f44614z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && jVar.m0) {
            n nVar = jVar.f44574j;
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
            jVar.f44578k0 = false;
            jVar.f44581l0 = true;
            jVar.f44597r0 = false;
            jVar.f44600s0 = null;
            jVar.f44609w0 = null;
            jVar.r();
            jVar.f44603t0 = cameraDevice;
            if (!jVar.V || jVar.f44614z == null || jVar.A != null || jVar.X) {
                z11 = false;
            }
            jVar.f44613y0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.f44600s0) {
            jVar.f44600s0 = null;
        }
        jVar.f44597r0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.f44614z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(t8.b.h("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.f44611x0 != null) {
            jVar.t();
        } else if (jVar.V && jVar.f44614z != null && jVar.A == null && !jVar.X) {
            jVar.f44574j.b("warm camera failed during startup; configuring active camera only");
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
        if (cameraDevice == jVar.f44606u0) {
            jVar.f44606u0 = null;
        }
        if (cameraDevice == jVar.f44607v0) {
            jVar.f44607v0 = null;
        }
        n nVar = jVar.f44574j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.f44606u0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f44607v0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f44603t0) {
            return false;
        }
        jVar.f44603t0 = null;
        n nVar = jVar.f44574j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f44613y0) {
            jVar.f44613y0 = false;
            if (jVar.V && !jVar.f44554b0 && jVar.f44614z != null) {
                jVar.f44574j.b("retrying capture session after standby camera closed");
                jVar.u();
                return true;
            }
            return true;
        } else if (jVar.X && jVar.f44611x0 != null) {
            jVar.f44574j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(j jVar) {
        k0 k0Var = jVar.f44611x0;
        if (k0Var != null && jVar.m0 && jVar.f44588o0 && jVar.f44591p0) {
            jVar.f44611x0 = null;
            if (!jVar.b0(k0Var)) {
                jVar.X = false;
                jVar.a0(k0Var);
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

    public static j6.l m(Size[] sizeArr, p0 p0Var, l0 l0Var) {
        int i10;
        j6.l o10;
        l0 l0Var2;
        j6.l o11;
        l0 l0Var3 = l0.f44628c;
        if (l0Var == l0Var3) {
            i10 = p0Var.f44668a;
        } else {
            p0 p0Var2 = p0.P480;
            l0 l0Var4 = l0.f44626a;
            if (p0Var == p0Var2) {
                if (l0Var == l0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (l0Var != l0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l o12 = o(sizeArr, i10, l0Var);
        if (o12 != null) {
            return o12;
        }
        if (p0Var == p0.P360 && l0Var == (l0Var2 = l0.f44627b) && (o11 = o(sizeArr, 480, l0Var2)) != null) {
            return o11;
        }
        int i11 = p0Var.f44668a;
        if (l0Var != l0Var3 && (o10 = o(sizeArr, i11, l0Var3)) != null) {
            return o10;
        }
        int i12 = p0Var.f44668a;
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
        return new j6.l(n(sizeArr, size), size, l0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static j6.l o(Size[] sizeArr, int i10, l0 l0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.l lVar2 = new j6.l(n10, size, l0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f12877b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) lVar.f12878c;
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
            this.f44574j.b(sb2.toString());
            this.m0 = false;
            this.f44578k0 = false;
            this.f44581l0 = true;
            this.f44588o0 = false;
            this.f44591p0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f44600s0;
                this.f44600s0 = null;
                this.f44609w0 = null;
                if (cameraDevice != null) {
                    this.f44603t0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f44603t0 == null && this.X && this.f44611x0 != null) {
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
        m mVar = this.f44610x;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.f44650z;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f44564f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f44564f0 = true;
        q();
        j6.l lVar = this.L;
        if (lVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = m0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f44590p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f44593q = (Size) lVar.f12877b;
        this.f44596r = (Size) lVar.f12878c;
        this.f44599s = lVar.f12876a;
        this.I = (l0) lVar.d;
        this.f44572i0 = null;
        this.f44575j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f44556c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f44593q.getWidth(), this.f44593q.getHeight());
        }
        s sVar = this.f44608w;
        if (sVar != null) {
            sVar.l();
            this.f44608w = null;
        }
        m mVar2 = this.f44610x;
        if (mVar2 != null) {
            mVar2.q();
            this.f44610x = null;
        }
        this.f44605u = null;
        try {
            v();
            O();
            n nVar = this.f44574j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f44593q);
            sb2.append(", recording=");
            sb2.append(this.f44596r);
            sb2.append(", crop=");
            sb2.append(this.f44599s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar.b(sb2.toString());
            Handler handler = this.f44584n;
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
        for (Set<String> set : this.f44553b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == k0.f44622b && (cameraCharacteristics = this.f44590p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.f44615z0) {
            if (cameraDevice == this.f44606u0 || cameraDevice == this.f44607v0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.f44615z0 && this.f44606u0 == null && this.f44607v0 == null) {
            this.f44615z0 = false;
            this.X = false;
            n nVar = this.f44574j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (this.V && !this.f44554b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f44614z == null) {
            if (f0.c.b(this.f44550a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f44550a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.C0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.C0);
                    if (this.f44614z == null && this.f44610x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f44556c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.m0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f44556c.getWidth(), this.f44556c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f44593q.getWidth(), this.f44593q.getHeight());
                        }
                        if (this.f44602t == null) {
                            this.f44602t = new Surface(surfaceTexture);
                        }
                        if (this.f44610x == null) {
                            w(surfaceTexture);
                        } else {
                            s sVar = this.f44608w;
                            if (sVar != null) {
                                sVar.n(this.f44596r, this.f44599s, D(this.f44590p));
                                Surface surface = null;
                                if (!this.m0 && this.f44594q0) {
                                    this.f44594q0 = false;
                                    s sVar2 = this.f44608w;
                                    Handler handler = sVar2.f44733u;
                                    if (sVar2.f44728r0 && handler != null) {
                                        handler.post(new gm0((Object) sVar2, false, (Object) null, 14));
                                    }
                                }
                                s sVar3 = this.f44608w;
                                Surface surface2 = sVar3.f44736w;
                                if (surface2 != null) {
                                    this.f44605u = surface2;
                                    if (this.m0 && (!sVar3.f44705f || (surface = sVar3.f44740y) == null)) {
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
                        n nVar = this.f44574j;
                        nVar.b("camera open requested: id=" + this.f44587o + ", preview=" + this.f44593q + ", recording=" + this.f44596r + ", crop=" + this.f44599s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.m0);
                        this.f44553b.openCamera(this.f44587o, this.f44592p1, this.f44584n);
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
        k0 k0Var;
        i iVar;
        if (this.f44578k0 && !this.f44581l0 && !(z10 = this.f44597r0) && (cameraDevice = this.f44600s0) == null) {
            k0 k0Var2 = this.H;
            k0 k0Var3 = k0.f44621a;
            if (k0Var2 == k0Var3) {
                k0Var = k0.f44622b;
            } else {
                k0Var = k0Var3;
            }
            if (k0Var == k0Var3) {
                iVar = this.f44572i0;
            } else {
                iVar = this.f44575j0;
            }
            if (iVar != null) {
                String str = iVar.f44533a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f44609w0 = iVar;
                        this.f44597r0 = true;
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f44574j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f44534b);
                        this.f44553b.openCamera(str, this.f44595q1, this.f44584n);
                    } catch (Exception e) {
                        this.f44597r0 = false;
                        y("open request failed", e);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f44581l0) {
            return;
        }
        if (this.f44578k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f44574j;
        if (i10 < 30) {
            this.f44581l0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l4 = l();
        m0 m0Var = l4.h;
        String str2 = l4.f44533a;
        k0 k0Var = l4.f44534b;
        k0 k0Var2 = k0.f44621a;
        if (k0Var == k0Var2) {
            k0Var2 = k0.f44622b;
        }
        try {
            try {
                S(k0Var2);
                i l10 = l();
                m0 m0Var2 = l10.h;
                String str3 = l10.f44533a;
                boolean E = E(str2, str3);
                this.f44578k0 = E;
                if (E && m0Var != m0Var2) {
                    this.f44578k0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f44536f + ", second=" + l10.e + "/" + l10.f44536f + ", firstFps=" + m0Var.f44653a + ", secondFps=" + m0Var2.f44653a);
                }
                boolean z10 = this.f44578k0;
                if (!z10) {
                    this.f44581l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f44578k0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f44578k0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.f44581l0 = true;
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
        if (this.f44615z0) {
            return;
        }
        this.f44615z0 = true;
        this.f44581l0 = true;
        this.f44578k0 = false;
        this.f44613y0 = false;
        this.f44611x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f44614z;
        this.f44606u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f44600s0;
        this.f44607v0 = cameraDevice2;
        this.f44614z = null;
        this.f44600s0 = null;
        this.f44609w0 = null;
        CameraDevice cameraDevice3 = this.f44603t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f44603t0 = null;
        }
        n nVar = this.f44574j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.f44606u0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        v.append(id2);
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f44607v0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        v.append(str3);
        v.append(", fps=");
        m0 m0Var = this.J;
        if (m0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(m0Var.f44653a);
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
        CameraDevice cameraDevice6 = this.f44606u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f44607v0;
        if (cameraDevice7 != null && cameraDevice7 != this.f44606u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f44556c.setSurfaceTextureListener(null);
        this.f44556c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.f44584n;
        HandlerThread handlerThread = this.f44582m;
        this.f44584n = null;
        this.f44582m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new org.telegram.ui.web.v(25, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f44574j.a("camera error", exc);
        m.h hVar = this.f44577k;
        ((r0) hVar.f14848b).f44680i.post(new org.telegram.ui.web.v(28, hVar, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f44552a1 = 0L;
        this.f44555b1 = 0L;
        this.f44558c1 = 0L;
        this.f44560d1 = 0.0d;
        this.f44562e1 = 0L;
        this.f44565f1 = 0L;
        this.f44568g1 = 0L;
        this.f44570h1 = 0L;
        this.f44573i1 = 0L;
        this.f44576j1 = 0L;
        this.f44579k1 = 0L;
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

    public final h3 Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        j6.l lVar2;
        int i10;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar = this.f44574j;
        m0 m0Var = this.h;
        m0 m0Var2 = m0.FPS_30;
        if (m0Var != m0Var2) {
            if (this.f44569h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                lVar2 = lVar;
            } else {
                int i11 = m0Var.f44653a;
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
                        j6.l m10 = m(sizeArr2, this.d, this.f44566g);
                        nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new h3(m0.FPS_60, C, m10, 27);
                    } catch (RuntimeException unused) {
                        nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new h3(m0Var2, C2, lVar, 27);
            }
        } else {
            rangeArr = rangeArr4;
            lVar2 = lVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(m0Var.f44653a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        if (this.f44569h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        nVar.b(v.toString());
        return new h3(m0Var2, C3, lVar2, 27);
    }

    public final void R(String str, Exception exc) {
        this.f44613y0 = true;
        y(str, exc);
        if (this.f44603t0 == null) {
            this.f44613y0 = false;
            u();
            return;
        }
        this.f44574j.b("capture session retry waiting for standby camera close: id=" + this.f44603t0.getId());
    }

    public final void S(ri.k0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: ri.j.S(ri.k0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f44584n;
        if (this.V && handler != null) {
            handler.post(new zr0(16, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f44584n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f44586n1);
            handler.post(this.f44586n1);
            return true;
        }
        return false;
    }

    public final void X(v vVar, long j10, k0 k0Var) {
        if (this.f44582m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f44582m = handlerThread;
            handlerThread.start();
            this.f44584n = new Handler(this.f44582m.getLooper());
        }
        this.E = vVar;
        this.M = j10;
        this.F = k0Var;
        this.V = true;
        this.f44554b0 = false;
        this.f44612y = null;
        this.f44557c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        n nVar = this.f44574j;
        nVar.b("camera segment start: facing=" + k0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f44556c.isAvailable());
        this.f44556c.setSurfaceTextureListener(this.f44589o1);
        Handler handler = this.f44584n;
        if (this.V && handler != null && this.f44556c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f44584n;
        if (!this.V || this.f44554b0 || handler == null) {
            return false;
        }
        this.f44554b0 = true;
        this.f44557c0 = false;
        this.f44574j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(k0 k0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (k0Var == k0.f44621a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f44553b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((m0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f44566g)).f14850b) == m0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(ri.k0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: ri.j.a0(ri.k0):void");
    }

    public final boolean b0(k0 k0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder x10;
        if (!this.m0 || !this.f44588o0 || !this.f44591p0 || (cameraDevice = this.f44614z) == null || (cameraDevice2 = this.f44600s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f44609w0) == null || iVar.f44534b != k0Var || this.f44608w == null) {
            return false;
        }
        this.f44614z = cameraDevice2;
        this.f44600s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f44605u;
        this.f44605u = this.v;
        this.v = surface;
        if (this.G == k0.f44621a) {
            iVar2 = this.f44572i0;
        } else {
            iVar2 = this.f44575j0;
        }
        this.f44609w0 = iVar2;
        h(iVar);
        this.G = k0Var;
        try {
            try {
                x10 = x(this.f44614z, this.f44605u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e7) {
            e = e7;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f44604t1, this.f44584n);
            i iVar3 = this.f44609w0;
            if (iVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f44600s0, this.v, iVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f44604t1, this.f44584n);
            }
            boolean z10 = !this.f44594q0;
            this.f44594q0 = z10;
            long j10 = this.H0;
            s sVar = this.f44608w;
            b bVar = new b(this, k0Var, j10, 0);
            Handler handler = sVar.f44733u;
            if (sVar.f44728r0 && handler != null) {
                handler.post(new gm0(sVar, z10, bVar, 14));
            }
            this.f44588o0 = true;
            this.f44591p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.f44551a0 = false;
            O();
            this.f44574j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f44614z.getId() + ", standbyId=" + this.f44600s0.getId() + ", input=" + (this.f44594q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.f44556c.post(new a(this, 1));
            m.h hVar = this.f44577k;
            ((r0) hVar.f14848b).f44680i.post(new gm0((Object) hVar, (Object) new h(this.G, this.I, this.J, this.f44593q, this.f44596r, this.O, F()), true, 15));
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

    public final boolean c0(k0 k0Var) {
        String id2;
        CameraDevice cameraDevice = this.f44600s0;
        i iVar = this.f44609w0;
        if (cameraDevice == null || iVar == null || iVar.f44534b != k0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f44556c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f44614z;
        k0 k0Var2 = this.G;
        if (k0Var2 != null) {
            if (k0Var2 == k0.f44621a) {
                iVar2 = this.f44572i0;
            } else {
                iVar2 = this.f44575j0;
            }
        }
        q();
        this.f44600s0 = cameraDevice2;
        this.f44609w0 = iVar2;
        this.f44614z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.f44593q.getWidth(), this.f44593q.getHeight());
        s sVar = this.f44608w;
        if (sVar != null) {
            sVar.n(this.f44596r, this.f44599s, D(this.f44590p));
            Surface surface = this.f44608w.f44736w;
            if (surface != null) {
                this.f44605u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.D0 = true;
        n nVar = this.f44574j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f44587o);
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
        if (this.f44557c0) {
            if (this.f44585n0) {
                this.f44556c.setTransform(new Matrix());
                this.f44574j.b("preview transform: GL output, identity matrix, view=" + this.f44556c.getWidth() + "x" + this.f44556c.getHeight());
                return;
            }
            Size size = this.f44596r;
            if (size != null && this.f44556c.getWidth() != 0 && this.f44556c.getHeight() != 0) {
                int min = Math.min(this.f44599s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f44556c;
                boolean z10 = false;
                if (this.f44590p != null && textureView.getDisplay() != null && (num = (Integer) this.f44590p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f44556c.getWidth() * 0.5f, this.f44556c.getHeight() * 0.5f);
                this.f44556c.setTransform(matrix);
                this.f44574j.b("preview transform: view=" + this.f44556c.getWidth() + "x" + this.f44556c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: ri.j.g():void");
    }

    public final void h(i iVar) {
        this.f44587o = iVar.f44533a;
        this.H = iVar.f44534b;
        this.f44590p = iVar.f44535c;
        this.f44593q = iVar.d;
        this.f44596r = iVar.e;
        this.f44599s = iVar.f44536f;
        this.I = iVar.f44537g;
        this.J = iVar.h;
        this.K = iVar.f44538i;
        this.L = iVar.f44539j;
        this.O = iVar.f44540k;
        this.f44564f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f44584n;
        if (handler != null) {
            handler.removeCallbacks(this.f44583m1);
        }
        this.f44612y = null;
    }

    public final i l() {
        return new i(this.f44587o, this.H, this.f44590p, this.f44593q, this.f44596r, this.f44599s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f44615z0 = false;
        this.f44613y0 = false;
        this.f44606u0 = null;
        this.f44607v0 = null;
        this.f44557c0 = false;
        this.Z = false;
        this.f44551a0 = false;
        this.C = null;
        this.Q = false;
        this.f44611x0 = null;
        this.f44597r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f44614z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f44614z = null;
        }
        CameraDevice cameraDevice2 = this.f44600s0;
        this.f44600s0 = null;
        this.f44609w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f44603t0;
        this.f44603t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        s sVar = this.f44608w;
        if (sVar != null) {
            sVar.l();
            this.f44608w = null;
        }
        Surface surface = this.f44602t;
        if (surface != null) {
            surface.release();
            this.f44602t = null;
        }
        this.f44605u = null;
        this.v = null;
        this.m0 = false;
        this.f44585n0 = false;
        this.f44588o0 = false;
        this.f44591p0 = false;
        this.f44594q0 = false;
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
        this.f44591p0 = false;
    }

    public final void t() {
        String str;
        this.f44611x0 = null;
        this.D0 = false;
        if (this.f44578k0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f44574j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f44614z;
        if (cameraDevice != null) {
            this.f44614z = null;
            this.B0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.W) {
            this.X = false;
            I();
        }
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: ri.j.u():void");
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        String str;
        boolean z10;
        Surface surface3;
        k0 k0Var;
        i iVar;
        Surface surface4;
        this.f44585n0 = this.m0;
        v vVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f44563f;
        int i12 = this.J.f44653a;
        n nVar = this.f44574j;
        m.h hVar = this.f44577k;
        Objects.requireNonNull(hVar);
        m mVar = new m(vVar, j10, i10, i11, i12, nVar, new c(hVar));
        this.f44610x = mVar;
        synchronized (mVar) {
            if (mVar.f44649y) {
                surface = mVar.f44641p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f44638m.start();
                    mVar.f44649y = true;
                    mVar.f44632f.b("codecs prepared: video=" + mVar.f44638m.getName() + ", audio=" + mVar.f44639n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f44641p;
                } catch (IOException | RuntimeException e) {
                    mVar.j();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f44596r;
        if (this.f44585n0) {
            surface2 = this.f44602t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.m0;
        int i13 = this.e;
        int i14 = this.f44599s;
        boolean D = D(this.f44590p);
        boolean z12 = this.f44571i;
        n nVar2 = this.f44574j;
        m mVar2 = this.f44610x;
        m.h hVar2 = this.f44577k;
        Objects.requireNonNull(hVar2);
        s sVar = new s(size, surface5, surface2, z11, i13, i14, D, z12, nVar2, mVar2, new c(hVar2));
        this.f44608w = sVar;
        sVar.f44732t0 = new a(this, 2);
        s sVar2 = this.f44608w;
        if (sVar2.f44728r0) {
            surface3 = sVar2.f44736w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            sVar2.f44731t = handlerThread;
            handlerThread.start();
            sVar2.f44726q0 = System.nanoTime();
            n nVar3 = sVar2.f44710i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(sVar2.f44697a);
            sb2.append(", crop=");
            sb2.append(sVar2.f44712j);
            sb2.append(", output=");
            sb2.append(sVar2.f44707g);
            sb2.append("x");
            sb2.append(sVar2.f44707g);
            sb2.append(", filter=");
            if (sVar2.f44712j == sVar2.f44707g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(sVar2.h);
            sb2.append(", dualInput=");
            sb2.append(sVar2.f44705f);
            sb2.append(", glPreview=");
            if (sVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(sVar2.f44731t.getLooper());
            sVar2.f44733u = handler;
            handler.post(new org.telegram.ui.web.v(26, sVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (sVar2.f44737w0 == null) {
                    surface3 = sVar2.f44736w;
                } else {
                    RuntimeException runtimeException = sVar2.f44737w0;
                    sVar2.f44737w0 = null;
                    sVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                sVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f44605u = surface3;
        if (this.m0) {
            k0 k0Var2 = this.H;
            k0 k0Var3 = k0.f44621a;
            if (k0Var2 == k0Var3) {
                k0Var = k0.f44622b;
            } else {
                k0Var = k0Var3;
            }
            if (k0Var == k0Var3) {
                iVar = this.f44572i0;
            } else {
                iVar = this.f44575j0;
            }
            if (iVar != null) {
                s sVar3 = this.f44608w;
                Size size2 = iVar.e;
                int i15 = iVar.f44536f;
                boolean D2 = D(iVar.f44535c);
                Handler handler2 = sVar3.f44733u;
                if (sVar3.f44728r0 && sVar3.f44705f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new p(sVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
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
                s sVar4 = this.f44608w;
                if (sVar4.f44705f && (surface4 = sVar4.f44740y) != null) {
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
                this.f44574j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                s sVar = this.f44608w;
                if (sVar != null) {
                    sVar.l();
                    this.f44608w = null;
                }
                m mVar = this.f44610x;
                if (mVar != null) {
                    mVar.q();
                    this.f44610x = null;
                }
                this.f44605u = null;
                this.v = null;
                this.m0 = false;
                this.f44585n0 = false;
                this.f44578k0 = false;
                this.f44581l0 = true;
                surfaceTexture.setDefaultBufferSize(this.f44593q.getWidth(), this.f44593q.getHeight());
                v();
                return;
            }
            throw e;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, ri.i r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: ri.j.x(android.hardware.camera2.CameraDevice, android.view.Surface, ri.i, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.f44581l0 = true;
        this.f44578k0 = false;
        this.m0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f44574j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f44600s0;
        this.f44600s0 = null;
        this.f44609w0 = null;
        if (cameraDevice != null && cameraDevice != this.f44614z) {
            this.f44603t0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
