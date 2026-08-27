package ye;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import e2.f;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

public final class b {
    public final LaunchActivity d;

    public boolean f49839e;

    public boolean f49840f;

    public boolean f49841g;
    public PictureInPictureParams h;

    public boolean f49847n;

    public final ArrayList f49836a = new ArrayList();

    public final ArrayList f49837b = new ArrayList();

    public final HashMap f49838c = new HashMap();

    public float f49842i = -1.0f;

    public final bf.a f49843j = new bf.a("enter");

    public final bf.a f49844k = new bf.a("leave");

    public final Choreographer f49845l = Choreographer.getInstance();

    public final f f49846m = new f(this, 3);

    public final androidx.mediarouter.app.f f49848o = new androidx.mediarouter.app.f(this, 8);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f49844k.a();
        ArrayList arrayList = this.f49837b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((ze.b) obj).getClass();
        }
        if (this.f49847n) {
            this.f49847n = false;
            this.f49845l.removeFrameCallback(this.f49846m);
        }
        this.f49840f = false;
        ArrayList arrayList2 = this.f49836a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((ze.c) obj2).b();
        }
    }

    public final void b() {
        this.f49840f = true;
        int i10 = 0;
        this.f49841g = false;
        ArrayList arrayList = this.f49836a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((ze.c) obj).e();
        }
        bf.a aVar = this.f49843j;
        long j10 = aVar.f2077b;
        ArrayList arrayList2 = this.f49837b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((ze.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f2078c = SystemClock.uptimeMillis();
        if (this.f49847n) {
            return;
        }
        this.f49847n = true;
        this.f49845l.postFrameCallback(this.f49846m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f49836a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((ze.c) obj).d();
        }
        bf.a aVar = this.f49844k;
        long j10 = aVar.f2077b;
        ArrayList arrayList2 = this.f49837b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((ze.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f2078c = SystemClock.uptimeMillis();
        if (this.f49847n) {
            return;
        }
        this.f49847n = true;
        this.f49845l.postFrameCallback(this.f49846m);
    }

    public final void d(float f10) {
        if (f10 == this.f49842i) {
            return;
        }
        this.f49842i = f10;
        ArrayList arrayList = this.f49837b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            af.f fVar = (af.f) ((ze.b) obj);
            fVar.f270o = f10;
            e eVar = fVar.f262f;
            if (eVar != null) {
                eVar.invalidate();
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        return com.google.android.recaptcha.internal.a.u(launchActivity) && ((d) launchActivity.f35515i0.f17476e) != null;
    }

    public final void f() {
        int i10;
        if (!this.f49840f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
            b();
            this.d.enterPictureInPictureMode(this.h);
        }
    }

    public final void g(PictureInPictureUiState pictureInPictureUiState) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (i10 >= 35) {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed() + " " + pictureInPictureUiState.isTransitioningToPip());
                if (pictureInPictureUiState.isTransitioningToPip() && e()) {
                    b();
                }
            } else {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed());
            }
            boolean zIsStashed = pictureInPictureUiState.isStashed();
            if (this.f49841g != zIsStashed) {
                this.f49841g = zIsStashed;
                int i11 = 0;
                ArrayList arrayList = this.f49836a;
                if (zIsStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((ze.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((ze.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.f49839e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        androidx.mediarouter.app.f fVar = this.f49848o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(fVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(fVar, intentFilter);
        }
    }
}
