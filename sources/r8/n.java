package r8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.d3;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
public final class n extends b2.h {
    public final t2 f44028b;

    public n(t2 t2Var) {
        super(3);
        this.f44028b = t2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        this.f44028b.l();
    }

    public final SparseArray e1(li.k kVar) {
        m[] mVarArr;
        if (kVar != null) {
            f3 b10 = f3.b(kVar);
            Bitmap bitmap = (Bitmap) kVar.d;
            t2 t2Var = this.f44028b;
            if (bitmap != null) {
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        x6.b bVar = new x6.b(bitmap);
                        d3 d3Var = (d3) t2Var.m();
                        n6.l.h(d3Var);
                        Parcel F0 = d3Var.F0();
                        int i10 = com.google.android.gms.internal.vision.a.f5782a;
                        F0.writeStrongBinder(bVar);
                        com.google.android.gms.internal.vision.a.a(F0, b10);
                        Parcel O0 = d3Var.O0(F0, 2);
                        m[] mVarArr2 = (m[]) O0.createTypedArray(m.CREATOR);
                        O0.recycle();
                        mVarArr = mVarArr2;
                    } catch (RemoteException e) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                        mVarArr = new m[0];
                    }
                }
                if (mVarArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else {
                ByteBuffer I = kVar.I();
                n6.l.h(I);
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        x6.b bVar2 = new x6.b(I);
                        d3 d3Var2 = (d3) t2Var.m();
                        n6.l.h(d3Var2);
                        Parcel F02 = d3Var2.F0();
                        int i11 = com.google.android.gms.internal.vision.a.f5782a;
                        F02.writeStrongBinder(bVar2);
                        com.google.android.gms.internal.vision.a.a(F02, b10);
                        Parcel O02 = d3Var2.O0(F02, 1);
                        m[] mVarArr3 = (m[]) O02.createTypedArray(m.CREATOR);
                        O02.recycle();
                        mVarArr = mVarArr3;
                    } catch (RemoteException e7) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e7);
                        mVarArr = new m[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(mVarArr.length);
            for (m mVar : mVarArr) {
                sparseArray.append(mVar.f44019b.hashCode(), mVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
