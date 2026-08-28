package s6;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import g7.q8;
public final class b extends j {
    public static final com.google.android.gms.common.api.e f47452l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new b7.d(13), new Object());
    public final String f47453k;

    public b(Context context, h5.i iVar) {
        super(context, f47452l, iVar, com.google.android.gms.common.api.i.f2753c);
        this.f47453k = e.a();
    }

    public final h5.g f(Intent intent) {
        y5.b a2;
        Status status = Status.h;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            y5.b bVar = null;
            if (byteArrayExtra == null) {
                a2 = null;
            } else {
                a2 = q8.a(byteArrayExtra, creator);
            }
            Status status2 = (Status) a2;
            if (status2 != null) {
                if (status2.b()) {
                    Parcelable.Creator<h5.g> creator2 = h5.g.CREATOR;
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                    if (byteArrayExtra2 != null) {
                        bVar = q8.a(byteArrayExtra2, creator2);
                    }
                    h5.g gVar = (h5.g) bVar;
                    if (gVar != null) {
                        return gVar;
                    }
                    throw new com.google.android.gms.common.api.f(status);
                }
                throw new com.google.android.gms.common.api.f(status2);
            }
            throw new com.google.android.gms.common.api.f(Status.f2740r);
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
