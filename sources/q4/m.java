package q4;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class m extends l {
    @Override
    public final r c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f53693a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.f53713a = new t(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    @Override
    public final void d(r rVar) {
    }
}
