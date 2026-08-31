package t5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import s5.p;
public abstract class i {
    public static final u5.b f48025a = new u5.b("MediaSessionUtils", null);

    public static ArrayList a(p pVar) {
        try {
            Parcel O0 = pVar.O0(pVar.M0(), 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(s5.d.CREATOR);
            O0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e6) {
            Object[] objArr = {"getNotificationActions", p.class.getSimpleName()};
            u5.b bVar = f48025a;
            Log.e(bVar.f48349a, bVar.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }

    public static int[] b(p pVar) {
        try {
            Parcel O0 = pVar.O0(pVar.M0(), 4);
            int[] createIntArray = O0.createIntArray();
            O0.recycle();
            return createIntArray;
        } catch (RemoteException e6) {
            Object[] objArr = {"getCompactViewActionIndices", p.class.getSimpleName()};
            u5.b bVar = f48025a;
            Log.e(bVar.f48349a, bVar.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }
}
