package zh;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.z1;
public final class c0 implements z1 {
    public final n0 f52168a;

    public c0(n0 n0Var) {
        this.f52168a = n0Var;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        n0 n0Var = this.f52168a;
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
