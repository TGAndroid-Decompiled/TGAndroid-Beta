package q2;

import android.content.Context;
import android.os.Build;
import b2.r0;
import b2.s;
import com.google.firebase.messaging.n;
import e2.d0;
import n7.z0;
import r2.k;
import r2.l;
import t7.u;
public final class b implements k {
    public final Context f44123a;

    public static int a(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.a(b2.s):int");
    }

    @Override
    public l p(n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && (i10 >= 31 || ((context = this.f44123a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int h = r0.h(((s) nVar.f6376c).f2370r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
            return new z0(14, new r2.b(h, 0), new r2.b(h, 1)).p(nVar);
        }
        return new u(20).p(nVar);
    }
}
