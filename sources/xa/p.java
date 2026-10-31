package xa;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;
public final class p {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String f53560a;
    public final String f53561b;
    public final String f53562c;

    public p(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && d.matcher(str3).matches()) {
            this.f53560a = str3;
            this.f53561b = str;
            this.f53562c = a1.g.C(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(a1.g.n("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f53560a.equals(pVar.f53560a) || !this.f53561b.equals(pVar.f53561b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53561b, this.f53560a});
    }
}
