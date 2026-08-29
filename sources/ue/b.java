package ue;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import u3.c;
public final class b extends a {
    public final MediaMetadataRetriever f49188r;
    public final boolean f49189s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f49188r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f49173a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f49174b = j10;
            this.f49175c = c(7);
            this.d = c(2);
            this.f49176e = c(13);
            this.f49177f = c(1);
            this.f49178g = b(8);
            this.h = c(6);
            this.f49180j = b(0);
            b(10);
            this.f49181k = b(14);
            this.f49183m = c(4);
            byte[] embeddedPicture = this.f49188r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f49185o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f49185o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f49185o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f49185o;
                    this.f49186p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f49185o.getHeight() / max), true);
                } else {
                    this.f49186p = this.f49185o;
                }
            }
        } catch (Exception e10) {
            this.f49189s = true;
            FileLog.e(e10);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f49188r;
            if (mediaMetadataRetriever2 != null) {
                c.j(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f49188r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f49188r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
