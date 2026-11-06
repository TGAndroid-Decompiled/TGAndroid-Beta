package s4;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
public final class l {
    public final Bundle f54752a;
    public final ArrayList f54753b;
    public final ArrayList f54754c;
    public final HashSet d;

    public l(String str, String str2) {
        this.f54753b = new ArrayList();
        this.f54754c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.f54752a = bundle;
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
                        ArrayList arrayList2 = this.f54754c;
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
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f54754c);
        Bundle bundle = this.f54752a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.f54753b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new m(bundle);
    }

    public l(m mVar) {
        this.f54753b = new ArrayList();
        this.f54754c = new ArrayList();
        this.d = new HashSet();
        this.f54752a = new Bundle(mVar.f54757a);
        this.f54753b = mVar.c();
        this.f54754c = mVar.b();
        this.d = mVar.a();
    }
}
