package vi;

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
import fi.w3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import li.e3;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.v50;
import org.telegram.ui.d80;
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
    public volatile l0 F;
    public long F0;
    public l0 G;
    public long G0;
    public l0 H;
    public long H0;
    public m0 I;
    public long I0;
    public n0 J;
    public long J0;
    public Range K;
    public long K0;
    public k6.m L;
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
    public final Context f50404a;
    public volatile boolean f50405a0;
    public long f50406a1;
    public final CameraManager f50407b;
    public volatile boolean f50408b0;
    public long f50409b1;
    public final TextureView f50410c;
    public volatile boolean f50411c0;
    public long f50412c1;
    public final q0 d;
    public boolean f50413d0;
    public double f50414d1;
    public final int e;
    public boolean f50415e0;
    public long f50416e1;
    public final int f50417f;
    public boolean f50418f0;
    public long f50419f1;
    public final m0 f50420g;
    public boolean f50421g0;
    public long f50422g1;
    public final n0 h;
    public boolean f50423h0;
    public long f50424h1;
    public final boolean f50425i;
    public i f50426i0;
    public long f50427i1;
    public final n f50428j;
    public i f50429j0;
    public long f50430j1;
    public final e3 f50431k;
    public boolean f50432k0;
    public long f50433k1;
    public boolean f50435l0;
    public final w3 l1;
    public HandlerThread f50436m;
    public boolean m0;
    public final a f50437m1;
    public Handler f50438n;
    public boolean f50439n0;
    public final a f50440n1;
    public String f50441o;
    public boolean f50442o0;
    public final v50 f50443o1;
    public CameraCharacteristics f50444p;
    public boolean f50445p0;
    public final e f50446p1;
    public Size f50447q;
    public boolean f50448q0;
    public final e f50449q1;
    public volatile Size f50450r;
    public boolean f50451r0;
    public final f f50452r1;
    public volatile int f50453s;
    public CameraDevice f50454s0;
    public final f f50455s1;
    public Surface f50456t;
    public CameraDevice f50457t0;
    public final g f50458t1;
    public Surface f50459u;
    public CameraDevice f50460u0;
    public Surface v;
    public CameraDevice f50461v0;
    public s f50462w;
    public i f50463w0;
    public m f50464x;
    public l0 f50465x0;
    public m f50466y;
    public boolean f50467y0;
    public CameraDevice f50468z;
    public boolean f50469z0;
    public final Rect f50434l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, q0 q0Var, int i10, m0 m0Var, n0 n0Var, boolean z10, n nVar, e3 e3Var) {
        w3 w3Var = new w3(this, 2);
        this.l1 = w3Var;
        this.f50437m1 = new a(this, 4);
        this.f50440n1 = new a(this, 5);
        this.f50443o1 = new v50(this, 4);
        this.f50446p1 = new e(this, 0);
        this.f50449q1 = new e(this, 1);
        this.f50452r1 = new f(this, 0);
        this.f50455s1 = new f(this, 1);
        this.f50458t1 = new g(this);
        this.f50404a = context.getApplicationContext();
        this.f50407b = (CameraManager) context.getSystemService("camera");
        this.f50410c = textureView;
        this.d = q0Var;
        this.e = q0Var.f50533a;
        this.f50417f = i10;
        this.f50420g = m0Var;
        this.h = n0Var;
        this.f50425i = z10;
        this.f50428j = nVar;
        this.f50431k = e3Var;
        textureView.addOnLayoutChangeListener(w3Var);
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
        CameraDevice cameraDevice = jVar.f50468z;
        CameraDevice cameraDevice2 = jVar.f50454s0;
        if (jVar.m0 && cameraDevice != null && cameraDevice2 != null && jVar.f50459u != null && jVar.v != null && jVar.A == null && jVar.B == null) {
            jVar.f50442o0 = false;
            jVar.f50445p0 = false;
            try {
                jVar.G0 = SystemClock.elapsedRealtimeNanos();
                n nVar = jVar.f50428j;
                nVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.f50450r + ", fpsRange=" + jVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(jVar.f50459u), jVar.f50455s1, jVar.f50438n);
                cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.f50452r1, jVar.f50438n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                jVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == jVar.f50468z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && jVar.m0) {
            n nVar = jVar.f50428j;
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
            jVar.f50432k0 = false;
            jVar.f50435l0 = true;
            jVar.f50451r0 = false;
            jVar.f50454s0 = null;
            jVar.f50463w0 = null;
            jVar.r();
            jVar.f50457t0 = cameraDevice;
            if (!jVar.V || jVar.f50468z == null || jVar.A != null || jVar.X) {
                z11 = false;
            }
            jVar.f50467y0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.f50454s0) {
            jVar.f50454s0 = null;
        }
        jVar.f50451r0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.f50468z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(b10.j("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.f50465x0 != null) {
            jVar.t();
        } else if (jVar.V && jVar.f50468z != null && jVar.A == null && !jVar.X) {
            jVar.f50428j.b("warm camera failed during startup; configuring active camera only");
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
        if (cameraDevice == jVar.f50460u0) {
            jVar.f50460u0 = null;
        }
        if (cameraDevice == jVar.f50461v0) {
            jVar.f50461v0 = null;
        }
        n nVar = jVar.f50428j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.f50460u0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f50461v0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f50457t0) {
            return false;
        }
        jVar.f50457t0 = null;
        n nVar = jVar.f50428j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f50467y0) {
            jVar.f50467y0 = false;
            if (jVar.V && !jVar.f50408b0 && jVar.f50468z != null) {
                jVar.f50428j.b("retrying capture session after standby camera closed");
                jVar.u();
                return true;
            }
            return true;
        } else if (jVar.X && jVar.f50465x0 != null) {
            jVar.f50428j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(j jVar) {
        l0 l0Var = jVar.f50465x0;
        if (l0Var != null && jVar.m0 && jVar.f50442o0 && jVar.f50445p0) {
            jVar.f50465x0 = null;
            if (!jVar.b0(l0Var)) {
                jVar.X = false;
                jVar.a0(l0Var);
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

    public static k6.m m(Size[] sizeArr, q0 q0Var, m0 m0Var) {
        int i10;
        k6.m o10;
        m0 m0Var2;
        k6.m o11;
        m0 m0Var3 = m0.f50513c;
        if (m0Var == m0Var3) {
            i10 = q0Var.f50533a;
        } else {
            q0 q0Var2 = q0.P480;
            m0 m0Var4 = m0.f50511a;
            if (q0Var == q0Var2) {
                if (m0Var == m0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (m0Var != m0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        k6.m o12 = o(sizeArr, i10, m0Var);
        if (o12 != null) {
            return o12;
        }
        if (q0Var == q0.P360 && m0Var == (m0Var2 = m0.f50512b) && (o11 = o(sizeArr, 480, m0Var2)) != null) {
            return o11;
        }
        int i11 = q0Var.f50533a;
        if (m0Var != m0Var3 && (o10 = o(sizeArr, i11, m0Var3)) != null) {
            return o10;
        }
        int i12 = q0Var.f50533a;
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
        return new k6.m(n(sizeArr, size), size, m0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static k6.m o(Size[] sizeArr, int i10, m0 m0Var) {
        int compare;
        k6.m mVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                k6.m mVar2 = new k6.m(n10, size, m0Var, i10);
                if (mVar != null) {
                    Size size2 = (Size) mVar.f16424b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) mVar.f16425c;
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
                mVar = mVar2;
            }
        }
        return mVar;
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
            this.f50428j.b(sb2.toString());
            this.m0 = false;
            this.f50432k0 = false;
            this.f50435l0 = true;
            this.f50442o0 = false;
            this.f50445p0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f50454s0;
                this.f50454s0 = null;
                this.f50463w0 = null;
                if (cameraDevice != null) {
                    this.f50457t0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f50457t0 == null && this.X && this.f50465x0 != null) {
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
        m mVar = this.f50464x;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.f50510z;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f50418f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f50418f0 = true;
        q();
        k6.m mVar2 = this.L;
        if (mVar2 == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = n0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f50444p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f50447q = (Size) mVar2.f16424b;
        this.f50450r = (Size) mVar2.f16425c;
        this.f50453s = mVar2.f16423a;
        this.I = (m0) mVar2.d;
        this.f50426i0 = null;
        this.f50429j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f50410c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f50447q.getWidth(), this.f50447q.getHeight());
        }
        s sVar = this.f50462w;
        if (sVar != null) {
            sVar.l();
            this.f50462w = null;
        }
        m mVar3 = this.f50464x;
        if (mVar3 != null) {
            mVar3.q();
            this.f50464x = null;
        }
        this.f50459u = null;
        try {
            v();
            O();
            n nVar = this.f50428j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f50447q);
            sb2.append(", recording=");
            sb2.append(this.f50450r);
            sb2.append(", crop=");
            sb2.append(this.f50453s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar.b(sb2.toString());
            Handler handler = this.f50438n;
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
        for (Set<String> set : this.f50407b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == l0.f50487b && (cameraCharacteristics = this.f50444p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.f50469z0) {
            if (cameraDevice == this.f50460u0 || cameraDevice == this.f50461v0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.f50469z0 && this.f50460u0 == null && this.f50461v0 == null) {
            this.f50469z0 = false;
            this.X = false;
            n nVar = this.f50428j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (this.V && !this.f50408b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f50468z == null) {
            if (f0.c.b(this.f50404a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f50404a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.C0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.C0);
                    if (this.f50468z == null && this.f50464x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f50410c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.m0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f50410c.getWidth(), this.f50410c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f50447q.getWidth(), this.f50447q.getHeight());
                        }
                        if (this.f50456t == null) {
                            this.f50456t = new Surface(surfaceTexture);
                        }
                        if (this.f50464x == null) {
                            w(surfaceTexture);
                        } else {
                            s sVar = this.f50462w;
                            if (sVar != null) {
                                sVar.n(this.f50450r, this.f50453s, D(this.f50444p));
                                Surface surface = null;
                                if (!this.m0 && this.f50448q0) {
                                    this.f50448q0 = false;
                                    s sVar2 = this.f50462w;
                                    Handler handler = sVar2.f50574u;
                                    if (sVar2.f50569r0 && handler != null) {
                                        handler.post(new d80((Object) sVar2, false, (Object) null, 17));
                                    }
                                }
                                s sVar3 = this.f50462w;
                                Surface surface2 = sVar3.f50577w;
                                if (surface2 != null) {
                                    this.f50459u = surface2;
                                    if (this.m0 && (!sVar3.f50546f || (surface = sVar3.f50581y) == null)) {
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
                        n nVar = this.f50428j;
                        nVar.b("camera open requested: id=" + this.f50441o + ", preview=" + this.f50447q + ", recording=" + this.f50450r + ", crop=" + this.f50453s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.m0);
                        this.f50407b.openCamera(this.f50441o, this.f50446p1, this.f50438n);
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
        l0 l0Var;
        i iVar;
        if (this.f50432k0 && !this.f50435l0 && !(z10 = this.f50451r0) && (cameraDevice = this.f50454s0) == null) {
            l0 l0Var2 = this.H;
            l0 l0Var3 = l0.f50486a;
            if (l0Var2 == l0Var3) {
                l0Var = l0.f50487b;
            } else {
                l0Var = l0Var3;
            }
            if (l0Var == l0Var3) {
                iVar = this.f50426i0;
            } else {
                iVar = this.f50429j0;
            }
            if (iVar != null) {
                String str = iVar.f50393a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f50463w0 = iVar;
                        this.f50451r0 = true;
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f50428j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f50394b);
                        this.f50407b.openCamera(str, this.f50449q1, this.f50438n);
                    } catch (Exception e) {
                        this.f50451r0 = false;
                        y("open request failed", e);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f50435l0) {
            return;
        }
        if (this.f50432k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f50428j;
        if (i10 < 30) {
            this.f50435l0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l4 = l();
        n0 n0Var = l4.h;
        String str2 = l4.f50393a;
        l0 l0Var = l4.f50394b;
        l0 l0Var2 = l0.f50486a;
        if (l0Var == l0Var2) {
            l0Var2 = l0.f50487b;
        }
        try {
            try {
                S(l0Var2);
                i l10 = l();
                n0 n0Var2 = l10.h;
                String str3 = l10.f50393a;
                boolean E = E(str2, str3);
                this.f50432k0 = E;
                if (E && n0Var != n0Var2) {
                    this.f50432k0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f50396f + ", second=" + l10.e + "/" + l10.f50396f + ", firstFps=" + n0Var.f50519a + ", secondFps=" + n0Var2.f50519a);
                }
                boolean z10 = this.f50432k0;
                if (!z10) {
                    this.f50435l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f50432k0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f50432k0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.f50435l0 = true;
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
        if (this.f50469z0) {
            return;
        }
        this.f50469z0 = true;
        this.f50435l0 = true;
        this.f50432k0 = false;
        this.f50467y0 = false;
        this.f50465x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f50468z;
        this.f50460u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f50454s0;
        this.f50461v0 = cameraDevice2;
        this.f50468z = null;
        this.f50454s0 = null;
        this.f50463w0 = null;
        CameraDevice cameraDevice3 = this.f50457t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f50457t0 = null;
        }
        n nVar = this.f50428j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.f50460u0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        v.append(id2);
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f50461v0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        v.append(str3);
        v.append(", fps=");
        n0 n0Var = this.J;
        if (n0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(n0Var.f50519a);
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
        CameraDevice cameraDevice6 = this.f50460u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f50461v0;
        if (cameraDevice7 != null && cameraDevice7 != this.f50460u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f50410c.setSurfaceTextureListener(null);
        this.f50410c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.f50438n;
        HandlerThread handlerThread = this.f50436m;
        this.f50438n = null;
        this.f50436m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new sg.u(27, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f50428j.a("camera error", exc);
        e3 e3Var = this.f50431k;
        ((s0) e3Var.f17210b).f50588i.post(new i0(0, e3Var, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f50406a1 = 0L;
        this.f50409b1 = 0L;
        this.f50412c1 = 0L;
        this.f50414d1 = 0.0d;
        this.f50416e1 = 0L;
        this.f50419f1 = 0L;
        this.f50422g1 = 0L;
        this.f50424h1 = 0L;
        this.f50427i1 = 0L;
        this.f50430j1 = 0L;
        this.f50433k1 = 0L;
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

    public final s4.d Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, k6.m mVar) {
        Range[] rangeArr;
        k6.m mVar2;
        int i10;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar = this.f50428j;
        n0 n0Var = this.h;
        n0 n0Var2 = n0.FPS_30;
        if (n0Var != n0Var2) {
            if (this.f50423h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                mVar2 = mVar;
            } else {
                int i11 = n0Var.f50519a;
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
                        k6.m m10 = m(sizeArr2, this.d, this.f50420g);
                        nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new s4.d(n0.FPS_60, C, m10, 5);
                    } catch (RuntimeException unused) {
                        nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new s4.d(n0Var2, C2, mVar, 5);
            }
        } else {
            rangeArr = rangeArr4;
            mVar2 = mVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(n0Var.f50519a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        if (this.f50423h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        nVar.b(v.toString());
        return new s4.d(n0Var2, C3, mVar2, 5);
    }

    public final void R(String str, Exception exc) {
        this.f50467y0 = true;
        y(str, exc);
        if (this.f50457t0 == null) {
            this.f50467y0 = false;
            u();
            return;
        }
        this.f50428j.b("capture session retry waiting for standby camera close: id=" + this.f50457t0.getId());
    }

    public final void S(vi.l0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.S(vi.l0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f50438n;
        if (this.V && handler != null) {
            handler.post(new d60(20, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f50438n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f50440n1);
            handler.post(this.f50440n1);
            return true;
        }
        return false;
    }

    public final void X(v vVar, long j10, l0 l0Var) {
        if (this.f50436m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f50436m = handlerThread;
            handlerThread.start();
            this.f50438n = new Handler(this.f50436m.getLooper());
        }
        this.E = vVar;
        this.M = j10;
        this.F = l0Var;
        this.V = true;
        this.f50408b0 = false;
        this.f50466y = null;
        this.f50411c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        n nVar = this.f50428j;
        nVar.b("camera segment start: facing=" + l0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f50410c.isAvailable());
        this.f50410c.setSurfaceTextureListener(this.f50443o1);
        Handler handler = this.f50438n;
        if (this.V && handler != null && this.f50410c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f50438n;
        if (!this.V || this.f50408b0 || handler == null) {
            return false;
        }
        this.f50408b0 = true;
        this.f50411c0 = false;
        this.f50428j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(l0 l0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (l0Var == l0.f50486a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f50407b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((n0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f50420g)).f47720b) == n0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(vi.l0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.a0(vi.l0):void");
    }

    public final boolean b0(l0 l0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder x9;
        if (!this.m0 || !this.f50442o0 || !this.f50445p0 || (cameraDevice = this.f50468z) == null || (cameraDevice2 = this.f50454s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f50463w0) == null || iVar.f50394b != l0Var || this.f50462w == null) {
            return false;
        }
        this.f50468z = cameraDevice2;
        this.f50454s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f50459u;
        this.f50459u = this.v;
        this.v = surface;
        if (this.G == l0.f50486a) {
            iVar2 = this.f50426i0;
        } else {
            iVar2 = this.f50429j0;
        }
        this.f50463w0 = iVar2;
        h(iVar);
        this.G = l0Var;
        try {
            try {
                x9 = x(this.f50468z, this.f50459u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
            e = e10;
        }
        try {
            this.C = x9;
            this.A.setRepeatingRequest(x9.build(), this.f50458t1, this.f50438n);
            i iVar3 = this.f50463w0;
            if (iVar3 != null) {
                CaptureRequest.Builder x10 = x(this.f50454s0, this.v, iVar3, false, false);
                this.D = x10;
                this.B.setRepeatingRequest(x10.build(), this.f50458t1, this.f50438n);
            }
            boolean z10 = !this.f50448q0;
            this.f50448q0 = z10;
            long j10 = this.H0;
            s sVar = this.f50462w;
            b bVar = new b(this, l0Var, j10, 0);
            Handler handler = sVar.f50574u;
            if (sVar.f50569r0 && handler != null) {
                handler.post(new d80(sVar, z10, bVar, 17));
            }
            this.f50442o0 = true;
            this.f50445p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.f50405a0 = false;
            O();
            this.f50428j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f50468z.getId() + ", standbyId=" + this.f50454s0.getId() + ", input=" + (this.f50448q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.f50410c.post(new a(this, 1));
            e3 e3Var = this.f50431k;
            ((s0) e3Var.f17210b).f50588i.post(new d80((Object) e3Var, (Object) new h(this.G, this.I, this.J, this.f50447q, this.f50450r, this.O, F()), true, 18));
            return true;
        } catch (CameraAccessException e11) {
            e = e11;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalArgumentException e12) {
            e = e12;
            A("role switch request failed", e, false);
            return true;
        } catch (IllegalStateException e13) {
            e = e13;
            A("role switch request failed", e, false);
            return true;
        }
    }

    public final boolean c0(l0 l0Var) {
        String id2;
        CameraDevice cameraDevice = this.f50454s0;
        i iVar = this.f50463w0;
        if (cameraDevice == null || iVar == null || iVar.f50394b != l0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f50410c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f50468z;
        l0 l0Var2 = this.G;
        if (l0Var2 != null) {
            if (l0Var2 == l0.f50486a) {
                iVar2 = this.f50426i0;
            } else {
                iVar2 = this.f50429j0;
            }
        }
        q();
        this.f50454s0 = cameraDevice2;
        this.f50463w0 = iVar2;
        this.f50468z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.f50447q.getWidth(), this.f50447q.getHeight());
        s sVar = this.f50462w;
        if (sVar != null) {
            sVar.n(this.f50450r, this.f50453s, D(this.f50444p));
            Surface surface = this.f50462w.f50577w;
            if (surface != null) {
                this.f50459u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.D0 = true;
        n nVar = this.f50428j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f50441o);
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
        if (this.f50411c0) {
            if (this.f50439n0) {
                this.f50410c.setTransform(new Matrix());
                this.f50428j.b("preview transform: GL output, identity matrix, view=" + this.f50410c.getWidth() + "x" + this.f50410c.getHeight());
                return;
            }
            Size size = this.f50450r;
            if (size != null && this.f50410c.getWidth() != 0 && this.f50410c.getHeight() != 0) {
                int min = Math.min(this.f50453s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f50410c;
                boolean z10 = false;
                if (this.f50444p != null && textureView.getDisplay() != null && (num = (Integer) this.f50444p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f50410c.getWidth() * 0.5f, this.f50410c.getHeight() * 0.5f);
                this.f50410c.setTransform(matrix);
                this.f50428j.b("preview transform: view=" + this.f50410c.getWidth() + "x" + this.f50410c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.g():void");
    }

    public final void h(i iVar) {
        this.f50441o = iVar.f50393a;
        this.H = iVar.f50394b;
        this.f50444p = iVar.f50395c;
        this.f50447q = iVar.d;
        this.f50450r = iVar.e;
        this.f50453s = iVar.f50396f;
        this.I = iVar.f50397g;
        this.J = iVar.h;
        this.K = iVar.f50398i;
        this.L = iVar.f50399j;
        this.O = iVar.f50400k;
        this.f50418f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f50438n;
        if (handler != null) {
            handler.removeCallbacks(this.f50437m1);
        }
        this.f50466y = null;
    }

    public final i l() {
        return new i(this.f50441o, this.H, this.f50444p, this.f50447q, this.f50450r, this.f50453s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f50469z0 = false;
        this.f50467y0 = false;
        this.f50460u0 = null;
        this.f50461v0 = null;
        this.f50411c0 = false;
        this.Z = false;
        this.f50405a0 = false;
        this.C = null;
        this.Q = false;
        this.f50465x0 = null;
        this.f50451r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f50468z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f50468z = null;
        }
        CameraDevice cameraDevice2 = this.f50454s0;
        this.f50454s0 = null;
        this.f50463w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f50457t0;
        this.f50457t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        s sVar = this.f50462w;
        if (sVar != null) {
            sVar.l();
            this.f50462w = null;
        }
        Surface surface = this.f50456t;
        if (surface != null) {
            surface.release();
            this.f50456t = null;
        }
        this.f50459u = null;
        this.v = null;
        this.m0 = false;
        this.f50439n0 = false;
        this.f50442o0 = false;
        this.f50445p0 = false;
        this.f50448q0 = false;
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
        this.f50445p0 = false;
    }

    public final void t() {
        String str;
        this.f50465x0 = null;
        this.D0 = false;
        if (this.f50432k0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f50428j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f50468z;
        if (cameraDevice != null) {
            this.f50468z = null;
            this.B0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else if (!this.W) {
            this.X = false;
            I();
        }
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.u():void");
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        String str;
        boolean z10;
        Surface surface3;
        l0 l0Var;
        i iVar;
        Surface surface4;
        this.f50439n0 = this.m0;
        v vVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f50417f;
        int i12 = this.J.f50519a;
        n nVar = this.f50428j;
        e3 e3Var = this.f50431k;
        Objects.requireNonNull(e3Var);
        m mVar = new m(vVar, j10, i10, i11, i12, nVar, new c(e3Var));
        this.f50464x = mVar;
        synchronized (mVar) {
            if (mVar.f50509y) {
                surface = mVar.f50501p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f50498m.start();
                    mVar.f50509y = true;
                    mVar.f50492f.b("codecs prepared: video=" + mVar.f50498m.getName() + ", audio=" + mVar.f50499n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f50501p;
                } catch (IOException | RuntimeException e) {
                    mVar.j();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f50450r;
        if (this.f50439n0) {
            surface2 = this.f50456t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.m0;
        int i13 = this.e;
        int i14 = this.f50453s;
        boolean D = D(this.f50444p);
        boolean z12 = this.f50425i;
        n nVar2 = this.f50428j;
        m mVar2 = this.f50464x;
        e3 e3Var2 = this.f50431k;
        Objects.requireNonNull(e3Var2);
        s sVar = new s(size, surface5, surface2, z11, i13, i14, D, z12, nVar2, mVar2, new c(e3Var2));
        this.f50462w = sVar;
        sVar.f50573t0 = new a(this, 2);
        s sVar2 = this.f50462w;
        if (sVar2.f50569r0) {
            surface3 = sVar2.f50577w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            sVar2.f50572t = handlerThread;
            handlerThread.start();
            sVar2.f50567q0 = System.nanoTime();
            n nVar3 = sVar2.f50551i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(sVar2.f50538a);
            sb2.append(", crop=");
            sb2.append(sVar2.f50553j);
            sb2.append(", output=");
            sb2.append(sVar2.f50548g);
            sb2.append("x");
            sb2.append(sVar2.f50548g);
            sb2.append(", filter=");
            if (sVar2.f50553j == sVar2.f50548g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(sVar2.h);
            sb2.append(", dualInput=");
            sb2.append(sVar2.f50546f);
            sb2.append(", glPreview=");
            if (sVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(sVar2.f50572t.getLooper());
            sVar2.f50574u = handler;
            handler.post(new sg.u(28, sVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (sVar2.f50578w0 == null) {
                    surface3 = sVar2.f50577w;
                } else {
                    RuntimeException runtimeException = sVar2.f50578w0;
                    sVar2.f50578w0 = null;
                    sVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                sVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e10);
            }
        }
        this.f50459u = surface3;
        if (this.m0) {
            l0 l0Var2 = this.H;
            l0 l0Var3 = l0.f50486a;
            if (l0Var2 == l0Var3) {
                l0Var = l0.f50487b;
            } else {
                l0Var = l0Var3;
            }
            if (l0Var == l0Var3) {
                iVar = this.f50426i0;
            } else {
                iVar = this.f50429j0;
            }
            if (iVar != null) {
                s sVar3 = this.f50462w;
                Size size2 = iVar.e;
                int i15 = iVar.f50396f;
                boolean D2 = D(iVar.f50395c);
                Handler handler2 = sVar3.f50574u;
                if (sVar3.f50569r0 && sVar3.f50546f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new p(sVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
                    try {
                        countDownLatch2.await();
                        RuntimeException runtimeException2 = runtimeExceptionArr[0];
                        if (runtimeException2 != null) {
                            throw runtimeException2;
                        }
                    } catch (InterruptedException e11) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("Secondary input update was interrupted", e11);
                    }
                }
                s sVar4 = this.f50462w;
                if (sVar4.f50546f && (surface4 = sVar4.f50581y) != null) {
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
                this.f50428j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                s sVar = this.f50462w;
                if (sVar != null) {
                    sVar.l();
                    this.f50462w = null;
                }
                m mVar = this.f50464x;
                if (mVar != null) {
                    mVar.q();
                    this.f50464x = null;
                }
                this.f50459u = null;
                this.v = null;
                this.m0 = false;
                this.f50439n0 = false;
                this.f50432k0 = false;
                this.f50435l0 = true;
                surfaceTexture.setDefaultBufferSize(this.f50447q.getWidth(), this.f50447q.getHeight());
                v();
                return;
            }
            throw e;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, vi.i r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.x(android.hardware.camera2.CameraDevice, android.view.Surface, vi.i, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.f50435l0 = true;
        this.f50432k0 = false;
        this.m0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f50428j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f50454s0;
        this.f50454s0 = null;
        this.f50463w0 = null;
        if (cameraDevice != null && cameraDevice != this.f50468z) {
            this.f50457t0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
