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
    public boolean f41043f;
    public boolean f41044g;
    public PictureInPictureParams h;
    public boolean f41050n;
    public final ArrayList f41040a = new ArrayList();
    public final ArrayList f41041b = new ArrayList();
    public final HashMap f41042c = new HashMap();
    public float f41045i = -1.0f;
    public final sf.a f41046j = new sf.a("enter");
    public final sf.a f41047k = new sf.a("leave");
    public final Choreographer f41048l = Choreographer.getInstance();
    public final b f41049m = new b(this, 0);
    public final g f41051o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f41047k.a();
        ArrayList arrayList = this.f41041b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.b) obj).getClass();
        }
        if (this.f41050n) {
            this.f41050n = false;
            this.f41048l.removeFrameCallback(this.f41049m);
        }
        this.f41043f = false;
        ArrayList arrayList2 = this.f41040a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.c) obj2).b();
        }
    }

    public final void b() {
        this.f41043f = true;
        int i10 = 0;
        this.f41044g = false;
        ArrayList arrayList = this.f41040a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).e();
        }
        sf.a aVar = this.f41046j;
        long j3 = aVar.f43192b;
        ArrayList arrayList2 = this.f41041b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f43193c = SystemClock.uptimeMillis();
        if (this.f41050n) {
            return;
        }
        this.f41050n = true;
        this.f41048l.postFrameCallback(this.f41049m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f41040a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((qf.c) obj).d();
        }
        sf.a aVar = this.f41047k;
        long j3 = aVar.f43192b;
        ArrayList arrayList2 = this.f41041b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((qf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f43193c = SystemClock.uptimeMillis();
        if (this.f41050n) {
            return;
        }
        this.f41050n = true;
        this.f41048l.postFrameCallback(this.f41049m);
    }

    public final void d(float f7) {
        if (f7 != this.f41045i) {
            this.f41045i = f7;
            ArrayList arrayList = this.f41041b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                rf.e eVar = (rf.e) ((qf.b) obj);
                eVar.f42526o = f7;
                f fVar = eVar.f42518f;
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
        if (!this.f41043f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f41044g != isStashed) {
                this.f41044g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f41040a;
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
        g gVar = this.f41051o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
