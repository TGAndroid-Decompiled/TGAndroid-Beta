package wf;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import f6.k;
import h6.g;
import h6.h;
import h6.j;
import q6.m;
public final class a extends g {
    public final h f57555a;
    public final g6.g f57556b;
    public final g6.c f57557c;
    public g7.c d;
    public int f57558e;
    public int f57559f;
    public int f57560g;
    public int h;

    public a(g6.c cVar, g6.g gVar, h hVar) {
        this.f57557c = cVar;
        this.f57556b = gVar;
        this.f57555a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f57557c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i7;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f57557c.a());
        sb2.append(" ");
        Integer num = mediaError.f6491c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f6490b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = -1;
        }
        this.f57558e = i7;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f57557c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f57557c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f57557c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f57557c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f57557c.a());
        int b10 = this.f57555a.b();
        if (b10 != this.f57559f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f57559f = b10;
            if (b10 == 2) {
                this.f57556b.b(true);
            } else if (b10 == 4) {
                int i7 = this.f57558e;
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
        this.f57558e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i7 = d.i();
        if (this.f57560g < this.d.f13573a.size()) {
            eVar = this.d.a(this.f57560g);
        } else {
            eVar = d.f57567l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i7, eVar.d) + ("?index=" + this.f57560g + "&attempt=" + this.h), 1, eVar.f57575a, eVar.f57576b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.d("Must be called from the main thread.");
            h hVar = this.f57555a;
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

    public final void q(boolean z9) {
        if (z9) {
            this.f57560g++;
        } else {
            int i7 = this.h + 1;
            this.h = i7;
            if (i7 > 3) {
                this.h = 0;
                this.f57560g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f57558e + " " + this.f57560g + " " + this.h);
        p();
    }
}
