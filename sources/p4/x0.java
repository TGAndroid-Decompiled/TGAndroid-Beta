package p4;

import a8.ia;
import android.os.Bundle;
import android.os.Parcel;
import c8.ab;
import c8.xa;
import j$.util.Objects;
public final class x0 implements u {
    public final l f53373a;
    public final int f53374b;

    public x0(l lVar, int i7) {
        this.f53373a = lVar;
        this.f53374b = i7;
    }

    @Override
    public final void a(int i7, e1 e1Var, e2.y0 y0Var, boolean z9, boolean z10) {
        boolean z11;
        ?? r32;
        Parcel obtain;
        boolean z12 = false;
        int i10 = this.f53374b;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ia.p(z11);
        if (!z9 && y0Var.a(17)) {
            r32 = 0;
        } else {
            r32 = 1;
        }
        if (z10 || !y0Var.a(30)) {
            z12 = true;
        }
        l lVar = this.f53373a;
        if (i10 >= 2) {
            Bundle f10 = e1Var.e(y0Var, z9, z10).f(i10);
            Bundle bundle = new Bundle();
            bundle.putBoolean(d1.f53132a, r32);
            bundle.putBoolean(d1.f53133b, z12);
            k kVar = (k) lVar;
            kVar.getClass();
            obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                obtain.writeInt(i7);
                xa.a(obtain, f10);
                xa.a(obtain, bundle);
                kVar.f53245a.transact(3013, obtain, null, 1);
                return;
            } finally {
            }
        }
        Bundle f11 = e1Var.e(y0Var, z9, true).f(i10);
        k kVar2 = (k) lVar;
        kVar2.getClass();
        obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            xa.a(obtain, f11);
            obtain.writeInt(r32);
            kVar2.f53245a.transact(3007, obtain, null, 1);
        } finally {
        }
    }

    @Override
    public final void b(int i7, l1 l1Var, boolean z9, boolean z10, int i10) {
        Bundle b10 = l1Var.a(z9, z10).b(i10);
        k kVar = (k) this.f53373a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            xa.a(obtain, b10);
            kVar.f53245a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void c(int i7) {
        k kVar = (k) this.f53373a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            kVar.f53245a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void d(int i7, int i10, int i11) {
        k kVar = (k) this.f53373a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            obtain.writeInt(i10);
            obtain.writeInt(i11);
            kVar.f53245a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void e(int i7, e2.y0 y0Var) {
        Bundle b10 = y0Var.b();
        k kVar = (k) this.f53373a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            xa.a(obtain, b10);
            kVar.f53245a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == x0.class) {
            return Objects.equals(this.f53373a.asBinder(), ((x0) obj).f53373a.asBinder());
        }
        return false;
    }

    @Override
    public final void f(int i7, m1 m1Var) {
        Bundle bundle = new Bundle();
        bundle.putInt(m1.f53289e, m1Var.f53292a);
        bundle.putBundle(m1.f53290f, m1Var.f53293b);
        bundle.putLong(m1.f53291g, m1Var.f53294c);
        k1 k1Var = m1Var.d;
        if (k1Var != null) {
            bundle.putBundle(m1.h, k1Var.a());
        }
        k kVar = (k) this.f53373a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            xa.a(obtain, bundle);
            kVar.f53245a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void g() {
        ab.a(this.f53373a);
    }

    public final int hashCode() {
        return Objects.hash(this.f53373a.asBinder());
    }

    @Override
    public final void i(int i7, o oVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(o.d, oVar.f53305a);
        bundle.putLong(o.f53302e, oVar.f53306b);
        bundle.putBundle(o.f53304g, oVar.f53307c.a());
        bundle.putInt(o.f53303f, 4);
        k kVar = (k) this.f53373a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            xa.a(obtain, bundle);
            kVar.f53245a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override
    public final void j(int i7, i1 i1Var) {
        Bundle bundle = Bundle.EMPTY;
        Bundle a10 = i1Var.a();
        k kVar = (k) this.f53373a;
        kVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i7);
            xa.a(obtain, a10);
            xa.a(obtain, bundle);
            kVar.f53245a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
