package w8;

import android.content.Context;
import android.text.TextUtils;
import b6.m;
import java.util.Arrays;
public final class i {
    public final String f49464a;
    public final String f49465b;
    public final String f49466c;
    public final String d;
    public final String f49467e;
    public final String f49468f;
    public final String f49469g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z4;
        int i10 = i6.e.f7910a;
        if (str != null && !str.trim().isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        m.j("ApplicationId must be set.", true ^ z4);
        this.f49465b = str;
        this.f49464a = str2;
        this.f49466c = str3;
        this.d = str4;
        this.f49467e = str5;
        this.f49468f = str6;
        this.f49469g = str7;
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
        if (!m.l(this.f49465b, iVar.f49465b) || !m.l(this.f49464a, iVar.f49464a) || !m.l(this.f49466c, iVar.f49466c) || !m.l(this.d, iVar.d) || !m.l(this.f49467e, iVar.f49467e) || !m.l(this.f49468f, iVar.f49468f) || !m.l(this.f49469g, iVar.f49469g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49465b, this.f49464a, this.f49466c, this.d, this.f49467e, this.f49468f, this.f49469g});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        bVar.r(this.f49465b, "applicationId");
        bVar.r(this.f49464a, "apiKey");
        bVar.r(this.f49466c, "databaseUrl");
        bVar.r(this.f49467e, "gcmSenderId");
        bVar.r(this.f49468f, "storageBucket");
        bVar.r(this.f49469g, "projectId");
        return bVar.toString();
    }
}
