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
    public final h f59665a;
    public final g6.g f59666b;
    public final g6.c f59667c;
    public y3 d;
    public int f59668e;
    public int f59669f;
    public int f59670g;
    public int h;

    public a(g6.c cVar, g6.g gVar, h hVar) {
        this.f59667c = cVar;
        this.f59666b = gVar;
        this.f59665a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f59667c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i7;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f59667c.a());
        sb2.append(" ");
        Integer num = mediaError.f6159c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f6158b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = -1;
        }
        this.f59668e = i7;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f59667c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f59667c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f59667c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f59667c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f59667c.a());
        int b10 = this.f59665a.b();
        if (b10 != this.f59669f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f59669f = b10;
            if (b10 == 2) {
                this.f59666b.b(true);
            } else if (b10 == 4) {
                int i7 = this.f59668e;
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
        this.f59668e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i7 = d.i();
        if (this.f59670g < this.d.f22506a.size()) {
            eVar = this.d.j(this.f59670g);
        } else {
            eVar = d.f59677l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i7, eVar.d) + ("?index=" + this.f59670g + "&attempt=" + this.h), 1, eVar.f59685a, eVar.f59686b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.e("Must be called from the main thread.");
            h hVar = this.f59665a;
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
            this.f59670g++;
        } else {
            int i7 = this.h + 1;
            this.h = i7;
            if (i7 > 3) {
                this.h = 0;
                this.f59670g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f59668e + " " + this.f59670g + " " + this.h);
        p();
    }
}
