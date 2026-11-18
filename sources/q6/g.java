package q6;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new q4.x(11);
    public static final Scope[] F = new Scope[0];
    public static final n6.c[] G = new n6.c[0];
    public final String E;
    public final int f55895a;
    public final int f55896b;
    public final int f55897c;
    public String d;
    public IBinder f55898e;
    public Scope[] f55899f;
    public Bundle h;
    public Account f55900n;
    public n6.c[] f55901r;
    public n6.c[] f55902s;
    public final boolean f55903w;
    public final int f55904x;
    public boolean f55905y;

    public g(int i7, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, n6.c[] cVarArr, n6.c[] cVarArr2, boolean z10, int i12, boolean z11, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        n6.c[] cVarArr3;
        IInterface aVar;
        if (scopeArr == null) {
            scopeArr2 = F;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        n6.c[] cVarArr4 = G;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f55895a = i7;
        this.f55896b = i10;
        this.f55897c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i7 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f55855b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    aVar = (i) queryLocalInterface;
                } else {
                    aVar = new a8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 9);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var = (m0) aVar;
                        Parcel n1 = m0Var.n1(m0Var.p1(), 2);
                        Account account3 = (Account) p7.g.a(n1, Account.CREATOR);
                        n1.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
            this.f55900n = account2;
        } else {
            this.f55898e = iBinder;
            this.f55900n = account;
        }
        this.f55899f = scopeArr2;
        this.h = bundle2;
        this.f55901r = cVarArr3;
        this.f55902s = cVarArr4;
        this.f55903w = z10;
        this.f55904x = i12;
        this.f55905y = z11;
        this.E = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        q4.x.a(this, parcel, i7);
    }
}
