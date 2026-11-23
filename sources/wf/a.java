package wf;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import f6.k;
import h6.g;
import h6.h;
import h6.j;
import oi.y3;
import q6.m;
public final class a extends g {
    public final h f59673a;
    public final g6.g f59674b;
    public final g6.c f59675c;
    public y3 d;
    public int f59676e;
    public int f59677f;
    public int f59678g;
    public int h;

    public a(g6.c cVar, g6.g gVar, h hVar) {
        this.f59675c = cVar;
        this.f59674b = gVar;
        this.f59673a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f59675c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i7;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f59675c.a());
        sb2.append(" ");
        Integer num = mediaError.f6151c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f6150b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = -1;
        }
        this.f59676e = i7;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f59675c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f59675c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f59675c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f59675c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f59675c.a());
        int b10 = this.f59673a.b();
        if (b10 != this.f59677f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f59677f = b10;
            if (b10 == 2) {
                this.f59674b.b(true);
            } else if (b10 == 4) {
                int i7 = this.f59676e;
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
        this.f59676e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i7 = d.i();
        if (this.f59678g < this.d.f22529a.size()) {
            eVar = this.d.j(this.f59678g);
        } else {
            eVar = d.f59685l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i7, eVar.d) + ("?index=" + this.f59678g + "&attempt=" + this.h), 1, eVar.f59693a, eVar.f59694b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.e("Must be called from the main thread.");
            h hVar = this.f59673a;
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
            this.f59678g++;
        } else {
            int i7 = this.h + 1;
            this.h = i7;
            if (i7 > 3) {
                this.h = 0;
                this.f59678g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f59676e + " " + this.f59678g + " " + this.h);
        p();
    }
}
