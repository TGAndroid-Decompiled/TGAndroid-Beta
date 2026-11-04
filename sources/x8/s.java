package x8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class s extends q6.a {
    public static final Parcelable.Creator<s> CREATOR = new w8.b(11);
    public String f58583a;
    public Bundle f58584b;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f58583a);
        j8.a.c(parcel, 3, this.f58584b);
        j8.a.t(parcel, s6);
    }
}
