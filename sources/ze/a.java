package ze;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import o5.k;
import q5.h;
import q5.j;
import z5.l;
public final class a extends q5.g {
    public final h f50817a;
    public final p5.g f50818b;
    public final p5.c f50819c;
    public g d;
    public int f50820e;
    public int f50821f;
    public int f50822g;
    public int h;

    public a(p5.c cVar, p5.g gVar, h hVar) {
        this.f50819c = cVar;
        this.f50818b = gVar;
        this.f50817a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f50819c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f50819c.a());
        sb2.append(" ");
        Integer num = mediaError.f3717c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f3716b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        this.f50820e = i10;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f50819c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f50819c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f50819c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f50819c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f50819c.a());
        int b10 = this.f50817a.b();
        if (b10 != this.f50821f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f50821f = b10;
            if (b10 == 2) {
                this.f50818b.b(true);
            } else if (b10 == 4) {
                int i10 = this.f50820e;
                if (i10 == 104) {
                    q(true);
                } else if (i10 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        f fVar;
        this.f50820e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i10 = e.i();
        if (this.f50822g < this.d.f50844a.size()) {
            fVar = this.d.a(this.f50822g);
        } else {
            fVar = e.f50831l;
        }
        MediaInfo mediaInfo = new MediaInfo(e.j(i10, fVar.d) + ("?index=" + this.f50822g + "&attempt=" + this.h), 1, fVar.f50839a, fVar.f50840b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.e("Must be called from the main thread.");
            h hVar = this.f50817a;
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
            this.f50822g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f50822g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f50820e + " " + this.f50822g + " " + this.h);
        p();
    }
}
