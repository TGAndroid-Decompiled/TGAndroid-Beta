package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f53812a;
    public final CharSequence f53813b;
    public final int f53814c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f53812a = str;
        this.f53813b = "";
        this.f53814c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f53813b) + ", mIcon=" + this.f53814c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f53812a);
        TextUtils.writeToParcel(this.f53813b, parcel, i7);
        parcel.writeInt(this.f53814c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f53812a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f53813b = charSequence;
        this.f53814c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
