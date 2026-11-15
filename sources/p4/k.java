package p4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.ab;
public final class k implements l {
    public IBinder f54754a;

    @Override
    public final IBinder asBinder() {
        return this.f54754a;
    }

    public final void h1(int i7, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ab.a(obtain, bundle);
            this.f54754a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
