package u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p6.m;
import q8.i;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new i(29);
    public final List f55730a;
    public final boolean f55731b;
    public final String f55732c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        m.g(arrayList);
        this.f55730a = arrayList;
        this.f55731b = z10;
        this.f55732c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b5.b.f2393c);
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
        if (this.f55731b != aVar.f55731b || !m.k(this.f55730a, aVar.f55730a) || !m.k(this.f55732c, aVar.f55732c) || !m.k(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f55731b), this.f55730a, this.f55732c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.q(parcel, 1, this.f55730a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f55731b ? 1 : 0);
        j8.a.m(parcel, 3, this.f55732c);
        j8.a.m(parcel, 4, this.d);
        j8.a.t(parcel, s6);
    }
}
