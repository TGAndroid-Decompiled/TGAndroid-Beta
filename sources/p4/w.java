package p4;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new n8.g(13);
    public final int f53193a;
    public final long f53194b;
    public final long f53195c;
    public final float d;
    public final long f53196e;
    public final int f53197f;
    public final CharSequence h;
    public final long f53198n;
    public final AbstractCollection f53199r;
    public final long f53200s;
    public final Bundle f53201w;
    public PlaybackState f53202x;

    public w(int i3, long j10, long j11, float f10, long j12, int i10, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f53193a = i3;
        this.f53194b = j10;
        this.f53195c = j11;
        this.d = f10;
        this.f53196e = j12;
        this.f53197f = i10;
        this.h = charSequence;
        this.f53198n = j13;
        this.f53199r = new ArrayList(arrayList);
        this.f53200s = j14;
        this.f53201w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f53193a);
        sb2.append(", position=");
        sb2.append(this.f53194b);
        sb2.append(", buffered position=");
        sb2.append(this.f53195c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f53198n);
        sb2.append(", actions=");
        sb2.append(this.f53196e);
        sb2.append(", error code=");
        sb2.append(this.f53197f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f53199r);
        sb2.append(", active item id=");
        return a1.g.r(sb2, this.f53200s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f53193a);
        parcel.writeLong(this.f53194b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f53198n);
        parcel.writeLong(this.f53195c);
        parcel.writeLong(this.f53196e);
        TextUtils.writeToParcel(this.h, parcel, i3);
        parcel.writeTypedList(this.f53199r);
        parcel.writeLong(this.f53200s);
        parcel.writeBundle(this.f53201w);
        parcel.writeInt(this.f53197f);
    }

    public w(Parcel parcel) {
        this.f53193a = parcel.readInt();
        this.f53194b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f53198n = parcel.readLong();
        this.f53195c = parcel.readLong();
        this.f53196e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f12083b;
            createTypedArrayList = s1.f12146e;
        }
        this.f53199r = createTypedArrayList;
        this.f53200s = parcel.readLong();
        this.f53201w = parcel.readBundle(q.class.getClassLoader());
        this.f53197f = parcel.readInt();
    }
}
