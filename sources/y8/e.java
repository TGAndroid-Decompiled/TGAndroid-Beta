package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList f61052a;
    public String f61053b;
    public String f61054c;
    public ArrayList d;
    public boolean f61055e;
    public String f61056f;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.h(parcel, 2, this.f61052a);
        bc.l(parcel, 4, this.f61053b);
        bc.l(parcel, 5, this.f61054c);
        bc.h(parcel, 6, this.d);
        boolean z10 = this.f61055e;
        bc.q(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.l(parcel, 8, this.f61056f);
        bc.s(parcel, r10);
    }
}
