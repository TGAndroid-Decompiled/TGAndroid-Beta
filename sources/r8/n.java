package r8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.e3;
import com.google.android.gms.internal.vision.g3;
import com.google.android.gms.internal.vision.u2;
import java.nio.ByteBuffer;
public final class n extends b2.g {
    public final u2 f47187b;

    public n(u2 u2Var) {
        super(3);
        this.f47187b = u2Var;
    }

    @Override
    public final void U0() {
        super.U0();
        this.f47187b.l();
    }

    public final SparseArray b1(la.h hVar) {
        m[] mVarArr;
        if (hVar != null) {
            g3 b10 = g3.b(hVar);
            Bitmap bitmap = (Bitmap) hVar.d;
            u2 u2Var = this.f47187b;
            if (bitmap != null) {
                if (!u2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        x6.b bVar = new x6.b(bitmap);
                        e3 e3Var = (e3) u2Var.m();
                        n6.m.h(e3Var);
                        Parcel F0 = e3Var.F0();
                        int i10 = com.google.android.gms.internal.vision.a.f7498a;
                        F0.writeStrongBinder(bVar);
                        com.google.android.gms.internal.vision.a.a(F0, b10);
                        Parcel O0 = e3Var.O0(F0, 2);
                        m[] mVarArr2 = (m[]) O0.createTypedArray(m.CREATOR);
                        O0.recycle();
                        mVarArr = mVarArr2;
                    } catch (RemoteException e7) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e7);
                        mVarArr = new m[0];
                    }
                }
                if (mVarArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else {
                ByteBuffer J = hVar.J();
                n6.m.h(J);
                if (!u2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        x6.b bVar2 = new x6.b(J);
                        e3 e3Var2 = (e3) u2Var.m();
                        n6.m.h(e3Var2);
                        Parcel F02 = e3Var2.F0();
                        int i11 = com.google.android.gms.internal.vision.a.f7498a;
                        F02.writeStrongBinder(bVar2);
                        com.google.android.gms.internal.vision.a.a(F02, b10);
                        Parcel O02 = e3Var2.O0(F02, 1);
                        m[] mVarArr3 = (m[]) O02.createTypedArray(m.CREATOR);
                        O02.recycle();
                        mVarArr = mVarArr3;
                    } catch (RemoteException e10) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
                        mVarArr = new m[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(mVarArr.length);
            for (m mVar : mVarArr) {
                sparseArray.append(mVar.f47177b.hashCode(), mVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
