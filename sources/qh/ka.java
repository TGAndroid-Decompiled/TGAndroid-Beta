package qh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ka {
    public long f45606a;
    public volatile long f45607b;
    public int f45608c;
    public volatile int f45610f;
    public volatile int f45611g;
    public final boolean h;
    public boolean f45612i;
    public long f45613j;
    public Path f45616m;
    public final ma f45617n;
    public final ArrayList d = new ArrayList();
    public boolean f45614k = false;
    public final Paint f45615l = new Paint(3);
    public MediaMetadataRetriever f45609e = new MediaMetadataRetriever();

    public ka(ma maVar, boolean z4, final String str, final int i10, final int i11, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f45617n = maVar;
        this.h = z4;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qh.ia.run():void");
            }
        });
    }

    public final void b() {
        this.f45612i = true;
        Utilities.themeQueue.cancelRunnable(new v9(this, 3));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((ja) obj).f45506a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f45609e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e6) {
                this.f45609e = null;
                FileLog.e(e6);
            }
        }
    }

    public final void c() {
        if (!this.f45614k && this.f45609e != null && this.d.size() < this.f45608c) {
            this.f45614k = true;
            this.f45613j += this.f45607b;
            Utilities.themeQueue.cancelRunnable(new v9(this, 3));
            Utilities.themeQueue.postRunnable(new v9(this, 3));
        }
    }
}
