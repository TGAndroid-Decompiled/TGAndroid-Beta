package s4;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class l {
    public final Bundle f56994a;
    public final ArrayList f56995b;
    public final ArrayList f56996c;
    public final HashSet d;

    public l(String str, String str2) {
        this.f56995b = new ArrayList();
        this.f56996c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f56994a = bundle;
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
                        ArrayList arrayList2 = this.f56996c;
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
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f56996c);
        Bundle bundle = this.f56994a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f56995b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new m(bundle);
    }

    public l(m mVar) {
        this.f56995b = new ArrayList();
        this.f56996c = new ArrayList();
        this.d = new HashSet();
        this.f56994a = new Bundle(mVar.f56999a);
        this.f56995b = mVar.c();
        this.f56996c = mVar.b();
        this.d = mVar.a();
    }
}
