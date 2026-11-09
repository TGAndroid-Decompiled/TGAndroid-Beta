package q4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new m6.e(27);
    public final MediaSession.Token f53813b;
    public d f53814c;
    public final Object f53812a = new Object();
    public b5.d d = null;

    public p(MediaSession.Token token, k kVar) {
        this.f53813b = token;
        this.f53814c = kVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f53812a) {
            dVar = this.f53814c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f53812a) {
            this.f53814c = dVar;
        }
    }

    public final void c(b5.d dVar) {
        synchronized (this.f53812a) {
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
        return this.f53813b.equals(((p) obj).f53813b);
    }

    public final int hashCode() {
        return this.f53813b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f53813b, i7);
    }
}
