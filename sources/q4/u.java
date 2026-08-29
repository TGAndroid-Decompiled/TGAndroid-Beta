package q4;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j3.g1;
import j3.t0;
import java.util.ArrayList;
import java.util.List;
public final class u implements b4.b {
    public static final Parcelable.Creator<u> CREATOR = new s(0);
    public final String f46348a;
    public final String f46349b;
    public final List f46350c;

    public u(String str, String str2, List list) {
        this.f46348a = str;
        this.f46349b = str2;
        this.f46350c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
            if (TextUtils.equals(this.f46348a, uVar.f46348a) && TextUtils.equals(this.f46349b, uVar.f46349b) && this.f46350c.equals(uVar.f46350c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f46348a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f46349b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f46350c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f46348a;
        if (str2 != null) {
            str = w.q(w.s(" [", str2, ", "), this.f46349b, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46348a);
        parcel.writeString(this.f46349b);
        List list = this.f46350c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public u(Parcel parcel) {
        this.f46348a = parcel.readString();
        this.f46349b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f46350c = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
