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
    public final int f55838a;
    public final long f55839b;
    public final long f55840c;
    public final float d;
    public final long f55841e;
    public final int f55842f;
    public final CharSequence h;
    public final long f55843n;
    public final AbstractCollection f55844r;
    public final long f55845s;
    public final Bundle f55846w;
    public PlaybackState f55847x;

    public w(int i7, long j3, long j10, float f10, long j11, int i10, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.f55838a = i7;
        this.f55839b = j3;
        this.f55840c = j10;
        this.d = f10;
        this.f55841e = j11;
        this.f55842f = i10;
        this.h = charSequence;
        this.f55843n = j12;
        this.f55844r = new ArrayList(arrayList);
        this.f55845s = j13;
        this.f55846w = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f55838a);
        sb2.append(", position=");
        sb2.append(this.f55839b);
        sb2.append(", buffered position=");
        sb2.append(this.f55840c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.f55843n);
        sb2.append(", actions=");
        sb2.append(this.f55841e);
        sb2.append(", error code=");
        sb2.append(this.f55842f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.f55844r);
        sb2.append(", active item id=");
        return p0.r(sb2, this.f55845s, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f55838a);
        parcel.writeLong(this.f55839b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f55843n);
        parcel.writeLong(this.f55840c);
        parcel.writeLong(this.f55841e);
        TextUtils.writeToParcel(this.h, parcel, i7);
        parcel.writeTypedList(this.f55844r);
        parcel.writeLong(this.f55845s);
        parcel.writeBundle(this.f55846w);
        parcel.writeInt(this.f55842f);
    }

    public w(Parcel parcel) {
        this.f55838a = parcel.readInt();
        this.f55839b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f55843n = parcel.readLong();
        this.f55840c = parcel.readLong();
        this.f55841e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(v.CREATOR);
        if (createTypedArrayList == null) {
            g0 g0Var = i0.f14003b;
            createTypedArrayList = t1.f14071e;
        }
        this.f55844r = createTypedArrayList;
        this.f55845s = parcel.readLong();
        this.f55846w = parcel.readBundle(q.class.getClassLoader());
        this.f55842f = parcel.readInt();
    }
}
