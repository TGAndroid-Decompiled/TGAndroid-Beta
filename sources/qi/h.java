package qi;

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
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import ci.e4;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import m.f3;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.js0;
import org.telegram.ui.gs0;
public final class h {
    public CaptureRequest.Builder A;
    public long A0;
    public s B;
    public long B0;
    public volatile i0 C;
    public long C0;
    public i0 D;
    public long D0;
    public i0 E;
    public double E0;
    public j0 F;
    public long F0;
    public k0 G;
    public long G0;
    public Range H;
    public long H0;
    public j6.l I;
    public long I0;
    public long J;
    public long J0;
    public volatile float K;
    public long K0;
    public long L0;
    public boolean M;
    public final e4 M0;
    public boolean N;
    public final a N0;
    public int O;
    public final a O0;
    public int P;
    public final e60 P0;
    public int Q;
    public final d Q0;
    public int R;
    public final e R0;
    public volatile boolean S;
    public final f S0;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final Context f46709a;
    public boolean f46710a0;
    public final CameraManager f46711b;
    public boolean f46712b0;
    public final TextureView f46713c;
    public boolean f46714c0;
    public final n0 d;
    public boolean f46715d0;
    public final int f46716e;
    public boolean f46717e0;
    public final int f46718f;
    public long f46719f0;
    public final j0 f46720g;
    public long f46721g0;
    public final k0 h;
    public long f46722h0;
    public final boolean f46723i;
    public long f46724i0;
    public final l f46725j;
    public long f46726j0;
    public final k2.g0 f46727k;
    public long f46728k0;
    public long f46730l0;
    public HandlerThread f46731m;
    public long m0;
    public Handler f46732n;
    public long f46733n0;
    public String f46734o;
    public long f46735o0;
    public CameraCharacteristics f46736p;
    public double f46737p0;
    public Size f46738q;
    public long f46739q0;
    public volatile Size f46740r;
    public long f46741r0;
    public volatile int f46742s;
    public long f46743s0;
    public Surface f46744t;
    public long f46745t0;
    public Surface f46746u;
    public long f46747u0;
    public p v;
    public long f46748v0;
    public k f46749w;
    public long f46750w0;
    public k f46751x;
    public long f46752x0;
    public CameraDevice f46753y;
    public long f46754y0;
    public CameraCaptureSession f46755z;
    public long f46756z0;
    public final Rect f46729l = new Rect();
    public float L = 1.0f;

    public h(Context context, TextureView textureView, n0 n0Var, int i10, j0 j0Var, k0 k0Var, boolean z10, l lVar, k2.g0 g0Var) {
        e4 e4Var = new e4(this, 2);
        this.M0 = e4Var;
        this.N0 = new a(this, 3);
        this.O0 = new a(this, 4);
        this.P0 = new e60(this, 4);
        this.Q0 = new d(this);
        this.R0 = new e(this);
        this.S0 = new f(this);
        this.f46709a = context.getApplicationContext();
        this.f46711b = (CameraManager) context.getSystemService("camera");
        this.f46713c = textureView;
        this.d = n0Var;
        this.f46716e = n0Var.f46808a;
        this.f46718f = i10;
        this.f46720g = j0Var;
        this.h = k0Var;
        this.f46723i = z10;
        this.f46725j = lVar;
        this.f46727k = g0Var;
        textureView.addOnLayoutChangeListener(e4Var);
    }

    public static int A(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float B(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d10 = j10;
        double d11 = j3 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static long b(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float c(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (((float) j3) / ((float) j10)) / 1000000.0f;
    }

    public static j6.l e(Size[] sizeArr, n0 n0Var, j0 j0Var) {
        int i10;
        j6.l g10;
        j0 j0Var2;
        j6.l g11;
        j0 j0Var3 = j0.f46769c;
        if (j0Var == j0Var3) {
            i10 = n0Var.f46808a;
        } else {
            n0 n0Var2 = n0.P480;
            j0 j0Var4 = j0.f46767a;
            if (n0Var == n0Var2) {
                if (j0Var == j0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (j0Var != j0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l g12 = g(sizeArr, i10, j0Var);
        if (g12 != null) {
            return g12;
        }
        if (n0Var == n0.P360 && j0Var == (j0Var2 = j0.f46768b) && (g11 = g(sizeArr, 480, j0Var2)) != null) {
            return g11;
        }
        int i11 = n0Var.f46808a;
        if (j0Var != j0Var3 && (g10 = g(sizeArr, i11, j0Var3)) != null) {
            return g10;
        }
        int i12 = n0Var.f46808a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (A(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || b(size2) < b(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (A(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && b(size3) < b(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(f(sizeArr, size), size, j0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size f(Size[] sizeArr, Size size) {
        int compare;
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(A(size2) - 720);
                if (abs != abs2) {
                    compare = Integer.compare(abs, abs2);
                } else {
                    compare = Long.compare(b(size3), b(size2));
                }
                if (compare < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l g(Size[] sizeArr, int i10, j0 j0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int A = A(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (A >= i10 && A <= i11 && max <= min) {
                Size f7 = f(sizeArr, size);
                j6.l lVar2 = new j6.l(f7, size, j0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.f14059b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.f14060c;
                    int abs2 = Math.abs(A(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long b10 = b(size) + b(f7);
                        long b11 = b(size3) + b(size2);
                        if (b10 != b11) {
                            compare = Long.compare(b10, b11);
                        } else {
                            compare = Long.compare(b(size), b(size3));
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

    public static long m(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range o(Range[] rangeArr, int i10) {
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

    public final void C(s sVar, long j3, i0 i0Var) {
        if (this.f46731m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.f46731m = handlerThread;
            handlerThread.start();
            this.f46732n = new Handler(this.f46731m.getLooper());
        }
        this.B = sVar;
        this.J = j3;
        this.C = i0Var;
        this.S = true;
        this.Y = false;
        this.f46751x = null;
        this.Z = true;
        this.f46719f0 = SystemClock.elapsedRealtimeNanos();
        v();
        u();
        l lVar = this.f46725j;
        lVar.b("camera segment start: facing=" + i0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.f46713c.isAvailable());
        this.f46713c.setSurfaceTextureListener(this.P0);
        Handler handler = this.f46732n;
        if (this.S && handler != null && this.f46713c.isAvailable()) {
            handler.post(new a(this, 6));
        }
    }

    public final boolean D() {
        Handler handler = this.f46732n;
        if (!this.S || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.f46725j.b("camera segment stop requested");
        handler.post(new a(this, 5));
        return true;
    }

    public final boolean E(i0 i0Var) {
        int i10;
        String[] cameraIdList;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        if (i0Var == i0.f46762a) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        CameraManager cameraManager = this.f46711b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((k0) w(str, cameraCharacteristics, streamConfigurationMap, outputSizes, e(outputSizes, this.d, this.f46720g)).f15423b) == k0.FPS_60) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void F(i0 i0Var) {
        if (this.S && !this.U && i0Var != this.D) {
            this.U = true;
            this.W = true;
            this.M = false;
            this.N = false;
            this.K = 0.0f;
            k2.g0 g0Var = this.f46727k;
            ((p0) g0Var.f14466b).f46859j.post(new p2.b(11, g0Var, i0Var));
            this.f46724i0 = SystemClock.elapsedRealtimeNanos();
            l lVar = this.f46725j;
            lVar.b("camera device switch started: from=" + this.D + ", to=" + i0Var);
            p pVar = this.v;
            if (pVar != null) {
                i0 i0Var2 = this.D;
                Handler handler = pVar.f46839o;
                if (pVar.f46833k0 && handler != null) {
                    handler.post(new gs0(pVar, i0Var2, i0Var, handler, 25));
                }
            }
            i();
            CameraDevice cameraDevice = this.f46753y;
            if (cameraDevice != null) {
                this.f46753y = null;
                cameraDevice.close();
            } else if (!this.T) {
                this.U = false;
                r();
            }
        }
    }

    public final void G() {
        Size size;
        int width;
        int height;
        Integer num;
        if (this.Z && (size = this.f46740r) != null && this.f46713c.getWidth() != 0 && this.f46713c.getHeight() != 0) {
            int min = Math.min(this.f46742s, Math.min(size.getWidth(), size.getHeight()));
            TextureView textureView = this.f46713c;
            boolean z10 = false;
            if (this.f46736p != null && textureView.getDisplay() != null && (num = (Integer) this.f46736p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
            matrix.setScale(f10, f11, this.f46713c.getWidth() * 0.5f, this.f46713c.getHeight() * 0.5f);
            this.f46713c.setTransform(matrix);
            this.f46725j.b("preview transform: view=" + this.f46713c.getWidth() + "x" + this.f46713c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + f10 + "x" + f11);
        }
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: qi.h.a():void");
    }

    public final void d() {
        Handler handler = this.f46732n;
        if (handler != null) {
            handler.removeCallbacks(this.N0);
        }
        this.f46751x = null;
    }

    public final void h() {
        d();
        this.T = false;
        this.U = false;
        this.V = false;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.A = null;
        this.N = false;
        i();
        CameraDevice cameraDevice = this.f46753y;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f46753y = null;
        }
        Surface surface = this.f46744t;
        if (surface != null) {
            surface.release();
            this.f46744t = null;
        }
        p pVar = this.v;
        if (pVar != null) {
            pVar.k();
            this.v = null;
        }
        this.f46746u = null;
    }

    public final void i() {
        CameraCaptureSession cameraCaptureSession = this.f46755z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f46755z = null;
        }
        this.A = null;
    }

    public final void j() {
        CameraDevice cameraDevice = this.f46753y;
        if (cameraDevice != null && this.f46744t != null && this.f46746u != null) {
            try {
                this.f46722h0 = SystemClock.elapsedRealtimeNanos();
                l lVar = this.f46725j;
                lVar.b("capture session requested: preview=" + this.f46738q + ", recording=" + this.f46740r + ", fpsRange=" + this.H);
                cameraDevice.createCaptureSession(Arrays.asList(this.f46744t, this.f46746u), this.R0, this.f46732n);
            } catch (CameraAccessException | IllegalArgumentException e7) {
                if (this.G == k0.FPS_60) {
                    n("60 fps session creation rejected", e7);
                } else {
                    t(e7);
                }
            }
        }
    }

    public final void k() {
        Surface surface;
        String str;
        Surface surface2;
        s sVar = this.B;
        long j3 = this.J;
        int i10 = this.f46716e;
        int i11 = this.f46718f;
        int i12 = this.G.f46795a;
        l lVar = this.f46725j;
        k2.g0 g0Var = this.f46727k;
        Objects.requireNonNull(g0Var);
        k kVar = new k(sVar, j3, i10, i11, i12, lVar, new b(g0Var));
        this.f46749w = kVar;
        synchronized (kVar) {
            if (kVar.f46791y) {
                surface = kVar.f46783p;
            } else {
                kVar.n();
                long nanoTime = System.nanoTime();
                try {
                    kVar.b();
                    kVar.a();
                    kVar.f46780m.start();
                    kVar.f46791y = true;
                    l lVar2 = kVar.f46774f;
                    lVar2.b("codecs prepared: video=" + kVar.f46780m.getName() + ", audio=" + kVar.f46781n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = kVar.f46783p;
                } catch (IOException | RuntimeException e7) {
                    kVar.j();
                    throw e7;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.f46740r;
        int i13 = this.f46716e;
        int i14 = this.f46742s;
        boolean p5 = p();
        boolean z10 = this.f46723i;
        l lVar3 = this.f46725j;
        k kVar2 = this.f46749w;
        k2.g0 g0Var2 = this.f46727k;
        Objects.requireNonNull(g0Var2);
        p pVar = new p(size, surface3, i13, i14, p5, z10, lVar3, kVar2, new b(g0Var2));
        this.v = pVar;
        pVar.m0 = new a(this, 1);
        p pVar2 = this.v;
        if (pVar2.f46833k0) {
            surface2 = pVar2.f46843q;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            pVar2.f46837n = handlerThread;
            handlerThread.start();
            pVar2.f46831j0 = System.nanoTime();
            l lVar4 = pVar2.f46821e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(pVar2.f46814a);
            sb2.append(", crop=");
            sb2.append(pVar2.f46823f);
            sb2.append(", output=");
            sb2.append(pVar2.f46818c);
            sb2.append("x");
            sb2.append(pVar2.f46818c);
            sb2.append(", filter=");
            if (pVar2.f46823f == pVar2.f46818c) {
                str = "NEAREST";
            } else {
                str = "LINEAR";
            }
            sb2.append(str);
            sb2.append(", composition=");
            sb2.append(pVar2.d);
            sb2.append(", dualInput=false, glPreview=");
            sb2.append(false);
            lVar4.b(sb2.toString());
            Handler handler = new Handler(pVar2.f46837n.getLooper());
            pVar2.f46839o = handler;
            handler.post(new p2.b(10, pVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (pVar2.f46840o0 == null) {
                    surface2 = pVar2.f46843q;
                } else {
                    RuntimeException runtimeException = pVar2.f46840o0;
                    pVar2.f46840o0 = null;
                    pVar2.k();
                    throw runtimeException;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                pVar2.k();
                throw new IllegalStateException("GL initialization was interrupted", e10);
            }
        }
        this.f46746u = surface2;
    }

    public final android.hardware.camera2.CaptureRequest.Builder l(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: qi.h.l(boolean):android.hardware.camera2.CaptureRequest$Builder");
    }

    public final void n(String str, Exception exc) {
        Range[] rangeArr;
        String str2;
        boolean z10;
        if (this.f46714c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            t(exc);
            return;
        }
        this.f46714c0 = true;
        i();
        j6.l lVar = this.I;
        if (lVar == null) {
            t(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.G = k0.FPS_30;
        CameraCharacteristics cameraCharacteristics = this.f46736p;
        if (cameraCharacteristics == null) {
            rangeArr = null;
        } else {
            rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        }
        this.H = o(rangeArr, 30);
        this.f46738q = (Size) lVar.f14059b;
        this.f46740r = (Size) lVar.f14060c;
        this.f46742s = lVar.f14058a;
        this.F = (j0) lVar.d;
        SurfaceTexture surfaceTexture = this.f46713c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f46738q.getWidth(), this.f46738q.getHeight());
        }
        k kVar = this.f46749w;
        if (kVar != null) {
            synchronized (kVar) {
                z10 = kVar.f46792z;
            }
            if (z10) {
                t(new IllegalStateException("Unable to change encoder frame rate after recording started", exc));
                return;
            }
        }
        p pVar = this.v;
        if (pVar != null) {
            pVar.k();
            this.v = null;
        }
        k kVar2 = this.f46749w;
        if (kVar2 != null) {
            kVar2.r();
            this.f46749w = null;
        }
        this.f46746u = null;
        try {
            k();
            u();
            l lVar2 = this.f46725j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.f46738q);
            sb2.append(", recording=");
            sb2.append(this.f46740r);
            sb2.append(", crop=");
            sb2.append(this.f46742s);
            sb2.append(", fpsRange=");
            sb2.append(this.H);
            lVar2.b(sb2.toString());
            Handler handler = this.f46732n;
            if (this.S && handler != null) {
                handler.post(new a(this, 0));
            }
        } catch (Exception e7) {
            t(e7);
        }
    }

    public final boolean p() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.f46736p;
        if (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        CameraCharacteristics cameraCharacteristics;
        if (this.D == i0.f46763b && (cameraCharacteristics = this.f46736p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE))) {
            return true;
        }
        return false;
    }

    public final void r() {
        if (this.S && !this.T && this.f46753y == null) {
            if (f0.c.b(this.f46709a, "android.permission.CAMERA") != 0) {
                t(new SecurityException("Camera permission is not granted"));
            } else if (f0.c.b(this.f46709a, "android.permission.RECORD_AUDIO") != 0) {
                t(new SecurityException("Audio recording permission is not granted"));
            } else {
                try {
                    x(this.C);
                    SurfaceTexture surfaceTexture = this.f46713c.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(this.f46738q.getWidth(), this.f46738q.getHeight());
                        if (this.f46744t == null) {
                            this.f46744t = new Surface(surfaceTexture);
                        }
                        if (this.f46749w == null) {
                            k();
                        } else {
                            p pVar = this.v;
                            if (pVar != null) {
                                pVar.m(this.f46740r, this.f46742s, p());
                                Surface surface = this.v.f46843q;
                                if (surface != null) {
                                    this.f46746u = surface;
                                } else {
                                    throw new IllegalStateException("GL processor is not started");
                                }
                            }
                        }
                        this.T = true;
                        this.f46721g0 = SystemClock.elapsedRealtimeNanos();
                        l lVar = this.f46725j;
                        lVar.b("camera open requested: id=" + this.f46734o + ", preview=" + this.f46738q + ", recording=" + this.f46740r + ", crop=" + this.f46742s);
                        this.f46711b.openCamera(this.f46734o, this.Q0, this.f46732n);
                    }
                } catch (Exception e7) {
                    this.T = false;
                    t(e7);
                }
            }
        }
    }

    public final void s() {
        this.S = false;
        this.Y = true;
        this.f46713c.setSurfaceTextureListener(null);
        this.f46713c.removeOnLayoutChangeListener(this.M0);
        Handler handler = this.f46732n;
        HandlerThread handlerThread = this.f46731m;
        if (handler != null) {
            handler.removeCallbacks(this.N0);
        }
        this.f46751x = null;
        this.f46732n = null;
        this.f46731m = null;
        if (handler != null && handlerThread != null) {
            handler.post(new p2.b(9, this, handlerThread));
        }
    }

    public final void t(Exception exc) {
        this.f46725j.a("camera error", exc);
        k2.g0 g0Var = this.f46727k;
        ((p0) g0Var.f14466b).f46859j.post(new p2.b(12, g0Var, exc));
    }

    public final void u() {
        this.f46754y0 = 0L;
        this.f46756z0 = 0L;
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0L;
        this.E0 = 0.0d;
        this.F0 = 0L;
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
    }

    public final void v() {
        this.f46726j0 = 0L;
        this.f46728k0 = 0L;
        this.f46730l0 = 0L;
        this.m0 = 0L;
        this.f46733n0 = 0L;
        this.f46735o0 = 0L;
        this.f46737p0 = 0.0d;
        this.f46739q0 = 0L;
        this.f46741r0 = 0L;
        this.f46743s0 = 0L;
        this.f46745t0 = 0L;
        this.f46747u0 = 0L;
        this.f46748v0 = 0L;
        this.f46750w0 = 0L;
        this.f46752x0 = 0L;
    }

    public final f3 w(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        j6.l lVar2;
        int i10;
        String str2;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        l lVar3 = this.f46725j;
        k0 k0Var = this.h;
        k0 k0Var2 = k0.FPS_30;
        if (k0Var != k0Var2) {
            if (this.f46717e0) {
                rangeArr = rangeArr4;
                i10 = 30;
                lVar2 = lVar;
            } else {
                int i11 = k0Var.f46795a;
                Range o9 = o(rangeArr4, i11);
                if (o9 != null) {
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
                        j6.l e7 = e(sizeArr2, this.d, this.f46720g);
                        lVar3.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + o9 + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new f3(k0.FPS_60, o9, e7, 24);
                    } catch (RuntimeException unused) {
                        lVar3.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    lVar3.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range o10 = o(rangeArr2, 30);
                lVar3.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + o10);
                return new f3(k0Var2, o10, lVar, 24);
            }
        } else {
            rangeArr = rangeArr4;
            lVar2 = lVar;
            i10 = 30;
        }
        Range o11 = o(rangeArr, i10);
        StringBuilder w10 = a1.g.w("fps selection: id=", str, ", requested=");
        w10.append(k0Var.f46795a);
        w10.append(", mode=REGULAR, range=");
        w10.append(o11);
        if (this.f46717e0) {
            str2 = ", reason=session-wide fallback";
        } else {
            str2 = "";
        }
        w10.append(str2);
        lVar3.b(w10.toString());
        return new f3(k0Var2, o11, lVar2, 24);
    }

    public final void x(qi.i0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: qi.h.x(qi.i0):void");
    }

    public final void y(boolean z10) {
        Handler handler = this.f46732n;
        if (this.S && handler != null) {
            handler.post(new js0(15, this, z10));
        }
    }

    public final boolean z(float f7) {
        this.K = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.f46732n;
        if (this.S && handler != null) {
            handler.removeCallbacks(this.O0);
            handler.post(this.O0);
            return true;
        }
        return false;
    }
}
