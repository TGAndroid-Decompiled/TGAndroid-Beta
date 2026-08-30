package ph;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ma {
    public long f41976a;
    public volatile long f41977b;
    public int f41978c;
    public volatile int f41979f;
    public volatile int f41980g;
    public final boolean h;
    public boolean f41981i;
    public long f41982j;
    public Path f41985m;
    public final oa f41986n;
    public final ArrayList d = new ArrayList();
    public boolean f41983k = false;
    public final Paint f41984l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ma(oa oaVar, boolean z4, final String str, final int i10, final int i11, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f41986n = oaVar;
        this.h = z4;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ph.ka.run():void");
            }
        });
    }

    public final void b() {
        this.f41981i = true;
        Utilities.themeQueue.cancelRunnable(new ga(this, 2));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((la) obj).f41920a;
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
        if (!this.f41983k && this.e != null && this.d.size() < this.f41978c) {
            this.f41983k = true;
            this.f41982j += this.f41977b;
            Utilities.themeQueue.cancelRunnable(new ga(this, 2));
            Utilities.themeQueue.postRunnable(new ga(this, 2));
        }
    }
}
