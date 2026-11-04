package r4;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class l {
    public final Bundle f54314a;
    public final ArrayList f54315b;
    public final ArrayList f54316c;
    public final HashSet d;

    public l(String str, String str2) {
        this.f54315b = new ArrayList();
        this.f54316c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f54314a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = this.f54316c;
                        if (!arrayList2.contains(intentFilter)) {
                            arrayList2.add(intentFilter);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("filters must not be null");
    }

    public final m b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f54316c);
        Bundle bundle = this.f54314a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f54315b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new m(bundle);
    }

    public l(m mVar) {
        this.f54315b = new ArrayList();
        this.f54316c = new ArrayList();
        this.d = new HashSet();
        this.f54314a = new Bundle(mVar.f54317a);
        this.f54315b = mVar.c();
        this.f54316c = mVar.b();
        this.d = mVar.a();
    }
}
