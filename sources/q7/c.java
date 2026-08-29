package q7;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class c {
    public static final int f46417a = 0;

    static {
        c.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
