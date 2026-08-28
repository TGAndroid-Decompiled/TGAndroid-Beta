package p5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import o5.o;
public abstract class i {
    public static final q5.b f45501a = new q5.b("MediaSessionUtils", null);

    public static ArrayList a(o oVar) {
        try {
            Parcel O0 = oVar.O0(oVar.M0(), 3);
            ArrayList createTypedArrayList = O0.createTypedArrayList(o5.d.CREATOR);
            O0.recycle();
            return createTypedArrayList;
        } catch (RemoteException e10) {
            Object[] objArr = {"getNotificationActions", o.class.getSimpleName()};
            q5.b bVar = f45501a;
            Log.e(bVar.f46009a, bVar.d("Unable to call %s on %s.", objArr), e10);
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
            q5.b bVar = f45501a;
            Log.e(bVar.f46009a, bVar.d("Unable to call %s on %s.", objArr), e10);
            return null;
        }
    }
}
