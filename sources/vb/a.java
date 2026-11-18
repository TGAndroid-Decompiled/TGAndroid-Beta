package vb;

import a8.r7;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, u9.d {
    public static final a f59357a = new Object();
    public static final a f59358b = new Object();
    public static final a f59359c = new Object();

    @Override
    public Object e(r7 r7Var) {
        return new c(r7Var.L(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        k8.a aVar = MobileVisionBase.f7584e;
        if (Log.isLoggable((String) aVar.f18183b, 6)) {
            String str = (String) aVar.f18184c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
