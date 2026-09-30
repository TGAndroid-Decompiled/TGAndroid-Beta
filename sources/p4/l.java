package p4;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class l {
    public final Bundle f40974a;
    public final ArrayList f40975b;
    public final ArrayList f40976c;
    public final HashSet d;

    public l(String str, String str2) {
        this.f40975b = new ArrayList();
        this.f40976c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f40974a = bundle;
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
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        ArrayList arrayList2 = this.f40976c;
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
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f40976c);
        Bundle bundle = this.f40974a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f40975b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new m(bundle);
    }

    public l(m mVar) {
        this.f40975b = new ArrayList();
        this.f40976c = new ArrayList();
        this.d = new HashSet();
        this.f40974a = new Bundle(mVar.f40979a);
        this.f40975b = mVar.c();
        this.f40976c = mVar.b();
        this.d = mVar.a();
    }
}
