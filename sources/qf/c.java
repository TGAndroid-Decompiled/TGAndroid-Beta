package qf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.g;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final LaunchActivity d;
    public boolean f44333e;
    public boolean f44334f;
    public boolean f44335g;
    public PictureInPictureParams h;
    public boolean f44341n;
    public final ArrayList f44330a = new ArrayList();
    public final ArrayList f44331b = new ArrayList();
    public final HashMap f44332c = new HashMap();
    public float f44336i = -1.0f;
    public final tf.a f44337j = new tf.a("enter");
    public final tf.a f44338k = new tf.a("leave");
    public final Choreographer f44339l = Choreographer.getInstance();
    public final b f44340m = new b(this, 0);
    public final g f44342o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f44338k.a();
        ArrayList arrayList = this.f44331b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.b) obj).getClass();
        }
        if (this.f44341n) {
            this.f44341n = false;
            this.f44339l.removeFrameCallback(this.f44340m);
        }
        this.f44334f = false;
        ArrayList arrayList2 = this.f44330a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.c) obj2).b();
        }
    }

    public final void b() {
        this.f44334f = true;
        int i10 = 0;
        this.f44335g = false;
        ArrayList arrayList = this.f44330a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.c) obj).e();
        }
        tf.a aVar = this.f44337j;
        long j3 = aVar.f46484b;
        ArrayList arrayList2 = this.f44331b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f46485c = SystemClock.uptimeMillis();
        if (this.f44341n) {
            return;
        }
        this.f44341n = true;
        this.f44339l.postFrameCallback(this.f44340m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f44330a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.c) obj).d();
        }
        tf.a aVar = this.f44338k;
        long j3 = aVar.f46484b;
        ArrayList arrayList2 = this.f44331b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f46485c = SystemClock.uptimeMillis();
        if (this.f44341n) {
            return;
        }
        this.f44341n = true;
        this.f44339l.postFrameCallback(this.f44340m);
    }

    public final void d(float f7) {
        if (f7 != this.f44336i) {
            this.f44336i = f7;
            ArrayList arrayList = this.f44331b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sf.e eVar = (sf.e) ((rf.b) obj);
                eVar.f46009o = f7;
                f fVar = eVar.f46001f;
                if (fVar != null) {
                    fVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.u(launchActivity) && ((e) launchActivity.m0.f6377e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f44334f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f44335g != isStashed) {
                this.f44335g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f44330a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((rf.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((rf.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.f44333e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.f44342o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
