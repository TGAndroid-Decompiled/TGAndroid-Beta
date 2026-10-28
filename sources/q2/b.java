package q2;

import a8.yb;
import ag.t0;
import android.content.Context;
import android.graphics.Point;
import b2.x;
import b2.x0;
import e2.n0;
import h2.h;
import h2.j;
import h2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
public final class b extends l {
    public final Context f46953o;
    public final int f46954p;

    public b(Context context) {
        super(new h[1], new a[1]);
        this.f46953o = context;
        this.f46954p = -1;
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
        ByteBuffer byteBuffer = hVar.f12569c;
        byteBuffer.getClass();
        yb.p(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z11);
        try {
            int i10 = this.f46954p;
            if (i10 == -1) {
                Context context = this.f46953o;
                if (context != null) {
                    Point y3 = n0.y(context);
                    int i11 = y3.x;
                    int i12 = y3.y;
                    x xVar = hVar.f12567a;
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
            aVar.f46951a = t0.b(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.timeUs = hVar.e;
            return null;
        } catch (x0 e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e10) {
            return new Exception(e10);
        }
    }
}
