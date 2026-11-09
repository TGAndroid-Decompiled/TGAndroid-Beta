package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import q4.x;
public final class f extends r6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List f54439a;
    public final String f54440b;

    public f(String str, ArrayList arrayList) {
        this.f54439a = arrayList;
        this.f54440b = str;
    }

    @Override
    public final Status a() {
        if (this.f54440b != null) {
            return Status.f6523e;
        }
        return Status.f6526r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.n(parcel, 1, this.f54439a);
        xb.l(parcel, 2, this.f54440b);
        xb.s(parcel, r10);
    }
}
