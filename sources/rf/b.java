package rf;

import e2.l0;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.w0;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class b {
    public static void a(HashMap hashMap) {
        if (!hashMap.isEmpty()) {
            return;
        }
        try {
            InputStream open = w0.f18945b.getAssets().open("currencies.json");
            String str = l0.f6165a;
            JSONObject jSONObject = new JSONObject(new String(f9.f.b(open), d9.j.f5805a));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
            }
            open.close();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static TLRPC.InputStorePaymentPurpose b(String str) {
        f8.b("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.v(str));
        a a2 = a.a(serializedData.readInt32(true), serializedData);
        serializedData.cleanup();
        if (a2.f46501c != null) {
            f8.b("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return a2.f46501c;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(a2.f46500b);
        String f7 = Utilities.f(serializedData2.toByteArray());
        serializedData2.cleanup();
        f8.b("BillingUtilities.getPurpose: searching purpose under ".concat(f7));
        String string = w0.f18945b.getSharedPreferences("purchases", 0).getString(f7, null);
        if (string != null) {
            f8.b("BillingUtilities.getPurpose: got {" + string + "} under " + f7);
            SerializedData serializedData3 = new SerializedData(Utilities.v(string));
            a a10 = a.a(serializedData3.readInt32(true), serializedData3);
            serializedData3.cleanup();
            return a10.f46501c;
        }
        f8.b("BillingUtilities.getPurpose: purpose under " + f7 + " not found");
        throw new RuntimeException(a1.g.n("no purpose under ", f7, " found :("));
    }
}
