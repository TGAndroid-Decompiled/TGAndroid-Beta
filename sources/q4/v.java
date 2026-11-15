package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f55261a;
    public final CharSequence f55262b;
    public final int f55263c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f55261a = str;
        this.f55262b = "";
        this.f55263c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f55262b) + ", mIcon=" + this.f55263c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f55261a);
        TextUtils.writeToParcel(this.f55262b, parcel, i7);
        parcel.writeInt(this.f55263c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f55261a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f55262b = charSequence;
        this.f55263c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
