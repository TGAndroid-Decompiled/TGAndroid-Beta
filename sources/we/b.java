package we;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import w.c;
public final class b extends a {
    public final MediaMetadataRetriever f49509r;
    public final boolean f49510s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f49509r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f49494a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f49495b = j10;
            this.f49496c = c(7);
            this.d = c(2);
            this.f49497e = c(13);
            this.f49498f = c(1);
            this.f49499g = b(8);
            this.h = c(6);
            this.f49501j = b(0);
            b(10);
            this.f49502k = b(14);
            this.f49504m = c(4);
            byte[] embeddedPicture = this.f49509r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f49506o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f49506o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f49506o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f49506o;
                    this.f49507p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f49506o.getHeight() / max), true);
                } else {
                    this.f49507p = this.f49506o;
                }
            }
        } catch (Exception e6) {
            this.f49510s = true;
            FileLog.e(e6);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f49509r;
            if (mediaMetadataRetriever2 != null) {
                c.j(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f49509r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f49509r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
