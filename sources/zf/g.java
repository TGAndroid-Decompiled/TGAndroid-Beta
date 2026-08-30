package zf;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.m6;
public final class g implements jo0, s {
    public final Object f47417a;

    public g(Object obj) {
        this.f47417a = obj;
    }

    @Override
    public void Y(float f10, boolean z4) {
        h hVar = (h) this.f47417a;
        float f11 = hVar.f47419b;
        float w10 = e2.c.w(hVar.f47420c, f11, f10, f11);
        hVar.d = w10;
        if (z4) {
            m6 m6Var = hVar.e;
            m6Var.getClass();
            m6Var.b(null, w10);
        }
        hVar.invalidate();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        o7.d dVar = new o7.d(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i10 = o7.a.f16460a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        ((z7.c) this.f47417a).writeToParcel(obtain, 0);
        ((o7.c) ((o7.f) obj).u()).E0(obtain, 1);
    }

    @Override
    public CharSequence getContentDescription() {
        h hVar = (h) this.f47417a;
        float f10 = hVar.f47419b;
        return String.valueOf(Math.round((hVar.f47418a.getProgress() * (hVar.f47420c - f10)) + f10));
    }

    @Override
    public int j0() {
        return 0;
    }

    @Override
    public void B() {
    }
}
