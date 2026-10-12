package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(14);
    public final int f49695a;
    public final String f49696b;
    public final CommonWalletObject f49697c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f49695a = i10;
        this.f49696b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7734a = str;
            this.f49697c = commonWalletObject2;
            return;
        }
        this.f49697c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f49695a);
        c0.l(parcel, 3, this.f49696b);
        c0.k(parcel, 4, this.f49697c, i10);
        c0.r(parcel, q6);
    }
}
