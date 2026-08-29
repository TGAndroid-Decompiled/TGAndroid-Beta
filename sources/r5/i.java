package r5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import q5.o;
public abstract class i {
    public static final s5.b f47082a = new s5.b("MediaSessionUtils", null);

    public static ArrayList a(o oVar) {
        try {
            Parcel O0 = oVar.O0(oVar.M0(), 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(q5.d.CREATOR);
            O0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e10) {
            Object[] objArr = {"getNotificationActions", o.class.getSimpleName()};
            s5.b bVar = f47082a;
            Log.e(bVar.f47580a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }

    public static int[] b(o oVar) {
        try {
            Parcel O0 = oVar.O0(oVar.M0(), 4);
            int[] createIntArray = O0.createIntArray();
            O0.recycle();
            return createIntArray;
        } catch (RemoteException e10) {
            Object[] objArr = {"getCompactViewActionIndices", o.class.getSimpleName()};
            s5.b bVar = f47082a;
            Log.e(bVar.f47580a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
