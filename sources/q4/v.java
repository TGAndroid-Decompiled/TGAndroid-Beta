package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f53813a;
    public final CharSequence f53814b;
    public final int f53815c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f53813a = str;
        this.f53814b = "";
        this.f53815c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f53814b) + ", mIcon=" + this.f53815c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f53813a);
        TextUtils.writeToParcel(this.f53814b, parcel, i7);
        parcel.writeInt(this.f53815c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f53813a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f53814b = charSequence;
        this.f53815c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
