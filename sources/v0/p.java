package v0;

import android.os.Bundle;
import java.util.Set;
import org.json.JSONObject;
public final class p {
    public final Bundle f49318a;
    public final Bundle f49319b;
    public final Set f49320c;
    public final String d;

    public p(String requestJson) {
        kotlin.jvm.internal.j.e(requestJson, "requestJson");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
        bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        this.f49318a = bundle;
        this.f49319b = bundle2;
        this.f49320c = rc.q.f47123a;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        this.d = requestJson;
        if (requestJson.length() != 0) {
            try {
                new JSONObject(requestJson);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
