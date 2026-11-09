package u8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import bi.b1;
import com.google.android.gms.internal.vision.d3;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import org.telegram.ui.ky0;
public final class n extends b1 {
    public final t2 f56462b;

    public n(t2 t2Var) {
        super(7);
        this.f56462b = t2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        this.f56462b.l();
    }

    public final SparseArray e1(ky0 ky0Var) {
        m[] mVarArr;
        if (ky0Var != null) {
            f3 b10 = f3.b(ky0Var);
            Bitmap bitmap = (Bitmap) ky0Var.d;
            t2 t2Var = this.f56462b;
            if (bitmap != null) {
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        a7.b bVar = new a7.b(bitmap);
                        d3 d3Var = (d3) t2Var.m();
                        q6.m.g(d3Var);
                        Parcel h12 = d3Var.h1();
                        int i7 = com.google.android.gms.internal.vision.a.f7490a;
                        h12.writeStrongBinder(bVar);
                        com.google.android.gms.internal.vision.a.a(h12, b10);
                        Parcel q12 = d3Var.q1(h12, 2);
                        m[] mVarArr2 = (m[]) q12.createTypedArray(m.CREATOR);
                        q12.recycle();
                        mVarArr = mVarArr2;
                    } catch (RemoteException e10) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
                        mVarArr = new m[0];
                    }
                }
                if (mVarArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else {
                ByteBuffer y10 = ky0Var.y();
                q6.m.g(y10);
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        a7.b bVar2 = new a7.b(y10);
                        d3 d3Var2 = (d3) t2Var.m();
                        q6.m.g(d3Var2);
                        Parcel h13 = d3Var2.h1();
                        int i10 = com.google.android.gms.internal.vision.a.f7490a;
                        h13.writeStrongBinder(bVar2);
                        com.google.android.gms.internal.vision.a.a(h13, b10);
                        Parcel q13 = d3Var2.q1(h13, 1);
                        m[] mVarArr3 = (m[]) q13.createTypedArray(m.CREATOR);
                        q13.recycle();
                        mVarArr = mVarArr3;
                    } catch (RemoteException e11) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e11);
                        mVarArr = new m[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(mVarArr.length);
            for (m mVar : mVarArr) {
                sparseArray.append(mVar.f56452b.hashCode(), mVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
