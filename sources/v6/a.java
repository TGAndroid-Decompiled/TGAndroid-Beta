package v6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
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
    public final List f59297a;
    public final boolean f59298b;
    public final String f59299c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        m.h(arrayList);
        this.f59297a = arrayList;
        this.f59298b = z10;
        this.f59299c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(c5.b.f4404c);
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
        if (this.f59298b != aVar.f59298b || !m.l(this.f59297a, aVar.f59297a) || !m.l(this.f59299c, aVar.f59299c) || !m.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f59298b), this.f59297a, this.f59299c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.p(parcel, 1, this.f59297a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f59298b ? 1 : 0);
        cc.l(parcel, 3, this.f59299c);
        cc.l(parcel, 4, this.d);
        cc.s(parcel, r10);
    }
}
