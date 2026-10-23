package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f51181a;
    public final GoogleSignInAccount f51182b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f51182b = googleSignInAccount;
        this.f51181a = status;
    }

    @Override
    public final Status h() {
        return this.f51181a;
    }
}
