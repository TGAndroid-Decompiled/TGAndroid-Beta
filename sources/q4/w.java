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
    public final int f53815a;
    public final long f53816b;
    public final long f53817c;
    public final float d;
    public final long f53818e;
    public final int f53819f;
    public final CharSequence h;
    public final long f53820n;
    public final AbstractCollection f53821r;
    public final long f53822s;
    public final Bundle f53823w;
    public PlaybackState f53824x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f53815a = i7;
        this.f53816b = j3;
        this.f53817c = j10;
        this.d = f10;
        this.f53818e = j11;
        this.f53819f = i10;
        this.h = charSequence;
        this.f53820n = j12;
        this.f53821r = new ArrayList(arrayList);
        this.f53822s = j13;
        this.f53823w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f53815a);
        sb2.append(", position=");
        sb2.append(this.f53816b);
        sb2.append(", buffered position=");
        sb2.append(this.f53817c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f53820n);
        sb2.append(", actions=");
        sb2.append(this.f53818e);
        sb2.append(", error code=");
        sb2.append(this.f53819f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f53821r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f53822s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f53815a);
        parcel.writeLong(this.f53816b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f53820n);
        parcel.writeLong(this.f53817c);
        parcel.writeLong(this.f53818e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f53821r);
        parcel.writeLong(this.f53822s);
        parcel.writeBundle(this.f53823w);
        parcel.writeInt(this.f53819f);
    }

    public w(Parcel parcel) {
        this.f53815a = parcel.readInt();
        this.f53816b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f53820n = parcel.readLong();
        this.f53817c = parcel.readLong();
        this.f53818e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14329b;
            createTypedArrayList = t1.f14397e;
        }
        this.f53821r = createTypedArrayList;
        this.f53822s = parcel.readLong();
        this.f53823w = parcel.readBundle(q.class.getClassLoader());
        this.f53819f = parcel.readInt();
    }
}
