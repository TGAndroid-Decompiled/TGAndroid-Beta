package q4;

import a8.p0;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new m6.e(28);
    public final int f55879a;
    public final long f55880b;
    public final long f55881c;
    public final float d;
    public final long f55882e;
    public final int f55883f;
    public final CharSequence h;
    public final long f55884n;
    public final AbstractCollection f55885r;
    public final long f55886s;
    public final Bundle f55887w;
    public PlaybackState f55888x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f55879a = i7;
        this.f55880b = j3;
        this.f55881c = j10;
        this.d = f10;
        this.f55882e = j11;
        this.f55883f = i10;
        this.h = charSequence;
        this.f55884n = j12;
        this.f55885r = new ArrayList(arrayList);
        this.f55886s = j13;
        this.f55887w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f55879a);
        sb2.append(", position=");
        sb2.append(this.f55880b);
        sb2.append(", buffered position=");
        sb2.append(this.f55881c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f55884n);
        sb2.append(", actions=");
        sb2.append(this.f55882e);
        sb2.append(", error code=");
        sb2.append(this.f55883f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f55885r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f55886s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f55879a);
        parcel.writeLong(this.f55880b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f55884n);
        parcel.writeLong(this.f55881c);
        parcel.writeLong(this.f55882e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f55885r);
        parcel.writeLong(this.f55886s);
        parcel.writeBundle(this.f55887w);
        parcel.writeInt(this.f55883f);
    }

    public w(Parcel parcel) {
        this.f55879a = parcel.readInt();
        this.f55880b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f55884n = parcel.readLong();
        this.f55881c = parcel.readLong();
        this.f55882e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14032b;
            createTypedArrayList = t1.f14100e;
        }
        this.f55885r = createTypedArrayList;
        this.f55886s = parcel.readLong();
        this.f55887w = parcel.readBundle(q.class.getClassLoader());
        this.f55883f = parcel.readInt();
    }
}
