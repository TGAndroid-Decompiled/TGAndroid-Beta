package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;
public final class b {
    public int f48234a;
    public int f48235b;
    public boolean f48236c;
    public final Object d;

    public b(Context context) {
        this.f48234a = 0;
        this.f48236c = true;
        this.f48235b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f48235b;
        obj.f48875a = i10;
        int i11 = this.f48234a;
        obj.f48876b = i11;
        boolean z11 = false;
        obj.f48877c = 0;
        obj.d = false;
        obj.f48878e = this.f48236c;
        obj.f48879f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f48876b == 2 && obj.f48877c == 1) {
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
        this.f48234a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f48235b = i10;
    }

    public b(ef.a... aVarArr) {
        this.f48234a = -1;
        this.f48235b = -1;
        this.f48236c = false;
        this.d = aVarArr;
    }
}
