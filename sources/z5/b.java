package z5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class b implements q {
    public final Status f52443a;
    public final GoogleSignInAccount f52444b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f52444b = googleSignInAccount;
        this.f52443a = status;
    }

    @Override
    public final Status i() {
        return this.f52443a;
    }
}
