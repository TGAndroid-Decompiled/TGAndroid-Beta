package p7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;
import y5.l;

public final class a extends Binder implements j, IInterface {

    public final int f45508a;

    public final TaskCompletionSource f45509b;

    public a(int i10, TaskCompletionSource taskCompletionSource) {
        this.f45508a = i10;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.f45509b = taskCompletionSource;
    }

    @Override
    public void C(int i10, boolean z10) {
        switch (this.f45508a) {
            case 1:
                g5.a(new Status(i10, null, null, null), Boolean.valueOf(z10), this.f45509b);
                break;
        }
    }

    @Override
    public void k0(Status status, boolean z10) {
        switch (this.f45508a) {
            case 1:
                g5.a(status, Boolean.valueOf(z10), this.f45509b);
                break;
        }
    }

    @Override
    public void l(Status status, g8.i iVar) {
        switch (this.f45508a) {
            case 0:
                int i10 = g8.a.f6714c;
                boolean zB = status.b();
                TaskCompletionSource taskCompletionSource = this.f45509b;
                if (!zB) {
                    taskCompletionSource.setException(l.m(status));
                } else {
                    taskCompletionSource.setResult(iVar);
                }
                break;
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        switch (i10) {
            case 1:
                parcel.readInt();
                return true;
            case 2:
                parcel.readInt();
                return true;
            case 3:
                int i12 = parcel.readInt();
                int i13 = c.f45510a;
                z10 = parcel.readInt() != 0;
                C(i12, z10);
                return true;
            case 4:
                parcel.readInt();
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i14 = c.f45510a;
                parcel.readInt();
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                z10 = parcel.readInt() != 0;
                k0(status, z10);
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                g8.i iVar = (g8.i) c.a(parcel, g8.i.CREATOR);
                l(status2, iVar);
                return true;
            case 15:
                return true;
            case 16:
                return true;
            case 17:
                return true;
            case 18:
                parcel.readInt();
                return true;
            case 19:
                return true;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    public final void E0(Status status, boolean z10) {
    }

    public final void F0(Status status, g8.i iVar) {
    }

    public final void G0(int i10, boolean z10) {
    }
}
