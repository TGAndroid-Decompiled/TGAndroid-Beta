package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f48101a;
    public final GoogleSignInAccount f48102b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f48102b = googleSignInAccount;
        this.f48101a = status;
    }

    @Override
    public final Status i() {
        return this.f48101a;
    }
}
