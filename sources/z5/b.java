package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f48412a;
    public final GoogleSignInAccount f48413b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f48413b = googleSignInAccount;
        this.f48412a = status;
    }

    @Override
    public final Status i() {
        return this.f48412a;
    }
}
