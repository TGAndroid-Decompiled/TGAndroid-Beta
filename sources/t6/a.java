package t6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import o6.l;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new Object();
    public final List f48749a;
    public final boolean f48750b;
    public final String f48751c;
    public final String d;

    public a(ArrayList arrayList, boolean z10, String str, String str2) {
        l.h(arrayList);
        this.f48749a = arrayList;
        this.f48750b = z10;
        this.f48751c = str;
        this.d = str2;
    }

    public static a b(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(b.f48752a);
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
        if (this.f48750b != aVar.f48750b || !l.l(this.f48749a, aVar.f48749a) || !l.l(this.f48751c, aVar.f48751c) || !l.l(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48750b), this.f48749a, this.f48751c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.p(parcel, 1, this.f48749a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f48750b ? 1 : 0);
        df.l(parcel, 3, this.f48751c);
        df.l(parcel, 4, this.d);
        df.r(parcel, q5);
    }
}
