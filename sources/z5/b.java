package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f48158a;
    public final GoogleSignInAccount f48159b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f48159b = googleSignInAccount;
        this.f48158a = status;
    }

    @Override
    public final Status i() {
        return this.f48158a;
    }
}
