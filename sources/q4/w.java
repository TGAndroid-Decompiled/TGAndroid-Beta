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
    public final int f53723a;
    public final long f53724b;
    public final long f53725c;
    public final float d;
    public final long f53726e;
    public final int f53727f;
    public final CharSequence h;
    public final long f53728n;
    public final AbstractCollection f53729r;
    public final long f53730s;
    public final Bundle f53731w;
    public PlaybackState f53732x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f53723a = i7;
        this.f53724b = j3;
        this.f53725c = j10;
        this.d = f10;
        this.f53726e = j11;
        this.f53727f = i10;
        this.h = charSequence;
        this.f53728n = j12;
        this.f53729r = new ArrayList(arrayList);
        this.f53730s = j13;
        this.f53731w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f53723a);
        sb2.append(", position=");
        sb2.append(this.f53724b);
        sb2.append(", buffered position=");
        sb2.append(this.f53725c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f53728n);
        sb2.append(", actions=");
        sb2.append(this.f53726e);
        sb2.append(", error code=");
        sb2.append(this.f53727f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f53729r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f53730s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f53723a);
        parcel.writeLong(this.f53724b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f53728n);
        parcel.writeLong(this.f53725c);
        parcel.writeLong(this.f53726e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f53729r);
        parcel.writeLong(this.f53730s);
        parcel.writeBundle(this.f53731w);
        parcel.writeInt(this.f53727f);
    }

    public w(Parcel parcel) {
        this.f53723a = parcel.readInt();
        this.f53724b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f53728n = parcel.readLong();
        this.f53725c = parcel.readLong();
        this.f53726e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14329b;
            createTypedArrayList = t1.f14397e;
        }
        this.f53729r = createTypedArrayList;
        this.f53730s = parcel.readLong();
        this.f53731w = parcel.readBundle(q.class.getClassLoader());
        this.f53727f = parcel.readInt();
    }
}
