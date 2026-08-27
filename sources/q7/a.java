package q7;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class a {

    public static final int f46172a = 0;

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
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(i0.a.k(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
