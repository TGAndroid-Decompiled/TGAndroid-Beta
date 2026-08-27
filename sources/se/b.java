package se;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import s3.c;

public final class b extends a {

    public final MediaMetadataRetriever f47872r;

    public final boolean f47873s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f47872r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f47857a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f47858b = j10;
            this.f47859c = c(7);
            this.d = c(2);
            this.f47860e = c(13);
            this.f47861f = c(1);
            this.f47862g = b(8);
            this.h = c(6);
            this.f47864j = b(0);
            b(10);
            this.f47865k = b(14);
            this.f47867m = c(4);
            byte[] embeddedPicture = this.f47872r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f47869o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f47869o;
            if (bitmap != null) {
                float fMax = Math.max(bitmap.getWidth(), this.f47869o.getHeight()) / 120.0f;
                if (fMax > 0.0f) {
                    Bitmap bitmap2 = this.f47869o;
                    this.f47870p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / fMax), (int) (this.f47869o.getHeight() / fMax), true);
                } else {
                    this.f47870p = this.f47869o;
                }
            }
        } catch (Exception e9) {
            this.f47873s = true;
            FileLog.e(e9);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f47872r;
            if (mediaMetadataRetriever2 != null) {
                c.j(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f47872r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f47872r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
