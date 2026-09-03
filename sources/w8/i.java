package w8;

import android.content.Context;
import android.text.TextUtils;
import b6.m;
import java.util.Arrays;
public final class i {
    public final String f46570a;
    public final String f46571b;
    public final String f46572c;
    public final String d;
    public final String e;
    public final String f46573f;
    public final String f46574g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z4;
        int i10 = i6.e.f7334a;
        if (str != null && !str.trim().isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        m.j("ApplicationId must be set.", true ^ z4);
        this.f46571b = str;
        this.f46570a = str2;
        this.f46572c = str3;
        this.d = str4;
        this.e = str5;
        this.f46573f = str6;
        this.f46574g = str7;
    }

    public static i a(Context context) {
        af.c cVar = new af.c(context);
        String Q = cVar.Q("google_app_id");
        if (TextUtils.isEmpty(Q)) {
            return null;
        }
        return new i(Q, cVar.Q("google_api_key"), cVar.Q("firebase_database_url"), cVar.Q("ga_trackingId"), cVar.Q("gcm_defaultSenderId"), cVar.Q("google_storage_bucket"), cVar.Q("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!m.l(this.f46571b, iVar.f46571b) || !m.l(this.f46570a, iVar.f46570a) || !m.l(this.f46572c, iVar.f46572c) || !m.l(this.d, iVar.d) || !m.l(this.e, iVar.e) || !m.l(this.f46573f, iVar.f46573f) || !m.l(this.f46574g, iVar.f46574g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46571b, this.f46570a, this.f46572c, this.d, this.e, this.f46573f, this.f46574g});
    }

    public final String toString() {
        af.c cVar = new af.c(this);
        cVar.s(this.f46571b, "applicationId");
        cVar.s(this.f46570a, "apiKey");
        cVar.s(this.f46572c, "databaseUrl");
        cVar.s(this.e, "gcmSenderId");
        cVar.s(this.f46573f, "storageBucket");
        cVar.s(this.f46574g, "projectId");
        return cVar.toString();
    }
}
