package org.telegram.utils.twidget;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
public final class o0 extends Binder implements d {
    public final q0 f52942a;
    public final int f52943b;
    public final WidgetSandboxBackend f52944c;
    public volatile long d;
    public final ByteArrayOutputStream f52945e;
    public final r0 f52946f;

    public o0(r0 r0Var, q0 q0Var, int i7, WidgetSandboxBackend widgetSandboxBackend) {
        this.f52946f = r0Var;
        attachInterface(this, "org.telegram.utils.twidget.IWidgetEngineCallback");
        this.f52945e = new ByteArrayOutputStream();
        this.f52942a = q0Var;
        this.f52943b = i7;
        this.f52944c = widgetSandboxBackend;
    }

    @Override
    public final byte[] A(int i7, int i10, int i11, int i12, int i13) {
        try {
            return this.f52944c.canvasRead(i7, i10, i11, i12, i13);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final void D(int i7) {
        try {
            this.f52944c.canvasRelease(i7);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final void F(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        byte[] i13 = i1(bArr);
        try {
            if (i7 >= 0 && i10 >= 0 && i7 <= 16384 && i10 <= 16384 && f10 > 0.0f && f10 <= 10.0f) {
                WidgetSandboxBackend widgetSandboxBackend = this.f52944c;
                if (bArr2 == null) {
                    bArr2 = new byte[]{123, 125};
                }
                widgetSandboxBackend.record(i13, bArr2, d, i7, i10, f10, f11, i11, i12);
                return;
            }
            throw new IllegalArgumentException("Frame size");
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final float[] G(int i7, byte[] bArr, float f10, int i10, boolean z9, byte[] bArr2) {
        try {
            return this.f52944c.defineFont(i7, bArr, f10, i10, z9, bArr2);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final void J0(int i7, int i10, byte[] bArr) {
        try {
            this.f52944c.recordLayer(i7, i10, i1(bArr));
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final synchronized void Q0(byte[] bArr) {
        if (bArr != null) {
            if (this.f52945e.size() + bArr.length <= 16777216) {
                this.f52945e.write(bArr, 0, bArr.length);
            }
        }
        this.f52945e.reset();
        throw new IllegalStateException("Widget engine: argument too large");
    }

    @Override
    public final void Z0(int i7, Bitmap bitmap) {
        try {
            this.f52944c.defineImage(i7, bitmap);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final void f1(int i7) {
        this.f52944c.deleteFont(i7);
    }

    @Override
    public final void h0(byte[] bArr) {
        try {
            this.f52944c.selectableText(i1(bArr));
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    public final b h1() {
        b bVar;
        synchronized (this.f52946f.f52969b) {
            try {
                q0 q0Var = this.f52942a;
                if (q0Var.f52957b == this.f52943b) {
                    bVar = q0Var.f52956a;
                } else {
                    bVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final synchronized byte[] i1(byte[] bArr) {
        if (bArr != null) {
            return bArr;
        }
        byte[] byteArray = this.f52945e.toByteArray();
        this.f52945e.reset();
        return byteArray;
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        boolean z9;
        Object obj;
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
                    z9 = true;
                } else {
                    z9 = false;
                }
                float[] G = G(readInt, createByteArray, readFloat, readInt2, z9, parcel.createByteArray());
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
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator = Bitmap.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                Z0(readInt3, (Bitmap) obj);
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
                t0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray());
                parcel2.writeNoException();
                break;
            case 11:
                byte[] A = A(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(A);
                break;
            case 12:
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
        if (bArr != null) {
            try {
                if (bArr.length <= 262144) {
                    return this.f52944c.textWidth(i7, bArr);
                }
            } catch (Exception e10) {
                throw new IllegalStateException(e10.toString());
            }
        }
        throw new IllegalArgumentException("Text too long");
    }

    @Override
    public final void t0(int i7, int i10, int i11, int[] iArr) {
        try {
            WidgetSandboxBackend widgetSandboxBackend = this.f52944c;
            if (iArr == null) {
                iArr = new int[0];
            }
            widgetSandboxBackend.canvasRun(i7, i10, i11, iArr);
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final void v0(int i7, byte[] bArr) {
        try {
            this.f52944c.signal(i7, i1(bArr));
        } catch (Exception e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
