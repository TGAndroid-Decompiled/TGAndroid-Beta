package r6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class b implements d, IInterface {
    public final IBinder f47078a;

    public b(IBinder iBinder) {
        this.f47078a = iBinder;
    }

    public final void E0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f47078a.transact(i9, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f47078a;
    }
}
