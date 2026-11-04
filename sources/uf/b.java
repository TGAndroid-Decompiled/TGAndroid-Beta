package uf;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.f;
import cg.x;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
import wf.e;
public final class b {
    public final LaunchActivity d;
    public boolean f55828e;
    public boolean f55829f;
    public boolean f55830g;
    public PictureInPictureParams h;
    public boolean f55836n;
    public final ArrayList f55825a = new ArrayList();
    public final ArrayList f55826b = new ArrayList();
    public final HashMap f55827c = new HashMap();
    public float f55831i = -1.0f;
    public final xf.a f55832j = new xf.a("enter");
    public final xf.a f55833k = new xf.a("leave");
    public final Choreographer f55834l = Choreographer.getInstance();
    public final x f55835m = new x(this, 2);
    public final f f55837o = new f(this, 13);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f55833k.a();
        ArrayList arrayList = this.f55826b;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((e) obj).getClass();
        }
        if (this.f55836n) {
            this.f55836n = false;
            this.f55834l.removeFrameCallback(this.f55835m);
        }
        this.f55829f = false;
        ArrayList arrayList2 = this.f55825a;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((vf.b) obj2).b();
        }
    }

    public final void b() {
        this.f55829f = true;
        int i3 = 0;
        this.f55830g = false;
        ArrayList arrayList = this.f55825a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vf.b) obj).e();
        }
        xf.a aVar = this.f55832j;
        long j10 = aVar.f58622b;
        ArrayList arrayList2 = this.f55826b;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((e) obj2).getClass();
        }
        d(0.0f);
        aVar.f58623c = SystemClock.uptimeMillis();
        if (this.f55836n) {
            return;
        }
        this.f55836n = true;
        this.f55834l.postFrameCallback(this.f55835m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f55825a;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vf.b) obj).d();
        }
        xf.a aVar = this.f55833k;
        long j10 = aVar.f58622b;
        ArrayList arrayList2 = this.f55826b;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((e) obj2).getClass();
        }
        d(1.0f);
        aVar.f58623c = SystemClock.uptimeMillis();
        if (this.f55836n) {
            return;
        }
        this.f55836n = true;
        this.f55834l.postFrameCallback(this.f55835m);
    }

    public final void d(float f10) {
        if (f10 != this.f55831i) {
            this.f55831i = f10;
            ArrayList arrayList = this.f55826b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                e eVar = (e) obj;
                eVar.f57582o = f10;
                org.telegram.ui.e eVar2 = eVar.f57574f;
                if (eVar2 != null) {
                    eVar2.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (com.google.android.recaptcha.internal.a.u(launchActivity) && ((d) launchActivity.f41306n0.f17692e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i3;
        if (!this.f55829f && (i3 = Build.VERSION.SDK_INT) < 31 && i3 >= 26 && this.h != null && e()) {
            b();
            this.d.enterPictureInPictureMode(this.h);
        }
    }

    public final void g(PictureInPictureUiState pictureInPictureUiState) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            if (i3 >= 35) {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed() + " " + pictureInPictureUiState.isTransitioningToPip());
                if (pictureInPictureUiState.isTransitioningToPip() && e()) {
                    b();
                }
            } else {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed());
            }
            boolean isStashed = pictureInPictureUiState.isStashed();
            if (this.f55830g != isStashed) {
                this.f55830g = isStashed;
                int i10 = 0;
                ArrayList arrayList = this.f55825a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((vf.b) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((vf.b) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.f55828e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i3 = Build.VERSION.SDK_INT;
        f fVar = this.f55837o;
        LaunchActivity launchActivity = this.d;
        if (i3 >= 33) {
            launchActivity.registerReceiver(fVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(fVar, intentFilter);
        }
    }
}
