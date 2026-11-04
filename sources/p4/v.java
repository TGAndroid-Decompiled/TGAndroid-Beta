package p4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new n8.g(14);
    public final String f53190a;
    public final CharSequence f53191b;
    public final int f53192c;
    public final Bundle d;

    public v(String str, int i3, Bundle bundle) {
        this.f53190a = str;
        this.f53191b = "";
        this.f53192c = i3;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f53191b) + ", mIcon=" + this.f53192c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f53190a);
        TextUtils.writeToParcel(this.f53191b, parcel, i3);
        parcel.writeInt(this.f53192c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f53190a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f53191b = charSequence;
        this.f53192c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
