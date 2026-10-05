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
    public boolean f44403e;
    public boolean f44404f;
    public boolean f44405g;
    public PictureInPictureParams h;
    public boolean f44411n;
    public final ArrayList f44400a = new ArrayList();
    public final ArrayList f44401b = new ArrayList();
    public final HashMap f44402c = new HashMap();
    public float f44406i = -1.0f;
    public final sf.a f44407j = new sf.a("enter");
    public final sf.a f44408k = new sf.a("leave");
    public final Choreographer f44409l = Choreographer.getInstance();
    public final b f44410m = new b(this, 0);
    public final g f44412o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f44408k.a();
        ArrayList arrayList = this.f44401b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.b) obj).getClass();
        }
        if (this.f44411n) {
            this.f44411n = false;
            this.f44409l.removeFrameCallback(this.f44410m);
        }
        this.f44404f = false;
        ArrayList arrayList2 = this.f44400a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.c) obj2).b();
        }
    }

    public final void b() {
        this.f44404f = true;
        int i10 = 0;
        this.f44405g = false;
        ArrayList arrayList = this.f44400a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).e();
        }
        sf.a aVar = this.f44407j;
        long j3 = aVar.f46791b;
        ArrayList arrayList2 = this.f44401b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f46792c = SystemClock.uptimeMillis();
        if (this.f44411n) {
            return;
        }
        this.f44411n = true;
        this.f44409l.postFrameCallback(this.f44410m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f44400a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).d();
        }
        sf.a aVar = this.f44408k;
        long j3 = aVar.f46791b;
        ArrayList arrayList2 = this.f44401b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f46792c = SystemClock.uptimeMillis();
        if (this.f44411n) {
            return;
        }
        this.f44411n = true;
        this.f44409l.postFrameCallback(this.f44410m);
    }

    public final void d(float f7) {
        if (f7 != this.f44406i) {
            this.f44406i = f7;
            ArrayList arrayList = this.f44401b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                rf.e eVar = (rf.e) ((qf.b) obj);
                eVar.f46045o = f7;
                f fVar = eVar.f46037f;
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
        if (!this.f44404f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f44405g != isStashed) {
                this.f44405g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f44400a;
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
        this.f44403e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.f44412o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
