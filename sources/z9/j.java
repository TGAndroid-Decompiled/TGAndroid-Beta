package z9;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
public final class j implements Continuation, k5.e {
    public final int f60186a;

    public j(int i3) {
        this.f60186a = i3;
    }

    @Override
    public Object apply(Object obj) {
        ab.e eVar = (ab.e) obj;
        eVar.getClass();
        p7.d dVar = za.n.f60307a;
        dVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            dVar.l(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        int i3;
        switch (this.f60186a) {
            case 3:
                if (task.isSuccessful()) {
                    b bVar = (b) task.getResult();
                    w9.c cVar = w9.c.f57426a;
                    cVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f60165b);
                    z10 = true;
                    if (bVar.f60166c.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
            default:
                i3 = -1;
                break;
            case 5:
                i3 = 403;
                break;
        }
        return Integer.valueOf(i3);
    }

    public j(x xVar) {
        this.f60186a = 3;
    }
}
