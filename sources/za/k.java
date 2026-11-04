package za;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import org.telegram.ui.Components.he0;
import x7.a7;
public final class k implements OnSuccessListener {
    public final int f60299a;
    public final FirebaseMessaging f60300b;

    public k(FirebaseMessaging firebaseMessaging, int i3) {
        this.f60299a = i3;
        this.f60300b = firebaseMessaging;
    }

    @Override
    public final void onSuccess(Object obj) {
        boolean z10;
        switch (this.f60299a) {
            case 0:
                u uVar = (u) obj;
                if (this.f60300b.f7948f.t() && uVar.f60332g.a() != null) {
                    synchronized (uVar) {
                        z10 = uVar.f60331f;
                    }
                    if (!z10) {
                        uVar.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f60300b;
                l6.a aVar = (l6.a) obj;
                he0 he0Var = FirebaseMessaging.f7941m;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    a7.b(aVar.f18051a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
