package q4;

import android.os.IBinder;
import android.os.Parcel;
public final class a implements b {
    public IBinder f53764a;

    @Override
    public final void S0(w wVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            wVar.writeToParcel(obtain, 0);
            if (!this.f53764a.transact(3, obtain, null, 1)) {
                int i7 = e.f53766b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f53764a;
    }

    @Override
    public final void e(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            if (!this.f53764a.transact(9, obtain, null, 1)) {
                int i10 = e.f53766b;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void j(int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i7);
            if (!this.f53764a.transact(12, obtain, null, 1)) {
                int i10 = e.f53766b;
            }
        } finally {
            obtain.recycle();
        }
    }
}
