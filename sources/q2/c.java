package q2;

import android.content.Context;
import android.graphics.Point;
import b2.w0;
import b2.x;
import e0.f0;
import e2.l0;
import h2.h;
import h2.j;
import h2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import v7.t6;
public final class c extends l {
    public final Context f45414o;
    public final int f45415p;

    public c(Context context) {
        super(new h[1], new a[1]);
        this.f45414o = context;
        this.f45415p = -1;
    }

    @Override
    public final h f() {
        return new h(1, 0);
    }

    @Override
    public final j g() {
        return new a(this);
    }

    @Override
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override
    public final h2.f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final h2.f i(h hVar, j jVar, boolean z10) {
        boolean z11;
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.f7586c;
        byteBuffer.getClass();
        t6.p(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.f(z11);
        try {
            int i10 = this.f45415p;
            if (i10 == -1) {
                Context context = this.f45414o;
                if (context != null) {
                    Point y3 = l0.y(context);
                    int i11 = y3.x;
                    int i12 = y3.y;
                    x xVar = hVar.f7584a;
                    if (xVar != null) {
                        int i13 = xVar.R;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = xVar.S;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    i10 = (Math.max(i11, i12) * 2) - 1;
                } else {
                    i10 = 4096;
                }
            }
            aVar.f45411a = f0.b(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.timeUs = hVar.e;
            return null;
        } catch (w0 e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e7) {
            return new Exception(e7);
        }
    }
}
