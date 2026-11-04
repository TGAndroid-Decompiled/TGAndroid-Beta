package r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
public final class i extends q6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new q8.i(5);
    public Status f54416a;
    public ArrayList f54417b;
    public String[] f54418c;

    @Override
    public final Status a() {
        return this.f54416a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f54416a, i3);
        j8.a.q(parcel, 2, this.f54417b);
        j8.a.n(parcel, 3, this.f54418c);
        j8.a.t(parcel, s6);
    }
}
