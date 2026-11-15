package vb;

import a8.r7;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, u9.d {
    public static final a f58788a = new Object();
    public static final a f58789b = new Object();
    public static final a f58790c = new Object();

    @Override
    public Object i(r7 r7Var) {
        return new c(r7Var.I(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        k8.a aVar = MobileVisionBase.f7298e;
        if (Log.isLoggable((String) aVar.f17788b, 6)) {
            String str = (String) aVar.f17789c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
