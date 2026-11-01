package z2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.f;
import b2.x;
import c2.h;
import e2.l0;
import e9.n0;
import e9.x1;
import i2.g0;
import j$.util.Objects;
import java.util.List;
public final class d {
    public final Spatializer f54567a;
    public final boolean f54568b;
    public final Handler f54569c;
    public final c d;

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager e;
        if (context == null) {
            e = null;
        } else {
            e = h.e(context);
        }
        if (e != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = e.getSpatializer();
            this.f54567a = spatializer;
            this.f54568b = spatializer.getImmersiveAudioLevel() != 0;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.f54569c = handler;
            c cVar = new c(runnable);
            this.d = cVar;
            spatializer.addOnSpatializerStateChangedListener(new g0(handler, 1), cVar);
            return;
        }
        this.f54567a = null;
        this.f54568b = false;
        this.f54569c = null;
        this.d = null;
    }

    public final boolean a(f fVar, x xVar) {
        if (this.f54567a == null || !this.f54568b || !c() || !d()) {
            return false;
        }
        String str = xVar.f2423s;
        int i10 = xVar.K;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i10 == 18 || i10 == 21)) {
            i10 = 24;
        }
        int t10 = l0.t(i10);
        if (t10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t10);
        int i11 = xVar.L;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.f54567a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(fVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.f54567a != null && this.f54568b && c() && d()) {
            if (Build.VERSION.SDK_INT >= 36) {
                Spatializer spatializer = this.f54567a;
                spatializer.getClass();
                return spatializer.getSpatializedChannelMasks();
            }
            return n0.y(252);
        }
        e9.l0 l0Var = n0.f6390b;
        return x1.e;
    }

    public final boolean c() {
        Spatializer spatializer = this.f54567a;
        if (spatializer != null && spatializer.isAvailable()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        Spatializer spatializer = this.f54567a;
        if (spatializer != null && spatializer.isEnabled()) {
            return true;
        }
        return false;
    }

    public final void e() {
        c cVar;
        Handler handler;
        Spatializer spatializer = this.f54567a;
        if (spatializer != null && (cVar = this.d) != null && (handler = this.f54569c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(cVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
