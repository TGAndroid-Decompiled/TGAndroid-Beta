package x5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.ui.Components.tl0;
import s5.m;
public final class a {
    public static int h;
    public static PendingIntent f50440i;
    public static final Pattern f50441j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final a0.k f50442a = new a0.k(0);
    public final Context f50443b;
    public final p2.g f50444c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger f50445e;
    public Messenger f50446f;
    public f f50447g;

    public a(Context context) {
        this.f50443b = context;
        ?? obj = new Object();
        obj.f44174b = 0;
        obj.f44175c = context;
        this.f50444c = obj;
        this.f50445e = new Messenger(new c(this, Looper.getMainLooper()));
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
                if (f50440i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f50440i = PendingIntent.getBroadcast(context, 0, intent2, z6.a.f51121a);
                }
                intent.putExtra("app", f50440i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task a(Bundle bundle) {
        String b10 = b();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f50442a) {
            this.f50442a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f50444c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f50443b, intent);
        intent.putExtra("kid", "|ID|" + b10 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f50445e);
        if (this.f50446f != null || this.f50447g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f50446f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f50447g.f50451a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener(l.f50468a, new m(this, b10, this.d.schedule(new tl0(taskCompletionSource, 11), 30L, TimeUnit.SECONDS), 7));
            return taskCompletionSource.getTask();
        }
        if (this.f50444c.h() == 2) {
            this.f50443b.sendBroadcast(intent);
        } else {
            this.f50443b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(l.f50468a, new m(this, b10, this.d.schedule(new tl0(taskCompletionSource, 11), 30L, TimeUnit.SECONDS), 7));
        return taskCompletionSource.getTask();
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f50442a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f50442a.remove(str);
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
