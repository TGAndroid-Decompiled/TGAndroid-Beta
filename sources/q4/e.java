package q4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
public final class e extends Binder implements b {
    public static final int f53673b = 0;
    public final WeakReference f53674a;

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f53674a = new WeakReference(null);
    }

    @Override
    public final void e(int i7) {
        if (this.f53674a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final void j(int i7) {
        if (this.f53674a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        w wVar;
        if (i7 != 3) {
            if (i7 != 9) {
                if (i7 != 1598968902) {
                    WeakReference weakReference = this.f53674a;
                    switch (i7) {
                        case 11:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            parcel.readInt();
                            if (weakReference.get() != null) {
                                throw new ClassCastException();
                            }
                            break;
                        case 12:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            j(parcel.readInt());
                            return true;
                        case 13:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (weakReference.get() != null) {
                                throw new ClassCastException();
                            }
                            break;
                        default:
                            return super.onTransact(i7, parcel, parcel2, i10);
                    }
                    return true;
                }
                parcel2.getClass();
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            e(parcel.readInt());
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (parcel.readInt() != 0) {
            wVar = w.CREATOR.createFromParcel(parcel);
        } else {
            wVar = null;
        }
        x0(wVar);
        return true;
    }

    @Override
    public final void x0(w wVar) {
        if (this.f53674a.get() == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
