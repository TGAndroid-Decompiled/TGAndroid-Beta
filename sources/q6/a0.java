package q6;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    a0 EF5;
    public static final a0[] f42885a = {new Enum("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<a0> CREATOR = new r0(2);

    public static a0 a(String str) {
        a0[] values;
        for (a0 a0Var : values()) {
            a0Var.getClass();
            if (str.equals("public-key")) {
                return a0Var;
            }
        }
        throw new Exception(android.support.v4.media.a.o("PublicKeyCredentialType ", str, " not supported"));
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f42885a.clone();
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "public-key";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}
