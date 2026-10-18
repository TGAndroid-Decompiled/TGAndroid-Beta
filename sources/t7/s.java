package t7;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class s {
    public static r f46896a;

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }

    public static synchronized q c(o oVar) {
        q qVar;
        synchronized (s.class) {
            try {
                if (f46896a == null) {
                    f46896a = new r(0);
                }
                qVar = (q) f46896a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
