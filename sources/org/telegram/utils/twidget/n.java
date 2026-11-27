package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import java.nio.charset.StandardCharsets;
public final class n extends Binder implements jl5 {
    public static final int b = 0;
    public final WidgetEngineService a;

    public n(WidgetEngineService widgetEngineService) {
        this.a = widgetEngineService;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngine");
    }

    @Override
    public final void A(long j, boolean z) {
        WidgetSandboxNative.visible(j, z);
    }

    @Override
    public final void D(long j, float f) {
        WidgetSandboxNative.width(j, f);
    }

    @Override
    public final long G(byte[] bArr, byte[] bArr2, float f, float f2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z, ll5 ll5Var) {
        if (!WidgetEngineService.e) {
            SystemClock.uptimeMillis();
            String f3 = WidgetEngineService.f(new ftb(this.a.getAssets(), (byte) 22));
            SystemClock.uptimeMillis();
            long create = WidgetSandboxNative.create(f3.getBytes(StandardCharsets.UTF_8), bArr, bArr2, f, f2, i, bArr3, bArr4, bArr5, bArr6, z, new WidgetEngineBackend(ll5Var, f2));
            Object obj = gid.a;
            synchronized (obj) {
                gid.b++;
                obj.notifyAll();
            }
            return create;
        }
        grb.i("Widget engine: no seccomp filter on this device");
        return 0L;
    }

    @Override
    public final void H(long j) {
        WidgetSandboxNative.repaint(j);
    }

    @Override
    public final void K(long j, int i, float f, float f2, int i2) {
        WidgetSandboxNative.hover(j, i, f, f2, i2);
    }

    @Override
    public final void L() {
        if (WidgetEngineService.e) {
            return;
        }
        SystemClock.uptimeMillis();
        try {
            String f = WidgetEngineService.f(new ftb(this.a.getAssets(), (byte) 22));
            SystemClock.uptimeMillis();
            WidgetEngineBackend.warmFonts(this.a.getResources().getDisplayMetrics().density);
            SystemClock.uptimeMillis();
            WidgetSandboxNative.prepare(f.getBytes(StandardCharsets.UTF_8));
        } catch (RuntimeException e) {
            Log.e("WidgetEngine", "warmup failed", e);
        }
    }

    @Override
    public final void M(long j, byte[] bArr) {
        WidgetSandboxNative.safeArea(j, bArr);
    }

    @Override
    public final void k(long j, float f, boolean z, boolean z2, boolean z3) {
        WidgetSandboxNative.tick(j, f, z, z2, z3);
    }

    @Override
    public final void l(long j, long j2, int i, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j, j2, i, bArr);
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcel parcel3;
        ll5 ll5Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i >= 1 && i <= 16777215) {
            parcel3 = parcel;
            parcel3.enforceInterface("org.telegram.utils.twidget.IWidgetEngine");
        } else {
            parcel3 = parcel;
        }
        if (i == 1598968902) {
            parcel2.writeString("org.telegram.utils.twidget.IWidgetEngine");
            return true;
        }
        switch (i) {
            case 1:
                byte[] createByteArray = parcel.createByteArray();
                byte[] createByteArray2 = parcel.createByteArray();
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                int readInt = parcel.readInt();
                byte[] createByteArray3 = parcel.createByteArray();
                byte[] createByteArray4 = parcel.createByteArray();
                byte[] createByteArray5 = parcel.createByteArray();
                boolean z6 = false;
                byte[] createByteArray6 = parcel.createByteArray();
                if (parcel.readInt() != 0) {
                    z6 = true;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ll5Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof ll5)) {
                        ll5Var = (ll5) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.a = readStrongBinder;
                        ll5Var = obj;
                    }
                }
                long G = G(createByteArray, createByteArray2, readFloat, readFloat2, readInt, createByteArray3, createByteArray4, createByteArray5, createByteArray6, z6, ll5Var);
                parcel2.writeNoException();
                parcel2.writeLong(G);
                break;
            case 2:
                r(parcel.readLong());
                break;
            case 3:
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                WidgetSandboxNative.visible(readLong, z);
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
                boolean z7 = false;
                float readFloat3 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z7 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                    z2 = true;
                } else {
                    z3 = z2;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                WidgetSandboxNative.tick(readLong2, readFloat3, z7, z2, z3);
                break;
            case 11:
                long readLong3 = parcel.readLong();
                int readInt2 = parcel.readInt();
                float readFloat4 = parcel.readFloat();
                float readFloat5 = parcel.readFloat();
                int readInt3 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                WidgetSandboxNative.touch(readLong3, readInt2, readFloat4, readFloat5, readInt3, z4, z5, parcel.readInt(), parcel.readInt());
                break;
            case 12:
                WidgetSandboxNative.hover(parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
                break;
            case 13:
                L();
                break;
            case 14:
                v(parcel3.readStrongBinder());
                parcel2.writeNoException();
                break;
            case 15:
                parcel3.readInt();
                parcel3.readInt();
                parcel3.createByteArray();
                parcel2.writeNoException();
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    @Override
    public final void r(final long j) {
        WidgetEngineService.d.execute(new Runnable() {
            @Override
            public final void run() {
                WidgetSandboxNative.destroy(j);
                synchronized (gid.a) {
                    gid.b = Math.max(0, gid.b - 1);
                }
            }
        });
    }

    @Override
    public final void s(long j, byte[] bArr) {
        WidgetSandboxNative.data(j, bArr);
    }

    @Override
    public final void u(long j, byte[] bArr) {
        WidgetSandboxNative.theme(j, bArr);
    }

    @Override
    public final void v(IBinder iBinder) {
        if (!WidgetEngineService.e && Build.VERSION.SDK_INT >= 29) {
            WidgetEngineService.fileGate(iBinder);
        }
    }

    @Override
    public final void x(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        WidgetSandboxNative.touch(j, i, f, f2, i2, z, z2, i3, i4);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
