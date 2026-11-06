package p4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c8.xa;
public final class k implements l {
    public IBinder f53245a;

    public final void H0(int i7, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            xa.a(obtain, bundle);
            this.f53245a.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f53245a;
    }
}
