package y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class y implements IInterface {

    public final IBinder f49709a;

    public y(IBinder iBinder) {
        this.f49709a = iBinder;
    }

    public final void E0(b0 b0Var, f fVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(b0Var);
            parcelObtain.writeInt(1);
            w7.f.a(fVar, parcelObtain, 0);
            this.f49709a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f49709a;
    }
}
