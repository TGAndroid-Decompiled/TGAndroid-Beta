package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(14);
    public final int f49546a;
    public final String f49547b;
    public final CommonWalletObject f49548c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f49546a = i10;
        this.f49547b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7735a = str;
            this.f49548c = commonWalletObject2;
            return;
        }
        this.f49548c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f49546a);
        d0.l(parcel, 3, this.f49547b);
        d0.k(parcel, 4, this.f49548c, i10);
        d0.r(parcel, q6);
    }
}
