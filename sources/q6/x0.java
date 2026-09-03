package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public final class x0 extends c6.a {
    public static final Parcelable.Creator<x0> CREATOR = new r0(24);
    public final List f43016a;

    public x0(ArrayList arrayList) {
        b6.m.h(arrayList);
        this.f43016a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).f43016a;
        List list2 = this.f43016a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f43016a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.p(parcel, 1, this.f43016a);
        f5.r(parcel, q10);
    }
}
