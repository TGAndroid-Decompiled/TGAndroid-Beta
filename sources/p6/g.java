package p6;

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
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new n8.g(26);
    public static final Scope[] F = new Scope[0];
    public static final m6.c[] G = new m6.c[0];
    public final String E;
    public final int f53249a;
    public final int f53250b;
    public final int f53251c;
    public String d;
    public IBinder f53252e;
    public Scope[] f53253f;
    public Bundle h;
    public Account f53254n;
    public m6.c[] f53255r;
    public m6.c[] f53256s;
    public final boolean f53257w;
    public final int f53258x;
    public boolean f53259y;

    public g(int i3, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, m6.c[] cVarArr, m6.c[] cVarArr2, boolean z10, int i12, boolean z11, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        m6.c[] cVarArr3;
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
        m6.c[] cVarArr4 = G;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f53249a = i3;
        this.f53250b = i10;
        this.f53251c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f53209b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof i) {
                    aVar = (i) queryLocalInterface;
                } else {
                    aVar = new b8.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 8);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        m0 m0Var = (m0) aVar;
                        Parcel N0 = m0Var.N0(m0Var.P0(), 2);
                        Account account3 = (Account) o7.g.a(N0, Account.CREATOR);
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
            this.f53254n = account2;
        } else {
            this.f53252e = iBinder;
            this.f53254n = account;
        }
        this.f53253f = scopeArr2;
        this.h = bundle2;
        this.f53255r = cVarArr3;
        this.f53256s = cVarArr4;
        this.f53257w = z10;
        this.f53258x = i12;
        this.f53259y = z11;
        this.E = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        n8.g.a(this, parcel, i3);
    }
}
