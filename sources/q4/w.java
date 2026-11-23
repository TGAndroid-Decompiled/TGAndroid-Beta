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
    public final int f55848a;
    public final long f55849b;
    public final long f55850c;
    public final float d;
    public final long f55851e;
    public final int f55852f;
    public final CharSequence h;
    public final long f55853n;
    public final AbstractCollection f55854r;
    public final long f55855s;
    public final Bundle f55856w;
    public PlaybackState f55857x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f55848a = i7;
        this.f55849b = j3;
        this.f55850c = j10;
        this.d = f10;
        this.f55851e = j11;
        this.f55852f = i10;
        this.h = charSequence;
        this.f55853n = j12;
        this.f55854r = new ArrayList(arrayList);
        this.f55855s = j13;
        this.f55856w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f55848a);
        sb2.append(", position=");
        sb2.append(this.f55849b);
        sb2.append(", buffered position=");
        sb2.append(this.f55850c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f55853n);
        sb2.append(", actions=");
        sb2.append(this.f55851e);
        sb2.append(", error code=");
        sb2.append(this.f55852f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f55854r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f55855s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f55848a);
        parcel.writeLong(this.f55849b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f55853n);
        parcel.writeLong(this.f55850c);
        parcel.writeLong(this.f55851e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f55854r);
        parcel.writeLong(this.f55855s);
        parcel.writeBundle(this.f55856w);
        parcel.writeInt(this.f55852f);
    }

    public w(Parcel parcel) {
        this.f55848a = parcel.readInt();
        this.f55849b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f55853n = parcel.readLong();
        this.f55850c = parcel.readLong();
        this.f55851e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f13998b;
            createTypedArrayList = t1.f14066e;
        }
        this.f55854r = createTypedArrayList;
        this.f55855s = parcel.readLong();
        this.f55856w = parcel.readBundle(q.class.getClassLoader());
        this.f55852f = parcel.readInt();
    }
}
