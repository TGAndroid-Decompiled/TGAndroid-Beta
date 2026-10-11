package wb;

import android.util.Log;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, q9.d {
    public static final a f50409a = new Object();
    public static final a f50410b = new Object();
    public static final a f50411c = new Object();

    @Override
    public void onFailure(Exception exc) {
        c5.a aVar = MobileVisionBase.f8014e;
        if (Log.isLoggable(aVar.f4197a, 6)) {
            String str = aVar.f4198b;
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
