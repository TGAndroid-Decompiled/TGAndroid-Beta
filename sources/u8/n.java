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
import org.telegram.ui.hy0;
public final class n extends b1 {
    public final t2 f56360b;

    public n(t2 t2Var) {
        super(7);
        this.f56360b = t2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        this.f56360b.l();
    }

    public final SparseArray e1(hy0 hy0Var) {
        m[] mVarArr;
        if (hy0Var != null) {
            f3 b10 = f3.b(hy0Var);
            Bitmap bitmap = (Bitmap) hy0Var.d;
            t2 t2Var = this.f56360b;
            if (bitmap != null) {
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        a7.b bVar = new a7.b(bitmap);
                        d3 d3Var = (d3) t2Var.m();
                        q6.m.g(d3Var);
                        Parcel H0 = d3Var.H0();
                        int i7 = com.google.android.gms.internal.vision.a.f7492a;
                        H0.writeStrongBinder(bVar);
                        com.google.android.gms.internal.vision.a.a(H0, b10);
                        Parcel Q0 = d3Var.Q0(H0, 2);
                        m[] mVarArr2 = (m[]) Q0.createTypedArray(m.CREATOR);
                        Q0.recycle();
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
                ByteBuffer y10 = hy0Var.y();
                q6.m.g(y10);
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        a7.b bVar2 = new a7.b(y10);
                        d3 d3Var2 = (d3) t2Var.m();
                        q6.m.g(d3Var2);
                        Parcel H02 = d3Var2.H0();
                        int i10 = com.google.android.gms.internal.vision.a.f7492a;
                        H02.writeStrongBinder(bVar2);
                        com.google.android.gms.internal.vision.a.a(H02, b10);
                        Parcel Q02 = d3Var2.Q0(H02, 1);
                        m[] mVarArr3 = (m[]) Q02.createTypedArray(m.CREATOR);
                        Q02.recycle();
                        mVarArr = mVarArr3;
                    } catch (RemoteException e11) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e11);
                        mVarArr = new m[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(mVarArr.length);
            for (m mVar : mVarArr) {
                sparseArray.append(mVar.f56350b.hashCode(), mVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
