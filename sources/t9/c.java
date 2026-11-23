package t9;

import ab.b0;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.r;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class c extends u implements e {
    public TaskCompletionSource d;
    public final b[] f57645e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.f57645e = bVarArr;
    }

    @Override
    public final void a(r rVar) {
        b0 b0Var;
        Status status = (Status) rVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f6190b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f6189a) {
            case 17510:
                b0Var = new b0(str);
                break;
            case 17511:
                b0Var = new b0(str);
                break;
            case 17512:
            default:
                b0Var = new b0(str);
                break;
            case 17513:
                b0Var = new b0(str);
                break;
            case 17514:
                b0Var = new b0(str);
                break;
        }
        taskCompletionSource.setException(b0Var);
    }

    @Override
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        s7.a aVar = (s7.a) ((s7.b) cVar).n();
        e7.b bVar = new e7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i7 = s7.c.f57086a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.f57645e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f57085a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
