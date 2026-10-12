package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends i1.c {
    public static final Parcelable.Creator<v0> CREATOR = new i1.b(3);
    public Parcelable f44971c;

    public v0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f44971c = parcel.readParcelable(classLoader == null ? n0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f44971c, 0);
    }
}
