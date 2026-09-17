package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f50766a;
    public final GoogleSignInAccount f50767b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f50767b = googleSignInAccount;
        this.f50766a = status;
    }

    @Override
    public final Status i() {
        return this.f50766a;
    }
}
