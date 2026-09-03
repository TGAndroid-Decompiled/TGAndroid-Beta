package w8;

import android.content.Context;
import android.text.TextUtils;
import b6.m;
import java.util.Arrays;
public final class i {
    public final String f49500a;
    public final String f49501b;
    public final String f49502c;
    public final String d;
    public final String f49503e;
    public final String f49504f;
    public final String f49505g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z4;
        int i10 = i6.e.f7910a;
        if (str != null && !str.trim().isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        m.j("ApplicationId must be set.", true ^ z4);
        this.f49501b = str;
        this.f49500a = str2;
        this.f49502c = str3;
        this.d = str4;
        this.f49503e = str5;
        this.f49504f = str6;
        this.f49505g = str7;
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
        if (!m.l(this.f49501b, iVar.f49501b) || !m.l(this.f49500a, iVar.f49500a) || !m.l(this.f49502c, iVar.f49502c) || !m.l(this.d, iVar.d) || !m.l(this.f49503e, iVar.f49503e) || !m.l(this.f49504f, iVar.f49504f) || !m.l(this.f49505g, iVar.f49505g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49501b, this.f49500a, this.f49502c, this.d, this.f49503e, this.f49504f, this.f49505g});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.r(this.f49501b, "applicationId");
        bVar.r(this.f49500a, "apiKey");
        bVar.r(this.f49502c, "databaseUrl");
        bVar.r(this.f49503e, "gcmSenderId");
        bVar.r(this.f49504f, "storageBucket");
        bVar.r(this.f49505g, "projectId");
        return bVar.toString();
    }
}
