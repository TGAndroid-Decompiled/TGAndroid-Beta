package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f55958a;
    public final CharSequence f55959b;
    public final int f55960c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f55958a = str;
        this.f55959b = "";
        this.f55960c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f55959b) + ", mIcon=" + this.f55960c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f55958a);
        TextUtils.writeToParcel(this.f55959b, parcel, i7);
        parcel.writeInt(this.f55960c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f55958a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f55959b = charSequence;
        this.f55960c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
