package p4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.hb;
public final class k implements l {
    public IBinder f55357a;

    @Override
    public final IBinder asBinder() {
        return this.f55357a;
    }

    public final void h1(int i7, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            hb.a(obtain, bundle);
            this.f55357a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
