package wi;

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
import gi.m3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.up0;
import org.telegram.ui.a60;
public final class j {
    public CameraCaptureSession A;
    public boolean A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public long D0;
    public w E;
    public boolean E0;
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
    public l6.n L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public long N0;
    public long O0;
    public boolean P;
    public double P0;
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
    public final Context f57859a;
    public volatile boolean f57860a0;
    public long f57861a1;
    public final CameraManager f57862b;
    public volatile boolean f57863b0;
    public long f57864b1;
    public final TextureView f57865c;
    public volatile boolean f57866c0;
    public long f57867c1;
    public final r0 d;
    public boolean f57868d0;
    public long f57869d1;
    public final int f57870e;
    public boolean f57871e0;
    public double f57872e1;
    public final int f57873f;
    public boolean f57874f0;
    public long f57875f1;
    public final n0 f57876g;
    public boolean f57877g0;
    public long f57878g1;
    public final o0 h;
    public boolean f57879h0;
    public long f57880h1;
    public final boolean f57881i;
    public int f57882i0;
    public long f57883i1;
    public final n f57884j;
    public i f57885j0;
    public long f57886j1;
    public final nh f57887k;
    public i f57888k0;
    public long k1;
    public boolean f57890l0;
    public long f57891l1;
    public HandlerThread f57892m;
    public boolean m0;
    public final m3 m1;
    public Handler f57893n;
    public boolean f57894n0;
    public final a f57895n1;
    public String f57896o;
    public boolean f57897o0;
    public final a f57898o1;
    public CameraCharacteristics f57899p;
    public boolean f57900p0;
    public final s30 f57901p1;
    public Size f57902q;
    public boolean f57903q0;
    public final e f57904q1;
    public volatile Size f57905r;
    public boolean f57906r0;
    public final e f57907r1;
    public volatile int f57908s;
    public boolean f57909s0;
    public final f f57910s1;
    public Surface f57911t;
    public CameraDevice f57912t0;
    public final f f57913t1;
    public Surface f57914u;
    public CameraDevice f57915u0;
    public final g f57916u1;
    public Surface v;
    public CameraDevice f57917v0;
    public s f57918w;
    public CameraDevice f57919w0;
    public m f57920x;
    public i f57921x0;
    public m f57922y;
    public m0 f57923y0;
    public CameraDevice f57924z;
    public boolean f57925z0;
    public final Rect f57889l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, r0 r0Var, int i3, n0 n0Var, o0 o0Var, boolean z10, n nVar, nh nhVar) {
        m3 m3Var = new m3(this, 2);
        this.m1 = m3Var;
        this.f57895n1 = new a(this, 4);
        this.f57898o1 = new a(this, 5);
        this.f57901p1 = new s30(this, 4);
        this.f57904q1 = new e(this, 0);
        this.f57907r1 = new e(this, 1);
        this.f57910s1 = new f(this, 0);
        this.f57913t1 = new f(this, 1);
        this.f57916u1 = new g(this);
        this.f57859a = context.getApplicationContext();
        this.f57862b = (CameraManager) context.getSystemService("camera");
        this.f57865c = textureView;
        this.d = r0Var;
        this.f57870e = r0Var.f58000a;
        this.f57873f = i3;
        this.f57876g = n0Var;
        this.h = o0Var;
        this.f57881i = z10;
        this.f57884j = nVar;
        this.f57887k = nhVar;
        textureView.addOnLayoutChangeListener(m3Var);
    }

    public static Range C(Range[] rangeArr, int i3) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        int i10 = i3 / 2;
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i3))) {
                if (((Integer) range3.getUpper()).intValue() == i3 && ((Integer) range3.getLower()).intValue() >= i10 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
                if (range2 == null || ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue() || (((Integer) range3.getLower()).equals(range2.getLower()) && ((Integer) range3.getUpper()).intValue() < ((Integer) range2.getUpper()).intValue())) {
                    range2 = range3;
                }
            }
        }
        if (range != null) {
            return range;
        }
        return range2;
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
        CameraDevice cameraDevice = jVar.f57924z;
        CameraDevice cameraDevice2 = jVar.f57912t0;
        if (jVar.f57894n0 && cameraDevice != null && cameraDevice2 != null && jVar.f57914u != null && jVar.v != null && jVar.A == null && jVar.B == null) {
            jVar.f57900p0 = false;
            jVar.f57903q0 = false;
            try {
                jVar.H0 = SystemClock.elapsedRealtimeNanos();
                n nVar = jVar.f57884j;
                nVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.f57905r + ", fpsRange=" + jVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(jVar.f57914u), jVar.f57913t1, jVar.f57893n);
                cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.f57910s1, jVar.f57893n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                jVar.A("session request failed", e10, false);
            }
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == jVar.f57924z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && jVar.f57894n0) {
            n nVar = jVar.f57884j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            nVar.b(sb2.toString());
            jVar.f57894n0 = false;
            jVar.f57890l0 = false;
            jVar.m0 = true;
            jVar.f57909s0 = false;
            jVar.f57912t0 = null;
            jVar.f57921x0 = null;
            jVar.r();
            jVar.f57915u0 = cameraDevice;
            if (!jVar.V || jVar.f57924z == null || jVar.A != null || jVar.X) {
                z11 = false;
            }
            jVar.f57925z0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.f57912t0) {
            jVar.f57912t0 = null;
        }
        jVar.f57909s0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.f57924z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(t4.c.f("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.f57923y0 != null) {
            jVar.t();
        } else if (jVar.V && jVar.f57924z != null && jVar.A == null && !jVar.X) {
            jVar.f57884j.b("warm camera failed during startup; configuring active camera only");
            jVar.u();
        }
    }

    public static String c(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
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
        if (cameraDevice == jVar.f57917v0) {
            jVar.f57917v0 = null;
        }
        if (cameraDevice == jVar.f57919w0) {
            jVar.f57919w0 = null;
        }
        n nVar = jVar.f57884j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.f57917v0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f57919w0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f57915u0) {
            return false;
        }
        jVar.f57915u0 = null;
        n nVar = jVar.f57884j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f57925z0) {
            jVar.f57925z0 = false;
            if (jVar.V && !jVar.f57863b0 && jVar.f57924z != null) {
                jVar.f57884j.b("retrying capture session after standby camera closed");
                jVar.u();
                return true;
            }
            return true;
        } else if (jVar.X && jVar.f57923y0 != null) {
            jVar.f57884j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(j jVar) {
        m0 m0Var = jVar.f57923y0;
        if (m0Var != null && jVar.f57894n0 && jVar.f57900p0 && jVar.f57903q0) {
            jVar.f57923y0 = null;
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

    public static l6.n m(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i3;
        l6.n o10;
        n0 n0Var2;
        l6.n o11;
        n0 n0Var3 = n0.f57981c;
        if (n0Var == n0Var3) {
            i3 = r0Var.f58000a;
        } else {
            r0 r0Var2 = r0.P480;
            n0 n0Var4 = n0.f57979a;
            if (r0Var == r0Var2) {
                if (n0Var == n0Var4) {
                    i3 = 960;
                }
                i3 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i3 = 540;
                }
                i3 = 720;
            }
        }
        l6.n o12 = o(sizeArr, i3, n0Var);
        if (o12 != null) {
            return o12;
        }
        if (r0Var == r0.P360 && n0Var == (n0Var2 = n0.f57980b) && (o11 = o(sizeArr, 480, n0Var2)) != null) {
            return o11;
        }
        int i10 = r0Var.f58000a;
        if (n0Var != n0Var3 && (o10 = o(sizeArr, i10, n0Var3)) != null) {
            return o10;
        }
        int i11 = r0Var.f58000a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (V(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i11 && (size == null || i(size2) < i(size))) {
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
        return new l6.n(n(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static l6.n o(Size[] sizeArr, int i3, n0 n0Var) {
        int compare;
        l6.n nVar = null;
        for (Size size : sizeArr) {
            int i10 = ((i3 * 15) / 100) + i3;
            int min = Math.min(1920, i3 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i3 && V <= i10 && max <= min) {
                Size n4 = n(sizeArr, size);
                l6.n nVar2 = new l6.n(n4, size, n0Var, i3);
                if (nVar != null) {
                    Size size2 = (Size) nVar.f18089b;
                    int abs = Math.abs(Math.min(n4.getWidth(), n4.getHeight()) - 720);
                    Size size3 = (Size) nVar.f18090c;
                    int abs2 = Math.abs(V(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long i11 = i(size) + i(n4);
                        long i12 = i(size3) + i(size2);
                        if (i11 != i12) {
                            compare = Long.compare(i11, i12);
                        } else {
                            compare = Long.compare(i(size), i(size3));
                        }
                    }
                    if (compare >= 0) {
                    }
                }
                nVar = nVar2;
            }
        }
        return nVar;
    }

    public static boolean s(int[] iArr, int i3) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i3) {
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
        if (this.f57894n0) {
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
            this.f57884j.b(sb2.toString());
            this.f57894n0 = false;
            this.f57890l0 = false;
            this.m0 = true;
            this.f57900p0 = false;
            this.f57903q0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f57912t0;
                this.f57912t0 = null;
                this.f57921x0 = null;
                if (cameraDevice != null) {
                    this.f57915u0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f57915u0 == null && this.X && this.f57923y0 != null) {
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
        m mVar = this.f57920x;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.E;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f57874f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f57874f0 = true;
        this.f57879h0 = true;
        q();
        l6.n nVar = this.L;
        if (nVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = o0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f57899p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f57902q = (Size) nVar.f18089b;
        this.f57905r = (Size) nVar.f18090c;
        this.f57908s = nVar.f18088a;
        this.I = (n0) nVar.d;
        this.f57885j0 = null;
        this.f57888k0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f57865c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f57902q.getWidth(), this.f57902q.getHeight());
        }
        s sVar = this.f57918w;
        if (sVar != null) {
            sVar.l();
            this.f57918w = null;
        }
        m mVar2 = this.f57920x;
        if (mVar2 != null) {
            mVar2.u();
            this.f57920x = null;
        }
        this.f57914u = null;
        try {
            v();
            O();
            n nVar2 = this.f57884j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f57902q);
            sb2.append(", recording=");
            sb2.append(this.f57905r);
            sb2.append(", crop=");
            sb2.append(this.f57908s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar2.b(sb2.toString());
            Handler handler = this.f57893n;
            if (this.V && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e10) {
            N(e10);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f57862b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == m0.f57974b && (cameraCharacteristics = this.f57899p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.A0) {
            if (cameraDevice == this.f57917v0 || cameraDevice == this.f57919w0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.A0 && this.f57917v0 == null && this.f57919w0 == null) {
            this.A0 = false;
            this.X = false;
            n nVar = this.f57884j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.I0));
            if (this.V && !this.f57863b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f57924z == null) {
            if (f0.d.b(this.f57859a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.d.b(this.f57859a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.D0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.D0);
                    if (this.f57924z == null && this.f57920x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f57865c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.f57894n0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f57865c.getWidth(), this.f57865c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f57902q.getWidth(), this.f57902q.getHeight());
                        }
                        if (this.f57911t == null) {
                            this.f57911t = new Surface(surfaceTexture);
                        }
                        if (this.f57920x == null) {
                            w(surfaceTexture);
                        } else {
                            s sVar = this.f57918w;
                            if (sVar != null) {
                                sVar.n(this.f57905r, this.f57908s, D(this.f57899p));
                                Surface surface = null;
                                if (!this.f57894n0 && this.f57906r0) {
                                    this.f57906r0 = false;
                                    s sVar2 = this.f57918w;
                                    Handler handler = sVar2.f58038u;
                                    if (sVar2.f58033r0 && handler != null) {
                                        handler.post(new a60((Object) sVar2, false, (Object) null, 17));
                                    }
                                }
                                s sVar3 = this.f57918w;
                                Surface surface2 = sVar3.f58041w;
                                if (surface2 != null) {
                                    this.f57914u = surface2;
                                    if (this.f57894n0 && (!sVar3.f58010f || (surface = sVar3.f58045y) == null)) {
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
                        this.G0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f57884j;
                        nVar.b("camera open requested: id=" + this.f57896o + ", preview=" + this.f57902q + ", recording=" + this.f57905r + ", crop=" + this.f57908s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.f57894n0);
                        this.f57862b.openCamera(this.f57896o, this.f57904q1, this.f57893n);
                    }
                } catch (Exception e10) {
                    this.W = false;
                    N(e10);
                }
            }
        }
    }

    public final void J() {
        boolean z10;
        CameraDevice cameraDevice;
        m0 m0Var;
        i iVar;
        if (this.f57890l0 && !this.m0 && !(z10 = this.f57909s0) && (cameraDevice = this.f57912t0) == null) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f57973a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f57974b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f57885j0;
            } else {
                iVar = this.f57888k0;
            }
            if (iVar != null) {
                String str = iVar.f57848a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f57921x0 = iVar;
                        this.f57909s0 = true;
                        this.B0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f57884j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f57849b);
                        this.f57862b.openCamera(str, this.f57907r1, this.f57893n);
                    } catch (Exception e10) {
                        this.f57909s0 = false;
                        y("open request failed", e10);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.m0) {
            return;
        }
        if (this.f57890l0) {
            this.f57894n0 = true;
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        n nVar = this.f57884j;
        if (i3 < 30) {
            this.m0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l10 = l();
        o0 o0Var = l10.h;
        String str2 = l10.f57848a;
        m0 m0Var = l10.f57849b;
        m0 m0Var2 = m0.f57973a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.f57974b;
        }
        try {
            try {
                S(m0Var2);
                i l11 = l();
                o0 o0Var2 = l11.h;
                String str3 = l11.f57848a;
                boolean E = E(str2, str3);
                this.f57890l0 = E;
                if (E && o0Var != o0Var2) {
                    this.f57890l0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l10.f57851e + "/" + l10.f57852f + ", second=" + l11.f57851e + "/" + l11.f57852f + ", firstFps=" + o0Var.f57986a + ", secondFps=" + o0Var2.f57986a);
                }
                boolean z10 = this.f57890l0;
                if (!z10) {
                    this.m0 = true;
                }
                this.f57894n0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f57890l0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f57890l0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                h(l10);
            } catch (Exception e10) {
                this.m0 = true;
                nVar.b("camera warm-switch capability unavailable: " + e10);
                h(l10);
            }
        } catch (Throwable th2) {
            h(l10);
            throw th2;
        }
    }

    public final void L(String str, Exception exc) {
        String id2;
        Object valueOf;
        String str2;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.m0 = true;
        this.f57890l0 = false;
        this.f57925z0 = false;
        this.f57923y0 = null;
        this.E0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f57924z;
        this.f57917v0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f57912t0;
        this.f57919w0 = cameraDevice2;
        this.f57924z = null;
        this.f57912t0 = null;
        this.f57921x0 = null;
        CameraDevice cameraDevice3 = this.f57915u0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f57915u0 = null;
        }
        n nVar = this.f57884j;
        StringBuilder u10 = a1.g.u("camera warm-switch recovery started: reason=", str, ", target=");
        u10.append(this.F);
        u10.append(", targetId=");
        CameraDevice cameraDevice4 = this.f57917v0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        u10.append(id2);
        u10.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f57919w0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        u10.append(str3);
        u10.append(", fps=");
        o0 o0Var = this.J;
        if (o0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(o0Var.f57986a);
        }
        u10.append(valueOf);
        u10.append(", switchElapsedMs=");
        u10.append(z(this.I0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        u10.append(str2);
        nVar.b(u10.toString());
        CameraDevice cameraDevice6 = this.f57917v0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f57919w0;
        if (cameraDevice7 != null && cameraDevice7 != this.f57917v0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f57865c.setSurfaceTextureListener(null);
        this.f57865c.removeOnLayoutChangeListener(this.m1);
        Handler handler = this.f57893n;
        HandlerThread handlerThread = this.f57892m;
        this.f57893n = null;
        this.f57892m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new u9.a(19, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f57884j.a("camera error", exc);
        nh nhVar = this.f57887k;
        ((t0) nhVar.f36540b).f58060i.post(new j0(nhVar, exc, 1));
    }

    public final void O() {
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f57861a1 = 0L;
        this.f57864b1 = 0L;
        this.f57867c1 = 0L;
        this.f57869d1 = 0L;
        this.f57872e1 = 0.0d;
        this.f57875f1 = 0L;
        this.f57878g1 = 0L;
        this.f57880h1 = 0L;
        this.f57883i1 = 0L;
        this.f57886j1 = 0L;
        this.k1 = 0L;
        this.f57891l1 = 0L;
    }

    public final void P() {
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0.0d;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
    }

    public final p7.d Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, l6.n nVar) {
        Range[] rangeArr;
        l6.n nVar2;
        int i3;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar3 = this.f57884j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.FPS_30;
        if (o0Var != o0Var2) {
            if (this.f57879h0) {
                rangeArr = rangeArr4;
                i3 = 30;
                nVar2 = nVar;
            } else {
                int i10 = o0Var.f57986a;
                Range C = C(rangeArr4, i10);
                if (C != null) {
                    ArrayList arrayList = new ArrayList(sizeArr.length);
                    int length = sizeArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        Size size = sizeArr[i11];
                        int i12 = i11;
                        int i13 = length;
                        long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                        if (outputMinFrameDuration > 0) {
                            rangeArr3 = rangeArr4;
                            if (outputMinFrameDuration > 1000000000 / i10) {
                                rangeArr4 = rangeArr3;
                                length = i13;
                                i11 = i12 + 1;
                            }
                        } else {
                            rangeArr3 = rangeArr4;
                        }
                        arrayList.add(size);
                        rangeArr4 = rangeArr3;
                        length = i13;
                        i11 = i12 + 1;
                    }
                    rangeArr2 = rangeArr4;
                    Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                    try {
                        l6.n m10 = m(sizeArr2, this.d, this.f57876g);
                        nVar3.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new p7.d(o0.FPS_60, C, m10, 18);
                    } catch (RuntimeException unused) {
                        nVar3.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar3.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar3.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + C2);
                return new p7.d(o0Var2, C2, nVar, 18);
            }
        } else {
            rangeArr = rangeArr4;
            nVar2 = nVar;
            i3 = 30;
        }
        Range C3 = C(rangeArr, i3);
        StringBuilder u10 = a1.g.u("fps selection: id=", str, ", requested=");
        u10.append(o0Var.f57986a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        if (this.f57879h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        nVar3.b(u10.toString());
        return new p7.d(o0Var2, C3, nVar2, 18);
    }

    public final void R(String str, Exception exc) {
        this.f57925z0 = true;
        y(str, exc);
        if (this.f57915u0 == null) {
            this.f57925z0 = false;
            u();
            return;
        }
        this.f57884j.b("capture session retry waiting for standby camera close: id=" + this.f57915u0.getId());
    }

    public final void S(wi.m0 r32) {
        throw new UnsupportedOperationException("Method not decompiled: wi.j.S(wi.m0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f57893n;
        if (this.V && handler != null) {
            handler.post(new up0(16, this, z10));
        }
    }

    public final boolean U(float f10) {
        this.N = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.f57893n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f57898o1);
            handler.post(this.f57898o1);
            return true;
        }
        return false;
    }

    public final void X(w wVar, long j10, m0 m0Var) {
        if (this.f57892m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f57892m = handlerThread;
            handlerThread.start();
            this.f57893n = new Handler(this.f57892m.getLooper());
        }
        this.E = wVar;
        this.M = j10;
        this.F = m0Var;
        this.V = true;
        this.f57863b0 = false;
        this.f57874f0 = false;
        this.f57922y = null;
        this.f57866c0 = true;
        this.F0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        n nVar = this.f57884j;
        nVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f57865c.isAvailable());
        this.f57865c.setSurfaceTextureListener(this.f57901p1);
        Handler handler = this.f57893n;
        if (this.V && handler != null && this.f57865c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f57893n;
        if (!this.V || this.f57863b0 || handler == null) {
            return false;
        }
        this.f57863b0 = true;
        this.f57866c0 = false;
        this.f57884j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(m0 m0Var) {
        int i3;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f57973a) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        CameraManager cameraManager = this.f57862b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i3 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f57876g)).f53345b) == o0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(wi.m0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: wi.j.a0(wi.m0):void");
    }

    public final boolean b0(m0 m0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder x10;
        if (!this.f57894n0 || !this.f57900p0 || !this.f57903q0 || (cameraDevice = this.f57924z) == null || (cameraDevice2 = this.f57912t0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f57921x0) == null || iVar.f57849b != m0Var || this.f57918w == null) {
            return false;
        }
        this.f57924z = cameraDevice2;
        this.f57912t0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f57914u;
        this.f57914u = this.v;
        this.v = surface;
        if (this.G == m0.f57973a) {
            iVar2 = this.f57885j0;
        } else {
            iVar2 = this.f57888k0;
        }
        this.f57921x0 = iVar2;
        h(iVar);
        this.G = m0Var;
        try {
            try {
                x10 = x(this.f57924z, this.f57914u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
                e = e10;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
            e = e11;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f57916u1, this.f57893n);
            i iVar3 = this.f57921x0;
            if (iVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f57912t0, this.v, iVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f57916u1, this.f57893n);
            }
            boolean z10 = !this.f57906r0;
            this.f57906r0 = z10;
            long j10 = this.I0;
            s sVar = this.f57918w;
            b bVar = new b(this, m0Var, j10, 0);
            Handler handler = sVar.f58038u;
            if (sVar.f58033r0 && handler != null) {
                handler.post(new a60(sVar, z10, bVar, 17));
            }
            this.f57900p0 = true;
            this.f57903q0 = true;
            this.E0 = true;
            this.Z = false;
            this.X = false;
            this.f57860a0 = false;
            O();
            this.f57884j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f57924z.getId() + ", standbyId=" + this.f57912t0.getId() + ", input=" + (this.f57906r0 ? 1 : 0) + ", elapsedMs=" + z(this.I0));
            this.f57865c.post(new a(this, 1));
            nh nhVar = this.f57887k;
            ((t0) nhVar.f36540b).f58060i.post(new a60((Object) nhVar, (Object) new h(this.G, this.I, this.J, this.f57902q, this.f57905r, this.O, F()), true, 18));
            return true;
        } catch (CameraAccessException e12) {
            e = e12;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalArgumentException e13) {
            e = e13;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalStateException e14) {
            e = e14;
            A("role switch request failed", e, false);
            return true;
        }
    }

    public final boolean c0(m0 m0Var) {
        String id2;
        CameraDevice cameraDevice = this.f57912t0;
        i iVar = this.f57921x0;
        if (cameraDevice == null || iVar == null || iVar.f57849b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f57865c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f57924z;
        m0 m0Var2 = this.G;
        if (m0Var2 != null) {
            if (m0Var2 == m0.f57973a) {
                iVar2 = this.f57885j0;
            } else {
                iVar2 = this.f57888k0;
            }
        }
        q();
        this.f57912t0 = cameraDevice2;
        this.f57921x0 = iVar2;
        this.f57924z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.f57902q.getWidth(), this.f57902q.getHeight());
        s sVar = this.f57918w;
        if (sVar != null) {
            sVar.n(this.f57905r, this.f57908s, D(this.f57899p));
            Surface surface = this.f57918w.f58041w;
            if (surface != null) {
                this.f57914u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.E0 = true;
        n nVar = this.f57884j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f57896o);
        sb2.append(", standbyId=");
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", preparationMs=");
        sb2.append(z(this.I0));
        nVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        int width;
        int height;
        Integer num;
        if (this.f57866c0) {
            if (this.f57897o0) {
                this.f57865c.setTransform(new Matrix());
                this.f57884j.b("preview transform: GL output, identity matrix, view=" + this.f57865c.getWidth() + "x" + this.f57865c.getHeight());
                return;
            }
            Size size = this.f57905r;
            if (size != null && this.f57865c.getWidth() != 0 && this.f57865c.getHeight() != 0) {
                int min = Math.min(this.f57908s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f57865c;
                boolean z10 = false;
                if (this.f57899p != null && textureView.getDisplay() != null && (num = (Integer) this.f57899p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                float f10 = min;
                float f11 = width / f10;
                if (z10) {
                    height = size.getWidth();
                } else {
                    height = size.getHeight();
                }
                float f12 = height / f10;
                Matrix matrix = new Matrix();
                matrix.setScale(f11, f12, this.f57865c.getWidth() * 0.5f, this.f57865c.getHeight() * 0.5f);
                this.f57865c.setTransform(matrix);
                this.f57884j.b("preview transform: view=" + this.f57865c.getWidth() + "x" + this.f57865c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f11 + "x" + f12);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: wi.j.g():void");
    }

    public final void h(i iVar) {
        this.f57896o = iVar.f57848a;
        this.H = iVar.f57849b;
        this.f57899p = iVar.f57850c;
        this.f57902q = iVar.d;
        this.f57905r = iVar.f57851e;
        this.f57908s = iVar.f57852f;
        this.I = iVar.f57853g;
        this.J = iVar.h;
        this.K = iVar.f57854i;
        this.L = iVar.f57855j;
        this.O = iVar.f57856k;
        this.f57874f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f57893n;
        if (handler != null) {
            handler.removeCallbacks(this.f57895n1);
        }
        this.f57922y = null;
    }

    public final i l() {
        return new i(this.f57896o, this.H, this.f57899p, this.f57902q, this.f57905r, this.f57908s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.A0 = false;
        this.f57925z0 = false;
        this.f57917v0 = null;
        this.f57919w0 = null;
        this.f57866c0 = false;
        this.Z = false;
        this.f57860a0 = false;
        this.C = null;
        this.Q = false;
        this.f57923y0 = null;
        this.f57909s0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f57924z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f57924z = null;
        }
        CameraDevice cameraDevice2 = this.f57912t0;
        this.f57912t0 = null;
        this.f57921x0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f57915u0;
        this.f57915u0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        s sVar = this.f57918w;
        if (sVar != null) {
            sVar.l();
            this.f57918w = null;
        }
        Surface surface = this.f57911t;
        if (surface != null) {
            surface.release();
            this.f57911t = null;
        }
        this.f57914u = null;
        this.v = null;
        this.f57894n0 = false;
        this.f57897o0 = false;
        this.f57900p0 = false;
        this.f57903q0 = false;
        this.f57906r0 = false;
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
        this.f57903q0 = false;
    }

    public final void t() {
        String str;
        this.f57923y0 = null;
        this.E0 = false;
        if (this.f57890l0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f57884j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f57924z;
        if (cameraDevice != null) {
            this.f57924z = null;
            this.C0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.W) {
            this.X = false;
            I();
        }
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: wi.j.u():void");
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
        this.f57897o0 = this.f57894n0;
        w wVar = this.E;
        long j10 = this.M;
        int i3 = this.f57870e;
        int i10 = this.f57873f;
        int i11 = this.f57882i0;
        if (i11 <= 0) {
            i11 = this.J.f57986a;
        }
        int i12 = i11;
        n nVar = this.f57884j;
        nh nhVar = this.f57887k;
        Objects.requireNonNull(nhVar);
        c cVar = new c(nhVar, 0);
        nh nhVar2 = this.f57887k;
        Objects.requireNonNull(nhVar2);
        m mVar = new m(wVar, j10, i3, i10, i12, nVar, cVar, new c(nhVar2, 1));
        this.f57920x = mVar;
        synchronized (mVar) {
            if (mVar.D) {
                surface = mVar.f57964q;
            } else {
                mVar.q();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f57961n.start();
                    mVar.D = true;
                    mVar.f57954f.b("codecs prepared: video=" + mVar.f57961n.getName() + ", audio=" + mVar.f57962o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f57964q;
                } catch (IOException | RuntimeException e10) {
                    mVar.n();
                    throw e10;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f57905r;
        if (this.f57897o0) {
            surface2 = this.f57911t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.f57894n0;
        int i13 = this.f57870e;
        int i14 = this.f57908s;
        boolean D = D(this.f57899p);
        boolean z12 = this.f57881i;
        n nVar2 = this.f57884j;
        m mVar2 = this.f57920x;
        nh nhVar3 = this.f57887k;
        Objects.requireNonNull(nhVar3);
        s sVar = new s(size, surface5, surface2, z11, i13, i14, D, z12, nVar2, mVar2, new c(nhVar3, 2));
        this.f57918w = sVar;
        sVar.f58037t0 = new a(this, 2);
        s sVar2 = this.f57918w;
        if (sVar2.f58033r0) {
            surface3 = sVar2.f58041w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            sVar2.f58036t = handlerThread;
            handlerThread.start();
            sVar2.f58031q0 = System.nanoTime();
            n nVar3 = sVar2.f58015i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(sVar2.f58001a);
            sb2.append(", crop=");
            sb2.append(sVar2.f58017j);
            sb2.append(", output=");
            sb2.append(sVar2.f58012g);
            sb2.append("x");
            sb2.append(sVar2.f58012g);
            sb2.append(", filter=");
            if (sVar2.f58017j == sVar2.f58012g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(sVar2.h);
            sb2.append(", dualInput=");
            sb2.append(sVar2.f58010f);
            sb2.append(", glPreview=");
            if (sVar2.f58008e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(sVar2.f58036t.getLooper());
            sVar2.f58038u = handler;
            handler.post(new u9.a(20, sVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (sVar2.f58042w0 == null) {
                    surface3 = sVar2.f58041w;
                } else {
                    RuntimeException runtimeException = sVar2.f58042w0;
                    sVar2.f58042w0 = null;
                    sVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                sVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.f57914u = surface3;
        if (this.f57894n0) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f57973a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f57974b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f57885j0;
            } else {
                iVar = this.f57888k0;
            }
            if (iVar != null) {
                s sVar3 = this.f57918w;
                Size size2 = iVar.f57851e;
                int i15 = iVar.f57852f;
                boolean D2 = D(iVar.f57850c);
                Handler handler2 = sVar3.f58038u;
                if (sVar3.f58033r0 && sVar3.f58010f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new p(sVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
                    try {
                        countDownLatch2.await();
                        RuntimeException runtimeException2 = runtimeExceptionArr[0];
                        if (runtimeException2 != null) {
                            throw runtimeException2;
                        }
                    } catch (InterruptedException e12) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("Secondary input update was interrupted", e12);
                    }
                }
                s sVar4 = this.f57918w;
                if (sVar4.f58010f && (surface4 = sVar4.f58045y) != null) {
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
        } catch (IOException | RuntimeException e10) {
            if (this.f57894n0) {
                this.f57884j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
                s sVar = this.f57918w;
                if (sVar != null) {
                    sVar.l();
                    this.f57918w = null;
                }
                m mVar = this.f57920x;
                if (mVar != null) {
                    mVar.u();
                    this.f57920x = null;
                }
                this.f57914u = null;
                this.v = null;
                this.f57894n0 = false;
                this.f57897o0 = false;
                this.f57890l0 = false;
                this.m0 = true;
                surfaceTexture.setDefaultBufferSize(this.f57902q.getWidth(), this.f57902q.getHeight());
                v();
                return;
            }
            throw e10;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, wi.i r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: wi.j.x(android.hardware.camera2.CameraDevice, android.view.Surface, wi.i, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.m0 = true;
        this.f57890l0 = false;
        this.f57894n0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f57884j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f57912t0;
        this.f57912t0 = null;
        this.f57921x0 = null;
        if (cameraDevice != null && cameraDevice != this.f57924z) {
            this.f57915u0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
