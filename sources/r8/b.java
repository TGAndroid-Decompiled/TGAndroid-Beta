package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import q4.x;
public final class b extends r6.a implements r {
    public static final Parcelable.Creator<b> CREATOR = new x(12);
    public final int f55907a;
    public final int f55908b;
    public final Intent f55909c;

    public b(int i7, int i10, Intent intent) {
        this.f55907a = i7;
        this.f55908b = i10;
        this.f55909c = intent;
    }

    @Override
    public final Status a() {
        if (this.f55908b == 0) {
            return Status.f5910e;
        }
        return Status.f5913r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f55907a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f55908b);
        yb.k(parcel, 3, this.f55909c, i7);
        yb.s(parcel, r10);
    }
}
