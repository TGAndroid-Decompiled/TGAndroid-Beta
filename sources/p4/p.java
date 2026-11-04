package p4;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new n8.g(12);
    public final MediaSession.Token f53179b;
    public d f53180c;
    public final Object f53178a = new Object();
    public a5.d d = null;

    public p(MediaSession.Token token, k kVar) {
        this.f53179b = token;
        this.f53180c = kVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.f53178a) {
            dVar = this.f53180c;
        }
        return dVar;
    }

    public final void b(d dVar) {
        synchronized (this.f53178a) {
            this.f53180c = dVar;
        }
    }

    public final void c(a5.d dVar) {
        synchronized (this.f53178a) {
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
        return this.f53179b.equals(((p) obj).f53179b);
    }

    public final int hashCode() {
        return this.f53179b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f53179b, i3);
    }
}
