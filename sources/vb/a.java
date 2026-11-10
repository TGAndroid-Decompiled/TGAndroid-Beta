package vb;

import a8.r7;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, u9.d {
    public static final a f57315a = new Object();
    public static final a f57316b = new Object();
    public static final a f57317c = new Object();

    @Override
    public Object e(r7 r7Var) {
        return new c(r7Var.H(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        f5.a aVar = MobileVisionBase.f7914e;
        if (Log.isLoggable(aVar.f11117a, 6)) {
            String str = aVar.f11118b;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
