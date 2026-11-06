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
    public static final Scope[] E = new Scope[0];
    public static final n6.c[] F = new n6.c[0];
    public final String D;
    public final int f53779a;
    public final int f53780b;
    public final int f53781c;
    public String d;
    public IBinder f53782e;
    public Scope[] f53783f;
    public Bundle h;
    public Account f53784n;
    public n6.c[] f53785r;
    public n6.c[] f53786s;
    public final boolean f53787w;
    public final int f53788x;
    public boolean f53789y;

    public g(int i7, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, n6.c[] cVarArr, n6.c[] cVarArr2, boolean z9, int i12, boolean z10, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        n6.c[] cVarArr3;
        IInterface aVar;
        if (scopeArr == null) {
            scopeArr2 = E;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        n6.c[] cVarArr4 = F;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f53779a = i7;
        this.f53780b = i10;
        this.f53781c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i7 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f53739b;
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
                        Parcel N0 = m0Var.N0(m0Var.P0(), 2);
                        Account account3 = (Account) p7.g.a(N0, Account.CREATOR);
                        N0.recycle();
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
            this.f53784n = account2;
        } else {
            this.f53782e = iBinder;
            this.f53784n = account;
        }
        this.f53783f = scopeArr2;
        this.h = bundle2;
        this.f53785r = cVarArr3;
        this.f53786s = cVarArr4;
        this.f53787w = z9;
        this.f53788x = i12;
        this.f53789y = z10;
        this.D = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        q4.x.a(this, parcel, i7);
    }
}
