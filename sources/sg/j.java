package sg;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import w3.o;
public final class j implements rg.b, j3.f, g4.g, p8.e, v2.g, l {
    public final int f48068a;

    public j(int i10) {
        this.f48068a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        switch (this.f48068a) {
            case 0:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override
    public Object apply(Object obj) {
        return (o) obj;
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77 && i12 == 76 && i13 == 76) {
                if (i14 == 84 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public j3.g c(android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: sg.j.c(android.os.Bundle):j3.g");
    }

    @Override
    public m createDataSource() {
        return new com.google.android.exoplayer2.upstream.c(ApplicationLoader.applicationContext);
    }

    @Override
    public void d(Exception exc) {
    }
}
