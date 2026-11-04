package tf;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import e6.k;
import g6.g;
import g6.h;
import g6.j;
import mi.z3;
import p6.m;
public final class a extends g {
    public final h f55087a;
    public final f6.g f55088b;
    public final f6.c f55089c;
    public z3 d;
    public int f55090e;
    public int f55091f;
    public int f55092g;
    public int h;

    public a(f6.c cVar, f6.g gVar, h hVar) {
        this.f55089c = cVar;
        this.f55088b = gVar;
        this.f55087a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f55089c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i3;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f55089c.a());
        sb2.append(" ");
        Integer num = mediaError.f6543c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f6542b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = -1;
        }
        this.f55090e = i3;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f55089c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f55089c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f55089c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f55089c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f55089c.a());
        int b10 = this.f55087a.b();
        if (b10 != this.f55091f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f55091f = b10;
            if (b10 == 2) {
                this.f55088b.b(true);
            } else if (b10 == 4) {
                int i3 = this.f55090e;
                if (i3 == 104) {
                    q(true);
                } else if (i3 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        f fVar;
        this.f55090e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i3 = d.i();
        if (this.f55092g < this.d.f20086a.size()) {
            fVar = this.d.c(this.f55092g);
        } else {
            fVar = d.f55099l;
        }
        MediaInfo mediaInfo = new MediaInfo(d.j(i3, fVar.d) + ("?index=" + this.f55092g + "&attempt=" + this.h), 1, fVar.f55113a, fVar.f55114b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            m.d("Must be called from the main thread.");
            h hVar = this.f55087a;
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
            this.f55092g++;
        } else {
            int i3 = this.h + 1;
            this.h = i3;
            if (i3 > 3) {
                this.h = 0;
                this.f55092g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f55090e + " " + this.f55092g + " " + this.h);
        p();
    }
}
