package t2;

import a8.ja;
import android.content.Context;
import android.graphics.Point;
import bg.n0;
import e2.t0;
import e2.u;
import h2.l0;
import java.io.IOException;
import java.nio.ByteBuffer;
import k2.h;
import k2.j;
import k2.l;
public final class b extends l {
    public final Context f56967o;
    public final int f56968p;

    public b(Context context) {
        super(new h[1], new a[1]);
        this.f56967o = context;
        this.f56968p = -1;
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
    public final k2.f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final k2.f i(h hVar, j jVar, boolean z10) {
        boolean z11;
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.f17732c;
        byteBuffer.getClass();
        ja.p(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.f(z11);
        try {
            int i7 = this.f56968p;
            if (i7 == -1) {
                Context context = this.f56967o;
                if (context != null) {
                    Point y10 = l0.y(context);
                    int i10 = y10.x;
                    int i11 = y10.y;
                    u uVar = hVar.f17730a;
                    if (uVar != null) {
                        int i12 = uVar.R;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = uVar.S;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    i7 = (Math.max(i10, i11) * 2) - 1;
                } else {
                    i7 = 4096;
                }
            }
            aVar.f56965a = n0.b(byteBuffer.remaining(), i7, byteBuffer.array());
            aVar.timeUs = hVar.f17733e;
            return null;
        } catch (t0 e10) {
            return new Exception("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new Exception(e11);
        }
    }
}
