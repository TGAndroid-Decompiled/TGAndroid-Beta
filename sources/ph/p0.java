package ph;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.e30;
public final class p0 implements Runnable {
    public final int f45272a;
    public final Context f45273b;

    public p0(Context context, int i10) {
        this.f45272a = i10;
        this.f45273b = context;
    }

    @Override
    public final void run() {
        Handler handler;
        int i10 = this.f45272a;
        Context context = this.f45273b;
        switch (i10) {
            case 0:
                new e30(context).show();
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.f.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new p0(context, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new p0(context, 3));
                return;
            case 3:
                r4.d.s(context, new a3.b(3), r4.d.f46314a, false);
                return;
            case 4:
                new e30(context).show();
                return;
            case 5:
                gf.f.r(context, dd.L0(2131744984, null));
                return;
            case 6:
                gf.f.r(context, dd.L0(2131744984, null));
                return;
            case 7:
                gf.f.r(context, dd.L0(2131747750, null));
                return;
            case 8:
                gf.f.r(context, dd.L0(2131745037, null));
                return;
            case 9:
                gf.f.r(context, dd.L0(2131744984, null));
                return;
            case 10:
                gf.f.r(context, dd.L0(2131745062, null));
                return;
            case 11:
                new e30(context).show();
                return;
            default:
                gf.f.r(context, dd.L0(2131752506, null));
                return;
        }
    }

    public p0(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f45272a = 1;
        this.f45273b = context;
    }
}
