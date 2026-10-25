package t6;

import android.os.IBinder;
import android.os.IInterface;
public final class i extends o6.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int l() {
        return 17895000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 7);
    }

    @Override
    public final l6.c[] r() {
        return l7.b.d;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
