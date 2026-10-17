package w7;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class w {
    public static void a(m4.l lVar) {
        if (lVar != null) {
            try {
                m4.k kVar = (m4.k) lVar;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                kVar.f16588a.transact(3006, obtain, null, 1);
                obtain.recycle();
            } catch (RemoteException unused) {
            }
        }
    }
}
