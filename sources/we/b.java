package we;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import w.c;
public final class b extends a {
    public final MediaMetadataRetriever f49545r;
    public final boolean f49546s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f49545r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f49530a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f49531b = j10;
            this.f49532c = c(7);
            this.d = c(2);
            this.f49533e = c(13);
            this.f49534f = c(1);
            this.f49535g = b(8);
            this.h = c(6);
            this.f49537j = b(0);
            b(10);
            this.f49538k = b(14);
            this.f49540m = c(4);
            byte[] embeddedPicture = this.f49545r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f49542o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f49542o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f49542o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f49542o;
                    this.f49543p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f49542o.getHeight() / max), true);
                } else {
                    this.f49543p = this.f49542o;
                }
            }
        } catch (Exception e6) {
            this.f49546s = true;
            FileLog.e(e6);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f49545r;
            if (mediaMetadataRetriever2 != null) {
                c.j(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f49545r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f49545r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
