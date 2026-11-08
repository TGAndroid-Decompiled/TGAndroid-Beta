package q4;

import a8.p0;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m6.e(26);
    public final h f53797a;
    public final long f53798b;
    public MediaSession.QueueItem f53799c;

    public o(h hVar, long j3) {
        if (j3 != -1) {
            this.f53797a = hVar;
            this.f53798b = j3;
            this.f53799c = null;
            return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem { Description=");
        sb2.append(this.f53797a);
        sb2.append(", Id=");
        return p0.r(sb2, this.f53798b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        this.f53797a.writeToParcel(parcel, i7);
        parcel.writeLong(this.f53798b);
    }

    public o(Parcel parcel) {
        this.f53797a = h.CREATOR.createFromParcel(parcel);
        this.f53798b = parcel.readLong();
    }
}
