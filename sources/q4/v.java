package q4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m6.e(29);
    public final String f53824a;
    public final CharSequence f53825b;
    public final int f53826c;
    public final Bundle d;

    public v(String str, int i7, Bundle bundle) {
        this.f53824a = str;
        this.f53825b = "";
        this.f53826c = i7;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f53825b) + ", mIcon=" + this.f53826c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f53824a);
        TextUtils.writeToParcel(this.f53825b, parcel, i7);
        parcel.writeInt(this.f53826c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f53824a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f53825b = charSequence;
        this.f53826c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
