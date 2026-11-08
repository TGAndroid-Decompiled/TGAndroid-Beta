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
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Wallet.g2;
import org.telegram.ui.g60;
import org.telegram.ui.hy0;
public final class k {
    public CameraCaptureSession A;
    public long A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public int C0;
    public CaptureRequest.Builder D;
    public long D0;
    public x E;
    public long E0;
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
    public double N0;
    public long O0;
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
    public volatile boolean Y;
    public long Y0;
    public volatile boolean Z;
    public long Z0;
    public final Context f58000a;
    public volatile boolean f58001a0;
    public long f58002a1;
    public final CameraManager f58003b;
    public boolean f58004b0;
    public long f58005b1;
    public final TextureView f58006c;
    public boolean f58007c0;
    public double f58008c1;
    public final r0 d;
    public boolean f58009d0;
    public long f58010d1;
    public final int f58011e;
    public boolean f58012e0;
    public long f58013e1;
    public final int f58014f;
    public boolean f58015f0;
    public long f58016f1;
    public final n0 f58017g;
    public int f58018g0;
    public long f58019g1;
    public final o0 h;
    public i f58020h0;
    public long f58021h1;
    public final boolean f58022i;
    public i f58023i0;
    public long f58024i1;
    public final o f58025j;
    public boolean f58026j0;
    public long f58027j1;
    public final rt f58028k;
    public boolean f58029k0;
    public final n3 f58030k1;
    public boolean f58032l0;
    public final a l1;
    public HandlerThread f58033m;
    public boolean m0;
    public final a f58034m1;
    public Handler f58035n;
    public boolean f58036n0;
    public final w30 n1;
    public String f58037o;
    public boolean f58038o0;
    public final e f58039o1;
    public CameraCharacteristics f58040p;
    public CameraDevice f58041p0;
    public final e f58042p1;
    public Size f58043q;
    public i f58044q0;
    public final f f58045q1;
    public volatile Size f58046r;
    public m0 f58047r0;
    public final f f58048r1;
    public volatile int f58049s;
    public final g f58051s1;
    public Surface f58052t;
    public Surface f58055u;
    public volatile boolean f58056u0;
    public Surface v;
    public j f58057v0;
    public t f58058w;
    public j f58059w0;
    public n f58060x;
    public int f58061x0;
    public n f58062y;
    public HandlerThread f58063y0;
    public CameraDevice f58064z;
    public long f58065z0;
    public final Rect f58031l = new Rect();
    public float O = 1.0f;
    public final ArrayList f58050s0 = new ArrayList();
    public final ArrayList f58053t0 = new ArrayList();
    public int f58054t1 = 1;

    public k(Context context, TextureView textureView, r0 r0Var, int i7, n0 n0Var, o0 o0Var, boolean z9, o oVar, rt rtVar) {
        n3 n3Var = new n3(this, 2);
        this.f58030k1 = n3Var;
        this.l1 = new a(this, 5);
        this.f58034m1 = new a(this, 6);
        this.n1 = new w30(this, 4);
        this.f58039o1 = new e(this, 0);
        this.f58042p1 = new e(this, 1);
        this.f58045q1 = new f(this, 0);
        this.f58048r1 = new f(this, 1);
        this.f58051s1 = new g(this);
        this.f58000a = context.getApplicationContext();
        this.f58003b = (CameraManager) context.getSystemService("camera");
        this.f58006c = textureView;
        this.d = r0Var;
        this.f58011e = r0Var.f58137a;
        this.f58014f = i7;
        this.f58017g = n0Var;
        this.h = o0Var;
        this.f58022i = z9;
        this.f58025j = oVar;
        this.f58028k = rtVar;
        textureView.addOnLayoutChangeListener(n3Var);
    }

    public static long A(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range D(Range[] rangeArr, int i7) {
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

    public static boolean E(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static int U(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float V(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d2 = j10;
        double d10 = j3 / d2;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d2) - (d10 * d10))) / 1000000.0d);
    }

    public static void a(k kVar) {
        CameraDevice cameraDevice = kVar.f58064z;
        CameraDevice cameraDevice2 = kVar.f58041p0;
        if (kVar.f58032l0 && cameraDevice != null && cameraDevice2 != null && kVar.f58055u != null && kVar.v != null && kVar.A == null && kVar.B == null) {
            kVar.m0 = false;
            kVar.f58036n0 = false;
            try {
                kVar.F0 = SystemClock.elapsedRealtimeNanos();
                o oVar = kVar.f58025j;
                oVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + kVar.f58046r + ", fpsRange=" + kVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(kVar.f58055u), kVar.f58048r1, kVar.f58035n);
                cameraDevice2.createCaptureSession(Arrays.asList(kVar.v), kVar.f58045q1, kVar.f58035n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                kVar.B("session request failed", e10, false);
            }
        }
    }

    public static void b(k kVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z9;
        int i7 = 1;
        if (cameraDevice == kVar.f58064z) {
            kVar.p();
            kVar.f58064z = null;
            kVar.q(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException(rf.b.i("Active camera ", str));
            }
            kVar.M(illegalStateException);
            return;
        }
        if (cameraDevice == kVar.f58041p0) {
            kVar.f58041p0 = null;
        }
        if (!kVar.f58032l0) {
            kVar.q(cameraDevice, 1);
            return;
        }
        o oVar = kVar.f58025j;
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
        kVar.f58032l0 = false;
        kVar.f58026j0 = false;
        kVar.f58029k0 = true;
        kVar.f58044q0 = null;
        kVar.r();
        if (kVar.V && kVar.f58064z != null && kVar.A == null && !kVar.W) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (kVar.W && kVar.f58047r0 != null) {
            z10 = true;
        }
        if (z9) {
            i7 = 3;
        } else if (z10) {
            i7 = 4;
        }
        kVar.q(cameraDevice, i7);
    }

    public static void c(k kVar, CameraDevice cameraDevice) {
        String str;
        kVar.f58050s0.remove(cameraDevice);
        kVar.f58053t0.remove(cameraDevice);
        if (cameraDevice == kVar.f58064z) {
            kVar.f58064z = null;
        }
        if (cameraDevice == kVar.f58041p0) {
            kVar.f58041p0 = null;
        }
        o oVar = kVar.f58025j;
        StringBuilder sb2 = new StringBuilder("camera device closed: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", owned=");
        sb2.append(kVar.f58050s0.size());
        sb2.append(", closing=");
        sb2.append(kVar.f58053t0.size());
        sb2.append(", afterClose=");
        int i7 = kVar.f58054t1;
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
        sb2.append(A(kVar.A0));
        oVar.b(sb2.toString());
        if (kVar.f58053t0.isEmpty()) {
            int i10 = kVar.f58054t1;
            kVar.f58054t1 = 1;
            if (kVar.V && !kVar.Z && i10 != 1) {
                int c10 = p1.g.c(i10);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            kVar.f58025j.b("continuing pending switch after DUAL_ACTIVE fallback");
                            kVar.t();
                            return;
                        }
                        return;
                    } else if (kVar.f58064z != null && kVar.A == null) {
                        kVar.f58025j.b("retrying capture session after standby camera closed");
                        kVar.u();
                        return;
                    } else {
                        return;
                    }
                }
                kVar.W = false;
                kVar.H();
            }
        }
    }

    public static void d(k kVar) {
        m0 m0Var = kVar.f58047r0;
        if (m0Var != null && kVar.f58032l0 && kVar.m0 && kVar.f58036n0) {
            kVar.f58047r0 = null;
            if (!kVar.a0(m0Var)) {
                kVar.W = false;
                kVar.Z(m0Var);
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

    public static m6.n l(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i7;
        m6.n n10;
        n0 n0Var2;
        m6.n n11;
        n0 n0Var3 = n0.f58115c;
        if (n0Var == n0Var3) {
            i7 = r0Var.f58137a;
        } else {
            r0 r0Var2 = r0.P480;
            n0 n0Var4 = n0.f58113a;
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
        m6.n n12 = n(sizeArr, i7, n0Var);
        if (n12 != null) {
            return n12;
        }
        if (r0Var == r0.P360 && n0Var == (n0Var2 = n0.f58114b) && (n11 = n(sizeArr, 480, n0Var2)) != null) {
            return n11;
        }
        int i10 = r0Var.f58137a;
        if (n0Var != n0Var3 && (n10 = n(sizeArr, i10, n0Var3)) != null) {
            return n10;
        }
        int i11 = r0Var.f58137a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (U(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i11 && (size == null || h(size2) < h(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (U(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && h(size3) < h(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new m6.n(m(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size m(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(U(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(h(size3), h(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static m6.n n(Size[] sizeArr, int i7, n0 n0Var) {
        int compare;
        m6.n nVar = null;
        for (Size size : sizeArr) {
            int i10 = ((i7 * 15) / 100) + i7;
            int min = Math.min(1920, i7 * 2);
            int U = U(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (U >= i7 && U <= i10 && max <= min) {
                Size m10 = m(sizeArr, size);
                m6.n nVar2 = new m6.n(m10, size, n0Var, i7);
                if (nVar != null) {
                    Size size2 = (Size) nVar.f19921b;
                    int abs = Math.abs(Math.min(m10.getWidth(), m10.getHeight()) - 720);
                    Size size3 = (Size) nVar.f19922c;
                    int abs2 = Math.abs(U(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long h = h(size) + h(m10);
                        long h7 = h(size3) + h(size2);
                        if (h != h7) {
                            compare = Long.compare(h, h7);
                        } else {
                            compare = Long.compare(h(size), h(size3));
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

    public final void B(String str, Exception exc, boolean z9) {
        String str2;
        if (this.f58032l0) {
            o oVar = this.f58025j;
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
            this.f58032l0 = false;
            this.f58026j0 = false;
            int i10 = 1;
            this.f58029k0 = true;
            this.m0 = false;
            this.f58036n0 = false;
            if (z9 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f58041p0;
                this.f58041p0 = null;
                this.f58044q0 = null;
                if (this.W && this.f58047r0 != null) {
                    i7 = 1;
                }
                if (cameraDevice != null) {
                    if (i7 != 0) {
                        i10 = 4;
                    }
                    q(cameraDevice, i10);
                    return;
                } else if (i7 != 0) {
                    t();
                    return;
                } else {
                    return;
                }
            }
            String concat = "DUAL_ACTIVE ".concat(str);
            this.f58029k0 = true;
            this.f58026j0 = false;
            this.f58032l0 = false;
            this.f58047r0 = null;
            p();
            r();
            this.f58064z = null;
            this.f58041p0 = null;
            this.f58044q0 = null;
            this.f58057v0 = null;
            this.f58059w0 = null;
            o oVar2 = this.f58025j;
            StringBuilder u10 = a8.p0.u("camera recovery: reason=", concat, ", target=");
            u10.append(this.F);
            u10.append(", devices=");
            u10.append(this.f58050s0.size());
            u10.append(", switchElapsedMs=");
            u10.append(A(this.G0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            u10.append(str3);
            oVar2.b(u10.toString());
            if (this.f58050s0.isEmpty()) {
                this.W = false;
                if (this.V && !this.Z) {
                    H();
                    return;
                }
                return;
            }
            this.A0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.f58050s0);
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q((CameraDevice) obj, 2);
            }
        }
    }

    public final void C(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z9;
        n nVar = this.f58060x;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f58009d0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f58009d0 = true;
        this.f58015f0 = true;
        p();
        m6.n nVar2 = this.L;
        if (nVar2 == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = o0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f58040p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = D(rangeArr, 30);
        this.f58043q = (Size) nVar2.f19921b;
        this.f58046r = (Size) nVar2.f19922c;
        this.f58049s = nVar2.f19920a;
        this.I = (n0) nVar2.d;
        this.f58020h0 = null;
        this.f58023i0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        t tVar = this.f58058w;
        if (tVar != null) {
            tVar.l();
            this.f58058w = null;
        }
        n nVar3 = this.f58060x;
        if (nVar3 != null) {
            nVar3.u();
            this.f58060x = null;
        }
        this.f58055u = null;
        try {
            v();
            O();
            o oVar = this.f58025j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f58043q);
            sb2.append(", recording=");
            sb2.append(this.f58046r);
            sb2.append(", crop=");
            sb2.append(this.f58049s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            oVar.b(sb2.toString());
            Handler handler = this.f58035n;
            if (this.V && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e10) {
            N(e10);
        }
    }

    public final boolean F(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.f58003b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean G() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == m0.f58084b && (cameraCharacteristics = this.f58040p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.V && this.f58057v0 == null && this.f58064z == null) {
            if (f0.d.b(this.f58000a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.d.b(this.f58000a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.B0 = SystemClock.elapsedRealtimeNanos();
                    R(this.F);
                    long A = A(this.B0);
                    if (this.f58064z == null && this.f58060x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f58006c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        TextureView textureView = this.f58006c;
                        int max = Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight())));
                        surfaceTexture.setDefaultBufferSize(max, max);
                        if (this.f58052t == null) {
                            this.f58052t = new Surface(surfaceTexture);
                        }
                        if (this.f58060x == null) {
                            w();
                        } else {
                            t tVar = this.f58058w;
                            if (tVar != null) {
                                tVar.n(this.f58046r, this.f58049s, E(this.f58040p));
                                Surface surface = null;
                                if (!this.f58032l0 && this.f58038o0) {
                                    this.f58038o0 = false;
                                    t tVar2 = this.f58058w;
                                    Handler handler = tVar2.f58181u;
                                    if (tVar2.f58176r0 && handler != null) {
                                        handler.post(new g60((Object) tVar2, false, (Object) null, 17));
                                    }
                                }
                                t tVar3 = this.f58058w;
                                Surface surface2 = tVar3.f58184w;
                                if (surface2 != null) {
                                    this.f58055u = surface2;
                                    if (this.f58032l0 && (!tVar3.f58153f || (surface = tVar3.f58188y) == null)) {
                                        throw new IllegalStateException("Secondary GL camera surface is unavailable");
                                    }
                                    this.v = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        J();
                        this.E0 = SystemClock.elapsedRealtimeNanos();
                        o oVar = this.f58025j;
                        oVar.b("camera open requested: id=" + this.f58037o + ", preview=" + this.f58043q + ", recording=" + this.f58046r + ", crop=" + this.f58049s + ", selectionElapsedMs=" + A + ", dualActive=" + this.f58032l0);
                        I(this.f58037o, false);
                    }
                } catch (Exception e10) {
                    N(e10);
                }
            }
        }
    }

    public final void I(String str, boolean z9) {
        e eVar;
        if (z9) {
            eVar = this.f58042p1;
        } else {
            eVar = this.f58039o1;
        }
        j jVar = new j(this, eVar, z9);
        if (z9) {
            this.f58059w0 = jVar;
        } else {
            this.f58057v0 = jVar;
        }
        try {
            this.f58003b.openCamera(str, jVar, this.f58035n);
        } catch (CameraAccessException | RuntimeException e10) {
            jVar.c();
            if (!z9 ? this.f58057v0 == jVar : this.f58059w0 == jVar) {
                if (z9) {
                    this.f58059w0 = null;
                } else {
                    this.f58057v0 = null;
                }
            }
            throw e10;
        }
    }

    public final void J() {
        m0 m0Var;
        i iVar;
        if (this.f58032l0 && !this.f58029k0 && this.f58059w0 == null && this.f58041p0 == null) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f58083a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f58084b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f58020h0;
            } else {
                iVar = this.f58023i0;
            }
            if (iVar != null) {
                try {
                    String str = iVar.f57981a;
                    this.f58044q0 = iVar;
                    this.f58065z0 = SystemClock.elapsedRealtimeNanos();
                    o oVar = this.f58025j;
                    oVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f57982b);
                    I(str, true);
                } catch (Exception e10) {
                    y("standby open request failed", e10);
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f58029k0) {
            return;
        }
        if (this.f58026j0) {
            this.f58032l0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        o oVar = this.f58025j;
        if (i7 < 30) {
            this.f58029k0 = true;
            oVar.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        i k10 = k();
        o0 o0Var = k10.h;
        String str2 = k10.f57981a;
        m0 m0Var = k10.f57982b;
        m0 m0Var2 = m0.f58083a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.f58084b;
        }
        try {
            try {
                R(m0Var2);
                i k11 = k();
                o0 o0Var2 = k11.h;
                String str3 = k11.f57981a;
                boolean F = F(str2, str3);
                this.f58026j0 = F;
                if (F && o0Var != o0Var2) {
                    this.f58026j0 = false;
                    oVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + k10.f57984e + "/" + k10.f57985f + ", second=" + k11.f57984e + "/" + k11.f57985f + ", firstFps=" + o0Var.f58121a + ", secondFps=" + o0Var2.f58121a);
                }
                boolean z9 = this.f58026j0;
                if (!z9) {
                    this.f58029k0 = true;
                }
                this.f58032l0 = z9;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f58026j0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f58026j0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                g(k10);
            } catch (Exception e10) {
                this.f58029k0 = true;
                oVar.b("camera dual-active capability unavailable: " + e10);
                g(k10);
            }
        } catch (Throwable th2) {
            g(k10);
            throw th2;
        }
    }

    public final void L() {
        this.f58056u0 = true;
        this.V = false;
        this.f58006c.setSurfaceTextureListener(null);
        this.f58006c.removeOnLayoutChangeListener(this.f58030k1);
        Handler handler = this.f58035n;
        HandlerThread handlerThread = this.f58033m;
        this.f58035n = null;
        this.f58033m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new u9.f(24, this, handlerThread));
        }
    }

    public final void M(Exception exc) {
        boolean z9;
        n nVar = this.f58060x;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                this.f58025j.a("camera lost while recording", exc);
                rt rtVar = this.f58028k;
                ((t0) rtVar.f37758b).f58199i.post(new j0(rtVar, exc, 0));
                return;
            }
        }
        N(exc);
    }

    public final void N(Exception exc) {
        this.f58025j.a("camera error", exc);
        rt rtVar = this.f58028k;
        ((t0) rtVar.f37758b).f58199i.post(new j0(rtVar, exc, 1));
    }

    public final void O() {
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f58002a1 = 0L;
        this.f58005b1 = 0L;
        this.f58008c1 = 0.0d;
        this.f58010d1 = 0L;
        this.f58013e1 = 0L;
        this.f58016f1 = 0L;
        this.f58019g1 = 0L;
        this.f58021h1 = 0L;
        this.f58024i1 = 0L;
        this.f58027j1 = 0L;
    }

    public final void P() {
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0.0d;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
    }

    public final hy0 Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, m6.n nVar) {
        Range[] rangeArr;
        m6.n nVar2;
        int i7;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        o oVar = this.f58025j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.FPS_30;
        if (o0Var != o0Var2) {
            if (this.f58015f0) {
                rangeArr = rangeArr4;
                i7 = 30;
                nVar2 = nVar;
            } else {
                int i10 = o0Var.f58121a;
                Range D = D(rangeArr4, i10);
                if (D != null) {
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
                        m6.n l10 = l(sizeArr2, this.d, this.f58017g);
                        oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + D + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new hy0(o0.FPS_60, D, l10, 24);
                    } catch (RuntimeException unused) {
                        oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range D2 = D(rangeArr2, 30);
                oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + D2);
                return new hy0(o0Var2, D2, nVar, 24);
            }
        } else {
            rangeArr = rangeArr4;
            nVar2 = nVar;
            i7 = 30;
        }
        Range D3 = D(rangeArr, i7);
        StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
        u10.append(o0Var.f58121a);
        u10.append(", mode=REGULAR, range=");
        u10.append(D3);
        if (this.f58015f0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        oVar.b(u10.toString());
        return new hy0(o0Var2, D3, nVar2, 24);
    }

    public final void R(wi.m0 r32) {
        throw new UnsupportedOperationException("Method not decompiled: wi.k.R(wi.m0):void");
    }

    public final void S(boolean z9) {
        Handler handler = this.f58035n;
        if (this.V && handler != null) {
            handler.post(new tp0(16, this, z9));
        }
    }

    public final boolean T(float f10) {
        this.N = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.f58035n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f58034m1);
            handler.post(this.f58034m1);
            return true;
        }
        return false;
    }

    public final void W(x xVar, long j3, m0 m0Var) {
        if (this.f58056u0) {
            this.f58025j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.f58033m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f58033m = handlerThread;
            handlerThread.start();
            this.f58035n = new Handler(this.f58033m.getLooper());
        }
        this.E = xVar;
        this.M = j3;
        this.F = m0Var;
        this.V = true;
        this.Z = false;
        this.f58009d0 = false;
        this.f58062y = null;
        this.f58001a0 = true;
        this.D0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        o oVar = this.f58025j;
        oVar.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f58006c.isAvailable());
        this.f58006c.setSurfaceTextureListener(this.n1);
        Handler handler = this.f58035n;
        if (this.V && handler != null && this.f58006c.isAvailable()) {
            handler.post(new a(this, 8));
        }
    }

    public final boolean X() {
        Handler handler = this.f58035n;
        if (!this.V || this.Z || handler == null) {
            return false;
        }
        this.Z = true;
        this.f58001a0 = false;
        this.f58025j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean Y(m0 m0Var) {
        int i7;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (m0Var == m0.f58083a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        CameraManager cameraManager = this.f58003b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, l(outputSizes, this.d, this.f58017g)).f46526b) == o0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void Z(m0 m0Var) {
        if (this.V && !this.W && m0Var != this.G) {
            this.W = true;
            this.X = true;
            this.P = false;
            this.Q = false;
            this.N = 0.0f;
            rt rtVar = this.f58028k;
            ((t0) rtVar.f37758b).f58199i.post(new u9.f(26, rtVar, m0Var));
            this.G0 = SystemClock.elapsedRealtimeNanos();
            o oVar = this.f58025j;
            oVar.b("camera device switch started: from=" + this.G + ", to=" + m0Var);
            if (!a0(m0Var)) {
                if (this.f58032l0) {
                    this.f58047r0 = m0Var;
                    this.f58025j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
                    return;
                }
                t tVar = this.f58058w;
                if (tVar != null) {
                    m0 m0Var2 = this.G;
                    Handler handler = tVar.f58181u;
                    if (tVar.f58176r0 && handler != null) {
                        handler.post(new wg.r(tVar, m0Var2, m0Var, handler, 1));
                    }
                }
                t();
            }
        }
    }

    public final boolean a0(m0 m0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        if (!this.f58032l0 || !this.m0 || !this.f58036n0 || (cameraDevice = this.f58064z) == null || (cameraDevice2 = this.f58041p0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f58044q0) == null || iVar.f57982b != m0Var || this.f58058w == null) {
            return false;
        }
        this.f58064z = cameraDevice2;
        this.f58041p0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f58055u;
        this.f58055u = this.v;
        this.v = surface;
        if (this.G == m0.f58083a) {
            iVar2 = this.f58020h0;
        } else {
            iVar2 = this.f58023i0;
        }
        this.f58044q0 = iVar2;
        g(iVar);
        this.G = m0Var;
        try {
            try {
                CaptureRequest.Builder x10 = x(this.f58064z, this.f58055u, iVar, true, false);
                try {
                    this.C = x10;
                    this.A.setRepeatingRequest(x10.build(), this.f58051s1, this.f58035n);
                    i iVar3 = this.f58044q0;
                    if (iVar3 != null) {
                        CaptureRequest.Builder x11 = x(this.f58041p0, this.v, iVar3, false, false);
                        this.D = x11;
                        this.B.setRepeatingRequest(x11.build(), this.f58051s1, this.f58035n);
                    }
                    boolean z9 = !this.f58038o0;
                    this.f58038o0 = z9;
                    long j3 = this.G0;
                    t tVar = this.f58058w;
                    b bVar = new b(this, m0Var, j3, 0);
                    Handler handler = tVar.f58181u;
                    if (tVar.f58176r0 && handler != null) {
                        handler.post(new g60(tVar, z9, bVar, 17));
                    }
                    this.m0 = true;
                    this.f58036n0 = true;
                    this.X = false;
                    this.W = false;
                    this.Y = false;
                    O();
                    this.f58025j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f58064z.getId() + ", standbyId=" + this.f58041p0.getId() + ", input=" + (this.f58038o0 ? 1 : 0) + ", elapsedMs=" + A(this.G0));
                    this.f58006c.post(new a(this, 2));
                    rt rtVar = this.f58028k;
                    ((t0) rtVar.f37758b).f58199i.post(new g60((Object) rtVar, (Object) new h(this.G, this.I, this.J, this.f58043q, this.f58046r, this.O, G()), true, 18));
                    return true;
                } catch (CameraAccessException e10) {
                    e = e10;
                    B("role switch request failed", e, false);
                    return true;
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    B("role switch request failed", e, false);
                    return true;
                } catch (IllegalStateException e12) {
                    e = e12;
                    B("role switch request failed", e, false);
                    return true;
                }
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e13) {
                e = e13;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e14) {
            e = e14;
        }
    }

    public final void b0() {
        if (this.f58001a0) {
            this.f58006c.setTransform(new Matrix());
            if (z() != this.C0) {
                a aVar = new a(this, 1);
                Handler handler = this.f58035n;
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
        this.f58037o = iVar.f57981a;
        this.H = iVar.f57982b;
        this.f58040p = iVar.f57983c;
        this.f58043q = iVar.d;
        this.f58046r = iVar.f57984e;
        this.f58049s = iVar.f57985f;
        this.I = iVar.f57986g;
        this.J = iVar.h;
        this.K = iVar.f57987i;
        this.L = iVar.f57988j;
        this.O = iVar.f57989k;
        this.f58009d0 = false;
        O();
    }

    public final void j() {
        Handler handler = this.f58035n;
        if (handler != null) {
            handler.removeCallbacks(this.l1);
        }
        this.f58062y = null;
    }

    public final i k() {
        return new i(this.f58037o, this.H, this.f58040p, this.f58043q, this.f58046r, this.f58049s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void o() {
        j();
        this.W = false;
        this.f58054t1 = 1;
        this.f58057v0 = null;
        this.f58059w0 = null;
        this.f58001a0 = false;
        this.X = false;
        this.Y = false;
        this.C = null;
        this.Q = false;
        this.f58047r0 = null;
        p();
        r();
        this.f58064z = null;
        this.f58041p0 = null;
        this.f58044q0 = null;
        if (!this.f58050s0.isEmpty()) {
            this.A0 = SystemClock.elapsedRealtimeNanos();
            this.f58025j.b("closing camera devices: count=" + this.f58050s0.size());
            ArrayList arrayList = new ArrayList(this.f58050s0);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q((CameraDevice) obj, 1);
            }
        }
        t tVar = this.f58058w;
        if (tVar != null) {
            tVar.l();
            this.f58058w = null;
        }
        Surface surface = this.f58052t;
        if (surface != null) {
            surface.release();
            this.f58052t = null;
        }
        this.f58055u = null;
        this.v = null;
        this.f58032l0 = false;
        this.m0 = false;
        this.f58036n0 = false;
        this.f58038o0 = false;
    }

    public final void p() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
    }

    public final void q(CameraDevice cameraDevice, int i7) {
        ArrayList arrayList = this.f58053t0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i7 != 1) {
            this.f58054t1 = i7;
        }
        cameraDevice.close();
    }

    public final void r() {
        CameraCaptureSession cameraCaptureSession = this.B;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.B = null;
        }
        this.D = null;
        this.f58036n0 = false;
    }

    public final void t() {
        String str;
        this.f58047r0 = null;
        if (this.f58026j0) {
            str = ", reason=standby session not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f58025j.b("camera switch path: sequential".concat(str));
        p();
        CameraDevice cameraDevice = this.f58064z;
        if (cameraDevice != null) {
            this.f58064z = null;
            this.A0 = SystemClock.elapsedRealtimeNanos();
            q(cameraDevice, 2);
        } else if (this.f58057v0 != null) {
        } else {
            this.W = false;
            H();
        }
    }

    public final void u() {
        CameraDevice cameraDevice = this.f58064z;
        if (cameraDevice != null && this.f58052t != null && this.f58055u != null) {
            try {
                this.F0 = SystemClock.elapsedRealtimeNanos();
                o oVar = this.f58025j;
                oVar.b("capture session requested: preview=" + this.f58043q + ", recording=" + this.f58046r + ", fpsRange=" + this.K);
                cameraDevice.createCaptureSession(Arrays.asList(this.f58055u), this.f58048r1, this.f58035n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                if (this.J == o0.FPS_60) {
                    C("60 fps session creation rejected", e10);
                } else {
                    N(e10);
                }
            }
        }
    }

    public final void v() {
        Surface surface;
        String str;
        boolean z9;
        Surface surface2;
        m0 m0Var;
        i iVar;
        Surface surface3;
        x xVar = this.E;
        long j3 = this.M;
        int i7 = this.f58011e;
        int i10 = this.f58014f;
        int i11 = this.f58018g0;
        if (i11 <= 0) {
            i11 = this.J.f58121a;
        }
        int i12 = i11;
        o oVar = this.f58025j;
        rt rtVar = this.f58028k;
        Objects.requireNonNull(rtVar);
        c cVar = new c(rtVar, 0);
        rt rtVar2 = this.f58028k;
        Objects.requireNonNull(rtVar2);
        n nVar = new n(xVar, j3, i7, i10, i12, oVar, cVar, new c(rtVar2, 1));
        this.f58060x = nVar;
        synchronized (nVar) {
            if (nVar.D) {
                surface = nVar.f58104q;
            } else {
                nVar.q();
                long nanoTime = System.nanoTime();
                try {
                    nVar.b();
                    nVar.a();
                    nVar.f58101n.start();
                    nVar.D = true;
                    nVar.f58094f.b("codecs prepared: video=" + nVar.f58101n.getName() + ", audio=" + nVar.f58102o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = nVar.f58104q;
                } catch (IOException | RuntimeException e10) {
                    nVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.f58046r;
        Surface surface5 = this.f58052t;
        boolean z10 = this.f58032l0;
        int i13 = this.f58011e;
        int i14 = this.f58049s;
        boolean E = E(this.f58040p);
        boolean z11 = this.f58022i;
        o oVar2 = this.f58025j;
        n nVar2 = this.f58060x;
        rt rtVar3 = this.f58028k;
        Objects.requireNonNull(rtVar3);
        t tVar = new t(size, surface4, surface5, z10, i13, i14, E, z11, oVar2, nVar2, new c(rtVar3, 2));
        this.f58058w = tVar;
        tVar.f58182u0 = new a(this, 3);
        int z12 = z();
        this.C0 = z12;
        t tVar2 = this.f58058w;
        tVar2.f58178s0 = z12;
        Handler handler = tVar2.f58181u;
        if (tVar2.f58176r0 && handler != null) {
            handler.post(new g2(tVar2, z12, 11));
        }
        t tVar3 = this.f58058w;
        if (tVar3.f58176r0) {
            surface2 = tVar3.f58184w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            tVar3.f58179t = handlerThread;
            handlerThread.start();
            tVar3.f58174q0 = System.nanoTime();
            o oVar3 = tVar3.f58158i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(tVar3.f58144a);
            sb2.append(", crop=");
            sb2.append(tVar3.f58160j);
            sb2.append(", output=");
            sb2.append(tVar3.f58155g);
            sb2.append("x");
            sb2.append(tVar3.f58155g);
            sb2.append(", filter=");
            if (tVar3.f58160j == tVar3.f58155g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(tVar3.h);
            sb2.append(", dualInput=");
            sb2.append(tVar3.f58153f);
            sb2.append(", glPreview=");
            if (tVar3.f58151e != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            sb2.append(z9);
            oVar3.b(sb2.toString());
            Handler handler2 = new Handler(tVar3.f58179t.getLooper());
            tVar3.f58181u = handler2;
            handler2.post(new u9.f(25, tVar3, countDownLatch));
            try {
                countDownLatch.await();
                if (tVar3.f58187x0 == null) {
                    surface2 = tVar3.f58184w;
                } else {
                    RuntimeException runtimeException = tVar3.f58187x0;
                    tVar3.f58187x0 = null;
                    tVar3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                tVar3.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.f58055u = surface2;
        if (this.f58032l0) {
            m0 m0Var2 = this.H;
            m0 m0Var3 = m0.f58083a;
            if (m0Var2 == m0Var3) {
                m0Var = m0.f58084b;
            } else {
                m0Var = m0Var3;
            }
            if (m0Var == m0Var3) {
                iVar = this.f58020h0;
            } else {
                iVar = this.f58023i0;
            }
            if (iVar != null) {
                t tVar4 = this.f58058w;
                Size size2 = iVar.f57984e;
                int i15 = iVar.f57985f;
                boolean E2 = E(iVar.f57983c);
                Handler handler3 = tVar4.f58181u;
                if (tVar4.f58176r0 && tVar4.f58153f && handler3 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler3.post(new r(tVar4, size2, i15, E2, runtimeExceptionArr, countDownLatch2, 0));
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
                t tVar5 = this.f58058w;
                if (tVar5.f58153f && (surface3 = tVar5.f58188y) != null) {
                    this.v = surface3;
                    return;
                }
                throw new IllegalStateException("Secondary GL camera surface is unavailable");
            }
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        this.v = null;
    }

    public final void w() {
        try {
            v();
        } catch (IOException | RuntimeException e10) {
            if (this.f58032l0) {
                this.f58025j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
                t tVar = this.f58058w;
                if (tVar != null) {
                    tVar.l();
                    this.f58058w = null;
                }
                n nVar = this.f58060x;
                if (nVar != null) {
                    nVar.u();
                    this.f58060x = null;
                }
                this.f58055u = null;
                this.v = null;
                this.f58032l0 = false;
                this.f58026j0 = false;
                this.f58029k0 = true;
                v();
                return;
            }
            throw e10;
        }
    }

    public final android.hardware.camera2.CaptureRequest.Builder x(android.hardware.camera2.CameraDevice r7, android.view.Surface r8, wi.i r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: wi.k.x(android.hardware.camera2.CameraDevice, android.view.Surface, wi.i, boolean, boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.f58029k0 = true;
        this.f58026j0 = false;
        this.f58032l0 = false;
        StringBuilder sb2 = new StringBuilder("camera dual-active disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f58025j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f58041p0;
        this.f58041p0 = null;
        this.f58044q0 = null;
        this.f58059w0 = null;
        if (cameraDevice != null && cameraDevice != this.f58064z) {
            q(cameraDevice, 1);
        }
    }

    public final int z() {
        Display display = this.f58006c.getDisplay();
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
