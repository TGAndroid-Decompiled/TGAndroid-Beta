package u5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.ui.Components.mu0;

public final class a {
    public static int h;

    public static PendingIntent f48396i;

    public static final Pattern f48397j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    public final Context f48399b;

    public final w f48400c;
    public final ScheduledThreadPoolExecutor d;

    public Messenger f48402f;

    public f f48403g;

    public final a0.k f48398a = new a0.k(0);

    public final Messenger f48401e = new Messenger(new c(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f48399b = context;
        this.f48400c = new w(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        int i10;
        i10 = h;
        h = i10 + 1;
        return Integer.toString(i10);
    }

    public static synchronized void c(Context context, Intent intent) {
        try {
            if (f48396i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f48396i = PendingIntent.getBroadcast(context, 0, intent2, w6.a.f49269a);
            }
            intent.putExtra("app", f48396i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Task a(Bundle bundle) {
        String strB = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f48398a) {
            this.f48398a.put(strB, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f48400c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f48399b, intent);
        intent.putExtra("kid", "|ID|" + strB + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f48401e);
        if (this.f48402f != null || this.f48403g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f48402f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f48403g.f48407a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f48400c.g() == 2) {
                    this.f48399b.sendBroadcast(intent);
                } else {
                    this.f48399b.startService(intent);
                }
            }
        } else if (this.f48400c.g() == 2) {
            this.f48399b.sendBroadcast(intent);
        } else {
            this.f48399b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(l.f48424a, new u2.b(this, strB, this.d.schedule(new mu0(taskCompletionSource, 8), 30L, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f48398a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f48398a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
