package xe;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Choreographer;
import androidx.mediarouter.app.h;
import dh.m;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;
public final class b {
    public final LaunchActivity d;
    public boolean f49123e;
    public boolean f49124f;
    public boolean f49125g;
    public PictureInPictureParams h;
    public boolean f49131n;
    public final ArrayList f49120a = new ArrayList();
    public final ArrayList f49121b = new ArrayList();
    public final HashMap f49122c = new HashMap();
    public float f49126i = -1.0f;
    public final af.a f49127j = new af.a("enter");
    public final af.a f49128k = new af.a("leave");
    public final Choreographer f49129l = Choreographer.getInstance();
    public final m f49130m = new m(this, 3);
    public final h f49132o = new h(this, 8);

    public b(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f49128k.a();
        ArrayList arrayList = this.f49121b;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ye.b) obj).getClass();
        }
        if (this.f49131n) {
            this.f49131n = false;
            this.f49129l.removeFrameCallback(this.f49130m);
        }
        this.f49124f = false;
        ArrayList arrayList2 = this.f49120a;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((ye.c) obj2).b();
        }
    }

    public final void b() {
        this.f49124f = true;
        int i9 = 0;
        this.f49125g = false;
        ArrayList arrayList = this.f49120a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ye.c) obj).e();
        }
        af.a aVar = this.f49127j;
        long j10 = aVar.f149b;
        ArrayList arrayList2 = this.f49121b;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((ye.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f150c = SystemClock.uptimeMillis();
        if (this.f49131n) {
            return;
        }
        this.f49131n = true;
        this.f49129l.postFrameCallback(this.f49130m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f49120a;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ye.c) obj).d();
        }
        af.a aVar = this.f49128k;
        long j10 = aVar.f149b;
        ArrayList arrayList2 = this.f49121b;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((ye.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f150c = SystemClock.uptimeMillis();
        if (this.f49131n) {
            return;
        }
        this.f49131n = true;
        this.f49129l.postFrameCallback(this.f49130m);
    }

    public final void d(float f10) {
        if (f10 != this.f49126i) {
            this.f49126i = f10;
            ArrayList arrayList = this.f49121b;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ze.e eVar = (ze.e) ((ye.b) obj);
                eVar.f50451o = f10;
                e eVar2 = eVar.f50443f;
                if (eVar2 != null) {
                    eVar2.invalidate();
                }
            }
        }
    }

    public final boolean e() {
        LaunchActivity launchActivity = this.d;
        if (e2.c.v(launchActivity) && ((d) launchActivity.f35512i0.f17101e) != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i9;
        if (!this.f49124f && (i9 = Build.VERSION.SDK_INT) < 31 && i9 >= 26 && this.h != null && e()) {
            b();
            this.d.enterPictureInPictureMode(this.h);
        }
    }

    public final void g(PictureInPictureUiState pictureInPictureUiState) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            if (i9 >= 35) {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed() + " " + pictureInPictureUiState.isTransitioningToPip());
                if (pictureInPictureUiState.isTransitioningToPip() && e()) {
                    b();
                }
            } else {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed());
            }
            boolean isStashed = pictureInPictureUiState.isStashed();
            if (this.f49125g != isStashed) {
                this.f49125g = isStashed;
                int i10 = 0;
                ArrayList arrayList = this.f49120a;
                if (isStashed) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((ye.c) obj).a();
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((ye.c) obj2).c();
                }
            }
        }
    }

    public final void h() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.f49123e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i9 = Build.VERSION.SDK_INT;
        h hVar = this.f49132o;
        LaunchActivity launchActivity = this.d;
        if (i9 >= 33) {
            launchActivity.registerReceiver(hVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(hVar, intentFilter);
        }
    }
}
