package x8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new w8.b(20);
    public final int f58540a;
    public final String f58541b;
    public final CommonWalletObject f58542c;

    public g(int i3, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f58540a = i3;
        this.f58541b = str2;
        if (i3 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7787a = str;
            this.f58542c = commonWalletObject2;
            return;
        }
        this.f58542c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f58540a);
        j8.a.m(parcel, 3, this.f58541b);
        j8.a.l(parcel, 4, this.f58542c, i3);
        j8.a.t(parcel, s6);
    }
}
