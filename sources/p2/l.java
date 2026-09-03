package p2;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class l {
    public final ArrayList f41026a;

    public l() {
        this.f41026a = new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public l(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new k(optJSONObject));
                }
            }
        }
        this.f41026a = arrayList;
    }
}
