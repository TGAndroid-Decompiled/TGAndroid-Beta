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
    public boolean e;
    public boolean f41027f;
    public boolean f41028g;
    public PictureInPictureParams h;
    public boolean f41034n;
    public final ArrayList f41024a = new ArrayList();
    public final ArrayList f41025b = new ArrayList();
    public final HashMap f41026c = new HashMap();
    public float f41029i = -1.0f;
    public final sf.a f41030j = new sf.a("enter");
    public final sf.a f41031k = new sf.a("leave");
    public final Choreographer f41032l = Choreographer.getInstance();
    public final b f41033m = new b(this, 0);
    public final g f41035o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f41031k.a();
        ArrayList arrayList = this.f41025b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.b) obj).getClass();
        }
        if (this.f41034n) {
            this.f41034n = false;
            this.f41032l.removeFrameCallback(this.f41033m);
        }
        this.f41027f = false;
        ArrayList arrayList2 = this.f41024a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.c) obj2).b();
        }
    }

    public final void b() {
        this.f41027f = true;
        int i10 = 0;
        this.f41028g = false;
        ArrayList arrayList = this.f41024a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).e();
        }
        sf.a aVar = this.f41030j;
        long j3 = aVar.f43176b;
        ArrayList arrayList2 = this.f41025b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f43177c = SystemClock.uptimeMillis();
        if (this.f41034n) {
            return;
        }
        this.f41034n = true;
        this.f41032l.postFrameCallback(this.f41033m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f41024a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).d();
        }
        sf.a aVar = this.f41031k;
        long j3 = aVar.f43176b;
        ArrayList arrayList2 = this.f41025b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f43177c = SystemClock.uptimeMillis();
        if (this.f41034n) {
            return;
        }
        this.f41034n = true;
        this.f41032l.postFrameCallback(this.f41033m);
    }

    public final void d(float f7) {
        if (f7 != this.f41029i) {
            this.f41029i = f7;
            ArrayList arrayList = this.f41025b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                rf.e eVar = (rf.e) ((qf.b) obj);
                eVar.f42510o = f7;
                f fVar = eVar.f42502f;
                if (fVar != null) {
                    fVar.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.u(launchActivity) && ((e) launchActivity.m0.e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f41027f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f41028g != isStashed) {
                this.f41028g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f41024a;
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
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.f41035o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
