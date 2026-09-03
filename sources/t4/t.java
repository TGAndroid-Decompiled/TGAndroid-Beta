package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);
    public final int f48004a;
    public final int f48005b;
    public final String f48006c;
    public final String d;
    public final String f48007e;
    public final String f48008f;

    public t(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f48004a = i10;
        this.f48005b = i11;
        this.f48006c = str;
        this.d = str2;
        this.f48007e = str3;
        this.f48008f = str4;
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
            if (this.f48004a == tVar.f48004a && this.f48005b == tVar.f48005b && TextUtils.equals(this.f48006c, tVar.f48006c) && TextUtils.equals(this.d, tVar.d) && TextUtils.equals(this.f48007e, tVar.f48007e) && TextUtils.equals(this.f48008f, tVar.f48008f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f48004a * 31) + this.f48005b) * 31;
        int i14 = 0;
        String str = this.f48006c;
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
        String str3 = this.f48007e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f48008f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f48004a);
        parcel.writeInt(this.f48005b);
        parcel.writeString(this.f48006c);
        parcel.writeString(this.d);
        parcel.writeString(this.f48007e);
        parcel.writeString(this.f48008f);
    }

    public t(Parcel parcel) {
        this.f48004a = parcel.readInt();
        this.f48005b = parcel.readInt();
        this.f48006c = parcel.readString();
        this.d = parcel.readString();
        this.f48007e = parcel.readString();
        this.f48008f = parcel.readString();
    }
}
