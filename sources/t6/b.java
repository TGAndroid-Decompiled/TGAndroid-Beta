package t6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class b implements d, IInterface {
    public final IBinder f48161a;

    public b(IBinder iBinder) {
        this.f48161a = iBinder;
    }

    public final void E0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f48161a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f48161a;
    }
}
