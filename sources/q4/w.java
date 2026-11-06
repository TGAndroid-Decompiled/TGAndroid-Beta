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
    public final int f53698a;
    public final long f53699b;
    public final long f53700c;
    public final float d;
    public final long f53701e;
    public final int f53702f;
    public final CharSequence h;
    public final long f53703n;
    public final AbstractCollection f53704r;
    public final long f53705s;
    public final Bundle f53706w;
    public PlaybackState f53707x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f53698a = i7;
        this.f53699b = j3;
        this.f53700c = j10;
        this.d = f10;
        this.f53701e = j11;
        this.f53702f = i10;
        this.h = charSequence;
        this.f53703n = j12;
        this.f53704r = new ArrayList(arrayList);
        this.f53705s = j13;
        this.f53706w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f53698a);
        sb2.append(", position=");
        sb2.append(this.f53699b);
        sb2.append(", buffered position=");
        sb2.append(this.f53700c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f53703n);
        sb2.append(", actions=");
        sb2.append(this.f53701e);
        sb2.append(", error code=");
        sb2.append(this.f53702f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f53704r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f53705s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f53698a);
        parcel.writeLong(this.f53699b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f53703n);
        parcel.writeLong(this.f53700c);
        parcel.writeLong(this.f53701e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f53704r);
        parcel.writeLong(this.f53705s);
        parcel.writeBundle(this.f53706w);
        parcel.writeInt(this.f53702f);
    }

    public w(Parcel parcel) {
        this.f53698a = parcel.readInt();
        this.f53699b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f53703n = parcel.readLong();
        this.f53700c = parcel.readLong();
        this.f53701e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14329b;
            createTypedArrayList = t1.f14397e;
        }
        this.f53704r = createTypedArrayList;
        this.f53705s = parcel.readLong();
        this.f53706w = parcel.readBundle(q.class.getClassLoader());
        this.f53702f = parcel.readInt();
    }
}
