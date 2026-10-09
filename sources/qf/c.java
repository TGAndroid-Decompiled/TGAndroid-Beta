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
    public boolean f46141e;
    public boolean f46142f;
    public boolean f46143g;
    public PictureInPictureParams h;
    public boolean f46149n;
    public final ArrayList f46138a = new ArrayList();
    public final ArrayList f46139b = new ArrayList();
    public final HashMap f46140c = new HashMap();
    public float f46144i = -1.0f;
    public final tf.a f46145j = new tf.a("enter");
    public final tf.a f46146k = new tf.a("leave");
    public final Choreographer f46147l = Choreographer.getInstance();
    public final b f46148m = new b(this, 0);
    public final g f46150o = new g(this, 9);

    public c(LaunchActivity launchActivity) {
        this.d = launchActivity;
    }

    public final void a(boolean z10) {
        d(0.0f);
        this.f46146k.a();
        ArrayList arrayList = this.f46139b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.b) obj).getClass();
        }
        if (this.f46149n) {
            this.f46149n = false;
            this.f46147l.removeFrameCallback(this.f46148m);
        }
        this.f46142f = false;
        ArrayList arrayList2 = this.f46138a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.c) obj2).b();
        }
    }

    public final void b() {
        this.f46142f = true;
        int i10 = 0;
        this.f46143g = false;
        ArrayList arrayList = this.f46138a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.c) obj).e();
        }
        tf.a aVar = this.f46145j;
        long j3 = aVar.f48256b;
        ArrayList arrayList2 = this.f46139b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.b) obj2).getClass();
        }
        d(0.0f);
        aVar.f48257c = SystemClock.uptimeMillis();
        if (this.f46149n) {
            return;
        }
        this.f46149n = true;
        this.f46147l.postFrameCallback(this.f46148m);
    }

    public final void c(boolean z10) {
        ArrayList arrayList = this.f46138a;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((rf.c) obj).d();
        }
        tf.a aVar = this.f46146k;
        long j3 = aVar.f48256b;
        ArrayList arrayList2 = this.f46139b;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((rf.b) obj2).getClass();
        }
        d(1.0f);
        aVar.f48257c = SystemClock.uptimeMillis();
        if (this.f46149n) {
            return;
        }
        this.f46149n = true;
        this.f46147l.postFrameCallback(this.f46148m);
    }

    public final void d(float f7) {
        if (f7 != this.f46144i) {
            this.f46144i = f7;
            ArrayList arrayList = this.f46139b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sf.e eVar = (sf.e) ((rf.b) obj);
                eVar.f47992o = f7;
                f fVar = eVar.f47984f;
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
        if (!this.f46142f && (i10 = Build.VERSION.SDK_INT) < 31 && i10 >= 26 && this.h != null && e()) {
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
            if (this.f46143g != isStashed) {
                this.f46143g = isStashed;
                int i11 = 0;
                ArrayList arrayList = this.f46138a;
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
        this.f46141e = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        int i10 = Build.VERSION.SDK_INT;
        g gVar = this.f46150o;
        LaunchActivity launchActivity = this.d;
        if (i10 >= 33) {
            launchActivity.registerReceiver(gVar, intentFilter, 4);
        } else {
            launchActivity.registerReceiver(gVar, intentFilter);
        }
    }
}
