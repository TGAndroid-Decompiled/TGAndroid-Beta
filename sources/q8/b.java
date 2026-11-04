package q8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b extends q6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new n8.g(27);
    public final int f53812a;
    public final int f53813b;
    public final Intent f53814c;

    public b(int i3, int i10, Intent intent) {
        this.f53812a = i3;
        this.f53813b = i10;
        this.f53814c = intent;
    }

    @Override
    public final Status a() {
        if (this.f53813b == 0) {
            return Status.f6577e;
        }
        return Status.f6580r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53812a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f53813b);
        j8.a.l(parcel, 3, this.f53814c, i3);
        j8.a.t(parcel, s6);
    }
}
