package z9;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o implements Runnable {
    public final int f60213a;
    public final Object f60214b;
    public final Object f60215c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i3) {
        this.f60213a = i3;
        this.f60214b = obj;
        this.f60215c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f60213a) {
            case 0:
                String str = (String) this.f60215c;
                String str2 = (String) this.d;
                m mVar = ((p) this.f60214b).f60220f;
                mVar.getClass();
                try {
                    ((b4.n) mVar.d.d).B(str, str2);
                    return;
                } catch (IllegalArgumentException e10) {
                    Context context = mVar.f60195a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 1:
                za.f fVar = (za.f) this.f60214b;
                Intent intent = (Intent) this.f60215c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    fVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            default:
                zf.d dVar = (zf.d) this.f60214b;
                TLObject tLObject = (TLObject) this.f60215c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                String str3 = dVar.f60459b;
                int i3 = dVar.f60458a;
                if (tLObject != null) {
                    li.b0(i3).i1(str3, (TLRPC.Document) tLObject, false);
                } else {
                    dVar.a();
                    li.b0(i3).i1(str3, null, true);
                    if (tL_error != null) {
                        hs.f(i3).d(new xh.i(10, dVar, tL_error));
                    }
                }
                dVar.a();
                return;
        }
    }
}
