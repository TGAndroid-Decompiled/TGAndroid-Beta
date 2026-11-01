package s6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import n6.l;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f48092a;
    public final boolean f48093b;
    public final String f48094c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.g(arrayList);
        this.f48092a = arrayList;
        this.f48093b = z10;
        this.f48094c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f48095a);
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
        if (this.f48093b != aVar.f48093b || !l.k(this.f48092a, aVar.f48092a) || !l.k(this.f48094c, aVar.f48094c) || !l.k(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48093b), this.f48092a, this.f48094c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.p(parcel, 1, this.f48092a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f48093b ? 1 : 0);
        h0.l(parcel, 3, this.f48094c);
        h0.l(parcel, 4, this.d);
        h0.r(parcel, q6);
    }
}
