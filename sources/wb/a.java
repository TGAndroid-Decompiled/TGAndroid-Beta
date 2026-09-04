package wb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import m2.u;
public final class a implements OnFailureListener, q9.d {
    public static final a f48478a = new Object();
    public static final a f48479b = new Object();
    public static final a f48480c = new Object();

    @Override
    public Object D(cf.c cVar) {
        return new c(cVar.s(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        u uVar = MobileVisionBase.f6436e;
        if (Log.isLoggable(uVar.f15820b, 6)) {
            String str = uVar.f15821c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
