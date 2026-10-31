package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f54627a;
    public final GoogleSignInAccount f54628b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f54628b = googleSignInAccount;
        this.f54627a = status;
    }

    @Override
    public final Status a() {
        return this.f54627a;
    }
}
