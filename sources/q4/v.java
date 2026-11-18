package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f55835a;
    public final CharSequence f55836b;
    public final int f55837c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f55835a = str;
        this.f55836b = "";
        this.f55837c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f55836b) + ", mIcon=" + this.f55837c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f55835a);
        TextUtils.writeToParcel(this.f55836b, parcel, i7);
        parcel.writeInt(this.f55837c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f55835a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f55836b = charSequence;
        this.f55837c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
