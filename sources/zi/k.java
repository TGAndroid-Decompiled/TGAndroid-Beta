package zi;

import a8.xa;
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
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import bi.o1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.a80;
import org.telegram.ui.jw0;
import y7.f7;
public final class k {
    public CameraCaptureSession A;
    public long A0;
    public CaptureRequest.Builder B;
    public int B0;
    public CaptureRequest.Builder C;
    public long C0;
    public x D;
    public long D0;
    public volatile n0 E;
    public long E0;
    public n0 F;
    public long F0;
    public n0 G;
    public long G0;
    public o0 H;
    public long H0;
    public p0 I;
    public long I0;
    public Range J;
    public long J0;
    public xa K;
    public long K0;
    public long L;
    public long L0;
    public volatile float M;
    public double M0;
    public long N0;
    public boolean O;
    public long O0;
    public boolean P;
    public long P0;
    public int Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public volatile boolean U;
    public long U0;
    public boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public volatile boolean X;
    public long X0;
    public volatile boolean Y;
    public long Y0;
    public volatile boolean Z;
    public long Z0;
    public final Context f62117a;
    public boolean f62118a0;
    public long f62119a1;
    public final CameraManager f62120b;
    public boolean f62121b0;
    public double f62122b1;
    public final TextureView f62123c;
    public boolean f62124c0;
    public long f62125c1;
    public final s0 d;
    public boolean f62126d0;
    public long f62127d1;
    public final int f62128e;
    public boolean f62129e0;
    public long f62130e1;
    public final int f62131f;
    public int f62132f0;
    public long f62133f1;
    public final o0 f62134g;
    public i f62135g0;
    public long f62136g1;
    public final p0 h;
    public i f62137h0;
    public long f62138h1;
    public final boolean f62139i;
    public boolean f62140i0;
    public long f62141i1;
    public final o f62142j;
    public boolean f62143j0;
    public final o1 f62144j1;
    public final k0 f62145k;
    public boolean f62146k0;
    public final a f62147k1;
    public boolean f62149l0;
    public final a l1;
    public HandlerThread f62150m;
    public boolean m0;
    public final h40 f62151m1;
    public Handler f62152n;
    public boolean f62153n0;
    public final e n1;
    public String f62154o;
    public CameraDevice f62155o0;
    public final e f62156o1;
    public CameraCharacteristics f62157p;
    public i f62158p0;
    public final f f62159p1;
    public volatile Size f62160q;
    public n0 f62161q0;
    public final f f62162q1;
    public volatile int f62163r;
    public final g f62165r1;
    public Surface f62166s;
    public Surface f62169t;
    public volatile boolean f62170t0;
    public Surface f62171u;
    public j f62172u0;
    public t v;
    public j f62173v0;
    public n f62174w;
    public int f62175w0;
    public n f62176x;
    public HandlerThread f62177x0;
    public CameraDevice f62178y;
    public long f62179y0;
    public CameraCaptureSession f62180z;
    public long f62181z0;
    public final Rect f62148l = new Rect();
    public float N = 1.0f;
    public final ArrayList f62164r0 = new ArrayList();
    public final ArrayList f62167s0 = new ArrayList();
    public int f62168s1 = 1;

    public k(Context context, TextureView textureView, s0 s0Var, int i7, o0 o0Var, p0 p0Var, boolean z10, o oVar, k0 k0Var) {
        o1 o1Var = new o1(this, 3);
        this.f62144j1 = o1Var;
        this.f62147k1 = new a(this, 5);
        this.l1 = new a(this, 6);
        this.f62151m1 = new h40(this, 5);
        this.n1 = new e(this, 0);
        this.f62156o1 = new e(this, 1);
        this.f62159p1 = new f(this, 0);
        this.f62162q1 = new f(this, 1);
        this.f62165r1 = new g(this);
        this.f62117a = context.getApplicationContext();
        this.f62120b = (CameraManager) context.getSystemService("camera");
        this.f62123c = textureView;
        this.d = s0Var;
        this.f62128e = s0Var.f62254a;
        this.f62131f = i7;
        this.f62134g = o0Var;
        this.h = p0Var;
        this.f62139i = z10;
        this.f62142j = oVar;
        this.f62145k = k0Var;
        textureView.addOnLayoutChangeListener(o1Var);
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

    public static float R(CameraCharacteristics cameraCharacteristics) {
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null && rect.width() > 0 && rect.height() > 0) {
            return Math.max(rect.width(), rect.height()) / Math.min(rect.width(), rect.height());
        }
        return 1.3333334f;
    }

    public static float U(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d2 = j10;
        double d10 = j3 / d2;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d2) - (d10 * d10))) / 1000000.0d);
    }

    public static void a(k kVar) {
        CameraDevice cameraDevice = kVar.f62178y;
        CameraDevice cameraDevice2 = kVar.f62155o0;
        if (kVar.f62146k0 && cameraDevice != null && cameraDevice2 != null && kVar.f62169t != null && kVar.f62171u != null && kVar.f62180z == null && kVar.A == null) {
            kVar.f62149l0 = false;
            kVar.m0 = false;
            try {
                kVar.E0 = SystemClock.elapsedRealtimeNanos();
                o oVar = kVar.f62142j;
                oVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + kVar.f62160q + ", fpsRange=" + kVar.J);
                cameraDevice.createCaptureSession(Arrays.asList(kVar.f62169t), kVar.f62162q1, kVar.f62152n);
                cameraDevice2.createCaptureSession(Arrays.asList(kVar.f62171u), kVar.f62159p1, kVar.f62152n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                kVar.A("session request failed", e10, false);
            }
        }
    }

    public static void b(k kVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z10;
        int i7 = 1;
        if (cameraDevice == kVar.f62178y) {
            kVar.o();
            kVar.f62178y = null;
            kVar.p(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException(p5.c.k("Active camera ", str));
            }
            kVar.L(illegalStateException);
            return;
        }
        if (cameraDevice == kVar.f62155o0) {
            kVar.f62155o0 = null;
        }
        if (!kVar.f62146k0) {
            kVar.p(cameraDevice, 1);
            return;
        }
        o oVar = kVar.f62142j;
        StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
        sb2.append(str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        sb2.append(str2);
        oVar.b(sb2.toString());
        boolean z11 = false;
        kVar.f62146k0 = false;
        kVar.f62140i0 = false;
        kVar.f62143j0 = true;
        kVar.f62158p0 = null;
        kVar.q();
        if (kVar.U && kVar.f62178y != null && kVar.f62180z == null && !kVar.V) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (kVar.V && kVar.f62161q0 != null) {
            z11 = true;
        }
        if (z10) {
            i7 = 3;
        } else if (z11) {
            i7 = 4;
        }
        kVar.p(cameraDevice, i7);
    }

    public static void c(k kVar, CameraDevice cameraDevice) {
        String str;
        kVar.f62164r0.remove(cameraDevice);
        kVar.f62167s0.remove(cameraDevice);
        if (cameraDevice == kVar.f62178y) {
            kVar.f62178y = null;
        }
        if (cameraDevice == kVar.f62155o0) {
            kVar.f62155o0 = null;
        }
        o oVar = kVar.f62142j;
        StringBuilder sb2 = new StringBuilder("camera device closed: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", owned=");
        sb2.append(kVar.f62164r0.size());
        sb2.append(", closing=");
        sb2.append(kVar.f62167s0.size());
        sb2.append(", afterClose=");
        int i7 = kVar.f62168s1;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            str = "null";
                        } else {
                            str = "APPLY_REQUEST";
                        }
                    } else {
                        str = "CONTINUE_SWITCH";
                    }
                } else {
                    str = "RETRY_SESSION";
                }
            } else {
                str = "REOPEN";
            }
        } else {
            str = "NONE";
        }
        sb2.append(str);
        sb2.append(", closeElapsedMs=");
        sb2.append(z(kVar.f62181z0));
        oVar.b(sb2.toString());
        if (kVar.f62167s0.isEmpty()) {
            int i10 = kVar.f62168s1;
            kVar.f62168s1 = 1;
            if (kVar.U && !kVar.Y && i10 != 1) {
                int c10 = p1.g.c(i10);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 4) {
                                kVar.f();
                                return;
                            }
                            return;
                        }
                        kVar.f62142j.b("continuing pending switch after DUAL_ACTIVE fallback");
                        kVar.s();
                        return;
                    } else if (kVar.f62178y != null && kVar.f62180z == null) {
                        kVar.f62142j.b("retrying capture session after standby camera closed");
                        kVar.t();
                        return;
                    } else {
                        return;
                    }
                }
                kVar.V = false;
                kVar.G();
            }
        }
    }

    public static void d(k kVar) {
        n0 n0Var = kVar.f62161q0;
        if (n0Var != null && kVar.f62146k0 && kVar.f62149l0 && kVar.m0) {
            kVar.f62161q0 = null;
            if (!kVar.Z(n0Var)) {
                kVar.V = false;
                kVar.Y(n0Var);
            }
        }
    }

    public static String e(int i7) {
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

    public static long h(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float i(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (((float) j3) / ((float) j10)) / 1000000.0f;
    }

    public static xa l(Size[] sizeArr, float f10, s0 s0Var, o0 o0Var) {
        int i7;
        xa m10;
        o0 o0Var2;
        xa m11;
        o0 o0Var3 = o0.f62235c;
        if (o0Var == o0Var3) {
            i7 = s0Var.f62254a;
        } else {
            s0 s0Var2 = s0.P480;
            o0 o0Var4 = o0.f62233a;
            if (s0Var == s0Var2) {
                if (o0Var == o0Var4) {
                    i7 = 960;
                }
                i7 = 720;
            } else {
                if (o0Var != o0Var4) {
                    i7 = 540;
                }
                i7 = 720;
            }
        }
        xa m12 = m(sizeArr, f10, i7, o0Var);
        if (m12 != null) {
            return m12;
        }
        if (s0Var == s0.P360 && o0Var == (o0Var2 = o0.f62234b) && (m11 = m(sizeArr, f10, 480, o0Var2)) != null) {
            return m11;
        }
        int i10 = s0Var.f62254a;
        if (o0Var != o0Var3 && (m10 = m(sizeArr, f10, i10, o0Var3)) != null) {
            return m10;
        }
        int i11 = s0Var.f62254a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (Math.min(size2.getWidth(), size2.getHeight()) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i11 && (size == null || h(size2) < h(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (Math.min(size3.getWidth(), size3.getHeight()) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && h(size3) < h(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new xa(size, o0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088), 28);
    }

    public static xa m(Size[] sizeArr, float f10, int i7, o0 o0Var) {
        int i10;
        xa xaVar = null;
        float f11 = 0.0f;
        for (Size size : sizeArr) {
            int i11 = ((i7 * 15) / 100) + i7;
            int min = Math.min(1920, i7 * 2);
            int min2 = Math.min(size.getWidth(), size.getHeight());
            int max = Math.max(size.getWidth(), size.getHeight());
            if (min2 >= i7 && min2 <= i11 && max <= min) {
                float min3 = (Math.min(1.0f, f10 / (Math.max(size.getWidth(), size.getHeight()) / Math.min(size.getWidth(), size.getHeight()))) * i7) / Math.min(size.getWidth(), size.getHeight());
                if (xaVar == null || min3 > f11 || (i10 == 0 && h(size) < h((Size) xaVar.f714c))) {
                    xaVar = new xa(size, o0Var, i7, 28);
                    f11 = min3;
                }
            }
        }
        return xaVar;
    }

    public static boolean r(int[] iArr, int i7) {
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

    public final void A(String str, Exception exc, boolean z10) {
        String str2;
        if (this.f62146k0) {
            o oVar = this.f62142j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z10);
            String str3 = "";
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            oVar.b(sb2.toString());
            int i7 = 0;
            this.f62146k0 = false;
            this.f62140i0 = false;
            int i10 = 1;
            this.f62143j0 = true;
            this.f62149l0 = false;
            this.m0 = false;
            if (z10 && this.f62180z != null) {
                q();
                CameraDevice cameraDevice = this.f62155o0;
                this.f62155o0 = null;
                this.f62158p0 = null;
                if (this.V && this.f62161q0 != null) {
                    i7 = 1;
                }
                if (cameraDevice != null) {
                    if (i7 != 0) {
                        i10 = 4;
                    }
                    p(cameraDevice, i10);
                    return;
                } else if (i7 != 0) {
                    s();
                    return;
                } else {
                    return;
                }
            }
            String concat = "DUAL_ACTIVE ".concat(str);
            this.f62143j0 = true;
            this.f62140i0 = false;
            this.f62146k0 = false;
            this.f62161q0 = null;
            o();
            q();
            this.f62178y = null;
            this.f62155o0 = null;
            this.f62158p0 = null;
            this.f62172u0 = null;
            this.f62173v0 = null;
            o oVar2 = this.f62142j;
            StringBuilder u10 = a8.p0.u("camera recovery: reason=", concat, ", target=");
            u10.append(this.E);
            u10.append(", devices=");
            u10.append(this.f62164r0.size());
            u10.append(", switchElapsedMs=");
            u10.append(z(this.F0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            u10.append(str3);
            oVar2.b(u10.toString());
            if (this.f62164r0.isEmpty()) {
                this.V = false;
                if (this.U && !this.Y) {
                    G();
                    return;
                }
                return;
            }
            this.f62181z0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.f62164r0);
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                p((CameraDevice) obj, 2);
            }
        }
    }

    public final void B(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        n nVar = this.f62174w;
        if (nVar != null) {
            synchronized (nVar) {
                z10 = nVar.E;
            }
            if (z10) {
                M(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f62124c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            M(exc);
            return;
        }
        this.f62124c0 = true;
        this.f62129e0 = true;
        o();
        xa xaVar = this.K;
        if (xaVar == null) {
            M(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.I = p0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f62157p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.J = C(rangeArr, 30);
        this.f62160q = (Size) xaVar.f714c;
        this.f62163r = xaVar.f713b;
        this.H = (o0) xaVar.d;
        this.f62135g0 = null;
        this.f62137h0 = null;
        x("frame-rate fallback changed stream configuration", exc, 1);
        t tVar = this.v;
        if (tVar != null) {
            tVar.l();
            this.v = null;
        }
        n nVar2 = this.f62174w;
        if (nVar2 != null) {
            nVar2.u();
            this.f62174w = null;
        }
        this.f62169t = null;
        try {
            u();
            N();
            o oVar = this.f62142j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", recording=");
            sb2.append(this.f62160q);
            sb2.append(", crop=");
            sb2.append(this.f62163r);
            sb2.append(", fpsRange=");
            sb2.append(this.J);
            oVar.b(sb2.toString());
            Handler handler = this.f62152n;
            if (this.U && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e10) {
            M(e10);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f62120b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.F == n0.f62228b && (cameraCharacteristics = this.f62157p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.U && this.f62172u0 == null && this.f62178y == null) {
            if (f0.d.b(this.f62117a, "android.permission.CAMERA") != 0) {
                M(new SecurityException("Camera permission is not granted"));
            } else if (f0.d.b(this.f62117a, "android.permission.RECORD_AUDIO") != 0) {
                M(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.A0 = SystemClock.elapsedRealtimeNanos();
                    Q(this.E);
                    long z10 = z(this.A0);
                    if (this.f62178y == null && this.f62174w == null) {
                        J();
                    }
                    SurfaceTexture surfaceTexture = this.f62123c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        TextureView textureView = this.f62123c;
                        int max = Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight())));
                        surfaceTexture.setDefaultBufferSize(max, max);
                        if (this.f62166s == null) {
                            this.f62166s = new Surface(surfaceTexture);
                        }
                        if (this.f62174w == null) {
                            v();
                        } else {
                            t tVar = this.v;
                            if (tVar != null) {
                                tVar.n(this.f62160q, this.f62163r, D(this.f62157p));
                                Surface surface = null;
                                if (!this.f62146k0 && this.f62153n0) {
                                    this.f62153n0 = false;
                                    t tVar2 = this.v;
                                    Handler handler = tVar2.f62292u;
                                    if (tVar2.f62287r0 && handler != null) {
                                        handler.post(new a80((Object) tVar2, false, (Object) null, 16));
                                    }
                                }
                                t tVar3 = this.v;
                                Surface surface2 = tVar3.f62295w;
                                if (surface2 != null) {
                                    this.f62169t = surface2;
                                    if (this.f62146k0 && (!tVar3.f62264f || (surface = tVar3.f62299y) == null)) {
                                        throw new IllegalStateException("Secondary GL camera surface is unavailable");
                                    }
                                    this.f62171u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        I();
                        this.D0 = SystemClock.elapsedRealtimeNanos();
                        o oVar = this.f62142j;
                        oVar.b("camera open requested: id=" + this.f62154o + ", recording=" + this.f62160q + ", crop=" + this.f62163r + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.f62146k0);
                        H(this.f62154o, false);
                    }
                } catch (Exception e10) {
                    M(e10);
                }
            }
        }
    }

    public final void H(String str, boolean z10) {
        e eVar;
        if (z10) {
            eVar = this.f62156o1;
        } else {
            eVar = this.n1;
        }
        j jVar = new j(this, eVar, z10);
        if (z10) {
            this.f62173v0 = jVar;
        } else {
            this.f62172u0 = jVar;
        }
        try {
            this.f62120b.openCamera(str, jVar, this.f62152n);
        } catch (CameraAccessException | RuntimeException e10) {
            jVar.c();
            if (!z10 ? this.f62172u0 == jVar : this.f62173v0 == jVar) {
                if (z10) {
                    this.f62173v0 = null;
                } else {
                    this.f62172u0 = null;
                }
            }
            throw e10;
        }
    }

    public final void I() {
        n0 n0Var;
        i iVar;
        if (this.f62146k0 && !this.f62143j0 && this.f62173v0 == null && this.f62155o0 == null) {
            n0 n0Var2 = this.G;
            n0 n0Var3 = n0.f62227a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f62228b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                iVar = this.f62135g0;
            } else {
                iVar = this.f62137h0;
            }
            if (iVar != null) {
                try {
                    String str = iVar.f62099a;
                    this.f62158p0 = iVar;
                    this.f62179y0 = SystemClock.elapsedRealtimeNanos();
                    o oVar = this.f62142j;
                    oVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f62100b);
                    H(str, true);
                } catch (Exception e10) {
                    x("standby open request failed", e10, 1);
                }
            }
        }
    }

    public final void J() {
        String str;
        if (this.f62143j0) {
            return;
        }
        if (this.f62140i0) {
            this.f62146k0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        o oVar = this.f62142j;
        if (i7 < 30) {
            this.f62143j0 = true;
            oVar.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        i k10 = k();
        p0 p0Var = k10.f62104g;
        String str2 = k10.f62099a;
        n0 n0Var = k10.f62100b;
        n0 n0Var2 = n0.f62227a;
        if (n0Var == n0Var2) {
            n0Var2 = n0.f62228b;
        }
        try {
            try {
                Q(n0Var2);
                i k11 = k();
                p0 p0Var2 = k11.f62104g;
                String str3 = k11.f62099a;
                boolean E = E(str2, str3);
                this.f62140i0 = E;
                if (E && p0Var != p0Var2) {
                    this.f62140i0 = false;
                    oVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + k10.d + "/" + k10.f62102e + ", second=" + k11.d + "/" + k11.f62102e + ", firstFps=" + p0Var.f62240a + ", secondFps=" + p0Var2.f62240a);
                }
                boolean z10 = this.f62140i0;
                if (!z10) {
                    this.f62143j0 = true;
                }
                this.f62146k0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f62140i0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f62140i0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                g(k10);
            } catch (Exception e10) {
                this.f62143j0 = true;
                oVar.b("camera dual-active capability unavailable: " + e10);
                g(k10);
            }
        } catch (Throwable th2) {
            g(k10);
            throw th2;
        }
    }

    public final void K() {
        this.f62170t0 = true;
        this.U = false;
        this.f62123c.setSurfaceTextureListener(null);
        this.f62123c.removeOnLayoutChangeListener(this.f62144j1);
        Handler handler = this.f62152n;
        HandlerThread handlerThread = this.f62150m;
        this.f62152n = null;
        this.f62150m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new wg.r(22, this, handlerThread));
        }
    }

    public final void L(Exception exc) {
        boolean z10;
        n nVar = this.f62174w;
        if (nVar != null) {
            synchronized (nVar) {
                z10 = nVar.E;
            }
            if (z10) {
                this.f62142j.a("camera lost while recording", exc);
                k0 k0Var = this.f62145k;
                ((u0) k0Var.f62182a).f62316i.post(new j0(k0Var, exc, 0));
                return;
            }
        }
        M(exc);
    }

    public final void M(Exception exc) {
        this.f62142j.a("camera error", exc);
        k0 k0Var = this.f62145k;
        ((u0) k0Var.f62182a).f62316i.post(new j0(k0Var, exc, 1));
    }

    public final void N() {
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f62119a1 = 0L;
        this.f62122b1 = 0.0d;
        this.f62125c1 = 0L;
        this.f62127d1 = 0L;
        this.f62130e1 = 0L;
        this.f62133f1 = 0L;
        this.f62136g1 = 0L;
        this.f62138h1 = 0L;
        this.f62141i1 = 0L;
    }

    public final void O() {
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0.0d;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
    }

    public final f7 P(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, xa xaVar) {
        String str2;
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        o oVar = this.f62142j;
        p0 p0Var = this.h;
        p0 p0Var2 = p0.FPS_30;
        if (p0Var != p0Var2 && !this.f62129e0) {
            int i7 = p0Var.f62240a;
            Range C = C(rangeArr, i7);
            if (C != null) {
                ArrayList arrayList = new ArrayList(sizeArr.length);
                int length = sizeArr.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10;
                    Size size = sizeArr[i11];
                    int i12 = length;
                    long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                    if (outputMinFrameDuration <= 0 || outputMinFrameDuration <= 1000000000 / i7) {
                        arrayList.add(size);
                    }
                    i10 = i11 + 1;
                    length = i12;
                }
                Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                try {
                    xa l10 = l(sizeArr2, R(cameraCharacteristics), this.d, this.f62134g);
                    oVar.b("fps selection: id=" + str + ", requested=" + i7 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                    return new f7(p0.FPS_60, C, l10);
                } catch (RuntimeException unused) {
                    oVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                }
            } else {
                oVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range C2 = C(rangeArr, 30);
            oVar.b("fps selection: id=" + str + ", requested=" + i7 + ", fallback=30, range=" + C2);
            return new f7(p0Var2, C2, xaVar);
        }
        Range C3 = C(rangeArr, 30);
        StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
        u10.append(p0Var.f62240a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        if (this.f62129e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        oVar.b(u10.toString());
        return new f7(p0Var2, C3, xaVar);
    }

    public final void Q(zi.n0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: zi.k.Q(zi.n0):void");
    }

    public final void S(boolean z10) {
        Handler handler = this.f62152n;
        if (this.U && handler != null) {
            handler.post(new pp0(19, this, z10));
        }
    }

    public final boolean T(float f10) {
        this.M = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.f62152n;
        if (this.U && handler != null) {
            handler.removeCallbacks(this.l1);
            handler.post(this.l1);
            return true;
        }
        return false;
    }

    public final void V(x xVar, long j3, n0 n0Var) {
        if (this.f62170t0) {
            this.f62142j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.f62150m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f62150m = handlerThread;
            handlerThread.start();
            this.f62152n = new Handler(this.f62150m.getLooper());
        }
        this.D = xVar;
        this.L = j3;
        this.E = n0Var;
        this.U = true;
        this.Y = false;
        this.f62124c0 = false;
        this.f62176x = null;
        this.Z = true;
        this.C0 = SystemClock.elapsedRealtimeNanos();
        O();
        N();
        o oVar = this.f62142j;
        oVar.b("camera segment start: facing=" + n0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f62123c.isAvailable());
        this.f62123c.setSurfaceTextureListener(this.f62151m1);
        Handler handler = this.f62152n;
        if (this.U && handler != null && this.f62123c.isAvailable()) {
            handler.post(new a(this, 8));
        }
    }

    public final boolean W() {
        Handler handler = this.f62152n;
        if (!this.U || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f62142j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean X(n0 n0Var) {
        int i7;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (n0Var == n0.f62227a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        CameraManager cameraManager = this.f62120b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((p0) P(str, cameraCharacteristics, streamConfigurationMap, outputSizes, l(outputSizes, R(cameraCharacteristics), this.d, this.f62134g)).f60810a) == p0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void Y(n0 n0Var) {
        if (this.U && !this.V && n0Var != this.F) {
            this.V = true;
            this.W = true;
            this.O = false;
            this.P = false;
            this.M = 0.0f;
            k0 k0Var = this.f62145k;
            ((u0) k0Var.f62182a).f62316i.post(new wg.r(24, k0Var, n0Var));
            this.F0 = SystemClock.elapsedRealtimeNanos();
            o oVar = this.f62142j;
            oVar.b("camera device switch started: from=" + this.F + ", to=" + n0Var);
            if (!Z(n0Var)) {
                if (this.f62146k0) {
                    this.f62161q0 = n0Var;
                    this.f62142j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
                    return;
                }
                t tVar = this.v;
                if (tVar != null) {
                    n0 n0Var2 = this.F;
                    Handler handler = tVar.f62292u;
                    if (tVar.f62287r0 && handler != null) {
                        handler.post(new p4.s0(tVar, n0Var2, n0Var, handler, 8));
                    }
                }
                s();
            }
        }
    }

    public final boolean Z(n0 n0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder w10;
        if (!this.f62146k0 || !this.f62149l0 || !this.m0 || (cameraDevice = this.f62178y) == null || (cameraDevice2 = this.f62155o0) == null || (cameraCaptureSession = this.f62180z) == null || (cameraCaptureSession2 = this.A) == null || (iVar = this.f62158p0) == null || iVar.f62100b != n0Var || this.v == null) {
            return false;
        }
        this.f62178y = cameraDevice2;
        this.f62155o0 = cameraDevice;
        this.f62180z = cameraCaptureSession2;
        this.A = cameraCaptureSession;
        CaptureRequest.Builder builder = this.B;
        this.B = this.C;
        this.C = builder;
        Surface surface = this.f62169t;
        this.f62169t = this.f62171u;
        this.f62171u = surface;
        if (this.F == n0.f62227a) {
            iVar2 = this.f62135g0;
        } else {
            iVar2 = this.f62137h0;
        }
        this.f62158p0 = iVar2;
        g(iVar);
        this.F = n0Var;
        try {
            try {
                w10 = w(this.f62178y, this.f62169t, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
                e = e10;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
            e = e11;
        }
        try {
            this.B = w10;
            this.f62180z.setRepeatingRequest(w10.build(), this.f62165r1, this.f62152n);
            i iVar3 = this.f62158p0;
            if (iVar3 != null) {
                CaptureRequest.Builder w11 = w(this.f62155o0, this.f62171u, iVar3, false, false);
                this.C = w11;
                this.A.setRepeatingRequest(w11.build(), this.f62165r1, this.f62152n);
            }
            boolean z10 = !this.f62153n0;
            this.f62153n0 = z10;
            long j3 = this.F0;
            t tVar = this.v;
            b bVar = new b(this, n0Var, j3, 0);
            Handler handler = tVar.f62292u;
            if (tVar.f62287r0 && handler != null) {
                handler.post(new a80(tVar, z10, bVar, 16));
            }
            this.f62149l0 = true;
            this.m0 = true;
            this.W = false;
            this.V = false;
            this.X = false;
            N();
            this.f62142j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f62178y.getId() + ", standbyId=" + this.f62155o0.getId() + ", input=" + (this.f62153n0 ? 1 : 0) + ", elapsedMs=" + z(this.F0));
            this.f62123c.post(new a(this, 2));
            k0 k0Var = this.f62145k;
            ((u0) k0Var.f62182a).f62316i.post(new a80((Object) k0Var, (Object) new h(this.F, this.H, this.I, this.f62160q, this.N, F()), true, 17));
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

    public final void a0() {
        if (this.Z) {
            this.f62123c.setTransform(new Matrix());
            if (y() != this.B0) {
                a aVar = new a(this, 1);
                Handler handler = this.f62152n;
                if (handler != null) {
                    handler.post(aVar);
                }
            }
        }
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: zi.k.f():void");
    }

    public final void g(i iVar) {
        this.f62154o = iVar.f62099a;
        this.G = iVar.f62100b;
        this.f62157p = iVar.f62101c;
        this.f62160q = iVar.d;
        this.f62163r = iVar.f62102e;
        this.H = iVar.f62103f;
        this.I = iVar.f62104g;
        this.J = iVar.h;
        this.K = iVar.f62105i;
        this.N = iVar.f62106j;
        this.f62124c0 = false;
        N();
    }

    public final void j() {
        Handler handler = this.f62152n;
        if (handler != null) {
            handler.removeCallbacks(this.f62147k1);
        }
        this.f62176x = null;
    }

    public final i k() {
        return new i(this.f62154o, this.G, this.f62157p, this.f62160q, this.f62163r, this.H, this.I, this.J, this.K, this.N);
    }

    public final void n() {
        j();
        this.V = false;
        this.f62168s1 = 1;
        this.f62172u0 = null;
        this.f62173v0 = null;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.B = null;
        this.P = false;
        this.f62161q0 = null;
        o();
        q();
        this.f62178y = null;
        this.f62155o0 = null;
        this.f62158p0 = null;
        if (!this.f62164r0.isEmpty()) {
            this.f62181z0 = SystemClock.elapsedRealtimeNanos();
            this.f62142j.b("closing camera devices: count=" + this.f62164r0.size());
            ArrayList arrayList = new ArrayList(this.f62164r0);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                p((CameraDevice) obj, 1);
            }
        }
        t tVar = this.v;
        if (tVar != null) {
            tVar.l();
            this.v = null;
        }
        Surface surface = this.f62166s;
        if (surface != null) {
            surface.release();
            this.f62166s = null;
        }
        this.f62169t = null;
        this.f62171u = null;
        this.f62146k0 = false;
        this.f62149l0 = false;
        this.m0 = false;
        this.f62153n0 = false;
    }

    public final void o() {
        CameraCaptureSession cameraCaptureSession = this.f62180z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f62180z = null;
        }
        this.B = null;
    }

    public final void p(CameraDevice cameraDevice, int i7) {
        ArrayList arrayList = this.f62167s0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i7 != 1) {
            this.f62168s1 = i7;
        }
        cameraDevice.close();
    }

    public final void q() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
        this.m0 = false;
    }

    public final void s() {
        String str;
        this.f62161q0 = null;
        if (this.f62140i0) {
            str = ", reason=standby session not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f62142j.b("camera switch path: sequential".concat(str));
        o();
        CameraDevice cameraDevice = this.f62178y;
        if (cameraDevice != null) {
            this.f62178y = null;
            this.f62181z0 = SystemClock.elapsedRealtimeNanos();
            p(cameraDevice, 2);
        } else if (this.f62172u0 != null) {
        } else {
            this.V = false;
            G();
        }
    }

    public final void t() {
        CameraDevice cameraDevice = this.f62178y;
        if (cameraDevice != null && this.f62166s != null && this.f62169t != null) {
            try {
                this.E0 = SystemClock.elapsedRealtimeNanos();
                o oVar = this.f62142j;
                oVar.b("capture session requested: recording=" + this.f62160q + ", fpsRange=" + this.J);
                cameraDevice.createCaptureSession(Arrays.asList(this.f62169t), this.f62162q1, this.f62152n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                if (this.I == p0.FPS_60) {
                    B("60 fps session creation rejected", e10);
                } else {
                    M(e10);
                }
            }
        }
    }

    public final void u() {
        Surface surface;
        String str;
        boolean z10;
        Surface surface2;
        n0 n0Var;
        i iVar;
        Surface surface3;
        x xVar = this.D;
        long j3 = this.L;
        int i7 = this.f62128e;
        int i10 = this.f62131f;
        int i11 = this.f62132f0;
        if (i11 <= 0) {
            i11 = this.I.f62240a;
        }
        int i12 = i11;
        o oVar = this.f62142j;
        k0 k0Var = this.f62145k;
        Objects.requireNonNull(k0Var);
        c cVar = new c(k0Var, 0);
        k0 k0Var2 = this.f62145k;
        Objects.requireNonNull(k0Var2);
        n nVar = new n(xVar, j3, i7, i10, i12, oVar, cVar, new c(k0Var2, 1));
        this.f62174w = nVar;
        synchronized (nVar) {
            if (nVar.D) {
                surface = nVar.f62218q;
            } else {
                nVar.q();
                long nanoTime = System.nanoTime();
                try {
                    nVar.b();
                    nVar.a();
                    nVar.f62215n.start();
                    nVar.D = true;
                    nVar.f62208f.b("codecs prepared: video=" + nVar.f62215n.getName() + ", audio=" + nVar.f62216o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = nVar.f62218q;
                } catch (IOException | RuntimeException e10) {
                    nVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.f62160q;
        Surface surface5 = this.f62166s;
        boolean z11 = this.f62146k0;
        int i13 = this.f62128e;
        int i14 = this.f62163r;
        boolean D = D(this.f62157p);
        boolean z12 = this.f62139i;
        o oVar2 = this.f62142j;
        n nVar2 = this.f62174w;
        k0 k0Var3 = this.f62145k;
        Objects.requireNonNull(k0Var3);
        t tVar = new t(size, surface4, surface5, z11, i13, i14, D, z12, oVar2, nVar2, new c(k0Var3, 2));
        this.v = tVar;
        tVar.f62293u0 = new a(this, 3);
        int y10 = y();
        this.B0 = y10;
        t tVar2 = this.v;
        tVar2.f62289s0 = y10;
        Handler handler = tVar2.f62292u;
        if (tVar2.f62287r0 && handler != null) {
            handler.post(new jw0(tVar2, y10, 17));
        }
        t tVar3 = this.v;
        if (tVar3.f62287r0) {
            surface2 = tVar3.f62295w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar3.f62290t = handlerThread;
            handlerThread.start();
            tVar3.f62285q0 = System.nanoTime();
            o oVar3 = tVar3.f62269i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar3.f62255a);
            sb2.append(", crop=");
            sb2.append(tVar3.f62271j);
            sb2.append(", output=");
            sb2.append(tVar3.f62266g);
            sb2.append("x");
            sb2.append(tVar3.f62266g);
            sb2.append(", filter=");
            if (tVar3.f62271j == tVar3.f62266g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(tVar3.h);
            sb2.append(", dualInput=");
            sb2.append(tVar3.f62264f);
            sb2.append(", glPreview=");
            if (tVar3.f62262e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            oVar3.b(sb2.toString());
            Handler handler2 = new Handler(tVar3.f62290t.getLooper());
            tVar3.f62292u = handler2;
            handler2.post(new wg.r(23, tVar3, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar3.f62298x0 == null) {
                    surface2 = tVar3.f62295w;
                } else {
                    RuntimeException runtimeException = tVar3.f62298x0;
                    tVar3.f62298x0 = null;
                    tVar3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                tVar3.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.f62169t = surface2;
        if (this.f62146k0) {
            n0 n0Var2 = this.G;
            n0 n0Var3 = n0.f62227a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f62228b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                iVar = this.f62135g0;
            } else {
                iVar = this.f62137h0;
            }
            if (iVar != null) {
                t tVar4 = this.v;
                Size size2 = iVar.d;
                int i15 = iVar.f62102e;
                boolean D2 = D(iVar.f62101c);
                Handler handler3 = tVar4.f62292u;
                if (tVar4.f62287r0 && tVar4.f62264f && handler3 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler3.post(new r(tVar4, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
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
                t tVar5 = this.v;
                if (tVar5.f62264f && (surface3 = tVar5.f62299y) != null) {
                    this.f62171u = surface3;
                    return;
                }
                throw new IllegalStateException("Secondary GL camera surface is unavailable");
            }
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        this.f62171u = null;
    }

    public final void v() {
        try {
            u();
        } catch (IOException | RuntimeException e10) {
            if (this.f62146k0) {
                this.f62142j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
                t tVar = this.v;
                if (tVar != null) {
                    tVar.l();
                    this.v = null;
                }
                n nVar = this.f62174w;
                if (nVar != null) {
                    nVar.u();
                    this.f62174w = null;
                }
                this.f62169t = null;
                this.f62171u = null;
                this.f62146k0 = false;
                this.f62140i0 = false;
                this.f62143j0 = true;
                u();
                return;
            }
            throw e10;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder w(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, zi.i r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: zi.k.w(android.hardware.camera2.CameraDevice, android.view.Surface, zi.i, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void x(String str, Exception exc, int i7) {
        String str2;
        this.f62143j0 = true;
        this.f62140i0 = false;
        this.f62146k0 = false;
        StringBuilder sb2 = new StringBuilder("camera dual-active disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f62142j.b(sb2.toString());
        q();
        CameraDevice cameraDevice = this.f62155o0;
        this.f62155o0 = null;
        this.f62158p0 = null;
        this.f62173v0 = null;
        if (cameraDevice != null && cameraDevice != this.f62178y) {
            p(cameraDevice, i7);
        } else if (i7 == 5) {
            f();
        }
    }

    public final int y() {
        Display display = this.f62123c.getDisplay();
        if (display == null) {
            return 0;
        }
        int rotation = display.getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }
}
