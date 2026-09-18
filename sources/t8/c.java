package t8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.u2;
public final class c {
    public int f43298a;
    public int f43299b;
    public boolean f43300c;
    public final Object d;

    public c(Context context) {
        this.f43298a = 0;
        this.f43300c = true;
        this.f43299b = 0;
        this.d = context;
    }

    public d a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f43299b;
        obj.f43898a = i10;
        int i11 = this.f43298a;
        obj.f43899b = i11;
        boolean z11 = false;
        obj.f43900c = 0;
        obj.d = false;
        obj.e = this.f43300c;
        obj.f43901f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f43899b == 2 && obj.f43900c == 1) {
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
        this.f43298a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f43299b = i10;
    }

    public c(df.a... aVarArr) {
        this.f43298a = -1;
        this.f43299b = -1;
        this.f43300c = false;
        this.d = aVarArr;
    }
}
