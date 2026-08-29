package z5;

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
public final class f extends a6.a {
    public final int f50599a;
    public final int f50600b;
    public final int f50601c;
    public String d;
    public IBinder f50602e;
    public Scope[] f50603f;
    public Bundle h;
    public Account f50604n;
    public w5.c[] f50605r;
    public w5.c[] f50606s;
    public final boolean v;
    public final int f50607w;
    public boolean f50608x;
    public final String f50609y;
    public static final Parcelable.Creator<f> CREATOR = new w5.k(23);
    public static final Scope[] A = new Scope[0];
    public static final w5.c[] B = new w5.c[0];

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, w5.c[] cVarArr, w5.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        w5.c[] cVarArr3;
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
        w5.c[] cVarArr4 = B;
        if (cVarArr == null) {
            cVarArr3 = cVarArr4;
        } else {
            cVarArr3 = cVarArr;
        }
        cVarArr4 = cVarArr2 != null ? cVarArr2 : cVarArr4;
        this.f50599a = i10;
        this.f50600b = i11;
        this.f50601c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f50583b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof h) {
                    aVar = (h) queryLocalInterface;
                } else {
                    aVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        l0 l0Var = (l0) aVar;
                        Parcel K0 = l0Var.K0(l0Var.M0(), 2);
                        Account account3 = (Account) y6.a.a(K0, Account.CREATOR);
                        K0.recycle();
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
            this.f50604n = account2;
        } else {
            this.f50602e = iBinder;
            this.f50604n = account;
        }
        this.f50603f = scopeArr2;
        this.h = bundle2;
        this.f50605r = cVarArr3;
        this.f50606s = cVarArr4;
        this.v = z10;
        this.f50607w = i13;
        this.f50608x = z11;
        this.f50609y = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        w5.k.a(this, parcel, i10);
    }
}
