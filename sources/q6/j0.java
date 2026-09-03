package q6;

import android.os.Parcel;
import android.os.Parcelable;
public enum j0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<j0> CREATOR = new r0(10);
    public final String f42954a;

    j0(String str) {
        this.f42954a = str;
    }

    public static j0 a(String str) {
        j0[] values;
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f42954a)) {
                return j0Var;
            }
        }
        throw new Exception(android.support.v4.media.a.o("User verification requirement ", str, " not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.f42954a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42954a);
    }
}
