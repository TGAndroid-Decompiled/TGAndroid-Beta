package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f48430a;
    public final GoogleSignInAccount f48431b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f48431b = googleSignInAccount;
        this.f48430a = status;
    }

    @Override
    public final Status i() {
        return this.f48430a;
    }
}
