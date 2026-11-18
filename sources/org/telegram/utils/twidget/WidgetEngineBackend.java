package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
public final class WidgetEngineBackend {
    private static final int MAX_CACHED_TEXT = 1024;
    private static final int MAX_CACHED_WIDTHS = 8192;
    private static final int PART = 262144;
    private static final int TEXT_PIECE = 65536;
    private static final LinkedHashMap<String, Float> WIDTHS = new w(0.75f, 4096, 0, true);
    private static volatile boolean localFonts = true;
    private final d client;
    private final float density;
    private long imageBytes;
    private int nextFont;
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, String> fontKeys = new ConcurrentHashMap<>();
    private final Object largeLock = new Object();

    public WidgetEngineBackend(d dVar, float f10) {
        this.client = dVar;
        this.density = f10;
    }

    private static void call(x xVar) {
        try {
            xVar.mo26run();
        } catch (RemoteException e10) {
            throw new IllegalStateException("Widget client: " + e10);
        }
    }

    public void lambda$canvasRead$9(byte[][] bArr, int i7, int i10, int i11, int i12, int i13) {
        bArr[0] = this.client.A(i7, i10, i11, i12, i13);
    }

    public void lambda$canvasRun$8(int i7, int i10, int i11, int[] iArr) {
        this.client.t0(i7, i10, i11, iArr);
    }

    public void lambda$createFont$0(float[][] fArr, int i7, byte[] bArr, float f10, int i10, boolean z10, byte[] bArr2) {
        fArr[0] = this.client.G(i7, bArr, f10, i10, z10, bArr2);
    }

    public void lambda$loadImage$2(int i7, int i10, int i11, byte[] bArr) {
        this.client.x(i7, i10, i11, bArr);
    }

    public void lambda$record$7(byte[] bArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, byte[] bArr2) {
        this.client.F(bArr2, bArr, d, i7, i10, f10, f11, i11, i12);
    }

    public void lambda$recordLayer$6(int i7, int i10, byte[] bArr) {
        this.client.J0(i7, i10, bArr);
    }

    public void lambda$remoteWidth$1(float[] fArr, int i7, byte[] bArr) {
        fArr[0] = this.client.p0(i7, bArr);
    }

    public void lambda$selectableText$5(byte[] bArr) {
        this.client.h0(bArr);
    }

    public void lambda$send$11(byte[] bArr) {
        this.client.Q0(bArr);
    }

    public void lambda$signal$3(int i7, byte[] bArr) {
        this.client.v0(i7, bArr);
    }

    public void lambda$state$4(int i7, float f10) {
        this.client.R0(i7, f10);
    }

    private Paint localFont(byte[] bArr, float f10, int i7, boolean z10, byte[] bArr2) {
        try {
            return WidgetSandboxBackend.paints(WidgetSandboxBackend.text(bArr), f10, i7, z10, WidgetSandboxBackend.text(bArr2), this.density)[1];
        } catch (RuntimeException e10) {
            localFonts = false;
            Log.w("WidgetEngine", "no fonts in this process (" + e10.getClass().getSimpleName() + "): widths come from the client");
            return null;
        }
    }

    private float remoteWidth(final int i7, final byte[] bArr) {
        final float[] fArr = new float[1];
        call(new x() {
            @Override
            public final void mo26run() {
                WidgetEngineBackend.this.lambda$remoteWidth$1(fArr, i7, bArr);
            }
        });
        return fArr[0];
    }

    private void send(byte[] bArr, y yVar) {
        if (bArr != 0 && bArr.length > 262144) {
            synchronized (this.largeLock) {
                for (int i7 = 0; i7 < bArr.length; i7 += 262144) {
                    try {
                        int min = Math.min(262144, bArr.length - i7);
                        ?? r52 = new byte[min];
                        System.arraycopy(bArr, i7, r52, 0, min);
                        call(new v(1, r52, this));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                call(new q(yVar, 1));
            }
            return;
        }
        call(new v(0, bArr, yVar));
    }

    public static void warmFonts(float f10) {
        try {
            Rect rect = new Rect();
            int[] iArr = {400, 700};
            int i7 = 0;
            while (i7 < 2) {
                float f11 = f10;
                Paint paint = WidgetSandboxBackend.paints("sans-serif", 14.0f, iArr[i7], false, "", f11)[1];
                WidgetSandboxBackend.metrics(0, paint, f11, rect);
                paint.measureText("Widget 0123");
                i7++;
                f10 = f11;
            }
        } catch (RuntimeException unused) {
            localFonts = false;
        }
    }

    public byte[] canvasRead(final int i7, final int i10, final int i11, final int i12, final int i13) {
        final byte[][] bArr = new byte[1];
        call(new x() {
            @Override
            public final void mo26run() {
                WidgetEngineBackend.this.lambda$canvasRead$9(bArr, i7, i10, i11, i12, i13);
            }
        });
        return bArr[0];
    }

    public void canvasRelease(int i7) {
        try {
            this.client.D(i7);
        } catch (RemoteException unused) {
        }
    }

    public void canvasRun(int i7, int i10, int i11, int[] iArr) {
        call(new s(this, i7, i10, i11, iArr, 0));
    }

    public float[] createFont(final byte[] bArr, final float f10, final int i7, final boolean z10, final byte[] bArr2) {
        Paint paint;
        final int i10 = this.nextFont + 1;
        this.nextFont = i10;
        final float[][] fArr = new float[1];
        call(new x() {
            @Override
            public final void mo26run() {
                WidgetEngineBackend.this.lambda$createFont$0(fArr, i10, bArr, f10, i7, z10, bArr2);
            }
        });
        float[] fArr2 = fArr[0];
        if (fArr2 != null && fArr2.length == 6) {
            if (localFonts) {
                paint = localFont(bArr, f10, i7, z10, bArr2);
            } else {
                paint = null;
            }
            if (paint != null) {
                this.deviceFonts.put(Integer.valueOf(i10), paint);
            } else {
                ConcurrentHashMap<Integer, String> concurrentHashMap = this.fontKeys;
                Integer valueOf = Integer.valueOf(i10);
                concurrentHashMap.put(valueOf, WidgetSandboxBackend.text(bArr) + (char) 1 + f10 + (char) 1 + i7 + (char) 1 + z10 + (char) 1 + WidgetSandboxBackend.text(bArr2) + (char) 1);
            }
            return fArr[0];
        }
        throw new IllegalStateException("Widget client: font");
    }

    public void deleteFont(int i7) {
        this.deviceFonts.remove(Integer.valueOf(i7));
        this.fontKeys.remove(Integer.valueOf(i7));
        try {
            this.client.f1(i7);
        } catch (RemoteException unused) {
        }
    }

    public byte[] formatIntl(byte[] bArr) {
        return b1.b(WidgetSandboxBackend.text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    public float[] loadImage(final int i7, byte[] bArr) {
        Bitmap decodeImage = WidgetSandboxBackend.decodeImage(WidgetSandboxBackend.text(bArr), this.imageBytes);
        if (decodeImage != null) {
            this.imageBytes += decodeImage.getAllocationByteCount();
            Bitmap.Config config = decodeImage.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                decodeImage = decodeImage.copy(config2, false);
            }
            if (decodeImage == null) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(decodeImage.getHeight() * decodeImage.getWidth() * 4);
            decodeImage.copyPixelsToBuffer(allocate);
            final int width = decodeImage.getWidth();
            final int height = decodeImage.getHeight();
            send(allocate.array(), new y() {
                @Override
                public final void a(byte[] bArr2) {
                    WidgetEngineBackend.this.lambda$loadImage$2(i7, width, height, bArr2);
                }
            });
            return new float[]{width, height};
        }
        return null;
    }

    public void record(byte[] bArr, final byte[] bArr2, final double d, final int i7, final int i10, final float f10, final float f11, final int i11, final int i12) {
        send(bArr, new y() {
            @Override
            public final void a(byte[] bArr3) {
                WidgetEngineBackend.this.lambda$record$7(bArr2, d, i7, i10, f10, f11, i11, i12, bArr3);
            }
        });
    }

    public void recordLayer(final int i7, final int i10, byte[] bArr) {
        send(bArr, new y() {
            @Override
            public final void a(byte[] bArr2) {
                WidgetEngineBackend.this.lambda$recordLayer$6(i7, i10, bArr2);
            }
        });
    }

    public void selectableText(byte[] bArr) {
        send(bArr, new q(this, 0));
    }

    public void signal(int i7, byte[] bArr) {
        send(bArr, new q0(this, i7, 2));
    }

    public void state(final int i7, final float f10) {
        call(new x() {
            @Override
            public final void mo26run() {
                WidgetEngineBackend.this.lambda$state$4(i7, f10);
            }
        });
    }

    public float textWidth(int i7, byte[] bArr) {
        String str;
        float f10;
        Paint paint = this.deviceFonts.get(Integer.valueOf(i7));
        if (paint != null) {
            return paint.measureText(WidgetSandboxBackend.text(bArr)) / this.density;
        }
        float f11 = 0.0f;
        if (bArr == null || bArr.length == 0) {
            return 0.0f;
        }
        String text = WidgetSandboxBackend.text(bArr);
        String str2 = this.fontKeys.get(Integer.valueOf(i7));
        if (str2 != null && text.length() <= 1024) {
            str = str2.concat(text);
        } else {
            str = null;
        }
        if (str != null) {
            LinkedHashMap<String, Float> linkedHashMap = WIDTHS;
            synchronized (linkedHashMap) {
                try {
                    Float f12 = linkedHashMap.get(str);
                    if (f12 != null) {
                        return f12.floatValue();
                    }
                } finally {
                }
            }
        }
        if (bArr.length <= 262144) {
            f10 = remoteWidth(i7, bArr);
        } else {
            int i10 = 0;
            while (i10 < text.length()) {
                int min = Math.min(text.length(), 65536 + i10);
                if (min < text.length() && Character.isHighSurrogate(text.charAt(min - 1))) {
                    min--;
                }
                f11 += remoteWidth(i7, text.substring(i10, min).getBytes(StandardCharsets.UTF_8));
                i10 = min;
            }
            f10 = f11;
        }
        if (str != null) {
            LinkedHashMap<String, Float> linkedHashMap2 = WIDTHS;
            synchronized (linkedHashMap2) {
                linkedHashMap2.put(str, Float.valueOf(f10));
            }
            return f10;
        }
        return f10;
    }
}
