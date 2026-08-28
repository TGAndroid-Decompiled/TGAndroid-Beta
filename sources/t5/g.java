package t5;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new Object();
    public final Messenger f47685a;

    public g(IBinder iBinder) {
        this.f47685a = new Messenger(iBinder);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                Messenger messenger = this.f47685a;
                messenger.getClass();
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((g) obj).f47685a;
                messenger2.getClass();
                return binder.equals(messenger2.getBinder());
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Messenger messenger = this.f47685a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        Messenger messenger = this.f47685a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
