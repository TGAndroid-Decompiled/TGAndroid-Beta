package pb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, r9.d {
    public static final a f44907a = new Object();
    public static final a f44908b = new Object();
    public static final a f44909c = new Object();

    @Override
    public Object K(bh.d dVar) {
        return new c(dVar.J(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        c5.a aVar = MobileVisionBase.e;
        if (Log.isLoggable(aVar.f3731b, 6)) {
            String str = aVar.f3732c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
