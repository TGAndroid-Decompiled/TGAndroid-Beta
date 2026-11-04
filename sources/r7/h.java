package r7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new q8.i(4);
    public final int f54414a;
    public final Bundle f54415b;

    public h(int i3, Bundle bundle) {
        this.f54414a = i3;
        this.f54415b = bundle;
    }

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: r7.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f54414a));
        Bundle bundle = this.f54415b;
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f54414a);
        j8.a.c(parcel, 2, this.f54415b);
        j8.a.t(parcel, s6);
    }
}
