package r9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.p;
public final class c extends v implements f {
    public TaskCompletionSource d;
    public final b[] e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        p pVar;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f6467b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f6466a) {
            case 17510:
                pVar = new p(str);
                break;
            case 17511:
                pVar = new p(str);
                break;
            case 17512:
            default:
                pVar = new p(str);
                break;
            case 17513:
                pVar = new p(str);
                break;
            case 17514:
                pVar = new p(str);
                break;
        }
        taskCompletionSource.setException(pVar);
    }

    @Override
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        q7.a aVar = (q7.a) ((q7.b) cVar).u();
        c7.b bVar = new c7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = q7.c.f46979a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f46978a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
