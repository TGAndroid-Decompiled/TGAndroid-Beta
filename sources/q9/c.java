package q9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.r;
public final class c extends w implements f {
    public TaskCompletionSource d;
    public final b[] e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        r rVar;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f4889b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f4888a) {
            case 17510:
                rVar = new r(str);
                break;
            case 17511:
                rVar = new r(str);
                break;
            case 17512:
            default:
                rVar = new r(str);
                break;
            case 17513:
                rVar = new r(str);
                break;
            case 17514:
                rVar = new r(str);
                break;
        }
        taskCompletionSource.setException(rVar);
    }

    @Override
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        p7.a aVar = (p7.a) ((p7.b) cVar).u();
        b7.b bVar = new b7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = p7.c.f42848a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f42847a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
