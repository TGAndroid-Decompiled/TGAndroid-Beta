package q4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);
    public final int f46343a;
    public final int f46344b;
    public final String f46345c;
    public final String d;
    public final String f46346e;
    public final String f46347f;

    public t(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f46343a = i10;
        this.f46344b = i11;
        this.f46345c = str;
        this.d = str2;
        this.f46346e = str3;
        this.f46347f = str4;
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
            if (this.f46343a == tVar.f46343a && this.f46344b == tVar.f46344b && TextUtils.equals(this.f46345c, tVar.f46345c) && TextUtils.equals(this.d, tVar.d) && TextUtils.equals(this.f46346e, tVar.f46346e) && TextUtils.equals(this.f46347f, tVar.f46347f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f46343a * 31) + this.f46344b) * 31;
        int i14 = 0;
        String str = this.f46345c;
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
        String str3 = this.f46346e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f46347f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46343a);
        parcel.writeInt(this.f46344b);
        parcel.writeString(this.f46345c);
        parcel.writeString(this.d);
        parcel.writeString(this.f46346e);
        parcel.writeString(this.f46347f);
    }

    public t(Parcel parcel) {
        this.f46343a = parcel.readInt();
        this.f46344b = parcel.readInt();
        this.f46345c = parcel.readString();
        this.d = parcel.readString();
        this.f46346e = parcel.readString();
        this.f46347f = parcel.readString();
    }
}
