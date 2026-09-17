package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;
public final class b {
    public int f46497a;
    public int f46498b;
    public boolean f46499c;
    public final Object d;

    public b(Context context) {
        this.f46497a = 0;
        this.f46499c = true;
        this.f46498b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f46498b;
        obj.f47003a = i10;
        int i11 = this.f46497a;
        obj.f47004b = i11;
        boolean z11 = false;
        obj.f47005c = 0;
        obj.d = false;
        obj.f47006e = this.f46499c;
        obj.f47007f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f47004b == 2 && obj.f47005c == 1) {
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
        this.f46497a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f46498b = i10;
    }

    public b(df.a... aVarArr) {
        this.f46497a = -1;
        this.f46498b = -1;
        this.f46499c = false;
        this.d = aVarArr;
    }
}
