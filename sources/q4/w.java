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
    public final int f53828a;
    public final long f53829b;
    public final long f53830c;
    public final float d;
    public final long f53831e;
    public final int f53832f;
    public final CharSequence h;
    public final long f53833n;
    public final AbstractCollection f53834r;
    public final long f53835s;
    public final Bundle f53836w;
    public PlaybackState f53837x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f53828a = i7;
        this.f53829b = j3;
        this.f53830c = j10;
        this.d = f10;
        this.f53831e = j11;
        this.f53832f = i10;
        this.h = charSequence;
        this.f53833n = j12;
        this.f53834r = new ArrayList(arrayList);
        this.f53835s = j13;
        this.f53836w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f53828a);
        sb2.append(", position=");
        sb2.append(this.f53829b);
        sb2.append(", buffered position=");
        sb2.append(this.f53830c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f53833n);
        sb2.append(", actions=");
        sb2.append(this.f53831e);
        sb2.append(", error code=");
        sb2.append(this.f53832f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f53834r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f53835s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f53828a);
        parcel.writeLong(this.f53829b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f53833n);
        parcel.writeLong(this.f53830c);
        parcel.writeLong(this.f53831e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f53834r);
        parcel.writeLong(this.f53835s);
        parcel.writeBundle(this.f53836w);
        parcel.writeInt(this.f53832f);
    }

    public w(Parcel parcel) {
        this.f53828a = parcel.readInt();
        this.f53829b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f53833n = parcel.readLong();
        this.f53830c = parcel.readLong();
        this.f53831e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14329b;
            createTypedArrayList = t1.f14397e;
        }
        this.f53834r = createTypedArrayList;
        this.f53835s = parcel.readLong();
        this.f53836w = parcel.readBundle(q.class.getClassLoader());
        this.f53832f = parcel.readInt();
    }
}
