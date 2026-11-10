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
    public final List f54438a;
    public final String f54439b;

    public f(String str, ArrayList arrayList) {
        this.f54438a = arrayList;
        this.f54439b = str;
    }

    @Override
    public final Status a() {
        if (this.f54439b != null) {
            return Status.f6528e;
        }
        return Status.f6531r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.n(parcel, 1, this.f54438a);
        xb.l(parcel, 2, this.f54439b);
        xb.s(parcel, r10);
    }
}
