package v6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
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
    public final List f57247a;
    public final boolean f57248b;
    public final String f57249c;
    public final String d;

    public a(ArrayList arrayList, boolean z9, String str, String str2) {
        m.g(arrayList);
        this.f57247a = arrayList;
        this.f57248b = z9;
        this.f57249c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z9) {
        TreeSet treeSet = new TreeSet(c5.b.f5309c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((n) it.next()).c());
        }
        return new a(new ArrayList(treeSet), z9, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f57248b != aVar.f57248b || !m.k(this.f57247a, aVar.f57247a) || !m.k(this.f57249c, aVar.f57249c) || !m.k(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f57248b), this.f57247a, this.f57249c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, this.f57247a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f57248b ? 1 : 0);
        xb.l(parcel, 3, this.f57249c);
        xb.l(parcel, 4, this.d);
        xb.s(parcel, r10);
    }
}
