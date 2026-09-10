package w9;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public final class t extends d {
    public final String f43937a;
    public final ExecutorService f43938b;

    public t(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f43937a = str;
        this.f43938b = executorService;
    }

    @Override
    public final void a() {
        String str = this.f43937a;
        ExecutorService executorService = this.f43938b;
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
