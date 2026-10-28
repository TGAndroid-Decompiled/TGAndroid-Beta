package rf;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import d6.k;
import f6.h;
import o6.l;
public final class a extends f6.g {
    public final h f47364a;
    public final e6.g f47365b;
    public final e6.c f47366c;
    public g d;
    public int e;
    public int f47367f;
    public int f47368g;
    public int h;

    public a(e6.c cVar, e6.g gVar, h hVar) {
        this.f47366c = cVar;
        this.f47365b = gVar;
        this.f47364a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f47366c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i10;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f47366c.a());
        sb2.append(" ");
        Integer num = mediaError.f6432c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f6431b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        this.e = i10;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f47366c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f47366c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f47366c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f47366c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f47366c.a());
        int b10 = this.f47364a.b();
        if (b10 != this.f47367f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f47367f = b10;
            if (b10 == 2) {
                this.f47365b.b(true);
            } else if (b10 == 4) {
                int i10 = this.e;
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
        this.e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i10 = d.i();
        if (this.f47368g < this.d.f47391a.size()) {
            fVar = this.d.a(this.f47368g);
        } else {
            fVar = d.f47375l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i10, fVar.d) + ("?index=" + this.f47368g + "&attempt=" + this.h), 1, fVar.f47387a, fVar.f47388b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.e("Must be called from the main thread.");
            h hVar = this.f47364a;
            if (!hVar.w()) {
                h.t();
                return;
            } else {
                h.x(new f6.k(hVar, kVar, 1));
                return;
            }
        }
        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
    }

    public final void q(boolean z10) {
        if (z10) {
            this.f47368g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f47368g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.e + " " + this.f47368g + " " + this.h);
        p();
    }
}
