package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f50731a;
    public final GoogleSignInAccount f50732b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f50732b = googleSignInAccount;
        this.f50731a = status;
    }

    @Override
    public final Status h() {
        return this.f50731a;
    }
}
