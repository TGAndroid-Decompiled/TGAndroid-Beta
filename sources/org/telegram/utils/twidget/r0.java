package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;
public final class r0 extends Binder implements d {
    public final t0 f54388a;
    public final int f54389b;
    public final WidgetSandboxBackend f54390c;
    public volatile long d;
    public final ByteArrayOutputStream f54391e;
    public final u0 f54392f;

    public r0(u0 u0Var, t0 t0Var, int i7, WidgetSandboxBackend widgetSandboxBackend) {
        this.f54392f = u0Var;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngineCallback");
        this.f54391e = new ByteArrayOutputStream();
        this.f54388a = t0Var;
        this.f54389b = i7;
        this.f54390c = widgetSandboxBackend;
    }

    public static Object i1(o0 o0Var) {
        try {
            return o0Var.run();
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final byte[] B(int i7, int i10, int i11, int i12, int i13) {
        try {
            return this.f54390c.canvasRead(i7, i10, i11, i12, i13);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final void E(int i7) {
        try {
            this.f54390c.canvasRelease(i7);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final void G(final byte[] bArr, final byte[] bArr2, final double d, final int i7, final int i10, final float f10, final float f11, final int i11, final int i12) {
        i1(new o0() {
            @Override
            public final Object run() {
                int i13;
                r0 r0Var = r0.this;
                byte[] j12 = r0Var.j1(bArr);
                int i14 = i7;
                if (i14 >= 0 && (i13 = i10) >= 0 && i14 <= 16384 && i13 <= 16384) {
                    float f12 = f10;
                    if (f12 > 0.0f && f12 <= 10.0f) {
                        WidgetSandboxBackend widgetSandboxBackend = r0Var.f54390c;
                        byte[] bArr3 = bArr2;
                        if (bArr3 == null) {
                            bArr3 = new byte[]{123, 125};
                        }
                        widgetSandboxBackend.record(j12, bArr3, d, i14, i13, f12, f11, i11, i12);
                        return null;
                    }
                }
                throw new IllegalArgumentException("Frame size");
            }
        });
    }

    @Override
    public final float[] H(int i7, byte[] bArr, float f10, int i10, boolean z10, byte[] bArr2) {
        try {
            return this.f54390c.defineFont(i7, bArr, f10, i10, z10, bArr2);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final void K0(int i7, int i10, byte[] bArr) {
        try {
            this.f54390c.recordLayer(i7, i10, j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final void R0(byte[] bArr) {
        i1(new t(3, bArr, this));
    }

    @Override
    public final void f1(int i7) {
        try {
            this.f54390c.deleteFont(i7);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    public final b h1() {
        b bVar;
        synchronized (this.f54392f.f54412b) {
            try {
                t0 t0Var = this.f54388a;
                if (t0Var.f54401b == this.f54389b) {
                    bVar = t0Var.f54400a;
                } else {
                    bVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override
    public final void i0(byte[] bArr) {
        try {
            this.f54390c.selectableText(j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    public final synchronized byte[] j1(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = this.f54391e.toByteArray();
        this.f54391e.reset();
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
                float[] H = H(readInt, createByteArray, readFloat, readInt2, z10, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloatArray(H);
                break;
            case 2:
                float q02 = q0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloat(q02);
                break;
            case 3:
                f1(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 4:
                y(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 5:
                R0(parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 6:
                G(parcel.createByteArray(), parcel.createByteArray(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                K0(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 8:
                i0(parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 9:
                w0(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 10:
                u0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                break;
            case 11:
                byte[] B = B(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(B);
                break;
            case 12:
                E(parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return super.onTransact(i7, parcel, parcel2, i10);
        }
        return true;
    }

    @Override
    public final float q0(final int i7, final byte[] bArr) {
        return ((Float) i1(new o0() {
            @Override
            public final Object run() {
                r0 r0Var = r0.this;
                r0Var.getClass();
                byte[] bArr2 = bArr;
                if (bArr2 != null && bArr2.length <= 262144) {
                    return Float.valueOf(r0Var.f54390c.textWidth(i7, bArr2));
                }
                throw new IllegalArgumentException("Text too long");
            }
        })).floatValue();
    }

    @Override
    public final void u0(int i7, int i10, int i11, int[] iArr) {
        try {
            WidgetSandboxBackend widgetSandboxBackend = this.f54390c;
            if (iArr == null) {
                iArr = new int[0];
            }
            widgetSandboxBackend.canvasRun(i7, i10, i11, iArr);
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final void w0(int i7, byte[] bArr) {
        try {
            this.f54390c.signal(i7, j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final void y(int i7, int i10, int i11, byte[] bArr) {
        try {
            this.f54390c.defineImage(i7, i10, i11, j1(bArr));
        } catch (Throwable th2) {
            throw new IllegalStateException(th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
