package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;
public final class c {
    public int f46926a;
    public int f46927b;
    public boolean f46928c;
    public final Object d;

    public c(Context context) {
        this.f46926a = 0;
        this.f46928c = true;
        this.f46927b = 0;
        this.d = context;
    }

    public d a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f46927b;
        obj.f47565a = i10;
        int i11 = this.f46926a;
        obj.f47566b = i11;
        boolean z11 = false;
        obj.f47567c = 0;
        obj.d = false;
        obj.f47568e = this.f46928c;
        obj.f47569f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f47566b == 2 && obj.f47567c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new d(new u2((Context) this.d, (u8.b) obj));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("Invalid landmark type: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f46926a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f46927b = i10;
    }

    public c(df.a... aVarArr) {
        this.f46926a = -1;
        this.f46927b = -1;
        this.f46928c = false;
        this.d = aVarArr;
    }
}
