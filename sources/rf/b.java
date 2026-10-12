package rf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.f;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public final class b {
    public final LaunchActivity d;
    public boolean e;
    public boolean f44155f;
    public boolean f44156g;
    public PictureInPictureParams h;
    public boolean f44162n;
    public final ArrayList f44152a = new ArrayList();
    public final ArrayList f44153b = new ArrayList();
    public final HashMap f44154c = new HashMap();
    public float f44157i = -1.0f;
    public final uf.a f44158j = new uf.a("enter");
    public final uf.a f44159k = new uf.a("leave");
    public final Choreographer f44160l = Choreographer.getInstance();
    public final r4.e f44161m = new r4.e(this, 1);
    public final f f44163o = new f(this, 10);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f44159k.a();
        ArrayList arrayList = this.f44153b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((sf.b) obj).getClass();
        }
        if (this.f44162n) {
            this.f44162n = false;
            this.f44160l.removeFrameCallback(this.f44161m);
        }
        this.f44155f = false;
        ArrayList arrayList2 = this.f44152a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sf.c) obj2).b();
        }
    }

    public final void b() {
        this.f44155f = true;
        int i10 = 0;
        this.f44156g = false;
        ArrayList arrayList = this.f44152a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((sf.c) obj).e();
        }
        uf.a aVar = this.f44158j;
        long j10 = aVar.f46247b;
        ArrayList arrayList2 = this.f44153b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f46248c = SystemClock.uptimeMillis();
        if (this.f44162n) {
            return;
        }
        this.f44162n = true;
        this.f44160l.postFrameCallback(this.f44161m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f44152a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((sf.c) obj).d();
        }
        uf.a aVar = this.f44159k;
        long j10 = aVar.f46247b;
        ArrayList arrayList2 = this.f44153b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((sf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f46248c = SystemClock.uptimeMillis();
        if (this.f44162n) {
            return;
        }
        this.f44162n = true;
        this.f44160l.postFrameCallback(this.f44161m);
    }

    public final void d(float f7) {
        if (f7 != this.f44157i) {
            this.f44157i = f7;
            ArrayList arrayList = this.f44153b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tf.e eVar = (tf.e) ((sf.b) obj);
                eVar.f45657o = f7;
                e eVar2 = eVar.f45649f;
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
        if (!this.f44155f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f44156g != isStashed) {
                this.f44156g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f44152a;
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
        f fVar = this.f44163o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(fVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(fVar, intentFilter);
        }
    }
}
