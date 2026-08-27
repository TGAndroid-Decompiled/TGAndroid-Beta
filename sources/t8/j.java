package t8;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import w3.b0;
import y5.l;

public final class j {

    public final String f48131a;

    public final String f48132b;

    public final String f48133c;
    public final String d;

    public final String f48134e;

    public final String f48135f;

    public final String f48136g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = f6.e.f5894a;
        l.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f48132b = str;
        this.f48131a = str2;
        this.f48133c = str3;
        this.d = str4;
        this.f48134e = str5;
        this.f48135f = str6;
        this.f48136g = str7;
    }

    public static j a(Context context) {
        b0 b0Var = new b0(context, 7);
        String strK = b0Var.k("google_app_id");
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        return new j(strK, b0Var.k("google_api_key"), b0Var.k("firebase_database_url"), b0Var.k("ga_trackingId"), b0Var.k("gcm_defaultSenderId"), b0Var.k("google_storage_bucket"), b0Var.k("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.l(this.f48132b, jVar.f48132b) && l.l(this.f48131a, jVar.f48131a) && l.l(this.f48133c, jVar.f48133c) && l.l(this.d, jVar.d) && l.l(this.f48134e, jVar.f48134e) && l.l(this.f48135f, jVar.f48135f) && l.l(this.f48136g, jVar.f48136g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48132b, this.f48131a, this.f48133c, this.d, this.f48134e, this.f48135f, this.f48136g});
    }

    public final String toString() {
        b0 b0Var = new b0(this);
        b0Var.e(this.f48132b, "applicationId");
        b0Var.e(this.f48131a, "apiKey");
        b0Var.e(this.f48133c, "databaseUrl");
        b0Var.e(this.f48134e, "gcmSenderId");
        b0Var.e(this.f48135f, "storageBucket");
        b0Var.e(this.f48136g, "projectId");
        return b0Var.toString();
    }
}
