package yb;

import a8.me;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, s9.d {
    public static final a f52569a = new Object();
    public static final a f52570b = new Object();
    public static final a f52571c = new Object();

    @Override
    public Object d1(me meVar) {
        return new c(meVar.x(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        d5.a aVar = MobileVisionBase.e;
        if (Log.isLoggable(aVar.f7928a, 6)) {
            String str = aVar.f7929b;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
