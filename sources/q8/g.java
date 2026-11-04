package q8;

import android.os.Parcel;
import android.os.Parcelable;
import p6.w;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new n8.g(29);
    public final int f53817a;
    public final w f53818b;

    public g(int i3, w wVar) {
        this.f53817a = i3;
        this.f53818b = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53817a);
        j8.a.l(parcel, 2, this.f53818b, i3);
        j8.a.t(parcel, s6);
    }
}
