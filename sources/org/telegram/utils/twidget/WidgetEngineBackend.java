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
    private static final LinkedHashMap<String, Float> WIDTHS = new or4(4096, 0.75f, true, (byte) 3);
    private static volatile boolean localFonts = true;
    private final il5 client;
    private final float density;
    private long imageBytes;
    private int nextFont;
    private final ConcurrentHashMap<Integer, Paint> deviceFonts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, String> fontKeys = new ConcurrentHashMap<>();
    private final Object largeLock = new Object();

    public WidgetEngineBackend(il5 il5Var, float f) {
        this.client = il5Var;
        this.density = f;
    }

    private static void call(lxc lxcVar) {
        try {
            lxcVar.mo19run();
        } catch (RemoteException e) {
            zo4.j(e, "Widget client: ");
        }
    }

    public void lambda$canvasRead$9(byte[][] bArr, int i, int i2, int i3, int i4, int i5) {
        bArr[0] = this.client.n(i, i2, i3, i4, i5);
    }

    public void lambda$canvasRun$8(int i, int i2, int i3, int[] iArr) {
        this.client.z(i, i2, i3, iArr);
    }

    public void lambda$createFont$0(float[][] fArr, int i, byte[] bArr, float f, int i2, boolean z, byte[] bArr2) {
        fArr[0] = this.client.q(i, bArr, f, i2, z, bArr2);
    }

    public void lambda$loadImage$2(int i, int i2, int i3, byte[] bArr) {
        this.client.m(i, i2, i3, bArr);
    }

    public void lambda$record$7(byte[] bArr, double d, int i, int i2, float f, float f2, int i3, int i4, byte[] bArr2) {
        this.client.p(bArr2, bArr, d, i, i2, f, f2, i3, i4);
    }

    public void lambda$recordLayer$6(int i, int i2, byte[] bArr) {
        this.client.E(i, i2, bArr);
    }

    public void lambda$remoteWidth$1(float[] fArr, int i, byte[] bArr) {
        fArr[0] = this.client.y(i, bArr);
    }

    public void lambda$selectableText$5(byte[] bArr) {
        this.client.w(bArr);
    }

    public void lambda$send$11(byte[] bArr) {
        this.client.I(bArr);
    }

    public void lambda$signal$3(int i, byte[] bArr) {
        this.client.B(i, bArr);
    }

    public void lambda$state$4(int i, float f) {
        this.client.J(i, f);
    }

    private Paint localFont(byte[] bArr, float f, int i, boolean z, byte[] bArr2) {
        try {
            return WidgetSandboxBackend.paints(WidgetSandboxBackend.text(bArr), f, i, z, WidgetSandboxBackend.text(bArr2), this.density)[1];
        } catch (RuntimeException e) {
            localFonts = false;
            Log.w("WidgetEngine", "no fonts in this process (" + e.getClass().getSimpleName() + "): widths come from the client");
            return null;
        }
    }

    private float remoteWidth(final int i, final byte[] bArr) {
        final float[] fArr = new float[1];
        call(new lxc() {
            @Override
            public final void mo19run() {
                WidgetEngineBackend.this.lambda$remoteWidth$1(fArr, i, bArr);
            }
        });
        return fArr[0];
    }

    private void send(byte[] bArr, mxc mxcVar) {
        if (bArr != null && bArr.length > 262144) {
            synchronized (this.largeLock) {
                for (int i = 0; i < bArr.length; i += 262144) {
                    int min = Math.min(262144, bArr.length - i);
                    byte[] bArr2 = new byte[min];
                    System.arraycopy(bArr, i, bArr2, 0, min);
                    call(new l(this, bArr2, (byte) 1));
                }
                call(new g(mxcVar));
            }
            return;
        }
        call(new l(mxcVar, bArr, (byte) 0));
    }

    public static void warmFonts(float f) {
        try {
            Rect rect = new Rect();
            int[] iArr = {400, 700};
            int i = 0;
            while (i < 2) {
                float f2 = f;
                Paint paint = WidgetSandboxBackend.paints("sans-serif", 14.0f, iArr[i], false, "", f2)[1];
                WidgetSandboxBackend.metrics(0, paint, f2, rect);
                paint.measureText("Widget 0123");
                i++;
                f = f2;
            }
        } catch (RuntimeException unused) {
            localFonts = false;
        }
    }

    public byte[] canvasRead(final int i, final int i2, final int i3, final int i4, final int i5) {
        final byte[][] bArr = new byte[1];
        call(new lxc() {
            @Override
            public final void mo19run() {
                WidgetEngineBackend.this.lambda$canvasRead$9(bArr, i, i2, i3, i4, i5);
            }
        });
        return bArr[0];
    }

    public void canvasRelease(int i) {
        try {
            this.client.o(i);
        } catch (RemoteException unused) {
        }
    }

    public void canvasRun(int i, int i2, int i3, int[] iArr) {
        call(new i(this, i, i2, i3, iArr, (byte) 0));
    }

    public float[] createFont(final byte[] bArr, final float f, final int i, final boolean z, final byte[] bArr2) {
        final int i2 = this.nextFont + 1;
        this.nextFont = i2;
        final float[][] fArr = new float[1];
        call(new lxc() {
            @Override
            public final void mo19run() {
                WidgetEngineBackend.this.lambda$createFont$0(fArr, i2, bArr, f, i, z, bArr2);
            }
        });
        float[] fArr2 = fArr[0];
        Paint paint = null;
        if (fArr2 != null && fArr2.length == 6) {
            if (localFonts) {
                paint = localFont(bArr, f, i, z, bArr2);
            }
            if (paint != null) {
                this.deviceFonts.put(Integer.valueOf(i2), paint);
            } else {
                ConcurrentHashMap<Integer, String> concurrentHashMap = this.fontKeys;
                Integer valueOf = Integer.valueOf(i2);
                concurrentHashMap.put(valueOf, WidgetSandboxBackend.text(bArr) + (char) 1 + f + (char) 1 + i + (char) 1 + z + (char) 1 + WidgetSandboxBackend.text(bArr2) + (char) 1);
            }
            return fArr[0];
        }
        dq9.m("Widget client: font");
        return null;
    }

    public void deleteFont(int i) {
        this.deviceFonts.remove(Integer.valueOf(i));
        this.fontKeys.remove(Integer.valueOf(i));
        try {
            this.client.O(i);
        } catch (RemoteException unused) {
        }
    }

    public byte[] formatIntl(byte[] bArr) {
        return i10.d(WidgetSandboxBackend.text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    public float[] loadImage(final int i, byte[] bArr) {
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
            ByteBuffer allocate = ByteBuffer.allocate((decodeImage.getHeight() * decodeImage.getWidth()) << 2);
            decodeImage.copyPixelsToBuffer(allocate);
            final int width = decodeImage.getWidth();
            final int height = decodeImage.getHeight();
            send(allocate.array(), new mxc() {
                @Override
                public final void a(byte[] bArr2) {
                    WidgetEngineBackend.this.lambda$loadImage$2(i, width, height, bArr2);
                }
            });
            return new float[]{width, height};
        }
        return null;
    }

    public void record(byte[] bArr, final byte[] bArr2, final double d, final int i, final int i2, final float f, final float f2, final int i3, final int i4) {
        send(bArr, new mxc() {
            @Override
            public final void a(byte[] bArr3) {
                WidgetEngineBackend.this.lambda$record$7(bArr2, d, i, i2, f, f2, i3, i4, bArr3);
            }
        });
    }

    public void recordLayer(final int i, final int i2, byte[] bArr) {
        send(bArr, new mxc() {
            @Override
            public final void a(byte[] bArr2) {
                WidgetEngineBackend.this.lambda$recordLayer$6(i, i2, bArr2);
            }
        });
    }

    public void selectableText(byte[] bArr) {
        send(bArr, new g(this));
    }

    public void signal(int i, byte[] bArr) {
        send(bArr, new q(this, i, (byte) 2));
    }

    public void state(final int i, final float f) {
        call(new lxc() {
            @Override
            public final void mo19run() {
                WidgetEngineBackend.this.lambda$state$4(i, f);
            }
        });
    }

    public float textWidth(int i, byte[] bArr) {
        String str;
        float f;
        Paint paint = this.deviceFonts.get(Integer.valueOf(i));
        if (paint != null) {
            return paint.measureText(WidgetSandboxBackend.text(bArr)) / this.density;
        }
        float f2 = 0.0f;
        if (bArr == null || bArr.length == 0) {
            return 0.0f;
        }
        String text = WidgetSandboxBackend.text(bArr);
        String str2 = this.fontKeys.get(Integer.valueOf(i));
        if (str2 != null && text.length() <= 1024) {
            str = str2.concat(text);
        } else {
            str = null;
        }
        if (str != null) {
            LinkedHashMap<String, Float> linkedHashMap = WIDTHS;
            synchronized (linkedHashMap) {
                Float f3 = linkedHashMap.get(str);
                if (f3 != null) {
                    return f3.floatValue();
                }
            }
        }
        if (bArr.length <= 262144) {
            f = remoteWidth(i, bArr);
        } else {
            int i2 = 0;
            while (i2 < text.length()) {
                int min = Math.min(text.length(), 65536 + i2);
                if (min < text.length() && Character.isHighSurrogate(text.charAt(min - 1))) {
                    min--;
                }
                f2 += remoteWidth(i, text.substring(i2, min).getBytes(StandardCharsets.UTF_8));
                i2 = min;
            }
            f = f2;
        }
        if (str != null) {
            LinkedHashMap<String, Float> linkedHashMap2 = WIDTHS;
            synchronized (linkedHashMap2) {
                linkedHashMap2.put(str, Float.valueOf(f));
            }
            return f;
        }
        return f;
    }
}
