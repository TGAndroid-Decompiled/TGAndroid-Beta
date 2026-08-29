package u6;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.play_billing.r1;
public final class b extends j {
    public static final com.google.android.gms.common.api.e f49116l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new b6.b(15), new Object());
    public final String f49117k;

    public b(Context context, j5.h hVar) {
        super(context, f49116l, hVar, com.google.android.gms.common.api.i.f3767c);
        this.f49117k = e.a();
    }

    public final j5.g f(Intent intent) {
        a6.c a2;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            a6.c cVar = null;
            if (byteArrayExtra == null) {
                a2 = null;
            } else {
                a2 = r1.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a2;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<j5.g> creator2 = j5.g.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        cVar = r1.a(byteArrayExtra2, creator2);
                    }
                    j5.g gVar = (j5.g) cVar;
                    if (gVar != null) {
                        return gVar;
                    }
                    throw new com.google.android.gms.common.api.f(status);
                }
                throw new com.google.android.gms.common.api.f(status2);
            }
            throw new com.google.android.gms.common.api.f(Status.f3754r);
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
