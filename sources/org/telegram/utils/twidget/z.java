package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import java.nio.charset.StandardCharsets;
public final class z extends Binder implements b {
    public static final int f53021b = 0;
    public final WidgetEngineService f53022a;

    public z(WidgetEngineService widgetEngineService) {
        this.f53022a = widgetEngineService;
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
    public final void Y0(long j3, int i7, float f10, float f11, int i10) {
        WidgetSandboxNative.hover(j3, i7, f10, f11, i10);
    }

    @Override
    public final void b1() {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            WidgetEngineService.a(this.f53022a.getAssets());
            Log.i("WidgetEngine", "warm: bundles in " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms");
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
    public final void j0(long j3, int i7, float f10, float f11, int i10, boolean z9, boolean z10, int i11, int i12) {
        WidgetSandboxNative.touch(j3, i7, f10, f11, i10, z9, z10, i11, i12);
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        Parcel parcel3;
        d dVar;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
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
        boolean z14 = false;
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
                boolean z15 = false;
                byte[] createByteArray6 = parcel.createByteArray();
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                        dVar = (d) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f52771a = readStrongBinder;
                        dVar = obj;
                    }
                }
                long t6 = t(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z15, dVar);
                parcel2.writeNoException();
                parcel2.writeLong(t6);
                break;
            case 2:
                J(parcel.readLong());
                break;
            case 3:
                boolean z16 = false;
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
                boolean z17 = false;
                long readLong2 = parcel3.readLong();
                float readFloat3 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z9 = false;
                    z17 = true;
                } else {
                    z9 = false;
                }
                if (parcel.readInt() != 0) {
                    z10 = z9;
                    z9 = true;
                } else {
                    z10 = z9;
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                WidgetSandboxNative.tick(readLong2, readFloat3, z17, z9, z10);
                break;
            case 11:
                long readLong3 = parcel3.readLong();
                int readInt2 = parcel3.readInt();
                float readFloat4 = parcel3.readFloat();
                float readFloat5 = parcel3.readFloat();
                int readInt3 = parcel3.readInt();
                if (parcel3.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (parcel3.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                WidgetSandboxNative.touch(readLong3, readInt2, readFloat4, readFloat5, readInt3, z11, z12, parcel3.readInt(), parcel3.readInt());
                break;
            case 12:
                WidgetSandboxNative.hover(parcel3.readLong(), parcel3.readInt(), parcel3.readFloat(), parcel3.readFloat(), parcel3.readInt());
                break;
            case 13:
                b1();
                break;
            case 14:
                if (parcel3.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (parcel3.readInt() != 0) {
                    z14 = true;
                }
                v(z13, z14, parcel3.createByteArray());
                parcel2.writeNoException();
                break;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
        return true;
    }

    @Override
    public final void s(long j3, float f10, boolean z9, boolean z10, boolean z11) {
        WidgetSandboxNative.tick(j3, f10, z9, z10, z11);
    }

    @Override
    public final long t(byte[] bArr, byte[] bArr2, float f10, float f11, int i7, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z9, d dVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long create = WidgetSandboxNative.create(WidgetEngineService.a(this.f53022a.getAssets()).getBytes(StandardCharsets.UTF_8), bArr, bArr2, f10, f11, i7, bArr3, bArr4, bArr5, bArr6, z9, new WidgetEngineBackend(dVar, f11));
        Log.i("WidgetEngine", "session in " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms (bundles " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms)");
        return create;
    }

    @Override
    public final void u(long j3, long j10, int i7, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j3, j10, i7, bArr);
    }

    @Override
    public final void u0(long j3, boolean z9) {
        WidgetSandboxNative.visible(j3, z9);
    }

    @Override
    public final void v(boolean z9, boolean z10, byte[] bArr) {
        WidgetSandboxNative.conformance(z9);
        WidgetSandboxNative.attackScan(z10);
        WidgetSandboxNative.limits(bArr);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
