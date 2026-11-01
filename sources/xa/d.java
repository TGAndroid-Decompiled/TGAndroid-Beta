package xa;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class d {
    public static final AtomicInteger f53554a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static xa.g a(com.google.firebase.messaging.FirebaseMessagingService r18, r2.y r19) {
        throw new UnsupportedOperationException("Method not decompiled: xa.d.a(com.google.firebase.messaging.FirebaseMessagingService, r2.y):xa.g");
    }

    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
