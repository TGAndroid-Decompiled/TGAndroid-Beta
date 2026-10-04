package pf;

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
    public boolean f44396e;
    public boolean f44397f;
    public boolean f44398g;
    public PictureInPictureParams h;
    public boolean f44404n;
    public final ArrayList f44393a = new ArrayList();
    public final ArrayList f44394b = new ArrayList();
    public final HashMap f44395c = new HashMap();
    public float f44399i = -1.0f;
    public final sf.a f44400j = new sf.a("enter");
    public final sf.a f44401k = new sf.a("leave");
    public final Choreographer f44402l = Choreographer.getInstance();
    public final b f44403m = new b(this, 0);
    public final g f44405o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f44401k.a();
        ArrayList arrayList = this.f44394b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.b) obj).getClass();
        }
        if (this.f44404n) {
            this.f44404n = false;
            this.f44402l.removeFrameCallback(this.f44403m);
        }
        this.f44397f = false;
        ArrayList arrayList2 = this.f44393a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.c) obj2).b();
        }
    }

    public final void b() {
        this.f44397f = true;
        int i10 = 0;
        this.f44398g = false;
        ArrayList arrayList = this.f44393a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).e();
        }
        sf.a aVar = this.f44400j;
        long j3 = aVar.f46784b;
        ArrayList arrayList2 = this.f44394b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f46785c = SystemClock.uptimeMillis();
        if (this.f44404n) {
            return;
        }
        this.f44404n = true;
        this.f44402l.postFrameCallback(this.f44403m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f44393a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).d();
        }
        sf.a aVar = this.f44401k;
        long j3 = aVar.f46784b;
        ArrayList arrayList2 = this.f44394b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f46785c = SystemClock.uptimeMillis();
        if (this.f44404n) {
            return;
        }
        this.f44404n = true;
        this.f44402l.postFrameCallback(this.f44403m);
    }

    public final void d(float f7) {
        if (f7 != this.f44399i) {
            this.f44399i = f7;
            ArrayList arrayList = this.f44394b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                rf.e eVar = (rf.e) ((qf.b) obj);
                eVar.f46038o = f7;
                f fVar = eVar.f46030f;
                if (fVar != null) {
                    fVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.u(launchActivity) && ((e) launchActivity.m0.f7908e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f44397f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f44398g != isStashed) {
                this.f44398g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f44393a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((qf.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((qf.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.f44396e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.f44405o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
