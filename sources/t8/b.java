package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;
public final class b {
    public int f46468a;
    public int f46469b;
    public boolean f46470c;
    public final Object d;

    public b(Context context) {
        this.f46468a = 0;
        this.f46470c = true;
        this.f46469b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f46469b;
        obj.f46974a = i10;
        int i11 = this.f46468a;
        obj.f46975b = i11;
        boolean z11 = false;
        obj.f46976c = 0;
        obj.d = false;
        obj.f46977e = this.f46470c;
        obj.f46978f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f46975b == 2 && obj.f46976c == 1) {
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
        this.f46468a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f46469b = i10;
    }

    public b(df.a... aVarArr) {
        this.f46468a = -1;
        this.f46469b = -1;
        this.f46470c = false;
        this.d = aVarArr;
    }
}
