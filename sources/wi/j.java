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
import fi.n3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.g60;
import org.telegram.ui.hy0;
public final class j {
    public CameraCaptureSession A;
    public boolean A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public long D0;
    public x E;
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
    public m6.n L;
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
    public final Context f57901a;
    public volatile boolean f57902a0;
    public long f57903a1;
    public final CameraManager f57904b;
    public volatile boolean f57905b0;
    public long f57906b1;
    public final TextureView f57907c;
    public volatile boolean f57908c0;
    public long f57909c1;
    public final r0 d;
    public boolean f57910d0;
    public long f57911d1;
    public final int f57912e;
    public boolean f57913e0;
    public double f57914e1;
    public final int f57915f;
    public boolean f57916f0;
    public long f57917f1;
    public final n0 f57918g;
    public boolean f57919g0;
    public long f57920g1;
    public final o0 h;
    public boolean f57921h0;
    public long f57922h1;
    public final boolean f57923i;
    public int f57924i0;
    public long f57925i1;
    public final n f57926j;
    public i f57927j0;
    public long f57928j1;
    public final qt f57929k;
    public i f57930k0;
    public long f57931k1;
    public boolean f57933l0;
    public long l1;
    public HandlerThread f57934m;
    public boolean m0;
    public final n3 f57935m1;
    public Handler f57936n;
    public boolean f57937n0;
    public final a n1;
    public String f57938o;
    public boolean f57939o0;
    public final a f57940o1;
    public CameraCharacteristics f57941p;
    public boolean f57942p0;
    public final w30 f57943p1;
    public Size f57944q;
    public boolean f57945q0;
    public final e f57946q1;
    public volatile Size f57947r;
    public boolean f57948r0;
    public final e f57949r1;
    public volatile int f57950s;
    public boolean f57951s0;
    public final f f57952s1;
    public Surface f57953t;
    public CameraDevice f57954t0;
    public final f f57955t1;
    public Surface f57956u;
    public CameraDevice f57957u0;
    public final g f57958u1;
    public Surface v;
    public CameraDevice f57959v0;
    public t f57960w;
    public CameraDevice f57961w0;
    public m f57962x;
    public i f57963x0;
    public m f57964y;
    public m0 f57965y0;
    public CameraDevice f57966z;
    public boolean f57967z0;
    public final Rect f57932l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, r0 r0Var, int i7, n0 n0Var, o0 o0Var, boolean z9, n nVar, qt qtVar) {
        n3 n3Var = new n3(this, 2);
        this.f57935m1 = n3Var;
        this.n1 = new a(this, 4);
        this.f57940o1 = new a(this, 5);
        this.f57943p1 = new w30(this, 4);
        this.f57946q1 = new e(this, 0);
        this.f57949r1 = new e(this, 1);
        this.f57952s1 = new f(this, 0);
        this.f57955t1 = new f(this, 1);
        this.f57958u1 = new g(this);
        this.f57901a = context.getApplicationContext();
        this.f57904b = (CameraManager) context.getSystemService("camera");
        this.f57907c = textureView;
        this.d = r0Var;
        this.f57912e = r0Var.f58045a;
        this.f57915f = i7;
        this.f57918g = n0Var;
        this.h = o0Var;
        this.f57923i = z9;
        this.f57926j = nVar;
        this.f57929k = qtVar;
        textureView.addOnLayoutChangeListener(n3Var);
    }

    public static Range C(Range[] rangeArr, int i7) {
        int i10;
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        if (i7 > 30) {
            i10 = i7 / 2;
        } else {
            i10 = 1;
        }
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i7))) {
                if (((Integer) range3.getUpper()).intValue() == i7 && ((Integer) range3.getLower()).intValue() >= i10 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
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

    public static float W(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d2 = j10;
        double d10 = j3 / d2;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d2) - (d10 * d10))) / 1000000.0d);
    }

    public static void a(j jVar) {
        CameraDevice cameraDevice = jVar.f57966z;
        CameraDevice cameraDevice2 = jVar.f57954t0;
        if (jVar.f57937n0 && cameraDevice != null && cameraDevice2 != null && jVar.f57956u != null && jVar.v != null && jVar.A == null && jVar.B == null) {
            jVar.f57942p0 = false;
            jVar.f57945q0 = false;
            try {
                jVar.H0 = SystemClock.elapsedRealtimeNanos();
                n nVar = jVar.f57926j;
                nVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.f57947r + ", fpsRange=" + jVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(jVar.f57956u), jVar.f57955t1, jVar.f57936n);
                cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.f57952s1, jVar.f57936n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                jVar.A("session request failed", e10, false);
            }
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z9;
        String str2;
        boolean z10 = true;
        if (cameraDevice == jVar.f57966z) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && jVar.f57937n0) {
            n nVar = jVar.f57926j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            nVar.b(sb2.toString());
            jVar.f57937n0 = false;
            jVar.f57933l0 = false;
            jVar.m0 = true;
            jVar.f57951s0 = false;
            jVar.f57954t0 = null;
            jVar.f57963x0 = null;
            jVar.r();
            jVar.f57957u0 = cameraDevice;
            if (!jVar.V || jVar.f57966z == null || jVar.A != null || jVar.X) {
                z10 = false;
            }
            jVar.f57967z0 = z10;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.f57954t0) {
            jVar.f57954t0 = null;
        }
        jVar.f57951s0 = false;
        cameraDevice.close();
        if (z9) {
            jVar.q();
            jVar.f57966z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(rf.b.i("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.f57965y0 != null) {
            jVar.t();
        } else if (jVar.V && jVar.f57966z != null && jVar.A == null && !jVar.X) {
            jVar.f57926j.b("warm camera failed during startup; configuring active camera only");
            jVar.u();
        }
    }

    public static String c(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
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
        if (cameraDevice == jVar.f57959v0) {
            jVar.f57959v0 = null;
        }
        if (cameraDevice == jVar.f57961w0) {
            jVar.f57961w0 = null;
        }
        n nVar = jVar.f57926j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.f57959v0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f57961w0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f57957u0) {
            return false;
        }
        jVar.f57957u0 = null;
        n nVar = jVar.f57926j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f57967z0) {
            jVar.f57967z0 = false;
            if (jVar.V && !jVar.f57905b0 && jVar.f57966z != null) {
                jVar.f57926j.b("retrying capture session after standby camera closed");
                jVar.u();
                return true;
            }
            return true;
        } else if (jVar.X && jVar.f57965y0 != null) {
            jVar.f57926j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(j jVar) {
        m0 m0Var = jVar.f57965y0;
        if (m0Var != null && jVar.f57937n0 && jVar.f57942p0 && jVar.f57945q0) {
            jVar.f57965y0 = null;
            if (!jVar.b0(m0Var)) {
                jVar.X = false;
                jVar.a0(m0Var);
            }
        }
    }

    public static long i(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float j(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (((float) j3) / ((float) j10)) / 1000000.0f;
    }

    public static m6.n m(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i7;
        m6.n o4;
        n0 n0Var2;
        m6.n o10;
        n0 n0Var3 = n0.f58023c;
        if (n0Var == n0Var3) {
            i7 = r0Var.f58045a;
        } else {
            r0 r0Var2 = r0.P480;
            n0 n0Var4 = n0.f58021a;
            if (r0Var == r0Var2) {
                if (n0Var == n0Var4) {
                    i7 = 960;
                }
                i7 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i7 = 540;
                }
                i7 = 720;
            }
        }
        m6.n o11 = o(sizeArr, i7, n0Var);
        if (o11 != null) {
            return o11;
        }
        if (r0Var == r0.P360 && n0Var == (n0Var2 = n0.f58022b) && (o10 = o(sizeArr, 480, n0Var2)) != null) {
            return o10;
        }
        int i10 = r0Var.f58045a;
        if (n0Var != n0Var3 && (o4 = o(sizeArr, i10, n0Var3)) != null) {
            return o4;
        }
        int i11 = r0Var.f58045a;
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
        return new m6.n(n(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static m6.n o(Size[] sizeArr, int i7, n0 n0Var) {
        int compare;
        m6.n nVar = null;
        for (Size size : sizeArr) {
            int i10 = ((i7 * 15) / 100) + i7;
            int min = Math.min(1920, i7 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i7 && V <= i10 && max <= min) {
                Size n10 = n(sizeArr, size);
                m6.n nVar2 = new m6.n(n10, size, n0Var, i7);
                if (nVar != null) {
                    Size size2 = (Size) nVar.f19918b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) nVar.f19919c;
                    int abs2 = Math.abs(V(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long i11 = i(size) + i(n10);
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

    public static boolean s(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long z(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public final void A(String str, Exception exc, boolean z9) {
        String str2;
        if (this.f57937n0) {
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z9);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            this.f57926j.b(sb2.toString());
            this.f57937n0 = false;
            this.f57933l0 = false;
            this.m0 = true;
            this.f57942p0 = false;
            this.f57945q0 = false;
            if (z9 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f57954t0;
                this.f57954t0 = null;
                this.f57963x0 = null;
                if (cameraDevice != null) {
                    this.f57957u0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f57957u0 == null && this.X && this.f57965y0 != null) {
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
        boolean z9;
        m mVar = this.f57962x;
        if (mVar != null) {
            synchronized (mVar) {
                z9 = mVar.E;
            }
            if (z9) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f57916f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f57916f0 = true;
        this.f57921h0 = true;
        q();
        m6.n nVar = this.L;
        if (nVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = o0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f57941p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f57944q = (Size) nVar.f19918b;
        this.f57947r = (Size) nVar.f19919c;
        this.f57950s = nVar.f19917a;
        this.I = (n0) nVar.d;
        this.f57927j0 = null;
        this.f57930k0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f57907c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f57944q.getWidth(), this.f57944q.getHeight());
        }
        t tVar = this.f57960w;
        if (tVar != null) {
            tVar.l();
            this.f57960w = null;
        }
        m mVar2 = this.f57962x;
        if (mVar2 != null) {
            mVar2.u();
            this.f57962x = null;
        }
        this.f57956u = null;
        try {
            v();
            O();
            n nVar2 = this.f57926j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f57944q);
            sb2.append(", recording=");
            sb2.append(this.f57947r);
            sb2.append(", crop=");
            sb2.append(this.f57950s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar2.b(sb2.toString());
            Handler handler = this.f57936n;
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
        for (Set<String> set : this.f57904b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == m0.f58016b && (cameraCharacteristics = this.f57941p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.A0) {
            if (cameraDevice == this.f57959v0 || cameraDevice == this.f57961w0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.A0 && this.f57959v0 == null && this.f57961w0 == null) {
            this.A0 = false;
            this.X = false;
            n nVar = this.f57926j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.I0));
            if (this.V && !this.f57905b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f57966z == null) {
            if (f0.d.b(this.f57901a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.d.b(this.f57901a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.D0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z9 = z(this.D0);
                    if (this.f57966z == null && this.f57962x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f57907c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.f57937n0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f57907c.getWidth(), this.f57907c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f57944q.getWidth(), this.f57944q.getHeight());
                        }
                        if (this.f57953t == null) {
                            this.f57953t = new Surface(surfaceTexture);
                        }
                        if (this.f57962x == null) {
                            w(surfaceTexture);
                        } else {
                            t tVar = this.f57960w;
                            if (tVar != null) {
                                tVar.n(this.f57947r, this.f57950s, D(this.f57941p));
                                Surface surface = null;
                                if (!this.f57937n0 && this.f57948r0) {
                                    this.f57948r0 = false;
                                    t tVar2 = this.f57960w;
                                    Handler handler = tVar2.f58089u;
                                    if (tVar2.f58084r0 && handler != null) {
                                        handler.post(new g60((Object) tVar2, false, (Object) null, 17));
                                    }
                                }
                                t tVar3 = this.f57960w;
                                Surface surface2 = tVar3.f58092w;
                                if (surface2 != null) {
                                    this.f57956u = surface2;
                                    if (this.f57937n0 && (!tVar3.f58061f || (surface = tVar3.f58096y) == null)) {
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
                        n nVar = this.f57926j;
                        nVar.b("camera open requested: id=" + this.f57938o + ", preview=" + this.f57944q + ", recording=" + this.f57947r + ", crop=" + this.f57950s + ", selectionElapsedMs=" + z9 + ", dualActive=" + this.f57937n0);
                        this.f57904b.openCamera(this.f57938o, this.f57946q1, this.f57936n);
                    }
                } catch (Exception e10) {
                    this.W = false;
                    N(e10);
                }
            }
        }
    }

    public final void J() {
        boolean z9;
        CameraDevice cameraDevice;
        m0 m0Var;
        i iVar;
        if (this.f57933l0 && !this.m0 && !(z9 = this.f57951s0) && (cameraDevice = this.f57954t0) == null) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f58015a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f58016b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f57927j0;
            } else {
                iVar = this.f57930k0;
            }
            if (iVar != null) {
                String str = iVar.f57890a;
                if (!z9 && cameraDevice == null) {
                    try {
                        this.f57963x0 = iVar;
                        this.f57951s0 = true;
                        this.B0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f57926j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f57891b);
                        this.f57904b.openCamera(str, this.f57949r1, this.f57936n);
                    } catch (Exception e10) {
                        this.f57951s0 = false;
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
        if (this.f57933l0) {
            this.f57937n0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        n nVar = this.f57926j;
        if (i7 < 30) {
            this.m0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l10 = l();
        o0 o0Var = l10.h;
        String str2 = l10.f57890a;
        m0 m0Var = l10.f57891b;
        m0 m0Var2 = m0.f58015a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.f58016b;
        }
        try {
            try {
                S(m0Var2);
                i l11 = l();
                o0 o0Var2 = l11.h;
                String str3 = l11.f57890a;
                boolean E = E(str2, str3);
                this.f57933l0 = E;
                if (E && o0Var != o0Var2) {
                    this.f57933l0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l10.f57893e + "/" + l10.f57894f + ", second=" + l11.f57893e + "/" + l11.f57894f + ", firstFps=" + o0Var.f58028a + ", secondFps=" + o0Var2.f58028a);
                }
                boolean z9 = this.f57933l0;
                if (!z9) {
                    this.m0 = true;
                }
                this.f57937n0 = z9;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f57933l0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f57933l0) {
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
        this.f57933l0 = false;
        this.f57967z0 = false;
        this.f57965y0 = null;
        this.E0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f57966z;
        this.f57959v0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f57954t0;
        this.f57961w0 = cameraDevice2;
        this.f57966z = null;
        this.f57954t0 = null;
        this.f57963x0 = null;
        CameraDevice cameraDevice3 = this.f57957u0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f57957u0 = null;
        }
        n nVar = this.f57926j;
        StringBuilder u10 = a8.p0.u("camera warm-switch recovery started: reason=", str, ", target=");
        u10.append(this.F);
        u10.append(", targetId=");
        CameraDevice cameraDevice4 = this.f57959v0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        u10.append(id2);
        u10.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f57961w0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        u10.append(str3);
        u10.append(", fps=");
        o0 o0Var = this.J;
        if (o0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(o0Var.f58028a);
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
        CameraDevice cameraDevice6 = this.f57959v0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f57961w0;
        if (cameraDevice7 != null && cameraDevice7 != this.f57959v0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f57907c.setSurfaceTextureListener(null);
        this.f57907c.removeOnLayoutChangeListener(this.f57935m1);
        Handler handler = this.f57936n;
        HandlerThread handlerThread = this.f57934m;
        this.f57936n = null;
        this.f57934m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new ti.p(29, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f57926j.a("camera error", exc);
        qt qtVar = this.f57929k;
        ((t0) qtVar.f37394b).f58105i.post(new j0(qtVar, exc, 1));
    }

    public final void O() {
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f57903a1 = 0L;
        this.f57906b1 = 0L;
        this.f57909c1 = 0L;
        this.f57911d1 = 0L;
        this.f57914e1 = 0.0d;
        this.f57917f1 = 0L;
        this.f57920g1 = 0L;
        this.f57922h1 = 0L;
        this.f57925i1 = 0L;
        this.f57928j1 = 0L;
        this.f57931k1 = 0L;
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

    public final hy0 Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, m6.n nVar) {
        Range[] rangeArr;
        m6.n nVar2;
        int i7;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar3 = this.f57926j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.FPS_30;
        if (o0Var != o0Var2) {
            if (this.f57921h0) {
                rangeArr = rangeArr4;
                i7 = 30;
                nVar2 = nVar;
            } else {
                int i10 = o0Var.f58028a;
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
                        m6.n m10 = m(sizeArr2, this.d, this.f57918g);
                        nVar3.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new hy0(o0.FPS_60, C, m10, 24);
                    } catch (RuntimeException unused) {
                        nVar3.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar3.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar3.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + C2);
                return new hy0(o0Var2, C2, nVar, 24);
            }
        } else {
            rangeArr = rangeArr4;
            nVar2 = nVar;
            i7 = 30;
        }
        Range C3 = C(rangeArr, i7);
        StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
        u10.append(o0Var.f58028a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        if (this.f57921h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        nVar3.b(u10.toString());
        return new hy0(o0Var2, C3, nVar2, 24);
    }

    public final void R(String str, Exception exc) {
        this.f57967z0 = true;
        y(str, exc);
        if (this.f57957u0 == null) {
            this.f57967z0 = false;
            u();
            return;
        }
        this.f57926j.b("capture session retry waiting for standby camera close: id=" + this.f57957u0.getId());
    }

    public final void S(wi.m0 r32) {
        throw new UnsupportedOperationException("Method not decompiled: wi.j.S(wi.m0):void");
    }

    public final void T(boolean z9) {
        Handler handler = this.f57936n;
        if (this.V && handler != null) {
            handler.post(new tp0(16, this, z9));
        }
    }

    public final boolean U(float f10) {
        this.N = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.f57936n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f57940o1);
            handler.post(this.f57940o1);
            return true;
        }
        return false;
    }

    public final void X(x xVar, long j3, m0 m0Var) {
        if (this.f57934m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f57934m = handlerThread;
            handlerThread.start();
            this.f57936n = new Handler(this.f57934m.getLooper());
        }
        this.E = xVar;
        this.M = j3;
        this.F = m0Var;
        this.V = true;
        this.f57905b0 = false;
        this.f57916f0 = false;
        this.f57964y = null;
        this.f57908c0 = true;
        this.F0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        n nVar = this.f57926j;
        nVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f57907c.isAvailable());
        this.f57907c.setSurfaceTextureListener(this.f57943p1);
        Handler handler = this.f57936n;
        if (this.V && handler != null && this.f57907c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f57936n;
        if (!this.V || this.f57905b0 || handler == null) {
            return false;
        }
        this.f57905b0 = true;
        this.f57908c0 = false;
        this.f57926j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(m0 m0Var) {
        int i7;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f58015a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        CameraManager cameraManager = this.f57904b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f57918g)).f46528b) == o0.FPS_60) {
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
        if (!this.f57937n0 || !this.f57942p0 || !this.f57945q0 || (cameraDevice = this.f57966z) == null || (cameraDevice2 = this.f57954t0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f57963x0) == null || iVar.f57891b != m0Var || this.f57960w == null) {
            return false;
        }
        this.f57966z = cameraDevice2;
        this.f57954t0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f57956u;
        this.f57956u = this.v;
        this.v = surface;
        if (this.G == m0.f58015a) {
            iVar2 = this.f57927j0;
        } else {
            iVar2 = this.f57930k0;
        }
        this.f57963x0 = iVar2;
        h(iVar);
        this.G = m0Var;
        try {
            try {
                x10 = x(this.f57966z, this.f57956u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
                e = e10;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
            e = e11;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f57958u1, this.f57936n);
            i iVar3 = this.f57963x0;
            if (iVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f57954t0, this.v, iVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f57958u1, this.f57936n);
            }
            boolean z9 = !this.f57948r0;
            this.f57948r0 = z9;
            long j3 = this.I0;
            t tVar = this.f57960w;
            b bVar = new b(this, m0Var, j3, 0);
            Handler handler = tVar.f58089u;
            if (tVar.f58084r0 && handler != null) {
                handler.post(new g60(tVar, z9, bVar, 17));
            }
            this.f57942p0 = true;
            this.f57945q0 = true;
            this.E0 = true;
            this.Z = false;
            this.X = false;
            this.f57902a0 = false;
            O();
            this.f57926j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f57966z.getId() + ", standbyId=" + this.f57954t0.getId() + ", input=" + (this.f57948r0 ? 1 : 0) + ", elapsedMs=" + z(this.I0));
            this.f57907c.post(new a(this, 1));
            qt qtVar = this.f57929k;
            ((t0) qtVar.f37394b).f58105i.post(new g60((Object) qtVar, (Object) new h(this.G, this.I, this.J, this.f57944q, this.f57947r, this.O, F()), true, 18));
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
        CameraDevice cameraDevice = this.f57954t0;
        i iVar = this.f57963x0;
        if (cameraDevice == null || iVar == null || iVar.f57891b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f57907c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f57966z;
        m0 m0Var2 = this.G;
        if (m0Var2 != null) {
            if (m0Var2 == m0.f58015a) {
                iVar2 = this.f57927j0;
            } else {
                iVar2 = this.f57930k0;
            }
        }
        q();
        this.f57954t0 = cameraDevice2;
        this.f57963x0 = iVar2;
        this.f57966z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.f57944q.getWidth(), this.f57944q.getHeight());
        t tVar = this.f57960w;
        if (tVar != null) {
            tVar.n(this.f57947r, this.f57950s, D(this.f57941p));
            Surface surface = this.f57960w.f58092w;
            if (surface != null) {
                this.f57956u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.E0 = true;
        n nVar = this.f57926j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f57938o);
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
        if (this.f57908c0) {
            if (this.f57939o0) {
                this.f57907c.setTransform(new Matrix());
                this.f57926j.b("preview transform: GL output, identity matrix, view=" + this.f57907c.getWidth() + "x" + this.f57907c.getHeight());
                return;
            }
            Size size = this.f57947r;
            if (size != null && this.f57907c.getWidth() != 0 && this.f57907c.getHeight() != 0) {
                int min = Math.min(this.f57950s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f57907c;
                boolean z9 = false;
                if (this.f57941p != null && textureView.getDisplay() != null && (num = (Integer) this.f57941p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
                    int intValue = ((num.intValue() - (textureView.getDisplay().getRotation() * 90)) + 360) % 360;
                    if (intValue == 90 || intValue == 270) {
                        z9 = true;
                    }
                }
                if (z9) {
                    width = size.getHeight();
                } else {
                    width = size.getWidth();
                }
                float f10 = min;
                float f11 = width / f10;
                if (z9) {
                    height = size.getWidth();
                } else {
                    height = size.getHeight();
                }
                float f12 = height / f10;
                Matrix matrix = new Matrix();
                matrix.setScale(f11, f12, this.f57907c.getWidth() * 0.5f, this.f57907c.getHeight() * 0.5f);
                this.f57907c.setTransform(matrix);
                this.f57926j.b("preview transform: view=" + this.f57907c.getWidth() + "x" + this.f57907c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z9 + ", scale=" + f11 + "x" + f12);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: wi.j.g():void");
    }

    public final void h(i iVar) {
        this.f57938o = iVar.f57890a;
        this.H = iVar.f57891b;
        this.f57941p = iVar.f57892c;
        this.f57944q = iVar.d;
        this.f57947r = iVar.f57893e;
        this.f57950s = iVar.f57894f;
        this.I = iVar.f57895g;
        this.J = iVar.h;
        this.K = iVar.f57896i;
        this.L = iVar.f57897j;
        this.O = iVar.f57898k;
        this.f57916f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f57936n;
        if (handler != null) {
            handler.removeCallbacks(this.n1);
        }
        this.f57964y = null;
    }

    public final i l() {
        return new i(this.f57938o, this.H, this.f57941p, this.f57944q, this.f57947r, this.f57950s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.A0 = false;
        this.f57967z0 = false;
        this.f57959v0 = null;
        this.f57961w0 = null;
        this.f57908c0 = false;
        this.Z = false;
        this.f57902a0 = false;
        this.C = null;
        this.Q = false;
        this.f57965y0 = null;
        this.f57951s0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f57966z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f57966z = null;
        }
        CameraDevice cameraDevice2 = this.f57954t0;
        this.f57954t0 = null;
        this.f57963x0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f57957u0;
        this.f57957u0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        t tVar = this.f57960w;
        if (tVar != null) {
            tVar.l();
            this.f57960w = null;
        }
        Surface surface = this.f57953t;
        if (surface != null) {
            surface.release();
            this.f57953t = null;
        }
        this.f57956u = null;
        this.v = null;
        this.f57937n0 = false;
        this.f57939o0 = false;
        this.f57942p0 = false;
        this.f57945q0 = false;
        this.f57948r0 = false;
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
        this.f57945q0 = false;
    }

    public final void t() {
        String str;
        this.f57965y0 = null;
        this.E0 = false;
        if (this.f57933l0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f57926j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f57966z;
        if (cameraDevice != null) {
            this.f57966z = null;
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
        boolean z9;
        Surface surface3;
        m0 m0Var;
        i iVar;
        Surface surface4;
        this.f57939o0 = this.f57937n0;
        x xVar = this.E;
        long j3 = this.M;
        int i7 = this.f57912e;
        int i10 = this.f57915f;
        int i11 = this.f57924i0;
        if (i11 <= 0) {
            i11 = this.J.f58028a;
        }
        int i12 = i11;
        n nVar = this.f57926j;
        qt qtVar = this.f57929k;
        Objects.requireNonNull(qtVar);
        c cVar = new c(qtVar, 0);
        qt qtVar2 = this.f57929k;
        Objects.requireNonNull(qtVar2);
        m mVar = new m(xVar, j3, i7, i10, i12, nVar, cVar, new c(qtVar2, 1));
        this.f57962x = mVar;
        synchronized (mVar) {
            if (mVar.D) {
                surface = mVar.f58006q;
            } else {
                mVar.q();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f58003n.start();
                    mVar.D = true;
                    mVar.f57996f.b("codecs prepared: video=" + mVar.f58003n.getName() + ", audio=" + mVar.f58004o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f58006q;
                } catch (IOException | RuntimeException e10) {
                    mVar.n();
                    throw e10;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f57947r;
        if (this.f57939o0) {
            surface2 = this.f57953t;
        } else {
            surface2 = null;
        }
        boolean z10 = this.f57937n0;
        int i13 = this.f57912e;
        int i14 = this.f57950s;
        boolean D = D(this.f57941p);
        boolean z11 = this.f57923i;
        n nVar2 = this.f57926j;
        m mVar2 = this.f57962x;
        qt qtVar3 = this.f57929k;
        Objects.requireNonNull(qtVar3);
        t tVar = new t(size, surface5, surface2, z10, i13, i14, D, z11, nVar2, mVar2, new c(qtVar3, 2));
        this.f57960w = tVar;
        tVar.f58088t0 = new a(this, 2);
        t tVar2 = this.f57960w;
        if (tVar2.f58084r0) {
            surface3 = tVar2.f58092w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar2.f58087t = handlerThread;
            handlerThread.start();
            tVar2.f58082q0 = System.nanoTime();
            n nVar3 = tVar2.f58066i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar2.f58052a);
            sb2.append(", crop=");
            sb2.append(tVar2.f58068j);
            sb2.append(", output=");
            sb2.append(tVar2.f58063g);
            sb2.append("x");
            sb2.append(tVar2.f58063g);
            sb2.append(", filter=");
            if (tVar2.f58068j == tVar2.f58063g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(tVar2.h);
            sb2.append(", dualInput=");
            sb2.append(tVar2.f58061f);
            sb2.append(", glPreview=");
            if (tVar2.f58059e != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            sb2.append(z9);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(tVar2.f58087t.getLooper());
            tVar2.f58089u = handler;
            handler.post(new q(0, tVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar2.f58093w0 == null) {
                    surface3 = tVar2.f58092w;
                } else {
                    RuntimeException runtimeException = tVar2.f58093w0;
                    tVar2.f58093w0 = null;
                    tVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                tVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.f57956u = surface3;
        if (this.f57937n0) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f58015a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f58016b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f57927j0;
            } else {
                iVar = this.f57930k0;
            }
            if (iVar != null) {
                t tVar3 = this.f57960w;
                Size size2 = iVar.f57893e;
                int i15 = iVar.f57894f;
                boolean D2 = D(iVar.f57892c);
                Handler handler2 = tVar3.f58089u;
                if (tVar3.f58084r0 && tVar3.f58061f && handler2 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler2.post(new p(tVar3, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
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
                t tVar4 = this.f57960w;
                if (tVar4.f58061f && (surface4 = tVar4.f58096y) != null) {
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
            if (this.f57937n0) {
                this.f57926j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
                t tVar = this.f57960w;
                if (tVar != null) {
                    tVar.l();
                    this.f57960w = null;
                }
                m mVar = this.f57962x;
                if (mVar != null) {
                    mVar.u();
                    this.f57962x = null;
                }
                this.f57956u = null;
                this.v = null;
                this.f57937n0 = false;
                this.f57939o0 = false;
                this.f57933l0 = false;
                this.m0 = true;
                surfaceTexture.setDefaultBufferSize(this.f57944q.getWidth(), this.f57944q.getHeight());
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
        this.f57933l0 = false;
        this.f57937n0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f57926j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f57954t0;
        this.f57954t0 = null;
        this.f57963x0 = null;
        if (cameraDevice != null && cameraDevice != this.f57966z) {
            this.f57957u0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
