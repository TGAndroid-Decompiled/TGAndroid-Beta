package z7;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public abstract class g5 {
    public static Bundle a(long j10, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j10);
        return bundle;
    }

    public static ja.c b(int i10, n4.s sVar) {
        Map unmodifiableMap;
        s sVar2 = new s(i10);
        if (((HashMap) sVar.f17122c) == null) {
            sVar.f17122c = new HashMap();
        }
        ((HashMap) sVar.f17122c).put(w.class, sVar2);
        String str = (String) sVar.f17121b;
        if (((HashMap) sVar.f17122c) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) sVar.f17122c));
        }
        return new ja.c(str, unmodifiableMap);
    }
}
