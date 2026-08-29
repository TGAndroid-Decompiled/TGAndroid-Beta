package u8;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import v5.n;
import z5.l;
public final class i {
    public final String f49143a;
    public final String f49144b;
    public final String f49145c;
    public final String d;
    public final String f49146e;
    public final String f49147f;
    public final String f49148g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z10;
        int i10 = g6.e.f7117a;
        if (str != null && !str.trim().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        l.j("ApplicationId must be set.", true ^ z10);
        this.f49144b = str;
        this.f49143a = str2;
        this.f49145c = str3;
        this.d = str4;
        this.f49146e = str5;
        this.f49147f = str6;
        this.f49148g = str7;
    }

    public static i a(Context context) {
        n nVar = new n(context, 12);
        String o10 = nVar.o("google_app_id");
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        return new i(o10, nVar.o("google_api_key"), nVar.o("firebase_database_url"), nVar.o("ga_trackingId"), nVar.o("gcm_defaultSenderId"), nVar.o("google_storage_bucket"), nVar.o("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!l.l(this.f49144b, iVar.f49144b) || !l.l(this.f49143a, iVar.f49143a) || !l.l(this.f49145c, iVar.f49145c) || !l.l(this.d, iVar.d) || !l.l(this.f49146e, iVar.f49146e) || !l.l(this.f49147f, iVar.f49147f) || !l.l(this.f49148g, iVar.f49148g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49144b, this.f49143a, this.f49145c, this.d, this.f49146e, this.f49147f, this.f49148g});
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.g(this.f49144b, "applicationId");
        nVar.g(this.f49143a, "apiKey");
        nVar.g(this.f49145c, "databaseUrl");
        nVar.g(this.f49146e, "gcmSenderId");
        nVar.g(this.f49147f, "storageBucket");
        nVar.g(this.f49148g, "projectId");
        return nVar.toString();
    }
}
