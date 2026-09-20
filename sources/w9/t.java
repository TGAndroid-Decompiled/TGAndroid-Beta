package w9;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public final class t extends d {
    public final String f45276a;
    public final ExecutorService f45277b;

    public t(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f45276a = str;
        this.f45277b = executorService;
    }

    @Override
    public final void a() {
        String str = this.f45276a;
        ExecutorService executorService = this.f45277b;
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
            String p5 = a4.a.p("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", p5, null);
            }
            executorService.shutdownNow();
        }
    }
}
