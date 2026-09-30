package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;
public final class b {
    public int f43330a;
    public int f43331b;
    public boolean f43332c;
    public final Object d;

    public b(Context context) {
        this.f43330a = 0;
        this.f43332c = true;
        this.f43331b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f43331b;
        obj.f43930a = i10;
        int i11 = this.f43330a;
        obj.f43931b = i11;
        boolean z11 = false;
        obj.f43932c = 0;
        obj.d = false;
        obj.e = this.f43332c;
        obj.f43933f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f43931b == 2 && obj.f43932c == 1) {
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
        this.f43330a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f43331b = i10;
    }

    public b(df.a... aVarArr) {
        this.f43330a = -1;
        this.f43331b = -1;
        this.f43332c = false;
        this.d = aVarArr;
    }
}
