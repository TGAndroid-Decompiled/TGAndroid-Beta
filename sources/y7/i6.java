package y7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class i6 implements com.google.android.gms.common.api.internal.p {
    public final int f58931a;
    public Object f58932b;

    public i6(int i7) {
        this.f58931a = i7;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        y8.e eVar = (y8.e) this.f58932b;
        h8.b bVar = (h8.b) obj;
        bVar.getClass();
        h8.a aVar = new h8.a(1, (TaskCompletionSource) obj2);
        try {
            h8.i iVar = (h8.i) bVar.n();
            Bundle B = bVar.B();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i7 = h8.c.f14276a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f14284a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            Bundle bundle = Bundle.EMPTY;
            a8.k8.a(Status.h, Boolean.FALSE, aVar.f14275b);
        }
    }

    public String toString() {
        switch (this.f58931a) {
            case 3:
                ze.b bVar = ze.b.f60017e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ug.k0) this.f58932b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public i6(Object obj, int i7) {
        this.f58931a = i7;
        this.f58932b = obj;
    }
}
