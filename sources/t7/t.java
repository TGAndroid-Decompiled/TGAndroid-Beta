package t7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class t extends q6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<t> CREATOR = new m(2);
    public final Status f54980a;

    public t(Status status) {
        this.f54980a = status;
    }

    @Override
    public final Status a() {
        return this.f54980a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f54980a, i3);
        j8.a.t(parcel, s6);
    }
}
