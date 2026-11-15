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
    public final int f55264a;
    public final long f55265b;
    public final long f55266c;
    public final float d;
    public final long f55267e;
    public final int f55268f;
    public final CharSequence h;
    public final long f55269n;
    public final AbstractCollection f55270r;
    public final long f55271s;
    public final Bundle f55272w;
    public PlaybackState f55273x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f55264a = i7;
        this.f55265b = j3;
        this.f55266c = j10;
        this.d = f10;
        this.f55267e = j11;
        this.f55268f = i10;
        this.h = charSequence;
        this.f55269n = j12;
        this.f55270r = new ArrayList(arrayList);
        this.f55271s = j13;
        this.f55272w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f55264a);
        sb2.append(", position=");
        sb2.append(this.f55265b);
        sb2.append(", buffered position=");
        sb2.append(this.f55266c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f55269n);
        sb2.append(", actions=");
        sb2.append(this.f55267e);
        sb2.append(", error code=");
        sb2.append(this.f55268f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f55270r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f55271s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f55264a);
        parcel.writeLong(this.f55265b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f55269n);
        parcel.writeLong(this.f55266c);
        parcel.writeLong(this.f55267e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f55270r);
        parcel.writeLong(this.f55271s);
        parcel.writeBundle(this.f55272w);
        parcel.writeInt(this.f55268f);
    }

    public w(Parcel parcel) {
        this.f55264a = parcel.readInt();
        this.f55265b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f55269n = parcel.readLong();
        this.f55266c = parcel.readLong();
        this.f55267e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f13686b;
            createTypedArrayList = s1.f13749e;
        }
        this.f55270r = createTypedArrayList;
        this.f55271s = parcel.readLong();
        this.f55272w = parcel.readBundle(q.class.getClassLoader());
        this.f55268f = parcel.readInt();
    }
}
