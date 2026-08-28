package we;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import m5.k;
import o5.h;
import o5.j;
import x5.l;
public final class a extends o5.g {
    public final h f48786a;
    public final n5.g f48787b;
    public final n5.c f48788c;
    public g d;
    public int f48789e;
    public int f48790f;
    public int f48791g;
    public int h;

    public a(n5.c cVar, n5.g gVar, h hVar) {
        this.f48788c = cVar;
        this.f48787b = gVar;
        this.f48786a = hVar;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f48788c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        int i9;
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f48788c.a());
        sb2.append(" ");
        Integer num = mediaError.f2703c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f2702b);
        Log.d("CAST_CLIENT", sb2.toString());
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = -1;
        }
        this.f48789e = i9;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f48788c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f48788c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f48788c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f48788c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f48788c.a());
        int b10 = this.f48786a.b();
        if (b10 != this.f48790f) {
            Log.d("CAST_CLIENT", "idleReason " + b10);
            this.f48790f = b10;
            if (b10 == 2) {
                this.f48787b.b(true);
            } else if (b10 == 4) {
                int i9 = this.f48789e;
                if (i9 == 104) {
                    q(true);
                } else if (i9 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        f fVar;
        this.f48789e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String i9 = e.i();
        if (this.f48791g < this.d.f48813a.size()) {
            fVar = this.d.a(this.f48791g);
        } else {
            fVar = e.f48800l;
        }
        MediaInfo mediaInfo = new MediaInfo(e.j(i9, fVar.d) + ("?index=" + this.f48791g + "&attempt=" + this.h), 1, fVar.f48808a, fVar.f48809b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) <= 0 && Double.compare(1.0d, 0.5d) >= 0) {
            k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
            l.e("Must be called from the main thread.");
            h hVar = this.f48786a;
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
            this.f48791g++;
        } else {
            int i9 = this.h + 1;
            this.h = i9;
            if (i9 > 3) {
                this.h = 0;
                this.f48791g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f48789e + " " + this.f48791g + " " + this.h);
        p();
    }
}
