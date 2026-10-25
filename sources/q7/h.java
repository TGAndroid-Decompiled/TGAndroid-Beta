package q7;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import n4.x;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(27);
    public final int f46990a;
    public final Bundle f46991b;

    public h(int i10, Bundle bundle) {
        this.f46990a = i10;
        this.f46991b = bundle;
    }

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: q7.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f46990a));
        Bundle bundle = this.f46991b;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f46990a);
        df.b(parcel, 2, this.f46991b);
        df.r(parcel, q5);
    }
}
