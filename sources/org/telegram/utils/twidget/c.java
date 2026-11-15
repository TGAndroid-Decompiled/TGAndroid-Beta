package org.telegram.utils.twidget;

import android.os.IBinder;
import android.os.Parcel;
public final class c implements d {
    public IBinder f54168a;

    @Override
    public final byte[] B(int i7, int i10, int i11, int i12, int i13) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            obtain.writeInt(i13);
            this.f54168a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void E(int i7) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            this.f54168a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void G(byte[] bArr, byte[] bArr2, double d, int i7, int i10, float f10, float f11, int i11, int i12) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeByteArray(bArr);
            obtain.writeByteArray(bArr2);
            obtain.writeDouble(d);
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeFloat(f10);
            obtain.writeFloat(f11);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            this.f54168a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final float[] H(int i7, byte[] bArr, float f10, int i10, boolean z10, byte[] bArr2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            obtain.writeByteArray(bArr);
            obtain.writeFloat(f10);
            obtain.writeInt(i10);
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr2);
            this.f54168a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createFloatArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void K0(int i7, int i10, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeByteArray(bArr);
            this.f54168a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void R0(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeByteArray(bArr);
            this.f54168a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f54168a;
    }

    @Override
    public final void f1(int i7) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            this.f54168a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void i0(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeByteArray(bArr);
            this.f54168a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final float q0(int i7, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            obtain.writeByteArray(bArr);
            this.f54168a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readFloat();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void u0(int i7, int i10, int i11, int[] iArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeIntArray(iArr);
            this.f54168a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void w0(int i7, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            obtain.writeByteArray(bArr);
            this.f54168a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void y(int i7, int i10, int i11, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngineCallback");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            obtain.writeByteArray(bArr);
            this.f54168a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
