package y5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import h7.r8;

public final class u extends z5.a {
    public static final Parcelable.Creator<u> CREATOR = new w7.f(13);

    public final int f49697a;

    public final Account f49698b;

    public final int f49699c;
    public final GoogleSignInAccount d;

    public u(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f49697a = i10;
        this.f49698b = account;
        this.f49699c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f49697a);
        r8.k(parcel, 2, this.f49698b, i10);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f49699c);
        r8.k(parcel, 4, this.d, i10);
        r8.r(parcel, iQ);
    }
}
