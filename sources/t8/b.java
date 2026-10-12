package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;
public final class b {
    public int f48465a;
    public int f48466b;
    public boolean f48467c;
    public final Object d;

    public b(Context context) {
        this.f48465a = 0;
        this.f48467c = true;
        this.f48466b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f48466b;
        obj.f49103a = i10;
        int i11 = this.f48465a;
        obj.f49104b = i11;
        boolean z11 = false;
        obj.f49105c = 0;
        obj.d = false;
        obj.f49106e = this.f48467c;
        obj.f49107f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f49104b == 2 && obj.f49105c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new c(new u2((Context) this.d, (u8.b) obj));
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
        this.f48465a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f48466b = i10;
    }

    public b(ef.a... aVarArr) {
        this.f48465a = -1;
        this.f48466b = -1;
        this.f48467c = false;
        this.d = aVarArr;
    }
}
