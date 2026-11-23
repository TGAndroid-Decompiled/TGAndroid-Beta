package wf;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import f6.k;
import h6.g;
import h6.h;
import h6.j;
import oi.z3;
import q6.m;
public final class a extends g {
    public final h f59708a;
    public final g6.g f59709b;
    public final g6.c f59710c;
    public z3 d;
    public int f59711e;
    public int f59712f;
    public int f59713g;
    public int h;

    public a(g6.c cVar, g6.g gVar, h hVar) {
        this.f59710c = cVar;
        this.f59709b = gVar;
        this.f59708a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f59710c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i7;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f59710c.a());
        sb2.append(" ");
        Integer num = mediaError.f6188c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f6187b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = -1;
        }
        this.f59711e = i7;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f59710c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f59710c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f59710c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f59710c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f59710c.a());
        int b10 = this.f59708a.b();
        if (b10 != this.f59712f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f59712f = b10;
            if (b10 == 2) {
                this.f59709b.b(true);
            } else if (b10 == 4) {
                int i7 = this.f59711e;
                if (i7 == 104) {
                    q(true);
                } else if (i7 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        e eVar;
        this.f59711e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i7 = d.i();
        if (this.f59713g < this.d.f22592a.size()) {
            eVar = this.d.j(this.f59713g);
        } else {
            eVar = d.f59720l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i7, eVar.d) + ("?index=" + this.f59713g + "&attempt=" + this.h), 1, eVar.f59728a, eVar.f59729b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.e("Must be called from the main thread.");
            h hVar = this.f59708a;
            if (!hVar.w()) {
                h.t();
                return;
            } else {
                h.x(new j(hVar, kVar, 1));
                return;
            }
        }
        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
    }

    public final void q(boolean z10) {
        if (z10) {
            this.f59713g++;
        } else {
            int i7 = this.h + 1;
            this.h = i7;
            if (i7 > 3) {
                this.h = 0;
                this.f59713g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f59711e + " " + this.f59713g + " " + this.h);
        p();
    }
}
