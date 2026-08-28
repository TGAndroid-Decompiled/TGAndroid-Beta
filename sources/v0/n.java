package v0;

import android.os.Bundle;
import org.json.JSONObject;
public class n extends a8.a {
    public n(String str, int i9, Bundle data) {
        super(str, data);
        switch (i9) {
            case 2:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", data);
                if (str.length() > 0) {
                    return;
                }
                throw new IllegalArgumentException("password should not be empty");
            case 3:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
            default:
                kotlin.jvm.internal.i.e(data, "data");
                if (str.length() > 0) {
                    return;
                }
                throw new IllegalArgumentException("type should not be empty");
        }
    }
}
