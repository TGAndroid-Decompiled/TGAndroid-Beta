package t9;

import ab.a0;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class c extends t implements e {
    public TaskCompletionSource d;
    public final b[] f55350e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.f55350e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        a0 a0Var;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f6530b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f6529a) {
            case 17510:
                a0Var = new a0(str);
                break;
            case 17511:
                a0Var = new a0(str);
                break;
            case 17512:
            default:
                a0Var = new a0(str);
                break;
            case 17513:
                a0Var = new a0(str);
                break;
            case 17514:
                a0Var = new a0(str);
                break;
        }
        taskCompletionSource.setException(a0Var);
    }

    @Override
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        s7.a aVar = (s7.a) ((s7.b) cVar).n();
        e7.b bVar = new e7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i7 = s7.c.f54818a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.f55350e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f54817a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
