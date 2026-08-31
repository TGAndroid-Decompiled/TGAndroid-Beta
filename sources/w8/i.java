package w8;

import android.content.Context;
import android.text.TextUtils;
import b6.m;
import java.util.Arrays;
public final class i {
    public final String f49463a;
    public final String f49464b;
    public final String f49465c;
    public final String d;
    public final String f49466e;
    public final String f49467f;
    public final String f49468g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z4;
        int i10 = i6.e.f7910a;
        if (str != null && !str.trim().isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        m.j("ApplicationId must be set.", true ^ z4);
        this.f49464b = str;
        this.f49463a = str2;
        this.f49465c = str3;
        this.d = str4;
        this.f49466e = str5;
        this.f49467f = str6;
        this.f49468g = str7;
    }

    public static i a(Context context) {
        bf.b bVar = new bf.b(context);
        String Q = bVar.Q("google_app_id");
        if (TextUtils.isEmpty(Q)) {
            return null;
        }
        return new i(Q, bVar.Q("google_api_key"), bVar.Q("firebase_database_url"), bVar.Q("ga_trackingId"), bVar.Q("gcm_defaultSenderId"), bVar.Q("google_storage_bucket"), bVar.Q("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!m.l(this.f49464b, iVar.f49464b) || !m.l(this.f49463a, iVar.f49463a) || !m.l(this.f49465c, iVar.f49465c) || !m.l(this.d, iVar.d) || !m.l(this.f49466e, iVar.f49466e) || !m.l(this.f49467f, iVar.f49467f) || !m.l(this.f49468g, iVar.f49468g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49464b, this.f49463a, this.f49465c, this.d, this.f49466e, this.f49467f, this.f49468g});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.r(this.f49464b, "applicationId");
        bVar.r(this.f49463a, "apiKey");
        bVar.r(this.f49465c, "databaseUrl");
        bVar.r(this.f49466e, "gcmSenderId");
        bVar.r(this.f49467f, "storageBucket");
        bVar.r(this.f49468g, "projectId");
        return bVar.toString();
    }
}
