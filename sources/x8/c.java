package x8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
public final class c extends w implements f {
    public TaskCompletionSource d;
    public final b[] f49094e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.f49094e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        s sVar;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f2742b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f2741a) {
            case 17510:
                sVar = new s(str);
                break;
            case 17511:
                sVar = new s(str);
                break;
            case 17512:
            default:
                sVar = new s(str);
                break;
            case 17513:
                sVar = new s(str);
                break;
            case 17514:
                sVar = new s(str);
                break;
        }
        taskCompletionSource.setException(sVar);
    }

    @Override
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        z6.a aVar = (z6.a) ((z6.b) cVar).u();
        l6.b bVar = new l6.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i9 = z6.c.f50309a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.f49094e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f50308a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
