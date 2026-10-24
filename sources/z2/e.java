package z2;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.f;
import b2.w;
import c2.i;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.f0;
import j$.util.Objects;
import java.util.List;
public final class e {
    public final Spatializer f51100a;
    public final boolean f51101b;
    public final Handler f51102c;
    public final d d;

    public e(Context context, Runnable runnable, Boolean bool) {
        AudioManager e;
        if (context == null) {
            e = null;
        } else {
            e = i.e(context);
        }
        if (e != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = e.getSpatializer();
            this.f51100a = spatializer;
            this.f51101b = spatializer.getImmersiveAudioLevel() != 0;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.f51102c = handler;
            d dVar = new d(runnable);
            this.d = dVar;
            spatializer.addOnSpatializerStateChangedListener(new f0(handler, 1), dVar);
            return;
        }
        this.f51100a = null;
        this.f51101b = false;
        this.f51102c = null;
        this.d = null;
    }

    public final boolean a(f fVar, w wVar) {
        if (this.f51100a == null || !this.f51101b || !c() || !d()) {
            return false;
        }
        String str = wVar.f4135s;
        int i10 = wVar.K;
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
        int t10 = m0.t(i10);
        if (t10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t10);
        int i11 = wVar.L;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.f51100a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(fVar.b(), channelMask.build());
    }

    public final List b() {
        if (this.f51100a != null && this.f51101b && c() && d()) {
            if (Build.VERSION.SDK_INT >= 36) {
                Spatializer spatializer = this.f51100a;
                spatializer.getClass();
                return spatializer.getSpatializedChannelMasks();
            }
            return n0.y(252);
        }
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    public final boolean c() {
        Spatializer spatializer = this.f51100a;
        if (spatializer != null && spatializer.isAvailable()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        Spatializer spatializer = this.f51100a;
        if (spatializer != null && spatializer.isEnabled()) {
            return true;
        }
        return false;
    }

    public final void e() {
        d dVar;
        Handler handler;
        Spatializer spatializer = this.f51100a;
        if (spatializer != null && (dVar = this.d) != null && (handler = this.f51102c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(dVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
