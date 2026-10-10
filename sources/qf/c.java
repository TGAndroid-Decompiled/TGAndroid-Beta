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
    public boolean f46185e;
    public boolean f46186f;
    public boolean f46187g;
    public PictureInPictureParams h;
    public boolean f46193n;
    public final ArrayList f46182a = new ArrayList();
    public final ArrayList f46183b = new ArrayList();
    public final HashMap f46184c = new HashMap();
    public float f46188i = -1.0f;
    public final tf.a f46189j = new tf.a("enter");
    public final tf.a f46190k = new tf.a("leave");
    public final Choreographer f46191l = Choreographer.getInstance();
    public final b f46192m = new b(this, 0);
    public final g f46194o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f46190k.a();
        ArrayList arrayList = this.f46183b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.b) obj).getClass();
        }
        if (this.f46193n) {
            this.f46193n = false;
            this.f46191l.removeFrameCallback(this.f46192m);
        }
        this.f46186f = false;
        ArrayList arrayList2 = this.f46182a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.c) obj2).b();
        }
    }

    public final void b() {
        this.f46186f = true;
        int i10 = 0;
        this.f46187g = false;
        ArrayList arrayList = this.f46182a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.c) obj).e();
        }
        tf.a aVar = this.f46189j;
        long j3 = aVar.f48300b;
        ArrayList arrayList2 = this.f46183b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f48301c = SystemClock.uptimeMillis();
        if (this.f46193n) {
            return;
        }
        this.f46193n = true;
        this.f46191l.postFrameCallback(this.f46192m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f46182a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.c) obj).d();
        }
        tf.a aVar = this.f46190k;
        long j3 = aVar.f48300b;
        ArrayList arrayList2 = this.f46183b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f48301c = SystemClock.uptimeMillis();
        if (this.f46193n) {
            return;
        }
        this.f46193n = true;
        this.f46191l.postFrameCallback(this.f46192m);
    }

    public final void d(float f7) {
        if (f7 != this.f46188i) {
            this.f46188i = f7;
            ArrayList arrayList = this.f46183b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sf.e eVar = (sf.e) ((rf.b) obj);
                eVar.f48036o = f7;
                f fVar = eVar.f48028f;
                if (fVar != null) {
                    fVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.t(launchActivity) && ((e) launchActivity.m0.f7957e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f46186f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f46187g != isStashed) {
                this.f46187g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f46182a;
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
        this.f46185e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.f46194o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
