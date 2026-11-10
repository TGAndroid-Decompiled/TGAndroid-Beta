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
    public final int f53827a;
    public final long f53828b;
    public final long f53829c;
    public final float d;
    public final long f53830e;
    public final int f53831f;
    public final CharSequence h;
    public final long f53832n;
    public final AbstractCollection f53833r;
    public final long f53834s;
    public final Bundle f53835w;
    public PlaybackState f53836x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f53827a = i7;
        this.f53828b = j3;
        this.f53829c = j10;
        this.d = f10;
        this.f53830e = j11;
        this.f53831f = i10;
        this.h = charSequence;
        this.f53832n = j12;
        this.f53833r = new ArrayList(arrayList);
        this.f53834s = j13;
        this.f53835w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f53827a);
        sb2.append(", position=");
        sb2.append(this.f53828b);
        sb2.append(", buffered position=");
        sb2.append(this.f53829c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f53832n);
        sb2.append(", actions=");
        sb2.append(this.f53830e);
        sb2.append(", error code=");
        sb2.append(this.f53831f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f53833r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f53834s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f53827a);
        parcel.writeLong(this.f53828b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f53832n);
        parcel.writeLong(this.f53829c);
        parcel.writeLong(this.f53830e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f53833r);
        parcel.writeLong(this.f53834s);
        parcel.writeBundle(this.f53835w);
        parcel.writeInt(this.f53831f);
    }

    public w(Parcel parcel) {
        this.f53827a = parcel.readInt();
        this.f53828b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f53832n = parcel.readLong();
        this.f53829c = parcel.readLong();
        this.f53830e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14331b;
            createTypedArrayList = t1.f14399e;
        }
        this.f53833r = createTypedArrayList;
        this.f53834s = parcel.readLong();
        this.f53835w = parcel.readBundle(q.class.getClassLoader());
        this.f53831f = parcel.readInt();
    }
}
