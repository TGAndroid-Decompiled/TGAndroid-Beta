package r8;

import a8.q;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
public abstract class c extends q implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 8);
    }

    @Override
    public final boolean i1(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 3:
                n6.a aVar = (n6.a) n7.a.a(parcel, n6.a.CREATOR);
                b bVar = (b) n7.a.a(parcel, b.CREATOR);
                n7.a.d(parcel);
                break;
            case 4:
                Status status = (Status) n7.a.a(parcel, Status.CREATOR);
                n7.a.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) n7.a.a(parcel, Status.CREATOR);
                n7.a.d(parcel);
                break;
            case 7:
                Status status3 = (Status) n7.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) n7.a.a(parcel, GoogleSignInAccount.CREATOR);
                n7.a.d(parcel);
                break;
            case 8:
                n7.a.d(parcel);
                V0((h) n7.a.a(parcel, h.CREATOR));
                break;
            case 9:
                f fVar = (f) n7.a.a(parcel, f.CREATOR);
                n7.a.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
