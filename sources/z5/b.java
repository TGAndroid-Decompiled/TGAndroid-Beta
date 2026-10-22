package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f50719a;
    public final GoogleSignInAccount f50720b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f50720b = googleSignInAccount;
        this.f50719a = status;
    }

    @Override
    public final Status h() {
        return this.f50719a;
    }
}
