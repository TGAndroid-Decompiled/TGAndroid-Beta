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
    public final int f55883a;
    public final long f55884b;
    public final long f55885c;
    public final float d;
    public final long f55886e;
    public final int f55887f;
    public final CharSequence h;
    public final long f55888n;
    public final AbstractCollection f55889r;
    public final long f55890s;
    public final Bundle f55891w;
    public PlaybackState f55892x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f55883a = i7;
        this.f55884b = j3;
        this.f55885c = j10;
        this.d = f10;
        this.f55886e = j11;
        this.f55887f = i10;
        this.h = charSequence;
        this.f55888n = j12;
        this.f55889r = new ArrayList(arrayList);
        this.f55890s = j13;
        this.f55891w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f55883a);
        sb2.append(", position=");
        sb2.append(this.f55884b);
        sb2.append(", buffered position=");
        sb2.append(this.f55885c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f55888n);
        sb2.append(", actions=");
        sb2.append(this.f55886e);
        sb2.append(", error code=");
        sb2.append(this.f55887f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f55889r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f55890s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f55883a);
        parcel.writeLong(this.f55884b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f55888n);
        parcel.writeLong(this.f55885c);
        parcel.writeLong(this.f55886e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f55889r);
        parcel.writeLong(this.f55890s);
        parcel.writeBundle(this.f55891w);
        parcel.writeInt(this.f55887f);
    }

    public w(Parcel parcel) {
        this.f55883a = parcel.readInt();
        this.f55884b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f55888n = parcel.readLong();
        this.f55885c = parcel.readLong();
        this.f55886e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14035b;
            createTypedArrayList = t1.f14103e;
        }
        this.f55889r = createTypedArrayList;
        this.f55890s = parcel.readLong();
        this.f55891w = parcel.readBundle(q.class.getClassLoader());
        this.f55887f = parcel.readInt();
    }
}
