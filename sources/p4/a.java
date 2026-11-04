package p4;

import android.os.IBinder;
import android.os.Parcel;
public final class a implements b {
    public IBinder f53143a;

    @Override
    public final IBinder asBinder() {
        return this.f53143a;
    }

    @Override
    public final void c(int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i3);
            if (!this.f53143a.transact(9, obtain, null, 1)) {
                int i10 = e.f53145b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void i(int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i3);
            if (!this.f53143a.transact(12, obtain, null, 1)) {
                int i10 = e.f53145b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void u0(w wVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            wVar.writeToParcel(obtain, 0);
            if (!this.f53143a.transact(3, obtain, null, 1)) {
                int i3 = e.f53145b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
