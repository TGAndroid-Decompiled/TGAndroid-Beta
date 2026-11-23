package q4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new m6.e(27);
    public final MediaSession.Token f55868b;
    public d f55869c;
    public final Object f55867a = new Object();
    public b5.d d = null;

    public p(MediaSession.Token token, k kVar) {
        this.f55868b = token;
        this.f55869c = kVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f55867a) {
            dVar = this.f55869c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f55867a) {
            this.f55869c = dVar;
        }
    }

    public final void c(b5.d dVar) {
        synchronized (this.f55867a) {
            this.d = dVar;
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f55868b.equals(((p) obj).f55868b);
    }

    public final int hashCode() {
        return this.f55868b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f55868b, i7);
    }
}
