package p6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class w extends q6.a {
    public static final Parcelable.Creator<w> CREATOR = new n8.g(20);
    public final int f53322a;
    public final Account f53323b;
    public final int f53324c;
    public final GoogleSignInAccount d;

    public w(int i3, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f53322a = i3;
        this.f53323b = account;
        this.f53324c = i10;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f53322a);
        j8.a.l(parcel, 2, this.f53323b, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f53324c);
        j8.a.l(parcel, 4, this.d, i3);
        j8.a.t(parcel, s6);
    }
}
