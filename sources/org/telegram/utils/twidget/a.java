package org.telegram.utils.twidget;

import android.os.IBinder;
import android.os.Parcel;
public final class a implements b {
    public IBinder f54155a;

    @Override
    public final void H0(long j3, float f10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeFloat(f10);
            this.f54155a.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void K(long j3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            this.f54155a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void N0(long j3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            this.f54155a.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void S(long j3, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeByteArray(bArr);
            this.f54155a.transact(6, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void Z0(long j3, int i7, float f10, float f11, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeInt(i7);
            obtain.writeFloat(f10);
            obtain.writeFloat(f11);
            obtain.writeInt(i10);
            this.f54155a.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f54155a;
    }

    @Override
    public final void b1() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            this.f54155a.transact(13, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d1(long j3, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeByteArray(bArr);
            this.f54155a.transact(7, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void f0(long j3, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeByteArray(bArr);
            this.f54155a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void k0(long j3, int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeInt(i7);
            obtain.writeFloat(f10);
            obtain.writeFloat(f11);
            obtain.writeInt(i10);
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeInt(z11 ? 1 : 0);
            obtain.writeInt(i11);
            obtain.writeInt(i12);
            this.f54155a.transact(11, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void s(long j3, float f10, boolean z10, boolean z11, boolean z12) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeFloat(f10);
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeInt(z11 ? 1 : 0);
            obtain.writeInt(z12 ? 1 : 0);
            this.f54155a.transact(10, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final long t(byte[] bArr, byte[] bArr2, float f10, float f11, int i7, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z10, d dVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeByteArray(bArr);
            obtain.writeByteArray(bArr2);
            obtain.writeFloat(f10);
            obtain.writeFloat(f11);
            obtain.writeInt(i7);
            obtain.writeByteArray(bArr3);
            obtain.writeByteArray(bArr4);
            obtain.writeByteArray(bArr5);
            obtain.writeByteArray(bArr6);
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeStrongInterface(dVar);
            this.f54155a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void u(long j3, long j10, int i7, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeLong(j10);
            obtain.writeInt(i7);
            obtain.writeByteArray(bArr);
            this.f54155a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void v(boolean z10, boolean z11, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeInt(0);
            obtain.writeInt(0);
            obtain.writeByteArray(null);
            this.f54155a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final void v0(long j3, boolean z10) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.telegram.utils.twidget.IWidgetEngine");
            obtain.writeLong(j3);
            obtain.writeInt(z10 ? 1 : 0);
            this.f54155a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
