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
import org.telegram.ui.f80;
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
    public volatile n0 F;
    public long F0;
    public n0 G;
    public long G0;
    public n0 H;
    public long H0;
    public o0 I;
    public long I0;
    public p0 J;
    public long J0;
    public Range K;
    public long K0;
    public k6.m L;
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
    public final Context f50439a;
    public volatile boolean f50440a0;
    public long f50441a1;
    public final CameraManager f50442b;
    public volatile boolean f50443b0;
    public long f50444b1;
    public final TextureView f50445c;
    public volatile boolean f50446c0;
    public long f50447c1;
    public final s0 d;
    public boolean f50448d0;
    public long f50449d1;
    public final int e;
    public boolean f50450e0;
    public double f50451e1;
    public final int f50452f;
    public boolean f50453f0;
    public long f50454f1;
    public final o0 f50455g;
    public boolean f50456g0;
    public long f50457g1;
    public final p0 h;
    public boolean f50458h0;
    public long f50459h1;
    public final boolean f50460i;
    public int f50461i0;
    public long f50462i1;
    public final n f50463j;
    public i f50464j0;
    public long f50465j1;
    public final e3 f50466k;
    public i f50467k0;
    public long f50468k1;
    public boolean f50470l0;
    public long l1;
    public HandlerThread f50471m;
    public boolean m0;
    public final w3 f50472m1;
    public Handler f50473n;
    public boolean f50474n0;
    public final a f50475n1;
    public String f50476o;
    public boolean f50477o0;
    public final a f50478o1;
    public CameraCharacteristics f50479p;
    public boolean f50480p0;
    public final v50 f50481p1;
    public Size f50482q;
    public boolean f50483q0;
    public final e f50484q1;
    public volatile Size f50485r;
    public boolean f50486r0;
    public final e f50487r1;
    public volatile int f50488s;
    public boolean f50489s0;
    public final f f50490s1;
    public Surface f50491t;
    public CameraDevice f50492t0;
    public final f f50493t1;
    public Surface f50494u;
    public CameraDevice f50495u0;
    public final g f50496u1;
    public Surface v;
    public CameraDevice f50497v0;
    public s f50498w;
    public CameraDevice f50499w0;
    public m f50500x;
    public i f50501x0;
    public m f50502y;
    public n0 f50503y0;
    public CameraDevice f50504z;
    public boolean f50505z0;
    public final Rect f50469l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, s0 s0Var, int i10, o0 o0Var, p0 p0Var, boolean z10, n nVar, e3 e3Var) {
        w3 w3Var = new w3(this, 2);
        this.f50472m1 = w3Var;
        this.f50475n1 = new a(this, 4);
        this.f50478o1 = new a(this, 5);
        this.f50481p1 = new v50(this, 4);
        this.f50484q1 = new e(this, 0);
        this.f50487r1 = new e(this, 1);
        this.f50490s1 = new f(this, 0);
        this.f50493t1 = new f(this, 1);
        this.f50496u1 = new g(this);
        this.f50439a = context.getApplicationContext();
        this.f50442b = (CameraManager) context.getSystemService("camera");
        this.f50445c = textureView;
        this.d = s0Var;
        this.e = s0Var.f50624a;
        this.f50452f = i10;
        this.f50455g = o0Var;
        this.h = p0Var;
        this.f50460i = z10;
        this.f50463j = nVar;
        this.f50466k = e3Var;
        textureView.addOnLayoutChangeListener(w3Var);
    }

    public static Range C(Range[] rangeArr, int i10) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        int i11 = i10 / 2;
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i10))) {
                if (((Integer) range3.getUpper()).intValue() == i10 && ((Integer) range3.getLower()).intValue() >= i11 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
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
        CameraDevice cameraDevice = jVar.f50504z;
        CameraDevice cameraDevice2 = jVar.f50492t0;
        if (jVar.f50474n0 && cameraDevice != null && cameraDevice2 != null && jVar.f50494u != null && jVar.v != null && jVar.A == null && jVar.B == null) {
            jVar.f50480p0 = false;
            jVar.f50483q0 = false;
            try {
                jVar.H0 = SystemClock.elapsedRealtimeNanos();
                n nVar = jVar.f50463j;
                nVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.f50485r + ", fpsRange=" + jVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(jVar.f50494u), jVar.f50493t1, jVar.f50473n);
                cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.f50490s1, jVar.f50473n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                jVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == jVar.f50504z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && jVar.f50474n0) {
            n nVar = jVar.f50463j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            nVar.b(sb2.toString());
            jVar.f50474n0 = false;
            jVar.f50470l0 = false;
            jVar.m0 = true;
            jVar.f50489s0 = false;
            jVar.f50492t0 = null;
            jVar.f50501x0 = null;
            jVar.r();
            jVar.f50495u0 = cameraDevice;
            if (!jVar.V || jVar.f50504z == null || jVar.A != null || jVar.X) {
                z11 = false;
            }
            jVar.f50505z0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.f50492t0) {
            jVar.f50492t0 = null;
        }
        jVar.f50489s0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.f50504z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(b10.j("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.f50503y0 != null) {
            jVar.t();
        } else if (jVar.V && jVar.f50504z != null && jVar.A == null && !jVar.X) {
            jVar.f50463j.b("warm camera failed during startup; configuring active camera only");
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
        if (cameraDevice == jVar.f50497v0) {
            jVar.f50497v0 = null;
        }
        if (cameraDevice == jVar.f50499w0) {
            jVar.f50499w0 = null;
        }
        n nVar = jVar.f50463j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.f50497v0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f50499w0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f50495u0) {
            return false;
        }
        jVar.f50495u0 = null;
        n nVar = jVar.f50463j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f50505z0) {
            jVar.f50505z0 = false;
            if (jVar.V && !jVar.f50443b0 && jVar.f50504z != null) {
                jVar.f50463j.b("retrying capture session after standby camera closed");
                jVar.u();
                return true;
            }
            return true;
        } else if (jVar.X && jVar.f50503y0 != null) {
            jVar.f50463j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(j jVar) {
        n0 n0Var = jVar.f50503y0;
        if (n0Var != null && jVar.f50474n0 && jVar.f50480p0 && jVar.f50483q0) {
            jVar.f50503y0 = null;
            if (!jVar.b0(n0Var)) {
                jVar.X = false;
                jVar.a0(n0Var);
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

    public static k6.m m(Size[] sizeArr, s0 s0Var, o0 o0Var) {
        int i10;
        k6.m o10;
        o0 o0Var2;
        k6.m o11;
        o0 o0Var3 = o0.f50564c;
        if (o0Var == o0Var3) {
            i10 = s0Var.f50624a;
        } else {
            s0 s0Var2 = s0.P480;
            o0 o0Var4 = o0.f50562a;
            if (s0Var == s0Var2) {
                if (o0Var == o0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (o0Var != o0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        k6.m o12 = o(sizeArr, i10, o0Var);
        if (o12 != null) {
            return o12;
        }
        if (s0Var == s0.P360 && o0Var == (o0Var2 = o0.f50563b) && (o11 = o(sizeArr, 480, o0Var2)) != null) {
            return o11;
        }
        int i11 = s0Var.f50624a;
        if (o0Var != o0Var3 && (o10 = o(sizeArr, i11, o0Var3)) != null) {
            return o10;
        }
        int i12 = s0Var.f50624a;
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
        return new k6.m(n(sizeArr, size), size, o0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static k6.m o(Size[] sizeArr, int i10, o0 o0Var) {
        int compare;
        k6.m mVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                k6.m mVar2 = new k6.m(n10, size, o0Var, i10);
                if (mVar != null) {
                    Size size2 = (Size) mVar.f16423b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) mVar.f16424c;
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
        if (this.f50474n0) {
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
            this.f50463j.b(sb2.toString());
            this.f50474n0 = false;
            this.f50470l0 = false;
            this.m0 = true;
            this.f50480p0 = false;
            this.f50483q0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f50492t0;
                this.f50492t0 = null;
                this.f50501x0 = null;
                if (cameraDevice != null) {
                    this.f50495u0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f50495u0 == null && this.X && this.f50503y0 != null) {
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
        m mVar = this.f50500x;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.E;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f50453f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f50453f0 = true;
        this.f50458h0 = true;
        q();
        k6.m mVar2 = this.L;
        if (mVar2 == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = p0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f50479p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f50482q = (Size) mVar2.f16423b;
        this.f50485r = (Size) mVar2.f16424c;
        this.f50488s = mVar2.f16422a;
        this.I = (o0) mVar2.d;
        this.f50464j0 = null;
        this.f50467k0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f50445c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f50482q.getWidth(), this.f50482q.getHeight());
        }
        s sVar = this.f50498w;
        if (sVar != null) {
            sVar.l();
            this.f50498w = null;
        }
        m mVar3 = this.f50500x;
        if (mVar3 != null) {
            mVar3.u();
            this.f50500x = null;
        }
        this.f50494u = null;
        try {
            v();
            O();
            n nVar = this.f50463j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f50482q);
            sb2.append(", recording=");
            sb2.append(this.f50485r);
            sb2.append(", crop=");
            sb2.append(this.f50488s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar.b(sb2.toString());
            Handler handler = this.f50473n;
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
        for (Set<String> set : this.f50442b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == n0.f50558b && (cameraCharacteristics = this.f50479p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.A0) {
            if (cameraDevice == this.f50497v0 || cameraDevice == this.f50499w0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.A0 && this.f50497v0 == null && this.f50499w0 == null) {
            this.A0 = false;
            this.X = false;
            n nVar = this.f50463j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.I0));
            if (this.V && !this.f50443b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f50504z == null) {
            if (f0.c.b(this.f50439a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f50439a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.D0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.D0);
                    if (this.f50504z == null && this.f50500x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f50445c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.f50474n0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f50445c.getWidth(), this.f50445c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f50482q.getWidth(), this.f50482q.getHeight());
                        }
                        if (this.f50491t == null) {
                            this.f50491t = new Surface(surfaceTexture);
                        }
                        if (this.f50500x == null) {
                            w(surfaceTexture);
                        } else {
                            s sVar = this.f50498w;
                            if (sVar != null) {
                                sVar.n(this.f50485r, this.f50488s, D(this.f50479p));
                                Surface surface = null;
                                if (!this.f50474n0 && this.f50486r0) {
                                    this.f50486r0 = false;
                                    s sVar2 = this.f50498w;
                                    Handler handler = sVar2.f50613u;
                                    if (sVar2.f50608r0 && handler != null) {
                                        handler.post(new f80((Object) sVar2, false, (Object) null, 17));
                                    }
                                }
                                s sVar3 = this.f50498w;
                                Surface surface2 = sVar3.f50616w;
                                if (surface2 != null) {
                                    this.f50494u = surface2;
                                    if (this.f50474n0 && (!sVar3.f50585f || (surface = sVar3.f50620y) == null)) {
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
                        n nVar = this.f50463j;
                        nVar.b("camera open requested: id=" + this.f50476o + ", preview=" + this.f50482q + ", recording=" + this.f50485r + ", crop=" + this.f50488s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.f50474n0);
                        this.f50442b.openCamera(this.f50476o, this.f50484q1, this.f50473n);
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
        n0 n0Var;
        i iVar;
        if (this.f50470l0 && !this.m0 && !(z10 = this.f50489s0) && (cameraDevice = this.f50492t0) == null) {
            n0 n0Var2 = this.H;
            n0 n0Var3 = n0.f50557a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f50558b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                iVar = this.f50464j0;
            } else {
                iVar = this.f50467k0;
            }
            if (iVar != null) {
                String str = iVar.f50429a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f50501x0 = iVar;
                        this.f50489s0 = true;
                        this.B0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f50463j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f50430b);
                        this.f50442b.openCamera(str, this.f50487r1, this.f50473n);
                    } catch (Exception e) {
                        this.f50489s0 = false;
                        y("open request failed", e);
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
        if (this.f50470l0) {
            this.f50474n0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f50463j;
        if (i10 < 30) {
            this.m0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l4 = l();
        p0 p0Var = l4.h;
        String str2 = l4.f50429a;
        n0 n0Var = l4.f50430b;
        n0 n0Var2 = n0.f50557a;
        if (n0Var == n0Var2) {
            n0Var2 = n0.f50558b;
        }
        try {
            try {
                S(n0Var2);
                i l10 = l();
                p0 p0Var2 = l10.h;
                String str3 = l10.f50429a;
                boolean E = E(str2, str3);
                this.f50470l0 = E;
                if (E && p0Var != p0Var2) {
                    this.f50470l0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f50432f + ", second=" + l10.e + "/" + l10.f50432f + ", firstFps=" + p0Var.f50571a + ", secondFps=" + p0Var2.f50571a);
                }
                boolean z10 = this.f50470l0;
                if (!z10) {
                    this.m0 = true;
                }
                this.f50474n0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f50470l0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f50470l0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.m0 = true;
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
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.m0 = true;
        this.f50470l0 = false;
        this.f50505z0 = false;
        this.f50503y0 = null;
        this.E0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f50504z;
        this.f50497v0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f50492t0;
        this.f50499w0 = cameraDevice2;
        this.f50504z = null;
        this.f50492t0 = null;
        this.f50501x0 = null;
        CameraDevice cameraDevice3 = this.f50495u0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f50495u0 = null;
        }
        n nVar = this.f50463j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.f50497v0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        v.append(id2);
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f50499w0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        v.append(str3);
        v.append(", fps=");
        p0 p0Var = this.J;
        if (p0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(p0Var.f50571a);
        }
        v.append(valueOf);
        v.append(", switchElapsedMs=");
        v.append(z(this.I0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        v.append(str2);
        nVar.b(v.toString());
        CameraDevice cameraDevice6 = this.f50497v0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f50499w0;
        if (cameraDevice7 != null && cameraDevice7 != this.f50497v0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f50445c.setSurfaceTextureListener(null);
        this.f50445c.removeOnLayoutChangeListener(this.f50472m1);
        Handler handler = this.f50473n;
        HandlerThread handlerThread = this.f50471m;
        this.f50473n = null;
        this.f50471m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new s9.g(28, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f50463j.a("camera error", exc);
        e3 e3Var = this.f50466k;
        ((u0) e3Var.f17209b).f50639i.post(new j0(e3Var, exc, 1));
    }

    public final void O() {
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f50441a1 = 0L;
        this.f50444b1 = 0L;
        this.f50447c1 = 0L;
        this.f50449d1 = 0L;
        this.f50451e1 = 0.0d;
        this.f50454f1 = 0L;
        this.f50457g1 = 0L;
        this.f50459h1 = 0L;
        this.f50462i1 = 0L;
        this.f50465j1 = 0L;
        this.f50468k1 = 0L;
        this.l1 = 0L;
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

    public final s4.d Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, k6.m mVar) {
        Range[] rangeArr;
        k6.m mVar2;
        int i10;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar = this.f50463j;
        p0 p0Var = this.h;
        p0 p0Var2 = p0.FPS_30;
        if (p0Var != p0Var2) {
            if (this.f50458h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                mVar2 = mVar;
            } else {
                int i11 = p0Var.f50571a;
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
                        k6.m m10 = m(sizeArr2, this.d, this.f50455g);
                        nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new s4.d(p0.FPS_60, C, m10, 5);
                    } catch (RuntimeException unused) {
                        nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new s4.d(p0Var2, C2, mVar, 5);
            }
        } else {
            rangeArr = rangeArr4;
            mVar2 = mVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(p0Var.f50571a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        if (this.f50458h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        nVar.b(v.toString());
        return new s4.d(p0Var2, C3, mVar2, 5);
    }

    public final void R(String str, Exception exc) {
        this.f50505z0 = true;
        y(str, exc);
        if (this.f50495u0 == null) {
            this.f50505z0 = false;
            u();
            return;
        }
        this.f50463j.b("capture session retry waiting for standby camera close: id=" + this.f50495u0.getId());
    }

    public final void S(vi.n0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.S(vi.n0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f50473n;
        if (this.V && handler != null) {
            handler.post(new d60(20, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f50473n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f50478o1);
            handler.post(this.f50478o1);
            return true;
        }
        return false;
    }

    public final void X(w wVar, long j10, n0 n0Var) {
        if (this.f50471m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f50471m = handlerThread;
            handlerThread.start();
            this.f50473n = new Handler(this.f50471m.getLooper());
        }
        this.E = wVar;
        this.M = j10;
        this.F = n0Var;
        this.V = true;
        this.f50443b0 = false;
        this.f50453f0 = false;
        this.f50502y = null;
        this.f50446c0 = true;
        this.F0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        n nVar = this.f50463j;
        nVar.b("camera segment start: facing=" + n0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f50445c.isAvailable());
        this.f50445c.setSurfaceTextureListener(this.f50481p1);
        Handler handler = this.f50473n;
        if (this.V && handler != null && this.f50445c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f50473n;
        if (!this.V || this.f50443b0 || handler == null) {
            return false;
        }
        this.f50443b0 = true;
        this.f50446c0 = false;
        this.f50463j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(n0 n0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (n0Var == n0.f50557a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f50442b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((p0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f50455g)).f47755b) == p0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(vi.n0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.a0(vi.n0):void");
    }

    public final boolean b0(n0 n0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder x9;
        if (!this.f50474n0 || !this.f50480p0 || !this.f50483q0 || (cameraDevice = this.f50504z) == null || (cameraDevice2 = this.f50492t0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f50501x0) == null || iVar.f50430b != n0Var || this.f50498w == null) {
            return false;
        }
        this.f50504z = cameraDevice2;
        this.f50492t0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f50494u;
        this.f50494u = this.v;
        this.v = surface;
        if (this.G == n0.f50557a) {
            iVar2 = this.f50464j0;
        } else {
            iVar2 = this.f50467k0;
        }
        this.f50501x0 = iVar2;
        h(iVar);
        this.G = n0Var;
        try {
            try {
                x9 = x(this.f50504z, this.f50494u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
            e = e10;
        }
        try {
            this.C = x9;
            this.A.setRepeatingRequest(x9.build(), this.f50496u1, this.f50473n);
            i iVar3 = this.f50501x0;
            if (iVar3 != null) {
                CaptureRequest.Builder x10 = x(this.f50492t0, this.v, iVar3, false, false);
                this.D = x10;
                this.B.setRepeatingRequest(x10.build(), this.f50496u1, this.f50473n);
            }
            boolean z10 = !this.f50486r0;
            this.f50486r0 = z10;
            long j10 = this.I0;
            s sVar = this.f50498w;
            b bVar = new b(this, n0Var, j10, 0);
            Handler handler = sVar.f50613u;
            if (sVar.f50608r0 && handler != null) {
                handler.post(new f80(sVar, z10, bVar, 17));
            }
            this.f50480p0 = true;
            this.f50483q0 = true;
            this.E0 = true;
            this.Z = false;
            this.X = false;
            this.f50440a0 = false;
            O();
            this.f50463j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f50504z.getId() + ", standbyId=" + this.f50492t0.getId() + ", input=" + (this.f50486r0 ? 1 : 0) + ", elapsedMs=" + z(this.I0));
            this.f50445c.post(new a(this, 1));
            e3 e3Var = this.f50466k;
            ((u0) e3Var.f17209b).f50639i.post(new f80((Object) e3Var, (Object) new h(this.G, this.I, this.J, this.f50482q, this.f50485r, this.O, F()), true, 18));
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

    public final boolean c0(n0 n0Var) {
        String id2;
        CameraDevice cameraDevice = this.f50492t0;
        i iVar = this.f50501x0;
        if (cameraDevice == null || iVar == null || iVar.f50430b != n0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f50445c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f50504z;
        n0 n0Var2 = this.G;
        if (n0Var2 != null) {
            if (n0Var2 == n0.f50557a) {
                iVar2 = this.f50464j0;
            } else {
                iVar2 = this.f50467k0;
            }
        }
        q();
        this.f50492t0 = cameraDevice2;
        this.f50501x0 = iVar2;
        this.f50504z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.f50482q.getWidth(), this.f50482q.getHeight());
        s sVar = this.f50498w;
        if (sVar != null) {
            sVar.n(this.f50485r, this.f50488s, D(this.f50479p));
            Surface surface = this.f50498w.f50616w;
            if (surface != null) {
                this.f50494u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.E0 = true;
        n nVar = this.f50463j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f50476o);
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
        if (this.f50446c0) {
            if (this.f50477o0) {
                this.f50445c.setTransform(new Matrix());
                this.f50463j.b("preview transform: GL output, identity matrix, view=" + this.f50445c.getWidth() + "x" + this.f50445c.getHeight());
                return;
            }
            Size size = this.f50485r;
            if (size != null && this.f50445c.getWidth() != 0 && this.f50445c.getHeight() != 0) {
                int min = Math.min(this.f50488s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f50445c;
                boolean z10 = false;
                if (this.f50479p != null && textureView.getDisplay() != null && (num = (Integer) this.f50479p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f50445c.getWidth() * 0.5f, this.f50445c.getHeight() * 0.5f);
                this.f50445c.setTransform(matrix);
                this.f50463j.b("preview transform: view=" + this.f50445c.getWidth() + "x" + this.f50445c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: vi.j.g():void");
    }

    public final void h(i iVar) {
        this.f50476o = iVar.f50429a;
        this.H = iVar.f50430b;
        this.f50479p = iVar.f50431c;
        this.f50482q = iVar.d;
        this.f50485r = iVar.e;
        this.f50488s = iVar.f50432f;
        this.I = iVar.f50433g;
        this.J = iVar.h;
        this.K = iVar.f50434i;
        this.L = iVar.f50435j;
        this.O = iVar.f50436k;
        this.f50453f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f50473n;
        if (handler != null) {
            handler.removeCallbacks(this.f50475n1);
        }
        this.f50502y = null;
    }

    public final i l() {
        return new i(this.f50476o, this.H, this.f50479p, this.f50482q, this.f50485r, this.f50488s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.A0 = false;
        this.f50505z0 = false;
        this.f50497v0 = null;
        this.f50499w0 = null;
        this.f50446c0 = false;
        this.Z = false;
        this.f50440a0 = false;
        this.C = null;
        this.Q = false;
        this.f50503y0 = null;
        this.f50489s0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f50504z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f50504z = null;
        }
        CameraDevice cameraDevice2 = this.f50492t0;
        this.f50492t0 = null;
        this.f50501x0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f50495u0;
        this.f50495u0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        s sVar = this.f50498w;
        if (sVar != null) {
            sVar.l();
            this.f50498w = null;
        }
        Surface surface = this.f50491t;
        if (surface != null) {
            surface.release();
            this.f50491t = null;
        }
        this.f50494u = null;
        this.v = null;
        this.f50474n0 = false;
        this.f50477o0 = false;
        this.f50480p0 = false;
        this.f50483q0 = false;
        this.f50486r0 = false;
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
        this.f50483q0 = false;
    }

    public final void t() {
        String str;
        this.f50503y0 = null;
        this.E0 = false;
        if (this.f50470l0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f50463j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f50504z;
        if (cameraDevice != null) {
            this.f50504z = null;
            this.C0 = SystemClock.elapsedRealtimeNanos();
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
        n0 n0Var;
        i iVar;
        Surface surface4;
        this.f50477o0 = this.f50474n0;
        w wVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f50452f;
        int i12 = this.f50461i0;
        if (i12 <= 0) {
            i12 = this.J.f50571a;
        }
        int i13 = i12;
        n nVar = this.f50463j;
        e3 e3Var = this.f50466k;
        Objects.requireNonNull(e3Var);
        c cVar = new c(e3Var, 0);
        e3 e3Var2 = this.f50466k;
        Objects.requireNonNull(e3Var2);
        m mVar = new m(wVar, j10, i10, i11, i13, nVar, cVar, new c(e3Var2, 1));
        this.f50500x = mVar;
        synchronized (mVar) {
            if (mVar.D) {
                surface = mVar.f50542q;
            } else {
                mVar.q();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f50539n.start();
                    mVar.D = true;
                    mVar.f50532f.b("codecs prepared: video=" + mVar.f50539n.getName() + ", audio=" + mVar.f50540o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f50542q;
                } catch (IOException | RuntimeException e) {
                    mVar.n();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f50485r;
        if (this.f50477o0) {
            surface2 = this.f50491t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.f50474n0;
        int i14 = this.e;
        int i15 = this.f50488s;
        boolean D = D(this.f50479p);
        boolean z12 = this.f50460i;
        n nVar2 = this.f50463j;
        m mVar2 = this.f50500x;
        e3 e3Var3 = this.f50466k;
        Objects.requireNonNull(e3Var3);
        s sVar = new s(size, surface5, surface2, z11, i14, i15, D, z12, nVar2, mVar2, new c(e3Var3, 2));
        this.f50498w = sVar;
        sVar.f50612t0 = new a(this, 2);
        s sVar2 = this.f50498w;
        if (sVar2.f50608r0) {
            surface3 = sVar2.f50616w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            sVar2.f50611t = handlerThread;
            handlerThread.start();
            sVar2.f50606q0 = System.nanoTime();
            n nVar3 = sVar2.f50590i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(sVar2.f50577a);
            sb2.append(", crop=");
            sb2.append(sVar2.f50592j);
            sb2.append(", output=");
            sb2.append(sVar2.f50587g);
            sb2.append("x");
            sb2.append(sVar2.f50587g);
            sb2.append(", filter=");
            if (sVar2.f50592j == sVar2.f50587g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(sVar2.h);
            sb2.append(", dualInput=");
            sb2.append(sVar2.f50585f);
            sb2.append(", glPreview=");
            if (sVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(sVar2.f50611t.getLooper());
            sVar2.f50613u = handler;
            handler.post(new s9.g(29, sVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (sVar2.f50617w0 == null) {
                    surface3 = sVar2.f50616w;
                } else {
                    RuntimeException runtimeException = sVar2.f50617w0;
                    sVar2.f50617w0 = null;
                    sVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                sVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e10);
            }
        }
        this.f50494u = surface3;
        if (this.f50474n0) {
            n0 n0Var2 = this.H;
            n0 n0Var3 = n0.f50557a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f50558b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                iVar = this.f50464j0;
            } else {
                iVar = this.f50467k0;
            }
            if (iVar != null) {
                s sVar3 = this.f50498w;
                Size size2 = iVar.e;
                int i16 = iVar.f50432f;
                boolean D2 = D(iVar.f50431c);
                Handler handler2 = sVar3.f50613u;
                if (sVar3.f50608r0 && sVar3.f50585f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new p(sVar3, size2, i16, D2, runtimeExceptionArr, countDownLatch2, 0));
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
                s sVar4 = this.f50498w;
                if (sVar4.f50585f && (surface4 = sVar4.f50620y) != null) {
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
            if (this.f50474n0) {
                this.f50463j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                s sVar = this.f50498w;
                if (sVar != null) {
                    sVar.l();
                    this.f50498w = null;
                }
                m mVar = this.f50500x;
                if (mVar != null) {
                    mVar.u();
                    this.f50500x = null;
                }
                this.f50494u = null;
                this.v = null;
                this.f50474n0 = false;
                this.f50477o0 = false;
                this.f50470l0 = false;
                this.m0 = true;
                surfaceTexture.setDefaultBufferSize(this.f50482q.getWidth(), this.f50482q.getHeight());
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
        this.m0 = true;
        this.f50470l0 = false;
        this.f50474n0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f50463j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f50492t0;
        this.f50492t0 = null;
        this.f50501x0 = null;
        if (cameraDevice != null && cameraDevice != this.f50504z) {
            this.f50495u0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
