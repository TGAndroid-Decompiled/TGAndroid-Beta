package t6;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import h7.s8;

public final class b extends j {

    public static final com.google.android.gms.common.api.e f48101l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a6.b(15), new com.google.android.gms.common.api.d());

    public final String f48102k;

    public b(Context context, h5.i iVar) {
        super(context, f48101l, iVar, com.google.android.gms.common.api.i.f3198c);
        this.f48102k = e.a();
    }

    public final h5.g f(Intent intent) throws com.google.android.gms.common.api.f {
        Status status = Status.h;
        if (intent == null) {
            throw new com.google.android.gms.common.api.f(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : s8.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new com.google.android.gms.common.api.f(Status.f3185r);
        }
        if (!status2.b()) {
            throw new com.google.android.gms.common.api.f(status2);
        }
        Parcelable.Creator<h5.g> creator2 = h5.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        h5.g gVar = (h5.g) (byteArrayExtra2 != null ? s8.a(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
