package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f49326a;
    public final GoogleSignInAccount f49327b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f49327b = googleSignInAccount;
        this.f49326a = status;
    }

    @Override
    public final Status h() {
        return this.f49326a;
    }
}
