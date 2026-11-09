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
    public final List f57251a;
    public final boolean f57252b;
    public final String f57253c;
    public final String d;

    public a(ArrayList arrayList, boolean z9, String str, String str2) {
        m.g(arrayList);
        this.f57251a = arrayList;
        this.f57252b = z9;
        this.f57253c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z9) {
        TreeSet treeSet = new TreeSet(c5.b.f5304c);
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
        if (this.f57252b != aVar.f57252b || !m.k(this.f57251a, aVar.f57251a) || !m.k(this.f57253c, aVar.f57253c) || !m.k(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f57252b), this.f57251a, this.f57253c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, this.f57251a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f57252b ? 1 : 0);
        xb.l(parcel, 3, this.f57253c);
        xb.l(parcel, 4, this.d);
        xb.s(parcel, r10);
    }
}
