package v6;

import android.os.IBinder;
import android.os.IInterface;
import q6.h;
public final class g extends h {
    @Override
    public final int d() {
        return 17895000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 8);
    }

    @Override
    public final n6.c[] k() {
        return n7.b.f20529e;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean x() {
        return true;
    }
}
