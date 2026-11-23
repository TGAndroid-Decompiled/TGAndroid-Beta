package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class y0 extends j1.b {
    public static final Parcelable.Creator<y0> CREATOR = new c5.j(4);
    public Parcelable f59260c;

    public y0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f59260c = parcel.readParcelable(classLoader == null ? o0.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f59260c, 0);
    }
}
