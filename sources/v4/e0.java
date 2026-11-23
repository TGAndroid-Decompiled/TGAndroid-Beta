package v4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import org.telegram.ui.Components.z51;
public final class e0 implements j1, z51, com.google.android.gms.common.api.internal.q, z2.d {
    public Object f59109a;

    public e0(Object obj) {
        this.f59109a = obj;
    }

    @Override
    public int R() {
        o0 o0Var = (o0) this.f59109a;
        return o0Var.f59207n - o0Var.C();
    }

    @Override
    public int a(View view) {
        return o0.z(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).topMargin;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        y8.j jVar = (y8.j) this.f59109a;
        h8.b bVar = (h8.b) obj;
        Bundle B = bVar.B();
        B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        h8.a aVar = new h8.a(0, (TaskCompletionSource) obj2);
        try {
            h8.i iVar = (h8.i) bVar.n();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i7 = h8.c.f13945a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            B.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f13953a.transact(19, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
            Bundle bundle = Bundle.EMPTY;
            aVar.d0(Status.h, null);
        }
    }

    public void b(a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f59109a;
        int i7 = aVar.f59049a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        return;
                    }
                    recyclerView.f2792y.X(recyclerView, aVar.f59050b, aVar.d);
                    return;
                }
                recyclerView.f2792y.a0(recyclerView, aVar.f59050b, aVar.d, aVar.f59051c);
                return;
            }
            recyclerView.f2792y.Y(recyclerView, aVar.f59050b, aVar.d);
            return;
        }
        recyclerView.f2792y.V(recyclerView, aVar.f59050b, aVar.d);
    }

    public void c(int i7, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f59109a;
        int z10 = recyclerView.f2766e.z();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < z10; i14++) {
            View y10 = recyclerView.f2766e.y(i14);
            e1 U = RecyclerView.U(y10);
            if (U != null && !U.r() && (i12 = U.f59113c) >= i7 && i12 < i13) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f59120l) == 0) {
                    if (U.f59121m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f59121m = arrayList;
                        U.f59122n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f59121m.add(obj);
                }
                ((p0) y10.getLayoutParams()).f59214c = true;
            }
        }
        w0 w0Var = recyclerView.f2761b;
        ArrayList arrayList2 = (ArrayList) w0Var.f59246e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            e1 e1Var = (e1) arrayList2.get(size);
            if (e1Var != null && (i11 = e1Var.f59113c) >= i7 && i11 < i13) {
                e1Var.a(2);
                w0Var.f(size);
            }
        }
        recyclerView.f2794z0 = true;
    }

    public void d(int i7, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f59109a;
        int z10 = recyclerView.f2766e.z();
        for (int i11 = 0; i11 < z10; i11++) {
            e1 U = RecyclerView.U(recyclerView.f2766e.y(i11));
            if (U != null && !U.r() && U.f59113c >= i7) {
                U.n(i10, false);
                recyclerView.f2787v0.f59079f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2761b.f59246e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            e1 e1Var = (e1) arrayList.get(i12);
            if (e1Var != null && e1Var.f59113c >= i7) {
                e1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2793y0 = true;
    }

    @Override
    public View d0(int i7) {
        return ((o0) this.f59109a).q(i7);
    }

    public void e(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = (RecyclerView) this.f59109a;
        int z10 = recyclerView.f2766e.z();
        int i18 = -1;
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < z10; i19++) {
            e1 U = RecyclerView.U(recyclerView.f2766e.y(i19));
            if (U != null && (i17 = U.f59113c) >= i12 && i17 <= i11) {
                if (i17 == i7) {
                    U.n(i10 - i7, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.f2787v0.f59079f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2761b.f59246e;
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
        } else {
            i14 = i7;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            e1 e1Var = (e1) arrayList.get(i20);
            if (e1Var != null && (i16 = e1Var.f59113c) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    e1Var.n(i10 - i7, false);
                } else {
                    e1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2793y0 = true;
    }

    @Override
    public int f0(View view) {
        return o0.v(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void invalidate() {
        ((wi.h) this.f59109a).f59966m.invalidate();
    }

    @Override
    public int z() {
        return ((o0) this.f59109a).G();
    }
}
