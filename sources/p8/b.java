package p8;

import a8.df;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import n4.x;
public final class b extends p6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new x(20);
    public final int f46817a;
    public final int f46818b;
    public final Intent f46819c;

    public b(int i10, int i11, Intent intent) {
        this.f46817a = i10;
        this.f46818b = i11;
        this.f46819c = intent;
    }

    @Override
    public final Status h() {
        if (this.f46818b == 0) {
            return Status.e;
        }
        return Status.f6465r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f46817a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f46818b);
        df.k(parcel, 3, this.f46819c, i10);
        df.r(parcel, q5);
    }
}
