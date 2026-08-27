package y5;

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

public final class f extends z5.a {

    public final int f49616a;

    public final int f49617b;

    public final int f49618c;
    public String d;

    public IBinder f49619e;

    public Scope[] f49620f;
    public Bundle h;

    public Account f49621n;

    public v5.c[] f49622r;

    public v5.c[] f49623s;
    public final boolean v;

    public final int f49624w;

    public boolean f49625x;

    public final String f49626y;
    public static final Parcelable.Creator<f> CREATOR = new w7.f(19);
    public static final Scope[] A = new Scope[0];
    public static final v5.c[] B = new v5.c[0];

    public f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, v5.c[] cVarArr, v5.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? A : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        v5.c[] cVarArr3 = B;
        v5.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.f49616a = i10;
        this.f49617b = i11;
        this.f49618c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f49600b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                h l0Var = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new l0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 11);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        l0 l0Var2 = (l0) l0Var;
                        Parcel parcelK0 = l0Var2.K0(l0Var2.M0(), 2);
                        Account account3 = (Account) x6.a.a(parcelK0, Account.CREATOR);
                        parcelK0.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.f49621n = account2;
        } else {
            this.f49619e = iBinder;
            this.f49621n = account;
        }
        this.f49620f = scopeArr2;
        this.h = bundle2;
        this.f49622r = cVarArr4;
        this.f49623s = cVarArr3;
        this.v = z10;
        this.f49624w = i13;
        this.f49625x = z11;
        this.f49626y = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        w7.f.a(this, parcel, i10);
    }
}
