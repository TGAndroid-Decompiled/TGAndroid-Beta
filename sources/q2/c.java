package q2;

import android.content.Context;
import android.graphics.Point;
import b2.s;
import b2.s0;
import e2.d0;
import h2.h;
import h2.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import v7.l7;
public final class c extends j {
    public final Context f44124o;
    public final int f44125p;

    public c(Context context) {
        super(new h2.g[1], new a[1]);
        this.f44124o = context;
        this.f44125p = -1;
    }

    @Override
    public final h2.g f() {
        return new h2.g(1, 0);
    }

    @Override
    public final h g() {
        return new a(this);
    }

    @Override
    public final h2.e h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final h2.e i(h2.g gVar, h hVar, boolean z10) {
        boolean z11;
        a aVar = (a) hVar;
        ByteBuffer byteBuffer = gVar.f10847e;
        byteBuffer.getClass();
        e2.d.g(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        try {
            int i10 = this.f44125p;
            if (i10 == -1) {
                Context context = this.f44124o;
                if (context != null) {
                    Point w10 = d0.w(context);
                    int i11 = w10.x;
                    int i12 = w10.y;
                    s sVar = gVar.f10846c;
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
            aVar.f44122f = l7.a(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.f10852c = gVar.h;
            return null;
        } catch (s0 e7) {
            return new Exception("Could not decode image data with BitmapFactory.", e7);
        } catch (IOException e10) {
            return new Exception(e10);
        }
    }
}
