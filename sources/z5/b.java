package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f50716a;
    public final GoogleSignInAccount f50717b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f50717b = googleSignInAccount;
        this.f50716a = status;
    }

    @Override
    public final Status h() {
        return this.f50716a;
    }
}
