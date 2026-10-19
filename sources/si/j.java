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
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.t50;
import org.telegram.ui.x70;
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
    public final Context f46620a;
    public volatile boolean f46621a0;
    public long f46622a1;
    public final CameraManager f46623b;
    public volatile boolean f46624b0;
    public long f46625b1;
    public final TextureView f46626c;
    public volatile boolean f46627c0;
    public long f46628c1;
    public final q0 d;
    public boolean f46629d0;
    public double f46630d1;
    public final int e;
    public boolean f46631e0;
    public long f46632e1;
    public final int f46633f;
    public boolean f46634f0;
    public long f46635f1;
    public final m0 f46636g;
    public boolean f46637g0;
    public long f46638g1;
    public final n0 h;
    public boolean f46639h0;
    public long f46640h1;
    public final boolean f46641i;
    public i f46642i0;
    public long f46643i1;
    public final n f46644j;
    public i f46645j0;
    public long f46646j1;
    public final w0 f46647k;
    public boolean f46648k0;
    public long f46649k1;
    public boolean f46651l0;
    public final y3 l1;
    public HandlerThread f46652m;
    public boolean m0;
    public final a f46653m1;
    public Handler f46654n;
    public boolean f46655n0;
    public final a f46656n1;
    public String f46657o;
    public boolean f46658o0;
    public final t50 f46659o1;
    public CameraCharacteristics f46660p;
    public boolean f46661p0;
    public final e f46662p1;
    public Size f46663q;
    public boolean f46664q0;
    public final e f46665q1;
    public volatile Size f46666r;
    public boolean f46667r0;
    public final f f46668r1;
    public volatile int f46669s;
    public CameraDevice f46670s0;
    public final f f46671s1;
    public Surface f46672t;
    public CameraDevice f46673t0;
    public final g f46674t1;
    public Surface f46675u;
    public CameraDevice f46676u0;
    public Surface v;
    public CameraDevice f46677v0;
    public t f46678w;
    public i f46679w0;
    public m f46680x;
    public l0 f46681x0;
    public m f46682y;
    public boolean f46683y0;
    public CameraDevice f46684z;
    public boolean f46685z0;
    public final Rect f46650l = new Rect();
    public float O = 1.0f;

    public j(Context context, TextureView textureView, q0 q0Var, int i10, m0 m0Var, n0 n0Var, boolean z10, n nVar, w0 w0Var) {
        y3 y3Var = new y3(this, 2);
        this.l1 = y3Var;
        this.f46653m1 = new a(this, 4);
        this.f46656n1 = new a(this, 5);
        this.f46659o1 = new t50(this, 4);
        this.f46662p1 = new e(this, 0);
        this.f46665q1 = new e(this, 1);
        this.f46668r1 = new f(this, 0);
        this.f46671s1 = new f(this, 1);
        this.f46674t1 = new g(this);
        this.f46620a = context.getApplicationContext();
        this.f46623b = (CameraManager) context.getSystemService("camera");
        this.f46626c = textureView;
        this.d = q0Var;
        this.e = q0Var.f46750a;
        this.f46633f = i10;
        this.f46636g = m0Var;
        this.h = n0Var;
        this.f46641i = z10;
        this.f46644j = nVar;
        this.f46647k = w0Var;
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
        CameraDevice cameraDevice = jVar.f46684z;
        CameraDevice cameraDevice2 = jVar.f46670s0;
        if (jVar.m0 && cameraDevice != null && cameraDevice2 != null && jVar.f46675u != null && jVar.v != null && jVar.A == null && jVar.B == null) {
            jVar.f46658o0 = false;
            jVar.f46661p0 = false;
            try {
                jVar.G0 = SystemClock.elapsedRealtimeNanos();
                n nVar = jVar.f46644j;
                nVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + jVar.f46666r + ", fpsRange=" + jVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(jVar.f46675u), jVar.f46671s1, jVar.f46654n);
                cameraDevice2.createCaptureSession(Arrays.asList(jVar.v), jVar.f46668r1, jVar.f46654n);
            } catch (CameraAccessException | IllegalArgumentException e) {
                jVar.A("session request failed", e, false);
            }
        }
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10;
        String str2;
        boolean z11 = true;
        if (cameraDevice == jVar.f46684z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && jVar.m0) {
            n nVar = jVar.f46644j;
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
            jVar.f46648k0 = false;
            jVar.f46651l0 = true;
            jVar.f46667r0 = false;
            jVar.f46670s0 = null;
            jVar.f46679w0 = null;
            jVar.r();
            jVar.f46673t0 = cameraDevice;
            if (!jVar.V || jVar.f46684z == null || jVar.A != null || jVar.X) {
                z11 = false;
            }
            jVar.f46683y0 = z11;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == jVar.f46670s0) {
            jVar.f46670s0 = null;
        }
        jVar.f46667r0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.q();
            jVar.f46684z = null;
            if (illegalStateException != null) {
                jVar.N(illegalStateException);
                return;
            } else {
                jVar.N(new IllegalStateException(r4.c.h("Active warm camera ", str)));
                return;
            }
        }
        jVar.y("standby device " + str, illegalStateException);
        if (jVar.f46681x0 != null) {
            jVar.t();
        } else if (jVar.V && jVar.f46684z != null && jVar.A == null && !jVar.X) {
            jVar.f46644j.b("warm camera failed during startup; configuring active camera only");
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
        if (cameraDevice == jVar.f46676u0) {
            jVar.f46676u0 = null;
        }
        if (cameraDevice == jVar.f46677v0) {
            jVar.f46677v0 = null;
        }
        n nVar = jVar.f46644j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = jVar.f46676u0;
        String str = "none";
        if (cameraDevice2 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice2.getId();
        }
        sb2.append(id2);
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = jVar.f46677v0;
        if (cameraDevice3 != null) {
            str = cameraDevice3.getId();
        }
        sb2.append(str);
        nVar.b(sb2.toString());
        jVar.H();
        return true;
    }

    public static boolean e(j jVar, CameraDevice cameraDevice) {
        if (cameraDevice != jVar.f46673t0) {
            return false;
        }
        jVar.f46673t0 = null;
        n nVar = jVar.f46644j;
        nVar.b("standby camera closed: id=" + cameraDevice.getId());
        if (jVar.f46683y0) {
            jVar.f46683y0 = false;
            if (jVar.V && !jVar.f46624b0 && jVar.f46684z != null) {
                jVar.f46644j.b("retrying capture session after standby camera closed");
                jVar.u();
                return true;
            }
            return true;
        } else if (jVar.X && jVar.f46681x0 != null) {
            jVar.f46644j.b("continuing pending switch after DUAL_ACTIVE fallback");
            jVar.t();
            return true;
        } else {
            return true;
        }
    }

    public static void f(j jVar) {
        l0 l0Var = jVar.f46681x0;
        if (l0Var != null && jVar.m0 && jVar.f46658o0 && jVar.f46661p0) {
            jVar.f46681x0 = null;
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

    public static j6.l m(Size[] sizeArr, q0 q0Var, m0 m0Var) {
        int i10;
        j6.l o10;
        m0 m0Var2;
        j6.l o11;
        m0 m0Var3 = m0.f46729c;
        if (m0Var == m0Var3) {
            i10 = q0Var.f46750a;
        } else {
            q0 q0Var2 = q0.P480;
            m0 m0Var4 = m0.f46727a;
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
        j6.l o12 = o(sizeArr, i10, m0Var);
        if (o12 != null) {
            return o12;
        }
        if (q0Var == q0.P360 && m0Var == (m0Var2 = m0.f46728b) && (o11 = o(sizeArr, 480, m0Var2)) != null) {
            return o11;
        }
        int i11 = q0Var.f46750a;
        if (m0Var != m0Var3 && (o10 = o(sizeArr, i11, m0Var3)) != null) {
            return o10;
        }
        int i12 = q0Var.f46750a;
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
        return new j6.l(n(sizeArr, size), size, m0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static j6.l o(Size[] sizeArr, int i10, m0 m0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.l lVar2 = new j6.l(n10, size, m0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f14289b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14290c;
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
            this.f46644j.b(sb2.toString());
            this.m0 = false;
            this.f46648k0 = false;
            this.f46651l0 = true;
            this.f46658o0 = false;
            this.f46661p0 = false;
            if (z10 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f46670s0;
                this.f46670s0 = null;
                this.f46679w0 = null;
                if (cameraDevice != null) {
                    this.f46673t0 = cameraDevice;
                    cameraDevice.close();
                }
                if (this.f46673t0 == null && this.X && this.f46681x0 != null) {
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
        m mVar = this.f46680x;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.f46726z;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f46634f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f46634f0 = true;
        q();
        j6.l lVar = this.L;
        if (lVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = n0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f46660p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = C(rangeArr, 30);
        this.f46663q = (Size) lVar.f14289b;
        this.f46666r = (Size) lVar.f14290c;
        this.f46669s = lVar.f14288a;
        this.I = (m0) lVar.d;
        this.f46642i0 = null;
        this.f46645j0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.f46626c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f46663q.getWidth(), this.f46663q.getHeight());
        }
        t tVar = this.f46678w;
        if (tVar != null) {
            tVar.l();
            this.f46678w = null;
        }
        m mVar2 = this.f46680x;
        if (mVar2 != null) {
            mVar2.q();
            this.f46680x = null;
        }
        this.f46675u = null;
        try {
            v();
            O();
            n nVar = this.f46644j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f46663q);
            sb2.append(", recording=");
            sb2.append(this.f46666r);
            sb2.append(", crop=");
            sb2.append(this.f46669s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            nVar.b(sb2.toString());
            Handler handler = this.f46654n;
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
        for (Set<String> set : this.f46623b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == l0.f46703b && (cameraCharacteristics = this.f46660p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.f46685z0) {
            if (cameraDevice == this.f46676u0 || cameraDevice == this.f46677v0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H() {
        if (this.f46685z0 && this.f46676u0 == null && this.f46677v0 == null) {
            this.f46685z0 = false;
            this.X = false;
            n nVar = this.f46644j;
            nVar.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.H0));
            if (this.V && !this.f46624b0) {
                I();
            }
        }
    }

    public final void I() {
        if (this.V && !this.W && this.f46684z == null) {
            if (f0.c.b(this.f46620a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f46620a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.C0 = SystemClock.elapsedRealtimeNanos();
                    S(this.F);
                    long z10 = z(this.C0);
                    if (this.f46684z == null && this.f46680x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f46626c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        if (this.m0) {
                            int max = Math.max(1, Math.min(720, Math.min(this.f46626c.getWidth(), this.f46626c.getHeight())));
                            surfaceTexture.setDefaultBufferSize(max, max);
                        } else {
                            surfaceTexture.setDefaultBufferSize(this.f46663q.getWidth(), this.f46663q.getHeight());
                        }
                        if (this.f46672t == null) {
                            this.f46672t = new Surface(surfaceTexture);
                        }
                        if (this.f46680x == null) {
                            w(surfaceTexture);
                        } else {
                            t tVar = this.f46678w;
                            if (tVar != null) {
                                tVar.n(this.f46666r, this.f46669s, D(this.f46660p));
                                Surface surface = null;
                                if (!this.m0 && this.f46664q0) {
                                    this.f46664q0 = false;
                                    t tVar2 = this.f46678w;
                                    Handler handler = tVar2.f46815u;
                                    if (tVar2.f46810r0 && handler != null) {
                                        handler.post(new x70((Object) tVar2, false, (Object) null, 17));
                                    }
                                }
                                t tVar3 = this.f46678w;
                                Surface surface2 = tVar3.f46818w;
                                if (surface2 != null) {
                                    this.f46675u = surface2;
                                    if (this.m0 && (!tVar3.f46787f || (surface = tVar3.f46822y) == null)) {
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
                        n nVar = this.f46644j;
                        nVar.b("camera open requested: id=" + this.f46657o + ", preview=" + this.f46663q + ", recording=" + this.f46666r + ", crop=" + this.f46669s + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.m0);
                        this.f46623b.openCamera(this.f46657o, this.f46662p1, this.f46654n);
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
        if (this.f46648k0 && !this.f46651l0 && !(z10 = this.f46667r0) && (cameraDevice = this.f46670s0) == null) {
            l0 l0Var2 = this.H;
            l0 l0Var3 = l0.f46702a;
            if (l0Var2 == l0Var3) {
                l0Var = l0.f46703b;
            } else {
                l0Var = l0Var3;
            }
            if (l0Var == l0Var3) {
                iVar = this.f46642i0;
            } else {
                iVar = this.f46645j0;
            }
            if (iVar != null) {
                String str = iVar.f46610a;
                if (!z10 && cameraDevice == null) {
                    try {
                        this.f46679w0 = iVar;
                        this.f46667r0 = true;
                        this.A0 = SystemClock.elapsedRealtimeNanos();
                        n nVar = this.f46644j;
                        nVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f46611b);
                        this.f46623b.openCamera(str, this.f46665q1, this.f46654n);
                    } catch (Exception e) {
                        this.f46667r0 = false;
                        y("open request failed", e);
                    }
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f46651l0) {
            return;
        }
        if (this.f46648k0) {
            this.m0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f46644j;
        if (i10 < 30) {
            this.f46651l0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i l4 = l();
        n0 n0Var = l4.h;
        String str2 = l4.f46610a;
        l0 l0Var = l4.f46611b;
        l0 l0Var2 = l0.f46702a;
        if (l0Var == l0Var2) {
            l0Var2 = l0.f46703b;
        }
        try {
            try {
                S(l0Var2);
                i l10 = l();
                n0 n0Var2 = l10.h;
                String str3 = l10.f46610a;
                boolean E = E(str2, str3);
                this.f46648k0 = E;
                if (E && n0Var != n0Var2) {
                    this.f46648k0 = false;
                    nVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f46613f + ", second=" + l10.e + "/" + l10.f46613f + ", firstFps=" + n0Var.f46735a + ", secondFps=" + n0Var2.f46735a);
                }
                boolean z10 = this.f46648k0;
                if (!z10) {
                    this.f46651l0 = true;
                }
                this.m0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f46648k0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f46648k0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.f46651l0 = true;
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
        if (this.f46685z0) {
            return;
        }
        this.f46685z0 = true;
        this.f46651l0 = true;
        this.f46648k0 = false;
        this.f46683y0 = false;
        this.f46681x0 = null;
        this.D0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.f46684z;
        this.f46676u0 = cameraDevice;
        CameraDevice cameraDevice2 = this.f46670s0;
        this.f46677v0 = cameraDevice2;
        this.f46684z = null;
        this.f46670s0 = null;
        this.f46679w0 = null;
        CameraDevice cameraDevice3 = this.f46673t0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.f46673t0 = null;
        }
        n nVar = this.f46644j;
        StringBuilder v = a1.g.v("camera warm-switch recovery started: reason=", str, ", target=");
        v.append(this.F);
        v.append(", targetId=");
        CameraDevice cameraDevice4 = this.f46676u0;
        String str3 = "none";
        if (cameraDevice4 == null) {
            id2 = "none";
        } else {
            id2 = cameraDevice4.getId();
        }
        v.append(id2);
        v.append(", standbyId=");
        CameraDevice cameraDevice5 = this.f46677v0;
        if (cameraDevice5 != null) {
            str3 = cameraDevice5.getId();
        }
        v.append(str3);
        v.append(", fps=");
        n0 n0Var = this.J;
        if (n0Var == null) {
            valueOf = "unknown";
        } else {
            valueOf = Integer.valueOf(n0Var.f46735a);
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
        CameraDevice cameraDevice6 = this.f46676u0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.f46677v0;
        if (cameraDevice7 != null && cameraDevice7 != this.f46676u0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.f46626c.setSurfaceTextureListener(null);
        this.f46626c.removeOnLayoutChangeListener(this.l1);
        Handler handler = this.f46654n;
        HandlerThread handlerThread = this.f46652m;
        this.f46654n = null;
        this.f46652m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new p2.b(22, this, handlerThread));
        }
    }

    public final void N(Exception exc) {
        this.f46644j.a("camera error", exc);
        w0 w0Var = this.f46647k;
        ((s0) w0Var.f14830b).f46762i.post(new p2.b(25, w0Var, exc));
    }

    public final void O() {
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f46622a1 = 0L;
        this.f46625b1 = 0L;
        this.f46628c1 = 0L;
        this.f46630d1 = 0.0d;
        this.f46632e1 = 0L;
        this.f46635f1 = 0L;
        this.f46638g1 = 0L;
        this.f46640h1 = 0L;
        this.f46643i1 = 0L;
        this.f46646j1 = 0L;
        this.f46649k1 = 0L;
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
        n nVar = this.f46644j;
        n0 n0Var = this.h;
        n0 n0Var2 = n0.FPS_30;
        if (n0Var != n0Var2) {
            if (this.f46639h0) {
                rangeArr = rangeArr4;
                i10 = 30;
                lVar2 = lVar;
            } else {
                int i11 = n0Var.f46735a;
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
                        j6.l m10 = m(sizeArr2, this.d, this.f46636g);
                        nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new g3(n0.FPS_60, C, m10, 28);
                    } catch (RuntimeException unused) {
                        nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    nVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                nVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new g3(n0Var2, C2, lVar, 28);
            }
        } else {
            rangeArr = rangeArr4;
            lVar2 = lVar;
            i10 = 30;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder v = a1.g.v("fps selection: id=", str, ", requested=");
        v.append(n0Var.f46735a);
        v.append(", mode=REGULAR, range=");
        v.append(C3);
        if (this.f46639h0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        v.append(str2);
        nVar.b(v.toString());
        return new g3(n0Var2, C3, lVar2, 28);
    }

    public final void R(String str, Exception exc) {
        this.f46683y0 = true;
        y(str, exc);
        if (this.f46673t0 == null) {
            this.f46683y0 = false;
            u();
            return;
        }
        this.f46644j.b("capture session retry waiting for standby camera close: id=" + this.f46673t0.getId());
    }

    public final void S(si.l0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: si.j.S(si.l0):void");
    }

    public final void T(boolean z10) {
        Handler handler = this.f46654n;
        if (this.V && handler != null) {
            handler.post(new b60(18, this, z10));
        }
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f46654n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f46656n1);
            handler.post(this.f46656n1);
            return true;
        }
        return false;
    }

    public final void X(w wVar, long j10, l0 l0Var) {
        if (this.f46652m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f46652m = handlerThread;
            handlerThread.start();
            this.f46654n = new Handler(this.f46652m.getLooper());
        }
        this.E = wVar;
        this.M = j10;
        this.F = l0Var;
        this.V = true;
        this.f46624b0 = false;
        this.f46682y = null;
        this.f46627c0 = true;
        this.E0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        n nVar = this.f46644j;
        nVar.b("camera segment start: facing=" + l0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.f46626c.isAvailable());
        this.f46626c.setSurfaceTextureListener(this.f46659o1);
        Handler handler = this.f46654n;
        if (this.V && handler != null && this.f46626c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.f46654n;
        if (!this.V || this.f46624b0 || handler == null) {
            return false;
        }
        this.f46624b0 = true;
        this.f46627c0 = false;
        this.f46644j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(l0 l0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (l0Var == l0.f46702a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f46623b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((n0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.f46636g)).f16202b) == n0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void a0(si.l0 r8) {
        throw new UnsupportedOperationException("Method not decompiled: si.j.a0(si.l0):void");
    }

    public final boolean b0(l0 l0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder x10;
        if (!this.m0 || !this.f46658o0 || !this.f46661p0 || (cameraDevice = this.f46684z) == null || (cameraDevice2 = this.f46670s0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f46679w0) == null || iVar.f46611b != l0Var || this.f46678w == null) {
            return false;
        }
        this.f46684z = cameraDevice2;
        this.f46670s0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f46675u;
        this.f46675u = this.v;
        this.v = surface;
        if (this.G == l0.f46702a) {
            iVar2 = this.f46642i0;
        } else {
            iVar2 = this.f46645j0;
        }
        this.f46679w0 = iVar2;
        h(iVar);
        this.G = l0Var;
        try {
            try {
                x10 = x(this.f46684z, this.f46675u, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e7) {
            e = e7;
        }
        try {
            this.C = x10;
            this.A.setRepeatingRequest(x10.build(), this.f46674t1, this.f46654n);
            i iVar3 = this.f46679w0;
            if (iVar3 != null) {
                CaptureRequest.Builder x11 = x(this.f46670s0, this.v, iVar3, false, false);
                this.D = x11;
                this.B.setRepeatingRequest(x11.build(), this.f46674t1, this.f46654n);
            }
            boolean z10 = !this.f46664q0;
            this.f46664q0 = z10;
            long j10 = this.H0;
            t tVar = this.f46678w;
            b bVar = new b(this, l0Var, j10, 0);
            Handler handler = tVar.f46815u;
            if (tVar.f46810r0 && handler != null) {
                handler.post(new x70(tVar, z10, bVar, 17));
            }
            this.f46658o0 = true;
            this.f46661p0 = true;
            this.D0 = true;
            this.Z = false;
            this.X = false;
            this.f46621a0 = false;
            O();
            this.f46644j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f46684z.getId() + ", standbyId=" + this.f46670s0.getId() + ", input=" + (this.f46664q0 ? 1 : 0) + ", elapsedMs=" + z(this.H0));
            this.f46626c.post(new a(this, 1));
            w0 w0Var = this.f46647k;
            ((s0) w0Var.f14830b).f46762i.post(new x70((Object) w0Var, (Object) new h(this.G, this.I, this.J, this.f46663q, this.f46666r, this.O, F()), true, 18));
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

    public final boolean c0(l0 l0Var) {
        String id2;
        CameraDevice cameraDevice = this.f46670s0;
        i iVar = this.f46679w0;
        if (cameraDevice == null || iVar == null || iVar.f46611b != l0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.f46626c.getSurfaceTexture();
        i iVar2 = null;
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.f46684z;
        l0 l0Var2 = this.G;
        if (l0Var2 != null) {
            if (l0Var2 == l0.f46702a) {
                iVar2 = this.f46642i0;
            } else {
                iVar2 = this.f46645j0;
            }
        }
        q();
        this.f46670s0 = cameraDevice2;
        this.f46679w0 = iVar2;
        this.f46684z = cameraDevice;
        h(iVar);
        surfaceTexture.setDefaultBufferSize(this.f46663q.getWidth(), this.f46663q.getHeight());
        t tVar = this.f46678w;
        if (tVar != null) {
            tVar.n(this.f46666r, this.f46669s, D(this.f46660p));
            Surface surface = this.f46678w.f46818w;
            if (surface != null) {
                this.f46675u = surface;
            } else {
                throw new IllegalStateException("GL processor is not started");
            }
        }
        this.D0 = true;
        n nVar = this.f46644j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.f46657o);
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
        if (this.f46627c0) {
            if (this.f46655n0) {
                this.f46626c.setTransform(new Matrix());
                this.f46644j.b("preview transform: GL output, identity matrix, view=" + this.f46626c.getWidth() + "x" + this.f46626c.getHeight());
                return;
            }
            Size size = this.f46666r;
            if (size != null && this.f46626c.getWidth() != 0 && this.f46626c.getHeight() != 0) {
                int min = Math.min(this.f46669s, Math.min(size.getWidth(), size.getHeight()));
                TextureView textureView = this.f46626c;
                boolean z10 = false;
                if (this.f46660p != null && textureView.getDisplay() != null && (num = (Integer) this.f46660p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
                matrix.setScale(f10, f11, this.f46626c.getWidth() * 0.5f, this.f46626c.getHeight() * 0.5f);
                this.f46626c.setTransform(matrix);
                this.f46644j.b("preview transform: view=" + this.f46626c.getWidth() + "x" + this.f46626c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
            }
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: si.j.g():void");
    }

    public final void h(i iVar) {
        this.f46657o = iVar.f46610a;
        this.H = iVar.f46611b;
        this.f46660p = iVar.f46612c;
        this.f46663q = iVar.d;
        this.f46666r = iVar.e;
        this.f46669s = iVar.f46613f;
        this.I = iVar.f46614g;
        this.J = iVar.h;
        this.K = iVar.f46615i;
        this.L = iVar.f46616j;
        this.O = iVar.f46617k;
        this.f46634f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.f46654n;
        if (handler != null) {
            handler.removeCallbacks(this.f46653m1);
        }
        this.f46682y = null;
    }

    public final i l() {
        return new i(this.f46657o, this.H, this.f46660p, this.f46663q, this.f46666r, this.f46669s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f46685z0 = false;
        this.f46683y0 = false;
        this.f46676u0 = null;
        this.f46677v0 = null;
        this.f46627c0 = false;
        this.Z = false;
        this.f46621a0 = false;
        this.C = null;
        this.Q = false;
        this.f46681x0 = null;
        this.f46667r0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.f46684z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f46684z = null;
        }
        CameraDevice cameraDevice2 = this.f46670s0;
        this.f46670s0 = null;
        this.f46679w0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.f46673t0;
        this.f46673t0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        t tVar = this.f46678w;
        if (tVar != null) {
            tVar.l();
            this.f46678w = null;
        }
        Surface surface = this.f46672t;
        if (surface != null) {
            surface.release();
            this.f46672t = null;
        }
        this.f46675u = null;
        this.v = null;
        this.m0 = false;
        this.f46655n0 = false;
        this.f46658o0 = false;
        this.f46661p0 = false;
        this.f46664q0 = false;
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
        this.f46661p0 = false;
    }

    public final void t() {
        String str;
        this.f46681x0 = null;
        this.D0 = false;
        if (this.f46648k0) {
            str = ", reason=warm device not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f46644j.b("camera switch path: sequential".concat(str));
        q();
        CameraDevice cameraDevice = this.f46684z;
        if (cameraDevice != null) {
            this.f46684z = null;
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
        l0 l0Var;
        i iVar;
        Surface surface4;
        this.f46655n0 = this.m0;
        w wVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f46633f;
        int i12 = this.J.f46735a;
        n nVar = this.f46644j;
        w0 w0Var = this.f46647k;
        Objects.requireNonNull(w0Var);
        m mVar = new m(wVar, j10, i10, i11, i12, nVar, new c(w0Var));
        this.f46680x = mVar;
        synchronized (mVar) {
            if (mVar.f46725y) {
                surface = mVar.f46717p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.f46714m.start();
                    mVar.f46725y = true;
                    mVar.f46708f.b("codecs prepared: video=" + mVar.f46714m.getName() + ", audio=" + mVar.f46715n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.f46717p;
                } catch (IOException | RuntimeException e) {
                    mVar.j();
                    throw e;
                }
            }
        }
        Surface surface5 = surface;
        Size size = this.f46666r;
        if (this.f46655n0) {
            surface2 = this.f46672t;
        } else {
            surface2 = null;
        }
        boolean z11 = this.m0;
        int i13 = this.e;
        int i14 = this.f46669s;
        boolean D = D(this.f46660p);
        boolean z12 = this.f46641i;
        n nVar2 = this.f46644j;
        m mVar2 = this.f46680x;
        w0 w0Var2 = this.f46647k;
        Objects.requireNonNull(w0Var2);
        t tVar = new t(size, surface5, surface2, z11, i13, i14, D, z12, nVar2, mVar2, new c(w0Var2));
        this.f46678w = tVar;
        tVar.f46814t0 = new a(this, 2);
        t tVar2 = this.f46678w;
        if (tVar2.f46810r0) {
            surface3 = tVar2.f46818w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar2.f46813t = handlerThread;
            handlerThread.start();
            tVar2.f46808q0 = System.nanoTime();
            n nVar3 = tVar2.f46792i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar2.f46779a);
            sb2.append(", crop=");
            sb2.append(tVar2.f46794j);
            sb2.append(", output=");
            sb2.append(tVar2.f46789g);
            sb2.append("x");
            sb2.append(tVar2.f46789g);
            sb2.append(", filter=");
            if (tVar2.f46794j == tVar2.f46789g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(tVar2.h);
            sb2.append(", dualInput=");
            sb2.append(tVar2.f46787f);
            sb2.append(", glPreview=");
            if (tVar2.e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(tVar2.f46813t.getLooper());
            tVar2.f46815u = handler;
            handler.post(new p2.b(23, tVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar2.f46819w0 == null) {
                    surface3 = tVar2.f46818w;
                } else {
                    RuntimeException runtimeException = tVar2.f46819w0;
                    tVar2.f46819w0 = null;
                    tVar2.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                tVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.f46675u = surface3;
        if (this.m0) {
            l0 l0Var2 = this.H;
            l0 l0Var3 = l0.f46702a;
            if (l0Var2 == l0Var3) {
                l0Var = l0.f46703b;
            } else {
                l0Var = l0Var3;
            }
            if (l0Var == l0Var3) {
                iVar = this.f46642i0;
            } else {
                iVar = this.f46645j0;
            }
            if (iVar != null) {
                t tVar3 = this.f46678w;
                Size size2 = iVar.e;
                int i15 = iVar.f46613f;
                boolean D2 = D(iVar.f46612c);
                Handler handler2 = tVar3.f46815u;
                if (tVar3.f46810r0 && tVar3.f46787f && handler2 != null) {
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
                t tVar4 = this.f46678w;
                if (tVar4.f46787f && (surface4 = tVar4.f46822y) != null) {
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
                this.f46644j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
                t tVar = this.f46678w;
                if (tVar != null) {
                    tVar.l();
                    this.f46678w = null;
                }
                m mVar = this.f46680x;
                if (mVar != null) {
                    mVar.q();
                    this.f46680x = null;
                }
                this.f46675u = null;
                this.v = null;
                this.m0 = false;
                this.f46655n0 = false;
                this.f46648k0 = false;
                this.f46651l0 = true;
                surfaceTexture.setDefaultBufferSize(this.f46663q.getWidth(), this.f46663q.getHeight());
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
        this.f46651l0 = true;
        this.f46648k0 = false;
        this.m0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f46644j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f46670s0;
        this.f46670s0 = null;
        this.f46679w0 = null;
        if (cameraDevice != null && cameraDevice != this.f46684z) {
            this.f46673t0 = cameraDevice;
            cameraDevice.close();
        }
    }
}
