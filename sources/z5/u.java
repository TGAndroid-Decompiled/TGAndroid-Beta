package z5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class u extends a6.a {
    public static final Parcelable.Creator<u> CREATOR = new w5.k(17);
    public final int f50680a;
    public final Account f50681b;
    public final int f50682c;
    public final GoogleSignInAccount d;

    public u(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f50680a = i10;
        this.f50681b = account;
        this.f50682c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f50680a);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f50681b, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f50682c);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
