package p4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n8.g(11);
    public final h f53175a;
    public final long f53176b;
    public MediaSession.QueueItem f53177c;

    public o(h hVar, long j10) {
        if (j10 != -1) {
            this.f53175a = hVar;
            this.f53176b = j10;
            this.f53177c = null;
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
        sb2.append(this.f53175a);
        sb2.append(", Id=");
        return a1.g.r(sb2, this.f53176b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        this.f53175a.writeToParcel(parcel, i3);
        parcel.writeLong(this.f53176b);
    }

    public o(Parcel parcel) {
        this.f53175a = h.CREATOR.createFromParcel(parcel);
        this.f53176b = parcel.readLong();
    }
}
