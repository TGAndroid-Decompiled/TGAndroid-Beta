package y8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.q;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class c extends w implements f {
    public TaskCompletionSource d;

    public final b[] f49811e;

    public c(b[] bVarArr) {
        super(null, false, 9004);
        this.f49811e = bVarArr;
    }

    @Override
    public final void a(q qVar) {
        Exception aVar;
        Status status = (Status) qVar;
        if (status.b()) {
            this.d.setResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.d;
        String str = status.f3187b;
        if (str == null || str.isEmpty()) {
            str = "User Action indexing error, please try again.";
        }
        switch (status.f3186a) {
            case 17510:
                aVar = new w8.a(str);
                break;
            case 17511:
                aVar = new w8.a(str);
                break;
            case 17512:
            default:
                aVar = new t8.c(str);
                break;
            case 17513:
                aVar = new w8.a(str);
                break;
            case 17514:
                aVar = new w8.b(str);
                break;
        }
        taskCompletionSource.setException(aVar);
    }

    @Override
    public final void c(com.google.android.gms.common.api.c cVar, TaskCompletionSource taskCompletionSource) {
        this.d = taskCompletionSource;
        a7.a aVar = (a7.a) ((a7.b) cVar).u();
        m6.b bVar = new m6.b(this);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        int i10 = a7.d.f105a;
        parcelObtain.writeStrongBinder(bVar);
        parcelObtain.writeTypedArray(this.f49811e, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            aVar.f104a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
