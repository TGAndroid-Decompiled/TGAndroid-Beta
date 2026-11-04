package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class z implements IInterface {
    public final IBinder f53334a;

    public z(IBinder iBinder) {
        this.f53334a = iBinder;
    }

    public final void H0(d0 d0Var, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(d0Var);
            obtain.writeInt(1);
            n8.g.a(gVar, obtain, 0);
            this.f53334a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f53334a;
    }
}
