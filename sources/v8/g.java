package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(14);
    public final int f49457a;
    public final String f49458b;
    public final CommonWalletObject f49459c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f49457a = i10;
        this.f49458b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7736a = str;
            this.f49459c = commonWalletObject2;
            return;
        }
        this.f49459c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f49457a);
        d0.l(parcel, 3, this.f49458b);
        d0.k(parcel, 4, this.f49459c, i10);
        d0.r(parcel, q6);
    }
}
