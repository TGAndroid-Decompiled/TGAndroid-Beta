package x8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new w8.b(13);
    public String f58514a;
    public String f58515b;
    public String f58516c;
    public int d;
    public UserAddress f58517e;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f58514a);
        j8.a.m(parcel, 2, this.f58515b);
        j8.a.m(parcel, 3, this.f58516c);
        int i10 = this.d;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        j8.a.l(parcel, 5, this.f58517e, i3);
        j8.a.t(parcel, s6);
    }
}
