package wb;

import android.util.Log;
import bi.u6;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import lf.g;
public final class a implements OnFailureListener, q9.d {
    public static final a f43964a = new Object();
    public static final a f43965b = new Object();
    public static final a f43966c = new Object();

    @Override
    public Object P1(u6 u6Var) {
        return new c(u6Var.x(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        g gVar = MobileVisionBase.e;
        if (Log.isLoggable(gVar.f12913b, 6)) {
            String str = gVar.f12914c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
