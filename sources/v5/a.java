package v5;

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
import org.telegram.ui.Components.rk0;
public final class a {
    public static int h;
    public static PendingIntent f49398i;
    public static final Pattern f49399j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context f49401b;
    public final w f49402c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f49404f;
    public g f49405g;
    public final a0.k f49400a = new a0.k(0);
    public final Messenger f49403e = new Messenger(new d(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f49401b = context;
        this.f49402c = new w(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (a.class) {
            int i10 = h;
            h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (a.class) {
            try {
                if (f49398i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f49398i = PendingIntent.getBroadcast(context, 0, intent2, x6.a.f50097a);
                }
                intent.putExtra("app", f49398i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f49400a) {
            this.f49400a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f49402c.g() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f49401b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f49403e);
        if (this.f49404f != null || this.f49405g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f49404f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f49405g.f49412a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(m.f49429a, new c(this, b10, this.d.schedule(new rk0(taskCompletionSource, 11), 30L, TimeUnit.SECONDS), 0));
            return taskCompletionSource.getTask();
        }
        if (this.f49402c.g() == 2) {
            this.f49401b.sendBroadcast(intent);
        } else {
            this.f49401b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(m.f49429a, new c(this, b10, this.d.schedule(new rk0(taskCompletionSource, 11), 30L, TimeUnit.SECONDS), 0));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f49400a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f49400a.remove(str);
                if (taskCompletionSource == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
