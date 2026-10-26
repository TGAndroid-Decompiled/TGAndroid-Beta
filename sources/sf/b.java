package sf;

import ag.d0;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.g;
import c3.h0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public final class b {
    public final LaunchActivity d;
    public boolean e;
    public boolean f48109f;
    public boolean f48110g;
    public PictureInPictureParams h;
    public boolean f48116n;
    public final ArrayList f48106a = new ArrayList();
    public final ArrayList f48107b = new ArrayList();
    public final HashMap f48108c = new HashMap();
    public float f48111i = -1.0f;
    public final vf.a f48112j = new vf.a("enter");
    public final vf.a f48113k = new vf.a("leave");
    public final Choreographer f48114l = Choreographer.getInstance();
    public final d0 f48115m = new d0(this, 2);
    public final g f48117o = new g(this, 11);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f48113k.a();
        ArrayList arrayList = this.f48107b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((tf.b) obj).getClass();
        }
        if (this.f48116n) {
            this.f48116n = false;
            this.f48114l.removeFrameCallback(this.f48115m);
        }
        this.f48109f = false;
        ArrayList arrayList2 = this.f48106a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((tf.c) obj2).b();
        }
    }

    public final void b() {
        this.f48109f = true;
        int i10 = 0;
        this.f48110g = false;
        ArrayList arrayList = this.f48106a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((tf.c) obj).e();
        }
        vf.a aVar = this.f48112j;
        long j10 = aVar.f50111b;
        ArrayList arrayList2 = this.f48107b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((tf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f50112c = SystemClock.uptimeMillis();
        if (this.f48116n) {
            return;
        }
        this.f48116n = true;
        this.f48114l.postFrameCallback(this.f48115m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f48106a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((tf.c) obj).d();
        }
        vf.a aVar = this.f48113k;
        long j10 = aVar.f50111b;
        ArrayList arrayList2 = this.f48107b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((tf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f50112c = SystemClock.uptimeMillis();
        if (this.f48116n) {
            return;
        }
        this.f48116n = true;
        this.f48114l.postFrameCallback(this.f48115m);
    }

    public final void d(float f7) {
        if (f7 != this.f48111i) {
            this.f48111i = f7;
            ArrayList arrayList = this.f48107b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                uf.e eVar = (uf.e) ((tf.b) obj);
                eVar.f49733o = f7;
                e eVar2 = eVar.f49725f;
                if (eVar2 != null) {
                    eVar2.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (h0.t(launchActivity) && ((d) launchActivity.m0.e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i10;
        if (!this.f48109f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f48110g != isStashed) {
                this.f48110g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f48106a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((tf.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    ((tf.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.f48117o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
