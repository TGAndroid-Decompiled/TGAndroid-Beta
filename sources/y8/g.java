package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int f59284a;
    public final String f59285b;
    public final CommonWalletObject f59286c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f59284a = i7;
        this.f59285b = str2;
        if (i7 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7732a = str;
            this.f59286c = commonWalletObject2;
            return;
        }
        this.f59286c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f59284a);
        xb.l(parcel, 3, this.f59285b);
        xb.k(parcel, 4, this.f59286c, i7);
        xb.s(parcel, r10);
    }
}
