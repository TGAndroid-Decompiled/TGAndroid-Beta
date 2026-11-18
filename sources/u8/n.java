package u8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.vision.e3;
import com.google.android.gms.internal.vision.g3;
import com.google.android.gms.internal.vision.u2;
import java.nio.ByteBuffer;
import org.telegram.ui.nd0;
public final class n extends q {
    public final u2 f58526b;

    public n(u2 u2Var) {
        super(7);
        this.f58526b = u2Var;
    }

    @Override
    public final void X0() {
        super.X0();
        this.f58526b.l();
    }

    public final SparseArray e1(nd0 nd0Var) {
        m[] mVarArr;
        if (nd0Var != null) {
            g3 b10 = g3.b(nd0Var);
            Bitmap bitmap = (Bitmap) nd0Var.d;
            u2 u2Var = this.f58526b;
            if (bitmap != null) {
                if (!u2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        a7.b bVar = new a7.b(bitmap);
                        e3 e3Var = (e3) u2Var.m();
                        q6.m.h(e3Var);
                        Parcel h12 = e3Var.h1();
                        int i7 = com.google.android.gms.internal.vision.a.f7162a;
                        h12.writeStrongBinder(bVar);
                        com.google.android.gms.internal.vision.a.a(h12, b10);
                        Parcel q12 = e3Var.q1(h12, 2);
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
                ByteBuffer w10 = nd0Var.w();
                q6.m.h(w10);
                if (!u2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        a7.b bVar2 = new a7.b(w10);
                        e3 e3Var2 = (e3) u2Var.m();
                        q6.m.h(e3Var2);
                        Parcel h13 = e3Var2.h1();
                        int i10 = com.google.android.gms.internal.vision.a.f7162a;
                        h13.writeStrongBinder(bVar2);
                        com.google.android.gms.internal.vision.a.a(h13, b10);
                        Parcel q13 = e3Var2.q1(h13, 1);
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
                sparseArray.append(mVar.f58516b.hashCode(), mVar);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
