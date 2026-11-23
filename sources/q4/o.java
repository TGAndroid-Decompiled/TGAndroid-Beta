package q4;

import a8.p0;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m6.e(26);
    public final h f55942a;
    public final long f55943b;
    public MediaSession.QueueItem f55944c;

    public o(h hVar, long j3) {
        if (j3 != -1) {
            this.f55942a = hVar;
            this.f55943b = j3;
            this.f55944c = null;
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
        sb2.append(this.f55942a);
        sb2.append(", Id=");
        return p0.r(sb2, this.f55943b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        this.f55942a.writeToParcel(parcel, i7);
        parcel.writeLong(this.f55943b);
    }

    public o(Parcel parcel) {
        this.f55942a = h.CREATOR.createFromParcel(parcel);
        this.f55943b = parcel.readLong();
    }
}
