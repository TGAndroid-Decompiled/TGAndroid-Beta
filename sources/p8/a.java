package p8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class a implements c, IInterface {
    public final IBinder f41059a;

    public a(IBinder iBinder) {
        this.f41059a = iBinder;
    }

    public final Parcel E0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f41059a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f41059a;
    }
}
