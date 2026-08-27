package p5;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import o5.o;

public abstract class i {

    public static final r5.b f45507a = new r5.b("MediaSessionUtils", null);

    public static ArrayList a(o oVar) {
        try {
            Parcel parcelO0 = oVar.O0(oVar.M0(), 3);
            ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(o5.d.CREATOR);
            parcelO0.recycle();
            return arrayListCreateTypedArrayList;
        } catch (RemoteException e9) {
            Object[] objArr = {"getNotificationActions", o.class.getSimpleName()};
            r5.b bVar = f45507a;
            Log.e(bVar.f46768a, bVar.d("Unable to call %s on %s.", objArr), e9);
            return null;
        }
    }

    public static int[] b(o oVar) {
        try {
            Parcel parcelO0 = oVar.O0(oVar.M0(), 4);
            int[] iArrCreateIntArray = parcelO0.createIntArray();
            parcelO0.recycle();
            return iArrCreateIntArray;
        } catch (RemoteException e9) {
            Object[] objArr = {"getCompactViewActionIndices", o.class.getSimpleName()};
            r5.b bVar = f45507a;
            Log.e(bVar.f46768a, bVar.d("Unable to call %s on %s.", objArr), e9);
            return null;
        }
    }
}
