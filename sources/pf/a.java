package pf;

import android.util.Log;
import c6.k;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import e6.h;
import n6.l;
public final class a extends e6.g {
    public final h f44066a;
    public final d6.g f44067b;
    public final d6.c f44068c;
    public g d;
    public int f44069e;
    public int f44070f;
    public int f44071g;
    public int h;

    public a(d6.c cVar, d6.g gVar, h hVar) {
        this.f44068c = cVar;
        this.f44067b = gVar;
        this.f44066a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f44068c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f44068c.a());
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
        this.f44069e = i10;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f44068c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f44068c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f44068c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f44068c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f44068c.a());
        int b10 = this.f44066a.b();
        if (b10 != this.f44070f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f44070f = b10;
            if (b10 == 2) {
                this.f44067b.b(true);
            } else if (b10 == 4) {
                int i10 = this.f44069e;
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
        this.f44069e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i10 = d.i();
        if (this.f44071g < this.d.f44097a.size()) {
            fVar = this.d.a(this.f44071g);
        } else {
            fVar = d.f44078l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i10, fVar.d) + ("?index=" + this.f44071g + "&attempt=" + this.h), 1, fVar.f44092a, fVar.f44093b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.e("Must be called from the main thread.");
            h hVar = this.f44066a;
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
            this.f44071g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f44071g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f44069e + " " + this.f44071g + " " + this.h);
        p();
    }
}
