package vb;

import a8.r7;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import jb.m;
public final class a implements OnFailureListener, u9.d {
    public static final a f59485a = new Object();
    public static final a f59486b = new Object();
    public static final a f59487c = new Object();

    @Override
    public Object c(r7 r7Var) {
        return new c(r7Var.L(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        m mVar = MobileVisionBase.f7575e;
        if (Log.isLoggable((String) mVar.f17464b, 6)) {
            String str = (String) mVar.f17465c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
