package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.a8;
public final class c extends a {
    public final MediaMetadataRetriever f54438r;
    public final boolean f54439s;

    public c(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f54438r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f54423a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f54424b = j3;
            this.f54425c = c(7);
            this.d = c(2);
            this.f54426e = c(13);
            this.f54427f = c(1);
            this.f54428g = b(8);
            this.h = c(6);
            this.f54430j = b(0);
            b(10);
            this.f54431k = b(14);
            this.f54433m = c(4);
            byte[] embeddedPicture = this.f54438r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f54435o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f54435o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f54435o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f54435o;
                    this.f54436p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f54435o.getHeight() / max), true);
                } else {
                    this.f54436p = this.f54435o;
                }
            }
        } catch (Exception e10) {
            this.f54439s = true;
            a8.g(e10, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f54438r;
            if (mediaMetadataRetriever2 != null) {
                b.o(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final short b(int i7) {
        try {
            return Short.parseShort(this.f54438r.extractMetadata(i7));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i7) {
        try {
            return this.f54438r.extractMetadata(i7);
        } catch (Exception unused) {
            return null;
        }
    }
}
