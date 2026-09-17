package pf;

import android.util.Log;
import c6.k;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import e6.h;
import n6.l;
public final class a extends e6.g {
    public final h f44067a;
    public final d6.g f44068b;
    public final d6.c f44069c;
    public g d;
    public int f44070e;
    public int f44071f;
    public int f44072g;
    public int h;

    public a(d6.c cVar, d6.g gVar, h hVar) {
        this.f44069c = cVar;
        this.f44068b = gVar;
        this.f44067a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f44069c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f44069c.a());
        sb2.append(" ");
        Integer num = mediaError.f4935c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f4934b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        this.f44070e = i10;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f44069c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f44069c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f44069c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f44069c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f44069c.a());
        int b10 = this.f44067a.b();
        if (b10 != this.f44071f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f44071f = b10;
            if (b10 == 2) {
                this.f44068b.b(true);
            } else if (b10 == 4) {
                int i10 = this.f44070e;
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
        this.f44070e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i10 = d.i();
        if (this.f44072g < this.d.f44098a.size()) {
            fVar = this.d.a(this.f44072g);
        } else {
            fVar = d.f44079l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i10, fVar.d) + ("?index=" + this.f44072g + "&attempt=" + this.h), 1, fVar.f44093a, fVar.f44094b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.e("Must be called from the main thread.");
            h hVar = this.f44067a;
            if (!hVar.w()) {
                h.t();
                return;
            } else {
                h.x(new e6.k(hVar, kVar, 1));
                return;
            }
        }
        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
    }

    public final void q(boolean z10) {
        if (z10) {
            this.f44072g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f44072g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f44070e + " " + this.f44072g + " " + this.h);
        p();
    }
}
