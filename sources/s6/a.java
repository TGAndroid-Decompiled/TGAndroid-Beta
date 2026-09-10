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
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f41796a;
    public final boolean f41797b;
    public final String f41798c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.h(arrayList);
        this.f41796a = arrayList;
        this.f41797b = z10;
        this.f41798c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f41799a);
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
        if (this.f41797b != aVar.f41797b || !l.l(this.f41796a, aVar.f41796a) || !l.l(this.f41798c, aVar.f41798c) || !l.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f41797b), this.f41796a, this.f41798c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.p(parcel, 1, this.f41796a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f41797b ? 1 : 0);
        e0.l(parcel, 3, this.f41798c);
        e0.l(parcel, 4, this.d);
        e0.r(parcel, q6);
    }
}
