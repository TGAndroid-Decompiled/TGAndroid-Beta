package za;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class d {
    public static final AtomicInteger f60286a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static za.g a(com.google.firebase.messaging.FirebaseMessagingService r18, org.telegram.ui.Components.y00 r19) {
        throw new UnsupportedOperationException("Method not decompiled: za.d.a(com.google.firebase.messaging.FirebaseMessagingService, org.telegram.ui.Components.y00):za.g");
    }

    public static boolean b(Resources resources, int i3) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i3, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i3);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i3 + ", treating it as an invalid icon");
            return false;
        }
    }
}
