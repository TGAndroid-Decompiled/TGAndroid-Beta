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
    public final h f59793a;
    public final g6.g f59794b;
    public final g6.c f59795c;
    public f d;
    public int f59796e;
    public int f59797f;
    public int f59798g;
    public int h;

    public a(g6.c cVar, g6.g gVar, h hVar) {
        this.f59795c = cVar;
        this.f59794b = gVar;
        this.f59793a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f59795c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i7;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f59795c.a());
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
        this.f59796e = i7;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f59795c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f59795c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f59795c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f59795c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f59795c.a());
        int b10 = this.f59793a.b();
        if (b10 != this.f59797f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f59797f = b10;
            if (b10 == 2) {
                this.f59794b.b(true);
            } else if (b10 == 4) {
                int i7 = this.f59796e;
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
        this.f59796e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i7 = d.i();
        if (this.f59798g < this.d.f59818a.size()) {
            eVar = this.d.g(this.f59798g);
        } else {
            eVar = d.f59805l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i7, eVar.d) + ("?index=" + this.f59798g + "&attempt=" + this.h), 1, eVar.f59813a, eVar.f59814b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.e("Must be called from the main thread.");
            h hVar = this.f59793a;
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
            this.f59798g++;
        } else {
            int i7 = this.h + 1;
            this.h = i7;
            if (i7 > 3) {
                this.h = 0;
                this.f59798g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f59796e + " " + this.f59798g + " " + this.h);
        p();
    }
}
