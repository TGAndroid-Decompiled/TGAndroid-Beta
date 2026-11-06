package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.a8;
public final class c extends a {
    public final MediaMetadataRetriever f54437r;
    public final boolean f54438s;

    public c(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f54437r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f54422a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f54423b = j3;
            this.f54424c = c(7);
            this.d = c(2);
            this.f54425e = c(13);
            this.f54426f = c(1);
            this.f54427g = b(8);
            this.h = c(6);
            this.f54429j = b(0);
            b(10);
            this.f54430k = b(14);
            this.f54432m = c(4);
            byte[] embeddedPicture = this.f54437r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f54434o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f54434o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f54434o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f54434o;
                    this.f54435p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f54434o.getHeight() / max), true);
                } else {
                    this.f54435p = this.f54434o;
                }
            }
        } catch (Exception e10) {
            this.f54438s = true;
            a8.g(e10, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f54437r;
            if (mediaMetadataRetriever2 != null) {
                b.o(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final short b(int i7) {
        try {
            return Short.parseShort(this.f54437r.extractMetadata(i7));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i7) {
        try {
            return this.f54437r.extractMetadata(i7);
        } catch (Exception unused) {
            return null;
        }
    }
}
