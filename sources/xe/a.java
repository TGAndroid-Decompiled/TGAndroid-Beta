package xe;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import m5.k;
import o5.h;
import o5.j;
import y5.l;

public final class a extends o5.g {

    public final h f49385a;

    public final n5.h f49386b;

    public final n5.c f49387c;
    public g d;

    public int f49388e;

    public int f49389f;

    public int f49390g;
    public int h;

    public a(n5.c cVar, n5.h hVar, h hVar2) {
        this.f49387c = cVar;
        this.f49386b = hVar;
        this.f49385a = hVar2;
    }

    @Override
    public final void a() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.f49387c.a());
    }

    @Override
    public final void b(MediaError mediaError) {
        StringBuilder sb2 = new StringBuilder("onMediaError ");
        sb2.append(this.f49387c.a());
        sb2.append(" ");
        Integer num = mediaError.f3140c;
        sb2.append(num);
        sb2.append(" ");
        sb2.append(mediaError.f3139b);
        Log.d("CAST_CLIENT", sb2.toString());
        this.f49388e = num != null ? num.intValue() : -1;
    }

    @Override
    public final void c() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.f49387c.a());
    }

    @Override
    public final void d() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.f49387c.a());
    }

    @Override
    public final void e() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.f49387c.a());
    }

    @Override
    public final void f() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.f49387c.a());
    }

    @Override
    public final void g() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.f49387c.a());
        int iB = this.f49385a.b();
        if (iB != this.f49389f) {
            Log.d("CAST_CLIENT", "idleReason " + iB);
            this.f49389f = iB;
            if (iB == 2) {
                this.f49386b.b(true);
                return;
            }
            if (iB == 4) {
                int i10 = this.f49388e;
                if (i10 == 104) {
                    q(true);
                } else if (i10 == 102) {
                    q(false);
                }
            }
        }
    }

    public final void p() {
        this.f49388e = -1;
        if (this.d == null) {
            this.d = null;
            return;
        }
        String strI = e.i();
        f fVarA = this.f49390g < this.d.f49412a.size() ? this.d.a(this.f49390g) : e.f49399l;
        MediaInfo mediaInfo = new MediaInfo(e.j(strI, fVarA.d) + ("?index=" + this.f49390g + "&attempt=" + this.h), 1, fVarA.f49407a, fVarA.f49408b, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) > 0 || Double.compare(1.0d, 0.5d) < 0) {
            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
        }
        k kVar = new k(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
        l.e("Must be called from the main thread.");
        h hVar = this.f49385a;
        if (hVar.w()) {
            h.x(new j(hVar, kVar, 1));
        } else {
            h.t();
        }
    }

    public final void q(boolean z10) {
        if (z10) {
            this.f49390g++;
        } else {
            int i10 = this.h + 1;
            this.h = i10;
            if (i10 > 3) {
                this.h = 0;
                this.f49390g++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.f49388e + " " + this.f49390g + " " + this.h);
        p();
    }
}
