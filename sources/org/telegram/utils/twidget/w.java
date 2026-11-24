package org.telegram.utils.twidget;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Semaphore;
public final class w extends Binder implements jj5 {
    public final yvc a;
    public final WidgetSandboxBackend b;
    public volatile long c;
    public final ByteArrayOutputStream d;
    public final Semaphore e;
    public double f;
    public long i;
    public final x j;

    public w(x xVar, yvc yvcVar, WidgetSandboxBackend widgetSandboxBackend) {
        this.j = xVar;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngineCallback");
        this.d = new ByteArrayOutputStream();
        this.e = new Semaphore(4);
        this.f = 2000.0d;
        this.i = SystemClock.elapsedRealtime();
        this.a = yvcVar;
        this.b = widgetSandboxBackend;
    }

    @Override
    public final void B(int i, byte[] bArr) {
        a(new s(this, bArr, i, (byte) 0));
    }

    @Override
    public final void E(final int i, final int i2, final byte[] bArr) {
        a(new xvc() {
            @Override
            public final Object run() {
                w wVar = w.this;
                wVar.b.recordLayer(i, i2, wVar.b(bArr));
                return null;
            }
        });
    }

    @Override
    public final void I(byte[] bArr) {
        a(new cwb(this, bArr, (byte) 13));
    }

    @Override
    public final void J(int i, float f) {
        try {
            this.b.state(i, f);
        } catch (Throwable unused) {
        }
    }

    @Override
    public final void O(int i) {
        a(new q(this, i, (byte) 0));
    }

    public final Object a(xvc xvcVar) {
        if (this.a.w == 0) {
            this.a.w = Binder.getCallingPid();
        }
        if (this.e.tryAcquire()) {
            try {
                if (this.j.i.tryAcquire()) {
                    Object run = xvcVar.run();
                    this.j.i.release();
                    return run;
                }
                throw new IllegalStateException("Widget engine: too many calls at once");
            } finally {
            }
        } else {
            sc8.j("Widget engine: too many calls at once");
            return null;
        }
    }

    public final synchronized byte[] b(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = this.d.toByteArray();
        this.d.reset();
        return byteArray;
    }

    @Override
    public final void m(int i, int i2, int i3, byte[] bArr) {
        a(new i(this, i, i2, i3, bArr, (byte) 1));
    }

    @Override
    public final byte[] n(final int i, final int i2, final int i3, final int i4, final int i5) {
        return (byte[]) a(new xvc() {
            @Override
            public final Object run() {
                return w.this.b.canvasRead(i, i2, i3, i4, i5);
            }
        });
    }

    @Override
    public final void o(int i) {
        a(new q(this, i, (byte) 1));
    }

    @Override
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.telegram.utils.twidget.IWidgetEngineCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.telegram.utils.twidget.IWidgetEngineCallback");
            return true;
        }
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                float readFloat = parcel.readFloat();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                float[] q = q(readInt, createByteArray, readFloat, readInt2, z, parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloatArray(q);
                break;
            case 2:
                float y = y(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeFloat(y);
                break;
            case 3:
                O(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 4:
                m(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 5:
                I(parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 6:
                p(parcel.createByteArray(), parcel.createByteArray(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                E(parcel.readInt(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 8:
                w(parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 9:
                B(parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                break;
            case 10:
                J(parcel.readInt(), parcel.readFloat());
                break;
            case 11:
                z(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                break;
            case 12:
                byte[] n = n(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(n);
                break;
            case 13:
                o(parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    @Override
    public final void p(final byte[] bArr, final byte[] bArr2, final double d, final int i, final int i2, final float f, final float f2, final int i3, final int i4) {
        a(new xvc() {
            @Override
            public final Object run() {
                int i5;
                w wVar = w.this;
                byte[] b = wVar.b(bArr);
                int i6 = i;
                if (i6 >= 0 && (i5 = i2) >= 0 && i6 <= 16384 && i5 <= 16384) {
                    float f3 = f;
                    if (f3 > 0.0f && f3 <= 10.0f) {
                        WidgetSandboxBackend widgetSandboxBackend = wVar.b;
                        byte[] bArr3 = bArr2;
                        if (bArr3 == null) {
                            bArr3 = new byte[]{123, 125};
                        }
                        widgetSandboxBackend.record(b, bArr3, d, i6, i5, f3, f2, i3, i4);
                        return null;
                    }
                }
                w26.j("Frame size");
                return null;
            }
        });
    }

    @Override
    public final float[] q(final int i, final byte[] bArr, final float f, final int i2, final boolean z, final byte[] bArr2) {
        return (float[]) a(new xvc() {
            @Override
            public final Object run() {
                return w.this.b.defineFont(i, bArr, f, i2, z, bArr2);
            }
        });
    }

    @Override
    public final void w(byte[] bArr) {
        a(new l(this, bArr, (byte) 2));
    }

    @Override
    public final float y(int i, byte[] bArr) {
        return ((Float) a(new s(this, bArr, i, (byte) 1))).floatValue();
    }

    @Override
    public final void z(int i, int i2, int i3, int[] iArr) {
        a(new i(this, i, i2, i3, iArr, (byte) 2));
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
