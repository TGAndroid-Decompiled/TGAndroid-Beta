package x5;

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
public final class f extends y5.a {
    public final int f48899a;
    public final int f48900b;
    public final int f48901c;
    public String d;
    public IBinder f48902e;
    public Scope[] f48903f;
    public Bundle h;
    public Account f48904n;
    public u5.c[] f48905r;
    public u5.c[] f48906s;
    public final boolean v;
    public final int f48907w;
    public boolean f48908x;
    public final String f48909y;
    public static final Parcelable.Creator<f> CREATOR = new w7.i(11);
    public static final Scope[] A = new Scope[0];
    public static final u5.c[] B = new u5.c[0];

    public f(int i9, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, u5.c[] cVarArr, u5.c[] cVarArr2, boolean z10, int i12, boolean z11, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        u5.c[] cVarArr3;
        IInterface aVar;
        if (scopeArr == null) {
            scopeArr2 = A;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        u5.c[] cVarArr4 = B;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f48899a = i9;
        this.f48900b = i10;
        this.f48901c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i9 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f48883b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof h) {
                    aVar = (h) queryLocalInterface;
                } else {
                    aVar = new b7.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        l0 l0Var = (l0) aVar;
                        Parcel K0 = l0Var.K0(l0Var.M0(), 2);
                        Account account3 = (Account) w6.a.a(K0, Account.CREATOR);
                        K0.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
            this.f48904n = account2;
        } else {
            this.f48902e = iBinder;
            this.f48904n = account;
        }
        this.f48903f = scopeArr2;
        this.h = bundle2;
        this.f48905r = cVarArr3;
        this.f48906s = cVarArr4;
        this.v = z10;
        this.f48907w = i12;
        this.f48908x = z11;
        this.f48909y = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        w7.i.a(this, parcel, i9);
    }
}
