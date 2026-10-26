package s7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
public final class v extends p6.a implements com.google.android.gms.common.api.q {
    public static final Parcelable.Creator<v> CREATOR = new m(4);
    public final Status f47928a;

    public v(Status status) {
        this.f47928a = status;
    }

    @Override
    public final Status h() {
        return this.f47928a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f47928a, i10);
        df.r(parcel, q5);
    }
}
