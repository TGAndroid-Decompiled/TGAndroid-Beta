package wb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import lf.g;
public final class a implements OnFailureListener, q9.d {
    public static final a f49025a = new Object();
    public static final a f49026b = new Object();
    public static final a f49027c = new Object();

    @Override
    public Object E(cf.c cVar) {
        return new c(cVar.v(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        g gVar = MobileVisionBase.f7965e;
        if (Log.isLoggable(gVar.f15487b, 6)) {
            String str = gVar.f15488c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
