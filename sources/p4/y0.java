package p4;

import a8.ma;
import android.os.Bundle;
import android.os.Parcel;
import c8.ib;
import c8.lb;
import j$.util.Objects;
public final class y0 implements u {
    public final l f55583a;
    public final int f55584b;

    public y0(l lVar, int i7) {
        this.f55583a = lVar;
        this.f55584b = i7;
    }

    @Override
    public final void a(int i7, f1 f1Var, e2.y0 y0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i10 = this.f55584b;
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ma.p(z12);
        if (!z10 && y0Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z11 || !y0Var.a(30)) {
            z13 = true;
        }
        l lVar = this.f55583a;
        if (i10 >= 2) {
            Bundle f10 = f1Var.e(y0Var, z10, z11).f(i10);
            Bundle bundle = new Bundle();
            bundle.putBoolean(e1.f55341a, r32);
            bundle.putBoolean(e1.f55342b, z13);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i7);
                ib.a(obtain, f10);
                ib.a(obtain, bundle);
                kVar.f55447a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f11 = f1Var.e(y0Var, z10, true).f(i10);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, f11);
            obtain.writeInt(r32);
            kVar2.f55447a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    @Override
    public final void b(int i7, m1 m1Var, boolean z10, boolean z11, int i10) {
        Bundle b10 = m1Var.a(z10, z11).b(i10);
        k kVar = (k) this.f55583a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, b10);
            kVar.f55447a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i7) {
        k kVar = (k) this.f55583a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            kVar.f55447a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i7, int i10, int i11) {
        k kVar = (k) this.f55583a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            kVar.f55447a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i7, e2.y0 y0Var) {
        Bundle b10 = y0Var.b();
        k kVar = (k) this.f55583a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, b10);
            kVar.f55447a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == y0.class) {
            return Objects.equals(this.f55583a.asBinder(), ((y0) obj).f55583a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i7, n1 n1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(n1.f55498e, n1Var.f55501a);
        bundle.putBundle(n1.f55499f, n1Var.f55502b);
        bundle.putLong(n1.f55500g, n1Var.f55503c);
        l1 l1Var = n1Var.d;
        if (l1Var != null) {
            bundle.putBundle(n1.h, l1Var.a());
        }
        k kVar = (k) this.f55583a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, bundle);
            kVar.f55447a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g() {
        lb.a(this.f55583a);
    }

    public final int hashCode() {
        return Objects.hash(this.f55583a.asBinder());
    }

    @Override
    public final void i(int i7, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.f55507a);
        bundle.putLong(o.f55504e, oVar.f55508b);
        bundle.putBundle(o.f55506g, oVar.f55509c.a());
        bundle.putInt(o.f55505f, 4);
        k kVar = (k) this.f55583a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, bundle);
            kVar.f55447a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void j(int i7, j1 j1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a10 = j1Var.a();
        k kVar = (k) this.f55583a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            ib.a(obtain, a10);
            ib.a(obtain, bundle);
            kVar.f55447a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
