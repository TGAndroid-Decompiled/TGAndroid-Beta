package wb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import lf.g;
public final class a implements OnFailureListener, q9.d {
    public static final a f45008a = new Object();
    public static final a f45009b = new Object();
    public static final a f45010c = new Object();

    @Override
    public Object G(cf.c cVar) {
        return new c(cVar.w(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        g gVar = MobileVisionBase.e;
        if (Log.isLoggable(gVar.f14018b, 6)) {
            String str = gVar.f14019c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
