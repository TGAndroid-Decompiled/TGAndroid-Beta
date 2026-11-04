package s2;

import android.content.Context;
import android.graphics.Point;
import b8.zb;
import d2.v;
import d2.v0;
import g2.n0;
import j2.h;
import j2.j;
import j2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
public final class b extends l {
    public final Context f54594o;
    public final int f54595p;

    public b(Context context) {
        super(new h[1], new a[1]);
        this.f54594o = context;
        this.f54595p = -1;
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
    public final j2.f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final j2.f i(h hVar, j jVar, boolean z10) {
        boolean z11;
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.f16157c;
        byteBuffer.getClass();
        zb.p(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.f(z11);
        try {
            int i3 = this.f54595p;
            if (i3 == -1) {
                Context context = this.f54594o;
                if (context != null) {
                    Point y9 = n0.y(context);
                    int i10 = y9.x;
                    int i11 = y9.y;
                    v vVar = hVar.f16155a;
                    if (vVar != null) {
                        int i12 = vVar.R;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = vVar.S;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    i3 = (Math.max(i10, i11) * 2) - 1;
                } else {
                    i3 = 4096;
                }
            }
            aVar.f54592a = cg.n0.b(byteBuffer.remaining(), i3, byteBuffer.array());
            aVar.timeUs = hVar.f16158e;
            return null;
        } catch (v0 e10) {
            return new Exception("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new Exception(e11);
        }
    }
}
