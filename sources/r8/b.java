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
    public final int f54436a;
    public final int f54437b;
    public final Intent f54438c;

    public b(int i7, int i10, Intent intent) {
        this.f54436a = i7;
        this.f54437b = i10;
        this.f54438c = intent;
    }

    @Override
    public final Status a() {
        if (this.f54437b == 0) {
            return Status.f6523e;
        }
        return Status.f6526r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f54436a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f54437b);
        xb.k(parcel, 3, this.f54438c, i7);
        xb.s(parcel, r10);
    }
}
