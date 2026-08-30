package we;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import vh.v2;
public final class b extends a {
    public final MediaMetadataRetriever f46529r;
    public final boolean f46530s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f46529r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f46515a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f46516b = j10;
            this.f46517c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f46518f = c(1);
            this.f46519g = b(8);
            this.h = c(6);
            this.f46521j = b(0);
            b(10);
            this.f46522k = b(14);
            this.f46524m = c(4);
            byte[] embeddedPicture = this.f46529r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f46526o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f46526o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f46526o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f46526o;
                    this.f46527p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f46526o.getHeight() / max), true);
                } else {
                    this.f46527p = this.f46526o;
                }
            }
        } catch (Exception e) {
            this.f46530s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f46529r;
            if (mediaMetadataRetriever2 != null) {
                v2.j(mediaMetadataRetriever2);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f46529r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f46529r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
