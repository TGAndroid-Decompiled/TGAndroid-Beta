package s7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import q4.x;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(19);
    public final int f54959a;
    public final Bundle f54960b;

    public h(int i7, Bundle bundle) {
        this.f54959a = i7;
        this.f54960b = bundle;
    }

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: s7.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f54959a));
        Bundle bundle = this.f54960b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = bundle.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f54959a);
        xb.b(parcel, 2, this.f54960b);
        xb.s(parcel, r10);
    }
}
