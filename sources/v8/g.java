package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(12);
    public final int f48278a;
    public final String f48279b;
    public final CommonWalletObject f48280c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f48278a = i10;
        this.f48279b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7453a = str;
            this.f48280c = commonWalletObject2;
            return;
        }
        this.f48280c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f48278a);
        f0.l(parcel, 3, this.f48279b);
        f0.k(parcel, 4, this.f48280c, i10);
        f0.r(parcel, q6);
    }
}
