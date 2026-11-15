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
import hi.m3;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.z30;
import org.telegram.ui.f60;
import org.telegram.ui.nb1;
import y7.f7;
public final class l {
    public CameraCaptureSession A;
    public long A0;
    public CaptureRequest.Builder B;
    public int B0;
    public CaptureRequest.Builder C;
    public long C0;
    public y D;
    public long D0;
    public volatile n0 E;
    public long E0;
    public n0 F;
    public long F0;
    public n0 G;
    public long G0;
    public o0 H;
    public long H0;
    public q0 I;
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
    public final Context f61554a;
    public boolean f61555a0;
    public long f61556a1;
    public final CameraManager f61557b;
    public boolean f61558b0;
    public double f61559b1;
    public final TextureView f61560c;
    public boolean f61561c0;
    public long f61562c1;
    public final t0 d;
    public boolean f61563d0;
    public long f61564d1;
    public final int f61565e;
    public boolean f61566e0;
    public long f61567e1;
    public final int f61568f;
    public int f61569f0;
    public long f61570f1;
    public final o0 f61571g;
    public j f61572g0;
    public long f61573g1;
    public final q0 h;
    public j f61574h0;
    public long f61575h1;
    public final boolean f61576i;
    public boolean f61577i0;
    public long f61578i1;
    public final p f61579j;
    public boolean f61580j0;
    public final m3 f61581j1;
    public final u7.i f61582k;
    public boolean f61583k0;
    public final a f61584k1;
    public boolean f61586l0;
    public final a l1;
    public HandlerThread f61587m;
    public boolean m0;
    public final z30 f61588m1;
    public Handler f61589n;
    public boolean f61590n0;
    public final f n1;
    public String f61591o;
    public CameraDevice f61592o0;
    public final f f61593o1;
    public CameraCharacteristics f61594p;
    public j f61595p0;
    public final g f61596p1;
    public volatile Size f61597q;
    public n0 f61598q0;
    public final g f61599q1;
    public volatile int f61600r;
    public final h f61602r1;
    public Surface f61603s;
    public Surface f61606t;
    public volatile boolean f61607t0;
    public Surface f61608u;
    public k f61609u0;
    public u v;
    public k f61610v0;
    public o f61611w;
    public int f61612w0;
    public o f61613x;
    public HandlerThread f61614x0;
    public CameraDevice f61615y;
    public long f61616y0;
    public CameraCaptureSession f61617z;
    public long f61618z0;
    public final Rect f61585l = new Rect();
    public float N = 1.0f;
    public final ArrayList f61601r0 = new ArrayList();
    public final ArrayList f61604s0 = new ArrayList();
    public int f61605s1 = 1;

    public l(Context context, TextureView textureView, t0 t0Var, int i7, o0 o0Var, q0 q0Var, boolean z10, p pVar, u7.i iVar) {
        m3 m3Var = new m3(this, 2);
        this.f61581j1 = m3Var;
        this.f61584k1 = new a(this, 5);
        this.l1 = new a(this, 6);
        this.f61588m1 = new z30(this, 5);
        this.n1 = new f(this, 0);
        this.f61593o1 = new f(this, 1);
        this.f61596p1 = new g(this, 0);
        this.f61599q1 = new g(this, 1);
        this.f61602r1 = new h(this);
        this.f61554a = context.getApplicationContext();
        this.f61557b = (CameraManager) context.getSystemService("camera");
        this.f61560c = textureView;
        this.d = t0Var;
        this.f61565e = t0Var.f61690a;
        this.f61568f = i7;
        this.f61571g = o0Var;
        this.h = q0Var;
        this.f61576i = z10;
        this.f61579j = pVar;
        this.f61582k = iVar;
        textureView.addOnLayoutChangeListener(m3Var);
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

    public static void a(l lVar) {
        CameraDevice cameraDevice = lVar.f61615y;
        CameraDevice cameraDevice2 = lVar.f61592o0;
        if (lVar.f61583k0 && cameraDevice != null && cameraDevice2 != null && lVar.f61606t != null && lVar.f61608u != null && lVar.f61617z == null && lVar.A == null) {
            lVar.f61586l0 = false;
            lVar.m0 = false;
            try {
                lVar.E0 = SystemClock.elapsedRealtimeNanos();
                p pVar = lVar.f61579j;
                pVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + lVar.f61597q + ", fpsRange=" + lVar.J);
                cameraDevice.createCaptureSession(Arrays.asList(lVar.f61606t), lVar.f61599q1, lVar.f61589n);
                cameraDevice2.createCaptureSession(Arrays.asList(lVar.f61608u), lVar.f61596p1, lVar.f61589n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                lVar.A("session request failed", e10, false);
            }
        }
    }

    public static void b(l lVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z10;
        int i7 = 1;
        if (cameraDevice == lVar.f61615y) {
            lVar.o();
            lVar.f61615y = null;
            lVar.p(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException(r.b.k("Active camera ", str));
            }
            lVar.L(illegalStateException);
            return;
        }
        if (cameraDevice == lVar.f61592o0) {
            lVar.f61592o0 = null;
        }
        if (!lVar.f61583k0) {
            lVar.p(cameraDevice, 1);
            return;
        }
        p pVar = lVar.f61579j;
        StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
        sb2.append(str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        sb2.append(str2);
        pVar.b(sb2.toString());
        boolean z11 = false;
        lVar.f61583k0 = false;
        lVar.f61577i0 = false;
        lVar.f61580j0 = true;
        lVar.f61595p0 = null;
        lVar.q();
        if (lVar.U && lVar.f61615y != null && lVar.f61617z == null && !lVar.V) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (lVar.V && lVar.f61598q0 != null) {
            z11 = true;
        }
        if (z10) {
            i7 = 3;
        } else if (z11) {
            i7 = 4;
        }
        lVar.p(cameraDevice, i7);
    }

    public static void c(l lVar, CameraDevice cameraDevice) {
        String str;
        lVar.f61601r0.remove(cameraDevice);
        lVar.f61604s0.remove(cameraDevice);
        if (cameraDevice == lVar.f61615y) {
            lVar.f61615y = null;
        }
        if (cameraDevice == lVar.f61592o0) {
            lVar.f61592o0 = null;
        }
        p pVar = lVar.f61579j;
        StringBuilder sb2 = new StringBuilder("camera device closed: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", owned=");
        sb2.append(lVar.f61601r0.size());
        sb2.append(", closing=");
        sb2.append(lVar.f61604s0.size());
        sb2.append(", afterClose=");
        int i7 = lVar.f61605s1;
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
        sb2.append(z(lVar.f61618z0));
        pVar.b(sb2.toString());
        if (lVar.f61604s0.isEmpty()) {
            int i10 = lVar.f61605s1;
            lVar.f61605s1 = 1;
            if (lVar.U && !lVar.Y && i10 != 1) {
                int c10 = p1.g.c(i10);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            lVar.f61579j.b("continuing pending switch after DUAL_ACTIVE fallback");
                            lVar.s();
                            return;
                        }
                        return;
                    } else if (lVar.f61615y != null && lVar.f61617z == null) {
                        lVar.f61579j.b("retrying capture session after standby camera closed");
                        lVar.t();
                        return;
                    } else {
                        return;
                    }
                }
                lVar.V = false;
                lVar.G();
            }
        }
    }

    public static void d(l lVar) {
        n0 n0Var = lVar.f61598q0;
        if (n0Var != null && lVar.f61583k0 && lVar.f61586l0 && lVar.m0) {
            lVar.f61598q0 = null;
            if (!lVar.Z(n0Var)) {
                lVar.V = false;
                lVar.Y(n0Var);
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

    public static xa l(Size[] sizeArr, float f10, t0 t0Var, o0 o0Var) {
        int i7;
        xa m10;
        o0 o0Var2;
        xa m11;
        o0 o0Var3 = o0.f61668c;
        if (o0Var == o0Var3) {
            i7 = t0Var.f61690a;
        } else {
            t0 t0Var2 = t0.P480;
            o0 o0Var4 = o0.f61666a;
            if (t0Var == t0Var2) {
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
        if (t0Var == t0.P360 && o0Var == (o0Var2 = o0.f61667b) && (m11 = m(sizeArr, f10, 480, o0Var2)) != null) {
            return m11;
        }
        int i10 = t0Var.f61690a;
        if (o0Var != o0Var3 && (m10 = m(sizeArr, f10, i10, o0Var3)) != null) {
            return m10;
        }
        int i11 = t0Var.f61690a;
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
        if (this.f61583k0) {
            p pVar = this.f61579j;
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
            pVar.b(sb2.toString());
            int i7 = 0;
            this.f61583k0 = false;
            this.f61577i0 = false;
            int i10 = 1;
            this.f61580j0 = true;
            this.f61586l0 = false;
            this.m0 = false;
            if (z10 && this.f61617z != null) {
                q();
                CameraDevice cameraDevice = this.f61592o0;
                this.f61592o0 = null;
                this.f61595p0 = null;
                if (this.V && this.f61598q0 != null) {
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
            this.f61580j0 = true;
            this.f61577i0 = false;
            this.f61583k0 = false;
            this.f61598q0 = null;
            o();
            q();
            this.f61615y = null;
            this.f61592o0 = null;
            this.f61595p0 = null;
            this.f61609u0 = null;
            this.f61610v0 = null;
            p pVar2 = this.f61579j;
            StringBuilder u10 = a8.p0.u("camera recovery: reason=", concat, ", target=");
            u10.append(this.E);
            u10.append(", devices=");
            u10.append(this.f61601r0.size());
            u10.append(", switchElapsedMs=");
            u10.append(z(this.F0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            u10.append(str3);
            pVar2.b(u10.toString());
            if (this.f61601r0.isEmpty()) {
                this.V = false;
                if (this.U && !this.Y) {
                    G();
                    return;
                }
                return;
            }
            this.f61618z0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.f61601r0);
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
        o oVar = this.f61611w;
        if (oVar != null) {
            synchronized (oVar) {
                z10 = oVar.E;
            }
            if (z10) {
                M(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f61561c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            M(exc);
            return;
        }
        this.f61561c0 = true;
        this.f61566e0 = true;
        o();
        xa xaVar = this.K;
        if (xaVar == null) {
            M(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.I = q0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f61594p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.J = C(rangeArr, 30);
        this.f61597q = (Size) xaVar.f714c;
        this.f61600r = xaVar.f713b;
        this.H = (o0) xaVar.d;
        this.f61572g0 = null;
        this.f61574h0 = null;
        x("frame-rate fallback changed stream configuration", exc);
        u uVar = this.v;
        if (uVar != null) {
            uVar.l();
            this.v = null;
        }
        o oVar2 = this.f61611w;
        if (oVar2 != null) {
            oVar2.u();
            this.f61611w = null;
        }
        this.f61606t = null;
        try {
            u();
            N();
            p pVar = this.f61579j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", recording=");
            sb2.append(this.f61597q);
            sb2.append(", crop=");
            sb2.append(this.f61600r);
            sb2.append(", fpsRange=");
            sb2.append(this.J);
            pVar.b(sb2.toString());
            Handler handler = this.f61589n;
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
        for (Set<String> set : this.f61557b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        if (this.F == n0.f61637b && (cameraCharacteristics = this.f61594p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void G() {
        if (this.U && this.f61609u0 == null && this.f61615y == null) {
            if (f0.d.b(this.f61554a, "android.permission.CAMERA") != 0) {
                M(new SecurityException("Camera permission is not granted"));
            } else if (f0.d.b(this.f61554a, "android.permission.RECORD_AUDIO") != 0) {
                M(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.A0 = SystemClock.elapsedRealtimeNanos();
                    Q(this.E);
                    long z10 = z(this.A0);
                    if (this.f61615y == null && this.f61611w == null) {
                        J();
                    }
                    SurfaceTexture surfaceTexture = this.f61560c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        TextureView textureView = this.f61560c;
                        int max = Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight())));
                        surfaceTexture.setDefaultBufferSize(max, max);
                        if (this.f61603s == null) {
                            this.f61603s = new Surface(surfaceTexture);
                        }
                        if (this.f61611w == null) {
                            v();
                        } else {
                            u uVar = this.v;
                            if (uVar != null) {
                                uVar.n(this.f61597q, this.f61600r, D(this.f61594p));
                                Surface surface = null;
                                if (!this.f61583k0 && this.f61590n0) {
                                    this.f61590n0 = false;
                                    u uVar2 = this.v;
                                    Handler handler = uVar2.f61728u;
                                    if (uVar2.f61723r0 && handler != null) {
                                        handler.post(new f60((Object) uVar2, false, (Object) null, 17));
                                    }
                                }
                                u uVar3 = this.v;
                                Surface surface2 = uVar3.f61731w;
                                if (surface2 != null) {
                                    this.f61606t = surface2;
                                    if (this.f61583k0 && (!uVar3.f61700f || (surface = uVar3.f61735y) == null)) {
                                        throw new IllegalStateException("Secondary GL camera surface is unavailable");
                                    }
                                    this.f61608u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        I();
                        this.D0 = SystemClock.elapsedRealtimeNanos();
                        p pVar = this.f61579j;
                        pVar.b("camera open requested: id=" + this.f61591o + ", recording=" + this.f61597q + ", crop=" + this.f61600r + ", selectionElapsedMs=" + z10 + ", dualActive=" + this.f61583k0);
                        H(this.f61591o, false);
                    }
                } catch (Exception e10) {
                    M(e10);
                }
            }
        }
    }

    public final void H(String str, boolean z10) {
        f fVar;
        if (z10) {
            fVar = this.f61593o1;
        } else {
            fVar = this.n1;
        }
        k kVar = new k(this, fVar, z10);
        if (z10) {
            this.f61610v0 = kVar;
        } else {
            this.f61609u0 = kVar;
        }
        try {
            this.f61557b.openCamera(str, kVar, this.f61589n);
        } catch (CameraAccessException | RuntimeException e10) {
            kVar.c();
            if (!z10 ? this.f61609u0 == kVar : this.f61610v0 == kVar) {
                if (z10) {
                    this.f61610v0 = null;
                } else {
                    this.f61609u0 = null;
                }
            }
            throw e10;
        }
    }

    public final void I() {
        n0 n0Var;
        j jVar;
        if (this.f61583k0 && !this.f61580j0 && this.f61610v0 == null && this.f61592o0 == null) {
            n0 n0Var2 = this.G;
            n0 n0Var3 = n0.f61636a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f61637b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                jVar = this.f61572g0;
            } else {
                jVar = this.f61574h0;
            }
            if (jVar != null) {
                try {
                    String str = jVar.f61536a;
                    this.f61595p0 = jVar;
                    this.f61616y0 = SystemClock.elapsedRealtimeNanos();
                    p pVar = this.f61579j;
                    pVar.b("warm camera open requested: id=" + str + ", facing=" + jVar.f61537b);
                    H(str, true);
                } catch (Exception e10) {
                    x("standby open request failed", e10);
                }
            }
        }
    }

    public final void J() {
        String str;
        if (this.f61580j0) {
            return;
        }
        if (this.f61577i0) {
            this.f61583k0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        p pVar = this.f61579j;
        if (i7 < 30) {
            this.f61580j0 = true;
            pVar.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        j k10 = k();
        q0 q0Var = k10.f61541g;
        String str2 = k10.f61536a;
        n0 n0Var = k10.f61537b;
        n0 n0Var2 = n0.f61636a;
        if (n0Var == n0Var2) {
            n0Var2 = n0.f61637b;
        }
        try {
            try {
                Q(n0Var2);
                j k11 = k();
                q0 q0Var2 = k11.f61541g;
                String str3 = k11.f61536a;
                boolean E = E(str2, str3);
                this.f61577i0 = E;
                if (E && q0Var != q0Var2) {
                    this.f61577i0 = false;
                    pVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + k10.d + "/" + k10.f61539e + ", second=" + k11.d + "/" + k11.f61539e + ", firstFps=" + q0Var.f61676a + ", secondFps=" + q0Var2.f61676a);
                }
                boolean z10 = this.f61577i0;
                if (!z10) {
                    this.f61580j0 = true;
                }
                this.f61583k0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f61577i0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f61577i0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                g(k10);
            } catch (Exception e10) {
                this.f61580j0 = true;
                pVar.b("camera dual-active capability unavailable: " + e10);
                g(k10);
            }
        } catch (Throwable th2) {
            g(k10);
            throw th2;
        }
    }

    public final void K() {
        this.f61607t0 = true;
        this.U = false;
        this.f61560c.setSurfaceTextureListener(null);
        this.f61560c.removeOnLayoutChangeListener(this.f61581j1);
        Handler handler = this.f61589n;
        HandlerThread handlerThread = this.f61587m;
        this.f61589n = null;
        this.f61587m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new e(0, this, handlerThread));
        }
    }

    public final void L(Exception exc) {
        boolean z10;
        o oVar = this.f61611w;
        if (oVar != null) {
            synchronized (oVar) {
                z10 = oVar.E;
            }
            if (z10) {
                this.f61579j.a("camera lost while recording", exc);
                u7.i iVar = this.f61582k;
                ((v0) iVar.f57880a).f61752i.post(new k0(iVar, exc, 0));
                return;
            }
        }
        M(exc);
    }

    public final void M(Exception exc) {
        this.f61579j.a("camera error", exc);
        u7.i iVar = this.f61582k;
        ((v0) iVar.f57880a).f61752i.post(new k0(iVar, exc, 1));
    }

    public final void N() {
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f61556a1 = 0L;
        this.f61559b1 = 0.0d;
        this.f61562c1 = 0L;
        this.f61564d1 = 0L;
        this.f61567e1 = 0L;
        this.f61570f1 = 0L;
        this.f61573g1 = 0L;
        this.f61575h1 = 0L;
        this.f61578i1 = 0L;
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
        p pVar = this.f61579j;
        q0 q0Var = this.h;
        q0 q0Var2 = q0.FPS_30;
        if (q0Var != q0Var2 && !this.f61566e0) {
            int i7 = q0Var.f61676a;
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
                    xa l10 = l(sizeArr2, R(cameraCharacteristics), this.d, this.f61571g);
                    pVar.b("fps selection: id=" + str + ", requested=" + i7 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                    return new f7(q0.FPS_60, C, l10);
                } catch (RuntimeException unused) {
                    pVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                }
            } else {
                pVar.b("fps selection: id=" + str + ", regular " + i7 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
            }
            Range C2 = C(rangeArr, 30);
            pVar.b("fps selection: id=" + str + ", requested=" + i7 + ", fallback=30, range=" + C2);
            return new f7(q0Var2, C2, xaVar);
        }
        Range C3 = C(rangeArr, 30);
        StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
        u10.append(q0Var.f61676a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        if (this.f61566e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        pVar.b(u10.toString());
        return new f7(q0Var2, C3, xaVar);
    }

    public final void Q(zi.n0 r31) {
        throw new UnsupportedOperationException("Method not decompiled: zi.l.Q(zi.n0):void");
    }

    public final void S(boolean z10) {
        Handler handler = this.f61589n;
        if (this.U && handler != null) {
            handler.post(new fp0(18, this, z10));
        }
    }

    public final boolean T(float f10) {
        this.M = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.f61589n;
        if (this.U && handler != null) {
            handler.removeCallbacks(this.l1);
            handler.post(this.l1);
            return true;
        }
        return false;
    }

    public final void V(y yVar, long j3, n0 n0Var) {
        if (this.f61607t0) {
            this.f61579j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.f61587m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f61587m = handlerThread;
            handlerThread.start();
            this.f61589n = new Handler(this.f61587m.getLooper());
        }
        this.D = yVar;
        this.L = j3;
        this.E = n0Var;
        this.U = true;
        this.Y = false;
        this.f61561c0 = false;
        this.f61613x = null;
        this.Z = true;
        this.C0 = SystemClock.elapsedRealtimeNanos();
        O();
        N();
        p pVar = this.f61579j;
        pVar.b("camera segment start: facing=" + n0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f61560c.isAvailable());
        this.f61560c.setSurfaceTextureListener(this.f61588m1);
        Handler handler = this.f61589n;
        if (this.U && handler != null && this.f61560c.isAvailable()) {
            handler.post(new a(this, 8));
        }
    }

    public final boolean W() {
        Handler handler = this.f61589n;
        if (!this.U || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f61579j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean X(n0 n0Var) {
        int i7;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (n0Var == n0.f61636a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        CameraManager cameraManager = this.f61557b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((q0) P(str, cameraCharacteristics, streamConfigurationMap, outputSizes, l(outputSizes, R(cameraCharacteristics), this.d, this.f61571g)).f60245a) == q0.FPS_60) {
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
            u7.i iVar = this.f61582k;
            ((v0) iVar.f57880a).f61752i.post(new e(2, iVar, n0Var));
            this.F0 = SystemClock.elapsedRealtimeNanos();
            p pVar = this.f61579j;
            pVar.b("camera device switch started: from=" + this.F + ", to=" + n0Var);
            if (!Z(n0Var)) {
                if (this.f61583k0) {
                    this.f61598q0 = n0Var;
                    this.f61579j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
                    return;
                }
                u uVar = this.v;
                if (uVar != null) {
                    n0 n0Var2 = this.F;
                    Handler handler = uVar.f61728u;
                    if (uVar.f61723r0 && handler != null) {
                        handler.post(new t5.a(uVar, n0Var2, n0Var, handler, 5));
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
        j jVar;
        j jVar2;
        CaptureRequest.Builder w10;
        if (!this.f61583k0 || !this.f61586l0 || !this.m0 || (cameraDevice = this.f61615y) == null || (cameraDevice2 = this.f61592o0) == null || (cameraCaptureSession = this.f61617z) == null || (cameraCaptureSession2 = this.A) == null || (jVar = this.f61595p0) == null || jVar.f61537b != n0Var || this.v == null) {
            return false;
        }
        this.f61615y = cameraDevice2;
        this.f61592o0 = cameraDevice;
        this.f61617z = cameraCaptureSession2;
        this.A = cameraCaptureSession;
        CaptureRequest.Builder builder = this.B;
        this.B = this.C;
        this.C = builder;
        Surface surface = this.f61606t;
        this.f61606t = this.f61608u;
        this.f61608u = surface;
        if (this.F == n0.f61636a) {
            jVar2 = this.f61572g0;
        } else {
            jVar2 = this.f61574h0;
        }
        this.f61595p0 = jVar2;
        g(jVar);
        this.F = n0Var;
        try {
            try {
                w10 = w(this.f61615y, this.f61606t, jVar, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e10) {
                e = e10;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
            e = e11;
        }
        try {
            this.B = w10;
            this.f61617z.setRepeatingRequest(w10.build(), this.f61602r1, this.f61589n);
            j jVar3 = this.f61595p0;
            if (jVar3 != null) {
                CaptureRequest.Builder w11 = w(this.f61592o0, this.f61608u, jVar3, false, false);
                this.C = w11;
                this.A.setRepeatingRequest(w11.build(), this.f61602r1, this.f61589n);
            }
            boolean z10 = !this.f61590n0;
            this.f61590n0 = z10;
            long j3 = this.F0;
            u uVar = this.v;
            b bVar = new b(this, n0Var, j3, 0);
            Handler handler = uVar.f61728u;
            if (uVar.f61723r0 && handler != null) {
                handler.post(new f60(uVar, z10, bVar, 17));
            }
            this.f61586l0 = true;
            this.m0 = true;
            this.W = false;
            this.V = false;
            this.X = false;
            N();
            this.f61579j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f61615y.getId() + ", standbyId=" + this.f61592o0.getId() + ", input=" + (this.f61590n0 ? 1 : 0) + ", elapsedMs=" + z(this.F0));
            this.f61560c.post(new a(this, 2));
            u7.i iVar = this.f61582k;
            ((v0) iVar.f57880a).f61752i.post(new f60((Object) iVar, (Object) new i(this.F, this.H, this.I, this.f61597q, this.N, F()), true, 18));
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
            this.f61560c.setTransform(new Matrix());
            if (y() != this.B0) {
                a aVar = new a(this, 1);
                Handler handler = this.f61589n;
                if (handler != null) {
                    handler.post(aVar);
                }
            }
        }
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: zi.l.f():void");
    }

    public final void g(j jVar) {
        this.f61591o = jVar.f61536a;
        this.G = jVar.f61537b;
        this.f61594p = jVar.f61538c;
        this.f61597q = jVar.d;
        this.f61600r = jVar.f61539e;
        this.H = jVar.f61540f;
        this.I = jVar.f61541g;
        this.J = jVar.h;
        this.K = jVar.f61542i;
        this.N = jVar.f61543j;
        this.f61561c0 = false;
        N();
    }

    public final void j() {
        Handler handler = this.f61589n;
        if (handler != null) {
            handler.removeCallbacks(this.f61584k1);
        }
        this.f61613x = null;
    }

    public final j k() {
        return new j(this.f61591o, this.G, this.f61594p, this.f61597q, this.f61600r, this.H, this.I, this.J, this.K, this.N);
    }

    public final void n() {
        j();
        this.V = false;
        this.f61605s1 = 1;
        this.f61609u0 = null;
        this.f61610v0 = null;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.B = null;
        this.P = false;
        this.f61598q0 = null;
        o();
        q();
        this.f61615y = null;
        this.f61592o0 = null;
        this.f61595p0 = null;
        if (!this.f61601r0.isEmpty()) {
            this.f61618z0 = SystemClock.elapsedRealtimeNanos();
            this.f61579j.b("closing camera devices: count=" + this.f61601r0.size());
            ArrayList arrayList = new ArrayList(this.f61601r0);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                p((CameraDevice) obj, 1);
            }
        }
        u uVar = this.v;
        if (uVar != null) {
            uVar.l();
            this.v = null;
        }
        Surface surface = this.f61603s;
        if (surface != null) {
            surface.release();
            this.f61603s = null;
        }
        this.f61606t = null;
        this.f61608u = null;
        this.f61583k0 = false;
        this.f61586l0 = false;
        this.m0 = false;
        this.f61590n0 = false;
    }

    public final void o() {
        CameraCaptureSession cameraCaptureSession = this.f61617z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f61617z = null;
        }
        this.B = null;
    }

    public final void p(CameraDevice cameraDevice, int i7) {
        ArrayList arrayList = this.f61604s0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i7 != 1) {
            this.f61605s1 = i7;
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
        this.f61598q0 = null;
        if (this.f61577i0) {
            str = ", reason=standby session not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f61579j.b("camera switch path: sequential".concat(str));
        o();
        CameraDevice cameraDevice = this.f61615y;
        if (cameraDevice != null) {
            this.f61615y = null;
            this.f61618z0 = SystemClock.elapsedRealtimeNanos();
            p(cameraDevice, 2);
        } else if (this.f61609u0 != null) {
        } else {
            this.V = false;
            G();
        }
    }

    public final void t() {
        CameraDevice cameraDevice = this.f61615y;
        if (cameraDevice != null && this.f61603s != null && this.f61606t != null) {
            try {
                this.E0 = SystemClock.elapsedRealtimeNanos();
                p pVar = this.f61579j;
                pVar.b("capture session requested: recording=" + this.f61597q + ", fpsRange=" + this.J);
                cameraDevice.createCaptureSession(Arrays.asList(this.f61606t), this.f61599q1, this.f61589n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                if (this.I == q0.FPS_60) {
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
        j jVar;
        Surface surface3;
        y yVar = this.D;
        long j3 = this.L;
        int i7 = this.f61565e;
        int i10 = this.f61568f;
        int i11 = this.f61569f0;
        if (i11 <= 0) {
            i11 = this.I.f61676a;
        }
        int i12 = i11;
        p pVar = this.f61579j;
        u7.i iVar = this.f61582k;
        Objects.requireNonNull(iVar);
        c cVar = new c(iVar, 0);
        u7.i iVar2 = this.f61582k;
        Objects.requireNonNull(iVar2);
        o oVar = new o(yVar, j3, i7, i10, i12, pVar, cVar, new c(iVar2, 1));
        this.f61611w = oVar;
        synchronized (oVar) {
            if (oVar.D) {
                surface = oVar.f61657q;
            } else {
                oVar.q();
                long nanoTime = System.nanoTime();
                try {
                    oVar.b();
                    oVar.a();
                    oVar.f61654n.start();
                    oVar.D = true;
                    oVar.f61647f.b("codecs prepared: video=" + oVar.f61654n.getName() + ", audio=" + oVar.f61655o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = oVar.f61657q;
                } catch (IOException | RuntimeException e10) {
                    oVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.f61597q;
        Surface surface5 = this.f61603s;
        boolean z11 = this.f61583k0;
        int i13 = this.f61565e;
        int i14 = this.f61600r;
        boolean D = D(this.f61594p);
        boolean z12 = this.f61576i;
        p pVar2 = this.f61579j;
        o oVar2 = this.f61611w;
        u7.i iVar3 = this.f61582k;
        Objects.requireNonNull(iVar3);
        u uVar = new u(size, surface4, surface5, z11, i13, i14, D, z12, pVar2, oVar2, new c(iVar3, 2));
        this.v = uVar;
        uVar.f61729u0 = new a(this, 3);
        int y10 = y();
        this.B0 = y10;
        u uVar2 = this.v;
        uVar2.f61725s0 = y10;
        Handler handler = uVar2.f61728u;
        if (uVar2.f61723r0 && handler != null) {
            handler.post(new nb1(uVar2, y10, 14));
        }
        u uVar3 = this.v;
        if (uVar3.f61723r0) {
            surface2 = uVar3.f61731w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            uVar3.f61726t = handlerThread;
            handlerThread.start();
            uVar3.f61721q0 = System.nanoTime();
            p pVar3 = uVar3.f61705i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(uVar3.f61691a);
            sb2.append(", crop=");
            sb2.append(uVar3.f61707j);
            sb2.append(", output=");
            sb2.append(uVar3.f61702g);
            sb2.append("x");
            sb2.append(uVar3.f61702g);
            sb2.append(", filter=");
            if (uVar3.f61707j == uVar3.f61702g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(uVar3.h);
            sb2.append(", dualInput=");
            sb2.append(uVar3.f61700f);
            sb2.append(", glPreview=");
            if (uVar3.f61698e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            pVar3.b(sb2.toString());
            Handler handler2 = new Handler(uVar3.f61726t.getLooper());
            uVar3.f61728u = handler2;
            handler2.post(new e(1, uVar3, countDownLatch));
            try {
                countDownLatch.await();
                if (uVar3.f61734x0 == null) {
                    surface2 = uVar3.f61731w;
                } else {
                    RuntimeException runtimeException = uVar3.f61734x0;
                    uVar3.f61734x0 = null;
                    uVar3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                uVar3.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.f61606t = surface2;
        if (this.f61583k0) {
            n0 n0Var2 = this.G;
            n0 n0Var3 = n0.f61636a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f61637b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                jVar = this.f61572g0;
            } else {
                jVar = this.f61574h0;
            }
            if (jVar != null) {
                u uVar4 = this.v;
                Size size2 = jVar.d;
                int i15 = jVar.f61539e;
                boolean D2 = D(jVar.f61538c);
                Handler handler3 = uVar4.f61728u;
                if (uVar4.f61723r0 && uVar4.f61700f && handler3 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler3.post(new s(uVar4, size2, i15, D2, runtimeExceptionArr, countDownLatch2, 0));
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
                u uVar5 = this.v;
                if (uVar5.f61700f && (surface3 = uVar5.f61735y) != null) {
                    this.f61608u = surface3;
                    return;
                }
                throw new IllegalStateException("Secondary GL camera surface is unavailable");
            }
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        this.f61608u = null;
    }

    public final void v() {
        try {
            u();
        } catch (IOException | RuntimeException e10) {
            if (this.f61583k0) {
                this.f61579j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
                u uVar = this.v;
                if (uVar != null) {
                    uVar.l();
                    this.v = null;
                }
                o oVar = this.f61611w;
                if (oVar != null) {
                    oVar.u();
                    this.f61611w = null;
                }
                this.f61606t = null;
                this.f61608u = null;
                this.f61583k0 = false;
                this.f61577i0 = false;
                this.f61580j0 = true;
                u();
                return;
            }
            throw e10;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder w(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, zi.j r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: zi.l.w(android.hardware.camera2.CameraDevice, android.view.Surface, zi.j, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void x(String str, Exception exc) {
        String str2;
        this.f61580j0 = true;
        this.f61577i0 = false;
        this.f61583k0 = false;
        StringBuilder sb2 = new StringBuilder("camera dual-active disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f61579j.b(sb2.toString());
        q();
        CameraDevice cameraDevice = this.f61592o0;
        this.f61592o0 = null;
        this.f61595p0 = null;
        this.f61610v0 = null;
        if (cameraDevice != null && cameraDevice != this.f61615y) {
            p(cameraDevice, 1);
        }
    }

    public final int y() {
        Display display = this.f61560c.getDisplay();
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
