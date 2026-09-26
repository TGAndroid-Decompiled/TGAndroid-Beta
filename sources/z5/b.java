package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f48428a;
    public final GoogleSignInAccount f48429b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f48429b = googleSignInAccount;
        this.f48428a = status;
    }

    @Override
    public final Status i() {
        return this.f48428a;
    }
}
