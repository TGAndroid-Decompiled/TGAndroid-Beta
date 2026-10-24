package xb;

import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import m2.t;
public final class a implements OnFailureListener, r9.d {
    public static final a f50209a = new Object();
    public static final a f50210b = new Object();
    public static final a f50211c = new Object();

    @Override
    public Object j2(z5 z5Var) {
        return new c(z5Var.y(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        t tVar = MobileVisionBase.e;
        if (Log.isLoggable(tVar.f16532b, 6)) {
            String str = tVar.f16533c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
