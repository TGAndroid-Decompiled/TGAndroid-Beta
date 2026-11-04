package s9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import l6.m;
public final class c extends t implements e {
    public TaskCompletionSource d;
    public final b[] f54688e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.f54688e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        m mVar;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f6582b;
        str = (str == null || str.isEmpty()) ? "User Action indexing error, please try again." : "User Action indexing error, please try again.";
        switch (status.f6581a) {
            case 17510:
                mVar = new m(str);
                break;
            case 17511:
                mVar = new m(str);
                break;
            case 17512:
            default:
                mVar = new m(str);
                break;
            case 17513:
                mVar = new m(str);
                break;
            case 17514:
                mVar = new m(str);
                break;
        }
        taskCompletionSource.setException(mVar);
    }

    @Override
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        r7.a aVar = (r7.a) ((r7.b) cVar).m();
        d7.b bVar = new d7.b(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i3 = r7.c.f54402a;
        obtain.writeStrongBinder(bVar);
        obtain.writeTypedArray(this.f54688e, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            aVar.f54401a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
