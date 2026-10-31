package vh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class x8 {
    public long f52175a;
    public volatile long f52176b;
    public int f52177c;
    public volatile int f52178f;
    public volatile int f52179g;
    public final boolean h;
    public boolean f52180i;
    public long f52181j;
    public Path f52184m;
    public final z8 f52185n;
    public final ArrayList d = new ArrayList();
    public boolean f52182k = false;
    public final Paint f52183l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public x8(z8 z8Var, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f52185n = z8Var;
        this.h = z10;
        Utilities.f14523i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: vh.v8.run():void");
            }
        });
    }

    public final void b() {
        this.f52180i = true;
        Utilities.f14523i.a(new d0(this, 22));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((w8) obj).f52118a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e) {
                this.e = null;
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void c() {
        if (!this.f52182k && this.e != null && this.d.size() < this.f52177c) {
            this.f52182k = true;
            this.f52181j += this.f52176b;
            Utilities.f14523i.a(new d0(this, 22));
            Utilities.f14523i.c(new d0(this, 22));
        }
    }
}
