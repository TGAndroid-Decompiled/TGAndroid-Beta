package x5;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new Object();
    public final Messenger f46812a;

    public f(IBinder iBinder) {
        this.f46812a = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                Messenger messenger = this.f46812a;
                messenger.getClass();
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((f) obj).f46812a;
                messenger2.getClass();
                return binder.equals(messenger2.getBinder());
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Messenger messenger = this.f46812a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f46812a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
