package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new q4.x(5);
    public final int f53946a;
    public final Account f53947b;
    public final int f53948c;
    public final GoogleSignInAccount d;

    public w(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f53946a = i7;
        this.f53947b = account;
        this.f53948c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f53946a);
        xb.k(parcel, 2, this.f53947b, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f53948c);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }
}
