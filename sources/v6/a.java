package v6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import q6.m;
import u8.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(14);
    public final List f58722a;
    public final boolean f58723b;
    public final String f58724c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        m.g(arrayList);
        this.f58722a = arrayList;
        this.f58723b = z10;
        this.f58724c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(c5.b.f4128c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((n) it.next()).c());
        }
        return new a(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f58723b != aVar.f58723b || !m.k(this.f58722a, aVar.f58722a) || !m.k(this.f58724c, aVar.f58724c) || !m.k(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f58723b), this.f58722a, this.f58724c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.p(parcel, 1, this.f58722a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f58723b ? 1 : 0);
        yb.l(parcel, 3, this.f58724c);
        yb.l(parcel, 4, this.d);
        yb.s(parcel, r10);
    }
}
