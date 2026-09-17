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
    public final List f45948a;
    public final boolean f45949b;
    public final String f45950c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.h(arrayList);
        this.f45948a = arrayList;
        this.f45949b = z10;
        this.f45950c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f45951a);
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
        if (this.f45949b != aVar.f45949b || !l.l(this.f45948a, aVar.f45948a) || !l.l(this.f45950c, aVar.f45950c) || !l.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45949b), this.f45948a, this.f45950c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.p(parcel, 1, this.f45948a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f45949b ? 1 : 0);
        e0.l(parcel, 3, this.f45950c);
        e0.l(parcel, 4, this.d);
        e0.r(parcel, q6);
    }
}
