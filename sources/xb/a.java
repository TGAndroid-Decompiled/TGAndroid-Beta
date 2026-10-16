package xb;

import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, r9.d {
    public static final a f48373a = new Object();
    public static final a f48374b = new Object();
    public static final a f48375c = new Object();

    @Override
    public Object n2(z5 z5Var) {
        return new c(z5Var.w(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        c5.a aVar = MobileVisionBase.e;
        if (Log.isLoggable(aVar.f4326a, 6)) {
            String str = aVar.f4327b;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
