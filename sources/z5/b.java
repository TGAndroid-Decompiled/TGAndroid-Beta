package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f52464a;
    public final GoogleSignInAccount f52465b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f52465b = googleSignInAccount;
        this.f52464a = status;
    }

    @Override
    public final Status i() {
        return this.f52464a;
    }
}
