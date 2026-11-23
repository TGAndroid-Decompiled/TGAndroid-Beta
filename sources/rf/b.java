package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.a8;
import p5.c;
public final class b extends a {
    public final MediaMetadataRetriever f56632r;
    public final boolean f56633s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f56632r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f56617a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f56618b = j3;
            this.f56619c = c(7);
            this.d = c(2);
            this.f56620e = c(13);
            this.f56621f = c(1);
            this.f56622g = b(8);
            this.h = c(6);
            this.f56624j = b(0);
            b(10);
            this.f56625k = b(14);
            this.f56627m = c(4);
            byte[] embeddedPicture = this.f56632r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f56629o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f56629o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f56629o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f56629o;
                    this.f56630p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f56629o.getHeight() / max), true);
                } else {
                    this.f56630p = this.f56629o;
                }
            }
        } catch (Exception e10) {
            this.f56633s = true;
            a8.g(e10, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f56632r;
            if (mediaMetadataRetriever2 != null) {
                c.q(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final short b(int i7) {
        try {
            return Short.parseShort(this.f56632r.extractMetadata(i7));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i7) {
        try {
            return this.f56632r.extractMetadata(i7);
        } catch (Exception unused) {
            return null;
        }
    }
}
