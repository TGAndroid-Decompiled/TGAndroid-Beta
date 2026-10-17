package zh;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
public final class e0 implements a2 {
    public final m0 f51978a;

    public e0(m0 m0Var) {
        this.f51978a = m0Var;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        m0 m0Var = this.f51978a;
        m0Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            m0Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
