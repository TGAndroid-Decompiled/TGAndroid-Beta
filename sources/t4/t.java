package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);
    public final int f47968a;
    public final int f47969b;
    public final String f47970c;
    public final String d;
    public final String f47971e;
    public final String f47972f;

    public t(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f47968a = i10;
        this.f47969b = i11;
        this.f47970c = str;
        this.d = str2;
        this.f47971e = str3;
        this.f47972f = str4;
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
            if (this.f47968a == tVar.f47968a && this.f47969b == tVar.f47969b && TextUtils.equals(this.f47970c, tVar.f47970c) && TextUtils.equals(this.d, tVar.d) && TextUtils.equals(this.f47971e, tVar.f47971e) && TextUtils.equals(this.f47972f, tVar.f47972f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f47968a * 31) + this.f47969b) * 31;
        int i14 = 0;
        String str = this.f47970c;
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
        String str3 = this.f47971e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f47972f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47968a);
        parcel.writeInt(this.f47969b);
        parcel.writeString(this.f47970c);
        parcel.writeString(this.d);
        parcel.writeString(this.f47971e);
        parcel.writeString(this.f47972f);
    }

    public t(Parcel parcel) {
        this.f47968a = parcel.readInt();
        this.f47969b = parcel.readInt();
        this.f47970c = parcel.readString();
        this.d = parcel.readString();
        this.f47971e = parcel.readString();
        this.f47972f = parcel.readString();
    }
}
