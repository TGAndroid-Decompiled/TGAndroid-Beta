package xb;

import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, r9.d {
    public static final a f48374a = new Object();
    public static final a f48375b = new Object();
    public static final a f48376c = new Object();

    @Override
    public Object j2(z5 z5Var) {
        return new c(z5Var.v(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        c5.a aVar = MobileVisionBase.e;
        if (Log.isLoggable(aVar.f4323b, 6)) {
            String str = aVar.f4324c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
