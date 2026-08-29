package r7;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import j7.l1;
public abstract class a {
    public static final int f47083a = 0;

    static {
        a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(l1.k(dataAvail, "Parcel data not fully consumed, unread size: "));
    }
}
