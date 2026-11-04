package p4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
public final class e extends Binder implements b {
    public static final int f53145b = 0;
    public final WeakReference f53146a;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f53146a = new WeakReference(null);
    }

    @Override
    public final void c(int i3) {
        if (this.f53146a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final void i(int i3) {
        if (this.f53146a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        w wVar;
        if (i3 != 3) {
            if (i3 != 9) {
                if (i3 != 1598968902) {
                    WeakReference weakReference = this.f53146a;
                    switch (i3) {
                        case 11:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            parcel.readInt();
                            if (weakReference.get() != null) {
                                throw new ClassCastException();
                            }
                            break;
                        case 12:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            i(parcel.readInt());
                            return true;
                        case 13:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (weakReference.get() != null) {
                                throw new ClassCastException();
                            }
                            break;
                        default:
                            return super.onTransact(i3, parcel, parcel2, i10);
                    }
                    return true;
                }
                parcel2.getClass();
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            c(parcel.readInt());
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (parcel.readInt() != 0) {
            wVar = w.CREATOR.createFromParcel(parcel);
        } else {
            wVar = null;
        }
        u0(wVar);
        return true;
    }

    @Override
    public final void u0(w wVar) {
        if (this.f53146a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
