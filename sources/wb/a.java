package wb;

import android.util.Log;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import mf.g;
public final class a implements OnFailureListener, q9.d {
    public static final a f50365a = new Object();
    public static final a f50366b = new Object();
    public static final a f50367c = new Object();

    @Override
    public void onFailure(Exception exc) {
        g gVar = MobileVisionBase.f8015e;
        if (Log.isLoggable(gVar.f16392a, 6)) {
            String str = gVar.f16393b;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }

    @Override
    public Object y0(u5 u5Var) {
        return new c(u5Var.y(b.class));
    }
}
