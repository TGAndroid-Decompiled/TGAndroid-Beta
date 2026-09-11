package v8;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
public abstract class a {
    public static final long f47682a = TimeUnit.MINUTES.toMillis(10);
    public static final long f47683b = SystemClock.elapsedRealtime();
    public static final int f47684c = 0;

    public static void a(Task task, Activity activity) {
        ?? obj = new Object();
        int incrementAndGet = v.f47757f.incrementAndGet();
        obj.f47758a = incrementAndGet;
        v.f47756e.put(incrementAndGet, obj);
        v.d.postDelayed(obj, f47682a);
        task.addOnCompleteListener(obj);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i10 = obj.f47758a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i10);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", f47683b);
        Fragment fragment = new Fragment();
        fragment.setArguments(bundle);
        int i11 = obj.f47758a;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i11);
        beginTransaction.add(fragment, sb2.toString()).commit();
    }

    public static void b(Activity activity, int i10, int i11, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i10, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
                return;
            }
            return;
        }
        try {
            createPendingResult.send(i11);
        } catch (PendingIntent.CanceledException e7) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e7);
            }
        }
    }
}
