package w7;

import android.os.Parcel;
import android.os.RemoteException;
public abstract class x {
    public static void a(m4.m mVar) {
        if (mVar != null) {
            try {
                m4.l lVar = (m4.l) mVar;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(0);
                lVar.f15505a.transact(3006, obtain, null, 1);
                obtain.recycle();
            } catch (RemoteException unused) {
            }
        }
    }
}
