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
import m2.t;
public final class n extends b2.g {
    public final u2 f45058b;

    public n(u2 u2Var) {
        super(3);
        this.f45058b = u2Var;
    }

    @Override
    public final void U0() {
        super.U0();
        this.f45058b.l();
    }

    public final SparseArray Z0(t tVar) {
        m[] mVarArr;
        if (tVar != null) {
            g3 b10 = g3.b(tVar);
            Bitmap bitmap = (Bitmap) tVar.d;
            u2 u2Var = this.f45058b;
            if (bitmap != null) {
                if (!u2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        x6.b bVar = new x6.b(bitmap);
                        e3 e3Var = (e3) u2Var.m();
                        n6.l.h(e3Var);
                        Parcel G0 = e3Var.G0();
                        int i10 = com.google.android.gms.internal.vision.a.f5948a;
                        G0.writeStrongBinder(bVar);
                        com.google.android.gms.internal.vision.a.a(G0, b10);
                        Parcel P0 = e3Var.P0(G0, 2);
                        m[] mVarArr2 = (m[]) P0.createTypedArray(m.CREATOR);
                        P0.recycle();
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
                ByteBuffer A = tVar.A();
                n6.l.h(A);
                if (!u2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        x6.b bVar2 = new x6.b(A);
                        e3 e3Var2 = (e3) u2Var.m();
                        n6.l.h(e3Var2);
                        Parcel G02 = e3Var2.G0();
                        int i11 = com.google.android.gms.internal.vision.a.f5948a;
                        G02.writeStrongBinder(bVar2);
                        com.google.android.gms.internal.vision.a.a(G02, b10);
                        Parcel P02 = e3Var2.P0(G02, 1);
                        m[] mVarArr3 = (m[]) P02.createTypedArray(m.CREATOR);
                        P02.recycle();
                        mVarArr = mVarArr3;
                    } catch (RemoteException e10) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
                        mVarArr = new m[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(mVarArr.length);
            for (m mVar : mVarArr) {
                sparseArray.append(mVar.f45048b.hashCode(), mVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
