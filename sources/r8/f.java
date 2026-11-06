package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import q4.x;
public final class f extends r6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List f54335a;
    public final String f54336b;

    public f(String str, ArrayList arrayList) {
        this.f54335a = arrayList;
        this.f54336b = str;
    }

    @Override
    public final Status a() {
        if (this.f54336b != null) {
            return Status.f6525e;
        }
        return Status.f6528r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.n(parcel, 1, this.f54335a);
        wb.l(parcel, 2, this.f54336b);
        wb.s(parcel, r10);
    }
}
