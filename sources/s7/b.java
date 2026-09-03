package s7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import j8.p;
import m.s3;
public final class b extends b6.g {
    public final Context R;
    public final int S;
    public final String T;
    public final int U;
    public final boolean V;

    public b(Context context, Looper looper, s3 s3Var, k kVar, l lVar, int i10) {
        super(context, looper, 4, s3Var, kVar, lVar, 0);
        this.R = context;
        this.S = i10;
        this.T = null;
        this.U = 1;
        this.V = true;
    }

    @Override
    public final boolean C() {
        return true;
    }

    public final Bundle G() {
        String packageName = this.R.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.S);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.V);
        bundle.putString("androidPackageName", packageName);
        String str = this.T;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.U);
        return bundle;
    }

    @Override
    public final int k() {
        return 12600000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new i(iBinder);
    }

    @Override
    public final y5.c[] r() {
        return p.f9276c;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.wallet.service.BIND";
    }
}
