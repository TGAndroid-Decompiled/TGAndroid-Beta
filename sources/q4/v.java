package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f55845a;
    public final CharSequence f55846b;
    public final int f55847c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f55845a = str;
        this.f55846b = "";
        this.f55847c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f55846b) + ", mIcon=" + this.f55847c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f55845a);
        TextUtils.writeToParcel(this.f55846b, parcel, i7);
        parcel.writeInt(this.f55847c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f55845a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f55846b = charSequence;
        this.f55847c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
