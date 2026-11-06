package s4;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class l {
    public final Bundle f54728a;
    public final ArrayList f54729b;
    public final ArrayList f54730c;
    public final HashSet d;

    public l(String str, String str2) {
        this.f54729b = new ArrayList();
        this.f54730c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f54728a = bundle;
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
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = this.f54730c;
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
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f54730c);
        Bundle bundle = this.f54728a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f54729b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new m(bundle);
    }

    public l(m mVar) {
        this.f54729b = new ArrayList();
        this.f54730c = new ArrayList();
        this.d = new HashSet();
        this.f54728a = new Bundle(mVar.f54733a);
        this.f54729b = mVar.c();
        this.f54730c = mVar.b();
        this.d = mVar.a();
    }
}
