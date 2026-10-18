package rf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
import r4.f;
public final class b {
    public final LaunchActivity d;
    public boolean e;
    public boolean f45244f;
    public boolean f45245g;
    public PictureInPictureParams h;
    public boolean f45251n;
    public final ArrayList f45241a = new ArrayList();
    public final ArrayList f45242b = new ArrayList();
    public final HashMap f45243c = new HashMap();
    public float f45246i = -1.0f;
    public final uf.a f45247j = new uf.a("enter");
    public final uf.a f45248k = new uf.a("leave");
    public final Choreographer f45249l = Choreographer.getInstance();
    public final f f45250m = new f(this, 1);
    public final androidx.mediarouter.app.f f45252o = new androidx.mediarouter.app.f(this, 10);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f45248k.a();
        ArrayList arrayList = this.f45242b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((sf.b) obj).getClass();
        }
        if (this.f45251n) {
            this.f45251n = false;
            this.f45249l.removeFrameCallback(this.f45250m);
        }
        this.f45244f = false;
        ArrayList arrayList2 = this.f45241a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sf.c) obj2).b();
        }
    }

    public final void b() {
        this.f45244f = true;
        int i10 = 0;
        this.f45245g = false;
        ArrayList arrayList = this.f45241a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((sf.c) obj).e();
        }
        uf.a aVar = this.f45247j;
        long j10 = aVar.f47633b;
        ArrayList arrayList2 = this.f45242b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f47634c = SystemClock.uptimeMillis();
        if (this.f45251n) {
            return;
        }
        this.f45251n = true;
        this.f45249l.postFrameCallback(this.f45250m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f45241a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((sf.c) obj).d();
        }
        uf.a aVar = this.f45248k;
        long j10 = aVar.f47633b;
        ArrayList arrayList2 = this.f45242b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f47634c = SystemClock.uptimeMillis();
        if (this.f45251n) {
            return;
        }
        this.f45251n = true;
        this.f45249l.postFrameCallback(this.f45250m);
    }

    public final void d(float f7) {
        if (f7 != this.f45246i) {
            this.f45246i = f7;
            ArrayList arrayList = this.f45242b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tf.e eVar = (tf.e) ((sf.b) obj);
                eVar.f47016o = f7;
                e eVar2 = eVar.f47008f;
                if (eVar2 != null) {
                    eVar2.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (k3.s(launchActivity) && ((d) launchActivity.m0.e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f45244f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            boolean isStashed = pictureInPictureUiState.isStashed();
            if (this.f45245g != isStashed) {
                this.f45245g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f45241a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((sf.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((sf.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        androidx.mediarouter.app.f fVar = this.f45252o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(fVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(fVar, intentFilter);
        }
    }
}
