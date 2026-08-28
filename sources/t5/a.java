package t5;

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
import org.telegram.ui.Components.ju0;
public final class a {
    public static int h;
    public static PendingIntent f47671i;
    public static final Pattern f47672j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f47674b;
    public final w f47675c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f47677f;
    public g f47678g;
    public final a0.k f47673a = new a0.k(0);
    public final Messenger f47676e = new Messenger(new d(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f47674b = context;
        this.f47675c = new w(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (a.class) {
            int i9 = h;
            h = i9 + 1;
            num = Integer.toString(i9);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (a.class) {
            try {
                if (f47671i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f47671i = PendingIntent.getBroadcast(context, 0, intent2, v6.a.f48359a);
                }
                intent.putExtra("app", f47671i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f47673a) {
            this.f47673a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f47675c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f47674b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f47676e);
        if (this.f47677f != null || this.f47678g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f47677f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f47678g.f47685a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(m.f47702a, new c(this, b10, this.d.schedule(new ju0(taskCompletionSource, 7), 30L, TimeUnit.SECONDS), 0));
            return taskCompletionSource.getTask();
        }
        if (this.f47675c.g() == 2) {
            this.f47674b.sendBroadcast(intent);
        } else {
            this.f47674b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(m.f47702a, new c(this, b10, this.d.schedule(new ju0(taskCompletionSource, 7), 30L, TimeUnit.SECONDS), 0));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f47673a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f47673a.remove(str);
                if (taskCompletionSource == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
