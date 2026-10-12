package wb;

import android.util.Log;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, q9.d {
    public static final a f50550a = new Object();
    public static final a f50551b = new Object();
    public static final a f50552c = new Object();

    @Override
    public void onFailure(Exception exc) {
        c5.a aVar = MobileVisionBase.f8012e;
        if (Log.isLoggable(aVar.f4196a, 6)) {
            String str = aVar.f4197b;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }

    @Override
    public Object x0(u5 u5Var) {
        return new c(u5Var.x(b.class));
    }
}
