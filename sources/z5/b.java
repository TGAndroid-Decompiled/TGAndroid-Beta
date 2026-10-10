package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f53614a;
    public final GoogleSignInAccount f53615b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f53615b = googleSignInAccount;
        this.f53614a = status;
    }

    @Override
    public final Status i() {
        return this.f53614a;
    }
}
