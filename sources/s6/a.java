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
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f46740a;
    public final boolean f46741b;
    public final String f46742c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.h(arrayList);
        this.f46740a = arrayList;
        this.f46741b = z10;
        this.f46742c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f46743a);
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
        if (this.f46741b != aVar.f46741b || !l.l(this.f46740a, aVar.f46740a) || !l.l(this.f46742c, aVar.f46742c) || !l.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46741b), this.f46740a, this.f46742c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.p(parcel, 1, this.f46740a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f46741b ? 1 : 0);
        g0.l(parcel, 3, this.f46742c);
        g0.l(parcel, 4, this.d);
        g0.r(parcel, q6);
    }
}
