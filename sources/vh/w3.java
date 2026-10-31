package vh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.do0;
import org.telegram.ui.o10;
public final class w3 implements ig.b1, s61, hu0 {
    public final Object f52087a;

    public w3(Object obj) {
        this.f52087a = obj;
    }

    @Override
    public void F(boolean z10) {
        wh.g gVar = (wh.g) this.f52087a;
        fe.b bVar = gVar.Y;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        o10 o10Var = gVar.f40421s;
        if (o10Var != null) {
            o10Var.invalidate();
        }
    }

    public q5.d a(u9.b r41) {
        throw new UnsupportedOperationException("Method not decompiled: vh.w3.a(u9.b):q5.d");
    }

    @Override
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(((wh.g) this.f52087a).f52863b0), 0);
    }

    public synchronized void b() {
        ((SharedPreferences) this.f52087a).edit().clear().commit();
    }

    public void c(ea.d dVar, Thread thread, Throwable th2) {
        x9.n nVar = (x9.n) this.f52087a;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    x9.x.a(nVar.e.Z(new x9.k(nVar, System.currentTimeMillis(), th2, thread, dVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override
    public void g() {
        do0 do0Var = ((s7) this.f52087a).f50998y0;
        if (do0Var != null) {
            do0Var.invalidate();
        }
    }

    @Override
    public int g1() {
        return ((wh.g) this.f52087a).f52864c0;
    }

    @Override
    public void j() {
        s7 s7Var = (s7) this.f52087a;
        if (s7Var.L0) {
            s7Var.L0 = false;
            return;
        }
        s7Var.T0.b(1);
        s7Var.z((ig.h) ig.h.f8315a.get(0));
    }

    @Override
    public boolean k() {
        boolean z10;
        s7 s7Var = (s7) this.f52087a;
        if (s7Var.f50986s0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            s7Var.A0(null, true);
        }
        return z10;
    }

    @Override
    public void n() {
        s7 s7Var = (s7) this.f52087a;
        s7Var.m0.f8469a.B();
        s7Var.M0.setViewHidden(false);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        k4 k4Var = (k4) this.f52087a;
        i4 i4Var = k4Var.M;
        u61 u61Var = k4Var.f51433y;
        if (u61Var == null) {
            return;
        }
        if (u61Var.d0()) {
            org.telegram.messenger.i0.g3(i4Var);
        } else {
            org.telegram.messenger.i0.r(i4Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        jg.i2 i2Var = ((k4) this.f52087a).f51431x;
        if (i2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(i2Var.f10028y0 - f10) >= 1.0E-4f) {
                i2Var.f10028y0 = f10;
                i2Var.requestLayout();
            }
        }
    }

    @Override
    public void t() {
        s7 s7Var = (s7) this.f52087a;
        if (s7Var.f50986s0 != null) {
            s7Var.A0(null, true);
        }
        s7Var.M0.setViewHidden(true);
    }

    public w3() {
        this.f52087a = new k6.h(2);
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public w3(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f52087a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                b();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void d() {
    }

    @Override
    public void onError(u61 u61Var, Exception exc) {
    }
}
