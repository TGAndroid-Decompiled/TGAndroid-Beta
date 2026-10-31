package qh;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
public final class z implements u1 {
    public final i0 f46093a;

    public z(i0 i0Var) {
        this.f46093a = i0Var;
    }

    @Override
    public void h(x1 x1Var, int i10) {
        i0 i0Var = this.f46093a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
            i0Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
