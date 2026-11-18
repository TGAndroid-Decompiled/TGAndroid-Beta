package p4;

import a8.la;
import android.os.Bundle;
import android.os.Parcel;
import c8.hb;
import c8.kb;
import j$.util.Objects;
public final class z0 implements u {
    public final l f55463a;
    public final int f55464b;

    public z0(l lVar, int i7) {
        this.f55463a = lVar;
        this.f55464b = i7;
    }

    @Override
    public final void a(int i7, g1 g1Var, e2.y0 y0Var, boolean z10, boolean z11) {
        boolean z12;
        ?? r32;
        Parcel obtain;
        boolean z13 = false;
        int i10 = this.f55464b;
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        la.p(z12);
        if (!z10 && y0Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z11 || !y0Var.a(30)) {
            z13 = true;
        }
        l lVar = this.f55463a;
        if (i10 >= 2) {
            Bundle f10 = g1Var.e(y0Var, z10, z11).f(i10);
            Bundle bundle = new Bundle();
            bundle.putBoolean(f1.f55220a, r32);
            bundle.putBoolean(f1.f55221b, z13);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i7);
                hb.a(obtain, f10);
                hb.a(obtain, bundle);
                kVar.f55315a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f11 = g1Var.e(y0Var, z10, true).f(i10);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            hb.a(obtain, f11);
            obtain.writeInt(r32);
            kVar2.f55315a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    @Override
    public final void b(int i7, n1 n1Var, boolean z10, boolean z11, int i10) {
        Bundle b10 = n1Var.a(z10, z11).b(i10);
        k kVar = (k) this.f55463a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            hb.a(obtain, b10);
            kVar.f55315a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i7) {
        k kVar = (k) this.f55463a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            kVar.f55315a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i7, int i10, int i11) {
        k kVar = (k) this.f55463a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            kVar.f55315a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i7, e2.y0 y0Var) {
        Bundle b10 = y0Var.b();
        k kVar = (k) this.f55463a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            hb.a(obtain, b10);
            kVar.f55315a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == z0.class) {
            return Objects.equals(this.f55463a.asBinder(), ((z0) obj).f55463a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i7, o1 o1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(o1.f55380e, o1Var.f55383a);
        bundle.putBundle(o1.f55381f, o1Var.f55384b);
        bundle.putLong(o1.f55382g, o1Var.f55385c);
        m1 m1Var = o1Var.d;
        if (m1Var != null) {
            bundle.putBundle(o1.h, m1Var.a());
        }
        k kVar = (k) this.f55463a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            hb.a(obtain, bundle);
            kVar.f55315a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g() {
        kb.a(this.f55463a);
    }

    public final int hashCode() {
        return Objects.hash(this.f55463a.asBinder());
    }

    @Override
    public final void i(int i7, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.f55374a);
        bundle.putLong(o.f55371e, oVar.f55375b);
        bundle.putBundle(o.f55373g, oVar.f55376c.a());
        bundle.putInt(o.f55372f, 4);
        k kVar = (k) this.f55463a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            hb.a(obtain, bundle);
            kVar.f55315a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void j(int i7, k1 k1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a10 = k1Var.a();
        k kVar = (k) this.f55463a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            hb.a(obtain, a10);
            hb.a(obtain, bundle);
            kVar.f55315a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
