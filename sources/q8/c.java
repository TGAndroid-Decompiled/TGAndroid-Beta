package q8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.o;
public abstract class c extends o implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 6);
    }

    @Override
    public final boolean I0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 3:
                m6.a aVar = (m6.a) m7.a.a(parcel, m6.a.CREATOR);
                b bVar = (b) m7.a.a(parcel, b.CREATOR);
                m7.a.d(parcel);
                break;
            case 4:
                Status status = (Status) m7.a.a(parcel, Status.CREATOR);
                m7.a.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) m7.a.a(parcel, Status.CREATOR);
                m7.a.d(parcel);
                break;
            case 7:
                Status status3 = (Status) m7.a.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) m7.a.a(parcel, GoogleSignInAccount.CREATOR);
                m7.a.d(parcel);
                break;
            case 8:
                m7.a.d(parcel);
                Y((h) m7.a.a(parcel, h.CREATOR));
                break;
            case 9:
                f fVar = (f) m7.a.a(parcel, f.CREATOR);
                m7.a.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
