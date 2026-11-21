package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import java.util.List;
import q4.x;
public final class f extends r6.a implements r {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List f56525a;
    public final String f56526b;

    public f(String str, ArrayList arrayList) {
        this.f56525a = arrayList;
        this.f56526b = str;
    }

    @Override
    public final Status a() {
        if (this.f56526b != null) {
            return Status.f6219e;
        }
        return Status.f6222r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.n(parcel, 1, this.f56525a);
        bc.l(parcel, 2, this.f56526b);
        bc.s(parcel, r10);
    }
}
