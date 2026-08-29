package z5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
public final class y implements IInterface {
    public final IBinder f50692a;

    public y(IBinder iBinder) {
        this.f50692a = iBinder;
    }

    public final void E0(b0 b0Var, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(b0Var);
            obtain.writeInt(1);
            w5.k.a(fVar, obtain, 0);
            this.f50692a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f50692a;
    }
}
