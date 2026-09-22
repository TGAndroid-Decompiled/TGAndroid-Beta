package x2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import e2.d0;
import j$.util.Objects;
import k2.c0;
public final class l {
    public final Spatializer f45501a;
    public final boolean f45502b;
    public final Handler f45503c;
    public final k d;

    public l(Context context, q qVar, Boolean bool) {
        AudioManager e;
        if (context == null) {
            e = null;
        } else {
            e = c2.d.e(context);
        }
        if (e != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = e.getSpatializer();
            this.f45501a = spatializer;
            this.f45502b = spatializer.getImmersiveAudioLevel() != 0;
            k kVar = new k(qVar);
            this.d = kVar;
            Looper myLooper = Looper.myLooper();
            e2.d.h(myLooper);
            Handler handler = new Handler(myLooper);
            this.f45503c = handler;
            spatializer.addOnSpatializerStateChangedListener(new c0(handler, 0), kVar);
            return;
        }
        this.f45501a = null;
        this.f45502b = false;
        this.f45503c = null;
        this.d = null;
    }

    public final boolean a(b2.e eVar, b2.s sVar) {
        String str = sVar.f3308r;
        String str2 = sVar.f3308r;
        int i10 = sVar.J;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str2, "audio/iamf")) {
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str2, "audio/ac4") && (i10 == 18 || i10 == 21)) {
            i10 = 24;
        }
        int s10 = d0.s(i10);
        if (s10 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s10);
        int i11 = sVar.K;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.f45501a;
        spatializer.getClass();
        return spatializer.canBeSpatialized((AudioAttributes) eVar.b().f3343a, channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.f45501a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.f45501a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        k kVar;
        Handler handler;
        Spatializer spatializer = this.f45501a;
        if (spatializer != null && (kVar = this.d) != null && (handler = this.f45503c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(kVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
