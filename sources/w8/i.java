package w8;

import android.content.Context;
import android.text.TextUtils;
import b6.m;
import java.util.Arrays;
public final class i {
    public final String f46488a;
    public final String f46489b;
    public final String f46490c;
    public final String d;
    public final String e;
    public final String f46491f;
    public final String f46492g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z4;
        int i10 = i6.e.f7352a;
        if (str != null && !str.trim().isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        m.j("ApplicationId must be set.", true ^ z4);
        this.f46489b = str;
        this.f46488a = str2;
        this.f46490c = str3;
        this.d = str4;
        this.e = str5;
        this.f46491f = str6;
        this.f46492g = str7;
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
        if (!m.l(this.f46489b, iVar.f46489b) || !m.l(this.f46488a, iVar.f46488a) || !m.l(this.f46490c, iVar.f46490c) || !m.l(this.d, iVar.d) || !m.l(this.e, iVar.e) || !m.l(this.f46491f, iVar.f46491f) || !m.l(this.f46492g, iVar.f46492g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46489b, this.f46488a, this.f46490c, this.d, this.e, this.f46491f, this.f46492g});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.s(this.f46489b, "applicationId");
        bVar.s(this.f46488a, "apiKey");
        bVar.s(this.f46490c, "databaseUrl");
        bVar.s(this.e, "gcmSenderId");
        bVar.s(this.f46491f, "storageBucket");
        bVar.s(this.f46492g, "projectId");
        return bVar.toString();
    }
}
