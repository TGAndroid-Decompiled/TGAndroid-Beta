package u5;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.ui.yh;
public abstract class a {
    public static final Pattern f48347a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    public static final Random f48348b = new Random(SystemClock.elapsedRealtime());

    public static String a(String str, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 128) {
                if (str.startsWith("urn:x-cast:")) {
                    if (str.length() != 11) {
                        return;
                    }
                    throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
                }
                throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
            }
            throw new IllegalArgumentException("Invalid namespace length");
        }
        throw new IllegalArgumentException("Namespace cannot be null or empty");
    }

    public static ArrayList c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            i10 = yh.d(iArr[i10], i10, 1, arrayList);
        }
        return arrayList;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null && obj2 != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int[] e(AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        return iArr;
    }
}
