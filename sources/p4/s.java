package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class s {
    public static final s f43099c = new s(new Bundle(), null);
    public final Bundle f43100a;
    public List f43101b;

    public s(Bundle bundle, ArrayList arrayList) {
        this.f43100a = bundle;
        this.f43101b = arrayList;
    }

    public static s b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new s(bundle, null);
    }

    public final void a() {
        if (this.f43101b == null) {
            ArrayList<String> stringArrayList = this.f43100a.getStringArrayList("controlCategories");
            this.f43101b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f43101b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f43101b);
    }

    public final boolean d() {
        a();
        return this.f43101b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            a();
            sVar.a();
            return this.f43101b.equals(sVar.f43101b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f43101b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
