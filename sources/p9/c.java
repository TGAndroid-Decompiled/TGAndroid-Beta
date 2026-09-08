package p9;

import android.os.Parcel;
import cc.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class c extends w implements f {
    public TaskCompletionSource d;
    public final b[] f44044e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.f44044e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        k kVar;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f4974b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f4973a) {
            case 17510:
                kVar = new k(str);
                break;
            case 17511:
                kVar = new k(str);
                break;
            case 17512:
            default:
                kVar = new k(str);
                break;
            case 17513:
                kVar = new k(str);
                break;
            case 17514:
                kVar = new k(str);
                break;
        }
        taskCompletionSource.setException(kVar);
    }

    @Override
    public final void f(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        p7.a aVar = (p7.a) ((p7.b) cVar).u();
        b7.b bVar = new b7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = p7.c.f43984a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.f44044e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f43983a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
