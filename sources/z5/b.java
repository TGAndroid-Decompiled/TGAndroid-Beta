package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f53802a;
    public final GoogleSignInAccount f53803b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f53803b = googleSignInAccount;
        this.f53802a = status;
    }

    @Override
    public final Status i() {
        return this.f53802a;
    }
}
