package v0;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
public interface i {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, h hVar);

    void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, h hVar);
}
