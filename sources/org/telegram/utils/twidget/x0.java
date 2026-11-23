package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Semaphore;
public final class x0 extends Binder implements d {
    public final y0 f55104a;
    public final WidgetSandboxBackend f55105b;
    public volatile long f55106c;
    public final ByteArrayOutputStream d;
    public final Semaphore f55107e;
    public double f55108f;
    public long f55109i;
    public final z0 f55110j;

    public x0(z0 z0Var, y0 y0Var, WidgetSandboxBackend widgetSandboxBackend) {
        this.f55110j = z0Var;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngineCallback");
        this.d = new ByteArrayOutputStream();
        this.f55107e = new Semaphore(4);
        this.f55108f = 2000.0d;
        this.f55109i = SystemClock.elapsedRealtime();
        this.f55104a = y0Var;
        this.f55105b = widgetSandboxBackend;
    }

    @Override
    public final byte[] A(final int i7, final int i10, final int i11, final int i12, final int i13) {
        return (byte[]) h1(new p0() {
            @Override
            public final Object run() {
                return x0.this.f55105b.canvasRead(i7, i10, i11, i12, i13);
            }
        });
    }

    @Override
    public final void D(int i7) {
        h1(new q0(this, i7, 1));
    }

    @Override
    public final void F(final byte[] bArr, final byte[] bArr2, final double d, final int i7, final int i10, final float f10, final float f11, final int i11, final int i12) {
        h1(new p0() {
            @Override
            public final Object run() {
                int i13;
                x0 x0Var = x0.this;
                byte[] i14 = x0Var.i1(bArr);
                int i15 = i7;
                if (i15 >= 0 && (i13 = i10) >= 0 && i15 <= 16384 && i13 <= 16384) {
                    float f12 = f10;
                    if (f12 > 0.0f && f12 <= 10.0f) {
                        WidgetSandboxBackend widgetSandboxBackend = x0Var.f55105b;
                        byte[] bArr3 = bArr2;
                        if (bArr3 == null) {
                            bArr3 = new byte[]{123, 125};
                        }
                        widgetSandboxBackend.record(i14, bArr3, d, i15, i13, f12, f11, i11, i12);
                        return null;
                    }
                }
                throw new IllegalArgumentException("Frame size");
            }
        });
    }

    @Override
    public final float[] G(final int i7, final byte[] bArr, final float f10, final int i10, final boolean z10, final byte[] bArr2) {
        return (float[]) h1(new p0() {
            @Override
            public final Object run() {
                return x0.this.f55105b.defineFont(i7, bArr, f10, i10, z10, bArr2);
            }
        });
    }

    @Override
    public final void J0(final int i7, final int i10, final byte[] bArr) {
        h1(new p0() {
            @Override
            public final Object run() {
                x0 x0Var = this;
                x0Var.f55105b.recordLayer(i7, i10, x0Var.i1(bArr));
                return null;
            }
        });
    }

    @Override
    public final void Q0(byte[] bArr) {
        h1(new s0(this, bArr, 1));
    }

    @Override
    public final void R0(int i7, float f10) {
        try {
            this.f55105b.state(i7, f10);
        } catch (Throwable unused) {
        }
    }

    @Override
    public final void f1(int i7) {
        h1(new q0(this, i7, 0));
    }

    @Override
    public final void h0(byte[] bArr) {
        h1(new s0(this, bArr, 0));
    }

    public final Object h1(p0 p0Var) {
        if (this.f55104a.f55118s == 0) {
            this.f55104a.f55118s = Binder.getCallingPid();
        }
        if (this.f55107e.tryAcquire()) {
            try {
                if (this.f55110j.f55131m.tryAcquire()) {
                    Object run = p0Var.run();
                    this.f55110j.f55131m.release();
                    return run;
                }
                throw new IllegalStateException("Widget engine: too many calls at once");
            } catch (Throwable th2) {
                try {
                    throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
                } finally {
                    this.f55107e.release();
                }
            }
        }
        throw new IllegalStateException("Widget engine: too many calls at once");
    }

    public final synchronized byte[] i1(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = this.d.toByteArray();
        this.d.reset();
        return byteArray;
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("org.telegram.utils.twidget.IWidgetEngineCallback");
            return true;
        }
        switch (i7) {
            case 1:
                int readInt = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                float readFloat = parcel.readFloat();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float[] G = G(readInt, createByteArray, readFloat, readInt2, z10, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloatArray(G);
                break;
            case 2:
                float p02 = p0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloat(p02);
                break;
            case 3:
                f1(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 4:
                x(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 5:
                Q0(parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 6:
                F(parcel.createByteArray(), parcel.createByteArray(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                J0(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 8:
                h0(parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 9:
                v0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 10:
                R0(parcel.readInt(), parcel.readFloat());
                break;
            case 11:
                t0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                break;
            case 12:
                byte[] A = A(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(A);
                break;
            case 13:
                D(parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
        return true;
    }

    @Override
    public final float p0(int i7, byte[] bArr) {
        return ((Float) h1(new t0(i7, 1, this, bArr))).floatValue();
    }

    @Override
    public final void t0(int i7, int i10, int i11, int[] iArr) {
        h1(new s(this, i7, i10, i11, iArr, 2));
    }

    @Override
    public final void v0(int i7, byte[] bArr) {
        h1(new t0(i7, 0, this, bArr));
    }

    @Override
    public final void x(int i7, int i10, int i11, byte[] bArr) {
        h1(new s(this, i7, i10, i11, bArr, 1));
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
