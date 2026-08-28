package s8;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import x5.l;
public final class j {
    public final String f47482a;
    public final String f47483b;
    public final String f47484c;
    public final String d;
    public final String f47485e;
    public final String f47486f;
    public final String f47487g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i9 = e6.e.f4965a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f47483b = str;
        this.f47482a = str2;
        this.f47484c = str3;
        this.d = str4;
        this.f47485e = str5;
        this.f47486f = str6;
        this.f47487g = str7;
    }

    public static j a(Context context) {
        w4.e eVar = new w4.e(context, 5);
        String i9 = eVar.i("google_app_id");
        if (TextUtils.isEmpty(i9)) {
            return null;
        }
        return new j(i9, eVar.i("google_api_key"), eVar.i("firebase_database_url"), eVar.i("ga_trackingId"), eVar.i("gcm_defaultSenderId"), eVar.i("google_storage_bucket"), eVar.i("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!l.l(this.f47483b, jVar.f47483b) || !l.l(this.f47482a, jVar.f47482a) || !l.l(this.f47484c, jVar.f47484c) || !l.l(this.d, jVar.d) || !l.l(this.f47485e, jVar.f47485e) || !l.l(this.f47486f, jVar.f47486f) || !l.l(this.f47487g, jVar.f47487g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47483b, this.f47482a, this.f47484c, this.d, this.f47485e, this.f47486f, this.f47487g});
    }

    public final String toString() {
        w4.e eVar = new w4.e(this);
        eVar.c(this.f47483b, "applicationId");
        eVar.c(this.f47482a, "apiKey");
        eVar.c(this.f47484c, "databaseUrl");
        eVar.c(this.f47485e, "gcmSenderId");
        eVar.c(this.f47486f, "storageBucket");
        eVar.c(this.f47487g, "projectId");
        return eVar.toString();
    }
}
