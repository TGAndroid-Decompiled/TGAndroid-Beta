package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.a8;
public final class c extends a {
    public final MediaMetadataRetriever f54530r;
    public final boolean f54531s;

    public c(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f54530r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f54515a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f54516b = j3;
            this.f54517c = c(7);
            this.d = c(2);
            this.f54518e = c(13);
            this.f54519f = c(1);
            this.f54520g = b(8);
            this.h = c(6);
            this.f54522j = b(0);
            b(10);
            this.f54523k = b(14);
            this.f54525m = c(4);
            byte[] embeddedPicture = this.f54530r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f54527o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f54527o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f54527o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f54527o;
                    this.f54528p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f54527o.getHeight() / max), true);
                } else {
                    this.f54528p = this.f54527o;
                }
            }
        } catch (Exception e10) {
            this.f54531s = true;
            a8.g(e10, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f54530r;
            if (mediaMetadataRetriever2 != null) {
                b.o(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final short b(int i7) {
        try {
            return Short.parseShort(this.f54530r.extractMetadata(i7));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i7) {
        try {
            return this.f54530r.extractMetadata(i7);
        } catch (Exception unused) {
            return null;
        }
    }
}
