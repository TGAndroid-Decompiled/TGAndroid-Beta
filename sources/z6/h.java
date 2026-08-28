package z6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new w7.i(21);
    public final int f50321a;
    public final Bundle f50322b;

    public h(int i9, Bundle bundle) {
        this.f50321a = i9;
        this.f50322b = bundle;
    }

    public final boolean equals(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: z6.h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f50321a));
        Bundle bundle = this.f50322b;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f50321a);
        p8.b(parcel, 2, this.f50322b);
        p8.r(parcel, q10);
    }
}
