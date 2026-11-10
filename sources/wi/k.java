package wi;

import a8.wa;
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
import org.telegram.ui.Wallet.f2;
import org.telegram.ui.j60;
import org.telegram.ui.ly0;
public final class k {
    public CameraCaptureSession A;
    public long A0;
    public CaptureRequest.Builder B;
    public int B0;
    public CaptureRequest.Builder C;
    public long C0;
    public x D;
    public long D0;
    public volatile m0 E;
    public long E0;
    public m0 F;
    public long F0;
    public m0 G;
    public long G0;
    public n0 H;
    public long H0;
    public o0 I;
    public long I0;
    public Range J;
    public long J0;
    public wa K;
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
    public final Context f58015a;
    public boolean f58016a0;
    public long f58017a1;
    public final CameraManager f58018b;
    public boolean f58019b0;
    public double f58020b1;
    public final TextureView f58021c;
    public boolean f58022c0;
    public long f58023c1;
    public final r0 d;
    public boolean f58024d0;
    public long f58025d1;
    public final int f58026e;
    public boolean f58027e0;
    public long f58028e1;
    public final int f58029f;
    public int f58030f0;
    public long f58031f1;
    public final n0 f58032g;
    public i f58033g0;
    public long f58034g1;
    public final o0 h;
    public i f58035h0;
    public long f58036h1;
    public final boolean f58037i;
    public boolean f58038i0;
    public long f58039i1;
    public final o f58040j;
    public boolean f58041j0;
    public final n3 f58042j1;
    public final qt f58043k;
    public boolean f58044k0;
    public final a f58045k1;
    public boolean f58047l0;
    public final a l1;
    public HandlerThread f58048m;
    public boolean m0;
    public final w30 f58049m1;
    public Handler f58050n;
    public boolean f58051n0;
    public final e n1;
    public String f58052o;
    public CameraDevice f58053o0;
    public final e f58054o1;
    public CameraCharacteristics f58055p;
    public i f58056p0;
    public final f f58057p1;
    public volatile Size f58058q;
    public m0 f58059q0;
    public final f f58060q1;
    public volatile int f58061r;
    public final g f58063r1;
    public Surface f58064s;
    public Surface f58067t;
    public volatile boolean f58068t0;
    public Surface f58069u;
    public j f58070u0;
    public t v;
    public j f58071v0;
    public n f58072w;
    public int f58073w0;
    public n f58074x;
    public HandlerThread f58075x0;
    public CameraDevice f58076y;
    public long f58077y0;
    public CameraCaptureSession f58078z;
    public long f58079z0;
    public final Rect f58046l = new Rect();
    public float N = 1.0f;
    public final ArrayList f58062r0 = new ArrayList();
    public final ArrayList f58065s0 = new ArrayList();
    public int f58066s1 = 1;

    public k(Context context, TextureView textureView, r0 r0Var, int i7, n0 n0Var, o0 o0Var, boolean z9, o oVar, qt qtVar) {
        n3 n3Var = new n3(this, 2);
        this.f58042j1 = n3Var;
        this.f58045k1 = new a(this, 5);
        this.l1 = new a(this, 6);
        this.f58049m1 = new w30(this, 4);
        this.n1 = new e(this, 0);
        this.f58054o1 = new e(this, 1);
        this.f58057p1 = new f(this, 0);
        this.f58060q1 = new f(this, 1);
        this.f58063r1 = new g(this);
        this.f58015a = context.getApplicationContext();
        this.f58018b = (CameraManager) context.getSystemService("camera");
        this.f58021c = textureView;
        this.d = r0Var;
        this.f58026e = r0Var.f58151a;
        this.f58029f = i7;
        this.f58032g = n0Var;
        this.h = o0Var;
        this.f58037i = z9;
        this.f58040j = oVar;
        this.f58043k = qtVar;
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
        CameraDevice cameraDevice = kVar.f58076y;
        CameraDevice cameraDevice2 = kVar.f58053o0;
        if (kVar.f58044k0 && cameraDevice != null && cameraDevice2 != null && kVar.f58067t != null && kVar.f58069u != null && kVar.f58078z == null && kVar.A == null) {
            kVar.f58047l0 = false;
            kVar.m0 = false;
            try {
                kVar.E0 = SystemClock.elapsedRealtimeNanos();
                o oVar = kVar.f58040j;
                oVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + kVar.f58058q + ", fpsRange=" + kVar.J);
                cameraDevice.createCaptureSession(Arrays.asList(kVar.f58067t), kVar.f58060q1, kVar.f58050n);
                cameraDevice2.createCaptureSession(Arrays.asList(kVar.f58069u), kVar.f58057p1, kVar.f58050n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                kVar.A("session request failed", e10, false);
            }
        }
    }

    public static void b(k kVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z9;
        int i7 = 1;
        if (cameraDevice == kVar.f58076y) {
            kVar.o();
            kVar.f58076y = null;
            kVar.p(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException(rf.b.i("Active camera ", str));
            }
            kVar.L(illegalStateException);
            return;
        }
        if (cameraDevice == kVar.f58053o0) {
            kVar.f58053o0 = null;
        }
        if (!kVar.f58044k0) {
            kVar.p(cameraDevice, 1);
            return;
        }
        o oVar = kVar.f58040j;
        StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
        sb2.append(str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        sb2.append(str2);
        oVar.b(sb2.toString());
        boolean z10 = false;
        kVar.f58044k0 = false;
        kVar.f58038i0 = false;
        kVar.f58041j0 = true;
        kVar.f58056p0 = null;
        kVar.q();
        if (kVar.U && kVar.f58076y != null && kVar.f58078z == null && !kVar.V) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (kVar.V && kVar.f58059q0 != null) {
            z10 = true;
        }
        if (z9) {
            i7 = 3;
        } else if (z10) {
            i7 = 4;
        }
        kVar.p(cameraDevice, i7);
    }

    public static void c(k kVar, CameraDevice cameraDevice) {
        String str;
        kVar.f58062r0.remove(cameraDevice);
        kVar.f58065s0.remove(cameraDevice);
        if (cameraDevice == kVar.f58076y) {
            kVar.f58076y = null;
        }
        if (cameraDevice == kVar.f58053o0) {
            kVar.f58053o0 = null;
        }
        o oVar = kVar.f58040j;
        StringBuilder sb2 = new StringBuilder("camera device closed: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", owned=");
        sb2.append(kVar.f58062r0.size());
        sb2.append(", closing=");
        sb2.append(kVar.f58065s0.size());
        sb2.append(", afterClose=");
        int i7 = kVar.f58066s1;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        str = "null";
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
        sb2.append(z(kVar.f58079z0));
        oVar.b(sb2.toString());
        if (kVar.f58065s0.isEmpty()) {
            int i10 = kVar.f58066s1;
            kVar.f58066s1 = 1;
            if (kVar.U && !kVar.Y && i10 != 1) {
                int c10 = p1.g.c(i10);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            kVar.f58040j.b("continuing pending switch after DUAL_ACTIVE fallback");
                            kVar.s();
                            return;
                        }
                        return;
                    } else if (kVar.f58076y != null && kVar.f58078z == null) {
                        kVar.f58040j.b("retrying capture session after standby camera closed");
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
        m0 m0Var = kVar.f58059q0;
        if (m0Var != null && kVar.f58044k0 && kVar.f58047l0 && kVar.m0) {
            kVar.f58059q0 = null;
            if (!kVar.Z(m0Var)) {
                kVar.V = false;
                kVar.Y(m0Var);
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

    public static wa l(Size[] sizeArr, float f10, r0 r0Var, n0 n0Var) {
        int i7;
        wa m10;
        n0 n0Var2;
        wa m11;
        n0 n0Var3 = n0.f58129c;
        if (n0Var == n0Var3) {
            i7 = r0Var.f58151a;
        } else {
            r0 r0Var2 = r0.P480;
            n0 n0Var4 = n0.f58127a;
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
        wa m12 = m(sizeArr, f10, i7, n0Var);
        if (m12 != null) {
            return m12;
        }
        if (r0Var == r0.P360 && n0Var == (n0Var2 = n0.f58128b) && (m11 = m(sizeArr, f10, 480, n0Var2)) != null) {
            return m11;
        }
        int i10 = r0Var.f58151a;
        if (n0Var != n0Var3 && (m10 = m(sizeArr, f10, i10, n0Var3)) != null) {
            return m10;
        }
        int i11 = r0Var.f58151a;
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
        return new wa(size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088), 25);
    }

    public static wa m(Size[] sizeArr, float f10, int i7, n0 n0Var) {
        int i10;
        wa waVar = null;
        float f11 = 0.0f;
        for (Size size : sizeArr) {
            int i11 = ((i7 * 15) / 100) + i7;
            int min = Math.min(1920, i7 * 2);
            int min2 = Math.min(size.getWidth(), size.getHeight());
            int max = Math.max(size.getWidth(), size.getHeight());
            if (min2 >= i7 && min2 <= i11 && max <= min) {
                float min3 = (Math.min(1.0f, f10 / (Math.max(size.getWidth(), size.getHeight()) / Math.min(size.getWidth(), size.getHeight()))) * i7) / Math.min(size.getWidth(), size.getHeight());
                if (waVar == null || min3 > f11 || (i10 == 0 && h(size) < h((Size) waVar.f701c))) {
                    waVar = new wa(size, n0Var, i7, 25);
                    f11 = min3;
                }
            }
        }
        return waVar;
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

    public final void A(String str, Exception exc, boolean z9) {
        String str2;
        if (this.f58044k0) {
            o oVar = this.f58040j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z9);
            String str3 = "";
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            oVar.b(sb2.toString());
            int i7 = 0;
            this.f58044k0 = false;
            this.f58038i0 = false;
            int i10 = 1;
            this.f58041j0 = true;
            this.f58047l0 = false;
            this.m0 = false;
            if (z9 && this.f58078z != null) {
                q();
                CameraDevice cameraDevice = this.f58053o0;
                this.f58053o0 = null;
                this.f58056p0 = null;
                if (this.V && this.f58059q0 != null) {
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
            this.f58041j0 = true;
            this.f58038i0 = false;
            this.f58044k0 = false;
            this.f58059q0 = null;
            o();
            q();
            this.f58076y = null;
            this.f58053o0 = null;
            this.f58056p0 = null;
            this.f58070u0 = null;
            this.f58071v0 = null;
            o oVar2 = this.f58040j;
            StringBuilder u10 = a8.p0.u("camera recovery: reason=", concat, ", target=");
            u10.append(this.E);
            u10.append(", devices=");
            u10.append(this.f58062r0.size());
            u10.append(", switchElapsedMs=");
            u10.append(z(this.F0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            u10.append(str3);
            oVar2.b(u10.toString());
            if (this.f58062r0.isEmpty()) {
                this.V = false;
                if (this.U && !this.Y) {
                    G();
                    return;
                }
                return;
            }
            this.f58079z0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.f58062r0);
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
        boolean z9;
        n nVar = this.f58072w;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                M(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f58022c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            M(exc);
            return;
        }
        this.f58022c0 = true;
        this.f58027e0 = true;
        o();
        wa waVar = this.K;
        if (waVar == null) {
            M(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.I = o0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f58055p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.J = C(rangeArr, 30);
        this.f58058q = (Size) waVar.f701c;
        this.f58061r = waVar.f700b;
        this.H = (n0) waVar.d;
        this.f58033g0 = null;
        this.f58035h0 = null;
        x("frame-rate fallback changed stream configuration", exc);
        t tVar = this.v;
        if (tVar != null) {
            tVar.l();
            this.v = null;
        }
        n nVar2 = this.f58072w;
        if (nVar2 != null) {
            nVar2.u();
            this.f58072w = null;
        }
        this.f58067t = null;
        try {
            u();
            N();
            o oVar = this.f58040j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", recording=");
            sb2.append(this.f58058q);
            sb2.append(", crop=");
            sb2.append(this.f58061r);
            sb2.append(", fpsRange=");
            sb2.append(this.J);
            oVar.b(sb2.toString());
            Handler handler = this.f58050n;
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
        for (Set<String> set : this.f58018b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.F == m0.f58098b && (cameraCharacteristics = this.f58055p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.U && this.f58070u0 == null && this.f58076y == null) {
            if (f0.d.b(this.f58015a, "android.permission.CAMERA") != 0) {
                M(new SecurityException("Camera permission is not granted"));
            } else if (f0.d.b(this.f58015a, "android.permission.RECORD_AUDIO") != 0) {
                M(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.A0 = SystemClock.elapsedRealtimeNanos();
                    Q(this.E);
                    long z9 = z(this.A0);
                    if (this.f58076y == null && this.f58072w == null) {
                        J();
                    }
                    SurfaceTexture surfaceTexture = this.f58021c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        TextureView textureView = this.f58021c;
                        int max = Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight())));
                        surfaceTexture.setDefaultBufferSize(max, max);
                        if (this.f58064s == null) {
                            this.f58064s = new Surface(surfaceTexture);
                        }
                        if (this.f58072w == null) {
                            v();
                        } else {
                            t tVar = this.v;
                            if (tVar != null) {
                                tVar.n(this.f58058q, this.f58061r, D(this.f58055p));
                                Surface surface = null;
                                if (!this.f58044k0 && this.f58051n0) {
                                    this.f58051n0 = false;
                                    t tVar2 = this.v;
                                    Handler handler = tVar2.f58195u;
                                    if (tVar2.f58190r0 && handler != null) {
                                        handler.post(new j60((Object) tVar2, false, (Object) null, 17));
                                    }
                                }
                                t tVar3 = this.v;
                                Surface surface2 = tVar3.f58198w;
                                if (surface2 != null) {
                                    this.f58067t = surface2;
                                    if (this.f58044k0 && (!tVar3.f58167f || (surface = tVar3.f58202y) == null)) {
                                        throw new IllegalStateException("Secondary GL camera surface is unavailable");
                                    }
                                    this.f58069u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        I();
                        this.D0 = SystemClock.elapsedRealtimeNanos();
                        o oVar = this.f58040j;
                        oVar.b("camera open requested: id=" + this.f58052o + ", recording=" + this.f58058q + ", crop=" + this.f58061r + ", selectionElapsedMs=" + z9 + ", dualActive=" + this.f58044k0);
                        H(this.f58052o, false);
                    }
                } catch (Exception e10) {
                    M(e10);
                }
            }
        }
    }

    public final void H(String str, boolean z9) {
        e eVar;
        if (z9) {
            eVar = this.f58054o1;
        } else {
            eVar = this.n1;
        }
        j jVar = new j(this, eVar, z9);
        if (z9) {
            this.f58071v0 = jVar;
        } else {
            this.f58070u0 = jVar;
        }
        try {
            this.f58018b.openCamera(str, jVar, this.f58050n);
        } catch (CameraAccessException | RuntimeException e10) {
            jVar.c();
            if (!z9 ? this.f58070u0 == jVar : this.f58071v0 == jVar) {
                if (z9) {
                    this.f58071v0 = null;
                } else {
                    this.f58070u0 = null;
                }
            }
            throw e10;
        }
    }

    public final void I() {
        m0 m0Var;
        i iVar;
        if (this.f58044k0 && !this.f58041j0 && this.f58071v0 == null && this.f58053o0 == null) {
            m0 m0Var2 = this.G;
            m0 m0Var3 = m0.f58097a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f58098b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f58033g0;
            } else {
                iVar = this.f58035h0;
            }
            if (iVar != null) {
                try {
                    String str = iVar.f57997a;
                    this.f58056p0 = iVar;
                    this.f58077y0 = SystemClock.elapsedRealtimeNanos();
                    o oVar = this.f58040j;
                    oVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f57998b);
                    H(str, true);
                } catch (Exception e10) {
                    x("standby open request failed", e10);
                }
            }
        }
    }

    public final void J() {
        String str;
        if (this.f58041j0) {
            return;
        }
        if (this.f58038i0) {
            this.f58044k0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        o oVar = this.f58040j;
        if (i7 < 30) {
            this.f58041j0 = true;
            oVar.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        i k10 = k();
        o0 o0Var = k10.f58002g;
        String str2 = k10.f57997a;
        m0 m0Var = k10.f57998b;
        m0 m0Var2 = m0.f58097a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.f58098b;
        }
        try {
            try {
                Q(m0Var2);
                i k11 = k();
                o0 o0Var2 = k11.f58002g;
                String str3 = k11.f57997a;
                boolean E = E(str2, str3);
                this.f58038i0 = E;
                if (E && o0Var != o0Var2) {
                    this.f58038i0 = false;
                    oVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + k10.d + "/" + k10.f58000e + ", second=" + k11.d + "/" + k11.f58000e + ", firstFps=" + o0Var.f58135a + ", secondFps=" + o0Var2.f58135a);
                }
                boolean z9 = this.f58038i0;
                if (!z9) {
                    this.f58041j0 = true;
                }
                this.f58044k0 = z9;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f58038i0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f58038i0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                g(k10);
            } catch (Exception e10) {
                this.f58041j0 = true;
                oVar.b("camera dual-active capability unavailable: " + e10);
                g(k10);
            }
        } catch (Throwable th2) {
            g(k10);
            throw th2;
        }
    }

    public final void K() {
        this.f58068t0 = true;
        this.U = false;
        this.f58021c.setSurfaceTextureListener(null);
        this.f58021c.removeOnLayoutChangeListener(this.f58042j1);
        Handler handler = this.f58050n;
        HandlerThread handlerThread = this.f58048m;
        this.f58050n = null;
        this.f58048m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new u9.f(25, this, handlerThread));
        }
    }

    public final void L(Exception exc) {
        boolean z9;
        n nVar = this.f58072w;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                this.f58040j.a("camera lost while recording", exc);
                qt qtVar = this.f58043k;
                ((t0) qtVar.f37395b).f58213i.post(new j0(qtVar, exc, 0));
                return;
            }
        }
        M(exc);
    }

    public final void M(Exception exc) {
        this.f58040j.a("camera error", exc);
        qt qtVar = this.f58043k;
        ((t0) qtVar.f37395b).f58213i.post(new j0(qtVar, exc, 1));
    }

    public final void N() {
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f58017a1 = 0L;
        this.f58020b1 = 0.0d;
        this.f58023c1 = 0L;
        this.f58025d1 = 0L;
        this.f58028e1 = 0L;
        this.f58031f1 = 0L;
        this.f58034g1 = 0L;
        this.f58036h1 = 0L;
        this.f58039i1 = 0L;
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

    public final ly0 P(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, wa waVar) {
        String str2;
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        o oVar = this.f58040j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.FPS_30;
        if (o0Var != o0Var2 && !this.f58027e0) {
            int i7 = o0Var.f58135a;
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
                    wa l10 = l(sizeArr2, R(cameraCharacteristics), this.d, this.f58032g);
                    oVar.b("fps selection: id=" + str + ", requested=" + i7 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                    return new ly0(o0.FPS_60, C, l10, 24);
                } catch (RuntimeException unused) {
                    oVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                }
            } else {
                oVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range C2 = C(rangeArr, 30);
            oVar.b("fps selection: id=" + str + ", requested=" + i7 + ", fallback=30, range=" + C2);
            return new ly0(o0Var2, C2, waVar, 24);
        }
        Range C3 = C(rangeArr, 30);
        StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
        u10.append(o0Var.f58135a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        if (this.f58027e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        oVar.b(u10.toString());
        return new ly0(o0Var2, C3, waVar, 24);
    }

    public final void Q(wi.m0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: wi.k.Q(wi.m0):void");
    }

    public final void S(boolean z9) {
        Handler handler = this.f58050n;
        if (this.U && handler != null) {
            handler.post(new tp0(16, this, z9));
        }
    }

    public final boolean T(float f10) {
        this.M = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.f58050n;
        if (this.U && handler != null) {
            handler.removeCallbacks(this.l1);
            handler.post(this.l1);
            return true;
        }
        return false;
    }

    public final void V(x xVar, long j3, m0 m0Var) {
        if (this.f58068t0) {
            this.f58040j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.f58048m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f58048m = handlerThread;
            handlerThread.start();
            this.f58050n = new Handler(this.f58048m.getLooper());
        }
        this.D = xVar;
        this.L = j3;
        this.E = m0Var;
        this.U = true;
        this.Y = false;
        this.f58022c0 = false;
        this.f58074x = null;
        this.Z = true;
        this.C0 = SystemClock.elapsedRealtimeNanos();
        O();
        N();
        o oVar = this.f58040j;
        oVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f58021c.isAvailable());
        this.f58021c.setSurfaceTextureListener(this.f58049m1);
        Handler handler = this.f58050n;
        if (this.U && handler != null && this.f58021c.isAvailable()) {
            handler.post(new a(this, 8));
        }
    }

    public final boolean W() {
        Handler handler = this.f58050n;
        if (!this.U || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f58040j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean X(m0 m0Var) {
        int i7;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f58097a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        CameraManager cameraManager = this.f58018b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) P(str, cameraCharacteristics, streamConfigurationMap, outputSizes, l(outputSizes, R(cameraCharacteristics), this.d, this.f58032g)).f47746b) == o0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void Y(m0 m0Var) {
        if (this.U && !this.V && m0Var != this.F) {
            this.V = true;
            this.W = true;
            this.O = false;
            this.P = false;
            this.M = 0.0f;
            qt qtVar = this.f58043k;
            ((t0) qtVar.f37395b).f58213i.post(new u9.f(27, qtVar, m0Var));
            this.F0 = SystemClock.elapsedRealtimeNanos();
            o oVar = this.f58040j;
            oVar.b("camera device switch started: from=" + this.F + ", to=" + m0Var);
            if (!Z(m0Var)) {
                if (this.f58044k0) {
                    this.f58059q0 = m0Var;
                    this.f58040j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
                    return;
                }
                t tVar = this.v;
                if (tVar != null) {
                    m0 m0Var2 = this.F;
                    Handler handler = tVar.f58195u;
                    if (tVar.f58190r0 && handler != null) {
                        handler.post(new wg.q(tVar, m0Var2, m0Var, handler, 1));
                    }
                }
                s();
            }
        }
    }

    public final boolean Z(m0 m0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        CaptureRequest.Builder w10;
        if (!this.f58044k0 || !this.f58047l0 || !this.m0 || (cameraDevice = this.f58076y) == null || (cameraDevice2 = this.f58053o0) == null || (cameraCaptureSession = this.f58078z) == null || (cameraCaptureSession2 = this.A) == null || (iVar = this.f58056p0) == null || iVar.f57998b != m0Var || this.v == null) {
            return false;
        }
        this.f58076y = cameraDevice2;
        this.f58053o0 = cameraDevice;
        this.f58078z = cameraCaptureSession2;
        this.A = cameraCaptureSession;
        CaptureRequest.Builder builder = this.B;
        this.B = this.C;
        this.C = builder;
        Surface surface = this.f58067t;
        this.f58067t = this.f58069u;
        this.f58069u = surface;
        if (this.F == m0.f58097a) {
            iVar2 = this.f58033g0;
        } else {
            iVar2 = this.f58035h0;
        }
        this.f58056p0 = iVar2;
        g(iVar);
        this.F = m0Var;
        try {
            try {
                w10 = w(this.f58076y, this.f58067t, iVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
                e = e10;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
            e = e11;
        }
        try {
            this.B = w10;
            this.f58078z.setRepeatingRequest(w10.build(), this.f58063r1, this.f58050n);
            i iVar3 = this.f58056p0;
            if (iVar3 != null) {
                CaptureRequest.Builder w11 = w(this.f58053o0, this.f58069u, iVar3, false, false);
                this.C = w11;
                this.A.setRepeatingRequest(w11.build(), this.f58063r1, this.f58050n);
            }
            boolean z9 = !this.f58051n0;
            this.f58051n0 = z9;
            long j3 = this.F0;
            t tVar = this.v;
            b bVar = new b(this, m0Var, j3, 0);
            Handler handler = tVar.f58195u;
            if (tVar.f58190r0 && handler != null) {
                handler.post(new j60(tVar, z9, bVar, 17));
            }
            this.f58047l0 = true;
            this.m0 = true;
            this.W = false;
            this.V = false;
            this.X = false;
            N();
            this.f58040j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f58076y.getId() + ", standbyId=" + this.f58053o0.getId() + ", input=" + (this.f58051n0 ? 1 : 0) + ", elapsedMs=" + z(this.F0));
            this.f58021c.post(new a(this, 2));
            qt qtVar = this.f58043k;
            ((t0) qtVar.f37395b).f58213i.post(new j60((Object) qtVar, (Object) new h(this.F, this.H, this.I, this.f58058q, this.N, F()), true, 18));
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
            this.f58021c.setTransform(new Matrix());
            if (y() != this.B0) {
                a aVar = new a(this, 1);
                Handler handler = this.f58050n;
                if (handler != null) {
                    handler.post(aVar);
                }
            }
        }
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: wi.k.f():void");
    }

    public final void g(i iVar) {
        this.f58052o = iVar.f57997a;
        this.G = iVar.f57998b;
        this.f58055p = iVar.f57999c;
        this.f58058q = iVar.d;
        this.f58061r = iVar.f58000e;
        this.H = iVar.f58001f;
        this.I = iVar.f58002g;
        this.J = iVar.h;
        this.K = iVar.f58003i;
        this.N = iVar.f58004j;
        this.f58022c0 = false;
        N();
    }

    public final void j() {
        Handler handler = this.f58050n;
        if (handler != null) {
            handler.removeCallbacks(this.f58045k1);
        }
        this.f58074x = null;
    }

    public final i k() {
        return new i(this.f58052o, this.G, this.f58055p, this.f58058q, this.f58061r, this.H, this.I, this.J, this.K, this.N);
    }

    public final void n() {
        j();
        this.V = false;
        this.f58066s1 = 1;
        this.f58070u0 = null;
        this.f58071v0 = null;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.B = null;
        this.P = false;
        this.f58059q0 = null;
        o();
        q();
        this.f58076y = null;
        this.f58053o0 = null;
        this.f58056p0 = null;
        if (!this.f58062r0.isEmpty()) {
            this.f58079z0 = SystemClock.elapsedRealtimeNanos();
            this.f58040j.b("closing camera devices: count=" + this.f58062r0.size());
            ArrayList arrayList = new ArrayList(this.f58062r0);
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
        Surface surface = this.f58064s;
        if (surface != null) {
            surface.release();
            this.f58064s = null;
        }
        this.f58067t = null;
        this.f58069u = null;
        this.f58044k0 = false;
        this.f58047l0 = false;
        this.m0 = false;
        this.f58051n0 = false;
    }

    public final void o() {
        CameraCaptureSession cameraCaptureSession = this.f58078z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f58078z = null;
        }
        this.B = null;
    }

    public final void p(CameraDevice cameraDevice, int i7) {
        ArrayList arrayList = this.f58065s0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i7 != 1) {
            this.f58066s1 = i7;
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
        this.f58059q0 = null;
        if (this.f58038i0) {
            str = ", reason=standby session not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f58040j.b("camera switch path: sequential".concat(str));
        o();
        CameraDevice cameraDevice = this.f58076y;
        if (cameraDevice != null) {
            this.f58076y = null;
            this.f58079z0 = SystemClock.elapsedRealtimeNanos();
            p(cameraDevice, 2);
        } else if (this.f58070u0 != null) {
        } else {
            this.V = false;
            G();
        }
    }

    public final void t() {
        CameraDevice cameraDevice = this.f58076y;
        if (cameraDevice != null && this.f58064s != null && this.f58067t != null) {
            try {
                this.E0 = SystemClock.elapsedRealtimeNanos();
                o oVar = this.f58040j;
                oVar.b("capture session requested: recording=" + this.f58058q + ", fpsRange=" + this.J);
                cameraDevice.createCaptureSession(Arrays.asList(this.f58067t), this.f58060q1, this.f58050n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                if (this.I == o0.FPS_60) {
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
        boolean z9;
        Surface surface2;
        m0 m0Var;
        i iVar;
        Surface surface3;
        x xVar = this.D;
        long j3 = this.L;
        int i7 = this.f58026e;
        int i10 = this.f58029f;
        int i11 = this.f58030f0;
        if (i11 <= 0) {
            i11 = this.I.f58135a;
        }
        int i12 = i11;
        o oVar = this.f58040j;
        qt qtVar = this.f58043k;
        Objects.requireNonNull(qtVar);
        c cVar = new c(qtVar, 0);
        qt qtVar2 = this.f58043k;
        Objects.requireNonNull(qtVar2);
        n nVar = new n(xVar, j3, i7, i10, i12, oVar, cVar, new c(qtVar2, 1));
        this.f58072w = nVar;
        synchronized (nVar) {
            if (nVar.D) {
                surface = nVar.f58118q;
            } else {
                nVar.q();
                long nanoTime = System.nanoTime();
                try {
                    nVar.b();
                    nVar.a();
                    nVar.f58115n.start();
                    nVar.D = true;
                    nVar.f58108f.b("codecs prepared: video=" + nVar.f58115n.getName() + ", audio=" + nVar.f58116o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = nVar.f58118q;
                } catch (IOException | RuntimeException e10) {
                    nVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.f58058q;
        Surface surface5 = this.f58064s;
        boolean z10 = this.f58044k0;
        int i13 = this.f58026e;
        int i14 = this.f58061r;
        boolean D = D(this.f58055p);
        boolean z11 = this.f58037i;
        o oVar2 = this.f58040j;
        n nVar2 = this.f58072w;
        qt qtVar3 = this.f58043k;
        Objects.requireNonNull(qtVar3);
        t tVar = new t(size, surface4, surface5, z10, i13, i14, D, z11, oVar2, nVar2, new c(qtVar3, 2));
        this.v = tVar;
        tVar.f58196u0 = new a(this, 3);
        int y10 = y();
        this.B0 = y10;
        t tVar2 = this.v;
        tVar2.f58192s0 = y10;
        Handler handler = tVar2.f58195u;
        if (tVar2.f58190r0 && handler != null) {
            handler.post(new f2(tVar2, y10, 11));
        }
        t tVar3 = this.v;
        if (tVar3.f58190r0) {
            surface2 = tVar3.f58198w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar3.f58193t = handlerThread;
            handlerThread.start();
            tVar3.f58188q0 = System.nanoTime();
            o oVar3 = tVar3.f58172i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar3.f58158a);
            sb2.append(", crop=");
            sb2.append(tVar3.f58174j);
            sb2.append(", output=");
            sb2.append(tVar3.f58169g);
            sb2.append("x");
            sb2.append(tVar3.f58169g);
            sb2.append(", filter=");
            if (tVar3.f58174j == tVar3.f58169g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(tVar3.h);
            sb2.append(", dualInput=");
            sb2.append(tVar3.f58167f);
            sb2.append(", glPreview=");
            if (tVar3.f58165e != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            sb2.append(z9);
            oVar3.b(sb2.toString());
            Handler handler2 = new Handler(tVar3.f58193t.getLooper());
            tVar3.f58195u = handler2;
            handler2.post(new u9.f(26, tVar3, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar3.f58201x0 == null) {
                    surface2 = tVar3.f58198w;
                } else {
                    RuntimeException runtimeException = tVar3.f58201x0;
                    tVar3.f58201x0 = null;
                    tVar3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                tVar3.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.f58067t = surface2;
        if (this.f58044k0) {
            m0 m0Var2 = this.G;
            m0 m0Var3 = m0.f58097a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f58098b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f58033g0;
            } else {
                iVar = this.f58035h0;
            }
            if (iVar != null) {
                t tVar4 = this.v;
                Size size2 = iVar.d;
                int i15 = iVar.f58000e;
                boolean D2 = D(iVar.f57999c);
                Handler handler3 = tVar4.f58195u;
                if (tVar4.f58190r0 && tVar4.f58167f && handler3 != null) {
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
                if (tVar5.f58167f && (surface3 = tVar5.f58202y) != null) {
                    this.f58069u = surface3;
                    return;
                }
                throw new IllegalStateException("Secondary GL camera surface is unavailable");
            }
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        this.f58069u = null;
    }

    public final void v() {
        try {
            u();
        } catch (IOException | RuntimeException e10) {
            if (this.f58044k0) {
                this.f58040j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
                t tVar = this.v;
                if (tVar != null) {
                    tVar.l();
                    this.v = null;
                }
                n nVar = this.f58072w;
                if (nVar != null) {
                    nVar.u();
                    this.f58072w = null;
                }
                this.f58067t = null;
                this.f58069u = null;
                this.f58044k0 = false;
                this.f58038i0 = false;
                this.f58041j0 = true;
                u();
                return;
            }
            throw e10;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder w(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, wi.i r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: wi.k.w(android.hardware.camera2.CameraDevice, android.view.Surface, wi.i, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void x(String str, Exception exc) {
        String str2;
        this.f58041j0 = true;
        this.f58038i0 = false;
        this.f58044k0 = false;
        StringBuilder sb2 = new StringBuilder("camera dual-active disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f58040j.b(sb2.toString());
        q();
        CameraDevice cameraDevice = this.f58053o0;
        this.f58053o0 = null;
        this.f58056p0 = null;
        this.f58071v0 = null;
        if (cameraDevice != null && cameraDevice != this.f58076y) {
            p(cameraDevice, 1);
        }
    }

    public final int y() {
        Display display = this.f58021c.getDisplay();
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
