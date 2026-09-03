package w6;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import j7.h5;
public final class b extends j {
    public static final com.google.android.gms.common.api.e f49473l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a8.j(19), new Object());
    public final String f49474k;

    public b(Context context, l5.h hVar) {
        super(context, f49473l, hVar, com.google.android.gms.common.api.i.f2658c);
        this.f49474k = e.a();
    }

    public final l5.g f(Intent intent) {
        c6.b a2;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            c6.b bVar = null;
            if (byteArrayExtra == null) {
                a2 = null;
            } else {
                a2 = h5.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a2;
            if (status2 != null) {
                if (status2.e()) {
                    Parcelable.Creator<l5.g> creator2 = l5.g.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        bVar = h5.a(byteArrayExtra2, creator2);
                    }
                    l5.g gVar = (l5.g) bVar;
                    if (gVar != null) {
                        return gVar;
                    }
                    throw new com.google.android.gms.common.api.f(status);
                }
                throw new com.google.android.gms.common.api.f(status2);
            }
            throw new com.google.android.gms.common.api.f(Status.f2645r);
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
