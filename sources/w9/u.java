package w9;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public final class u extends d {
    public final String f49011a;
    public final ExecutorService f49012b;

    public u(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f49011a = str;
        this.f49012b = executorService;
    }

    @Override
    public final void a() {
        String str = this.f49011a;
        ExecutorService executorService = this.f49012b;
        try {
            String concat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat, null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                String concat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", concat2, null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String q6 = a4.a.q("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", q6, null);
            }
            executorService.shutdownNow();
        }
    }
}
