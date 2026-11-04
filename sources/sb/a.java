package sb;

import android.util.Log;
import b8.ke;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import org.telegram.messenger.m6;
public final class a implements OnFailureListener, t9.d {
    public static final a f54691a = new Object();
    public static final a f54692b = new Object();
    public static final a f54693c = new Object();

    @Override
    public void onFailure(Exception exc) {
        m6 m6Var = MobileVisionBase.f7966e;
        if (Log.isLoggable(m6Var.f24168a, 6)) {
            String str = m6Var.f24169b;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }

    @Override
    public Object q1(ke keVar) {
        return new c(keVar.I(b.class));
    }
}
