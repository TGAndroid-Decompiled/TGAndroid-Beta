package q4;

import a8.p0;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m6.e(26);
    public final h f55860a;
    public final long f55861b;
    public MediaSession.QueueItem f55862c;

    public o(h hVar, long j3) {
        if (j3 != -1) {
            this.f55860a = hVar;
            this.f55861b = j3;
            this.f55862c = null;
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
        sb2.append(this.f55860a);
        sb2.append(", Id=");
        return p0.r(sb2, this.f55861b, " }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        this.f55860a.writeToParcel(parcel, i7);
        parcel.writeLong(this.f55861b);
    }

    public o(Parcel parcel) {
        this.f55860a = h.CREATOR.createFromParcel(parcel);
        this.f55861b = parcel.readLong();
    }
}
