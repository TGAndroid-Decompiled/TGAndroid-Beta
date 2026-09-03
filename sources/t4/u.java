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
    public final String f44627a;
    public final String f44628b;
    public final List f44629c;

    public u(String str, String str2, List list) {
        this.f44627a = str;
        this.f44628b = str2;
        this.f44629c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f44627a, uVar.f44627a) && TextUtils.equals(this.f44628b, uVar.f44628b) && this.f44629c.equals(uVar.f44629c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f44627a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f44628b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f44629c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f44627a;
        if (str2 != null) {
            str = android.support.v4.media.a.r(android.support.v4.media.a.t(" [", str2, ", "), this.f44628b, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f44627a);
        parcel.writeString(this.f44628b);
        List list = this.f44629c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public u(Parcel parcel) {
        this.f44627a = parcel.readString();
        this.f44628b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f44629c = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void c(d1 d1Var) {
    }
}
