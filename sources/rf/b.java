package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.a8;
import p5.c;
public final class b extends a {
    public final MediaMetadataRetriever f56597r;
    public final boolean f56598s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f56597r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f56582a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f56583b = j3;
            this.f56584c = c(7);
            this.d = c(2);
            this.f56585e = c(13);
            this.f56586f = c(1);
            this.f56587g = b(8);
            this.h = c(6);
            this.f56589j = b(0);
            b(10);
            this.f56590k = b(14);
            this.f56592m = c(4);
            byte[] embeddedPicture = this.f56597r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f56594o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f56594o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f56594o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f56594o;
                    this.f56595p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f56594o.getHeight() / max), true);
                } else {
                    this.f56595p = this.f56594o;
                }
            }
        } catch (Exception e10) {
            this.f56598s = true;
            a8.g(e10, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f56597r;
            if (mediaMetadataRetriever2 != null) {
                c.q(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final short b(int i7) {
        try {
            return Short.parseShort(this.f56597r.extractMetadata(i7));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i7) {
        try {
            return this.f56597r.extractMetadata(i7);
        } catch (Exception unused) {
            return null;
        }
    }
}
