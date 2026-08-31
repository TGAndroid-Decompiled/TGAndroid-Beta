package we;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import w.c;
public final class b extends a {
    public final MediaMetadataRetriever f49508r;
    public final boolean f49509s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f49508r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f49493a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f49494b = j10;
            this.f49495c = c(7);
            this.d = c(2);
            this.f49496e = c(13);
            this.f49497f = c(1);
            this.f49498g = b(8);
            this.h = c(6);
            this.f49500j = b(0);
            b(10);
            this.f49501k = b(14);
            this.f49503m = c(4);
            byte[] embeddedPicture = this.f49508r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f49505o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f49505o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f49505o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f49505o;
                    this.f49506p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f49505o.getHeight() / max), true);
                } else {
                    this.f49506p = this.f49505o;
                }
            }
        } catch (Exception e6) {
            this.f49509s = true;
            FileLog.e(e6);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f49508r;
            if (mediaMetadataRetriever2 != null) {
                c.j(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f49508r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f49508r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
