package wb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, q9.d {
    public static final a f45324a = new Object();
    public static final a f45325b = new Object();
    public static final a f45326c = new Object();

    @Override
    public Object G(cf.c cVar) {
        return new c(cVar.x(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        c5.a aVar = MobileVisionBase.e;
        if (Log.isLoggable(aVar.f3841b, 6)) {
            String str = aVar.f3842c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
