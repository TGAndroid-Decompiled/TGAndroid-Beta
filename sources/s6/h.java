package s6;

import android.os.IBinder;
import android.os.IInterface;
public final class h extends n6.g {
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
        return new a9.a(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 6);
    }

    @Override
    public final k6.c[] r() {
        return k7.b.d;
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
