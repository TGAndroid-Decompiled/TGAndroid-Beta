package re;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.j2;
public final class b extends a {
    public final MediaMetadataRetriever f47151r;
    public final boolean f47152s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f47151r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f47136a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f47137b = j10;
            this.f47138c = c(7);
            this.d = c(2);
            this.f47139e = c(13);
            this.f47140f = c(1);
            this.f47141g = b(8);
            this.h = c(6);
            this.f47143j = b(0);
            b(10);
            this.f47144k = b(14);
            this.f47146m = c(4);
            byte[] embeddedPicture = this.f47151r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f47148o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f47148o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f47148o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f47148o;
                    this.f47149p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f47148o.getHeight() / max), true);
                } else {
                    this.f47149p = this.f47148o;
                }
            }
        } catch (Exception e10) {
            this.f47152s = true;
            FileLog.e(e10);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f47151r;
            if (mediaMetadataRetriever2 != null) {
                j2.r(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public final short b(int i9) {
        try {
            return Short.parseShort(this.f47151r.extractMetadata(i9));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i9) {
        try {
            return this.f47151r.extractMetadata(i9);
        } catch (Exception unused) {
            return null;
        }
    }
}
