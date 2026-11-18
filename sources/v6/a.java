package v6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
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
    public final List f59292a;
    public final boolean f59293b;
    public final String f59294c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        m.h(arrayList);
        this.f59292a = arrayList;
        this.f59293b = z10;
        this.f59294c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(c5.b.f4409c);
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
        if (this.f59293b != aVar.f59293b || !m.l(this.f59292a, aVar.f59292a) || !m.l(this.f59294c, aVar.f59294c) || !m.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f59293b), this.f59292a, this.f59294c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.p(parcel, 1, this.f59292a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f59293b ? 1 : 0);
        bc.l(parcel, 3, this.f59294c);
        bc.l(parcel, 4, this.d);
        bc.s(parcel, r10);
    }
}
