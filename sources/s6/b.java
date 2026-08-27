package s6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class b implements d, IInterface {

    public final IBinder f47798a;

    public b(IBinder iBinder) {
        this.f47798a = iBinder;
    }

    public final void E0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f47798a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f47798a;
    }
}
