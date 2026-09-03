package ph;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ma {
    public long f42015a;
    public volatile long f42016b;
    public int f42017c;
    public volatile int f42018f;
    public volatile int f42019g;
    public final boolean h;
    public boolean f42020i;
    public long f42021j;
    public Path f42024m;
    public final oa f42025n;
    public final ArrayList d = new ArrayList();
    public boolean f42022k = false;
    public final Paint f42023l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ma(oa oaVar, boolean z4, final String str, final int i10, final int i11, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f42025n = oaVar;
        this.h = z4;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ph.ka.run():void");
            }
        });
    }

    public final void b() {
        this.f42020i = true;
        Utilities.themeQueue.cancelRunnable(new ga(this, 2));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((la) obj).f41983a;
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
                FileLog.e(e);
            }
        }
    }

    public final void c() {
        if (!this.f42022k && this.e != null && this.d.size() < this.f42017c) {
            this.f42022k = true;
            this.f42021j += this.f42016b;
            Utilities.themeQueue.cancelRunnable(new ga(this, 2));
            Utilities.themeQueue.postRunnable(new ga(this, 2));
        }
    }
}
