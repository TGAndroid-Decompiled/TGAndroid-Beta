package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f51180a;
    public final GoogleSignInAccount f51181b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f51181b = googleSignInAccount;
        this.f51180a = status;
    }

    @Override
    public final Status h() {
        return this.f51180a;
    }
}
