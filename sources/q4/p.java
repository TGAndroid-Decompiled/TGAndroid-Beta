package q4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new m6.e(27);
    public final MediaSession.Token f53801b;
    public d f53802c;
    public final Object f53800a = new Object();
    public b5.d d = null;

    public p(MediaSession.Token token, k kVar) {
        this.f53801b = token;
        this.f53802c = kVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f53800a) {
            dVar = this.f53802c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f53800a) {
            this.f53802c = dVar;
        }
    }

    public final void c(b5.d dVar) {
        synchronized (this.f53800a) {
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
        return this.f53801b.equals(((p) obj).f53801b);
    }

    public final int hashCode() {
        return this.f53801b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f53801b, i7);
    }
}
