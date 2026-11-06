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
    public final int f53722a;
    public final long f53723b;
    public final long f53724c;
    public final float d;
    public final long f53725e;
    public final int f53726f;
    public final CharSequence h;
    public final long f53727n;
    public final AbstractCollection f53728r;
    public final long f53729s;
    public final Bundle f53730w;
    public PlaybackState f53731x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f53722a = i7;
        this.f53723b = j3;
        this.f53724c = j10;
        this.d = f10;
        this.f53725e = j11;
        this.f53726f = i10;
        this.h = charSequence;
        this.f53727n = j12;
        this.f53728r = new ArrayList(arrayList);
        this.f53729s = j13;
        this.f53730w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f53722a);
        sb2.append(", position=");
        sb2.append(this.f53723b);
        sb2.append(", buffered position=");
        sb2.append(this.f53724c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f53727n);
        sb2.append(", actions=");
        sb2.append(this.f53725e);
        sb2.append(", error code=");
        sb2.append(this.f53726f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f53728r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f53729s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f53722a);
        parcel.writeLong(this.f53723b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f53727n);
        parcel.writeLong(this.f53724c);
        parcel.writeLong(this.f53725e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f53728r);
        parcel.writeLong(this.f53729s);
        parcel.writeBundle(this.f53730w);
        parcel.writeInt(this.f53726f);
    }

    public w(Parcel parcel) {
        this.f53722a = parcel.readInt();
        this.f53723b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f53727n = parcel.readLong();
        this.f53724c = parcel.readLong();
        this.f53725e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14329b;
            createTypedArrayList = t1.f14397e;
        }
        this.f53728r = createTypedArrayList;
        this.f53729s = parcel.readLong();
        this.f53730w = parcel.readBundle(q.class.getClassLoader());
        this.f53726f = parcel.readInt();
    }
}
