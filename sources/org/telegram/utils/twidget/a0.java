package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.cd0;
public final class a0 extends Binder implements b {
    public static final int f54721b = 0;
    public final WidgetEngineService f54722a;

    public a0(WidgetEngineService widgetEngineService) {
        this.f54722a = widgetEngineService;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngine");
    }

    @Override
    public final void G0(long j3, float f10) {
        WidgetSandboxNative.width(j3, f10);
    }

    @Override
    public final void J(final long j3) {
        WidgetEngineService.d.execute(new Runnable() {
            @Override
            public final void run() {
                WidgetSandboxNative.destroy(j3);
                synchronized (l.f54871a) {
                    l.f54872b = Math.max(0, l.f54872b - 1);
                }
            }
        });
    }

    @Override
    public final void M0(long j3) {
        WidgetSandboxNative.repaint(j3);
    }

    @Override
    public final void R(long j3, byte[] bArr) {
        WidgetSandboxNative.data(j3, bArr);
    }

    @Override
    public final void Z0(long j3, int i7, float f10, float f11, int i10) {
        WidgetSandboxNative.hover(j3, i7, f10, f11, i10);
    }

    @Override
    public final void b1() {
        if (WidgetEngineService.f54718e) {
            return;
        }
        SystemClock.uptimeMillis();
        try {
            String d = WidgetEngineService.d(new q(this.f54722a.getAssets(), 3));
            SystemClock.uptimeMillis();
            WidgetEngineBackend.warmFonts(this.f54722a.getResources().getDisplayMetrics().density);
            SystemClock.uptimeMillis();
            WidgetSandboxNative.prepare(d.getBytes(StandardCharsets.UTF_8));
        } catch (RuntimeException e10) {
            Log.e("WidgetEngine", "warmup failed", e10);
        }
    }

    @Override
    public final void d1(long j3, byte[] bArr) {
        WidgetSandboxNative.safeArea(j3, bArr);
    }

    @Override
    public final void e0(long j3, byte[] bArr) {
        WidgetSandboxNative.theme(j3, bArr);
    }

    @Override
    public final void j0(long j3, int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        WidgetSandboxNative.touch(j3, i7, f10, f11, i10, z10, z11, i11, i12);
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        Parcel parcel3;
        boolean z10;
        d dVar;
        d dVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel3 = parcel;
            parcel3.enforceInterface("org.telegram.utils.twidget.IWidgetEngine");
        } else {
            parcel3 = parcel;
        }
        if (i7 == 1598968902) {
            parcel2.writeString("org.telegram.utils.twidget.IWidgetEngine");
            return true;
        }
        boolean z16 = false;
        switch (i7) {
            case 1:
                byte[] createByteArray = parcel.createByteArray();
                byte[] createByteArray2 = parcel.createByteArray();
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                int readInt = parcel.readInt();
                byte[] createByteArray3 = parcel.createByteArray();
                byte[] createByteArray4 = parcel.createByteArray();
                byte[] createByteArray5 = parcel.createByteArray();
                byte[] createByteArray6 = parcel.createByteArray();
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar2 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                        dVar2 = (d) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f54728a = readStrongBinder;
                        dVar = obj;
                        long t6 = t(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z10, dVar);
                        parcel2.writeNoException();
                        parcel2.writeLong(t6);
                        break;
                    }
                }
                dVar = dVar2;
                long t62 = t(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z10, dVar);
                parcel2.writeNoException();
                parcel2.writeLong(t62);
                break;
            case 2:
                J(parcel.readLong());
                break;
            case 3:
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z16 = true;
                }
                WidgetSandboxNative.visible(readLong, z16);
                break;
            case 4:
                WidgetSandboxNative.theme(parcel.readLong(), parcel.createByteArray());
                break;
            case 5:
                WidgetSandboxNative.width(parcel.readLong(), parcel.readFloat());
                break;
            case 6:
                WidgetSandboxNative.data(parcel.readLong(), parcel.createByteArray());
                break;
            case 7:
                WidgetSandboxNative.safeArea(parcel.readLong(), parcel.createByteArray());
                break;
            case 8:
                WidgetSandboxNative.answerRequest(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.createByteArray());
                break;
            case 9:
                WidgetSandboxNative.repaint(parcel.readLong());
                break;
            case 10:
                long readLong2 = parcel.readLong();
                float readFloat3 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                WidgetSandboxNative.tick(readLong2, readFloat3, z11, z12, z13);
                break;
            case 11:
                long readLong3 = parcel.readLong();
                int readInt2 = parcel.readInt();
                float readFloat4 = parcel.readFloat();
                float readFloat5 = parcel.readFloat();
                int readInt3 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                WidgetSandboxNative.touch(readLong3, readInt2, readFloat4, readFloat5, readInt3, z14, z15, parcel.readInt(), parcel.readInt());
                break;
            case 12:
                WidgetSandboxNative.hover(parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
                break;
            case 13:
                b1();
                break;
            case 14:
                parcel3.readInt();
                parcel3.readInt();
                parcel3.createByteArray();
                parcel2.writeNoException();
                break;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
        return true;
    }

    @Override
    public final void s(long j3, float f10, boolean z10, boolean z11, boolean z12) {
        WidgetSandboxNative.tick(j3, f10, z10, z11, z12);
    }

    @Override
    public final long t(byte[] bArr, byte[] bArr2, float f10, float f11, int i7, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z10, d dVar) {
        if (!WidgetEngineService.f54718e) {
            SystemClock.uptimeMillis();
            String d = WidgetEngineService.d(new q(this.f54722a.getAssets(), 3));
            SystemClock.uptimeMillis();
            long create = WidgetSandboxNative.create(d.getBytes(StandardCharsets.UTF_8), bArr, bArr2, f10, f11, i7, bArr3, bArr4, bArr5, bArr6, z10, new WidgetEngineBackend(dVar, f11));
            Object obj = l.f54871a;
            synchronized (obj) {
                try {
                    l.f54872b++;
                    if (!l.f54873c) {
                        l.f54873c = true;
                        Thread thread = new Thread(new cd0(17), "widget-engine-memory");
                        thread.setDaemon(true);
                        thread.start();
                    }
                    obj.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return create;
        }
        throw new IllegalStateException("Widget engine: no seccomp filter on this device");
    }

    @Override
    public final void u(long j3, long j10, int i7, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j3, j10, i7, bArr);
    }

    @Override
    public final void u0(long j3, boolean z10) {
        WidgetSandboxNative.visible(j3, z10);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
