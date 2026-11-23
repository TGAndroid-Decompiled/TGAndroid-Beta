package q4;

import a8.p0;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m6.e(28);
    public final int f55961a;
    public final long f55962b;
    public final long f55963c;
    public final float d;
    public final long f55964e;
    public final int f55965f;
    public final CharSequence h;
    public final long f55966n;
    public final AbstractCollection f55967r;
    public final long f55968s;
    public final Bundle f55969w;
    public PlaybackState f55970x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f55961a = i7;
        this.f55962b = j3;
        this.f55963c = j10;
        this.d = f10;
        this.f55964e = j11;
        this.f55965f = i10;
        this.h = charSequence;
        this.f55966n = j12;
        this.f55967r = new ArrayList(arrayList);
        this.f55968s = j13;
        this.f55969w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f55961a);
        sb2.append(", position=");
        sb2.append(this.f55962b);
        sb2.append(", buffered position=");
        sb2.append(this.f55963c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f55966n);
        sb2.append(", actions=");
        sb2.append(this.f55964e);
        sb2.append(", error code=");
        sb2.append(this.f55965f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f55967r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f55968s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f55961a);
        parcel.writeLong(this.f55962b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f55966n);
        parcel.writeLong(this.f55963c);
        parcel.writeLong(this.f55964e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f55967r);
        parcel.writeLong(this.f55968s);
        parcel.writeBundle(this.f55969w);
        parcel.writeInt(this.f55965f);
    }

    public w(Parcel parcel) {
        this.f55961a = parcel.readInt();
        this.f55962b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f55966n = parcel.readLong();
        this.f55963c = parcel.readLong();
        this.f55964e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f13995b;
            createTypedArrayList = s1.f14058e;
        }
        this.f55967r = createTypedArrayList;
        this.f55968s = parcel.readLong();
        this.f55969w = parcel.readBundle(q.class.getClassLoader());
        this.f55965f = parcel.readInt();
    }
}
