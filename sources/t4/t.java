package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);
    public final int f44561a;
    public final int f44562b;
    public final String f44563c;
    public final String d;
    public final String e;
    public final String f44564f;

    public t(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f44561a = i10;
        this.f44562b = i11;
        this.f44563c = str;
        this.d = str2;
        this.e = str3;
        this.f44564f = str4;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f44561a == tVar.f44561a && this.f44562b == tVar.f44562b && TextUtils.equals(this.f44563c, tVar.f44563c) && TextUtils.equals(this.d, tVar.d) && TextUtils.equals(this.e, tVar.e) && TextUtils.equals(this.f44564f, tVar.f44564f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f44561a * 31) + this.f44562b) * 31;
        int i14 = 0;
        String str = this.f44563c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i13 + i10) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f44564f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f44561a);
        parcel.writeInt(this.f44562b);
        parcel.writeString(this.f44563c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f44564f);
    }

    public t(Parcel parcel) {
        this.f44561a = parcel.readInt();
        this.f44562b = parcel.readInt();
        this.f44563c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f44564f = parcel.readString();
    }
}
