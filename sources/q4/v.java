package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f55880a;
    public final CharSequence f55881b;
    public final int f55882c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f55880a = str;
        this.f55881b = "";
        this.f55882c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f55881b) + ", mIcon=" + this.f55882c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f55880a);
        TextUtils.writeToParcel(this.f55881b, parcel, i7);
        parcel.writeInt(this.f55882c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f55880a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f55881b = charSequence;
        this.f55882c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
