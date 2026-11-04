package za;

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Pattern;
public final class s {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String f60320a;
    public final String f60321b;
    public final String f60322c;

    public s(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && d.matcher(str3).matches()) {
            this.f60320a = str3;
            this.f60321b = str;
            this.f60322c = a1.g.C(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(a1.g.q("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f60320a.equals(sVar.f60320a) || !this.f60321b.equals(sVar.f60321b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f60321b, this.f60320a);
    }
}
