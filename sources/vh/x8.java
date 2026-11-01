package vh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class x8 {
    public long f52193a;
    public volatile long f52194b;
    public int f52195c;
    public volatile int f52196f;
    public volatile int f52197g;
    public final boolean h;
    public boolean f52198i;
    public long f52199j;
    public Path f52202m;
    public final z8 f52203n;
    public final ArrayList d = new ArrayList();
    public boolean f52200k = false;
    public final Paint f52201l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public x8(z8 z8Var, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f52203n = z8Var;
        this.h = z10;
        Utilities.f14524i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: vh.v8.run():void");
            }
        });
    }

    public final void b() {
        this.f52198i = true;
        Utilities.f14524i.a(new d0(this, 22));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((w8) obj).f52136a;
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
        if (!this.f52200k && this.e != null && this.d.size() < this.f52195c) {
            this.f52200k = true;
            this.f52199j += this.f52194b;
            Utilities.f14524i.a(new d0(this, 22));
            Utilities.f14524i.c(new d0(this, 22));
        }
    }
}
