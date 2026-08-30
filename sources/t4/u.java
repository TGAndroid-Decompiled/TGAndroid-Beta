package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j3.d1;
import j3.n0;
import java.util.ArrayList;
import java.util.List;
public final class u implements e4.b {
    public static final Parcelable.Creator<u> CREATOR = new s(0);
    public final String f44565a;
    public final String f44566b;
    public final List f44567c;

    public u(String str, String str2, List list) {
        this.f44565a = str;
        this.f44566b = str2;
        this.f44567c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final byte[] d() {
        return null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f44565a, uVar.f44565a) && TextUtils.equals(this.f44566b, uVar.f44566b) && this.f44567c.equals(uVar.f44567c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f44565a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f44566b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f44567c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f44565a;
        if (str2 != null) {
            str = android.support.v4.media.a.r(android.support.v4.media.a.t(" [", str2, ", "), this.f44566b, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f44565a);
        parcel.writeString(this.f44566b);
        List list = this.f44567c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public u(Parcel parcel) {
        this.f44565a = parcel.readString();
        this.f44566b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f44567c = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
