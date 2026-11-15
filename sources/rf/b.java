package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.a8;
public final class b extends a {
    public final MediaMetadataRetriever f56013r;
    public final boolean f56014s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f56013r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f55998a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f55999b = j3;
            this.f56000c = c(7);
            this.d = c(2);
            this.f56001e = c(13);
            this.f56002f = c(1);
            this.f56003g = b(8);
            this.h = c(6);
            this.f56005j = b(0);
            b(10);
            this.f56006k = b(14);
            this.f56008m = c(4);
            byte[] embeddedPicture = this.f56013r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f56010o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f56010o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f56010o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f56010o;
                    this.f56011p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f56010o.getHeight() / max), true);
                } else {
                    this.f56011p = this.f56010o;
                }
            }
        } catch (Exception e10) {
            this.f56014s = true;
            a8.g(e10, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f56013r;
            if (mediaMetadataRetriever2 != null) {
                r.b.r(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final short b(int i7) {
        try {
            return Short.parseShort(this.f56013r.extractMetadata(i7));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i7) {
        try {
            return this.f56013r.extractMetadata(i7);
        } catch (Exception unused) {
            return null;
        }
    }
}
