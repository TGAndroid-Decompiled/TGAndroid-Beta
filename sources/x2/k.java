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
public final class k {
    public final Spatializer f45435a;
    public final boolean f45436b;
    public final Handler f45437c;
    public final j d;

    public k(Context context, p pVar, Boolean bool) {
        AudioManager e;
        if (context == null) {
            e = null;
        } else {
            e = c2.d.e(context);
        }
        if (e != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = e.getSpatializer();
            this.f45435a = spatializer;
            this.f45436b = spatializer.getImmersiveAudioLevel() != 0;
            j jVar = new j(pVar);
            this.d = jVar;
            Looper myLooper = Looper.myLooper();
            e2.d.h(myLooper);
            Handler handler = new Handler(myLooper);
            this.f45437c = handler;
            spatializer.addOnSpatializerStateChangedListener(new c0(handler, 0), jVar);
            return;
        }
        this.f45435a = null;
        this.f45436b = false;
        this.f45437c = null;
        this.d = null;
    }

    public final boolean a(b2.e eVar, b2.s sVar) {
        String str = sVar.f3309r;
        String str2 = sVar.f3309r;
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
        Spatializer spatializer = this.f45435a;
        spatializer.getClass();
        return spatializer.canBeSpatialized((AudioAttributes) eVar.b().f3344a, channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.f45435a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.f45435a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        j jVar;
        Handler handler;
        Spatializer spatializer = this.f45435a;
        if (spatializer != null && (jVar = this.d) != null && (handler = this.f45437c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(jVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
