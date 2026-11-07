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
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Wallet.h2;
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
    public y E;
    public long E0;
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
    public final Context f57905a;
    public volatile boolean f57906a0;
    public long f57907a1;
    public final CameraManager f57908b;
    public boolean f57909b0;
    public long f57910b1;
    public final TextureView f57911c;
    public boolean f57912c0;
    public double f57913c1;
    public final s0 d;
    public boolean f57914d0;
    public long f57915d1;
    public final int f57916e;
    public boolean f57917e0;
    public long f57918e1;
    public final int f57919f;
    public boolean f57920f0;
    public long f57921f1;
    public final o0 f57922g;
    public int f57923g0;
    public long f57924g1;
    public final p0 h;
    public i f57925h0;
    public long f57926h1;
    public final boolean f57927i;
    public i f57928i0;
    public long f57929i1;
    public final o f57930j;
    public boolean f57931j0;
    public long f57932j1;
    public final qt f57933k;
    public boolean f57934k0;
    public final n3 f57935k1;
    public boolean f57937l0;
    public final a l1;
    public HandlerThread f57938m;
    public boolean m0;
    public final a f57939m1;
    public Handler f57940n;
    public boolean f57941n0;
    public final w30 n1;
    public String f57942o;
    public boolean f57943o0;
    public final e f57944o1;
    public CameraCharacteristics f57945p;
    public CameraDevice f57946p0;
    public final e f57947p1;
    public Size f57948q;
    public i f57949q0;
    public final f f57950q1;
    public volatile Size f57951r;
    public n0 f57952r0;
    public final f f57953r1;
    public volatile int f57954s;
    public final g f57956s1;
    public Surface f57957t;
    public Surface f57960u;
    public volatile boolean f57961u0;
    public Surface v;
    public j f57962v0;
    public u f57963w;
    public j f57964w0;
    public n f57965x;
    public int f57966x0;
    public n f57967y;
    public HandlerThread f57968y0;
    public CameraDevice f57969z;
    public long f57970z0;
    public final Rect f57936l = new Rect();
    public float O = 1.0f;
    public final ArrayList f57955s0 = new ArrayList();
    public final ArrayList f57958t0 = new ArrayList();
    public int f57959t1 = 1;

    public k(Context context, TextureView textureView, s0 s0Var, int i7, o0 o0Var, p0 p0Var, boolean z9, o oVar, qt qtVar) {
        n3 n3Var = new n3(this, 2);
        this.f57935k1 = n3Var;
        this.l1 = new a(this, 5);
        this.f57939m1 = new a(this, 6);
        this.n1 = new w30(this, 4);
        this.f57944o1 = new e(this, 0);
        this.f57947p1 = new e(this, 1);
        this.f57950q1 = new f(this, 0);
        this.f57953r1 = new f(this, 1);
        this.f57956s1 = new g(this);
        this.f57905a = context.getApplicationContext();
        this.f57908b = (CameraManager) context.getSystemService("camera");
        this.f57911c = textureView;
        this.d = s0Var;
        this.f57916e = s0Var.f58048a;
        this.f57919f = i7;
        this.f57922g = o0Var;
        this.h = p0Var;
        this.f57927i = z9;
        this.f57930j = oVar;
        this.f57933k = qtVar;
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
        CameraDevice cameraDevice = kVar.f57969z;
        CameraDevice cameraDevice2 = kVar.f57946p0;
        if (kVar.f57937l0 && cameraDevice != null && cameraDevice2 != null && kVar.f57960u != null && kVar.v != null && kVar.A == null && kVar.B == null) {
            kVar.m0 = false;
            kVar.f57941n0 = false;
            try {
                kVar.F0 = SystemClock.elapsedRealtimeNanos();
                o oVar = kVar.f57930j;
                oVar.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + kVar.f57951r + ", fpsRange=" + kVar.K);
                cameraDevice.createCaptureSession(Arrays.asList(kVar.f57960u), kVar.f57953r1, kVar.f57940n);
                cameraDevice2.createCaptureSession(Arrays.asList(kVar.v), kVar.f57950q1, kVar.f57940n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                kVar.B("session request failed", e10, false);
            }
        }
    }

    public static void b(k kVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z9;
        int i7 = 1;
        if (cameraDevice == kVar.f57969z) {
            kVar.p();
            kVar.f57969z = null;
            kVar.q(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException(rf.b.i("Active camera ", str));
            }
            kVar.M(illegalStateException);
            return;
        }
        if (cameraDevice == kVar.f57946p0) {
            kVar.f57946p0 = null;
        }
        if (!kVar.f57937l0) {
            kVar.q(cameraDevice, 1);
            return;
        }
        o oVar = kVar.f57930j;
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
        kVar.f57937l0 = false;
        kVar.f57931j0 = false;
        kVar.f57934k0 = true;
        kVar.f57949q0 = null;
        kVar.r();
        if (kVar.V && kVar.f57969z != null && kVar.A == null && !kVar.W) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (kVar.W && kVar.f57952r0 != null) {
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
        kVar.f57955s0.remove(cameraDevice);
        kVar.f57958t0.remove(cameraDevice);
        if (cameraDevice == kVar.f57969z) {
            kVar.f57969z = null;
        }
        if (cameraDevice == kVar.f57946p0) {
            kVar.f57946p0 = null;
        }
        o oVar = kVar.f57930j;
        StringBuilder sb2 = new StringBuilder("camera device closed: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", owned=");
        sb2.append(kVar.f57955s0.size());
        sb2.append(", closing=");
        sb2.append(kVar.f57958t0.size());
        sb2.append(", afterClose=");
        int i7 = kVar.f57959t1;
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
        if (kVar.f57958t0.isEmpty()) {
            int i10 = kVar.f57959t1;
            kVar.f57959t1 = 1;
            if (kVar.V && !kVar.Z && i10 != 1) {
                int c10 = p1.g.c(i10);
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 == 3) {
                            kVar.f57930j.b("continuing pending switch after DUAL_ACTIVE fallback");
                            kVar.t();
                            return;
                        }
                        return;
                    } else if (kVar.f57969z != null && kVar.A == null) {
                        kVar.f57930j.b("retrying capture session after standby camera closed");
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
        n0 n0Var = kVar.f57952r0;
        if (n0Var != null && kVar.f57937l0 && kVar.m0 && kVar.f57941n0) {
            kVar.f57952r0 = null;
            if (!kVar.a0(n0Var)) {
                kVar.W = false;
                kVar.Z(n0Var);
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

    public static m6.n l(Size[] sizeArr, s0 s0Var, o0 o0Var) {
        int i7;
        m6.n n10;
        o0 o0Var2;
        m6.n n11;
        o0 o0Var3 = o0.f58026c;
        if (o0Var == o0Var3) {
            i7 = s0Var.f58048a;
        } else {
            s0 s0Var2 = s0.P480;
            o0 o0Var4 = o0.f58024a;
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
        m6.n n12 = n(sizeArr, i7, o0Var);
        if (n12 != null) {
            return n12;
        }
        if (s0Var == s0.P360 && o0Var == (o0Var2 = o0.f58025b) && (n11 = n(sizeArr, 480, o0Var2)) != null) {
            return n11;
        }
        int i10 = s0Var.f58048a;
        if (o0Var != o0Var3 && (n10 = n(sizeArr, i10, o0Var3)) != null) {
            return n10;
        }
        int i11 = s0Var.f58048a;
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
        return new m6.n(m(sizeArr, size), size, o0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
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

    public static m6.n n(Size[] sizeArr, int i7, o0 o0Var) {
        int compare;
        m6.n nVar = null;
        for (Size size : sizeArr) {
            int i10 = ((i7 * 15) / 100) + i7;
            int min = Math.min(1920, i7 * 2);
            int U = U(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (U >= i7 && U <= i10 && max <= min) {
                Size m10 = m(sizeArr, size);
                m6.n nVar2 = new m6.n(m10, size, o0Var, i7);
                if (nVar != null) {
                    Size size2 = (Size) nVar.f19918b;
                    int abs = Math.abs(Math.min(m10.getWidth(), m10.getHeight()) - 720);
                    Size size3 = (Size) nVar.f19919c;
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
        if (this.f57937l0) {
            o oVar = this.f57930j;
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
            this.f57937l0 = false;
            this.f57931j0 = false;
            int i10 = 1;
            this.f57934k0 = true;
            this.m0 = false;
            this.f57941n0 = false;
            if (z9 && this.A != null) {
                r();
                CameraDevice cameraDevice = this.f57946p0;
                this.f57946p0 = null;
                this.f57949q0 = null;
                if (this.W && this.f57952r0 != null) {
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
            this.f57934k0 = true;
            this.f57931j0 = false;
            this.f57937l0 = false;
            this.f57952r0 = null;
            p();
            r();
            this.f57969z = null;
            this.f57946p0 = null;
            this.f57949q0 = null;
            this.f57962v0 = null;
            this.f57964w0 = null;
            o oVar2 = this.f57930j;
            StringBuilder u10 = a8.p0.u("camera recovery: reason=", concat, ", target=");
            u10.append(this.F);
            u10.append(", devices=");
            u10.append(this.f57955s0.size());
            u10.append(", switchElapsedMs=");
            u10.append(A(this.G0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            u10.append(str3);
            oVar2.b(u10.toString());
            if (this.f57955s0.isEmpty()) {
                this.W = false;
                if (this.V && !this.Z) {
                    H();
                    return;
                }
                return;
            }
            this.A0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.f57955s0);
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
        n nVar = this.f57965x;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f57914d0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f57914d0 = true;
        this.f57920f0 = true;
        p();
        m6.n nVar2 = this.L;
        if (nVar2 == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = p0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f57945p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.K = D(rangeArr, 30);
        this.f57948q = (Size) nVar2.f19918b;
        this.f57951r = (Size) nVar2.f19919c;
        this.f57954s = nVar2.f19917a;
        this.I = (o0) nVar2.d;
        this.f57925h0 = null;
        this.f57928i0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        u uVar = this.f57963w;
        if (uVar != null) {
            uVar.l();
            this.f57963w = null;
        }
        n nVar3 = this.f57965x;
        if (nVar3 != null) {
            nVar3.u();
            this.f57965x = null;
        }
        this.f57960u = null;
        try {
            v();
            O();
            o oVar = this.f57930j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f57948q);
            sb2.append(", recording=");
            sb2.append(this.f57951r);
            sb2.append(", crop=");
            sb2.append(this.f57954s);
            sb2.append(", fpsRange=");
            sb2.append(this.K);
            oVar.b(sb2.toString());
            Handler handler = this.f57940n;
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
        for (Set<String> set : this.f57908b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean G() {
        CameraCharacteristics cameraCharacteristics;
        if (this.G == n0.f58019b && (cameraCharacteristics = this.f57945p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.V && this.f57962v0 == null && this.f57969z == null) {
            if (f0.d.b(this.f57905a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
            } else if (f0.d.b(this.f57905a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    this.B0 = SystemClock.elapsedRealtimeNanos();
                    R(this.F);
                    long A = A(this.B0);
                    if (this.f57969z == null && this.f57965x == null) {
                        K();
                    }
                    SurfaceTexture surfaceTexture = this.f57911c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        TextureView textureView = this.f57911c;
                        int max = Math.max(1, Math.min(720, Math.min(textureView.getWidth(), textureView.getHeight())));
                        surfaceTexture.setDefaultBufferSize(max, max);
                        if (this.f57957t == null) {
                            this.f57957t = new Surface(surfaceTexture);
                        }
                        if (this.f57965x == null) {
                            w();
                        } else {
                            u uVar = this.f57963w;
                            if (uVar != null) {
                                uVar.n(this.f57951r, this.f57954s, E(this.f57945p));
                                Surface surface = null;
                                if (!this.f57937l0 && this.f57943o0) {
                                    this.f57943o0 = false;
                                    u uVar2 = this.f57963w;
                                    Handler handler = uVar2.f58092u;
                                    if (uVar2.f58087r0 && handler != null) {
                                        handler.post(new g60((Object) uVar2, false, (Object) null, 17));
                                    }
                                }
                                u uVar3 = this.f57963w;
                                Surface surface2 = uVar3.f58095w;
                                if (surface2 != null) {
                                    this.f57960u = surface2;
                                    if (this.f57937l0 && (!uVar3.f58064f || (surface = uVar3.f58099y) == null)) {
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
                        o oVar = this.f57930j;
                        oVar.b("camera open requested: id=" + this.f57942o + ", preview=" + this.f57948q + ", recording=" + this.f57951r + ", crop=" + this.f57954s + ", selectionElapsedMs=" + A + ", dualActive=" + this.f57937l0);
                        I(this.f57942o, false);
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
            eVar = this.f57947p1;
        } else {
            eVar = this.f57944o1;
        }
        j jVar = new j(this, eVar, z9);
        if (z9) {
            this.f57964w0 = jVar;
        } else {
            this.f57962v0 = jVar;
        }
        try {
            this.f57908b.openCamera(str, jVar, this.f57940n);
        } catch (CameraAccessException | RuntimeException e10) {
            jVar.c();
            if (!z9 ? this.f57962v0 == jVar : this.f57964w0 == jVar) {
                if (z9) {
                    this.f57964w0 = null;
                } else {
                    this.f57962v0 = null;
                }
            }
            throw e10;
        }
    }

    public final void J() {
        n0 n0Var;
        i iVar;
        if (this.f57937l0 && !this.f57934k0 && this.f57964w0 == null && this.f57946p0 == null) {
            n0 n0Var2 = this.H;
            n0 n0Var3 = n0.f58018a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f58019b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                iVar = this.f57925h0;
            } else {
                iVar = this.f57928i0;
            }
            if (iVar != null) {
                try {
                    String str = iVar.f57886a;
                    this.f57949q0 = iVar;
                    this.f57970z0 = SystemClock.elapsedRealtimeNanos();
                    o oVar = this.f57930j;
                    oVar.b("warm camera open requested: id=" + str + ", facing=" + iVar.f57887b);
                    I(str, true);
                } catch (Exception e10) {
                    y("standby open request failed", e10);
                }
            }
        }
    }

    public final void K() {
        String str;
        if (this.f57934k0) {
            return;
        }
        if (this.f57931j0) {
            this.f57937l0 = true;
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        o oVar = this.f57930j;
        if (i7 < 30) {
            this.f57934k0 = true;
            oVar.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        i k10 = k();
        p0 p0Var = k10.h;
        String str2 = k10.f57886a;
        n0 n0Var = k10.f57887b;
        n0 n0Var2 = n0.f58018a;
        if (n0Var == n0Var2) {
            n0Var2 = n0.f58019b;
        }
        try {
            try {
                R(n0Var2);
                i k11 = k();
                p0 p0Var2 = k11.h;
                String str3 = k11.f57886a;
                boolean F = F(str2, str3);
                this.f57931j0 = F;
                if (F && p0Var != p0Var2) {
                    this.f57931j0 = false;
                    oVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + k10.f57889e + "/" + k10.f57890f + ", second=" + k11.f57889e + "/" + k11.f57890f + ", firstFps=" + p0Var.f58031a + ", secondFps=" + p0Var2.f58031a);
                }
                boolean z9 = this.f57931j0;
                if (!z9) {
                    this.f57934k0 = true;
                }
                this.f57937l0 = z9;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.f57931j0);
                sb2.append(", pair=");
                sb2.append(str2);
                sb2.append("+");
                sb2.append(str3);
                if (this.f57931j0) {
                    str = "";
                } else {
                    str = ", reason=pair not advertised";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                g(k10);
            } catch (Exception e10) {
                this.f57934k0 = true;
                oVar.b("camera dual-active capability unavailable: " + e10);
                g(k10);
            }
        } catch (Throwable th2) {
            g(k10);
            throw th2;
        }
    }

    public final void L() {
        this.f57961u0 = true;
        this.V = false;
        this.f57911c.setSurfaceTextureListener(null);
        this.f57911c.removeOnLayoutChangeListener(this.f57935k1);
        Handler handler = this.f57940n;
        HandlerThread handlerThread = this.f57938m;
        this.f57940n = null;
        this.f57938m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new ti.p(29, this, handlerThread));
        }
    }

    public final void M(Exception exc) {
        boolean z9;
        n nVar = this.f57965x;
        if (nVar != null) {
            synchronized (nVar) {
                z9 = nVar.E;
            }
            if (z9) {
                this.f57930j.a("camera lost while recording", exc);
                qt qtVar = this.f57933k;
                ((u0) qtVar.f37389b).f58110i.post(new k0(qtVar, exc, 0));
                return;
            }
        }
        N(exc);
    }

    public final void N(Exception exc) {
        this.f57930j.a("camera error", exc);
        qt qtVar = this.f57933k;
        ((u0) qtVar.f37389b).f58110i.post(new k0(qtVar, exc, 1));
    }

    public final void O() {
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.f57907a1 = 0L;
        this.f57910b1 = 0L;
        this.f57913c1 = 0.0d;
        this.f57915d1 = 0L;
        this.f57918e1 = 0L;
        this.f57921f1 = 0L;
        this.f57924g1 = 0L;
        this.f57926h1 = 0L;
        this.f57929i1 = 0L;
        this.f57932j1 = 0L;
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
        o oVar = this.f57930j;
        p0 p0Var = this.h;
        p0 p0Var2 = p0.FPS_30;
        if (p0Var != p0Var2) {
            if (this.f57920f0) {
                rangeArr = rangeArr4;
                i7 = 30;
                nVar2 = nVar;
            } else {
                int i10 = p0Var.f58031a;
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
                        m6.n l10 = l(sizeArr2, this.d, this.f57922g);
                        oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + D + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new hy0(p0.FPS_60, D, l10, 24);
                    } catch (RuntimeException unused) {
                        oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    oVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range D2 = D(rangeArr2, 30);
                oVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + D2);
                return new hy0(p0Var2, D2, nVar, 24);
            }
        } else {
            rangeArr = rangeArr4;
            nVar2 = nVar;
            i7 = 30;
        }
        Range D3 = D(rangeArr, i7);
        StringBuilder u10 = a8.p0.u("fps selection: id=", str, ", requested=");
        u10.append(p0Var.f58031a);
        u10.append(", mode=REGULAR, range=");
        u10.append(D3);
        if (this.f57920f0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        u10.append(str2);
        oVar.b(u10.toString());
        return new hy0(p0Var2, D3, nVar2, 24);
    }

    public final void R(wi.n0 r32) {
        throw new UnsupportedOperationException("Method not decompiled: wi.k.R(wi.n0):void");
    }

    public final void S(boolean z9) {
        Handler handler = this.f57940n;
        if (this.V && handler != null) {
            handler.post(new tp0(16, this, z9));
        }
    }

    public final boolean T(float f10) {
        this.N = Math.max(0.0f, Math.min(1.0f, f10));
        Handler handler = this.f57940n;
        if (this.V && handler != null) {
            handler.removeCallbacks(this.f57939m1);
            handler.post(this.f57939m1);
            return true;
        }
        return false;
    }

    public final void W(y yVar, long j3, n0 n0Var) {
        if (this.f57961u0) {
            this.f57930j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.f57938m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f57938m = handlerThread;
            handlerThread.start();
            this.f57940n = new Handler(this.f57938m.getLooper());
        }
        this.E = yVar;
        this.M = j3;
        this.F = n0Var;
        this.V = true;
        this.Z = false;
        this.f57914d0 = false;
        this.f57967y = null;
        this.f57906a0 = true;
        this.D0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        o oVar = this.f57930j;
        oVar.b("camera segment start: facing=" + n0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f57911c.isAvailable());
        this.f57911c.setSurfaceTextureListener(this.n1);
        Handler handler = this.f57940n;
        if (this.V && handler != null && this.f57911c.isAvailable()) {
            handler.post(new a(this, 8));
        }
    }

    public final boolean X() {
        Handler handler = this.f57940n;
        if (!this.V || this.Z || handler == null) {
            return false;
        }
        this.Z = true;
        this.f57906a0 = false;
        this.f57930j.b("camera segment stop requested");
        handler.post(new a(this, 7));
        return true;
    }

    public final boolean Y(n0 n0Var) {
        int i7;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (n0Var == n0.f58018a) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        CameraManager cameraManager = this.f57908b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i7 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((p0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, l(outputSizes, this.d, this.f57922g)).f46527b) == p0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void Z(n0 n0Var) {
        if (this.V && !this.W && n0Var != this.G) {
            this.W = true;
            this.X = true;
            this.P = false;
            this.Q = false;
            this.N = 0.0f;
            qt qtVar = this.f57933k;
            ((u0) qtVar.f37389b).f58110i.post(new s(1, qtVar, n0Var));
            this.G0 = SystemClock.elapsedRealtimeNanos();
            o oVar = this.f57930j;
            oVar.b("camera device switch started: from=" + this.G + ", to=" + n0Var);
            if (!a0(n0Var)) {
                if (this.f57937l0) {
                    this.f57952r0 = n0Var;
                    this.f57930j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
                    return;
                }
                u uVar = this.f57963w;
                if (uVar != null) {
                    n0 n0Var2 = this.G;
                    Handler handler = uVar.f58092u;
                    if (uVar.f58087r0 && handler != null) {
                        handler.post(new wg.r(uVar, n0Var2, n0Var, handler, 1));
                    }
                }
                t();
            }
        }
    }

    public final boolean a0(n0 n0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        i iVar;
        i iVar2;
        if (!this.f57937l0 || !this.m0 || !this.f57941n0 || (cameraDevice = this.f57969z) == null || (cameraDevice2 = this.f57946p0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (iVar = this.f57949q0) == null || iVar.f57887b != n0Var || this.f57963w == null) {
            return false;
        }
        this.f57969z = cameraDevice2;
        this.f57946p0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.f57960u;
        this.f57960u = this.v;
        this.v = surface;
        if (this.G == n0.f58018a) {
            iVar2 = this.f57925h0;
        } else {
            iVar2 = this.f57928i0;
        }
        this.f57949q0 = iVar2;
        g(iVar);
        this.G = n0Var;
        try {
            try {
                CaptureRequest.Builder x10 = x(this.f57969z, this.f57960u, iVar, true, false);
                try {
                    this.C = x10;
                    this.A.setRepeatingRequest(x10.build(), this.f57956s1, this.f57940n);
                    i iVar3 = this.f57949q0;
                    if (iVar3 != null) {
                        CaptureRequest.Builder x11 = x(this.f57946p0, this.v, iVar3, false, false);
                        this.D = x11;
                        this.B.setRepeatingRequest(x11.build(), this.f57956s1, this.f57940n);
                    }
                    boolean z9 = !this.f57943o0;
                    this.f57943o0 = z9;
                    long j3 = this.G0;
                    u uVar = this.f57963w;
                    b bVar = new b(this, n0Var, j3, 0);
                    Handler handler = uVar.f58092u;
                    if (uVar.f58087r0 && handler != null) {
                        handler.post(new g60(uVar, z9, bVar, 17));
                    }
                    this.m0 = true;
                    this.f57941n0 = true;
                    this.X = false;
                    this.W = false;
                    this.Y = false;
                    O();
                    this.f57930j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.f57969z.getId() + ", standbyId=" + this.f57946p0.getId() + ", input=" + (this.f57943o0 ? 1 : 0) + ", elapsedMs=" + A(this.G0));
                    this.f57911c.post(new a(this, 2));
                    qt qtVar = this.f57933k;
                    ((u0) qtVar.f37389b).f58110i.post(new g60((Object) qtVar, (Object) new h(this.G, this.I, this.J, this.f57948q, this.f57951r, this.O, G()), true, 18));
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
        if (this.f57906a0) {
            this.f57911c.setTransform(new Matrix());
            if (z() != this.C0) {
                a aVar = new a(this, 1);
                Handler handler = this.f57940n;
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
        this.f57942o = iVar.f57886a;
        this.H = iVar.f57887b;
        this.f57945p = iVar.f57888c;
        this.f57948q = iVar.d;
        this.f57951r = iVar.f57889e;
        this.f57954s = iVar.f57890f;
        this.I = iVar.f57891g;
        this.J = iVar.h;
        this.K = iVar.f57892i;
        this.L = iVar.f57893j;
        this.O = iVar.f57894k;
        this.f57914d0 = false;
        O();
    }

    public final void j() {
        Handler handler = this.f57940n;
        if (handler != null) {
            handler.removeCallbacks(this.l1);
        }
        this.f57967y = null;
    }

    public final i k() {
        return new i(this.f57942o, this.H, this.f57945p, this.f57948q, this.f57951r, this.f57954s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void o() {
        j();
        this.W = false;
        this.f57959t1 = 1;
        this.f57962v0 = null;
        this.f57964w0 = null;
        this.f57906a0 = false;
        this.X = false;
        this.Y = false;
        this.C = null;
        this.Q = false;
        this.f57952r0 = null;
        p();
        r();
        this.f57969z = null;
        this.f57946p0 = null;
        this.f57949q0 = null;
        if (!this.f57955s0.isEmpty()) {
            this.A0 = SystemClock.elapsedRealtimeNanos();
            this.f57930j.b("closing camera devices: count=" + this.f57955s0.size());
            ArrayList arrayList = new ArrayList(this.f57955s0);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q((CameraDevice) obj, 1);
            }
        }
        u uVar = this.f57963w;
        if (uVar != null) {
            uVar.l();
            this.f57963w = null;
        }
        Surface surface = this.f57957t;
        if (surface != null) {
            surface.release();
            this.f57957t = null;
        }
        this.f57960u = null;
        this.v = null;
        this.f57937l0 = false;
        this.m0 = false;
        this.f57941n0 = false;
        this.f57943o0 = false;
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
        ArrayList arrayList = this.f57958t0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i7 != 1) {
            this.f57959t1 = i7;
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
        this.f57941n0 = false;
    }

    public final void t() {
        String str;
        this.f57952r0 = null;
        if (this.f57931j0) {
            str = ", reason=standby session not ready";
        } else {
            str = ", reason=concurrent pair unavailable";
        }
        this.f57930j.b("camera switch path: sequential".concat(str));
        p();
        CameraDevice cameraDevice = this.f57969z;
        if (cameraDevice != null) {
            this.f57969z = null;
            this.A0 = SystemClock.elapsedRealtimeNanos();
            q(cameraDevice, 2);
        } else if (this.f57962v0 != null) {
        } else {
            this.W = false;
            H();
        }
    }

    public final void u() {
        CameraDevice cameraDevice = this.f57969z;
        if (cameraDevice != null && this.f57957t != null && this.f57960u != null) {
            try {
                this.F0 = SystemClock.elapsedRealtimeNanos();
                o oVar = this.f57930j;
                oVar.b("capture session requested: preview=" + this.f57948q + ", recording=" + this.f57951r + ", fpsRange=" + this.K);
                cameraDevice.createCaptureSession(Arrays.asList(this.f57960u), this.f57953r1, this.f57940n);
            } catch (CameraAccessException | IllegalArgumentException e10) {
                if (this.J == p0.FPS_60) {
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
        n0 n0Var;
        i iVar;
        Surface surface3;
        y yVar = this.E;
        long j3 = this.M;
        int i7 = this.f57916e;
        int i10 = this.f57919f;
        int i11 = this.f57923g0;
        if (i11 <= 0) {
            i11 = this.J.f58031a;
        }
        int i12 = i11;
        o oVar = this.f57930j;
        qt qtVar = this.f57933k;
        Objects.requireNonNull(qtVar);
        c cVar = new c(qtVar, 0);
        qt qtVar2 = this.f57933k;
        Objects.requireNonNull(qtVar2);
        n nVar = new n(yVar, j3, i7, i10, i12, oVar, cVar, new c(qtVar2, 1));
        this.f57965x = nVar;
        synchronized (nVar) {
            if (nVar.D) {
                surface = nVar.f58009q;
            } else {
                nVar.q();
                long nanoTime = System.nanoTime();
                try {
                    nVar.b();
                    nVar.a();
                    nVar.f58006n.start();
                    nVar.D = true;
                    nVar.f57999f.b("codecs prepared: video=" + nVar.f58006n.getName() + ", audio=" + nVar.f58007o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = nVar.f58009q;
                } catch (IOException | RuntimeException e10) {
                    nVar.n();
                    throw e10;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.f57951r;
        Surface surface5 = this.f57957t;
        boolean z10 = this.f57937l0;
        int i13 = this.f57916e;
        int i14 = this.f57954s;
        boolean E = E(this.f57945p);
        boolean z11 = this.f57927i;
        o oVar2 = this.f57930j;
        n nVar2 = this.f57965x;
        qt qtVar3 = this.f57933k;
        Objects.requireNonNull(qtVar3);
        u uVar = new u(size, surface4, surface5, z10, i13, i14, E, z11, oVar2, nVar2, new c(qtVar3, 2));
        this.f57963w = uVar;
        uVar.f58093u0 = new a(this, 3);
        int z12 = z();
        this.C0 = z12;
        u uVar2 = this.f57963w;
        uVar2.f58089s0 = z12;
        Handler handler = uVar2.f58092u;
        if (uVar2.f58087r0 && handler != null) {
            handler.post(new h2(uVar2, z12, 12));
        }
        u uVar3 = this.f57963w;
        if (uVar3.f58087r0) {
            surface2 = uVar3.f58095w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            uVar3.f58090t = handlerThread;
            handlerThread.start();
            uVar3.f58085q0 = System.nanoTime();
            o oVar3 = uVar3.f58069i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(uVar3.f58055a);
            sb2.append(", crop=");
            sb2.append(uVar3.f58071j);
            sb2.append(", output=");
            sb2.append(uVar3.f58066g);
            sb2.append("x");
            sb2.append(uVar3.f58066g);
            sb2.append(", filter=");
            if (uVar3.f58071j == uVar3.f58066g) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(uVar3.h);
            sb2.append(", dualInput=");
            sb2.append(uVar3.f58064f);
            sb2.append(", glPreview=");
            if (uVar3.f58062e != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            sb2.append(z9);
            oVar3.b(sb2.toString());
            Handler handler2 = new Handler(uVar3.f58090t.getLooper());
            uVar3.f58092u = handler2;
            handler2.post(new s(0, uVar3, countDownLatch));
            try {
                countDownLatch.await();
                if (uVar3.f58098x0 == null) {
                    surface2 = uVar3.f58095w;
                } else {
                    RuntimeException runtimeException = uVar3.f58098x0;
                    uVar3.f58098x0 = null;
                    uVar3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                uVar3.l();
                throw new IllegalStateException("GL initialization was interrupted", e11);
            }
        }
        this.f57960u = surface2;
        if (this.f57937l0) {
            n0 n0Var2 = this.H;
            n0 n0Var3 = n0.f58018a;
            if (n0Var2 == n0Var3) {
                n0Var = n0.f58019b;
            } else {
                n0Var = n0Var3;
            }
            if (n0Var == n0Var3) {
                iVar = this.f57925h0;
            } else {
                iVar = this.f57928i0;
            }
            if (iVar != null) {
                u uVar4 = this.f57963w;
                Size size2 = iVar.f57889e;
                int i15 = iVar.f57890f;
                boolean E2 = E(iVar.f57888c);
                Handler handler3 = uVar4.f58092u;
                if (uVar4.f58087r0 && uVar4.f58064f && handler3 != null) {
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
                    handler3.post(new r(uVar4, size2, i15, E2, runtimeExceptionArr, countDownLatch2, 0));
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
                u uVar5 = this.f57963w;
                if (uVar5.f58064f && (surface3 = uVar5.f58099y) != null) {
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
            if (this.f57937l0) {
                this.f57930j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e10);
                u uVar = this.f57963w;
                if (uVar != null) {
                    uVar.l();
                    this.f57963w = null;
                }
                n nVar = this.f57965x;
                if (nVar != null) {
                    nVar.u();
                    this.f57965x = null;
                }
                this.f57960u = null;
                this.v = null;
                this.f57937l0 = false;
                this.f57931j0 = false;
                this.f57934k0 = true;
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
        this.f57934k0 = true;
        this.f57931j0 = false;
        this.f57937l0 = false;
        StringBuilder sb2 = new StringBuilder("camera dual-active disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.f57930j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.f57946p0;
        this.f57946p0 = null;
        this.f57949q0 = null;
        this.f57964w0 = null;
        if (cameraDevice != null && cameraDevice != this.f57969z) {
            q(cameraDevice, 1);
        }
    }

    public final int z() {
        Display display = this.f57911c.getDisplay();
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
