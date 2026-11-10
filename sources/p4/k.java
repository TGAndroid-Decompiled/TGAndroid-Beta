package p4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.ya;
public final class k implements l {
    public IBinder f53348a;

    @Override
    public final IBinder asBinder() {
        return this.f53348a;
    }

    public final void h1(int i7, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ya.a(obtain, bundle);
            this.f53348a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
