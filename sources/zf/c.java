package zf;

import android.os.IBinder;
import android.os.Parcel;
public final class c implements e {
    public IBinder f60049a;

    public final boolean H0(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongBinder(bVar);
            boolean z9 = false;
            this.f60049a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z9 = true;
            }
            return z9;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean I0() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0L);
            boolean z9 = false;
            this.f60049a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z9 = true;
            }
            return z9;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f60049a;
    }
}
