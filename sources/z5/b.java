package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f50796a;
    public final GoogleSignInAccount f50797b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f50797b = googleSignInAccount;
        this.f50796a = status;
    }

    @Override
    public final Status i() {
        return this.f50796a;
    }
}
