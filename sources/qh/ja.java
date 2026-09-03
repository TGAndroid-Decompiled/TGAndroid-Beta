package qh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ja {
    public long f45553a;
    public volatile long f45554b;
    public int f45555c;
    public volatile int f45557f;
    public volatile int f45558g;
    public final boolean h;
    public boolean f45559i;
    public long f45560j;
    public Path f45563m;
    public final la f45564n;
    public final ArrayList d = new ArrayList();
    public boolean f45561k = false;
    public final Paint f45562l = new Paint(3);
    public MediaMetadataRetriever f45556e = new MediaMetadataRetriever();

    public ja(la laVar, boolean z4, final String str, final int i10, final int i11, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f45564n = laVar;
        this.h = z4;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qh.ha.run():void");
            }
        });
    }

    public final void b() {
        this.f45559i = true;
        Utilities.themeQueue.cancelRunnable(new u9(this, 3));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((ia) obj).f45500a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f45556e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e6) {
                this.f45556e = null;
                FileLog.e(e6);
            }
        }
    }

    public final void c() {
        if (!this.f45561k && this.f45556e != null && this.d.size() < this.f45555c) {
            this.f45561k = true;
            this.f45560j += this.f45554b;
            Utilities.themeQueue.cancelRunnable(new u9(this, 3));
            Utilities.themeQueue.postRunnable(new u9(this, 3));
        }
    }
}
