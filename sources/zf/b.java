package zf;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
public final class b extends Binder implements IInterface {
    public final Handler f60047a;
    public final sa.d f60048b;

    public b(sa.d dVar) {
        this.f60048b = dVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.f60047a = new Handler(Looper.getMainLooper());
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        Handler handler = this.f60047a;
        Bundle bundle = null;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        if (i7 != 1598968902) {
                            return super.onTransact(i7, parcel, parcel2, i10);
                        }
                        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                        return true;
                    }
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    handler.post(new a(this, readString, bundle, 3));
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                handler.post(new a(this, bundle));
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            handler.post(new a(this, readString2, bundle, 1));
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        handler.post(new a(this, readInt, bundle));
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
