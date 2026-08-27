package u5;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new d();

    public final Messenger f48407a;

    public f(IBinder iBinder) {
        this.f48407a = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f48407a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((f) obj).f48407a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f48407a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f48407a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
