package w7;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class u {
    public static void a(m4.i iVar) {
        try {
            m4.h hVar = (m4.h) iVar;
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(0);
            hVar.f15947a.transact(3006, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException unused) {
        }
    }
}
