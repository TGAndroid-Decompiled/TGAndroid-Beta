package zf;

import android.os.IBinder;
import android.os.Parcel;
public final class c implements e {
    public IBinder f60158a;

    @Override
    public final IBinder asBinder() {
        return this.f60158a;
    }

    public final boolean h1(b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongBinder(bVar);
            boolean z9 = false;
            this.f60158a.transact(3, obtain, obtain2, 0);
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

    public final boolean i1() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0L);
            boolean z9 = false;
            this.f60158a.transact(2, obtain, obtain2, 0);
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
}
