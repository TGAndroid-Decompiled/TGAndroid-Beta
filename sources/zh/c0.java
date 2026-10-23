package zh;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
public final class c0 implements a2 {
    public final n0 f51707a;

    public c0(n0 n0Var) {
        this.f51707a = n0Var;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        n0 n0Var = this.f51707a;
        n0Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            n0Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
