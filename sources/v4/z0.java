package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class z0 extends j1.b {
    public static final Parcelable.Creator<z0> CREATOR = new c5.j(4);
    public Parcelable f59271c;

    public z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f59271c = parcel.readParcelable(classLoader == null ? p0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f59271c, 0);
    }
}
