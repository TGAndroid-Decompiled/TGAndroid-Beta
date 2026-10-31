package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class s {
    public static final s f44802c = new s(new Bundle(), null);
    public final Bundle f44803a;
    public List f44804b;

    public s(Bundle bundle, ArrayList arrayList) {
        this.f44803a = bundle;
        this.f44804b = arrayList;
    }

    public static s b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new s(bundle, null);
    }

    public final void a() {
        if (this.f44804b == null) {
            ArrayList<String> stringArrayList = this.f44803a.getStringArrayList("controlCategories");
            this.f44804b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f44804b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f44804b);
    }

    public final boolean d() {
        a();
        return this.f44804b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            a();
            sVar.a();
            return this.f44804b.equals(sVar.f44804b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f44804b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
