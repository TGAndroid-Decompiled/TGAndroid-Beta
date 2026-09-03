package ve;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ai;
public final class b extends a {
    public final MediaMetadataRetriever f45750r;
    public final boolean f45751s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f45750r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f45736a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f45737b = j10;
            this.f45738c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f45739f = c(1);
            this.f45740g = b(8);
            this.h = c(6);
            this.f45742j = b(0);
            b(10);
            this.f45743k = b(14);
            this.f45745m = c(4);
            byte[] embeddedPicture = this.f45750r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f45747o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f45747o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f45747o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f45747o;
                    this.f45748p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f45747o.getHeight() / max), true);
                } else {
                    this.f45748p = this.f45747o;
                }
            }
        } catch (Exception e) {
            this.f45751s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f45750r;
            if (mediaMetadataRetriever2 != null) {
                ai.t(mediaMetadataRetriever2);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f45750r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f45750r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
