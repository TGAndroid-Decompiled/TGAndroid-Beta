package q6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new q4.x(5);
    public final int f56013a;
    public final Account f56014b;
    public final int f56015c;
    public final GoogleSignInAccount d;

    public w(int i7, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f56013a = i7;
        this.f56014b = account;
        this.f56015c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f56013a);
        bc.k(parcel, 2, this.f56014b, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f56015c);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }
}
