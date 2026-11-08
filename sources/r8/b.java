package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import q4.x;
public final class b extends r6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new x(12);
    public final int f54423a;
    public final int f54424b;
    public final Intent f54425c;

    public b(int i7, int i10, Intent intent) {
        this.f54423a = i7;
        this.f54424b = i10;
        this.f54425c = intent;
    }

    @Override
    public final Status a() {
        if (this.f54424b == 0) {
            return Status.f6525e;
        }
        return Status.f6528r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f54423a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f54424b);
        xb.k(parcel, 3, this.f54425c, i7);
        xb.s(parcel, r10);
    }
}
