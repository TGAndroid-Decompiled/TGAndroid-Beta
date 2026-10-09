package q2;

import android.content.Context;
import android.graphics.Point;
import b2.s;
import b2.s0;
import e2.d0;
import h2.h;
import h2.j;
import h2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import v7.j7;
public final class b extends l {
    public final Context f45920o;
    public final int f45921p;

    public b(Context context) {
        super(new h[1], new a[1]);
        this.f45920o = context;
        this.f45921p = -1;
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
        ByteBuffer byteBuffer = hVar.f10985c;
        byteBuffer.getClass();
        e2.d.g(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        try {
            int i10 = this.f45921p;
            if (i10 == -1) {
                Context context = this.f45920o;
                if (context != null) {
                    Point v = d0.v(context);
                    int i11 = v.x;
                    int i12 = v.y;
                    s sVar = hVar.f10983a;
                    if (sVar != null) {
                        int i13 = sVar.Q;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = sVar.R;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    i10 = (Math.max(i11, i12) * 2) - 1;
                } else {
                    i10 = 4096;
                }
            }
            aVar.f45918a = j7.a(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.timeUs = hVar.f10986e;
            return null;
        } catch (s0 e7) {
            return new Exception("Could not decode image data with BitmapFactory.", e7);
        } catch (IOException e10) {
            return new Exception(e10);
        }
    }
}
