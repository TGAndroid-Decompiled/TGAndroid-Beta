package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f47274a;
    public final GoogleSignInAccount f47275b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f47275b = googleSignInAccount;
        this.f47274a = status;
    }

    @Override
    public final Status i() {
        return this.f47274a;
    }
}
